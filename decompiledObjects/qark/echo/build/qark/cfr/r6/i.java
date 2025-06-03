/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceArray
 */
package r6;

import X5.g;
import g6.l;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import p6.P0;
import r6.b;
import r6.c;
import r6.h;
import r6.o;
import u6.C;
import u6.F;
import u6.x;

public final class i
extends C {
    public final b s;
    public final AtomicReferenceArray t;

    public i(long l8, i i8, b b8, int n8) {
        super(l8, i8, n8);
        this.s = b8;
        this.t = new AtomicReferenceArray(c.b * 2);
    }

    public final void A(int n8, Object object) {
        this.t.set(n8 * 2 + 1, object);
    }

    public final void B(int n8, Object object) {
        this.z(n8, object);
    }

    @Override
    public int n() {
        return c.b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void o(int var1_1, Throwable var2_2, g var3_3) {
        var6_4 = c.b;
        var4_5 = var1_1 >= var6_4;
        var5_6 = var1_1;
        if (var4_5) {
            var5_6 = var1_1 - var6_4;
        }
        var7_7 = this.v(var5_6);
        do lbl-1000: // 3 sources:
        {
            block4 : {
                block5 : {
                    if ((var8_8 = this.w(var5_6)) instanceof P0 || var8_8 instanceof o) break block4;
                    if (var8_8 == c.j() || var8_8 == c.i()) break block5;
                    if (var8_8 == c.p() || var8_8 == c.q()) ** GOTO lbl-1000
                    if (var8_8 == c.f()) return;
                    if (var8_8 == c.d) {
                        return;
                    }
                    if (var8_8 == c.z()) {
                        return;
                    }
                    var2_2 = new StringBuilder();
                    var2_2.append("unexpected state: ");
                    var2_2.append(var8_8);
                    throw new IllegalStateException(var2_2.toString().toString());
                }
                this.s(var5_6);
                if (var4_5 == false) return;
                var2_2 = this.u().c;
                if (var2_2 == null) return;
                x.b((l)var2_2, var7_7, var3_3);
                return;
            }
            var2_2 = var4_5 != false ? c.j() : c.i();
        } while (!this.r(var5_6, var8_8, var2_2));
        this.s(var5_6);
        this.x(var5_6, var4_5 ^ true);
        if (var4_5 == false) return;
        var2_2 = this.u().c;
        if (var2_2 == null) return;
        x.b((l)var2_2, var7_7, var3_3);
    }

    public final boolean r(int n8, Object object, Object object2) {
        return h.a(this.t, n8 * 2 + 1, object, object2);
    }

    public final void s(int n8) {
        this.z(n8, null);
    }

    public final Object t(int n8, Object object) {
        return this.t.getAndSet(n8 * 2 + 1, object);
    }

    public final b u() {
        b b8 = this.s;
        Intrinsics.b(b8);
        return b8;
    }

    public final Object v(int n8) {
        return this.t.get(n8 * 2);
    }

    public final Object w(int n8) {
        return this.t.get(n8 * 2 + 1);
    }

    public final void x(int n8, boolean bl) {
        if (bl) {
            this.u().x0(this.q * (long)c.b + (long)n8);
        }
        this.p();
    }

    public final Object y(int n8) {
        Object object = this.v(n8);
        this.s(n8);
        return object;
    }

    public final void z(int n8, Object object) {
        this.t.lazySet(n8 * 2, object);
    }
}

