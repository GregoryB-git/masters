/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.util.LinkedList
 *  java.util.List
 */
package com.yandex.metrica.profile;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.profile.UserProfileUpdate;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {
    @NonNull
    private final List<UserProfileUpdate<? extends Te>> a;

    private UserProfile(@NonNull List<UserProfileUpdate<? extends Te>> list) {
        this.a = A2.c(list);
    }

    public /* synthetic */ UserProfile(List list, a a2) {
        this((List<UserProfileUpdate<? extends Te>>)list);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public List<UserProfileUpdate<? extends Te>> getUserProfileUpdates() {
        return this.a;
    }

    public static class Builder {
        private final LinkedList<UserProfileUpdate<? extends Te>> a = new LinkedList();

        public Builder apply(@NonNull UserProfileUpdate<? extends Te> userProfileUpdate) {
            this.a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile((List)this.a, null);
        }
    }
}

