/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  com.google.android.exoplayer2.offline.DownloadAction
 *  com.google.android.exoplayer2.offline.DownloadService
 *  com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction
 *  com.google.gson.Gson
 *  com.hintsolutions.raintv.services.video.AutoVideoDownloadService
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  ru.tvrain.core.utils.ListUtils
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.services.video;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction;
import com.google.gson.Gson;
import com.hintsolutions.raintv.services.video.AutoVideoDownloadService;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.tvrain.core.utils.ListUtils;
import tvrain.managers.PrefsManager;

public class SavedVideos {
    public static final String PROPERTY_LIST = "saved_videos";
    public static final String PROPERTY_MIGRATION_COMPLETE = "migration_complete";
    public List<SavedVideoHolder> videos;

    public SavedVideos(List<SavedVideoHolder> list) {
        this.videos = list;
    }

    public SavedVideos(PrefsManager prefsManager) {
        this.videos = SavedVideos.getSavedVideos(prefsManager);
    }

    public static List<SavedVideoHolder> getSavedVideos(PrefsManager list) {
        if ((list = (SavedVideos)list.getObject(PROPERTY_LIST, SavedVideos.class)) != null && (list = list.videos) != null) {
            return list;
        }
        return new ArrayList();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void removeSavedVideo(Activity var0, PrefsManager var1_3, SavedVideoHolder var2_4) {
        var6_5 = (SavedVideos)var1_3.getObject("saved_videos", SavedVideos.class);
        if (var6_5 == null || ListUtils.isEmptyList(var6_5.videos)) ** GOTO lbl20
        var7_6 = var6_5.videos.iterator();
        ** while (var5_9 = var7_6.hasNext())
lbl-1000:
        // 1 sources

        {
            try {
                var8_10 = (SavedVideoHolder)var7_6.next();
                var9_12 = var2_4.filePath;
                var4_8 = true;
                var3_7 = var9_12 != null && (var10_13 = var8_10.filePath) != null && var9_12.equals((Object)var10_13) != false;
                if (var2_4.filePath != null || var8_10.filePath != null || !var2_4.id.equals((Object)var8_10.id)) {
                    var4_8 = false;
                }
                if (!var3_7 && !var4_8) continue;
                var7_6.remove();
            }
            catch (Exception var8_11) {
                var8_11.printStackTrace();
                continue;
lbl20:
                // 2 sources

                if ((var7_6 = var2_4.filePath) == null) ** GOTO lbl30
                try {
                    var0 = new File(var2_4.filePath);
                    var0.delete();
                }
                catch (Exception var0_1) {
                    try {
                        block10: {
                            var0_1.printStackTrace();
                            break block10;
lbl30:
                            // 1 sources

                            DownloadService.startWithAction((Context)var0, AutoVideoDownloadService.class, (DownloadAction)HlsDownloadAction.createRemoveAction((Uri)Uri.parse((String)var2_4.url), null), (boolean)false);
                        }
                        var0 = new Gson();
                        var1_3.putString("saved_videos", var0.toJson((Object)var6_5));
                        return;
                    }
                    catch (Exception var0_2) {
                        var0_2.printStackTrace();
                        return;
lbl38:
                        // 1 sources

                        ** GOTO lbl20
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setVideoPosition(PrefsManager prefsManager, SavedVideoHolder savedVideoHolder, long l) {
        try {
            SavedVideos savedVideos = (SavedVideos)prefsManager.getObject(PROPERTY_LIST, SavedVideos.class);
            if (savedVideos != null && !ListUtils.isEmptyList(savedVideos.videos)) {
                for (SavedVideoHolder savedVideoHolder2 : savedVideos.videos) {
                    if (!savedVideoHolder2.id.equals((Object)savedVideoHolder.id)) continue;
                    savedVideoHolder2.setPosition(l);
                }
            }
            savedVideoHolder = new Gson();
            prefsManager.putString(PROPERTY_LIST, savedVideoHolder.toJson(savedVideos));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean isExists(String string2) {
        Iterator iterator = this.videos;
        if (iterator != null && iterator.size() != 0) {
            for (SavedVideoHolder savedVideoHolder : this.videos) {
                if (savedVideoHolder.filePath != null || !savedVideoHolder.id.equals((Object)string2)) continue;
                return true;
            }
        }
        return false;
    }
}

