package com.spring.projetocodeblog.repository;

import com.spring.projetocodeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe que extende a JpaRepository - esta contém métodos prontos para fazer a interação com o banco de dados, não precisa fazer a implementação dos métodos, é só fazer a injeção de dependência dessa classe (CodeBlogRepository()) e usar, nesse caso, a Michelli criou um serviço para implementar esses métodos, mas não precisa
public interface CodeBlogRepository extends JpaRepository<Post, Long> {

}
