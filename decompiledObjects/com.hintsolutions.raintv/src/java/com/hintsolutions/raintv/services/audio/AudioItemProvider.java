/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.support.v4.media.MediaMetadataCompat
 *  java.lang.Object
 */
package com.hintsolutions.raintv.services.audio;

import android.support.v4.media.MediaMetadataCompat;

public class AudioItemProvider {
    private static MediaMetadataCompat currentItem;

    public static MediaMetadataCompat getCurrentItem() {
        return currentItem;
    }

    public static void setCurrentItem(MediaMetadataCompat mediaMetadataCompat) {
        currentItem = mediaMetadataCompat;
    }
}

