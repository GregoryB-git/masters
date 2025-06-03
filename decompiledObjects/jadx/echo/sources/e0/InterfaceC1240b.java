package e0;

import W2.k;
import d0.C1194q;
import g0.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1240b {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f13675a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: e0.b$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f13676e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f13677a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13678b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13679c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13680d;

        public a(int i7, int i8, int i9) {
            this.f13677a = i7;
            this.f13678b = i8;
            this.f13679c = i9;
            this.f13680d = M.A0(i9) ? M.g0(i9, i8) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13677a == aVar.f13677a && this.f13678b == aVar.f13678b && this.f13679c == aVar.f13679c;
        }

        public int hashCode() {
            return k.b(Integer.valueOf(this.f13677a), Integer.valueOf(this.f13678b), Integer.valueOf(this.f13679c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f13677a + ", channelCount=" + this.f13678b + ", encoding=" + this.f13679c + ']';
        }

        public a(C1194q c1194q) {
            this(c1194q.f12703C, c1194q.f12702B, c1194q.f12704D);
        }
    }

    /* renamed from: e0.b$b, reason: collision with other inner class name */
    public static final class C0195b extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final a f13681o;

        public C0195b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public C0195b(String str, a aVar) {
            super(str + " " + aVar);
            this.f13681o = aVar;
        }
    }

    boolean a();

    void b();

    boolean c();

    ByteBuffer d();

    void e();

    void f(ByteBuffer byteBuffer);

    void flush();

    a g(a aVar);
}
