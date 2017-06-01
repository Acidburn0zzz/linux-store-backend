package org.flathub.api.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jorge on 24/03/17.
 */
@Repository
public interface AppRepository extends JpaRepository<App, Integer> {

  List<App> findAllByOrderByName();

  App findOneByFlatpakAppId(String flatpakAppId);
}
