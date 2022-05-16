package springbootawsbook.springawsbook.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springbootawsbook.springawsbook.service.PostsService;
import springbootawsbook.springawsbook.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

//    @PutMapping("/api/v1/posts/{id}")
//    public Long update(@PathVariable Long id, @RequestBody Posts)
}
