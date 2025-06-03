package R2;

import A2.AbstractC0328n;
import R2.C0585q3;
import android.content.Context;
import com.google.android.gms.internal.measurement.C0917g7;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.C1024s7;
import com.google.android.gms.internal.measurement.F7;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class S1 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public String f5000c;

    /* renamed from: d, reason: collision with root package name */
    public String f5001d;

    /* renamed from: e, reason: collision with root package name */
    public int f5002e;

    /* renamed from: f, reason: collision with root package name */
    public String f5003f;

    /* renamed from: g, reason: collision with root package name */
    public String f5004g;

    /* renamed from: h, reason: collision with root package name */
    public long f5005h;

    /* renamed from: i, reason: collision with root package name */
    public long f5006i;

    /* renamed from: j, reason: collision with root package name */
    public List f5007j;

    /* renamed from: k, reason: collision with root package name */
    public String f5008k;

    /* renamed from: l, reason: collision with root package name */
    public int f5009l;

    /* renamed from: m, reason: collision with root package name */
    public String f5010m;

    /* renamed from: n, reason: collision with root package name */
    public String f5011n;

    /* renamed from: o, reason: collision with root package name */
    public String f5012o;

    /* renamed from: p, reason: collision with root package name */
    public long f5013p;

    /* renamed from: q, reason: collision with root package name */
    public String f5014q;

    public S1(N2 n22, long j7) {
        super(n22);
        this.f5013p = 0L;
        this.f5014q = null;
        this.f5006i = j7;
    }

    private final String J() {
        C0472a2 N6;
        String str;
        if (F7.a() && f().s(K.f4847n0)) {
            N6 = j().K();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> loadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        N6 = j().M();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    N6 = j().N();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        N6.a(str);
        return null;
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return true;
    }

    public final W5 B(String str) {
        String str2;
        int i7;
        long j7;
        long j8;
        String str3;
        int i8;
        n();
        C0585q3 J6 = i().J();
        if (C0979n6.a() && f().s(K.f4803S0)) {
            str2 = i().I().i();
            i7 = J6.b();
        } else {
            str2 = "";
            i7 = 100;
        }
        String str4 = str2;
        int i9 = i7;
        String F6 = F();
        String G6 = G();
        v();
        String str5 = this.f5001d;
        long D7 = D();
        v();
        AbstractC0328n.i(this.f5003f);
        String str6 = this.f5003f;
        v();
        n();
        if (this.f5005h == 0) {
            this.f5005h = this.f5424a.L().A(a(), a().getPackageName());
        }
        long j9 = this.f5005h;
        boolean p7 = this.f5424a.p();
        boolean z7 = !i().f5401r;
        n();
        String J7 = !this.f5424a.p() ? null : J();
        N2 n22 = this.f5424a;
        long a7 = n22.F().f5388e.a();
        long min = a7 == 0 ? n22.f4911H : Math.min(n22.f4911H, a7);
        int C7 = C();
        boolean P6 = f().P();
        C0549l2 i10 = i();
        i10.n();
        boolean z8 = i10.F().getBoolean("deferred_analytics_collection", false);
        String E6 = E();
        Boolean valueOf = f().F("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r4.booleanValue());
        long j10 = this.f5006i;
        List list = this.f5007j;
        String v7 = J6.v();
        if (this.f5008k == null) {
            this.f5008k = k().S0();
        }
        String str7 = this.f5008k;
        if (C1024s7.a() && f().s(K.f4867x0)) {
            n();
            j8 = 0;
            if (this.f5013p != 0) {
                j7 = j10;
                long a8 = b().a() - this.f5013p;
                if (this.f5012o != null && a8 > 86400000 && this.f5014q == null) {
                    I();
                }
            } else {
                j7 = j10;
            }
            if (this.f5012o == null) {
                I();
            }
            str3 = this.f5012o;
        } else {
            j7 = j10;
            j8 = 0;
            str3 = null;
        }
        Boolean F7 = f().F("google_analytics_sgtm_upload_enabled");
        boolean booleanValue = F7 == null ? false : F7.booleanValue();
        long z02 = k().z0(F());
        if (C0917g7.a() && f().s(K.f4791M0)) {
            k();
            i8 = S5.y0();
        } else {
            i8 = 0;
        }
        return new W5(F6, G6, str5, D7, str6, 82001L, j9, str, p7, z7, J7, 0L, min, C7, P6, z8, E6, valueOf, j7, list, (String) null, v7, str7, str3, booleanValue, z02, i9, str4, i8, (C0917g7.a() && f().s(K.f4791M0)) ? k().I0() : j8);
    }

    public final int C() {
        v();
        return this.f5009l;
    }

    public final int D() {
        v();
        return this.f5002e;
    }

    public final String E() {
        v();
        return this.f5011n;
    }

    public final String F() {
        v();
        AbstractC0328n.i(this.f5000c);
        return this.f5000c;
    }

    public final String G() {
        n();
        v();
        AbstractC0328n.i(this.f5010m);
        return this.f5010m;
    }

    public final List H() {
        return this.f5007j;
    }

    public final void I() {
        String format;
        n();
        if (i().J().l(C0585q3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            k().U0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            j().F().a("Analytics Storage consent is not granted");
            format = null;
        }
        C0472a2 F6 = j().F();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        F6.a(String.format("Resetting session stitching token to %s", objArr));
        this.f5012o = format;
        this.f5013p = b().a();
    }

    public final boolean K(String str) {
        String str2 = this.f5014q;
        boolean z7 = (str2 == null || str2.equals(str)) ? false : true;
        this.f5014q = str;
        return z7;
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

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:3)(6:67|68|(1:70)(2:85|(1:87))|71|72|(22:74|(1:76)(1:83)|78|79|5|(1:66)(1:9)|10|11|13|(1:15)|16|(1:18)|19|20|(1:22)(1:53)|23|(1:25)|(3:27|(1:29)(1:32)|30)|33|(3:35|(1:37)(3:44|(3:47|(1:49)(1:50)|45)|51)|(2:39|40)(2:42|43))|52|(0)(0)))|4|5|(1:7)|66|10|11|13|(0)|16|(0)|19|20|(0)(0)|23|(0)|(0)|33|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018d, code lost:
    
        j().G().c("Fetching Google App Id failed with exception. appId", R2.Y1.v(r0), r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154 A[Catch: IllegalStateException -> 0x016c, TryCatch #3 {IllegalStateException -> 0x016c, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x0170, B:29:0x0184, B:30:0x0189, B:32:0x0187), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170 A[Catch: IllegalStateException -> 0x016c, TryCatch #3 {IllegalStateException -> 0x016c, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x0170, B:29:0x0184, B:30:0x0189, B:32:0x0187), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // R2.AbstractC0506f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.S1.y():void");
    }
}
