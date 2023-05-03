package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {
    @RequestMapping("/")
    public String listPosts(ModelMap map){
        List<Post> accessed_post =postRepository.getAllPosts();
        map.put("posts", accessed_post);
        return "home";
    }

    private PostRepository postRepository;

    public BlogController(PostRepository repo){
     postRepository =   repo;
    }
}
