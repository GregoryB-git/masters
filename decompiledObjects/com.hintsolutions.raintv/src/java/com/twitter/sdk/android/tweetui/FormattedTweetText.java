/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.tweetui.FormattedMediaEntity
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.tweetui.FormattedMediaEntity;
import com.twitter.sdk.android.tweetui.FormattedUrlEntity;
import java.util.ArrayList;
import java.util.List;

class FormattedTweetText {
    public final List<FormattedUrlEntity> hashtagEntities;
    public final List<FormattedMediaEntity> mediaEntities;
    public final List<FormattedUrlEntity> mentionEntities;
    public final List<FormattedUrlEntity> symbolEntities;
    public String text;
    public final List<FormattedUrlEntity> urlEntities = new ArrayList();

    public FormattedTweetText() {
        this.mediaEntities = new ArrayList();
        this.hashtagEntities = new ArrayList();
        this.mentionEntities = new ArrayList();
        this.symbolEntities = new ArrayList();
    }
}

