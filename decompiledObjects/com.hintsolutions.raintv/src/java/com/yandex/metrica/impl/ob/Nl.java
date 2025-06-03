/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.metrica.impl.ob.uk
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.Hk;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.ck;
import com.yandex.metrica.impl.ob.il;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.ok;
import com.yandex.metrica.impl.ob.ol;
import com.yandex.metrica.impl.ob.uk;
import java.lang.ref.WeakReference;
import java.util.List;

class nl
implements Runnable {
    public final WeakReference a;
    public final List b;
    public final Sk c;
    public final jl d;
    public final ok e;
    public final boolean f;
    public final ol g;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public nl(ol ol2, WeakReference weakReference, List list, Sk sk, jl jl2, ok ok2, boolean bl) {
        this.g = ol2;
        this.a = weakReference;
        this.b = list;
        this.c = sk;
        this.d = jl2;
        this.e = ok2;
        this.f = bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void run() {
        block6: {
            var6_1 = (Activity)this.a.get();
            if (var6_1 == null) {
                return;
            }
            var7_2 = ol.b(this.g);
            var8_3 = this.b;
            var5_4 /* !! */  = ol.a(this.g);
            var4_6 = this.c;
            var7_2.getClass();
            var7_2 = var8_3.iterator();
            while (var7_2.hasNext()) {
                if (!((il)var7_2.next()).a((Sk)var4_6)) continue;
                ** GOTO lbl17
            }
            var5_4 /* !! */  = var5_4 /* !! */ .iterator();
            while (var5_4 /* !! */ .hasNext()) {
                if (!((il)var5_4 /* !! */ .next()).a((Sk)var4_6)) continue;
lbl17:
                // 2 sources

                var1_7 = true;
                break block6;
            }
            var1_7 = false;
        }
        var4_6 = var1_7 != false ? new Hk() : new ck();
        var2_8 = ol.c(this.g).a();
        ol.a(this.g, var6_1, var2_8);
        try {
            var5_4 /* !! */  = ol.d(this.g).a(var6_1, this.d, this.e.c(), (uk)var4_6, this.f);
        }
        catch (Throwable var5_5) {
            ol.a(this.g, this.b, var5_5, this.d);
            var5_4 /* !! */  = null;
        }
        if (var5_4 /* !! */  != null) {
            ol.a(this.g, this.b, (Qk)var5_4 /* !! */ , var4_6.a(), var6_1, this.c, this.e, var2_8);
        }
    }
}

