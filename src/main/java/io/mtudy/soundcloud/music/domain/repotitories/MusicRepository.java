package io.mtudy.soundcloud.music.domain.repotitories;

import io.mtudy.soundcloud.music.domain.entities.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, String> {

}
