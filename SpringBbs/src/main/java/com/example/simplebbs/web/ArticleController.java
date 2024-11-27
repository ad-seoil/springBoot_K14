package com.example.simplebbs.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simplebbs.article.Article;
import com.example.simplebbs.article.ArticleService;

@Controller
public class ArticleController {
	private final ArticleService articleService;
	
    public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@GetMapping("/write")
    public String writePage(Model model) {
        model.addAttribute("articleInput", new ArticleInput());
        return "write";
    }

    @PostMapping("/write")
    public String submitForm(@Validated @ModelAttribute ArticleInput articleInput,
                        BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "write";
        }

        // ArticleService의 writeArticle 메소드 호출
        articleService.writeArticle(articleInput.getSubject(), articleInput.getContent(), articleInput.getAuthor());
         
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
       List<Article> articles 
          = articleService.getAllArticles();
       model.addAttribute("articles", articles);
        return "list";//list.html
    }

   
}