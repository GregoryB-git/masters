/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.UserEntities;
import java.io.Serializable;
import java.util.List;

public class User
implements Serializable,
Identifiable {
    public static final long INVALID_ID = -1L;
    private static final long serialVersionUID = 4663450696842173958L;
    @SerializedName(value="contributors_enabled")
    public final boolean contributorsEnabled;
    @SerializedName(value="created_at")
    public final String createdAt;
    @SerializedName(value="default_profile")
    public final boolean defaultProfile;
    @SerializedName(value="default_profile_image")
    public final boolean defaultProfileImage;
    @SerializedName(value="description")
    public final String description;
    @SerializedName(value="email")
    public final String email;
    @SerializedName(value="entities")
    public final UserEntities entities;
    @SerializedName(value="favourites_count")
    public final int favouritesCount;
    @SerializedName(value="follow_request_sent")
    public final boolean followRequestSent;
    @SerializedName(value="followers_count")
    public final int followersCount;
    @SerializedName(value="friends_count")
    public final int friendsCount;
    @SerializedName(value="geo_enabled")
    public final boolean geoEnabled;
    @SerializedName(value="id")
    public final long id;
    @SerializedName(value="id_str")
    public final String idStr;
    @SerializedName(value="is_translator")
    public final boolean isTranslator;
    @SerializedName(value="lang")
    public final String lang;
    @SerializedName(value="listed_count")
    public final int listedCount;
    @SerializedName(value="location")
    public final String location;
    @SerializedName(value="name")
    public final String name;
    @SerializedName(value="profile_background_color")
    public final String profileBackgroundColor;
    @SerializedName(value="profile_background_image_url")
    public final String profileBackgroundImageUrl;
    @SerializedName(value="profile_background_image_url_https")
    public final String profileBackgroundImageUrlHttps;
    @SerializedName(value="profile_background_tile")
    public final boolean profileBackgroundTile;
    @SerializedName(value="profile_banner_url")
    public final String profileBannerUrl;
    @SerializedName(value="profile_image_url")
    public final String profileImageUrl;
    @SerializedName(value="profile_image_url_https")
    public final String profileImageUrlHttps;
    @SerializedName(value="profile_link_color")
    public final String profileLinkColor;
    @SerializedName(value="profile_sidebar_border_color")
    public final String profileSidebarBorderColor;
    @SerializedName(value="profile_sidebar_fill_color")
    public final String profileSidebarFillColor;
    @SerializedName(value="profile_text_color")
    public final String profileTextColor;
    @SerializedName(value="profile_use_background_image")
    public final boolean profileUseBackgroundImage;
    @SerializedName(value="protected")
    public final boolean protectedUser;
    @SerializedName(value="screen_name")
    public final String screenName;
    @SerializedName(value="show_all_inline_media")
    public final boolean showAllInlineMedia;
    @SerializedName(value="status")
    public final Tweet status;
    @SerializedName(value="statuses_count")
    public final int statusesCount;
    @SerializedName(value="time_zone")
    public final String timeZone;
    @SerializedName(value="url")
    public final String url;
    @SerializedName(value="utc_offset")
    public final int utcOffset;
    @SerializedName(value="verified")
    public final boolean verified;
    @SerializedName(value="withheld_in_countries")
    public final List<String> withheldInCountries;
    @SerializedName(value="withheld_scope")
    public final String withheldScope;

    public User(boolean bl, String string2, boolean bl2, boolean bl3, String string3, String string4, UserEntities userEntities, int n, boolean bl4, int n2, int n3, boolean bl5, long l, String string5, boolean bl6, String string6, int n4, String string7, String string8, String string9, String string10, String string11, boolean bl7, String string12, String string13, String string14, String string15, String string16, String string17, String string18, boolean bl8, boolean bl9, String string19, boolean bl10, Tweet tweet, int n5, String string20, String string21, int n6, boolean bl11, List<String> list, String string22) {
        this.contributorsEnabled = bl;
        this.createdAt = string2;
        this.defaultProfile = bl2;
        this.defaultProfileImage = bl3;
        this.description = string3;
        this.email = string4;
        this.entities = userEntities;
        this.favouritesCount = n;
        this.followRequestSent = bl4;
        this.followersCount = n2;
        this.friendsCount = n3;
        this.geoEnabled = bl5;
        this.id = l;
        this.idStr = string5;
        this.isTranslator = bl6;
        this.lang = string6;
        this.listedCount = n4;
        this.location = string7;
        this.name = string8;
        this.profileBackgroundColor = string9;
        this.profileBackgroundImageUrl = string10;
        this.profileBackgroundImageUrlHttps = string11;
        this.profileBackgroundTile = bl7;
        this.profileBannerUrl = string12;
        this.profileImageUrl = string13;
        this.profileImageUrlHttps = string14;
        this.profileLinkColor = string15;
        this.profileSidebarBorderColor = string16;
        this.profileSidebarFillColor = string17;
        this.profileTextColor = string18;
        this.profileUseBackgroundImage = bl8;
        this.protectedUser = bl9;
        this.screenName = string19;
        this.showAllInlineMedia = bl10;
        this.status = tweet;
        this.statusesCount = n5;
        this.timeZone = string20;
        this.url = string21;
        this.utcOffset = n6;
        this.verified = bl11;
        this.withheldInCountries = list;
        this.withheldScope = string22;
    }

    @Override
    public long getId() {
        return this.id;
    }
}

