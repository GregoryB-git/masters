/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.MediaEntity
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui.internal;

import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.VideoInfo;
import java.util.ArrayList;
import java.util.List;

public final class TweetMediaUtils {
    private static final String CONTENT_TYPE_HLS = "application/x-mpegURL";
    private static final String CONTENT_TYPE_MP4 = "video/mp4";
    public static final String GIF_TYPE = "animated_gif";
    private static final int LOOP_VIDEO_IN_MILLIS = 6500;
    public static final String PHOTO_TYPE = "photo";
    public static final String VIDEO_TYPE = "video";

    private TweetMediaUtils() {
    }

    public static List<MediaEntity> getAllMediaEntities(Tweet list) {
        ArrayList arrayList = new ArrayList();
        List<MediaEntity> list2 = list.entities;
        if (list2 != null && (list2 = list2.media) != null) {
            arrayList.addAll(list2);
        }
        if ((list = list.extendedEntities) != null && (list = list.media) != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static List<MediaEntity> getPhotoEntities(Tweet object) {
        MediaEntity mediaEntity;
        ArrayList arrayList = new ArrayList();
        object = object.extendedEntities;
        if (object != null && (mediaEntity = object.media) != null && mediaEntity.size() > 0) {
            for (int k = 0; k <= object.media.size() - 1; ++k) {
                mediaEntity = (MediaEntity)object.media.get(k);
                if (mediaEntity.type == null || !TweetMediaUtils.isPhotoType(mediaEntity)) continue;
                arrayList.add((Object)mediaEntity);
            }
        }
        return arrayList;
    }

    public static MediaEntity getPhotoEntity(Tweet list) {
        list = TweetMediaUtils.getAllMediaEntities((Tweet)list);
        for (int k = list.size() - 1; k >= 0; --k) {
            MediaEntity mediaEntity = (MediaEntity)list.get(k);
            if (mediaEntity.type == null || !TweetMediaUtils.isPhotoType(mediaEntity)) continue;
            return mediaEntity;
        }
        return null;
    }

    public static VideoInfo.Variant getSupportedVariant(MediaEntity mediaEntity) {
        for (VideoInfo.Variant variant : mediaEntity.videoInfo.variants) {
            if (!TweetMediaUtils.isVariantSupported(variant)) continue;
            return variant;
        }
        return null;
    }

    public static MediaEntity getVideoEntity(Tweet tweet) {
        for (MediaEntity mediaEntity : TweetMediaUtils.getAllMediaEntities(tweet)) {
            if (mediaEntity.type == null || !TweetMediaUtils.isVideoType(mediaEntity)) continue;
            return mediaEntity;
        }
        return null;
    }

    public static boolean hasPhoto(Tweet tweet) {
        boolean bl = TweetMediaUtils.getPhotoEntity(tweet) != null;
        return bl;
    }

    public static boolean hasSupportedVideo(Tweet tweet) {
        boolean bl = (tweet = TweetMediaUtils.getVideoEntity(tweet)) != null && TweetMediaUtils.getSupportedVariant((MediaEntity)tweet) != null;
        return bl;
    }

    public static boolean isLooping(MediaEntity mediaEntity) {
        boolean bl = GIF_TYPE.equals((Object)mediaEntity.type) || VIDEO_TYPE.endsWith(mediaEntity.type) && mediaEntity.videoInfo.durationMillis < 6500L;
        return bl;
    }

    public static boolean isPhotoType(MediaEntity mediaEntity) {
        return PHOTO_TYPE.equals((Object)mediaEntity.type);
    }

    public static boolean isVariantSupported(VideoInfo.Variant variant) {
        if (CONTENT_TYPE_HLS.equals((Object)variant.contentType)) {
            return true;
        }
        return CONTENT_TYPE_MP4.equals((Object)variant.contentType);
    }

    public static boolean isVideoType(MediaEntity mediaEntity) {
        boolean bl = VIDEO_TYPE.equals((Object)mediaEntity.type) || GIF_TYPE.equals((Object)mediaEntity.type);
        return bl;
    }

    public static boolean showVideoControls(MediaEntity mediaEntity) {
        return GIF_TYPE.equals((Object)mediaEntity.type) ^ true;
    }
}

