package io.mtudy.soundcloud.music.domain.repotitories;

import io.mtudy.soundcloud.music.domain.entities.Track;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends CrudRepository<Track, String> {

}
