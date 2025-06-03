package E3;

import android.util.Log;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f1632c = new f("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    public final String f1633a;

    /* renamed from: b, reason: collision with root package name */
    public int f1634b = 4;

    public f(String str) {
        this.f1633a = str;
    }

    public static f f() {
        return f1632c;
    }

    public final boolean a(int i7) {
        return this.f1634b <= i7 || Log.isLoggable(this.f1633a, i7);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f1633a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f1633a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f1633a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f1633a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f1633a, str, th);
        }
    }
}
