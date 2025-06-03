/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.C
 *  com.yandex.metrica.impl.ob.J2
 *  com.yandex.metrica.impl.ob.j6
 *  com.yandex.metrica.impl.ob.w
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C;
import com.yandex.metrica.impl.ob.J2;
import com.yandex.metrica.impl.ob.j6;
import com.yandex.metrica.impl.ob.k6;
import com.yandex.metrica.impl.ob.l2;
import com.yandex.metrica.impl.ob.l6;
import com.yandex.metrica.impl.ob.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f1 {
    @NonNull
    private final j6 a;
    @NonNull
    private final J2 b;
    @NonNull
    private final C c;
    @NonNull
    private final w d;
    @NonNull
    private final List<l2> e;

    public f1(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        Object object = A2.a(21) ? new k6(context) : new l6();
        this((j6)object, new J2(context, iCommonExecutor), new C(context, iCommonExecutor), new w());
    }

    @VisibleForTesting
    public f1(@NonNull j6 j62, @NonNull J2 j22, @NonNull C c3, @NonNull w w2) {
        ArrayList arrayList;
        this.e = arrayList = new ArrayList();
        this.a = j62;
        arrayList.add((Object)j62);
        this.b = j22;
        arrayList.add((Object)j22);
        this.c = c3;
        arrayList.add((Object)c3);
        this.d = w2;
        arrayList.add((Object)w2);
    }

    @NonNull
    public w a() {
        return this.d;
    }

    public void a(@NonNull l2 l22) {
        f1 f12 = this;
        synchronized (f12) {
            this.e.add((Object)l22);
            return;
        }
    }

    @NonNull
    public C b() {
        return this.c;
    }

    @NonNull
    public j6 c() {
        return this.a;
    }

    @NonNull
    public J2 d() {
        return this.b;
    }

    public void e() {
        f1 f12 = this;
        synchronized (f12) {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((l2)iterator.next()).a();
            }
            return;
        }
    }

    public void f() {
        f1 f12 = this;
        synchronized (f12) {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((l2)iterator.next()).b();
            }
            return;
        }
    }
}

