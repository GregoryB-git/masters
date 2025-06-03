/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.support.v4.media.MediaMetadataCompat
 *  android.support.v4.media.MediaMetadataCompat$Builder
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.hintsolutions.raintv.utils.MediaUtils$1
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.Audio
 *  ru.tvrain.core.data.AutoVideo
 *  ru.tvrain.core.data.IVideo
 *  ru.tvrain.core.data.Live
 *  ru.tvrain.core.data.Stream
 *  ru.tvrain.core.data.Video
 *  ru.tvrain.core.utils.ListUtils
 */
package com.hintsolutions.raintv.utils;

import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.utils.MediaUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Audio;
import ru.tvrain.core.data.AutoVideo;
import ru.tvrain.core.data.IVideo;
import ru.tvrain.core.data.Live;
import ru.tvrain.core.data.Stream;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.utils.ListUtils;

public class MediaUtils {
    public static final String CUSTOM_METADATA_ARTICLE = "article";
    public static final String CUSTOM_METADATA_AUDIO = "audio";
    public static final String CUSTOM_METADATA_SAVED_VIDEO = "saved_video";
    public static final String CUSTOM_METADATA_STREAM_URL = "custom_stream_url";
    public static final String CUSTOM_METADATA_VIDEO = "video";
    private static Gson gson = new Gson();

    public static MediaMetadataCompat buildMediaMetadataForArticle(SavedVideoHolder savedVideoHolder) {
        String string2;
        if (savedVideoHolder != null && (string2 = savedVideoHolder.filePath) != null && !TextUtils.isEmpty((CharSequence)string2)) {
            return new MediaMetadataCompat.Builder().putString("android.media.metadata.MEDIA_ID", String.valueOf((Object)savedVideoHolder.id)).putString(CUSTOM_METADATA_STREAM_URL, savedVideoHolder.filePath).putString("android.media.metadata.ARTIST", "\u0414\u043e\u0436\u0434\u044c").putLong("android.media.metadata.DURATION", savedVideoHolder.getDuration() * 1000L).putString("android.media.metadata.ALBUM_ART_URI", savedVideoHolder.preview).putString("android.media.metadata.TITLE", savedVideoHolder.name).putLong("android.media.metadata.TRACK_NUMBER", 1L).putLong("android.media.metadata.NUM_TRACKS", 1L).putString(CUSTOM_METADATA_SAVED_VIDEO, gson.toJson((Object)savedVideoHolder)).build();
        }
        return null;
    }

    public static MediaMetadataCompat buildMediaMetadataForArticle(Article article, Audio audio, IVideo iVideo) {
        if (audio != null && !TextUtils.isEmpty((CharSequence)audio.audio)) {
            return new MediaMetadataCompat.Builder().putString("android.media.metadata.MEDIA_ID", String.valueOf((int)article.id)).putString(CUSTOM_METADATA_STREAM_URL, audio.audio).putString("android.media.metadata.ARTIST", "\u0414\u043e\u0436\u0434\u044c").putLong("android.media.metadata.DURATION", Long.parseLong((String)audio.duration)).putString("android.media.metadata.ALBUM_ART_URI", article.getAnyImage()).putString("android.media.metadata.TITLE", audio.name).putLong("android.media.metadata.TRACK_NUMBER", 1L).putLong("android.media.metadata.NUM_TRACKS", 1L).putString(CUSTOM_METADATA_ARTICLE, gson.toJson((Object)article)).putString(CUSTOM_METADATA_AUDIO, gson.toJson((Object)audio)).putString(CUSTOM_METADATA_VIDEO, gson.toJson((Object)iVideo)).build();
        }
        return null;
    }

    public static MediaMetadataCompat buildMediaMetadataForLive(Live live) {
        if (live != null && !ListUtils.isEmptyList((List)live.HLSAUDIO) && !TextUtils.isEmpty((CharSequence)((Stream)live.HLSAUDIO.get((int)0)).url)) {
            return new MediaMetadataCompat.Builder().putString("android.media.metadata.MEDIA_ID", "live").putString(CUSTOM_METADATA_STREAM_URL, ((Stream)live.HLSAUDIO.get((int)0)).url).putString("android.media.metadata.ARTIST", "\u0414\u043e\u0436\u0434\u044c").putString("android.media.metadata.TITLE", "\u041f\u0440\u044f\u043c\u043e\u0439 \u044d\u0444\u0438\u0440").putLong("android.media.metadata.TRACK_NUMBER", 1L).putLong("android.media.metadata.NUM_TRACKS", 1L).build();
        }
        return null;
    }

    public static MediaMetadataCompat buildMetadataFromJsonStr(String string2) {
        Map map2 = (Map)gson.fromJson(string2, new 1().getType());
        string2 = new MediaMetadataCompat.Builder();
        for (Map map2 : map2.entrySet()) {
            Object object = map2.getValue();
            if (object instanceof String) {
                string2.putString((String)map2.getKey(), (String)map2.getValue());
                continue;
            }
            if (!(object instanceof Double) && !(object instanceof Long)) continue;
            string2.putLong((String)map2.getKey(), ((Double)map2.getValue()).longValue());
        }
        return string2.build();
    }

    public static String buildMetadataJsonForLive(Live live) {
        if (live != null && !ListUtils.isEmptyList((List)live.HLSAUDIO) && !TextUtils.isEmpty((CharSequence)((Stream)live.HLSAUDIO.get((int)0)).url)) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"android.media.metadata.MEDIA_ID", (Object)"live");
            hashMap.put((Object)CUSTOM_METADATA_STREAM_URL, (Object)((Stream)live.HLSAUDIO.get((int)0)).url);
            hashMap.put((Object)"android.media.metadata.ARTIST", (Object)"\u0414\u043e\u0436\u0434\u044c");
            hashMap.put((Object)"android.media.metadata.TITLE", (Object)"\u041f\u0440\u044f\u043c\u043e\u0439 \u044d\u0444\u0438\u0440");
            hashMap.put((Object)"android.media.metadata.TRACK_NUMBER", (Object)1);
            hashMap.put((Object)"android.media.metadata.NUM_TRACKS", (Object)1);
            return gson.toJson((Object)hashMap);
        }
        return null;
    }

    public static String buildMetadataJsonFromArticle(SavedVideoHolder savedVideoHolder) {
        if (savedVideoHolder == null) {
            return null;
        }
        String string2 = savedVideoHolder.filePath;
        boolean bl = false;
        boolean bl2 = string2 == null || TextUtils.isEmpty((CharSequence)string2);
        string2 = savedVideoHolder.url;
        if (string2 == null || TextUtils.isEmpty((CharSequence)string2)) {
            bl = true;
        }
        if (bl2 && bl) {
            return null;
        }
        string2 = new HashMap();
        string2.put((Object)"android.media.metadata.MEDIA_ID", (Object)String.valueOf((Object)savedVideoHolder.id));
        if (bl) {
            string2.put((Object)CUSTOM_METADATA_STREAM_URL, (Object)savedVideoHolder.filePath);
        } else {
            string2.put((Object)CUSTOM_METADATA_STREAM_URL, (Object)savedVideoHolder.url);
        }
        string2.put((Object)"android.media.metadata.ARTIST", (Object)"\u0414\u043e\u0436\u0434\u044c");
        string2.put((Object)"android.media.metadata.DURATION", (Object)(savedVideoHolder.getDuration() * 1000L));
        string2.put((Object)"android.media.metadata.ALBUM_ART_URI", (Object)savedVideoHolder.preview);
        string2.put((Object)"android.media.metadata.TITLE", (Object)savedVideoHolder.name);
        string2.put((Object)"android.media.metadata.TRACK_NUMBER", (Object)1);
        string2.put((Object)"android.media.metadata.NUM_TRACKS", (Object)1);
        string2.put((Object)CUSTOM_METADATA_SAVED_VIDEO, (Object)gson.toJson((Object)savedVideoHolder));
        return gson.toJson((Object)string2);
    }

    public static String buildMetadataJsonFromArticle(Article article, Audio audio, IVideo iVideo) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"android.media.metadata.MEDIA_ID", (Object)String.valueOf((int)article.id));
        hashMap.put((Object)CUSTOM_METADATA_STREAM_URL, (Object)audio.audio);
        hashMap.put((Object)"android.media.metadata.ARTIST", (Object)"\u0414\u043e\u0436\u0434\u044c");
        hashMap.put((Object)"android.media.metadata.DURATION", (Object)Long.parseLong((String)audio.duration));
        hashMap.put((Object)"android.media.metadata.ALBUM_ART_URI", (Object)article.getAnyImage());
        hashMap.put((Object)"android.media.metadata.TITLE", (Object)audio.name);
        Integer n = 1;
        hashMap.put((Object)"android.media.metadata.TRACK_NUMBER", (Object)n);
        hashMap.put((Object)"android.media.metadata.NUM_TRACKS", (Object)n);
        hashMap.put((Object)CUSTOM_METADATA_ARTICLE, (Object)gson.toJson((Object)article));
        hashMap.put((Object)CUSTOM_METADATA_AUDIO, (Object)gson.toJson((Object)audio));
        hashMap.put((Object)CUSTOM_METADATA_VIDEO, (Object)gson.toJson((Object)iVideo));
        return gson.toJson((Object)hashMap);
    }

    public static Article getArticleFromMetadata(MediaMetadataCompat mediaMetadataCompat) {
        try {
            mediaMetadataCompat = (Article)gson.fromJson(mediaMetadataCompat.getString(CUSTOM_METADATA_ARTICLE), Article.class);
            return mediaMetadataCompat;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Audio getAudioFromMetadata(MediaMetadataCompat mediaMetadataCompat) {
        try {
            mediaMetadataCompat = (Audio)gson.fromJson(mediaMetadataCompat.getString(CUSTOM_METADATA_AUDIO), Audio.class);
            return mediaMetadataCompat;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static SavedVideoHolder getSavedVideoHolderFromMetadata(MediaMetadataCompat object) {
        try {
            object = (SavedVideoHolder)gson.fromJson(object.getString(CUSTOM_METADATA_SAVED_VIDEO), SavedVideoHolder.class);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static IVideo getVideoFromMetadata(MediaMetadataCompat mediaMetadataCompat) {
        String string2 = mediaMetadataCompat.getString(CUSTOM_METADATA_VIDEO);
        try {
            string2 = (IVideo)gson.fromJson(string2, AutoVideo.class);
            return string2;
        }
        catch (Exception exception) {
            try {
                mediaMetadataCompat = (IVideo)gson.fromJson(mediaMetadataCompat.getString(CUSTOM_METADATA_VIDEO), Video.class);
                return mediaMetadataCompat;
            }
            catch (Exception exception2) {
                return null;
            }
        }
    }

    public static boolean isLive(MediaMetadataCompat mediaMetadataCompat) {
        boolean bl = mediaMetadataCompat == null || mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID").equals((Object)"live");
        return bl;
    }

    public static boolean isSameIds(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        try {
            boolean bl = mediaMetadataCompat.getString("android.media.metadata.MEDIA_ID").equalsIgnoreCase(mediaMetadataCompat2.getString("android.media.metadata.MEDIA_ID"));
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean isSavedVideo(MediaMetadataCompat mediaMetadataCompat) {
        boolean bl = mediaMetadataCompat == null || MediaUtils.getSavedVideoHolderFromMetadata(mediaMetadataCompat) != null;
        return bl;
    }
}

