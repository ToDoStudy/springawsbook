package springbootawsbook.springawsbook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootawsbook.springawsbook.domain.posts.PostsRepository;
import springbootawsbook.springawsbook.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@Service
public class PostsService {

    private  final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity())
                .getId();
    }
}
