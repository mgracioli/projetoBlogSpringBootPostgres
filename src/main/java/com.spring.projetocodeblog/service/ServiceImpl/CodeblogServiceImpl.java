package com.spring.projetocodeblog.service.ServiceImpl;

import com.spring.projetocodeblog.model.Post;
import com.spring.projetocodeblog.repository.CodeBlogRepository;
import com.spring.projetocodeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//classe com a implementação da Interface CodeblogService
@Service
public class CodeblogServiceImpl implements CodeblogService {
    @Autowired  //injeção de dependência da interface CodeBlogRepository, que é a classe que faz a interação com o banco de dados
    CodeBlogRepository codeblogRepository;

    @Override
    public List<Post> findall() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();   //precisa do método get pq findById retorna um Optional e, não, um post
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
