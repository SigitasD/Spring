package com.sigitas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sigitas.project.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
