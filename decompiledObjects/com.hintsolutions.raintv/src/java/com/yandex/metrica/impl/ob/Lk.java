/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Ak
 *  com.yandex.metrica.impl.ob.Mk
 *  com.yandex.metrica.impl.ob.Wj
 *  com.yandex.metrica.impl.ob.bk
 *  com.yandex.metrica.impl.ob.gk
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Ak;
import com.yandex.metrica.impl.ob.Mk;
import com.yandex.metrica.impl.ob.Wj;
import com.yandex.metrica.impl.ob.bk;
import com.yandex.metrica.impl.ob.gk;
import com.yandex.metrica.impl.ob.ik;
import com.yandex.metrica.impl.ob.ml;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

abstract class lk<T> {
    @NonNull
    private List<Object> a;
    @NonNull
    private final ik b;

    public lk(@Nullable T t2, @NonNull ik ik2) {
        this.a = this.c(t2);
        this.b = ik2;
    }

    @NonNull
    private List<Object> c(@Nullable T object) {
        ArrayList arrayList = new ArrayList();
        if (object == null) {
            return arrayList;
        }
        int n4 = this.b(object);
        object = this.a(object);
        arrayList.add((Object)new Mk(n4));
        for (Object object2 : object) {
            n4 = ((ml)object2).a.ordinal();
            object = null;
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 == 3) {
                            object2 = ((ml)object2).b;
                            try {
                                object2 = Pattern.compile((String)object2);
                            }
                            catch (Throwable throwable) {
                                object2 = null;
                            }
                            if (object2 != null) {
                                object = new bk((Pattern)object2);
                            }
                        }
                    } else {
                        object2 = ((ml)object2).b;
                        try {
                            object2 = Pattern.compile((String)object2);
                        }
                        catch (Throwable throwable) {
                            object2 = null;
                        }
                        if (object2 != null) {
                            object = new Ak((Pattern)object2);
                        }
                    }
                } else {
                    object = new Wj(((ml)object2).b);
                }
            } else {
                object = new gk(((ml)object2).b);
            }
            if (object == null) continue;
            arrayList.add(object);
        }
        return A2.c(arrayList);
    }

    @NonNull
    public ik a() {
        return this.b;
    }

    public abstract List<ml> a(@NonNull T var1);

    public abstract int b(@NonNull T var1);

    @NonNull
    public List<Object> b() {
        return this.a;
    }

    public void d(@Nullable T t2) {
        this.b.a();
        this.a = this.c(t2);
    }
}

