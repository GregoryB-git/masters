/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.Y1;
import com.yandex.metrica.impl.ob.b2;
import com.yandex.metrica.impl.ob.e0;
import com.yandex.metrica.impl.ob.h2;
import com.yandex.metrica.impl.ob.r2;
import com.yandex.metrica.impl.ob.s0;
import com.yandex.metrica.impl.ob.t0;
import com.yandex.metrica.impl.ob.u0;
import com.yandex.metrica.impl.ob.v0;
import com.yandex.metrica.impl.ob.z2;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class r0<CANDIDATE, CHOSEN extends v0, STORAGE extends s0<CANDIDATE, CHOSEN>> {
    private final Context a;
    private final ProtobufStateStorage b;
    private final t0<CHOSEN> c;
    private final z2<CANDIDATE, CHOSEN> d;
    private final r2<CANDIDATE, CHOSEN, STORAGE> e;
    private final b2<CHOSEN> f;
    private final Y1 g;
    private final e0 h;
    private STORAGE i;

    public r0(@NotNull Context context, @NotNull ProtobufStateStorage protobufStateStorage, @NotNull t0 t02, @NotNull z2 z22, @NotNull r2 r22, @NotNull b2 b22, @NotNull Y1 y12, @NotNull e0 e02, @NotNull s0 s02, @NotNull String string) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = t02;
        this.d = z22;
        this.e = r22;
        this.f = b22;
        this.g = y12;
        this.h = e02;
        this.i = s02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final CHOSEN c() {
        r0 r02 = this;
        synchronized (r02) {
            v0 v02;
            if (!this.g.a()) {
                v02 = (v0)this.f.invoke();
                this.g.b();
                if (v02 != null) {
                    this.b(v02);
                }
            }
            h2.a("Choosing distribution data: %s", this.i);
            v02 = (v0)this.i.b();
            return (CHOSEN)v02;
        }
    }

    @NotNull
    public final STORAGE a() {
        r0 r02 = this;
        synchronized (r02) {
            STORAGE STORAGE = this.i;
            return STORAGE;
        }
    }

    @NotNull
    public final CHOSEN a(@NotNull CHOSEN CHOSEN) {
        this.h.a(this.a);
        r0 r02 = this;
        synchronized (r02) {
            this.b(CHOSEN);
            CHOSEN = this.c();
            return CHOSEN;
        }
    }

    @NotNull
    public final CHOSEN b() {
        this.h.a(this.a);
        return this.c();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(@NotNull CHOSEN object) {
        r0 r02 = this;
        synchronized (r02) {
            u0 u02 = object.a();
            List list = u0.b;
            boolean bl = false;
            if (u02 == list) {
                return false;
            }
            list = (List)this.d.invoke(this.i.a(), object);
            boolean bl2 = list != null;
            if (list == null) {
                list = this.i.a();
            }
            if (this.c.a(object, this.i.b())) {
                bl = true;
            } else {
                v0 v02 = (v0)this.i.b();
            }
            if (bl || bl2) {
                void var1_3;
                s0 s02 = (s0)this.e.invoke(var1_3, list);
                this.i = s02;
                this.b.save(s02);
            }
            return bl;
        }
    }
}

