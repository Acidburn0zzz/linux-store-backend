package org.flathub.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.flathub.api.model.Screenshot;

/**
 * Created by jorge on 19/12/17.
 */
public class AppFullDto {

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
  private String iconDesktopUrl;
  private String iconMobileUrl;
  private String downloadFlatpakRefUrl;
  private String currentReleaseVersion;
  private OffsetDateTime currentReleaseDate;
  private String currentReleaseDescription;
  private OffsetDateTime inStoreSinceDate;
  private double rating;
  private int ratingVotes;


  private Set<CategoryDto> categories = new HashSet<>();
  private List<Screenshot> screenshots = new ArrayList<>();

  public String getFlatpakAppId() {
    return flatpakAppId;
  }

  public void setFlatpakAppId(String flatpakAppId) {
    this.flatpakAppId = flatpakAppId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getProjectLicense() {
    return projectLicense;
  }

  public void setProjectLicense(String projectLicense) {
    this.projectLicense = projectLicense;
  }

  public String getHomepageUrl() {
    return homepageUrl;
  }

  public void setHomepageUrl(String homepageUrl) {
    this.homepageUrl = homepageUrl;
  }

  public String getBugtrackerUrl() {
    return bugtrackerUrl;
  }

  public void setBugtrackerUrl(String bugtrackerUrl) {
    this.bugtrackerUrl = bugtrackerUrl;
  }

  public String getIconDesktopUrl() {
    return iconDesktopUrl;
  }

  public void setIconDesktopUrl(String iconDesktopUrl) {
    this.iconDesktopUrl = iconDesktopUrl;
  }

  public String getIconMobileUrl() {
    return iconMobileUrl;
  }

  public void setIconMobileUrl(String iconMobileUrl) {
    this.iconMobileUrl = iconMobileUrl;
  }

  public String getDownloadFlatpakRefUrl() {
    return downloadFlatpakRefUrl;
  }

  public void setDownloadFlatpakRefUrl(String downloadFlatpakRefUrl) {
    this.downloadFlatpakRefUrl = downloadFlatpakRefUrl;
  }

  public String getCurrentReleaseVersion() {
    return currentReleaseVersion;
  }

  public void setCurrentReleaseVersion(String currentReleaseVersion) {
    this.currentReleaseVersion = currentReleaseVersion;
  }

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT")
  public OffsetDateTime getCurrentReleaseDate() {
    return currentReleaseDate;
  }

  public void setCurrentReleaseDate(OffsetDateTime currentReleaseDate) {
    this.currentReleaseDate = currentReleaseDate;
  }

  public String getCurrentReleaseDescription() {
    return currentReleaseDescription;
  }

  public void setCurrentReleaseDescription(String currentReleaseDescription) {
    this.currentReleaseDescription = currentReleaseDescription;
  }

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "GMT")
  public OffsetDateTime getInStoreSinceDate() {
    return inStoreSinceDate;
  }

  public void setInStoreSinceDate(OffsetDateTime inStoreSinceDate) {
    this.inStoreSinceDate = inStoreSinceDate;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public int getRatingVotes() {
    return ratingVotes;
  }

  public void setRatingVotes(int ratingVotes) {
    this.ratingVotes = ratingVotes;
  }

  public Set<CategoryDto> getCategories() {
    return categories;
  }

  public void setCategories(Set<CategoryDto> categories) {
    this.categories = categories;
  }

  public List<Screenshot> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<Screenshot> screenshots) {
    this.screenshots = screenshots;
  }

  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }

  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  public String getDonationUrl() {
    return donationUrl;
  }

  public void setDonationUrl(String donationUrl) {
    this.donationUrl = donationUrl;
  }

  public String getTranslateUrl() {
    return translateUrl;
  }

  public void setTranslateUrl(String translateUrl) {
    this.translateUrl = translateUrl;
  }
}
