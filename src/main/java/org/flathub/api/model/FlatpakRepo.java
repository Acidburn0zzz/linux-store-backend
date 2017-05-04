package org.flathub.api.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorge on 04/05/17.
 */
@Entity
@Table(name = "flatpak_repo", schema = "public", catalog = "flathub")
public class FlatpakRepo {
    private int flatpakRepoId;
    private String name;
    private String description;
    private String url;
    private String homepageUrl;
    private String defaultBranch;
    private String gpgkey;
    private List<App> apps;

    @Id
    @SequenceGenerator(name="flatpak_repo_flatpak_repo_id_seq",
            sequenceName="flatpak_repo_flatpak_repo_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="flatpak_repo_flatpak_repo_id_seq")
    @Column(name = "flatpak_repo_id", nullable = false)
    public int getFlatpakRepoId() {
        return flatpakRepoId;
    }

    public void setFlatpakRepoId(int flatpakRepoId) {
        this.flatpakRepoId = flatpakRepoId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 1024)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 2048)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "homepage_url", nullable = true, length = 2048)
    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    @Basic
    @Column(name = "default_branch", nullable = true, length = 128)
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @Basic
    @Column(name = "gpgkey", nullable = true, length = 5120)
    public String getGpgkey() {
        return gpgkey;
    }

    public void setGpgkey(String gpgkey) {
        this.gpgkey = gpgkey;
    }

    public void addApp(App app){
        this.apps.add(app);
        if(app.getFlatpakRepo() != this)
        {
            app.setFlatpakRepo(this);
        }
    }

    @OneToMany(mappedBy="flatpakRepo")
    public List<App> getApps(){
        return apps;
    }


    public void setApps(List<App> apps){
        this.apps = apps;
    }

    public FlatpakRepo() {
        this.apps = new ArrayList<App>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlatpakRepo that = (FlatpakRepo) o;

        if (flatpakRepoId != that.flatpakRepoId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (homepageUrl != null ? !homepageUrl.equals(that.homepageUrl) : that.homepageUrl != null) return false;
        if (defaultBranch != null ? !defaultBranch.equals(that.defaultBranch) : that.defaultBranch != null)
            return false;
        if (gpgkey != null ? !gpgkey.equals(that.gpgkey) : that.gpgkey != null) return false;
        return apps != null ? apps.equals(that.apps) : that.apps == null;
    }

    @Override
    public int hashCode() {
        int result = flatpakRepoId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (homepageUrl != null ? homepageUrl.hashCode() : 0);
        result = 31 * result + (defaultBranch != null ? defaultBranch.hashCode() : 0);
        result = 31 * result + (gpgkey != null ? gpgkey.hashCode() : 0);
        result = 31 * result + (apps != null ? apps.hashCode() : 0);
        return result;
    }
}
