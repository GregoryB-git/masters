/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 */
package com.twitter.sdk.android.tweetui.internal;

import android.view.View;

public interface HighlightedClickableSpan {
    public boolean isSelected();

    public void onClick(View var1);

    public void select(boolean var1);
}

