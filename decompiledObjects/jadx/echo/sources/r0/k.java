package r0;

import B0.m;
import android.net.Uri;
import java.io.IOException;
import x0.InterfaceC2117E;

/* loaded from: classes.dex */
public interface k {

    public interface a {
        k a(q0.g gVar, m mVar, j jVar);
    }

    public interface b {
        void a();

        boolean e(Uri uri, m.c cVar, boolean z7);
    }

    public static final class c extends IOException {

        /* renamed from: o, reason: collision with root package name */
        public final Uri f19073o;

        public c(Uri uri) {
            this.f19073o = uri;
        }
    }

    public static final class d extends IOException {

        /* renamed from: o, reason: collision with root package name */
        public final Uri f19074o;

        public d(Uri uri) {
            this.f19074o = uri;
        }
    }

    public interface e {
        void b(f fVar);
    }

    boolean a();

    g b();

    boolean c(Uri uri, long j7);

    boolean d(Uri uri);

    void e(Uri uri, InterfaceC2117E.a aVar, e eVar);

    void f();

    void g(Uri uri);

    void h(Uri uri);

    void i(Uri uri);

    void j(b bVar);

    f k(Uri uri, boolean z7);

    void l(b bVar);

    long m();

    void stop();
}
