package x2;

import android.util.Log;

/* renamed from: x2.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2185O {

    /* renamed from: e, reason: collision with root package name */
    public static final C2185O f21160e = new C2185O(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21162b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f21163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21164d;

    public C2185O(boolean z7, int i7, int i8, String str, Throwable th) {
        this.f21161a = z7;
        this.f21164d = i7;
        this.f21162b = str;
        this.f21163c = th;
    }

    public static C2185O b() {
        return f21160e;
    }

    public static C2185O c(String str) {
        return new C2185O(false, 1, 5, str, null);
    }

    public static C2185O d(String str, Throwable th) {
        return new C2185O(false, 1, 5, str, th);
    }

    public static C2185O f(int i7) {
        return new C2185O(true, i7, 1, null, null);
    }

    public static C2185O g(int i7, int i8, String str, Throwable th) {
        return new C2185O(false, i7, i8, str, th);
    }

    public String a() {
        return this.f21162b;
    }

    public final void e() {
        if (this.f21161a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f21163c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f21163c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
