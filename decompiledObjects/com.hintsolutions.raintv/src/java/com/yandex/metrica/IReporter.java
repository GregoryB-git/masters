/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.ecommerce.ECommerceEvent
 *  com.yandex.metrica.plugins.IPluginReporter
 *  com.yandex.metrica.profile.UserProfile
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public interface IReporter {
    @NonNull
    public IPluginReporter getPluginExtension();

    public void pauseSession();

    public void reportAdRevenue(@NonNull AdRevenue var1);

    public void reportECommerce(@NonNull ECommerceEvent var1);

    public void reportError(@NonNull String var1, @Nullable String var2);

    public void reportError(@NonNull String var1, @Nullable String var2, @Nullable Throwable var3);

    public void reportError(@NonNull String var1, @Nullable Throwable var2);

    public void reportEvent(@NonNull String var1);

    public void reportEvent(@NonNull String var1, @Nullable String var2);

    public void reportEvent(@NonNull String var1, @Nullable Map<String, Object> var2);

    public void reportRevenue(@NonNull Revenue var1);

    public void reportUnhandledException(@NonNull Throwable var1);

    public void reportUserProfile(@NonNull UserProfile var1);

    public void resumeSession();

    public void sendEventsBuffer();

    public void setStatisticsSending(boolean var1);

    public void setUserProfileID(@Nullable String var1);
}

