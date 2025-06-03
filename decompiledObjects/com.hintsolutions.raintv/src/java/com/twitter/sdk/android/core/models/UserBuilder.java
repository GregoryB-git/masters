/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  com.twitter.sdk.android.core.models.User
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.models.UserEntities;
import java.util.List;

public class UserBuilder {
    private boolean contributorsEnabled;
    private String createdAt;
    private boolean defaultProfile;
    private boolean defaultProfileImage;
    private String description;
    private String email;
    private UserEntities entities;
    private int favouritesCount;
    private boolean followRequestSent;
    private int followersCount;
    private int friendsCount;
    private boolean geoEnabled;
    private long id = -1L;
    private String idStr;
    private boolean isTranslator;
    private String lang;
    private int listedCount;
    private String location;
    private String name;
    private String profileBackgroundColor;
    private String profileBackgroundImageUrl;
    private String profileBackgroundImageUrlHttps;
    private boolean profileBackgroundTile;
    private String profileBannerUrl;
    private String profileImageUrl;
    private String profileImageUrlHttps;
    private String profileLinkColor;
    private String profileSidebarBorderColor;
    private String profileSidebarFillColor;
    private String profileTextColor;
    private boolean profileUseBackgroundImage;
    private boolean protectedUser;
    private String screenName;
    private boolean showAllInlineMedia;
    private Tweet status;
    private int statusesCount;
    private String timeZone;
    private String url;
    private int utcOffset;
    private boolean verified;
    private List<String> withheldInCountries;
    private String withheldScope;

    public User build() {
        return new User(this.contributorsEnabled, this.createdAt, this.defaultProfile, this.defaultProfileImage, this.description, this.email, this.entities, this.favouritesCount, this.followRequestSent, this.followersCount, this.friendsCount, this.geoEnabled, this.id, this.idStr, this.isTranslator, this.lang, this.listedCount, this.location, this.name, this.profileBackgroundColor, this.profileBackgroundImageUrl, this.profileBackgroundImageUrlHttps, this.profileBackgroundTile, this.profileBannerUrl, this.profileImageUrl, this.profileImageUrlHttps, this.profileLinkColor, this.profileSidebarBorderColor, this.profileSidebarFillColor, this.profileTextColor, this.profileUseBackgroundImage, this.protectedUser, this.screenName, this.showAllInlineMedia, this.status, this.statusesCount, this.timeZone, this.url, this.utcOffset, this.verified, this.withheldInCountries, this.withheldScope);
    }

    public UserBuilder setContributorsEnabled(boolean bl) {
        this.contributorsEnabled = bl;
        return this;
    }

    public UserBuilder setCreatedAt(String string2) {
        this.createdAt = string2;
        return this;
    }

    public UserBuilder setDefaultProfile(boolean bl) {
        this.defaultProfile = bl;
        return this;
    }

    public UserBuilder setDefaultProfileImage(boolean bl) {
        this.defaultProfileImage = bl;
        return this;
    }

    public UserBuilder setDescription(String string2) {
        this.description = string2;
        return this;
    }

    public UserBuilder setEmail(String string2) {
        this.email = string2;
        return this;
    }

    public UserBuilder setEntities(UserEntities userEntities) {
        this.entities = userEntities;
        return this;
    }

    public UserBuilder setFavouritesCount(int n) {
        this.favouritesCount = n;
        return this;
    }

    public UserBuilder setFollowRequestSent(boolean bl) {
        this.followRequestSent = bl;
        return this;
    }

    public UserBuilder setFollowersCount(int n) {
        this.followersCount = n;
        return this;
    }

    public UserBuilder setFriendsCount(int n) {
        this.friendsCount = n;
        return this;
    }

    public UserBuilder setGeoEnabled(boolean bl) {
        this.geoEnabled = bl;
        return this;
    }

    public UserBuilder setId(long l) {
        this.id = l;
        return this;
    }

    public UserBuilder setIdStr(String string2) {
        this.idStr = string2;
        return this;
    }

    public UserBuilder setIsTranslator(boolean bl) {
        this.isTranslator = bl;
        return this;
    }

    public UserBuilder setLang(String string2) {
        this.lang = string2;
        return this;
    }

    public UserBuilder setListedCount(int n) {
        this.listedCount = n;
        return this;
    }

    public UserBuilder setLocation(String string2) {
        this.location = string2;
        return this;
    }

    public UserBuilder setName(String string2) {
        this.name = string2;
        return this;
    }

    public UserBuilder setProfileBackgroundColor(String string2) {
        this.profileBackgroundColor = string2;
        return this;
    }

    public UserBuilder setProfileBackgroundImageUrl(String string2) {
        this.profileBackgroundImageUrl = string2;
        return this;
    }

    public UserBuilder setProfileBackgroundImageUrlHttps(String string2) {
        this.profileBackgroundImageUrlHttps = string2;
        return this;
    }

    public UserBuilder setProfileBackgroundTile(boolean bl) {
        this.profileBackgroundTile = bl;
        return this;
    }

    public UserBuilder setProfileBannerUrl(String string2) {
        this.profileBannerUrl = string2;
        return this;
    }

    public UserBuilder setProfileImageUrl(String string2) {
        this.profileImageUrl = string2;
        return this;
    }

    public UserBuilder setProfileImageUrlHttps(String string2) {
        this.profileImageUrlHttps = string2;
        return this;
    }

    public UserBuilder setProfileLinkColor(String string2) {
        this.profileLinkColor = string2;
        return this;
    }

    public UserBuilder setProfileSidebarBorderColor(String string2) {
        this.profileSidebarBorderColor = string2;
        return this;
    }

    public UserBuilder setProfileSidebarFillColor(String string2) {
        this.profileSidebarFillColor = string2;
        return this;
    }

    public UserBuilder setProfileTextColor(String string2) {
        this.profileTextColor = string2;
        return this;
    }

    public UserBuilder setProfileUseBackgroundImage(boolean bl) {
        this.profileUseBackgroundImage = bl;
        return this;
    }

    public UserBuilder setProtectedUser(boolean bl) {
        this.protectedUser = bl;
        return this;
    }

    public UserBuilder setScreenName(String string2) {
        this.screenName = string2;
        return this;
    }

    public UserBuilder setShowAllInlineMedia(boolean bl) {
        this.showAllInlineMedia = bl;
        return this;
    }

    public UserBuilder setStatus(Tweet tweet) {
        this.status = tweet;
        return this;
    }

    public UserBuilder setStatusesCount(int n) {
        this.statusesCount = n;
        return this;
    }

    public UserBuilder setTimeZone(String string2) {
        this.timeZone = string2;
        return this;
    }

    public UserBuilder setUrl(String string2) {
        this.url = string2;
        return this;
    }

    public UserBuilder setUtcOffset(int n) {
        this.utcOffset = n;
        return this;
    }

    public UserBuilder setVerified(boolean bl) {
        this.verified = bl;
        return this;
    }

    public UserBuilder setWithheldInCountries(List<String> list) {
        this.withheldInCountries = list;
        return this;
    }

    public UserBuilder setWithheldScope(String string2) {
        this.withheldScope = string2;
        return this;
    }
}

