package com.study.springboot.service;

import java.lang.management.PlatformLoggingMXBean;
import java.lang.management.PlatformManagedObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.study.springboot.dao.ITransaction1Dao;
import com.study.springboot.dao.ITransaction2Dao;

@Service
public class BuyTicketServiceImpl implements IBuyTicketService{

	@Autowired
	private ITransaction1Dao transaction1;
	@Autowired
	private ITransaction2Dao transaction2;
	
//	@Autowired
//	PlatformTransactionManager transactionManager;
//	@Autowired
//	TransactionDefinition definition;
	
	@Autowired
	TransactionTemplate transactionTemplate;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public int buy(String consumerId, int amount, String error) {
		
//		TransactionStatus status = transactionManager.getTransaction(definition);
		
		try {
			//transaction시작
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				
				@Override
				protected void doInTransactionWithoutResult(TransactionStatus arg0) {
					// 정상입력처리
					transaction1.pay(consumerId, amount);
					
					// 의도적 에러 발생
					if (error.equals("1")) {
						int n = 10 / 0;
					}
					// 입력불가
					transaction2.pay(consumerId, amount);
					
				}
			});
			
			return 1;
		} catch (Exception e) {
			System.out.println("[TransactionPropagation #2 Rollback]");
			return 0;
		}
		
	}

}
