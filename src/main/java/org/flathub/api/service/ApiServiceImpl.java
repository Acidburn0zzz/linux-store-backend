package org.flathub.api.service;

import org.flathub.api.model.App;
import org.flathub.api.model.AppRepository;
import org.flathub.api.model.FlatpakRepo;
import org.flathub.api.model.FlatpakRepoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jorge on 24/03/17.
 */
@Service
public class ApiServiceImpl implements ApiService{

    @Autowired
    private AppRepository appRepository;

    @Autowired
    private FlatpakRepoRepository repoRepository;


    @Override
    public List<App> findAllApps() {

        return appRepository.findAllByOrderByName();
    }

    @Override
    public App findAppByFlatpakAppId(String flatpakAppId) {
        return appRepository.findOneByFlatpakAppId(flatpakAppId);
    }

    @Override
    public void updateApp(App app) {
        appRepository.save(app);
    }

    @Override
    public void updateFlatpakRepo(FlatpakRepo repo) {
        repoRepository.save(repo);
    }

    @Override
    public FlatpakRepo findRepoByName(String name) {
        return repoRepository.findOneByName(name);
    }
}
