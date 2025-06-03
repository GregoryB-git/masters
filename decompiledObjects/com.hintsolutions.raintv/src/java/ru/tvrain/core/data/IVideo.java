/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import android.net.Uri;
import ru.tvrain.core.data.Quality;

public interface IVideo {
    public String getTruncName();

    public Uri getUri(Quality var1);

    public String getVideoDuration();

    public int getVideoId();

    public String getVideoName();

    public long getVideoPosition();

    public boolean hasVideoStreams();
}

