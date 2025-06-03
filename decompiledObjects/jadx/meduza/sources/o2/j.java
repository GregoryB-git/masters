package o2;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11719a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile j f11720b;

    public static class a extends j {

        /* renamed from: c, reason: collision with root package name */
        public final int f11721c;

        public a(int i10) {
            this.f11721c = i10;
        }

        @Override // o2.j
        public final void a(String str, String str2) {
            if (this.f11721c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // o2.j
        public final void b(String str, String str2) {
            if (this.f11721c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // o2.j
        public final void c(String str, String str2, Throwable th) {
            if (this.f11721c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // o2.j
        public final void e(String str, String str2) {
            if (this.f11721c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // o2.j
        public final void g(String str, String str2) {
            if (this.f11721c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static j d() {
        j jVar;
        synchronized (f11719a) {
            if (f11720b == null) {
                f11720b = new a(3);
            }
            jVar = f11720b;
        }
        return jVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2);

    public abstract void c(String str, String str2, Throwable th);

    public abstract void e(String str, String str2);

    public abstract void g(String str, String str2);
}
