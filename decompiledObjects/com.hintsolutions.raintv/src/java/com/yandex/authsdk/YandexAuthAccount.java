/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.authsdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class YandexAuthAccount {
    @Nullable
    private final String avatarUrl;
    private final boolean isAvatarEmpty;
    @NonNull
    private final String primaryDisplayName;
    @Nullable
    private final String secondaryDisplayName;
    private final long uid;

    public YandexAuthAccount(long l2, @NonNull String string2, @Nullable String string3, boolean bl, @Nullable String string4) {
        this.uid = l2;
        this.primaryDisplayName = string2;
        this.secondaryDisplayName = string3;
        this.isAvatarEmpty = bl;
        this.avatarUrl = string4;
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (YandexAuthAccount)object;
            if (this.uid != ((YandexAuthAccount)object).uid) {
                return false;
            }
            if (this.isAvatarEmpty != ((YandexAuthAccount)object).isAvatarEmpty) {
                return false;
            }
            if (!this.primaryDisplayName.equals((Object)((YandexAuthAccount)object).primaryDisplayName)) {
                return false;
            }
            String string2 = this.secondaryDisplayName;
            if (string2 != null ? !string2.equals((Object)((YandexAuthAccount)object).secondaryDisplayName) : ((YandexAuthAccount)object).secondaryDisplayName != null) {
                return false;
            }
            string2 = this.avatarUrl;
            object = ((YandexAuthAccount)object).avatarUrl;
            if (string2 != null) {
                bl = string2.equals(object);
            } else if (object != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Nullable
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NonNull
    public String getPrimaryDisplayName() {
        return this.primaryDisplayName;
    }

    @Nullable
    public String getSecondaryDisplayName() {
        return this.secondaryDisplayName;
    }

    public long getUid() {
        return this.uid;
    }

    public int hashCode() {
        long l2 = this.uid;
        int n = (int)(l2 ^ l2 >>> 32);
        int n3 = z2.c(this.primaryDisplayName, n * 31, 31);
        String string2 = this.secondaryDisplayName;
        int n4 = 0;
        n = string2 != null ? string2.hashCode() : 0;
        int n5 = this.isAvatarEmpty;
        string2 = this.avatarUrl;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return ((n3 + n) * 31 + n5) * 31 + n4;
    }

    public boolean isAvatarEmpty() {
        return this.isAvatarEmpty;
    }
}

