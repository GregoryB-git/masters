package R2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s2.C1939a;

/* renamed from: R2.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517g5 extends C5 {

    /* renamed from: d, reason: collision with root package name */
    public final Map f5309d;

    /* renamed from: e, reason: collision with root package name */
    public final C0584q2 f5310e;

    /* renamed from: f, reason: collision with root package name */
    public final C0584q2 f5311f;

    /* renamed from: g, reason: collision with root package name */
    public final C0584q2 f5312g;

    /* renamed from: h, reason: collision with root package name */
    public final C0584q2 f5313h;

    /* renamed from: i, reason: collision with root package name */
    public final C0584q2 f5314i;

    public C0517g5(D5 d52) {
        super(d52);
        this.f5309d = new HashMap();
        C0549l2 i7 = i();
        i7.getClass();
        this.f5310e = new C0584q2(i7, "last_delete_stale", 0L);
        C0549l2 i8 = i();
        i8.getClass();
        this.f5311f = new C0584q2(i8, "backoff", 0L);
        C0549l2 i9 = i();
        i9.getClass();
        this.f5312g = new C0584q2(i9, "last_upload", 0L);
        C0549l2 i10 = i();
        i10.getClass();
        this.f5313h = new C0584q2(i10, "last_upload_attempt", 0L);
        C0549l2 i11 = i();
        i11.getClass();
        this.f5314i = new C0584q2(i11, "midnight_offset", 0L);
    }

    private final Pair y(String str) {
        C0510f5 c0510f5;
        C1939a.C0266a c0266a;
        n();
        long b7 = b().b();
        C0510f5 c0510f52 = (C0510f5) this.f5309d.get(str);
        if (c0510f52 != null && b7 < c0510f52.f5294c) {
            return new Pair(c0510f52.f5292a, Boolean.valueOf(c0510f52.f5293b));
        }
        C1939a.b(true);
        long C7 = f().C(str) + b7;
        try {
            long x7 = f().x(str, K.f4826d);
            if (x7 > 0) {
                try {
                    c0266a = C1939a.a(a());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c0510f52 != null && b7 < c0510f52.f5294c + x7) {
                        return new Pair(c0510f52.f5292a, Boolean.valueOf(c0510f52.f5293b));
                    }
                    c0266a = null;
                }
            } else {
                c0266a = C1939a.a(a());
            }
        } catch (Exception e7) {
            j().F().b("Unable to get advertising id", e7);
            c0510f5 = new C0510f5("", false, C7);
        }
        if (c0266a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a7 = c0266a.a();
        c0510f5 = a7 != null ? new C0510f5(a7, c0266a.b(), C7) : new C0510f5("", c0266a.b(), C7);
        this.f5309d.put(str, c0510f5);
        C1939a.b(false);
        return new Pair(c0510f5.f5292a, Boolean.valueOf(c0510f5.f5293b));
    }

    public final String A(String str, boolean z7) {
        n();
        String str2 = z7 ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest T02 = S5.T0();
        if (T02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, T02.digest(str2.getBytes())));
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

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ N5 o() {
        return super.o();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ b6 p() {
        return super.p();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0574p q() {
        return super.q();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0632x2 r() {
        return super.r();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0517g5 s() {
        return super.s();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ B5 t() {
        return super.t();
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final Pair z(String str, C0585q3 c0585q3) {
        return c0585q3.x() ? y(str) : new Pair("", Boolean.FALSE);
    }
}
