/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package R2;

import A2.n;
import E2.e;
import R2.A;
import R2.C;
import R2.C5;
import R2.D;
import R2.D5;
import R2.E;
import R2.I;
import R2.I2;
import R2.K;
import R2.N2;
import R2.N5;
import R2.P1;
import R2.S5;
import R2.T5;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.c2;
import R2.g;
import R2.g5;
import R2.m3;
import R2.p;
import R2.q3;
import R2.z5;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class u4
extends C5 {
    public u4(D5 d52) {
        super(d52);
    }

    private static String c(String string2, String string3) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override
    public final boolean x() {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final byte[] y(I var1_1, String var2_6) {
        block46 : {
            block42 : {
                block41 : {
                    block40 : {
                        this.n();
                        this.a.Q();
                        n.i(var1_1);
                        n.e(var2_6);
                        var4_7 = this.f().B(var2_6, K.f0);
                        var3_8 = 0;
                        if (!var4_7) {
                            this.j().F().b("Generating ScionPayload disabled. packageName", var2_6);
                            return new byte[0];
                        }
                        if (!"_iap".equals((Object)var1_1.o) && !"_iapx".equals((Object)var1_1.o)) {
                            this.j().F().c("Generating a payload for this event is not available. package_name, event_name", var2_6, var1_1.o);
                            return null;
                        }
                        var12_9 = com.google.android.gms.internal.measurement.c2.J();
                        this.q().Q0();
                        var10_10 = this.q().D0(var2_6);
                        if (var10_10 != null) break block40;
                        this.j().F().b("Log and bundle not available. package_name", var2_6);
                        this.q().R0();
                        return new byte[0];
                    }
                    if (var10_10.r()) break block41;
                    this.j().F().b("Log and bundle disabled. package_name", var2_6);
                    this.q().R0();
                    return new byte[0];
                }
                var11_11 = d2.A3().m0(1).O0("android");
                if (!TextUtils.isEmpty((CharSequence)var10_10.t0())) {
                    var11_11.O(var10_10.t0());
                }
                if (!TextUtils.isEmpty((CharSequence)var10_10.v0())) {
                    var11_11.a0((String)n.i(var10_10.v0()));
                }
                if (!TextUtils.isEmpty((CharSequence)var10_10.h())) {
                    var11_11.g0((String)n.i(var10_10.h()));
                }
                if (var10_10.z() != Integer.MIN_VALUE) {
                    var11_11.d0((int)var10_10.z());
                }
                var11_11.j0(var10_10.g0()).Y(var10_10.c0());
                var9_12 = var10_10.j();
                var13_13 = var10_10.r0();
                if (!TextUtils.isEmpty((CharSequence)var9_12)) {
                    var11_11.I0((String)var9_12);
                } else if (!TextUtils.isEmpty((CharSequence)var13_13)) {
                    var11_11.I((String)var13_13);
                }
                var11_11.y0(var10_10.p0());
                var9_12 = this.b.Q(var2_6);
                var11_11.S(var10_10.a0());
                if (this.a.p() && this.f().K(var11_11.S0()) && var9_12.x() && !TextUtils.isEmpty((CharSequence)null)) {
                    var11_11.z0(null);
                }
                var11_11.o0(var9_12.v());
                if (!var9_12.x() || !var10_10.q()) break block42;
                var13_13 = this.s().z(var10_10.t0(), (q3)var9_12);
                if (!var10_10.q() || var13_13 == null || (var4_7 = TextUtils.isEmpty((CharSequence)((CharSequence)var13_13.first)))) break block42;
                try {
                    var11_11.Q0(u4.c((String)var13_13.first, Long.toString((long)var1_1.r)));
                    var13_13 = var13_13.second;
                    ** if (var13_13 == null) goto lbl-1000
                }
                catch (SecurityException var1_3) {
                    this.j().F().b("Resettable device id encryption failed", var1_3.getMessage());
                    this.q().R0();
                    return new byte[0];
                }
lbl-1000: // 1 sources:
                {
                    var11_11.V((Boolean)var13_13);
                }
lbl-1000: // 2 sources:
                {
                }
            }
            try {
                block44 : {
                    block43 : {
                        this.g().o();
                        var13_13 = var11_11.w0(Build.MODEL);
                        this.g().o();
                        var13_13.M0(Build.VERSION.RELEASE).u0((int)this.g().v()).T0(this.g().w());
                        try {
                            if (!var9_12.y() || var10_10.u0() == null) break block43;
                            var11_11.U(u4.c((String)n.i(var10_10.u0()), Long.toString((long)var1_1.r)));
                        }
                        catch (SecurityException var1_4) {
                            break block44;
                        }
                    }
                    if (!TextUtils.isEmpty((CharSequence)var10_10.i())) {
                        var11_11.G0((String)n.i(var10_10.i()));
                    }
                    var14_14 = var10_10.t0();
                    var13_13 = this.q().M0((String)var14_14);
                    var15_15 = var13_13.iterator();
                    while (var15_15.hasNext()) {
                        var9_12 = (T5)var15_15.next();
                        if (!"_lte".equals((Object)var9_12.c)) continue;
                        break block45;
                    }
                    break block47;
                }
                this.j().F().b("app instance id encryption failed", var1_4.getMessage());
            }
            catch (Throwable var1_2) {}
            {
                block45 : {
                    block47 : {
                        this.q().R0();
                        return new byte[0];
                    }
                    var9_12 = null;
                }
                if (var9_12 == null || var9_12.e == null) {
                    var9_12 = new T5((String)var14_14, "auto", "_lte", this.b().a(), 0L);
                    var13_13.add(var9_12);
                    this.q().d0((T5)var9_12);
                }
                var9_12 = new h2[var13_13.size()];
                break block46;
            }
            this.q().R0();
            throw var1_2;
        }
        while (var3_8 < var13_13.size()) {
            var14_14 = h2.X().z(((T5)var13_13.get((int)var3_8)).c).B(((T5)var13_13.get((int)var3_8)).d);
            this.o().U((h2.a)var14_14, ((T5)var13_13.get((int)var3_8)).e);
            var9_12[var3_8] = (h2)((Y3)var14_14.p());
            ++var3_8;
        }
        {
            var11_11.f0((Iterable)Arrays.asList((Object[])var9_12));
            this.o().T(var11_11);
            if (n6.a() && this.f().s(K.T0)) {
                this.b.s(var10_10, var11_11);
            }
            var9_12 = c2.b((I)var1_1);
            this.k().Q(var9_12.d, this.q().B0(var2_6));
            this.k().K((c2)var9_12, this.f().y(var2_6));
            var13_13 = var9_12.d;
            var13_13.putLong("_c", 1L);
            this.j().F().a("Marking in-app purchase as real-time");
            var13_13.putLong("_r", 1L);
            var13_13.putString("_o", var1_1.q);
            if (this.k().F0(var11_11.S0())) {
                this.k().R((Bundle)var13_13, "_dbg", 1L);
                this.k().R((Bundle)var13_13, "_r", 1L);
            }
            if ((var9_12 = this.q().C0(var2_6, var1_1.o)) == null) {
                var9_12 = new E(var2_6, var1_1.o, 0L, 0L, var1_1.r, 0L, null, null, null, null);
                var5_16 = 0L;
            } else {
                var5_16 = var9_12.f;
                var9_12 = var9_12.a(var1_1.r);
            }
            this.q().T((E)var9_12);
            var13_13 = new A(this.a, var1_1.q, var2_6, var1_1.o, var1_1.r, var5_16, (Bundle)var13_13);
            var14_14 = com.google.android.gms.internal.measurement.Y1.Z().G(var13_13.d).E(var13_13.b).A(var13_13.e);
            for (Object var17_18 : var13_13.f) {
                var16_17 = com.google.android.gms.internal.measurement.a2.Z().B((String)var17_18);
                if ((var17_18 = var13_13.f.k((String)var17_18)) == null) continue;
                this.o().S(var16_17, var17_18);
                var14_14.B(var16_17);
            }
            var11_11.D((Y1.a)var14_14).E(e2.G().w(Z1.G().w(var9_12.c).x(var1_1.o)));
            var11_11.H((Iterable)this.p().z(var10_10.t0(), Collections.emptyList(), var11_11.Z0(), var14_14.I(), var14_14.I()));
            if (var14_14.M()) {
                var11_11.v0(var14_14.I()).e0(var14_14.I());
            }
            if ((var3_8 = (int)(var5_16 = var10_10.i0() LCMP 0L)) != 0) {
                var11_11.n0(var5_16);
            }
            if ((var7_19 = var10_10.m0()) != 0L) {
                var11_11.r0(var7_19);
            } else if (var3_8 != 0) {
                var11_11.r0(var5_16);
            }
            var1_1 = var10_10.m();
            if (s7.a() && this.f().B(var2_6, K.y0) && var1_1 != null) {
                var11_11.R0((String)var1_1);
            }
            var10_10.p();
            var11_11.i0((int)var10_10.k0()).F0(82001L).C0(this.b().a()).b0(true);
            if (this.f().s(K.C0)) {
                this.b.E(var11_11.S0(), var11_11);
            }
            var12_9.x(var11_11);
            var10_10.j0(var11_11.W());
            var10_10.f0(var11_11.Q());
            this.q().U(var10_10);
            this.q().T0();
        }
        this.q().R0();
        try {
            return this.o().g0(((com.google.android.gms.internal.measurement.c2)((Y3)var12_9.p())).h());
        }
        catch (IOException var1_5) {
            this.j().G().c("Data loss. Failed to bundle and serialize. appId", Y1.v(var2_6), (Object)var1_5);
            return null;
        }
    }
}

