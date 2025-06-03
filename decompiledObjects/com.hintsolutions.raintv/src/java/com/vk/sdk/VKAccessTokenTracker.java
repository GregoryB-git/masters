/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.vk.sdk;

import androidx.annotation.Nullable;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

public abstract class VKAccessTokenTracker {
    private boolean isTracking = false;

    public boolean isTracking() {
        return this.isTracking;
    }

    public abstract void onVKAccessTokenChanged(@Nullable VKAccessToken var1, @Nullable VKAccessToken var2);

    public void startTracking() {
        VKSdk.addVKTokenTracker(this);
        this.isTracking = true;
    }

    public void stopTracking() {
        VKSdk.removeVKTokenTracker(this);
        this.isTracking = false;
    }
}

