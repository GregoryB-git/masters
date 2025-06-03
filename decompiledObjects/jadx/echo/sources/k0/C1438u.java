package k0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import d0.AbstractC1163B;
import d0.C1194q;
import g0.AbstractC1297a;
import java.io.IOException;
import x0.InterfaceC2142x;

/* renamed from: k0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438u extends AbstractC1163B {

    /* renamed from: E, reason: collision with root package name */
    public static final String f16009E = g0.M.w0(1001);

    /* renamed from: F, reason: collision with root package name */
    public static final String f16010F = g0.M.w0(1002);

    /* renamed from: G, reason: collision with root package name */
    public static final String f16011G = g0.M.w0(1003);

    /* renamed from: H, reason: collision with root package name */
    public static final String f16012H = g0.M.w0(1004);

    /* renamed from: I, reason: collision with root package name */
    public static final String f16013I = g0.M.w0(1005);

    /* renamed from: J, reason: collision with root package name */
    public static final String f16014J = g0.M.w0(1006);

    /* renamed from: A, reason: collision with root package name */
    public final C1194q f16015A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16016B;

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC2142x.b f16017C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16018D;

    /* renamed from: x, reason: collision with root package name */
    public final int f16019x;

    /* renamed from: y, reason: collision with root package name */
    public final String f16020y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16021z;

    public C1438u(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, false);
    }

    public static C1438u b(Throwable th, String str, int i7, C1194q c1194q, int i8, boolean z7, int i9) {
        return new C1438u(1, th, null, i9, str, i7, c1194q, c1194q == null ? 4 : i8, z7);
    }

    public static C1438u c(IOException iOException, int i7) {
        return new C1438u(0, iOException, i7);
    }

    public static C1438u d(RuntimeException runtimeException, int i7) {
        return new C1438u(2, runtimeException, i7);
    }

    public static String e(int i7, String str, String str2, int i8, C1194q c1194q, int i9) {
        String str3;
        if (i7 == 0) {
            str3 = "Source error";
        } else if (i7 != 1) {
            str3 = i7 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i8 + ", format=" + c1194q + ", format_supported=" + g0.M.Y(i9);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public C1438u a(InterfaceC2142x.b bVar) {
        return new C1438u((String) g0.M.i(getMessage()), getCause(), this.f12350o, this.f16019x, this.f16020y, this.f16021z, this.f16015A, this.f16016B, bVar, this.f12351p, this.f16018D);
    }

    public Exception f() {
        AbstractC1297a.f(this.f16019x == 1);
        return (Exception) AbstractC1297a.e(getCause());
    }

    public IOException g() {
        AbstractC1297a.f(this.f16019x == 0);
        return (IOException) AbstractC1297a.e(getCause());
    }

    public RuntimeException h() {
        AbstractC1297a.f(this.f16019x == 2);
        return (RuntimeException) AbstractC1297a.e(getCause());
    }

    public C1438u(int i7, Throwable th, String str, int i8, String str2, int i9, C1194q c1194q, int i10, boolean z7) {
        this(e(i7, str, str2, i9, c1194q, i10), th, i8, i7, str2, i9, c1194q, i10, null, SystemClock.elapsedRealtime(), z7);
    }

    public C1438u(String str, Throwable th, int i7, int i8, String str2, int i9, C1194q c1194q, int i10, InterfaceC2142x.b bVar, long j7, boolean z7) {
        super(str, th, i7, Bundle.EMPTY, j7);
        AbstractC1297a.a(!z7 || i8 == 1);
        AbstractC1297a.a(th != null || i8 == 3);
        this.f16019x = i8;
        this.f16020y = str2;
        this.f16021z = i9;
        this.f16015A = c1194q;
        this.f16016B = i10;
        this.f16017C = bVar;
        this.f16018D = z7;
    }
}
