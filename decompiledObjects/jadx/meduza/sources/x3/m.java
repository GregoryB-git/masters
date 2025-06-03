package x3;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import v3.e1;
import v3.i0;
import x3.f;

/* loaded from: classes.dex */
public interface m {

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f16988a;

        public a(String str, i0 i0Var) {
            super(str);
            this.f16988a = i0Var;
        }

        public a(f.b bVar, i0 i0Var) {
            super(bVar);
            this.f16988a = i0Var;
        }
    }

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f16989a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16990b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, v3.i0 r8, boolean r9, java.lang.RuntimeException r10) {
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
                r3.f16989a = r4
                r3.f16990b = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.m.b.<init>(int, int, int, int, v3.i0, boolean, java.lang.RuntimeException):void");
        }
    }

    public interface c {
    }

    public static final class d extends Exception {
        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
        }
    }

    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f16991a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16992b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f16993c;

        public e(int i10, i0 i0Var, boolean z10) {
            super(defpackage.f.h("AudioTrack write failed: ", i10));
            this.f16992b = z10;
            this.f16991a = i10;
            this.f16993c = i0Var;
        }
    }

    boolean a(i0 i0Var);

    void b();

    void c(e1 e1Var);

    boolean d();

    void e(i0 i0Var, int[] iArr);

    e1 f();

    void flush();

    void g();

    boolean h();

    void i(int i10);

    void j(p pVar);

    boolean k(long j10, ByteBuffer byteBuffer, int i10);

    long l(boolean z10);

    void m();

    void n();

    void o(float f);

    void p(w3.a0 a0Var);

    void pause();

    void q();

    void r();

    void reset();

    void s(x3.d dVar);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void t(boolean z10);

    int u(i0 i0Var);
}
