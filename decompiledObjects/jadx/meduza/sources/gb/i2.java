package gb;

import eb.j;
import gb.n3;
import gb.v2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* loaded from: classes.dex */
public final class i2 implements Closeable, a0 {
    public volatile boolean A;

    /* renamed from: a, reason: collision with root package name */
    public a f6505a;

    /* renamed from: b, reason: collision with root package name */
    public int f6506b;

    /* renamed from: c, reason: collision with root package name */
    public final l3 f6507c;

    /* renamed from: d, reason: collision with root package name */
    public final r3 f6508d;

    /* renamed from: e, reason: collision with root package name */
    public eb.r f6509e;
    public w0 f;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f6510o;

    /* renamed from: p, reason: collision with root package name */
    public int f6511p;

    /* renamed from: q, reason: collision with root package name */
    public int f6512q;

    /* renamed from: r, reason: collision with root package name */
    public int f6513r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6514s;
    public w t;

    /* renamed from: u, reason: collision with root package name */
    public w f6515u;

    /* renamed from: v, reason: collision with root package name */
    public long f6516v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6517w;

    /* renamed from: x, reason: collision with root package name */
    public int f6518x;

    /* renamed from: y, reason: collision with root package name */
    public int f6519y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6520z;

    public interface a {
        void a(n3.a aVar);

        void c(boolean z10);

        void d(int i10);

        void e(Throwable th);
    }

    public static class b implements n3.a {

        /* renamed from: a, reason: collision with root package name */
        public InputStream f6521a;

        public b(InputStream inputStream) {
            this.f6521a = inputStream;
        }

        @Override // gb.n3.a
        public final InputStream next() {
            InputStream inputStream = this.f6521a;
            this.f6521a = null;
            return inputStream;
        }
    }

    public static final class c extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        public final int f6522a;

        /* renamed from: b, reason: collision with root package name */
        public final l3 f6523b;

        /* renamed from: c, reason: collision with root package name */
        public long f6524c;

        /* renamed from: d, reason: collision with root package name */
        public long f6525d;

        /* renamed from: e, reason: collision with root package name */
        public long f6526e;

        public c(InputStream inputStream, int i10, l3 l3Var) {
            super(inputStream);
            this.f6526e = -1L;
            this.f6522a = i10;
            this.f6523b = l3Var;
        }

        public final void f() {
            long j10 = this.f6525d;
            long j11 = this.f6524c;
            if (j10 > j11) {
                long j12 = j10 - j11;
                for (m.e eVar : this.f6523b.f6593a) {
                    eVar.i(j12);
                }
                this.f6524c = this.f6525d;
            }
        }

        public final void g() {
            if (this.f6525d <= this.f6522a) {
                return;
            }
            eb.e1 e1Var = eb.e1.f5075k;
            StringBuilder l10 = defpackage.f.l("Decompressed gRPC message exceeds maximum size ");
            l10.append(this.f6522a);
            throw new eb.g1(e1Var.g(l10.toString()));
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f6526e = this.f6525d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f6525d++;
            }
            g();
            f();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (read != -1) {
                this.f6525d += read;
            }
            g();
            f();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f6526e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f6525d = this.f6526e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(j10);
            this.f6525d += skip;
            g();
            f();
            return skip;
        }
    }

    public i2(a aVar, int i10, l3 l3Var, r3 r3Var) {
        j.b bVar = j.b.f5135a;
        this.f6512q = 1;
        this.f6513r = 5;
        this.f6515u = new w();
        this.f6517w = false;
        this.f6518x = -1;
        this.f6520z = false;
        this.A = false;
        x6.b.y(aVar, "sink");
        this.f6505a = aVar;
        this.f6509e = bVar;
        this.f6506b = i10;
        this.f6507c = l3Var;
        x6.b.y(r3Var, "transportTracer");
        this.f6508d = r3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x0007, B:5:0x000d, B:10:0x0017, B:12:0x001b, B:25:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    @Override // gb.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(gb.u2 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "data"
            x6.b.y(r7, r0)
            r0 = 0
            r1 = 1
            boolean r2 = r6.isClosed()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L14
            boolean r2 = r6.f6520z     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 != 0) goto L36
            gb.w0 r2 = r6.f     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            boolean r3 = r2.f6874q     // Catch: java.lang.Throwable -> L3d
            r3 = r3 ^ r1
            java.lang.String r4 = "GzipInflatingBuffer is closed"
            x6.b.I(r3, r4)     // Catch: java.lang.Throwable -> L3d
            gb.w r3 = r2.f6867a     // Catch: java.lang.Throwable -> L3d
            r3.g(r7)     // Catch: java.lang.Throwable -> L3d
            r2.f6879w = r0     // Catch: java.lang.Throwable -> L3d
            goto L30
        L2b:
            gb.w r2 = r6.f6515u     // Catch: java.lang.Throwable -> L3d
            r2.g(r7)     // Catch: java.lang.Throwable -> L3d
        L30:
            r6.M()     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r1 = move-exception
            goto L41
        L36:
            r0 = r1
        L37:
            if (r0 == 0) goto L3c
            r7.close()
        L3c:
            return
        L3d:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L41:
            if (r0 == 0) goto L46
            r7.close()
        L46:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.i2.C(gb.u2):void");
    }

    @Override // gb.a0
    public final void H() {
        boolean z10;
        if (isClosed()) {
            return;
        }
        w0 w0Var = this.f;
        if (w0Var != null) {
            x6.b.I(!w0Var.f6874q, "GzipInflatingBuffer is closed");
            z10 = w0Var.f6879w;
        } else {
            z10 = this.f6515u.f6865c == 0;
        }
        if (z10) {
            close();
        } else {
            this.f6520z = true;
        }
    }

    @Override // gb.a0
    public final void I(eb.r rVar) {
        x6.b.I(this.f == null, "Already set full stream decompressor");
        this.f6509e = rVar;
    }

    public final void M() {
        if (this.f6517w) {
            return;
        }
        boolean z10 = true;
        this.f6517w = true;
        while (!this.A && this.f6516v > 0 && c0()) {
            try {
                int c10 = q0.g.c(this.f6512q);
                if (c10 == 0) {
                    b0();
                } else {
                    if (c10 != 1) {
                        throw new AssertionError("Invalid state: " + defpackage.g.o(this.f6512q));
                    }
                    Q();
                    this.f6516v--;
                }
            } catch (Throwable th) {
                this.f6517w = false;
                throw th;
            }
        }
        if (this.A) {
            close();
            this.f6517w = false;
            return;
        }
        if (this.f6520z) {
            w0 w0Var = this.f;
            if (w0Var != null) {
                x6.b.I(true ^ w0Var.f6874q, "GzipInflatingBuffer is closed");
                z10 = w0Var.f6879w;
            } else if (this.f6515u.f6865c != 0) {
                z10 = false;
            }
            if (z10) {
                close();
            }
        }
        this.f6517w = false;
    }

    public final void Q() {
        InputStream aVar;
        l3 l3Var = this.f6507c;
        int i10 = this.f6518x;
        long j10 = this.f6519y;
        for (m.e eVar : l3Var.f6593a) {
            eVar.h(i10, j10);
        }
        this.f6519y = 0;
        if (this.f6514s) {
            eb.r rVar = this.f6509e;
            if (rVar == j.b.f5135a) {
                throw new eb.g1(eb.e1.f5077m.g("Can't decode compressed gRPC message as compression not configured"));
            }
            try {
                w wVar = this.t;
                v2.b bVar = v2.f6853a;
                aVar = new c(rVar.c(new v2.a(wVar)), this.f6506b, this.f6507c);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            l3 l3Var2 = this.f6507c;
            long j11 = this.t.f6865c;
            for (m.e eVar2 : l3Var2.f6593a) {
                eVar2.i(j11);
            }
            w wVar2 = this.t;
            v2.b bVar2 = v2.f6853a;
            aVar = new v2.a(wVar2);
        }
        this.t.getClass();
        this.t = null;
        this.f6505a.a(new b(aVar));
        this.f6512q = 1;
        this.f6513r = 5;
    }

    public final void b0() {
        int readUnsignedByte = this.t.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw new eb.g1(eb.e1.f5077m.g("gRPC frame header malformed: reserved bits not zero"));
        }
        this.f6514s = (readUnsignedByte & 1) != 0;
        w wVar = this.t;
        wVar.f(4);
        int readUnsignedByte2 = wVar.readUnsignedByte() | (wVar.readUnsignedByte() << 24) | (wVar.readUnsignedByte() << 16) | (wVar.readUnsignedByte() << 8);
        this.f6513r = readUnsignedByte2;
        if (readUnsignedByte2 < 0 || readUnsignedByte2 > this.f6506b) {
            throw new eb.g1(eb.e1.f5075k.g(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f6506b), Integer.valueOf(this.f6513r))));
        }
        int i10 = this.f6518x + 1;
        this.f6518x = i10;
        for (m.e eVar : this.f6507c.f6593a) {
            eVar.g(i10);
        }
        r3 r3Var = this.f6508d;
        r3Var.f6801b.b();
        r3Var.f6800a.a();
        this.f6512q = 2;
    }

    public final boolean c0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        try {
            if (this.t == null) {
                this.t = new w();
            }
            int i16 = 0;
            i10 = 0;
            while (true) {
                try {
                    int i17 = this.f6513r - this.t.f6865c;
                    if (i17 <= 0) {
                        if (i16 > 0) {
                            this.f6505a.d(i16);
                            if (this.f6512q == 2) {
                                if (this.f != null) {
                                    this.f6507c.a(i10);
                                    i12 = this.f6519y + i10;
                                } else {
                                    this.f6507c.a(i16);
                                    i12 = this.f6519y + i16;
                                }
                                this.f6519y = i12;
                            }
                        }
                        return true;
                    }
                    if (this.f != null) {
                        try {
                            byte[] bArr = this.f6510o;
                            if (bArr == null || this.f6511p == bArr.length) {
                                this.f6510o = new byte[Math.min(i17, 2097152)];
                                this.f6511p = 0;
                            }
                            int f = this.f.f(this.f6510o, this.f6511p, Math.min(i17, this.f6510o.length - this.f6511p));
                            w0 w0Var = this.f;
                            int i18 = w0Var.f6877u;
                            w0Var.f6877u = 0;
                            i16 += i18;
                            int i19 = w0Var.f6878v;
                            w0Var.f6878v = 0;
                            i10 += i19;
                            if (f == 0) {
                                if (i16 > 0) {
                                    this.f6505a.d(i16);
                                    if (this.f6512q == 2) {
                                        if (this.f != null) {
                                            this.f6507c.a(i10);
                                            i14 = this.f6519y + i10;
                                        } else {
                                            this.f6507c.a(i16);
                                            i14 = this.f6519y + i16;
                                        }
                                        this.f6519y = i14;
                                    }
                                }
                                return false;
                            }
                            w wVar = this.t;
                            byte[] bArr2 = this.f6510o;
                            int i20 = this.f6511p;
                            v2.b bVar = v2.f6853a;
                            wVar.g(new v2.b(bArr2, i20, f));
                            this.f6511p += f;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        int i21 = this.f6515u.f6865c;
                        if (i21 == 0) {
                            if (i16 > 0) {
                                this.f6505a.d(i16);
                                if (this.f6512q == 2) {
                                    if (this.f != null) {
                                        this.f6507c.a(i10);
                                        i13 = this.f6519y + i10;
                                    } else {
                                        this.f6507c.a(i16);
                                        i13 = this.f6519y + i16;
                                    }
                                    this.f6519y = i13;
                                }
                            }
                            return false;
                        }
                        int min = Math.min(i17, i21);
                        i16 += min;
                        this.t.g(this.f6515u.r(min));
                    }
                } catch (Throwable th) {
                    int i22 = i16;
                    th = th;
                    i15 = i22;
                    if (i15 > 0) {
                        this.f6505a.d(i15);
                        if (this.f6512q == 2) {
                            if (this.f != null) {
                                this.f6507c.a(i10);
                                i11 = this.f6519y + i10;
                            } else {
                                this.f6507c.a(i15);
                                i11 = this.f6519y + i15;
                            }
                            this.f6519y = i11;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r0 == false) goto L24;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable, gb.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r6 = this;
            boolean r0 = r6.isClosed()
            if (r0 == 0) goto L7
            return
        L7:
            gb.w r0 = r6.t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            int r0 = r0.f6865c
            if (r0 <= 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            r3 = 0
            gb.w0 r4 = r6.f     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L3c
            if (r0 != 0) goto L35
            boolean r0 = r4.f6874q     // Catch: java.lang.Throwable -> L56
            r0 = r0 ^ r2
            java.lang.String r5 = "GzipInflatingBuffer is closed"
            x6.b.I(r0, r5)     // Catch: java.lang.Throwable -> L56
            gb.w0$a r0 = r4.f6869c     // Catch: java.lang.Throwable -> L56
            int r0 = r0.d()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L32
            int r0 = r4.f6873p     // Catch: java.lang.Throwable -> L56
            if (r0 == r2) goto L30
            goto L32
        L30:
            r0 = r1
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == 0) goto L36
        L35:
            r1 = r2
        L36:
            gb.w0 r0 = r6.f     // Catch: java.lang.Throwable -> L56
            r0.close()     // Catch: java.lang.Throwable -> L56
            r0 = r1
        L3c:
            gb.w r1 = r6.f6515u     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Throwable -> L56
        L43:
            gb.w r1 = r6.t     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.lang.Throwable -> L56
        L4a:
            r6.f = r3
            r6.f6515u = r3
            r6.t = r3
            gb.i2$a r1 = r6.f6505a
            r1.c(r0)
            return
        L56:
            r0 = move-exception
            r6.f = r3
            r6.f6515u = r3
            r6.t = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.i2.close():void");
    }

    @Override // gb.a0
    public final void f(int i10) {
        x6.b.s("numMessages must be > 0", i10 > 0);
        if (isClosed()) {
            return;
        }
        this.f6516v += i10;
        M();
    }

    @Override // gb.a0
    public final void g(int i10) {
        this.f6506b = i10;
    }

    public final boolean isClosed() {
        return this.f6515u == null && this.f == null;
    }
}
