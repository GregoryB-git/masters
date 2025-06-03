/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.hintsolutions.raintv.interfaces;

import com.hintsolutions.raintv.services.video.SavedVideoHolder;

public interface OnSavedVideosListItemClickListener {
    public void onClicked(SavedVideoHolder var1);

    public void onRemoveClicked(SavedVideoHolder var1);
}

