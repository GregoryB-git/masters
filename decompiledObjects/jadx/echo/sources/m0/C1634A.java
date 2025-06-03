package m0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: m0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634A {

    /* renamed from: a, reason: collision with root package name */
    public final a f17317a;

    /* renamed from: b, reason: collision with root package name */
    public int f17318b;

    /* renamed from: c, reason: collision with root package name */
    public long f17319c;

    /* renamed from: d, reason: collision with root package name */
    public long f17320d;

    /* renamed from: e, reason: collision with root package name */
    public long f17321e;

    /* renamed from: f, reason: collision with root package name */
    public long f17322f;

    /* renamed from: m0.A$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f17323a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f17324b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f17325c;

        /* renamed from: d, reason: collision with root package name */
        public long f17326d;

        /* renamed from: e, reason: collision with root package name */
        public long f17327e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f17328f;

        /* renamed from: g, reason: collision with root package name */
        public long f17329g;

        public a(AudioTrack audioTrack) {
            this.f17323a = audioTrack;
        }

        public void a() {
            this.f17328f = true;
        }

        public long b() {
            return this.f17327e;
        }

        public long c() {
            return this.f17324b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f17323a.getTimestamp(this.f17324b);
            if (timestamp) {
                long j7 = this.f17324b.framePosition;
                long j8 = this.f17326d;
                if (j8 > j7) {
                    if (this.f17328f) {
                        this.f17329g += j8;
                        this.f17328f = false;
                    } else {
                        this.f17325c++;
                    }
                }
                this.f17326d = j7;
                this.f17327e = j7 + this.f17329g + (this.f17325c << 32);
            }
            return timestamp;
        }
    }

    public C1634A(AudioTrack audioTrack) {
        this.f17317a = new a(audioTrack);
        h();
    }

    public void a() {
        if (this.f17318b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f17317a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f17317a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f17317a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f17318b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(long r7) {
        /*
            r6 = this;
            m0.A$a r0 = r6.f17317a
            r1 = 0
            if (r0 == 0) goto L70
            long r2 = r6.f17321e
            long r2 = r7 - r2
            long r4 = r6.f17320d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L10
            goto L70
        L10:
            r6.f17321e = r7
            boolean r0 = r0.d()
            int r2 = r6.f17318b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L48
            r7 = 2
            if (r2 == r4) goto L36
            if (r2 == r7) goto L33
            if (r2 == r3) goto L2d
            r7 = 4
            if (r2 != r7) goto L27
            goto L6f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L2d:
            if (r0 == 0) goto L6f
        L2f:
            r6.h()
            goto L6f
        L33:
            if (r0 != 0) goto L6f
            goto L2f
        L36:
            if (r0 == 0) goto L2f
            m0.A$a r8 = r6.f17317a
            long r1 = r8.b()
            long r3 = r6.f17322f
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L6f
            r6.i(r7)
            goto L6f
        L48:
            if (r0 == 0) goto L62
            m0.A$a r7 = r6.f17317a
            long r7 = r7.c()
            long r2 = r6.f17319c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L70
            m0.A$a r7 = r6.f17317a
            long r7 = r7.b()
            r6.f17322f = r7
            r6.i(r4)
            goto L6f
        L62:
            long r1 = r6.f17319c
            long r7 = r7 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L6f
            r6.i(r3)
        L6f:
            r1 = r0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C1634A.f(long):boolean");
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f17317a != null) {
            i(0);
        }
    }

    public final void i(int i7) {
        this.f17318b = i7;
        long j7 = 10000;
        if (i7 == 0) {
            this.f17321e = 0L;
            this.f17322f = -1L;
            this.f17319c = System.nanoTime() / 1000;
        } else if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                j7 = 10000000;
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                j7 = 500000;
            }
        }
        this.f17320d = j7;
    }
}
