/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.concurrent.TimeUnit
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.comparisons.ComparisonsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.math.MathKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.Ml;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.Zm;
import com.yandex.metrica.impl.ob.an;
import com.yandex.metrica.impl.ob.bh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class ng {
    private final Ml<Tf.a, Integer> a;
    private final long b;
    private final String c;
    private final String d;
    private final Context e;
    private final Zm f;
    private final M0 g;

    public ng(@NotNull Context object, @NotNull Zm zm2, @NotNull M0 m02) {
        this.e = object;
        this.f = zm2;
        this.g = m02;
        object = new Ml(0);
        ((Ml)object).a(Tf.a.d, 1);
        ((Ml)object).a(Tf.a.c, 2);
        this.a = object;
        this.b = TimeUnit.DAYS.toSeconds(1L);
        this.c = "com.android.vending";
        this.d = "com.huawei.appmarket";
    }

    public /* synthetic */ ng(Context context, Zm zm2, M0 m02, int n4) {
        m02 = null;
        zm2 = (n4 & 2) != 0 ? new Zm() : null;
        if ((n4 & 4) != 0) {
            m02 = bh.a();
            Intrinsics.checkNotNullExpressionValue((Object)m02, (String)"YandexMetricaSelfReportFacade.getReporter()");
        }
        this(context, zm2, m02);
    }

    private final JSONObject a(List<Tf> object, Tf tf, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.e(object));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add((Object)this.c((Tf)object.next()));
        }
        tf = jSONObject.put("candidates", (Object)Gl.b(arrayList)).put("chosen", (Object)this.c(tf));
        object = packageInfo != null ? Long.valueOf((long)packageInfo.firstInstallTime) : null;
        object = tf.putOpt("install_time", object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"JSONObject()\n           \u2026geInfo?.firstInstallTime)");
        return object;
    }

    private final JSONObject c(Tf tf) {
        tf = new JSONObject().put("referrer", (Object)tf.a).put("install_timestamp_seconds", tf.c).put("click_timestamp_seconds", tf.b).put("source", (Object)tf.d.a);
        Intrinsics.checkNotNullExpressionValue((Object)tf, (String)"JSONObject()\n           \u2026eferrerInfo.source.value)");
        return tf;
    }

    @Nullable
    public final Tf a(@NotNull List<Tf> list) {
        Object object;
        boolean bl = list.isEmpty();
        Comparator<Tf> comparator = null;
        if (bl) {
            return null;
        }
        if (list.size() == 1) {
            return (Tf)list.get(0);
        }
        Comparator<Tf> comparator2 = this.f;
        Object object2 = this.e;
        PackageInfo packageInfo = comparator2.b(object2, object2.getPackageName(), 0);
        comparator2 = comparator;
        if (packageInfo != null) {
            long l5 = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            object = new Comparator<T>(){

                public final int compare(T t2, T t3) {
                    return ComparisonsKt.compareValues((Comparable)((Comparable)((Pair)t2).getSecond()), (Comparable)((Comparable)((Pair)t3).getSecond()));
                }
            };
            Iterator iterator = list.iterator();
            if (iterator.hasNext()) {
                comparator2 = (Tf)iterator.next();
                object2 = TuplesKt.to((Object)comparator2, (Object)Math.abs((long)(comparator2.c - l5)));
                while (iterator.hasNext()) {
                    comparator2 = (Tf)iterator.next();
                    if (object.compare(object2, (Object)(comparator2 = TuplesKt.to(comparator2, (Object)Math.abs((long)(comparator2.c - l5))))) <= 0) continue;
                    object2 = comparator2;
                }
                object = (Tf)object2.component1();
                comparator2 = comparator;
                if (((Number)object2.component2()).longValue() < this.b) {
                    comparator2 = object;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        object2 = comparator2;
        if (comparator2 == null) {
            comparator = new Comparator<Tf>(this){
                public final ng a;
                {
                    this.a = ng2;
                }

                public final int a(Tf tf, Tf tf2) {
                    int n4;
                    int n5 = n4 = MathKt.getSign((long)(tf.c - tf2.c));
                    if (n4 == 0) {
                        n5 = ((Number)this.a.a.a(tf.d)).intValue();
                        tf = this.a.a.a(tf2.d);
                        Intrinsics.checkNotNullExpressionValue((Object)tf, (String)"sourcePriorities[second.source]");
                        n5 -= ((Number)tf).intValue();
                    }
                    return n5;
                }
            };
            object = list.iterator();
            if (object.hasNext()) {
                comparator2 = (Tf)object.next();
                while (object.hasNext()) {
                    object2 = (Tf)object.next();
                    if (comparator.compare((Object)comparator2, object2) >= 0) continue;
                    comparator2 = object2;
                }
                object2 = comparator2;
            } else {
                throw new NoSuchElementException();
            }
        }
        this.g.reportEvent("several_filled_referrers", this.a(list, (Tf)object2, packageInfo).toString());
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(@Nullable Tf tf) {
        int n4;
        boolean bl = false;
        if (tf == null) {
            return false;
        }
        Object object = this.f;
        Context context = this.e;
        String string = context.getPackageName();
        object.getClass();
        object = null;
        try {
            context = context.getPackageManager();
            if (A2.a(30)) {
                string = an.a((PackageManager)context, string);
                object = string;
            } else {
                string = context.getInstallerPackageName(string);
                object = string;
            }
        }
        catch (Throwable throwable) {}
        if ((n4 = tf.d.ordinal()) == 1) {
            return Intrinsics.areEqual((Object)this.c, (Object)object);
        }
        if (n4 == 2) return Intrinsics.areEqual((Object)this.d, (Object)object);
        return bl;
    }

    public final boolean b(@Nullable Tf object) {
        boolean bl = (object = object != null ? ((Tf)object).a : null) == null || object.length() == 0;
        return bl ^ true;
    }
}

