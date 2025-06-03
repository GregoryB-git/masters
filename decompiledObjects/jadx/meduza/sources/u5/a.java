package u5;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: u5.a$a, reason: collision with other inner class name */
    public static class C0242a extends IOException {
        public C0242a(String str) {
            super(str);
        }

        public C0242a(String str, IOException iOException) {
            super(str, iOException);
        }

        public C0242a(Throwable th) {
            super(th);
        }
    }

    public interface b {
        void a(g gVar);

        void d(a aVar, g gVar);

        void e(a aVar, g gVar, r rVar);
    }

    r a(long j10, long j11, String str);

    void b(g gVar);

    m c(String str);

    long d(long j10, long j11, String str);

    File e(long j10, long j11, String str);

    void f(String str, l lVar);

    void g(g gVar);

    void h(File file, long j10);

    long i();

    long j(long j10, long j11, String str);

    r k(long j10, long j11, String str);
}
