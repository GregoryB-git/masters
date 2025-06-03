/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C4;
import com.yandex.metrica.impl.ob.D4;
import com.yandex.metrica.impl.ob.Dl;
import com.yandex.metrica.impl.ob.E4;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.O3;
import com.yandex.metrica.impl.ob.Pm;
import com.yandex.metrica.impl.ob.W7;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.rg;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultResponseParser$Response;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

public class B4
implements UnderlyingNetworkTask {
    @NonNull
    private final ConfigProvider a;
    @NonNull
    private final c0 b;
    @NonNull
    private final E4 c;
    @NonNull
    private final TimeProvider d;
    @NonNull
    private final Dl e;
    @NonNull
    private final String f;
    @NonNull
    private final W7 g;
    @NonNull
    private final FullUrlFormer h;
    @NonNull
    private final RequestDataHolder i;
    @NonNull
    private final ResponseDataHolder j;
    @NonNull
    private final NetworkResponseHandler k;

    public B4(@NonNull ConfigProvider configProvider, @NonNull c0 c02, @NonNull E4 e4, @NonNull W7 w7, @NonNull NetworkResponseHandler networkResponseHandler, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull FullUrlFormer fullUrlFormer) {
        this.a = configProvider;
        this.b = c02;
        this.c = e4;
        this.g = w7;
        this.d = new SystemTimeProvider();
        this.e = new Dl();
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.k = networkResponseHandler;
        this.h = fullUrlFormer;
        configProvider = new StringBuilder();
        configProvider.append(B4.class.getName());
        configProvider.append("@");
        configProvider.append(Integer.toHexString((int)this.hashCode()));
        this.f = configProvider.toString();
    }

    @Override
    @NonNull
    public String description() {
        return this.f;
    }

    @Override
    @NonNull
    public FullUrlFormer getFullUrlFormer() {
        return this.h;
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
        return null;
    }

    @Override
    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean onCreateTask() {
        void var5_10;
        void var4_4;
        D4 d4 = (D4)((Object)this.a.getConfig());
        boolean bl = ((rg)((Object)d4)).x();
        boolean bl2 = A2.b(d4.C());
        if (!bl) return false;
        if (bl2) return false;
        boolean bl3 = true;
        if (!bl3) {
            return false;
        }
        this.h.setHosts(d4.C());
        byte[] byArray = new C4(this.b, d4, this.c, new O3(this.g), new Pm(1024, "diagnostic event name"), new Pm(204800, "diagnostic event value"), new SystemTimeProvider()).a();
        Object var4_2 = null;
        try {
            byte[] byArray2;
            byte[] byArray3 = byArray2 = this.e.compress(byArray);
        }
        catch (Throwable throwable) {}
        if (!A2.a((byte[])var4_4)) {
            this.i.setHeader("Content-Encoding", "gzip");
            void var5_9 = var4_4;
        }
        this.i.setPostData((byte[])var5_10);
        return true;
    }

    @Override
    public void onPerformRequest() {
        this.i.applySendTime(this.d.currentTimeMillis());
    }

    @Override
    public void onPostRequestComplete(boolean bl) {
    }

    @Override
    public boolean onRequestComplete() {
        DefaultResponseParser$Response defaultResponseParser$Response = (DefaultResponseParser$Response)this.k.handle(this.j);
        boolean bl = defaultResponseParser$Response != null && "accepted".equals((Object)defaultResponseParser$Response.mStatus);
        return bl;
    }

    @Override
    public void onRequestError(@Nullable Throwable throwable) {
    }

    @Override
    public void onShouldNotExecute() {
    }

    @Override
    public void onSuccessfulTaskFinished() {
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

