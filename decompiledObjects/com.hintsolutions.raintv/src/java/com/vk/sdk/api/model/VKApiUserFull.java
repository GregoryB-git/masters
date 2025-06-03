/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiAudio;
import com.vk.sdk.api.model.VKApiCity;
import com.vk.sdk.api.model.VKApiCountry;
import com.vk.sdk.api.model.VKApiSchool;
import com.vk.sdk.api.model.VKApiUniversity;
import com.vk.sdk.api.model.VKApiUser;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiUserFull
extends VKApiUser {
    public static final String ABOUT = "about";
    public static final String ACTIVITIES = "activities";
    public static final String ACTIVITY = "activity";
    public static final String BDATE = "bdate";
    public static final String BLACKLISTED_BY_ME = "blacklisted_by_me";
    public static final String BOOKS = "books";
    public static final String CAN_POST = "can_post";
    public static final String CAN_SEE_ALL_POSTS = "can_see_all_posts";
    public static final String CAN_WRITE_PRIVATE_MESSAGE = "can_write_private_message";
    public static final String CITY = "city";
    public static final String CONNECTIONS = "connections";
    public static final String CONTACTS = "contacts";
    public static final String COUNTERS = "counters";
    public static final String COUNTRY = "country";
    public static Parcelable.Creator<VKApiUserFull> CREATOR = new Parcelable.Creator<VKApiUserFull>(){

        public VKApiUserFull createFromParcel(Parcel parcel) {
            return new VKApiUserFull(parcel);
        }

        public VKApiUserFull[] newArray(int n4) {
            return new VKApiUserFull[n4];
        }
    };
    public static final String GAMES = "games";
    public static final String INTERESTS = "interests";
    public static final String LAST_SEEN = "last_seen";
    public static final String MOVIES = "movies";
    public static final String OCCUPATION = "occupation";
    public static final String PERSONAL = "personal";
    public static final String QUOTES = "quotes";
    public static final String RELATION = "relation";
    public static final String RELATIVES = "relatives";
    public static final String SCHOOLS = "schools";
    public static final String SCREEN_NAME = "screen_name";
    public static final String SEX = "sex";
    public static final String SITE = "site";
    public static final String TV = "tv";
    public static final String UNIVERSITIES = "universities";
    public static final String VERIFIED = "verified";
    public static final String WALL_DEFAULT = "wall_default";
    public String about;
    public String activities;
    public String activity;
    public int alcohol;
    public String bdate;
    public boolean blacklisted_by_me;
    public String books;
    public boolean can_post;
    public boolean can_see_all_posts;
    public boolean can_write_private_message;
    public VKApiCity city;
    public Counters counters;
    public VKApiCountry country;
    public String facebook;
    public String facebook_name;
    public String games;
    public String home_phone;
    public String inspired_by;
    public String instagram;
    public String interests;
    public boolean is_banned;
    public boolean is_deleted;
    public String[] langs;
    public long last_seen;
    public int life_main;
    public String livejournal;
    public String mobile_phone;
    public String movies;
    public String nickname;
    public Occupation occupation;
    public int people_main;
    public int political;
    public String quotes;
    public int relation;
    public VKList<Relative> relatives;
    public String religion;
    public VKList<VKApiSchool> schools;
    public String screen_name;
    public int sex;
    public String site;
    public String skype;
    public int smoking;
    public VKApiAudio status_audio;
    public String tv;
    public String twitter;
    public VKList<VKApiUniversity> universities;
    public boolean verified;
    public boolean wall_comments;
    public boolean wall_default_owner;

    public VKApiUserFull() {
    }

    public VKApiUserFull(Parcel parcel) {
        super(parcel);
        this.activity = parcel.readString();
        this.status_audio = (VKApiAudio)parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.bdate = parcel.readString();
        this.city = (VKApiCity)parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.country = (VKApiCountry)parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.last_seen = parcel.readLong();
        this.universities = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        this.schools = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        this.smoking = parcel.readInt();
        this.alcohol = parcel.readInt();
        this.political = parcel.readInt();
        this.life_main = parcel.readInt();
        this.people_main = parcel.readInt();
        this.inspired_by = parcel.readString();
        this.langs = parcel.createStringArray();
        this.religion = parcel.readString();
        this.facebook = parcel.readString();
        this.facebook_name = parcel.readString();
        this.livejournal = parcel.readString();
        this.skype = parcel.readString();
        this.site = parcel.readString();
        this.twitter = parcel.readString();
        this.instagram = parcel.readString();
        this.mobile_phone = parcel.readString();
        this.home_phone = parcel.readString();
        this.screen_name = parcel.readString();
        this.activities = parcel.readString();
        this.interests = parcel.readString();
        this.movies = parcel.readString();
        this.tv = parcel.readString();
        this.books = parcel.readString();
        this.games = parcel.readString();
        this.about = parcel.readString();
        this.quotes = parcel.readString();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.can_post = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_see_all_posts = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_write_private_message = bl2;
        bl2 = parcel.readByte() != 0;
        this.wall_comments = bl2;
        bl2 = parcel.readByte() != 0;
        this.is_banned = bl2;
        bl2 = parcel.readByte() != 0;
        this.is_deleted = bl2;
        bl2 = parcel.readByte() != 0;
        this.wall_default_owner = bl2;
        bl2 = parcel.readByte() != 0;
        this.verified = bl2;
        this.sex = parcel.readInt();
        this.counters = parcel.readParcelable(Counters.class.getClassLoader());
        this.occupation = parcel.readParcelable(Occupation.class.getClassLoader());
        this.relation = parcel.readInt();
        this.relatives = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.blacklisted_by_me = bl2;
    }

    public VKApiUserFull(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiUserFull parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        this.last_seen = ParseUtils.parseLong(jSONObject.optJSONObject(LAST_SEEN), "time");
        this.bdate = jSONObject.optString(BDATE);
        Object object = jSONObject.optJSONObject(CITY);
        if (object != null) {
            this.city = new VKApiCity().parse((JSONObject)object);
        }
        if ((object = jSONObject.optJSONObject(COUNTRY)) != null) {
            this.country = new VKApiCountry().parse((JSONObject)object);
        }
        this.universities = new VKList<VKApiUniversity>(jSONObject.optJSONArray(UNIVERSITIES), VKApiUniversity.class);
        this.schools = new VKList<VKApiSchool>(jSONObject.optJSONArray(SCHOOLS), VKApiSchool.class);
        this.activity = jSONObject.optString(ACTIVITY);
        object = jSONObject.optJSONObject("status_audio");
        if (object != null) {
            this.status_audio = new VKApiAudio().parse((JSONObject)object);
        }
        if ((object = jSONObject.optJSONObject(PERSONAL)) != null) {
            this.smoking = object.optInt("smoking");
            this.alcohol = object.optInt("alcohol");
            this.political = object.optInt("political");
            this.life_main = object.optInt("life_main");
            this.people_main = object.optInt("people_main");
            this.inspired_by = object.optString("inspired_by");
            this.religion = object.optString("religion");
            if (object.has("langs") && (object = object.optJSONArray("langs")) != null) {
                this.langs = new String[object.length()];
                for (int j = 0; j < object.length(); ++j) {
                    this.langs[j] = object.optString(j);
                }
            }
        }
        this.facebook = jSONObject.optString("facebook");
        this.facebook_name = jSONObject.optString("facebook_name");
        this.livejournal = jSONObject.optString("livejournal");
        this.site = jSONObject.optString(SITE);
        object = z2.t("id");
        object.append(this.id);
        this.screen_name = jSONObject.optString(SCREEN_NAME, object.toString());
        this.skype = jSONObject.optString("skype");
        this.mobile_phone = jSONObject.optString("mobile_phone");
        this.home_phone = jSONObject.optString("home_phone");
        this.twitter = jSONObject.optString("twitter");
        this.instagram = jSONObject.optString("instagram");
        this.about = jSONObject.optString(ABOUT);
        this.activities = jSONObject.optString(ACTIVITIES);
        this.books = jSONObject.optString(BOOKS);
        this.games = jSONObject.optString(GAMES);
        this.interests = jSONObject.optString(INTERESTS);
        this.movies = jSONObject.optString(MOVIES);
        this.quotes = jSONObject.optString(QUOTES);
        this.tv = jSONObject.optString(TV);
        this.nickname = jSONObject.optString("nickname", null);
        this.can_post = ParseUtils.parseBoolean(jSONObject, CAN_POST);
        this.can_see_all_posts = ParseUtils.parseBoolean(jSONObject, CAN_SEE_ALL_POSTS);
        this.blacklisted_by_me = ParseUtils.parseBoolean(jSONObject, BLACKLISTED_BY_ME);
        this.can_write_private_message = ParseUtils.parseBoolean(jSONObject, CAN_WRITE_PRIVATE_MESSAGE);
        this.wall_comments = ParseUtils.parseBoolean(jSONObject, WALL_DEFAULT);
        object = jSONObject.optString("deactivated");
        this.is_deleted = "deleted".equals(object);
        this.is_banned = "banned".equals(object);
        this.wall_default_owner = "owner".equals((Object)jSONObject.optString(WALL_DEFAULT));
        this.verified = ParseUtils.parseBoolean(jSONObject, VERIFIED);
        this.sex = jSONObject.optInt(SEX);
        object = jSONObject.optJSONObject(COUNTERS);
        if (object != null) {
            this.counters = new Parcelable((JSONObject)object){
                public static Parcelable.Creator<Counters> CREATOR = new Parcelable.Creator<Counters>(){

                    public Counters createFromParcel(Parcel parcel) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public Counters[] newArray(int n4) {
                        return new Counters[n4];
                    }
                };
                public static final int NO_COUNTER = -1;
                public int albums = -1;
                public int audios = -1;
                public int followers = -1;
                public int friends = -1;
                public int groups = -1;
                public int mutual_friends = -1;
                public int notes = -1;
                public int online_friends = -1;
                public int pages = -1;
                public int photos = -1;
                public int subscriptions = -1;
                public int user_videos = -1;
                public int videos = -1;
                {
                    this.albums = parcel.readInt();
                    this.videos = parcel.readInt();
                    this.audios = parcel.readInt();
                    this.notes = parcel.readInt();
                    this.friends = parcel.readInt();
                    this.photos = parcel.readInt();
                    this.groups = parcel.readInt();
                    this.online_friends = parcel.readInt();
                    this.mutual_friends = parcel.readInt();
                    this.user_videos = parcel.readInt();
                    this.followers = parcel.readInt();
                    this.subscriptions = parcel.readInt();
                    this.pages = parcel.readInt();
                }
                {
                    this(parcel);
                }
                {
                    this.albums = jSONObject.optInt("albums", -1);
                    this.audios = jSONObject.optInt("audios", this.audios);
                    this.followers = jSONObject.optInt("followers", this.followers);
                    this.photos = jSONObject.optInt("photos", this.photos);
                    this.friends = jSONObject.optInt("friends", this.friends);
                    this.groups = jSONObject.optInt("groups", this.groups);
                    this.mutual_friends = jSONObject.optInt("mutual_friends", this.mutual_friends);
                    this.notes = jSONObject.optInt("notes", this.notes);
                    this.online_friends = jSONObject.optInt("online_friends", this.online_friends);
                    this.user_videos = jSONObject.optInt("user_videos", this.user_videos);
                    this.videos = jSONObject.optInt("videos", this.videos);
                    this.subscriptions = jSONObject.optInt("subscriptions", this.subscriptions);
                    this.pages = jSONObject.optInt("pages", this.pages);
                }

                public int describeContents() {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int n4) {
                    parcel.writeInt(this.albums);
                    parcel.writeInt(this.videos);
                    parcel.writeInt(this.audios);
                    parcel.writeInt(this.notes);
                    parcel.writeInt(this.friends);
                    parcel.writeInt(this.photos);
                    parcel.writeInt(this.groups);
                    parcel.writeInt(this.online_friends);
                    parcel.writeInt(this.mutual_friends);
                    parcel.writeInt(this.user_videos);
                    parcel.writeInt(this.followers);
                    parcel.writeInt(this.subscriptions);
                    parcel.writeInt(this.pages);
                }
            };
        }
        if ((object = jSONObject.optJSONObject(OCCUPATION)) != null) {
            this.occupation = new Parcelable((JSONObject)object){
                public static Parcelable.Creator<Occupation> CREATOR = new Parcelable.Creator<Occupation>(){

                    public Occupation createFromParcel(Parcel parcel) {
                        return new /* invalid duplicate definition of identical inner class */;
                    }

                    public Occupation[] newArray(int n4) {
                        return new Occupation[n4];
                    }
                };
                public static final int NO_COUNTER = -1;
                public int id = -1;
                public String name;
                public String type;
                {
                    this.type = parcel.readString();
                    this.id = parcel.readInt();
                    this.name = parcel.readString();
                }
                {
                    this(parcel);
                }
                {
                    this.type = jSONObject.optString("type");
                    this.id = jSONObject.optInt("id", this.id);
                    this.name = jSONObject.optString("name");
                }

                public int describeContents() {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int n4) {
                    parcel.writeString(this.type);
                    parcel.writeInt(this.id);
                    parcel.writeString(this.name);
                }
            };
        }
        this.relation = jSONObject.optInt(RELATION);
        if (jSONObject.has(RELATIVES)) {
            if (this.relatives == null) {
                this.relatives = new VKList();
            }
            this.relatives.fill(jSONObject.optJSONArray(RELATIVES), Relative.class);
        }
        return this;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        super.writeToParcel(parcel, n4);
        parcel.writeString(this.activity);
        parcel.writeParcelable((Parcelable)this.status_audio, n4);
        parcel.writeString(this.bdate);
        parcel.writeParcelable((Parcelable)this.city, n4);
        parcel.writeParcelable((Parcelable)this.country, n4);
        parcel.writeLong(this.last_seen);
        parcel.writeParcelable(this.universities, n4);
        parcel.writeParcelable(this.schools, n4);
        parcel.writeInt(this.smoking);
        parcel.writeInt(this.alcohol);
        parcel.writeInt(this.political);
        parcel.writeInt(this.life_main);
        parcel.writeInt(this.people_main);
        parcel.writeString(this.inspired_by);
        parcel.writeStringArray(this.langs);
        parcel.writeString(this.religion);
        parcel.writeString(this.facebook);
        parcel.writeString(this.facebook_name);
        parcel.writeString(this.livejournal);
        parcel.writeString(this.skype);
        parcel.writeString(this.site);
        parcel.writeString(this.twitter);
        parcel.writeString(this.instagram);
        parcel.writeString(this.mobile_phone);
        parcel.writeString(this.home_phone);
        parcel.writeString(this.screen_name);
        parcel.writeString(this.activities);
        parcel.writeString(this.interests);
        parcel.writeString(this.movies);
        parcel.writeString(this.tv);
        parcel.writeString(this.books);
        parcel.writeString(this.games);
        parcel.writeString(this.about);
        parcel.writeString(this.quotes);
        parcel.writeByte((byte)(this.can_post ? 1 : 0));
        parcel.writeByte((byte)(this.can_see_all_posts ? 1 : 0));
        parcel.writeByte((byte)(this.can_write_private_message ? 1 : 0));
        parcel.writeByte((byte)(this.wall_comments ? 1 : 0));
        parcel.writeByte((byte)(this.is_banned ? 1 : 0));
        parcel.writeByte((byte)(this.is_deleted ? 1 : 0));
        parcel.writeByte((byte)(this.wall_default_owner ? 1 : 0));
        parcel.writeByte((byte)(this.verified ? 1 : 0));
        parcel.writeInt(this.sex);
        parcel.writeParcelable((Parcelable)this.counters, n4);
        parcel.writeParcelable((Parcelable)this.occupation, n4);
        parcel.writeInt(this.relation);
        parcel.writeParcelable(this.relatives, n4);
        parcel.writeByte((byte)(this.blacklisted_by_me ? 1 : 0));
    }
}

