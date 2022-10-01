/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.esgis.tpcrud.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.esgis.tpcrud.entites.Article;
import tg.esgis.tpcrud.repositories.ArticleRepo;

/**
 *
 * @author fta002
 */
@Service
public class ArticleService {

    @Autowired
    ArticleRepo articleRepo ;

    public List<Article> listeDesArticlesParLib(String libelle) {
        List<Article> lst = new ArrayList<>();

        if (libelle == null) {
            return new ArrayList<>();
        } else {
            return articleRepo.articleParLib(libelle);
        }

    }
}
