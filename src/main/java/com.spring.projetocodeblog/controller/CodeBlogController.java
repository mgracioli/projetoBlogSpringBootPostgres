package com.spring.projetocodeblog.controller;

import com.spring.projetocodeblog.model.Post;
import com.spring.projetocodeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//Camada C do MVC - classe que recebe as requisições dos clientes
@Controller
public class CodeBlogController {

    @Autowired
    CodeblogService codeblogService;    //faz a injeção da Interface e não da implementação dela (CodeblogServiceImpl). O resultado seria o mesmo injetando qualquer uma das duas. É interessante fazer assim pq se um dia eu quiser criar uma outra implementação, não vai precisar mudar aqui, o código não vai quebrar.

    @RequestMapping(value = "/posts", method = RequestMethod.GET)   //determina qual o método http que o usuário vai utilizar para acessar esse método e de qual uri ele vai fazer essa solicitação
    //ModelAndView porque eu vou receber tanto o Post (Model) quanto a View (View) que vai renderizar o post
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");  //posts é o nome da view q vai renderizar os posts na tela
        List<Post> posts = codeblogService.findall();

        mv.addObject("posts", posts);   //adiciona os posts na view para ela renderizá-los
        return mv;
    }
}
