/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Nk
 *  com.yandex.metrica.impl.ob.Ok
 *  com.yandex.metrica.impl.ob.Pk
 *  com.yandex.metrica.impl.ob.fk
 *  com.yandex.metrica.impl.ob.uk
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Ek;
import com.yandex.metrica.impl.ob.Nk;
import com.yandex.metrica.impl.ob.Ok;
import com.yandex.metrica.impl.ob.Pk;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.dk;
import com.yandex.metrica.impl.ob.ek;
import com.yandex.metrica.impl.ob.fk;
import com.yandex.metrica.impl.ob.fl;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.ll;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.impl.ob.sl;
import com.yandex.metrica.impl.ob.uk;
import com.yandex.metrica.impl.ob.ul;
import com.yandex.metrica.impl.ob.zk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class gl {
    @NonNull
    private final b a;
    @NonNull
    private final a b;

    public gl() {
        this(new b(), new a());
    }

    @VisibleForTesting
    public gl(@NonNull b b2, @NonNull a a2) {
        this.a = b2;
        this.b = a2;
    }

    @NonNull
    public Qk a(@NonNull Activity object, @NonNull uk uk2, @NonNull jl jl2, @NonNull nk object2, @NonNull ll ll2, @NonNull fl fl2) {
        Qk qk = new Qk();
        try {
            object = (ViewGroup)object.findViewById(0x1020002);
        }
        catch (Throwable throwable) {
            ll2.a("ui_parsing_root", throwable);
            object = null;
        }
        if (object != null) {
            this.a.getClass();
            object2 = new Ek(jl2, new sl(ll2), new fk(jl2.c), (nk)object2, (List<Pk>)Collections.singletonList((Object)new zk()), (List<dk>)Arrays.asList((Object[])new dk[]{new Nk(jl2.b)}), ll2, fl2, new ul());
            qk.a((Ek)object2, (View)object, uk2);
            if (jl2.e) {
                this.b.getClass();
                object = new ek(((Ek)object2).a());
                uk2 = ((Ek)object2).b().iterator();
                while (uk2.hasNext()) {
                    ((ek)object).a((Ok)uk2.next());
                }
            }
        }
        return qk;
    }

    public static class a {
    }

    public static class b {
    }
}

