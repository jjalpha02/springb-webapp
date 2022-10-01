/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.esgis.tpcrud.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tg.esgis.tpcrud.Service.ArticleService;
import tg.esgis.tpcrud.entites.Article;
import tg.esgis.tpcrud.repositories.ArticleRepo;

/**
 *
 * @author fta002
 */
@RestController
@RequestMapping(value = "api/")
public class ArticleApi {

    @Autowired
    private ArticleRepo articleRepo;

    @Autowired
    private ArticleService articleService;

    
    @GetMapping(name = "lister", value = "api_lister")
    public List<Article> listArticle() {
        List<Article> lst = articleService.listeDesArticlesParLib("riz");

        return lst;
    }
    @GetMapping("api_lister/{num}")
    public Article listArticleNum(@RequestParam(name = "num") int num) {
        List<Article> lst = articleService.listeDesArticlesParLib("riz");

        
        return lst.get(num);
    }


}
