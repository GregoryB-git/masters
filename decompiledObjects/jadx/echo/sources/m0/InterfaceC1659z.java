package m0;

import android.media.AudioDeviceInfo;
import d0.C1164C;
import d0.C1179b;
import d0.C1182e;
import d0.C1194q;
import g0.InterfaceC1299c;
import java.nio.ByteBuffer;
import l0.y1;

/* renamed from: m0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1659z {

    /* renamed from: m0.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17610a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17611b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17612c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f17613d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f17614e;

        /* renamed from: f, reason: collision with root package name */
        public final int f17615f;

        public a(int i7, int i8, int i9, boolean z7, boolean z8, int i10) {
            this.f17610a = i7;
            this.f17611b = i8;
            this.f17612c = i9;
            this.f17613d = z7;
            this.f17614e = z8;
            this.f17615f = i10;
        }
    }

    /* renamed from: m0.z$b */
    public static final class b extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final C1194q f17616o;

        public b(String str, C1194q c1194q) {
            super(str);
            this.f17616o = c1194q;
        }

        public b(Throwable th, C1194q c1194q) {
            super(th);
            this.f17616o = c1194q;
        }
    }

    /* renamed from: m0.z$c */
    public static final class c extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final int f17617o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f17618p;

        /* renamed from: q, reason: collision with root package name */
        public final C1194q f17619q;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(int r4, int r5, int r6, int r7, d0.C1194q r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", "
                r0.append(r5)
                r0.append(r6)
                r0.append(r5)
                r0.append(r7)
                java.lang.String r5 = ")"
                r0.append(r5)
                r0.append(r1)
                r0.append(r8)
                if (r9 == 0) goto L38
                java.lang.String r5 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r5 = ""
            L3a:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r3.<init>(r5, r10)
                r3.f17617o = r4
                r3.f17618p = r9
                r3.f17619q = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.InterfaceC1659z.c.<init>(int, int, int, int, d0.q, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: m0.z$d */
    public interface d {
        void a(a aVar);

        void b(long j7);

        void c(boolean z7);

        void d(Exception exc);

        void e(a aVar);

        void f();

        void g();

        void h();

        void i();

        void j();

        void k(int i7, long j7, long j8);
    }

    /* renamed from: m0.z$e */
    public static final class e extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final long f17620o;

        /* renamed from: p, reason: collision with root package name */
        public final long f17621p;

        public e(long j7, long j8) {
            super("Unexpected audio track timestamp discontinuity: expected " + j8 + ", got " + j7);
            this.f17620o = j7;
            this.f17621p = j8;
        }
    }

    /* renamed from: m0.z$f */
    public static final class f extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final int f17622o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f17623p;

        /* renamed from: q, reason: collision with root package name */
        public final C1194q f17624q;

        public f(int i7, C1194q c1194q, boolean z7) {
            super("AudioTrack write failed: " + i7);
            this.f17623p = z7;
            this.f17622o = i7;
            this.f17624q = c1194q;
        }
    }

    void A(InterfaceC1299c interfaceC1299c);

    void B();

    void C(d dVar);

    boolean a(C1194q c1194q);

    void b();

    boolean c();

    void d(boolean z7);

    void e();

    void f(AudioDeviceInfo audioDeviceInfo);

    void flush();

    void g();

    C1164C h();

    boolean i();

    void j();

    void k(C1164C c1164c);

    void l(float f7);

    void m(C1182e c1182e);

    void n(int i7);

    int o(C1194q c1194q);

    void p();

    void q(int i7, int i8);

    C1645k r(C1194q c1194q);

    void release();

    void s(C1179b c1179b);

    void t(y1 y1Var);

    boolean u(ByteBuffer byteBuffer, long j7, int i7);

    void v(int i7);

    long w(boolean z7);

    void x();

    void y(long j7);

    void z(C1194q c1194q, int i7, int[] iArr);
}
