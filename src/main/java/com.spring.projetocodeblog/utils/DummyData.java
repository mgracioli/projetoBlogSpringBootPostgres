package com.spring.projetocodeblog.utils;

import com.spring.projetocodeblog.model.Post;
import com.spring.projetocodeblog.repository.CodeBlogRepository;
import com.spring.projetocodeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Classe de teste para popular dados no banco de dados
@Component
public class DummyData {

    @Autowired
    CodeblogService codeblogRepository;

    //@PostConstruct //A anotação @PostConstruct faz com que esse Bean seja executado assim que o spring é inicializado. Ela foi comentada porque era só para teste, para popular o banco de dados com algumas informações
    public void savePosts(){
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Autor teste");
        post1.setData(LocalDate.now());
        post1.setTitulo("Titulo teste");
        post1.setTexto("texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Texto de exemplo para um post qualquer utilizado para testar os métodos implementados");

        Post post2 = new Post();
        post2.setAutor("Autor teste 2");
        post2.setData(LocalDate.now());
        post2.setTitulo("Titulo teste 2");
        post2.setTexto("segundo texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Segundo texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Segundo texto de exemplo para um post qualquer utilizado para testar os métodos implementados. Segundo texto de exemplo para um post qualquer utilizado para testar os métodos implementados");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
