package I3;

import java.io.File;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2516c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final M3.g f2517a;

    /* renamed from: b, reason: collision with root package name */
    public I3.a f2518b;

    public c(M3.g gVar) {
        this.f2517a = gVar;
        this.f2518b = f2516c;
    }

    public void a() {
        this.f2518b.d();
    }

    public byte[] b() {
        return this.f2518b.c();
    }

    public String c() {
        return this.f2518b.b();
    }

    public final File d(String str) {
        return this.f2517a.o(str, "userlog");
    }

    public final void e(String str) {
        this.f2518b.a();
        this.f2518b = f2516c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i7) {
        this.f2518b = new f(file, i7);
    }

    public void g(long j7, String str) {
        this.f2518b.e(j7, str);
    }

    public c(M3.g gVar, String str) {
        this(gVar);
        e(str);
    }

    public static final class b implements I3.a {
        public b() {
        }

        @Override // I3.a
        public String b() {
            return null;
        }

        @Override // I3.a
        public byte[] c() {
            return null;
        }

        @Override // I3.a
        public void a() {
        }

        @Override // I3.a
        public void d() {
        }

        @Override // I3.a
        public void e(long j7, String str) {
        }
    }
}
