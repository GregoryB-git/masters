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
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.ParseUtils;
import com.vk.sdk.api.model.VKApiAudio;
import com.vk.sdk.api.model.VKApiCity;
import com.vk.sdk.api.model.VKApiCommunity;
import com.vk.sdk.api.model.VKApiCountry;
import com.vk.sdk.api.model.VKApiPlace;
import com.vk.sdk.api.model.VKList;
import org.json.JSONObject;

public class VKApiCommunityFull
extends VKApiCommunity {
    public static final String ACTIVITY = "activity";
    public static final String BLACKLISTED = "blacklisted";
    public static final String CAN_POST = "can_post";
    public static final String CAN_SEE_ALL_POSTS = "can_see_all_posts";
    public static final String CITY = "city";
    public static final String CONTACTS = "contacts";
    public static final String COUNTERS = "counters";
    public static final String COUNTRY = "country";
    public static Parcelable.Creator<VKApiCommunityFull> CREATOR = new Parcelable.Creator<VKApiCommunityFull>(){

        public VKApiCommunityFull createFromParcel(Parcel parcel) {
            return new VKApiCommunityFull(parcel);
        }

        public VKApiCommunityFull[] newArray(int n4) {
            return new VKApiCommunityFull[n4];
        }
    };
    public static final String DESCRIPTION = "description";
    public static final String END_DATE = "end_date";
    public static final String FIXED_POST = "fixed_post";
    public static final String LINKS = "links";
    public static final String MEMBERS_COUNT = "members_count";
    public static final String PLACE = "place";
    public static final String SITE = "site";
    public static final String START_DATE = "start_date";
    public static final String STATUS = "status";
    public static final String VERIFIED = "verified";
    public static final String WIKI_PAGE = "wiki_page";
    public boolean blacklisted;
    public boolean can_post;
    public boolean can_see_all_posts;
    public VKApiCity city;
    public VKList<Contact> contacts;
    public Counters counters;
    public VKApiCountry country;
    public String description;
    public long end_date;
    public int fixed_post;
    public VKList<Link> links;
    public int members_count;
    public VKApiPlace place;
    public String site;
    public long start_date;
    public String status;
    public VKApiAudio status_audio;
    public boolean verified;
    public String wiki_page;

    public VKApiCommunityFull() {
    }

    public VKApiCommunityFull(Parcel parcel) {
        super(parcel);
        this.city = (VKApiCity)parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.country = (VKApiCountry)parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.status_audio = (VKApiAudio)parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.place = (VKApiPlace)parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.description = parcel.readString();
        this.wiki_page = parcel.readString();
        this.members_count = parcel.readInt();
        this.counters = parcel.readParcelable(Counters.class.getClassLoader());
        this.start_date = parcel.readLong();
        this.end_date = parcel.readLong();
        byte by = parcel.readByte();
        boolean bl = true;
        boolean bl2 = by != 0;
        this.can_post = bl2;
        bl2 = parcel.readByte() != 0;
        this.can_see_all_posts = bl2;
        this.status = parcel.readString();
        this.contacts = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        this.links = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
        this.fixed_post = parcel.readInt();
        bl2 = parcel.readByte() != 0;
        this.verified = bl2;
        this.site = parcel.readString();
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.blacklisted = bl2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public VKApiCommunityFull parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        JSONObject jSONObject2 = jSONObject.optJSONObject(CITY);
        if (jSONObject2 != null) {
            this.city = new VKApiCity().parse(jSONObject2);
        }
        if ((jSONObject2 = jSONObject.optJSONObject(COUNTRY)) != null) {
            this.country = new VKApiCountry().parse(jSONObject2);
        }
        if ((jSONObject2 = jSONObject.optJSONObject(PLACE)) != null) {
            this.place = new VKApiPlace().parse(jSONObject2);
        }
        this.description = jSONObject.optString(DESCRIPTION);
        this.wiki_page = jSONObject.optString(WIKI_PAGE);
        this.members_count = jSONObject.optInt(MEMBERS_COUNT);
        jSONObject2 = jSONObject.optJSONObject(COUNTERS);
        if (jSONObject2 != null) {
            this.counters = new Parcelable(jSONObject2){
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
                public int docs = -1;
                public int photos = -1;
                public int topics = -1;
                public int videos = -1;
                {
                    this.photos = parcel.readInt();
                    this.albums = parcel.readInt();
                    this.audios = parcel.readInt();
                    this.videos = parcel.readInt();
                    this.topics = parcel.readInt();
                    this.docs = parcel.readInt();
                }
                {
                    this(parcel);
                }
                {
                    this.photos = jSONObject.optInt("photos", -1);
                    this.albums = jSONObject.optInt("albums", this.albums);
                    this.audios = jSONObject.optInt("audios", this.audios);
                    this.videos = jSONObject.optInt("videos", this.videos);
                    this.topics = jSONObject.optInt("topics", this.topics);
                    this.docs = jSONObject.optInt("docs", this.docs);
                }

                public int describeContents() {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int n4) {
                    parcel.writeInt(this.photos);
                    parcel.writeInt(this.albums);
                    parcel.writeInt(this.audios);
                    parcel.writeInt(this.videos);
                    parcel.writeInt(this.topics);
                    parcel.writeInt(this.docs);
                }
            };
        }
        this.start_date = jSONObject.optLong(START_DATE);
        this.end_date = jSONObject.optLong(END_DATE);
        this.can_post = ParseUtils.parseBoolean(jSONObject, CAN_POST);
        this.can_see_all_posts = ParseUtils.parseBoolean(jSONObject, CAN_SEE_ALL_POSTS);
        this.status = jSONObject.optString(STATUS);
        jSONObject2 = jSONObject.optJSONObject("status_audio");
        if (jSONObject2 != null) {
            this.status_audio = new VKApiAudio().parse(jSONObject2);
        }
        this.contacts = new VKList<Contact>(jSONObject.optJSONArray(CONTACTS), Contact.class);
        this.links = new VKList<Link>(jSONObject.optJSONArray(LINKS), Link.class);
        this.fixed_post = jSONObject.optInt(FIXED_POST);
        this.verified = ParseUtils.parseBoolean(jSONObject, VERIFIED);
        this.blacklisted = ParseUtils.parseBoolean(jSONObject, VERIFIED);
        this.site = jSONObject.optString(SITE);
        return this;
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        super.writeToParcel(parcel, n4);
        parcel.writeParcelable((Parcelable)this.city, n4);
        parcel.writeParcelable((Parcelable)this.country, n4);
        parcel.writeParcelable((Parcelable)this.status_audio, n4);
        parcel.writeParcelable((Parcelable)this.place, n4);
        parcel.writeString(this.description);
        parcel.writeString(this.wiki_page);
        parcel.writeInt(this.members_count);
        parcel.writeParcelable((Parcelable)this.counters, n4);
        parcel.writeLong(this.start_date);
        parcel.writeLong(this.end_date);
        parcel.writeByte((byte)(this.can_post ? 1 : 0));
        parcel.writeByte((byte)(this.can_see_all_posts ? 1 : 0));
        parcel.writeString(this.status);
        parcel.writeParcelable(this.contacts, n4);
        parcel.writeParcelable(this.links, n4);
        parcel.writeInt(this.fixed_post);
        parcel.writeByte((byte)(this.verified ? 1 : 0));
        parcel.writeString(this.site);
        parcel.writeByte((byte)(this.blacklisted ? 1 : 0));
    }
}

