/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface DeferredDeeplinkListener {
    public void onDeeplinkLoaded(@NonNull String var1);

    public void onError(@NonNull Error var1, @Nullable String var2);

    public static enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");

        private final String mDescription;

        private Error(String string3) {
            this.mDescription = string3;
        }

        public String getDescription() {
            return this.mDescription;
        }
    }
}

