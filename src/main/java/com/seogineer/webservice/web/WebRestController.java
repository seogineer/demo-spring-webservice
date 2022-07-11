package com.seogineer.webservice.web;

import com.seogineer.webservice.domain.posts.PostsRepository;
import com.seogineer.webservice.dto.PostsSaveRequestDto;
import com.seogineer.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
