package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import t.C1958a;

/* loaded from: classes.dex */
public final class B extends G1 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f4550b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4551c;

    /* renamed from: d, reason: collision with root package name */
    public long f4552d;

    public B(N2 n22) {
        super(n22);
        this.f4551c = new C1958a();
        this.f4550b = new C1958a();
    }

    public static /* synthetic */ void C(B b7, String str, long j7) {
        b7.n();
        AbstractC0328n.e(str);
        Integer num = (Integer) b7.f4551c.get(str);
        if (num == null) {
            b7.j().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C0627w4 C7 = b7.s().C(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            b7.f4551c.put(str, Integer.valueOf(intValue));
            return;
        }
        b7.f4551c.remove(str);
        Long l7 = (Long) b7.f4550b.get(str);
        if (l7 == null) {
            b7.j().G().a("First ad unit exposure time was never set");
        } else {
            long longValue = j7 - l7.longValue();
            b7.f4550b.remove(str);
            b7.A(str, longValue, C7);
        }
        if (b7.f4551c.isEmpty()) {
            long j8 = b7.f4552d;
            if (j8 == 0) {
                b7.j().G().a("First ad exposure time was never set");
            } else {
                b7.w(j7 - j8, C7);
                b7.f4552d = 0L;
            }
        }
    }

    public static /* synthetic */ void y(B b7, String str, long j7) {
        b7.n();
        AbstractC0328n.e(str);
        if (b7.f4551c.isEmpty()) {
            b7.f4552d = j7;
        }
        Integer num = (Integer) b7.f4551c.get(str);
        if (num != null) {
            b7.f4551c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (b7.f4551c.size() >= 100) {
            b7.j().L().a("Too many ads visible");
        } else {
            b7.f4551c.put(str, 1);
            b7.f4550b.put(str, Long.valueOf(j7));
        }
    }

    public final void A(String str, long j7, C0627w4 c0627w4) {
        if (c0627w4 == null) {
            j().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        S5.L(c0627w4, bundle, true);
        r().z0("am", "_xu", bundle);
    }

    public final void B(long j7) {
        Iterator it = this.f4550b.keySet().iterator();
        while (it.hasNext()) {
            this.f4550b.put((String) it.next(), Long.valueOf(j7));
        }
        if (this.f4550b.isEmpty()) {
            return;
        }
        this.f4552d = j7;
    }

    public final void D(String str, long j7) {
        if (str == null || str.length() == 0) {
            j().G().a("Ad unit id must be a non-empty string");
        } else {
            e().D(new E0(this, str, j7));
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
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

    public final void v(long j7) {
        C0627w4 C7 = s().C(false);
        for (String str : this.f4550b.keySet()) {
            A(str, j7 - ((Long) this.f4550b.get(str)).longValue(), C7);
        }
        if (!this.f4550b.isEmpty()) {
            w(j7 - this.f4552d, C7);
        }
        B(j7);
    }

    public final void w(long j7, C0627w4 c0627w4) {
        if (c0627w4 == null) {
            j().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        S5.L(c0627w4, bundle, true);
        r().z0("am", "_xa", bundle);
    }

    public final void z(String str, long j7) {
        if (str == null || str.length() == 0) {
            j().G().a("Ad unit id must be a non-empty string");
        } else {
            e().D(new RunnableC0469a(this, str, j7));
        }
    }
}
