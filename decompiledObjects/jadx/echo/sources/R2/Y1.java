package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.B6;

/* loaded from: classes.dex */
public final class Y1 extends AbstractC0550l3 {

    /* renamed from: c, reason: collision with root package name */
    public char f5147c;

    /* renamed from: d, reason: collision with root package name */
    public long f5148d;

    /* renamed from: e, reason: collision with root package name */
    public String f5149e;

    /* renamed from: f, reason: collision with root package name */
    public final C0472a2 f5150f;

    /* renamed from: g, reason: collision with root package name */
    public final C0472a2 f5151g;

    /* renamed from: h, reason: collision with root package name */
    public final C0472a2 f5152h;

    /* renamed from: i, reason: collision with root package name */
    public final C0472a2 f5153i;

    /* renamed from: j, reason: collision with root package name */
    public final C0472a2 f5154j;

    /* renamed from: k, reason: collision with root package name */
    public final C0472a2 f5155k;

    /* renamed from: l, reason: collision with root package name */
    public final C0472a2 f5156l;

    /* renamed from: m, reason: collision with root package name */
    public final C0472a2 f5157m;

    /* renamed from: n, reason: collision with root package name */
    public final C0472a2 f5158n;

    public Y1(N2 n22) {
        super(n22);
        this.f5147c = (char) 0;
        this.f5148d = -1L;
        this.f5150f = new C0472a2(this, 6, false, false);
        this.f5151g = new C0472a2(this, 6, true, false);
        this.f5152h = new C0472a2(this, 6, false, true);
        this.f5153i = new C0472a2(this, 5, false, false);
        this.f5154j = new C0472a2(this, 5, true, false);
        this.f5155k = new C0472a2(this, 5, false, true);
        this.f5156l = new C0472a2(this, 4, false, false);
        this.f5157m = new C0472a2(this, 3, false, false);
        this.f5158n = new C0472a2(this, 2, false, false);
    }

    public static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (B6.a() && ((Boolean) K.f4781H0.a(null)).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    public static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new C0493d2(str);
    }

    public static String w(boolean z7, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i7 = 0;
        if (obj instanceof Long) {
            if (!z7) {
                return String.valueOf(obj);
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l7.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof C0493d2)) {
                return z7 ? "-" : String.valueOf(obj);
            }
            str = ((C0493d2) obj).f5249a;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String E6 = E(N2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E6)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i7++;
        }
        return sb.toString();
    }

    public static String x(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String w7 = w(z7, obj);
        String w8 = w(z7, obj2);
        String w9 = w(z7, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(w7)) {
            sb.append(str2);
            sb.append(w7);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(w8)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(w8);
        }
        if (!TextUtils.isEmpty(w9)) {
            sb.append(str3);
            sb.append(w9);
        }
        return sb.toString();
    }

    public final boolean C(int i7) {
        return Log.isLoggable(P(), i7);
    }

    public final C0472a2 F() {
        return this.f5157m;
    }

    public final C0472a2 G() {
        return this.f5150f;
    }

    public final C0472a2 H() {
        return this.f5152h;
    }

    public final C0472a2 I() {
        return this.f5151g;
    }

    public final C0472a2 J() {
        return this.f5156l;
    }

    public final C0472a2 K() {
        return this.f5158n;
    }

    public final C0472a2 L() {
        return this.f5153i;
    }

    public final C0472a2 M() {
        return this.f5155k;
    }

    public final C0472a2 N() {
        return this.f5154j;
    }

    public final String O() {
        Pair a7;
        if (i().f5387d == null || (a7 = i().f5387d.a()) == null || a7 == C0549l2.f5385z) {
            return null;
        }
        return String.valueOf(a7.second) + ":" + ((String) a7.first);
    }

    public final String P() {
        String str;
        synchronized (this) {
            try {
                if (this.f5149e == null) {
                    this.f5149e = this.f5424a.O() != null ? this.f5424a.O() : "FA";
                }
                AbstractC0328n.i(this.f5149e);
                str = this.f5149e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
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

    @Override // R2.AbstractC0550l3
    public final boolean s() {
        return false;
    }

    public final void y(int i7, String str) {
        Log.println(i7, P(), str);
    }

    public final void z(int i7, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z7 && C(i7)) {
            y(i7, x(false, str, obj, obj2, obj3));
        }
        if (z8 || i7 < 5) {
            return;
        }
        AbstractC0328n.i(str);
        G2 G6 = this.f5424a.G();
        if (G6 == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (G6.r()) {
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= 9) {
                    i7 = 8;
                }
                G6.D(new RunnableC0479b2(this, i7, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        y(6, str2);
    }
}
