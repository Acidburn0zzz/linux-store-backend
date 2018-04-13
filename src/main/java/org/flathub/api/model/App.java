package org.flathub.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

/**
 * Created by jorge on 04/05/17.
 */

@Entity
public class App {


  public static final int APP_DESCRIPTION_LENGTH = 4096;
  public static final int APP_RELEASE_DESCRIPTION_LENGTH = 4096;
  private final String FLATPAKREF_BASE_PATH = "/repo/appstream";
  private int appId;
  private String flatpakAppId;
  private String name;
  private String summary;
  private String description;
  private String developerName;
  private String projectLicense;
  private String homepageUrl;
  private String bugtrackerUrl;
  private String helpUrl;
  private String donationUrl;
  private String translateUrl;
  private String currentReleaseVersion;
  private OffsetDateTime currentReleaseDate;
  private String currentReleaseDescription;
  private OffsetDateTime inStoreSinceDate;
  private FlatpakRepo flatpakRepo;
  private double rating;
  private int ratingVotes;
  private String iconDesktopUrl;
  private String iconMobileUrl;
  private Set<Category> categories = new HashSet<>();
  private List<Screenshot> screenshots = new ArrayList<>();

  @JsonIgnore
  @Id
  @SequenceGenerator(name = "app_app_id_seq",
    sequenceName = "app_app_id_seq",
    allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "app_app_id_seq")
  @Column(name = "app_id", nullable = false)
  public int getAppId() {
    return appId;
  }

  @JsonProperty
  public void setAppId(int appId) {
    this.appId = appId;
  }

  @Basic
  @Column(name = "flatpak_app_id", nullable = false, length = 128)
  public String getFlatpakAppId() {
    return flatpakAppId;
  }

  public void setFlatpakAppId(String flatpakAppId) {
    this.flatpakAppId = flatpakAppId;
  }

  @Basic
  @Column(name = "name", nullable = false, length = 128)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "summary", length = 1024)
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  @Basic
  @Column(name = "description", length = APP_DESCRIPTION_LENGTH)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Basic
  @Column(name = "project_license", length = 1024)
  public String getProjectLicense() {
    return projectLicense;
  }

  public void setProjectLicense(String projectLicense) {
    this.projectLicense = projectLicense;
  }

  @Basic
  @Column(name = "homepage_url", length = 2048)
  public String getHomepageUrl() {
    return homepageUrl;
  }

  public void setHomepageUrl(String homepageUrl) {
    this.homepageUrl = homepageUrl;
  }

  @Basic
  @Column(name = "bugtracker_url", length = 2048)
  public String getBugtrackerUrl() {
    return bugtrackerUrl;
  }

  public void setBugtrackerUrl(String bugtrackerUrl) {
    this.bugtrackerUrl = bugtrackerUrl;
  }

  @Basic
  @Column(name = "current_release_version", length = 1024)
  public String getCurrentReleaseVersion() {
    return currentReleaseVersion;
  }

  public void setCurrentReleaseVersion(String currentReleaseVersion) {
    this.currentReleaseVersion = currentReleaseVersion;
  }

  @Column(name = "current_release_date")
  public OffsetDateTime getCurrentReleaseDate() {
    return currentReleaseDate;
  }

  public void setCurrentReleaseDate(OffsetDateTime currentReleaseDate) {
    this.currentReleaseDate = currentReleaseDate;
  }

  @Basic
  @Column(name = "current_release_description", length = APP_RELEASE_DESCRIPTION_LENGTH)
  public String getCurrentReleaseDescription() {
    return currentReleaseDescription;
  }

  public void setCurrentReleaseDescription(String currentReleaseDescription) {
    this.currentReleaseDescription = currentReleaseDescription;
  }

  @Column(name = "in_store_since_date")
  public OffsetDateTime getInStoreSinceDate() {

    return inStoreSinceDate;
  }

  public void setInStoreSinceDate(OffsetDateTime inStoreSinceDate) {
    this.inStoreSinceDate = inStoreSinceDate;
  }

  @Basic
  @Column(name = "rating")
  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Basic
  @Column(name = "rating_votes")
  public int getRatingVotes() {
    return ratingVotes;
  }

  public void setRatingVotes(int ratingVotes) {
    this.ratingVotes = ratingVotes;
  }

  @Basic
  @Column(name = "icon_desktop_url", length = 2048)
  public String getIconDesktopUrl() {
    return iconDesktopUrl;
  }

  public void setIconDesktopUrl(String iconDesktopUrl) {
    this.iconDesktopUrl = iconDesktopUrl;
  }

  @Basic
  @Column(name = "icon_mobile_url", length = 2048)
  public String getIconMobileUrl() {
    return iconMobileUrl;
  }

  public void setIconMobileUrl(String iconMobileUrl) {
    this.iconMobileUrl = iconMobileUrl;
  }

  @Basic
  @Column(name = "developer_name", length = 1024)
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }

  @Basic
  @Column(name = "help_url", length = 2048)
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  @Basic
  @Column(name = "donation_url", length = 2048)
  public String getDonationUrl() {
    return donationUrl;
  }

  public void setDonationUrl(String donationUrl) {
    this.donationUrl = donationUrl;
  }

  @Basic
  @Column(name = "translate_url", length = 2048)
  public String getTranslateUrl() {
    return translateUrl;
  }

  public void setTranslateUrl(String translateUrl) {
    this.translateUrl = translateUrl;
  }

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "flatpak_repo_id", referencedColumnName = "flatpak_repo_id")
  public FlatpakRepo getFlatpakRepo() {
    return this.flatpakRepo;
  }

  @JsonProperty
  public void setFlatpakRepo(FlatpakRepo repo) {
    this.flatpakRepo = repo;
  }

//  @JsonInclude()
//  @Transient
//  public String getIconDesktopUrl() {
//    return flathubIconsDesktopUrl + "/" + this.getFlatpakAppId() + ".png";
//  }
//
//  @JsonInclude()
//  @Transient
//  public String getIconMobileUrl() {
//    return flathubIconsMobileUrl + "/" + this.getFlatpakAppId() + ".png";
//  }

  @JsonInclude()
  @Transient
  public String getDownloadFlatpakRefUrl() {
    return FLATPAKREF_BASE_PATH + "/" + this.getFlatpakAppId() + ".flatpakref";
  }

  @ManyToMany(cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
  }, fetch = FetchType.LAZY)
  @JoinTable(name = "app_category",
    joinColumns = @JoinColumn(name = "app_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  public Set<Category> getCategories() {
    return categories;
  }

  public void setCategories(Set<Category> categories) {
    this.categories = categories;
  }

  public void addCategory(Category category) {

    if (!this.categories.contains(category)) {
      categories.add(category);
    }

  }

  public void removeCategory(Category category) {
    categories.remove(category);
  }

  @OneToMany(mappedBy = "app",
    cascade = CascadeType.ALL,
    orphanRemoval = true,
    fetch = FetchType.LAZY)
  public List<Screenshot> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<Screenshot> screenshots) {
    this.screenshots = screenshots;
  }

  public void addScreenshot(Screenshot screenshot) {

    this.screenshots.add(screenshot);
    screenshot.setApp(this);

  }

  public void removeScreenshot(Screenshot screenshot) {

    this.screenshots.remove(screenshot);
    screenshot.setApp(null);
  }


}
