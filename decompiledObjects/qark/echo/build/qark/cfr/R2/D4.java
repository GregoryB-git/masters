/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import B2.a;
import D2.b;
import R2.B;
import R2.C;
import R2.C3;
import R2.F4;
import R2.G1;
import R2.G2;
import R2.G4;
import R2.H4;
import R2.I;
import R2.I4;
import R2.J4;
import R2.K;
import R2.K4;
import R2.L4;
import R2.M4;
import R2.N2;
import R2.O4;
import R2.P1;
import R2.P4;
import R2.Q4;
import R2.R1;
import R2.R4;
import R2.R5;
import R2.S1;
import R2.S4;
import R2.S5;
import R2.T4;
import R2.U4;
import R2.V1;
import R2.V4;
import R2.W4;
import R2.W5;
import R2.X1;
import R2.X4;
import R2.Y1;
import R2.Y4;
import R2.a2;
import R2.a5;
import R2.e;
import R2.f;
import R2.f1;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.n;
import R2.o3;
import R2.v4;
import R2.w4;
import R2.w5;
import R2.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class D4
extends f1 {
    public final a5 c;
    public R1 d;
    public volatile Boolean e;
    public final x f;
    public final w5 g;
    public final List h = new ArrayList();
    public final x i;

    public D4(N2 n22) {
        super(n22);
        this.g = new w5(n22.b());
        this.c = new a5(this);
        this.f = new G4(this, n22);
        this.i = new P4(this, n22);
    }

    public static /* synthetic */ void I(D4 d42, ComponentName componentName) {
        d42.n();
        if (d42.d != null) {
            d42.d = null;
            d42.j().K().b("Disconnected from device MeasurementService", (Object)componentName);
            d42.n();
            d42.Y();
        }
    }

    private final void P(Runnable runnable) {
        this.n();
        if (this.c0()) {
            runnable.run();
            return;
        }
        if ((long)this.h.size() >= 1000L) {
            this.j().G().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add((Object)runnable);
        this.i.b(60000L);
        this.Y();
    }

    private final void f0() {
        this.n();
        this.j().K().b("Processing queued up service tasks", this.h.size());
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            }
            catch (RuntimeException runtimeException) {
                this.j().G().b("Task exception while flushing queue", (Object)runtimeException);
            }
        }
        this.h.clear();
        this.i.a();
    }

    private final void g0() {
        this.n();
        this.g.c();
        this.f.b((Long)K.L.a(null));
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean h0() {
        block5 : {
            boolean bl;
            block6 : {
                boolean bl2;
                boolean bl3;
                block18 : {
                    block7 : {
                        String string2;
                        Object object;
                        block15 : {
                            block8 : {
                                block17 : {
                                    block9 : {
                                        block14 : {
                                            block10 : {
                                                String string3;
                                                block16 : {
                                                    block11 : {
                                                        block12 : {
                                                            block13 : {
                                                                this.n();
                                                                this.v();
                                                                if (this.e != null) break block5;
                                                                this.n();
                                                                this.v();
                                                                object = this.i().K();
                                                                bl = true;
                                                                bl3 = true;
                                                                if (object != null && object.booleanValue()) break block6;
                                                                if (this.p().C() == 1) break block7;
                                                                this.j().K().a("Checking service availability");
                                                                int n8 = this.k().u(12451000);
                                                                if (n8 == 0) break block8;
                                                                bl2 = false;
                                                                if (n8 == 1) break block9;
                                                                if (n8 == 2) break block10;
                                                                if (n8 == 3) break block11;
                                                                if (n8 == 9) break block12;
                                                                if (n8 == 18) break block13;
                                                                this.j().L().b("Unexpected service status", n8);
                                                                break block14;
                                                            }
                                                            object = this.j().L();
                                                            string2 = "Service updating";
                                                            break block15;
                                                        }
                                                        object = this.j().L();
                                                        string3 = "Service invalid";
                                                        break block16;
                                                    }
                                                    object = this.j().L();
                                                    string3 = "Service disabled";
                                                }
                                                object.a(string3);
                                                break block14;
                                            }
                                            this.j().F().a("Service container out of date");
                                            if (this.k().G0() < 17443) break block17;
                                            if (object == null) break block18;
                                        }
                                        bl3 = false;
                                        break block18;
                                    }
                                    this.j().K().a("Service missing");
                                }
                                bl2 = true;
                                bl3 = false;
                                break block18;
                            }
                            object = this.j().K();
                            string2 = "Service available";
                        }
                        object.a(string2);
                    }
                    bl2 = true;
                }
                if (!bl3 && this.f().S()) {
                    this.j().G().a("No way to upload. Consider using the full version of Analytics");
                    bl = bl3;
                } else {
                    bl = bl3;
                    if (bl2) {
                        this.i().w(bl3);
                        bl = bl3;
                    }
                }
            }
            this.e = bl;
        }
        return this.e;
    }

    public static /* synthetic */ void k0(D4 d42) {
        d42.f0();
    }

    public static /* synthetic */ void l0(D4 d42) {
        d42.n();
        if (d42.c0()) {
            d42.j().K().a("Inactivity, disconnecting from the service");
            d42.Z();
        }
    }

    public static /* synthetic */ void m0(D4 d42) {
        d42.g0();
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final void C(e e8) {
        A2.n.i(e8);
        this.n();
        this.v();
        boolean bl = this.q().E(e8);
        e e9 = new e(e8);
        this.P(new W4(this, true, this.j0(true), bl, e9, e8));
    }

    public final void D(I i8, String string2) {
        A2.n.i(i8);
        this.n();
        this.v();
        boolean bl = this.q().F(i8);
        this.P(new T4(this, true, this.j0(true), bl, i8, string2));
    }

    public final void E(R1 r12) {
        this.n();
        A2.n.i(r12);
        this.d = r12;
        this.g0();
        this.f0();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void F(R1 var1_1, a var2_2, W5 var3_3) {
        this.n();
        this.v();
        var4_4 = 100;
        var5_5 = 0;
        while (var5_5 < 1001) {
            if (var4_4 != 100) return;
            var11_14 = new ArrayList();
            var8_8 = this.q().C(100);
            if (var8_8 != null) {
                var11_14.addAll((Collection)var8_8);
                var4_4 = var8_8.size();
            } else {
                var4_4 = 0;
            }
            if (var2_2 != null && var4_4 < 100) {
                var11_14.add((Object)var2_2);
            }
            var7_7 = var11_14.size();
            var6_6 = 0;
            while (var6_6 < var7_7) {
                block13 : {
                    var8_8 = var11_14.get(var6_6);
                    ++var6_6;
                    if (!((var8_8 = (a)var8_8) instanceof I)) ** GOTO lbl29
                    try {
                        var1_1.R0((I)var8_8, var3_3);
                    }
                    catch (RemoteException var8_9) {
                        block12 : {
                            var9_12 = this.j().G();
                            var10_13 = "Failed to send event to the service";
                            break block12;
lbl29: // 1 sources:
                            if (var8_8 instanceof R5) {
                                try {
                                    var1_1.Z((R5)var8_8, var3_3);
                                    continue;
                                }
                                catch (RemoteException var8_10) {
                                    var9_12 = this.j().G();
                                    var10_13 = "Failed to send user property to the service";
                                    break block12;
                                }
                            }
                            if (!(var8_8 instanceof e)) break block13;
                            try {
                                var1_1.m0((e)var8_8, var3_3);
                                continue;
                            }
                            catch (RemoteException var8_11) {
                                var9_12 = this.j().G();
                                var10_13 = "Failed to send conditional user property to the service";
                            }
                        }
                        var9_12.b(var10_13, var8_8);
                    }
                    continue;
                }
                this.j().G().a("Discarding data. Unrecognized parcel type.");
            }
            ++var5_5;
        }
    }

    public final void G(w4 w42) {
        this.n();
        this.v();
        this.P(new M4(this, w42));
    }

    public final void J(R5 r52) {
        this.n();
        this.v();
        boolean bl = this.q().G(r52);
        this.P(new J4(this, this.j0(true), bl, r52));
    }

    public final void K(Bundle bundle) {
        this.n();
        this.v();
        this.P(new Q4(this, this.j0(false), bundle));
    }

    public final void L(y0 y02) {
        this.n();
        this.v();
        this.P(new K4(this, this.j0(false), y02));
    }

    public final void M(y0 y02, I i8, String string2) {
        this.n();
        this.v();
        if (this.k().u(12451000) != 0) {
            this.j().L().a("Not bundling data. Service unavailable or out of date");
            this.k().Y(y02, new byte[0]);
            return;
        }
        this.P(new S4(this, i8, string2, y02));
    }

    public final void N(y0 y02, String string2, String string3) {
        this.n();
        this.v();
        this.P(new Y4(this, string2, string3, this.j0(false), y02));
    }

    public final void O(y0 y02, String string2, String string3, boolean bl) {
        this.n();
        this.v();
        this.P(new F4(this, string2, string3, this.j0(false), bl, y02));
    }

    public final void Q(AtomicReference atomicReference) {
        this.n();
        this.v();
        this.P(new L4(this, atomicReference, this.j0(false)));
    }

    public final void R(AtomicReference atomicReference, Bundle bundle) {
        this.n();
        this.v();
        this.P(new H4(this, atomicReference, this.j0(false), bundle));
    }

    public final void S(AtomicReference atomicReference, String string2, String string3, String string4) {
        this.n();
        this.v();
        this.P(new V4(this, atomicReference, string2, string3, string4, this.j0(false)));
    }

    public final void T(AtomicReference atomicReference, String string2, String string3, String string4, boolean bl) {
        this.n();
        this.v();
        this.P(new X4(this, atomicReference, string2, string3, string4, this.j0(false), bl));
    }

    public final void U(boolean bl) {
        this.n();
        this.v();
        if (bl) {
            this.q().H();
        }
        if (this.e0()) {
            this.P(new U4(this, this.j0(false)));
        }
    }

    public final n V() {
        this.n();
        this.v();
        Object object = this.d;
        if (object == null) {
            this.Y();
            this.j().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        W5 w52 = this.j0(false);
        A2.n.i(w52);
        try {
            object = object.P0(w52);
            this.g0();
            return object;
        }
        catch (RemoteException remoteException) {
            this.j().G().b("Failed to get consents; remote exception", (Object)remoteException);
            return null;
        }
    }

    public final Boolean W() {
        return this.e;
    }

    public final void X() {
        this.n();
        this.v();
        W5 w52 = this.j0(true);
        this.q().I();
        this.P(new O4(this, w52));
    }

    public final void Y() {
        this.n();
        this.v();
        if (this.c0()) {
            return;
        }
        if (this.h0()) {
            this.c.a();
            return;
        }
        if (!this.f().S()) {
            List list = this.a().getPackageManager().queryIntentServices(new Intent().setClassName(this.a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (list != null && !list.isEmpty()) {
                list = new Intent("com.google.android.gms.measurement.START");
                list.setComponent(new ComponentName(this.a(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.c.c((Intent)list);
                return;
            }
            this.j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z() {
        this.n();
        this.v();
        this.c.d();
        try {
            b.b().c(this.a(), this.c);
        }
        catch (IllegalArgumentException | IllegalStateException illegalStateException) {}
        this.d = null;
    }

    public final void a0() {
        this.n();
        this.v();
        W5 w52 = this.j0(false);
        this.q().H();
        this.P(new I4(this, w52));
    }

    public final void b0() {
        this.n();
        this.v();
        this.P(new R4(this, this.j0(true)));
    }

    public final boolean c0() {
        this.n();
        this.v();
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        this.n();
        this.v();
        if (!this.h0()) {
            return true;
        }
        if (this.k().G0() >= 200900) {
            return true;
        }
        return false;
    }

    public final boolean e0() {
        this.n();
        this.v();
        if (!this.h0()) {
            return true;
        }
        if (this.k().G0() >= (Integer)K.r0.a(null)) {
            return true;
        }
        return false;
    }

    public final W5 j0(boolean bl) {
        S1 s12 = this.p();
        String string2 = bl ? this.j().O() : null;
        return s12.B(string2);
    }
}

