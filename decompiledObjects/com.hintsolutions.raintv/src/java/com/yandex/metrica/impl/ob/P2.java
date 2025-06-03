/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collection
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gi;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.p9;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.Collection;
import java.util.List;

public class p2
implements NetworkResponseHandler {
    @NonNull
    private final Gi a;
    @NonNull
    private final p9 b;

    public p2() {
        this(new Gi(), new p9());
    }

    @VisibleForTesting
    public p2(@NonNull Gi gi2, @NonNull p9 p92) {
        this.a = gi2;
        this.b = p92;
    }

    @Override
    @Nullable
    public Object handle(@NonNull ResponseDataHolder object) {
        List list;
        int n2 = ((ResponseDataHolder)object).getResponseCode();
        Object object2 = list = null;
        if (200 == n2) {
            byte[] byArray = ((ResponseDataHolder)object).getResponseData();
            Object object3 = ((ResponseDataHolder)object).getResponseHeaders();
            object2 = object3 != null ? (List)object3.get((Object)"Content-Encoding") : null;
            object3 = byArray;
            if (!A2.b((Collection)object2)) {
                object3 = byArray;
                if ("encrypted".equals(object2.get(0))) {
                    object3 = this.b.a(((ResponseDataHolder)object).getResponseData(), "hBnBQbZrmjPXEWVJ");
                }
            }
            object2 = list;
            if (object3 != null) {
                object = this.a.a((byte[])object3);
                object2 = list;
                if (Hi.a.b == ((Hi)object).A()) {
                    object2 = object;
                }
            }
        }
        return object2;
    }
}

