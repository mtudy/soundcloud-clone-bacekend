package io.mtudy.soundcloud.like.domain.repotitories;

import io.mtudy.soundcloud.like.domain.entities.AlbumLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumLikeRepository extends CrudRepository<AlbumLike, String> {
}
