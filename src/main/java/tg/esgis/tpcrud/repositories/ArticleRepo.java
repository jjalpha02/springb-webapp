/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.esgis.tpcrud.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tg.esgis.tpcrud.entites.Article;

/**
 *
 * @author fta002
 */
@Repository
public interface ArticleRepo extends JpaRepository<Article, Long> {

    @Query("select a from Article a where a.libelle like :lib ")
    public List<Article> articleParLib(@Param("lib") String x);
}
