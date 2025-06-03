package R2;

import A2.AbstractC0328n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import x2.AbstractC2200n;

/* loaded from: classes.dex */
public final class D4 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0475a5 f4592c;

    /* renamed from: d, reason: collision with root package name */
    public R1 f4593d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f4594e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0629x f4595f;

    /* renamed from: g, reason: collision with root package name */
    public final C0628w5 f4596g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4597h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0629x f4598i;

    public D4(N2 n22) {
        super(n22);
        this.f4597h = new ArrayList();
        this.f4596g = new C0628w5(n22.b());
        this.f4592c = new ServiceConnectionC0475a5(this);
        this.f4595f = new G4(this, n22);
        this.f4598i = new P4(this, n22);
    }

    public static /* synthetic */ void I(D4 d42, ComponentName componentName) {
        d42.n();
        if (d42.f4593d != null) {
            d42.f4593d = null;
            d42.j().K().b("Disconnected from device MeasurementService", componentName);
            d42.n();
            d42.Y();
        }
    }

    private final void P(Runnable runnable) {
        n();
        if (c0()) {
            runnable.run();
        } else {
            if (this.f4597h.size() >= 1000) {
                j().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f4597h.add(runnable);
            this.f4598i.b(60000L);
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        n();
        j().K().b("Processing queued up service tasks", Integer.valueOf(this.f4597h.size()));
        Iterator it = this.f4597h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                j().G().b("Task exception while flushing queue", e7);
            }
        }
        this.f4597h.clear();
        this.f4598i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        n();
        this.f4596g.c();
        this.f4595f.b(((Long) K.f4788L.a(null)).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean h0() {
        /*
            r6 = this;
            r6.n()
            r6.v()
            java.lang.Boolean r0 = r6.f4594e
            if (r0 != 0) goto Lf7
            r6.n()
            r6.v()
            R2.l2 r0 = r6.i()
            java.lang.Boolean r0 = r0.K()
            r1 = 1
            if (r0 == 0) goto L23
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L23
            goto Lf1
        L23:
            R2.S1 r2 = r6.p()
            int r2 = r2.C()
            if (r2 != r1) goto L30
        L2d:
            r3 = r1
            goto Lce
        L30:
            R2.Y1 r2 = r6.j()
            R2.a2 r2 = r2.K()
            java.lang.String r3 = "Checking service availability"
            r2.a(r3)
            R2.S5 r2 = r6.k()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.u(r3)
            if (r2 == 0) goto Lc3
            r3 = 0
            if (r2 == r1) goto Lb5
            r4 = 2
            if (r2 == r4) goto L95
            r0 = 3
            if (r2 == r0) goto L8a
            r0 = 9
            if (r2 == r0) goto L7c
            r0 = 18
            if (r2 == r0) goto L6e
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.L()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
        L6c:
            r1 = r3
            goto Lce
        L6e:
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.L()
            java.lang.String r2 = "Service updating"
        L78:
            r0.a(r2)
            goto L2d
        L7c:
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.L()
            java.lang.String r1 = "Service invalid"
        L86:
            r0.a(r1)
            goto L6c
        L8a:
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.L()
            java.lang.String r1 = "Service disabled"
            goto L86
        L95:
            R2.Y1 r2 = r6.j()
            R2.a2 r2 = r2.F()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            R2.S5 r2 = r6.k()
            int r2 = r2.G0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto Lb2
        Lae:
            r5 = r3
            r3 = r1
            r1 = r5
            goto Lce
        Lb2:
            if (r0 != 0) goto L6c
            goto Lce
        Lb5:
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.K()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto Lae
        Lc3:
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.K()
            java.lang.String r2 = "Service available"
            goto L78
        Lce:
            if (r1 != 0) goto Le8
            R2.g r0 = r6.f()
            boolean r0 = r0.S()
            if (r0 == 0) goto Le8
            R2.Y1 r0 = r6.j()
            R2.a2 r0 = r0.G()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto Lf1
        Le8:
            if (r3 == 0) goto Lf1
            R2.l2 r0 = r6.i()
            r0.w(r1)
        Lf1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f4594e = r0
        Lf7:
            java.lang.Boolean r0 = r6.f4594e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.D4.h0():boolean");
    }

    public static /* synthetic */ void l0(D4 d42) {
        d42.n();
        if (d42.c0()) {
            d42.j().K().a("Inactivity, disconnecting from the service");
            d42.Z();
        }
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return false;
    }

    public final void C(C0497e c0497e) {
        AbstractC0328n.i(c0497e);
        n();
        v();
        P(new W4(this, true, j0(true), q().E(c0497e), new C0497e(c0497e), c0497e));
    }

    public final void D(I i7, String str) {
        AbstractC0328n.i(i7);
        n();
        v();
        P(new T4(this, true, j0(true), q().F(i7), i7, str));
    }

    public final void E(R1 r12) {
        n();
        AbstractC0328n.i(r12);
        this.f4593d = r12;
        g0();
        f0();
    }

    public final void F(R1 r12, B2.a aVar, W5 w52) {
        int i7;
        C0472a2 G6;
        String str;
        n();
        v();
        int i8 = 100;
        int i9 = 0;
        while (i9 < 1001 && i8 == 100) {
            ArrayList arrayList = new ArrayList();
            List C7 = q().C(100);
            if (C7 != null) {
                arrayList.addAll(C7);
                i7 = C7.size();
            } else {
                i7 = 0;
            }
            if (aVar != null && i7 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                B2.a aVar2 = (B2.a) obj;
                if (aVar2 instanceof I) {
                    try {
                        r12.R0((I) aVar2, w52);
                    } catch (RemoteException e7) {
                        e = e7;
                        G6 = j().G();
                        str = "Failed to send event to the service";
                        G6.b(str, e);
                    }
                } else if (aVar2 instanceof R5) {
                    try {
                        r12.Z((R5) aVar2, w52);
                    } catch (RemoteException e8) {
                        e = e8;
                        G6 = j().G();
                        str = "Failed to send user property to the service";
                        G6.b(str, e);
                    }
                } else if (aVar2 instanceof C0497e) {
                    try {
                        r12.m0((C0497e) aVar2, w52);
                    } catch (RemoteException e9) {
                        e = e9;
                        G6 = j().G();
                        str = "Failed to send conditional user property to the service";
                        G6.b(str, e);
                    }
                } else {
                    j().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i9++;
            i8 = i7;
        }
    }

    public final void G(C0627w4 c0627w4) {
        n();
        v();
        P(new M4(this, c0627w4));
    }

    public final void J(R5 r52) {
        n();
        v();
        P(new J4(this, j0(true), q().G(r52), r52));
    }

    public final void K(Bundle bundle) {
        n();
        v();
        P(new Q4(this, j0(false), bundle));
    }

    public final void L(InterfaceC1071y0 interfaceC1071y0) {
        n();
        v();
        P(new K4(this, j0(false), interfaceC1071y0));
    }

    public final void M(InterfaceC1071y0 interfaceC1071y0, I i7, String str) {
        n();
        v();
        if (k().u(AbstractC2200n.f21186a) == 0) {
            P(new S4(this, i7, str, interfaceC1071y0));
        } else {
            j().L().a("Not bundling data. Service unavailable or out of date");
            k().Y(interfaceC1071y0, new byte[0]);
        }
    }

    public final void N(InterfaceC1071y0 interfaceC1071y0, String str, String str2) {
        n();
        v();
        P(new Y4(this, str, str2, j0(false), interfaceC1071y0));
    }

    public final void O(InterfaceC1071y0 interfaceC1071y0, String str, String str2, boolean z7) {
        n();
        v();
        P(new F4(this, str, str2, j0(false), z7, interfaceC1071y0));
    }

    public final void Q(AtomicReference atomicReference) {
        n();
        v();
        P(new L4(this, atomicReference, j0(false)));
    }

    public final void R(AtomicReference atomicReference, Bundle bundle) {
        n();
        v();
        P(new H4(this, atomicReference, j0(false), bundle));
    }

    public final void S(AtomicReference atomicReference, String str, String str2, String str3) {
        n();
        v();
        P(new V4(this, atomicReference, str, str2, str3, j0(false)));
    }

    public final void T(AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        n();
        v();
        P(new X4(this, atomicReference, str, str2, str3, j0(false), z7));
    }

    public final void U(boolean z7) {
        n();
        v();
        if (z7) {
            q().H();
        }
        if (e0()) {
            P(new U4(this, j0(false)));
        }
    }

    public final C0560n V() {
        n();
        v();
        R1 r12 = this.f4593d;
        if (r12 == null) {
            Y();
            j().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        W5 j02 = j0(false);
        AbstractC0328n.i(j02);
        try {
            C0560n P02 = r12.P0(j02);
            g0();
            return P02;
        } catch (RemoteException e7) {
            j().G().b("Failed to get consents; remote exception", e7);
            return null;
        }
    }

    public final Boolean W() {
        return this.f4594e;
    }

    public final void X() {
        n();
        v();
        W5 j02 = j0(true);
        q().I();
        P(new O4(this, j02));
    }

    public final void Y() {
        n();
        v();
        if (c0()) {
            return;
        }
        if (h0()) {
            this.f4592c.a();
            return;
        }
        if (f().S()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            j().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f4592c.c(intent);
    }

    public final void Z() {
        n();
        v();
        this.f4592c.d();
        try {
            D2.b.b().c(a(), this.f4592c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f4593d = null;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0() {
        n();
        v();
        W5 j02 = j0(false);
        q().H();
        P(new I4(this, j02));
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    public final void b0() {
        n();
        v();
        P(new R4(this, j0(true)));
    }

    public final boolean c0() {
        n();
        v();
        return this.f4593d != null;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    public final boolean d0() {
        n();
        v();
        return !h0() || k().G0() >= 200900;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    public final boolean e0() {
        n();
        v();
        return !h0() || k().G0() >= ((Integer) K.f4855r0.a(null)).intValue();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    public final W5 j0(boolean z7) {
        return p().B(z7 ? j().O() : null);
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ S1 p() {
        return super.p();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ V1 q() {
        return super.q();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C3 r() {
        return super.r();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0620v4 s() {
        return super.s();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ D4 t() {
        return super.t();
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0552l5 u() {
        return super.u();
    }
}
