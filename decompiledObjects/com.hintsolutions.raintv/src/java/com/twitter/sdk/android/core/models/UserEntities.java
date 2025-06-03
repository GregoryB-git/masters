/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.twitter.sdk.android.core.models.UrlEntity
 *  java.lang.Object
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.List;

public class UserEntities {
    @SerializedName(value="description")
    public final UrlEntities description;
    @SerializedName(value="url")
    public final UrlEntities url;

    public UserEntities(UrlEntities urlEntities, UrlEntities urlEntities2) {
        this.url = urlEntities;
        this.description = urlEntities2;
    }

    public static class UrlEntities {
        @SerializedName(value="urls")
        public final List<UrlEntity> urls;

        private UrlEntities() {
            this(null);
        }

        public UrlEntities(List<UrlEntity> list) {
            this.urls = ModelUtils.getSafeList(list);
        }
    }
}

