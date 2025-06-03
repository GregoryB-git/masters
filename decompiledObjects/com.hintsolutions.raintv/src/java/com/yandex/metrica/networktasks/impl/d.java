/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.TimeUnit
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package com.yandex.metrica.networktasks.impl;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.NetworkClient$Builder;
import com.yandex.metrica.network.Request$Builder;
import com.yandex.metrica.network.Response;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.NetworkTask$Method;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.impl.a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class d {
    private final void a(Request$Builder request$Builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            request$Builder.addHeader((String)entry.getKey(), CollectionsKt.k((Iterable)((Iterable)entry.getValue()), (String)",", null, null, null, (int)62));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(NetworkTask networkTask) {
        Intrinsics.checkNotNullParameter((Object)networkTask, (String)"task");
        boolean bl = networkTask.onPerformRequest();
        Object object = null;
        if (!bl) {
            networkTask.onRequestError(null);
            return false;
        }
        Object object2 = networkTask.getUrl();
        if (object2 != null && !TextUtils.isEmpty((CharSequence)StringsKt.trim((CharSequence)object2).toString())) {
            int n7;
            object = new Request$Builder((String)object2).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"Request.Builder(url)\n   \u2026erAgent\n                )");
            Object object3 = networkTask.getRequestDataHolder();
            Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"task.requestDataHolder");
            object2 = ((RequestDataHolder)object3).getHeaders();
            Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"requestDataHolder.headers");
            this.a((Request$Builder)object, (Map)object2);
            if (NetworkTask$Method.POST == ((RequestDataHolder)object3).getMethod() && (object2 = (Object)((RequestDataHolder)object3).getPostData()) != null && ((n7 = ((Object)object2).length == 0 ? 1 : 0) ^ 1) == 1) {
                ((Request$Builder)object).post((byte[])object2);
                object2 = ((RequestDataHolder)object3).getSendTimestamp();
                if (object2 != null) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"it");
                    ((Request$Builder)object).addHeader("Send-Timestamp", String.valueOf((long)timeUnit.toSeconds(object2.longValue())));
                }
                if ((object3 = ((RequestDataHolder)object3).getSendTimezoneSec()) != null) {
                    ((Request$Builder)object).addHeader("Send-Timezone", String.valueOf((int)object3.intValue()));
                }
            }
            object3 = new NetworkClient$Builder();
            n7 = a.a;
            object3 = ((NetworkClient$Builder)object3).withConnectTimeout(n7).withReadTimeout(n7).withSslSocketFactory(networkTask.getSslSocketFactory()).build();
            Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"NetworkClient.Builder()\n\u2026\n                .build()");
            object = ((NetworkClient)object3).newCall(((Request$Builder)object).build()).execute();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"client.newCall(requestBuilder.build()).execute()");
            n7 = ((Response)object).getCode();
            object3 = networkTask.getResponseDataHolder();
            Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"task.responseDataHolder");
            ((ResponseDataHolder)object3).setResponseCode(n7);
            ((ResponseDataHolder)object3).setResponseHeaders(((Response)object).getHeaders());
            if (((ResponseDataHolder)object3).isValidResponse()) {
                ((ResponseDataHolder)object3).setResponseData(((Response)object).getResponseData());
            }
            if (((Response)object).isCompleted()) {
                return networkTask.onRequestComplete();
            }
            networkTask.onRequestError(((Response)object).getException());
            return false;
        }
        StringBuilder stringBuilder = z2.t("Task ");
        stringBuilder.append(networkTask.description());
        stringBuilder.append(" url is `");
        stringBuilder.append((String)object2);
        stringBuilder.append("`. ");
        stringBuilder.append("All hosts = ");
        object2 = networkTask.getUnderlyingTask();
        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"task.underlyingTask");
        object2 = object2.getFullUrlFormer();
        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"task.underlyingTask.fullUrlFormer");
        object2 = ((FullUrlFormer)object2).getAllHosts();
        if (object2 != null) {
            object = object2.toString();
        }
        stringBuilder.append((String)object);
        networkTask.onRequestError((Throwable)new IllegalArgumentException(stringBuilder.toString()));
        return false;
    }
}

