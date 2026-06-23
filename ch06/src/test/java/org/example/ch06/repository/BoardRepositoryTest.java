package org.example.ch06.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.example.ch06.entity.board.Article;
import org.example.ch06.entity.board.User;
import org.example.ch06.repository.board.ArticleRepository;
import org.example.ch06.repository.board.CommentRepository;
import org.example.ch06.repository.board.FileRepository;
import org.example.ch06.repository.board.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {

    @Autowired private ArticleRepository articleRepository;
    @Autowired private CommentRepository commentRepository;
    @Autowired private FileRepository fileRepository;
    @Autowired private UserRepository userRepository;

    @Test
    @DisplayName("사용자 추가")
    public void test1(){

        User user = User.builder()
                .userid("a102")
                .name("김춘추")
                .birth("1992-03-11")
                .build();

        // JPA save()는 해당 엔티티를 INSERT한 다음 곧바로 SELECT로 조회해서 반환
        User savedUser = userRepository.save(user);

        System.out.println(savedUser);
    }

    @Test
    @DisplayName("글 등록")
    public void test2(){

        User user = User.builder()
                .userid("a102")
                .build();

        Article article = Article.builder()
                .title("제목2입니다.")
                .content("내용2입니다.")
                .user(user)
                .build();

        Article savedArticle = articleRepository.save(article);

        System.out.println(savedArticle);
    }

    @Test
    @DisplayName("")
    public void test3(){}
}
