/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.impl.ob.c3;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c
implements l {
    private boolean a;
    @NonNull
    private final n b;
    @NonNull
    private final Map<String, a> c = new HashMap();

    public c(@NonNull n n2) {
        n2 = (c3)n2;
        for (a a2 : ((c3)n2).a()) {
            this.c.put((Object)a2.b, (Object)a2);
        }
        this.a = ((c3)n2).b();
        this.b = n2;
    }

    @Override
    @Nullable
    public a a(@NonNull String string) {
        return (a)this.c.get((Object)string);
    }

    @Override
    @WorkerThread
    public void a(@NonNull Map<String, a> arrayList2) {
        for (ArrayList arrayList2 : arrayList2.values()) {
            this.c.put((Object)arrayList2.b, arrayList2);
        }
        Object object = this.b;
        arrayList2 = new ArrayList(this.c.values());
        boolean bl2 = this.a;
        ((c3)object).a((List<a>)arrayList2, bl2);
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public void b() {
        if (!this.a) {
            this.a = true;
            n n2 = this.b;
            ArrayList arrayList = new ArrayList(this.c.values());
            boolean bl2 = this.a;
            ((c3)n2).a((List<a>)arrayList, bl2);
        }
    }
}

