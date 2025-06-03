/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.H1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class g1 {
    private static volatile g1 c;
    private static final Object d;
    @NonNull
    private List<String> a;
    @NonNull
    private final List<a> b = new ArrayList();

    static {
        d = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @VisibleForTesting
    public g1(Context context) {
        g1 g12 = this;
        synchronized (g12) {
            this.a = this.a(context.getResources().getConfiguration());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g1 a(@NonNull Context context) {
        Object object;
        if (c != null) return c;
        Object object2 = object = d;
        synchronized (object2) {
            g1 g12;
            if (c != null) return c;
            c = g12 = new g1(context.getApplicationContext());
            return c;
        }
    }

    private List<String> a(@NonNull Configuration configuration) {
        if (A2.a(24)) {
            ArrayList arrayList = new ArrayList();
            if ((configuration = configuration.getLocales()) != null) {
                Intrinsics.checkNotNullExpressionValue((Object)configuration, (String)"configuration.locales ?: return result");
                int n4 = configuration.size();
                for (int i3 = 0; i3 < n4; ++i3) {
                    Object object = configuration.get(i3);
                    if (object == null) continue;
                    object = H1.a(object);
                    Intrinsics.checkNotNullExpressionValue((Object)object, (String)"PhoneUtils.normalizedLocale(it)");
                    arrayList.add(object);
                }
            }
            return arrayList;
        }
        return Collections.singletonList((Object)H1.a(configuration.locale));
    }

    @NonNull
    public List<String> a() {
        return this.a;
    }

    public void a(@NonNull a a2) {
        g1 g12 = this;
        synchronized (g12) {
            this.b.add((Object)a2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@NonNull Configuration configuration) {
        g1 g12 = this;
        synchronized (g12) {
            this.a = this.a(configuration);
            configuration = new ArrayList(this.b);
        }
        configuration = configuration.iterator();
        while (configuration.hasNext()) {
            ((a)configuration.next()).a();
        }
        return;
    }

    public static interface a {
        public void a();
    }
}

