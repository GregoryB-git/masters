package F4;

import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f1984c;

    /* renamed from: a, reason: collision with root package name */
    public final c f1985a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1986b;

    public a() {
        this(null);
    }

    public static a e() {
        if (f1984c == null) {
            synchronized (a.class) {
                try {
                    if (f1984c == null) {
                        f1984c = new a();
                    }
                } finally {
                }
            }
        }
        return f1984c;
    }

    public void a(String str) {
        if (this.f1986b) {
            this.f1985a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f1986b) {
            this.f1985a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f1986b) {
            this.f1985a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f1986b) {
            this.f1985a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f1986b) {
            this.f1985a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f1986b) {
            this.f1985a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f1986b;
    }

    public void i(boolean z7) {
        this.f1986b = z7;
    }

    public void j(String str) {
        if (this.f1986b) {
            this.f1985a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f1986b) {
            this.f1985a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public a(c cVar) {
        this.f1986b = false;
        this.f1985a = cVar == null ? c.c() : cVar;
    }
}
