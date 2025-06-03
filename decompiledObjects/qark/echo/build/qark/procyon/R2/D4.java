// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.Context;
import android.content.ServiceConnection;
import D2.b;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.internal.measurement.y0;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collection;
import B2.a;
import A2.n;
import java.util.Iterator;
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

public final class D4 extends f1
{
    public final a5 c;
    public R1 d;
    public volatile Boolean e;
    public final x f;
    public final w5 g;
    public final List h;
    public final x i;
    
    public D4(final N2 n2) {
        super(n2);
        this.h = new ArrayList();
        this.g = new w5(n2.b());
        this.c = new a5(this);
        this.f = new G4(this, n2);
        this.i = new P4(this, n2);
    }
    
    private final void P(final Runnable runnable) {
        this.n();
        if (this.c0()) {
            runnable.run();
            return;
        }
        if (this.h.size() >= 1000L) {
            this.j().G().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable);
        this.i.b(60000L);
        this.Y();
    }
    
    private final void f0() {
        this.n();
        this.j().K().b("Processing queued up service tasks", this.h.size());
        for (final Runnable runnable : this.h) {
            try {
                runnable.run();
            }
            catch (RuntimeException ex) {
                this.j().G().b("Task exception while flushing queue", ex);
            }
        }
        this.h.clear();
        this.i.a();
    }
    
    private final void g0() {
        this.n();
        this.g.c();
        this.f.b((long)K.L.a(null));
    }
    
    private final boolean h0() {
        this.n();
        this.v();
        if (this.e == null) {
            this.n();
            this.v();
            final Boolean k = this.i().K();
            boolean b = true;
            boolean b2 = true;
            if (k == null || !k) {
                boolean b3 = false;
                Label_0278: {
                    if (this.p().C() != 1) {
                        this.j().K().a("Checking service availability");
                        final int u = this.k().u(12451000);
                        a2 a2 = null;
                        String s = null;
                        Label_0158: {
                            if (u != 0) {
                                b3 = false;
                                Label_0232: {
                                    if (u != 1) {
                                        Label_0140: {
                                            if (u != 2) {
                                                a2 a3;
                                                String s2;
                                                if (u != 3) {
                                                    if (u != 9) {
                                                        if (u != 18) {
                                                            this.j().L().b("Unexpected service status", u);
                                                            break Label_0140;
                                                        }
                                                        a2 = this.j().L();
                                                        s = "Service updating";
                                                        break Label_0158;
                                                    }
                                                    else {
                                                        a3 = this.j().L();
                                                        s2 = "Service invalid";
                                                    }
                                                }
                                                else {
                                                    a3 = this.j().L();
                                                    s2 = "Service disabled";
                                                }
                                                a3.a(s2);
                                            }
                                            else {
                                                this.j().F().a("Service container out of date");
                                                if (this.k().G0() < 17443) {
                                                    break Label_0232;
                                                }
                                                if (k == null) {
                                                    break Label_0278;
                                                }
                                            }
                                        }
                                        b2 = false;
                                        break Label_0278;
                                    }
                                    this.j().K().a("Service missing");
                                }
                                b3 = true;
                                b2 = false;
                                break Label_0278;
                            }
                            a2 = this.j().K();
                            s = "Service available";
                        }
                        a2.a(s);
                    }
                    b3 = true;
                }
                if (!b2 && this.f().S()) {
                    this.j().G().a("No way to upload. Consider using the full version of Analytics");
                    b = b2;
                }
                else {
                    b = b2;
                    if (b3) {
                        this.i().w(b2);
                        b = b2;
                    }
                }
            }
            this.e = b;
        }
        return this.e;
    }
    
    @Override
    public final boolean A() {
        return false;
    }
    
    public final void C(final e e) {
        n.i(e);
        this.n();
        this.v();
        this.P(new W4(this, true, this.j0(true), this.q().E(e), new e(e), e));
    }
    
    public final void D(final I i, final String s) {
        n.i(i);
        this.n();
        this.v();
        this.P(new T4(this, true, this.j0(true), this.q().F(i), i, s));
    }
    
    public final void E(final R1 d) {
        this.n();
        n.i(d);
        this.d = d;
        this.g0();
        this.f0();
    }
    
    public final void F(final R1 r1, final a a, final W5 w5) {
        this.n();
        this.v();
        for (int size = 100, n = 0; n < 1001 && size == 100; ++n) {
            final ArrayList<Object> list = new ArrayList<Object>();
            final List c = this.q().C(100);
            if (c != null) {
                list.addAll(c);
                size = c.size();
            }
            else {
                size = 0;
            }
            if (a != null && size < 100) {
                list.add(a);
            }
            final int size2 = list.size();
            int i = 0;
            while (i < size2) {
                final a value = list.get(i);
                ++i;
                final a a2 = value;
                a2 a3 = null;
                String s = null;
                Label_0178: {
                    if (!(a2 instanceof I)) {
                        if (a2 instanceof R5) {
                            try {
                                r1.Z((R5)a2, w5);
                                continue;
                            }
                            catch (RemoteException ex) {
                                a3 = this.j().G();
                                s = "Failed to send user property to the service";
                                break Label_0178;
                            }
                        }
                        if (a2 instanceof e) {
                            try {
                                r1.m0((e)a2, w5);
                                continue;
                            }
                            catch (RemoteException ex) {
                                a3 = this.j().G();
                                s = "Failed to send conditional user property to the service";
                                break Label_0178;
                            }
                        }
                        this.j().G().a("Discarding data. Unrecognized parcel type.");
                        continue;
                    }
                    try {
                        r1.R0((I)a2, w5);
                        continue;
                    }
                    catch (RemoteException ex) {
                        a3 = this.j().G();
                        s = "Failed to send event to the service";
                    }
                }
                final RemoteException ex;
                a3.b(s, ex);
            }
        }
    }
    
    public final void G(final w4 w4) {
        this.n();
        this.v();
        this.P(new M4(this, w4));
    }
    
    public final void J(final R5 r5) {
        this.n();
        this.v();
        this.P(new J4(this, this.j0(true), this.q().G(r5), r5));
    }
    
    public final void K(final Bundle bundle) {
        this.n();
        this.v();
        this.P(new Q4(this, this.j0(false), bundle));
    }
    
    public final void L(final y0 y0) {
        this.n();
        this.v();
        this.P(new K4(this, this.j0(false), y0));
    }
    
    public final void M(final y0 y0, final I i, final String s) {
        this.n();
        this.v();
        if (this.k().u(12451000) != 0) {
            this.j().L().a("Not bundling data. Service unavailable or out of date");
            this.k().Y(y0, new byte[0]);
            return;
        }
        this.P(new S4(this, i, s, y0));
    }
    
    public final void N(final y0 y0, final String s, final String s2) {
        this.n();
        this.v();
        this.P(new Y4(this, s, s2, this.j0(false), y0));
    }
    
    public final void O(final y0 y0, final String s, final String s2, final boolean b) {
        this.n();
        this.v();
        this.P(new F4(this, s, s2, this.j0(false), b, y0));
    }
    
    public final void Q(final AtomicReference atomicReference) {
        this.n();
        this.v();
        this.P(new L4(this, atomicReference, this.j0(false)));
    }
    
    public final void R(final AtomicReference atomicReference, final Bundle bundle) {
        this.n();
        this.v();
        this.P(new H4(this, atomicReference, this.j0(false), bundle));
    }
    
    public final void S(final AtomicReference atomicReference, final String s, final String s2, final String s3) {
        this.n();
        this.v();
        this.P(new V4(this, atomicReference, s, s2, s3, this.j0(false)));
    }
    
    public final void T(final AtomicReference atomicReference, final String s, final String s2, final String s3, final boolean b) {
        this.n();
        this.v();
        this.P(new X4(this, atomicReference, s, s2, s3, this.j0(false), b));
    }
    
    public final void U(final boolean b) {
        this.n();
        this.v();
        if (b) {
            this.q().H();
        }
        if (this.e0()) {
            this.P(new U4(this, this.j0(false)));
        }
    }
    
    public final R2.n V() {
        this.n();
        this.v();
        final R1 d = this.d;
        if (d == null) {
            this.Y();
            this.j().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        final W5 j0 = this.j0(false);
        n.i(j0);
        try {
            final R2.n p0 = d.P0(j0);
            this.g0();
            return p0;
        }
        catch (RemoteException ex) {
            this.j().G().b("Failed to get consents; remote exception", ex);
            return null;
        }
    }
    
    public final Boolean W() {
        return this.e;
    }
    
    public final void X() {
        this.n();
        this.v();
        final W5 j0 = this.j0(true);
        this.q().I();
        this.P(new O4(this, j0));
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
            final List queryIntentServices = this.a().getPackageManager().queryIntentServices(new Intent().setClassName(this.a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                final Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(this.a(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.c.c(intent);
                return;
            }
            this.j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }
    
    public final void Z() {
        this.n();
        this.v();
        this.c.d();
        while (true) {
            try {
                D2.b.b().c(this.a(), (ServiceConnection)this.c);
                this.d = null;
            }
            catch (IllegalStateException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void a0() {
        this.n();
        this.v();
        final W5 j0 = this.j0(false);
        this.q().H();
        this.P(new I4(this, j0));
    }
    
    public final void b0() {
        this.n();
        this.v();
        this.P(new R4(this, this.j0(true)));
    }
    
    public final boolean c0() {
        this.n();
        this.v();
        return this.d != null;
    }
    
    public final boolean d0() {
        this.n();
        this.v();
        return !this.h0() || this.k().G0() >= 200900;
    }
    
    public final boolean e0() {
        this.n();
        this.v();
        return !this.h0() || this.k().G0() >= (int)K.r0.a(null);
    }
    
    public final W5 j0(final boolean b) {
        final S1 p = this.p();
        String o;
        if (b) {
            o = this.j().O();
        }
        else {
            o = null;
        }
        return p.B(o);
    }
}
