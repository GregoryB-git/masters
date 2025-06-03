/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.p2;
import com.yandex.metrica.impl.ob.zg;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public class q2
implements UnderlyingNetworkTask {
    @NonNull
    private final ei a;
    @Nullable
    private Hi b;
    private Th c;
    @NonNull
    private final RequestDataHolder d;
    @NonNull
    private final ConfigProvider e;
    @NonNull
    private final ResponseDataHolder f;
    @NonNull
    private final FullUrlFormer g;
    @NonNull
    private final NetworkResponseHandler h;

    @VisibleForTesting
    public q2(@NonNull ei ei2, @NonNull p2 p22, @NonNull FullUrlFormer fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider configProvider) {
        this.a = ei2;
        this.h = p22;
        this.d = requestDataHolder;
        this.f = responseDataHolder;
        this.e = configProvider;
        this.g = fullUrlFormer;
        fullUrlFormer.setHosts(((zg)configProvider.getConfig()).I());
    }

    public q2(@NonNull ei ei2, @NonNull FullUrlFormer fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider configProvider) {
        this(ei2, new p2(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override
    @NonNull
    public String description() {
        StringBuilder stringBuilder = z2.t("Startup task for component: ");
        stringBuilder.append(this.a.a().toString());
        return stringBuilder.toString();
    }

    @Override
    @NonNull
    public FullUrlFormer getFullUrlFormer() {
        return this.g;
    }

    @Override
    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.d;
    }

    @Override
    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f;
    }

    @Override
    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((zg)this.e.getConfig()).q();
    }

    @Override
    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    @Override
    public boolean onCreateTask() {
        this.d.setHeader("Accept-Encoding", "encrypted");
        return this.a.e();
    }

    @Override
    public void onPerformRequest() {
    }

    @Override
    public void onPostRequestComplete(boolean bl2) {
        if (!bl2) {
            this.c = Th.d;
        }
    }

    @Override
    public boolean onRequestComplete() {
        Hi hi2;
        this.b = hi2 = (Hi)this.h.handle(this.f);
        boolean bl2 = hi2 != null;
        return bl2;
    }

    @Override
    public void onRequestError(@Nullable Throwable throwable) {
        this.c = Th.c;
    }

    @Override
    public void onShouldNotExecute() {
        this.c = Th.c;
    }

    @Override
    public void onSuccessfulTaskFinished() {
        if (this.b != null && this.f.getResponseHeaders() != null) {
            this.a.a(this.b, (zg)this.e.getConfig(), (Map<String, List<String>>)this.f.getResponseHeaders());
        }
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
        if (this.c == null) {
            this.c = Th.b;
        }
        this.a.a(this.c);
    }
}

