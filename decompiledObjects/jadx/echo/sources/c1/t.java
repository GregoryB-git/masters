package c1;

import d0.C1194q;
import g0.InterfaceC1303g;

/* loaded from: classes.dex */
public interface t {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10046a = new C0169a();

        /* renamed from: c1.t$a$a, reason: collision with other inner class name */
        public class C0169a implements a {
            @Override // c1.t.a
            public boolean a(C1194q c1194q) {
                return false;
            }

            @Override // c1.t.a
            public t b(C1194q c1194q) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // c1.t.a
            public int c(C1194q c1194q) {
                return 1;
            }
        }

        boolean a(C1194q c1194q);

        t b(C1194q c1194q);

        int c(C1194q c1194q);
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f10047c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f10048a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10049b;

        public b(long j7, boolean z7) {
            this.f10048a = j7;
            this.f10049b = z7;
        }

        public static b b() {
            return f10047c;
        }

        public static b c(long j7) {
            return new b(j7, true);
        }
    }

    k a(byte[] bArr, int i7, int i8);

    void b();

    void c(byte[] bArr, int i7, int i8, b bVar, InterfaceC1303g interfaceC1303g);

    int d();
}
