/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.kl
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Ik;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.Rk;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.Yj;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.il;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.kl;
import com.yandex.metrica.impl.ob.mk;
import com.yandex.metrica.impl.ob.nl;
import com.yandex.metrica.impl.ob.ok;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ol {
    @Nullable
    private Runnable a;
    @NonNull
    private final ICommonExecutor b;
    @NonNull
    private final Yj c;
    @NonNull
    private final Rk d;
    @NonNull
    private final mk e;
    @NonNull
    private final a f;
    @NonNull
    private final List<kl> g = new ArrayList();
    @NonNull
    private final List<Ik> h;
    @NonNull
    private final ok.a i;

    public ol(@NonNull ICommonExecutor iCommonExecutor, @NonNull Yj yj, @NonNull mk mk2) {
        this(iCommonExecutor, yj, mk2, new Rk(), new a(), (List<Ik>)Collections.emptyList(), new ok.a());
    }

    @VisibleForTesting
    public ol(@NonNull ICommonExecutor iCommonExecutor, @NonNull Yj yj, @NonNull mk mk2, @NonNull Rk rk2, @NonNull a a2, @NonNull List<Ik> list, @NonNull ok.a a3) {
        this.b = iCommonExecutor;
        this.c = yj;
        this.e = mk2;
        this.d = rk2;
        this.f = a2;
        this.h = list;
        this.i = a3;
    }

    public static /* synthetic */ List a(ol ol2) {
        return ol2.g;
    }

    public static void a(ol ol2, Activity activity, long l5) {
        ol2 = ol2.g.iterator();
        while (ol2.hasNext()) {
            ((kl)ol2.next()).a(activity, l5);
        }
    }

    public static void a(ol ol2, List list, Qk qk, List list2, Activity activity, Sk sk, ok ok2, long l5) {
        ol2.getClass();
        list = list.iterator();
        while (list.hasNext()) {
            ((il)list.next()).a(l5, activity, qk, (List<el>)list2, sk, ok2);
        }
        ol2 = ol2.g.iterator();
        while (ol2.hasNext()) {
            ((il)ol2.next()).a(l5, activity, qk, (List<el>)list2, sk, ok2);
        }
    }

    public static void a(ol ol2, List list, Throwable throwable, jl jl2) {
        ol2.getClass();
        list = list.iterator();
        while (list.hasNext()) {
            ((il)list.next()).a(throwable, jl2);
        }
        ol2 = ol2.g.iterator();
        while (ol2.hasNext()) {
            ((il)ol2.next()).a(throwable, jl2);
        }
    }

    public static /* synthetic */ a b(ol ol2) {
        return ol2.f;
    }

    public static /* synthetic */ Yj c(ol ol2) {
        return ol2.c;
    }

    public static /* synthetic */ Rk d(ol ol2) {
        return ol2.d;
    }

    public void a(@NonNull Activity activity, long l5, @NonNull Sk object, @NonNull jl jl2, @NonNull List<il> list) {
        boolean bl;
        Object object2;
        block3: {
            object2 = this.h.iterator();
            while (object2.hasNext()) {
                if (!((Ik)object2.next()).a(activity, jl2)) continue;
                bl = true;
                break block3;
            }
            bl = false;
        }
        WeakReference weakReference = new WeakReference((Object)activity);
        ok.a a2 = this.i;
        object2 = this.e;
        a2.getClass();
        object = new nl(this, weakReference, list, (Sk)object, jl2, new ok((mk)object2, (Sk)object), bl);
        jl2 = this.a;
        if (jl2 != null) {
            this.b.remove((Runnable)jl2);
        }
        this.a = object;
        jl2 = this.g.iterator();
        while (jl2.hasNext()) {
            ((kl)jl2.next()).a(activity, bl);
        }
        this.b.executeDelayed((Runnable)object, l5);
    }

    public void a(kl ... klArray) {
        this.g.addAll((Collection)Arrays.asList((Object[])klArray));
    }

    @VisibleForTesting
    public static class a {
    }
}

