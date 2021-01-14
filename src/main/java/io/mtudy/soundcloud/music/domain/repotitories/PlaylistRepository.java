package io.mtudy.soundcloud.music.domain.repotitories;

import io.mtudy.soundcloud.music.domain.entities.Playlist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, String> {
}
