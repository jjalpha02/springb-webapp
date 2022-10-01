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
import tg.esgis.tpcrud.entites.Article;
import tg.esgis.tpcrud.repositories.ArticleRepo;

/**
 *
 * @author fta002
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleRepo articleRepo;

    @GetMapping(name = "lister",value = "/lister")
    public String listArticle(Model model) {
        List<Article> lst = articleRepo.findAll();

        lst.forEach(article -> {
            System.out.println(article.toString());
        });
        model.addAttribute("articles", lst);
        return "index.html";
    }

    @GetMapping(name = "ajouter", value = "/ajouter")
    public String createArticle(Model model) {
        Article a1 = new Article("plat", 1200.00, 10);
        Article a2 = new Article("Sucre", 1200.00, 10);
        Article a3 = new Article("riz", 1200.00, 10);
        Article a4 = new Article("huile", 1200.00, 10);
        this.articleRepo.save(a1);
        this.articleRepo.save(a2);
        this.articleRepo.save(a3);
        this.articleRepo.save(a4);
        return "formulaire";

    }
    @GetMapping(name = "home", value = "/")
    public String homepage(Model model) {
    
        return "index.html";

    }
}
