package e7;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class a1 extends d3 {

    /* renamed from: d, reason: collision with root package name */
    public char f4058d;

    /* renamed from: e, reason: collision with root package name */
    public long f4059e;
    public String f;

    /* renamed from: o, reason: collision with root package name */
    public final b1 f4060o;

    /* renamed from: p, reason: collision with root package name */
    public final b1 f4061p;

    /* renamed from: q, reason: collision with root package name */
    public final b1 f4062q;

    /* renamed from: r, reason: collision with root package name */
    public final b1 f4063r;

    /* renamed from: s, reason: collision with root package name */
    public final b1 f4064s;
    public final b1 t;

    /* renamed from: u, reason: collision with root package name */
    public final b1 f4065u;

    /* renamed from: v, reason: collision with root package name */
    public final b1 f4066v;

    /* renamed from: w, reason: collision with root package name */
    public final b1 f4067w;

    public a1(j2 j2Var) {
        super(j2Var);
        this.f4058d = (char) 0;
        this.f4059e = -1L;
        this.f4060o = new b1(this, 6, false, false);
        this.f4061p = new b1(this, 6, true, false);
        this.f4062q = new b1(this, 6, false, true);
        this.f4063r = new b1(this, 5, false, false);
        this.f4064s = new b1(this, 5, true, false);
        this.t = new b1(this, 5, false, true);
        this.f4065u = new b1(this, 4, false, false);
        this.f4066v = new b1(this, 3, false, false);
        this.f4067w = new b1(this, 2, false, false);
    }

    public static e1 p(String str) {
        if (str == null) {
            return null;
        }
        return new e1(str);
    }

    public static String q(Object obj, boolean z10) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            long abs = Math.abs(l10.longValue());
            String valueOf = String.valueOf(obj);
            if (abs < 100) {
                return valueOf;
            }
            String str = valueOf.charAt(0) == '-' ? "-" : "";
            String valueOf2 = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf2.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf2.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof e1 ? ((e1) obj).f4157a : z10 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String canonicalName = j2.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static String r(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String q10 = q(obj, z10);
        String q11 = q(obj2, z10);
        String q12 = q(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(q10)) {
            sb2.append(str2);
            sb2.append(q10);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(q11)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(q11);
        }
        if (!TextUtils.isEmpty(q12)) {
            sb2.append(str3);
            sb2.append(q12);
        }
        return sb2.toString();
    }

    public final String A() {
        long abs;
        Pair<String, Long> pair;
        if (j().f4456o == null) {
            return null;
        }
        p1 p1Var = j().f4456o;
        p1Var.f4560e.l();
        p1Var.f4560e.l();
        long j10 = p1Var.f4560e.v().getLong(p1Var.f4556a, 0L);
        if (j10 == 0) {
            p1Var.a();
            abs = 0;
        } else {
            ((b.z) p1Var.f4560e.zzb()).getClass();
            abs = Math.abs(j10 - System.currentTimeMillis());
        }
        long j11 = p1Var.f4559d;
        if (abs >= j11) {
            if (abs <= (j11 << 1)) {
                String string = p1Var.f4560e.v().getString(p1Var.f4558c, null);
                long j12 = p1Var.f4560e.v().getLong(p1Var.f4557b, 0L);
                p1Var.a();
                pair = (string == null || j12 <= 0) ? l1.J : new Pair<>(string, Long.valueOf(j12));
                if (pair != null || pair == l1.J) {
                    return null;
                }
                return defpackage.g.e(String.valueOf(pair.second), ":", (String) pair.first);
            }
            p1Var.a();
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    public final String B() {
        String str;
        synchronized (this) {
            if (this.f == null) {
                Object obj = this.f3407b;
                this.f = ((j2) obj).f4363d != null ? ((j2) obj).f4363d : "FA";
            }
            m6.j.i(this.f);
            str = this.f;
        }
        return str;
    }

    @Override // e7.d3
    public final boolean o() {
        return false;
    }

    public final void s(int i10, String str) {
        Log.println(i10, B(), str);
    }

    public final void t(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z10 && u(i10)) {
            s(i10, r(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        m6.j.i(str);
        e2 e2Var = ((j2) this.f3407b).f4368r;
        if (e2Var == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (e2Var.f4148c) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                e2Var.u(new c1(this, i10, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        s(6, str2);
    }

    public final boolean u(int i10) {
        return Log.isLoggable(B(), i10);
    }

    public final b1 v() {
        return this.f4066v;
    }

    public final b1 w() {
        return this.f4060o;
    }

    public final b1 x() {
        return this.f4067w;
    }

    public final b1 y() {
        return this.f4063r;
    }

    public final b1 z() {
        return this.t;
    }
}
