/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import java.util.Map;

public interface DeferredDeeplinkParametersListener {
    public void onError(@NonNull Error var1, @NonNull String var2);

    public void onParametersLoaded(@NonNull Map<String, String> var1);

    public static enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink parameters can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain valid deferred deeplink parameters."),
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

