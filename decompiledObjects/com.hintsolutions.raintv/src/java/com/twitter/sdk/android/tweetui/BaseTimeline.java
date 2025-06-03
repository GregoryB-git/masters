/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.tweetui;

abstract class BaseTimeline {
    public static Long decrementMaxId(Long object) {
        object = object == null ? null : Long.valueOf((long)(object - 1L));
        return object;
    }

    public abstract String getTimelineType();
}

