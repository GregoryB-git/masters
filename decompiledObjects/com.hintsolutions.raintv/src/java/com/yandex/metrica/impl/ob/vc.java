/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.google.protobuf.nano.ym.MessageNano
 *  com.yandex.metrica.impl.ob.Zc
 *  com.yandex.metrica.impl.ob.hf
 *  com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Cg;
import com.yandex.metrica.impl.ob.Dl;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.V7;
import com.yandex.metrica.impl.ob.Wc;
import com.yandex.metrica.impl.ob.Xc;
import com.yandex.metrica.impl.ob.Zc;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.hf;
import com.yandex.metrica.impl.ob.s2;
import com.yandex.metrica.impl.ob.yc;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;

public class Vc
implements UnderlyingNetworkTask {
    @NonNull
    private final s2 a;
    @NonNull
    private final fc b;
    @NonNull
    private final V7 c;
    @NonNull
    private final Xc d;
    @NonNull
    private final yc e;
    @NonNull
    private final Cg f;
    @NonNull
    private final FullUrlFormer g;
    @NonNull
    private final ConfigProvider h;
    @NonNull
    private final RequestDataHolder i;
    @NonNull
    private final ResponseDataHolder j;
    @NonNull
    private final SendingDataTaskHelper k;
    private long l;
    private Wc m;

    public Vc(@NonNull Context context, @NonNull s2 s22, @NonNull yc yc2, @NonNull Cg cg, @NonNull ConfigProvider configProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull FullUrlFormer fullUrlFormer, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(s22, yc2, F0.g().w().a(), cg, new Xc(context), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider, new SendingDataTaskHelper(requestBodyEncrypter, new Dl(), requestDataHolder, responseDataHolder, (NetworkResponseHandler)new DefaultNetworkResponseHandler()));
    }

    @VisibleForTesting
    public Vc(@NonNull s2 s22, @NonNull yc yc2, @NonNull V7 v7, @NonNull Cg cg, @NonNull Xc xc, @NonNull FullUrlFormer fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider configProvider, @NonNull SendingDataTaskHelper sendingDataTaskHelper) {
        this.k = sendingDataTaskHelper;
        this.a = s22;
        this.e = yc2;
        this.h = configProvider;
        s22 = (Zc)configProvider.getConfig();
        this.b = s22.z();
        this.c = v7;
        this.d = xc;
        this.f = cg;
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.g = fullUrlFormer;
        this.b();
        fullUrlFormer.setHosts(s22.A());
    }

    private boolean a() {
        Wc wc2;
        this.m = wc2 = this.d.a(this.b.d);
        wc2 = wc2.c;
        int n3 = ((hf)wc2).b.length;
        boolean bl = false;
        if ((n3 = n3 == 0 && ((hf)wc2).a.length == 0 ? 1 : 0) == 0) {
            bl = this.k.prepareAndSetPostData(MessageNano.toByteArray((MessageNano)wc2));
        }
        return bl;
    }

    private void b() {
        long l4;
        this.l = l4 = this.c.f() + 1L;
        this.f.a(l4);
    }

    @Override
    @NonNull
    public String description() {
        return "LocationTask";
    }

    @Override
    @NonNull
    public FullUrlFormer getFullUrlFormer() {
        return this.g;
    }

    @Override
    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.i;
    }

    @Override
    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.j;
    }

    @Override
    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((Zc)this.h.getConfig()).q();
    }

    @Override
    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    @Override
    public boolean onCreateTask() {
        Zc zc2 = (Zc)this.h.getConfig();
        if (this.a.d()) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)zc2.g())) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)zc2.w())) {
            return false;
        }
        if (A2.b((Collection)this.g.getAllHosts())) {
            return false;
        }
        return this.a();
    }

    @Override
    public void onPerformRequest() {
        this.k.onPerformRequest();
    }

    @Override
    public void onPostRequestComplete(boolean bl) {
        if (bl || A2.b(this.j.getResponseCode())) {
            this.d.a(this.m);
        }
        this.c.c(this.l);
    }

    @Override
    public boolean onRequestComplete() {
        return this.k.isResponseValid();
    }

    @Override
    public void onRequestError(@Nullable Throwable throwable) {
        this.c.c(this.l);
    }

    @Override
    public void onShouldNotExecute() {
    }

    @Override
    public void onSuccessfulTaskFinished() {
        this.e.a();
    }

    @Override
    public void onTaskAdded() {
    }

    @Override
    public void onTaskFinished() {
    }

    @Override
    public void onTaskRemoved() {
    }

    @Override
    public void onUnsuccessfulTaskFinished() {
    }
}

