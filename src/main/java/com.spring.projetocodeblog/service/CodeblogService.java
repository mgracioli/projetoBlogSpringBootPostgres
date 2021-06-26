package com.spring.projetocodeblog.service;

import com.spring.projetocodeblog.model.Post;

import java.util.List;

//Interface com os métodos de manipulação dos posts
public interface CodeblogService {
    List<Post> findall();
    Post findById(long id);
    Post save(Post post);
}
