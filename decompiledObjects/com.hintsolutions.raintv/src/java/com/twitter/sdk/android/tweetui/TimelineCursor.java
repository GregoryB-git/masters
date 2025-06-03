/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Identifiable;
import java.util.List;

public class TimelineCursor {
    public final Long maxPosition;
    public final Long minPosition;

    public TimelineCursor(Long l, Long l2) {
        this.minPosition = l;
        this.maxPosition = l2;
    }

    public TimelineCursor(List<? extends Identifiable> list) {
        int n = list.size();
        Long l = null;
        Long l2 = n > 0 ? Long.valueOf((long)((Identifiable)list.get(list.size() - 1)).getId()) : null;
        this.minPosition = l2;
        l2 = l;
        if (list.size() > 0) {
            l2 = ((Identifiable)list.get(0)).getId();
        }
        this.maxPosition = l2;
    }
}

