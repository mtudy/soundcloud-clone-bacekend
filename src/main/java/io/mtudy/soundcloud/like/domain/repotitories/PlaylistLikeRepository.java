package io.mtudy.soundcloud.like.domain.repotitories;

import io.mtudy.soundcloud.like.domain.entities.PlaylistLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistLikeRepository extends CrudRepository<PlaylistLike, String> {
}
