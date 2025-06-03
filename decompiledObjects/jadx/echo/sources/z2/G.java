package z2;

import A2.AbstractC0317c;
import A2.C0319e;
import A2.C0326l;
import A2.C0329o;
import A2.C0330p;
import V2.AbstractC0659j;
import V2.InterfaceC0654e;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import x2.C2188b;

/* loaded from: classes.dex */
public final class G implements InterfaceC0654e {

    /* renamed from: a, reason: collision with root package name */
    public final C2302e f21652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21653b;

    /* renamed from: c, reason: collision with root package name */
    public final C2299b f21654c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21655d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21656e;

    public G(C2302e c2302e, int i7, C2299b c2299b, long j7, long j8, String str, String str2) {
        this.f21652a = c2302e;
        this.f21653b = i7;
        this.f21654c = c2299b;
        this.f21655d = j7;
        this.f21656e = j8;
    }

    public static G b(C2302e c2302e, int i7, C2299b c2299b) {
        boolean z7;
        if (!c2302e.f()) {
            return null;
        }
        C0330p a7 = C0329o.b().a();
        if (a7 == null) {
            z7 = true;
        } else {
            if (!a7.f()) {
                return null;
            }
            z7 = a7.g();
            C2320x w7 = c2302e.w(c2299b);
            if (w7 != null) {
                if (!(w7.t() instanceof AbstractC0317c)) {
                    return null;
                }
                AbstractC0317c abstractC0317c = (AbstractC0317c) w7.t();
                if (abstractC0317c.J() && !abstractC0317c.i()) {
                    C0319e c7 = c(w7, abstractC0317c, i7);
                    if (c7 == null) {
                        return null;
                    }
                    w7.F();
                    z7 = c7.i();
                }
            }
        }
        return new G(c2302e, i7, c2299b, z7 ? System.currentTimeMillis() : 0L, z7 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static C0319e c(C2320x c2320x, AbstractC0317c abstractC0317c, int i7) {
        int[] d7;
        int[] f7;
        C0319e H6 = abstractC0317c.H();
        if (H6 == null || !H6.g() || ((d7 = H6.d()) != null ? !E2.b.a(d7, i7) : !((f7 = H6.f()) == null || !E2.b.a(f7, i7))) || c2320x.r() >= H6.a()) {
            return null;
        }
        return H6;
    }

    @Override // V2.InterfaceC0654e
    public final void a(AbstractC0659j abstractC0659j) {
        C2320x w7;
        int i7;
        int i8;
        int i9;
        int a7;
        long j7;
        long j8;
        int i10;
        if (this.f21652a.f()) {
            C0330p a8 = C0329o.b().a();
            if ((a8 == null || a8.f()) && (w7 = this.f21652a.w(this.f21654c)) != null && (w7.t() instanceof AbstractC0317c)) {
                AbstractC0317c abstractC0317c = (AbstractC0317c) w7.t();
                int i11 = 0;
                boolean z7 = this.f21655d > 0;
                int z8 = abstractC0317c.z();
                if (a8 != null) {
                    z7 &= a8.g();
                    int a9 = a8.a();
                    int d7 = a8.d();
                    i7 = a8.i();
                    if (abstractC0317c.J() && !abstractC0317c.i()) {
                        C0319e c7 = c(w7, abstractC0317c, this.f21653b);
                        if (c7 == null) {
                            return;
                        }
                        boolean z9 = c7.i() && this.f21655d > 0;
                        d7 = c7.a();
                        z7 = z9;
                    }
                    i9 = a9;
                    i8 = d7;
                } else {
                    i7 = 0;
                    i8 = 100;
                    i9 = 5000;
                }
                C2302e c2302e = this.f21652a;
                if (abstractC0659j.n()) {
                    a7 = 0;
                } else {
                    if (abstractC0659j.l()) {
                        i11 = 100;
                    } else {
                        Exception i12 = abstractC0659j.i();
                        if (i12 instanceof y2.b) {
                            Status a10 = ((y2.b) i12).a();
                            int d8 = a10.d();
                            C2188b a11 = a10.a();
                            a7 = a11 == null ? -1 : a11.a();
                            i11 = d8;
                        } else {
                            i11 = 101;
                        }
                    }
                    a7 = -1;
                }
                if (z7) {
                    long j9 = this.f21655d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i10 = (int) (SystemClock.elapsedRealtime() - this.f21656e);
                    j7 = j9;
                    j8 = currentTimeMillis;
                } else {
                    j7 = 0;
                    j8 = 0;
                    i10 = -1;
                }
                c2302e.E(new C0326l(this.f21653b, i11, a7, j7, j8, null, null, z8, i10), i7, i9, i8);
            }
        }
    }
}
