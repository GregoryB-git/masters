/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  com.google.android.gms.common.GooglePlayServicesNotAvailableException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.yandex.metrica.identifiers.impl.f;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.i;
import com.yandex.metrica.identifiers.impl.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class k
implements i {
    @Override
    @NotNull
    public g a(@NotNull Context object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"context");
        try {
            AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo((Context)object);
            Intrinsics.checkNotNullExpressionValue((Object)info, (String)"AdvertisingIdClient.getAdvertisingIdInfo(context)");
            l l4 = l.b;
            f f2 = new f("google", info.getId(), info.isLimitAdTrackingEnabled());
            object = new g(l4, f2, null, 4);
        }
        catch (Throwable throwable) {
            l l5 = l.d;
            StringBuilder stringBuilder = z2.t("exception while fetching google adv_id: ");
            stringBuilder.append(throwable.getMessage());
            object = new g(l5, null, stringBuilder.toString(), 2);
        }
        catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
            object = new g(l.c, null, "could not resolve google services", 2);
        }
        return object;
    }
}

