package io.mtudy.soundcloud.like.domain.repotitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends CrudRepository<Like, String> {
}
