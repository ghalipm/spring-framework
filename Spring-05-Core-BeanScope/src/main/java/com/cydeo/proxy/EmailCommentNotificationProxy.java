package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary // with @Primary, the other bean will not be used.
@Qualifier("Email") // with @Qualifier("Name") one can use any bean in the container
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email notification for comment : " + comment.getText());
    }
}
// Spring uses singleton bean - always the same bean