/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Zc
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Ag;
import com.yandex.metrica.impl.ob.Zc;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;

public class Cg
implements IParamsAppender {
    @NonNull
    private final Ag a;
    @NonNull
    private final NetworkTaskForSendingDataParamsAppender b;
    private long c;

    @VisibleForTesting
    public Cg(@NonNull Ag ag, @NonNull NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.a = ag;
        this.b = networkTaskForSendingDataParamsAppender;
    }

    public Cg(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new Ag(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public void a(long l3) {
        this.c = l3;
    }

    @Override
    public void appendParams(@NonNull Uri.Builder builder, @NonNull Object object) {
        Zc zc = (Zc)object;
        this.b.appendEncryptedData(builder);
        object = this.b;
        zc.getClass();
        ((NetworkTaskForSendingDataParamsAppender)object).appendCommitHash(builder, "e44a8b69c7d76049d312caec6fb8a01b60982d8f", zc.j());
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", zc.g());
        builder.appendQueryParameter("device_type", zc.i());
        builder.appendQueryParameter("uuid", zc.w());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.2.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45002146");
        builder.appendQueryParameter("analytics_sdk_build_type", zc.j());
        builder.appendQueryParameter("app_version_name", zc.f());
        builder.appendQueryParameter("app_build_number", zc.b());
        builder.appendQueryParameter("os_version", zc.o());
        builder.appendQueryParameter("os_api_level", String.valueOf((int)zc.n()));
        builder.appendQueryParameter("is_rooted", zc.h());
        builder.appendQueryParameter("app_framework", zc.c());
        builder.appendQueryParameter("app_id", zc.p());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("request_id", String.valueOf((long)this.c));
        builder.appendQueryParameter("app_set_id", zc.d());
        builder.appendQueryParameter("app_set_id_scope", zc.e());
        this.a.a(builder, zc.a());
    }
}

