package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")// each time new bean is created as opposed to singleton
//@Scope(BeanDefinition.SCOPE_PROTOTYPE) // each time new bean is created as opposed to singleton
//@Lazy // is not eager instantiation. By default, Spring uses eager instantiation.
        // Even if the beans are not called, they are instantiated in Spring container.
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    // if @AllArgConstructor is used, then one cannot use @Qualifier,
    // So better to have the all arg constructor in the class

    public CommentService(CommentRepository commentRepository, @Qualifier("Email") CommentNotificationProxy commentNotificationProxy){
        this.commentRepository=commentRepository;
        this.commentNotificationProxy=commentNotificationProxy;
        System.out.println("Hello");
    }
}

//Spring creates all singleton beans with eager instantiation by default.
