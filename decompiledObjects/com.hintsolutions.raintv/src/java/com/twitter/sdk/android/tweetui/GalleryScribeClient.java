/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.ScribeItem;

public interface GalleryScribeClient {
    public void dismiss();

    public void impression(ScribeItem var1);

    public void navigate();

    public void show();
}

