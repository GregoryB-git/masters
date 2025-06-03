package jb;

import c4.x;
import eb.e1;
import eb.s0;
import gb.b1;
import gb.t;
import gb.u;
import gb.v0;
import gb.z0;
import hb.i;
import hb.j;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import jb.b;
import jb.e;
import xc.i;
import xc.r;
import xc.s;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f8761a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final i f8762b;

    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final xc.h f8763a;

        /* renamed from: b, reason: collision with root package name */
        public int f8764b;

        /* renamed from: c, reason: collision with root package name */
        public byte f8765c;

        /* renamed from: d, reason: collision with root package name */
        public int f8766d;

        /* renamed from: e, reason: collision with root package name */
        public int f8767e;
        public short f;

        public a(s sVar) {
            this.f8763a = sVar;
        }

        @Override // xc.y
        public final z c() {
            return this.f8763a.c();
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // xc.y
        public final long e0(xc.f fVar, long j10) {
            int i10;
            int readInt;
            do {
                int i11 = this.f8767e;
                if (i11 != 0) {
                    long e02 = this.f8763a.e0(fVar, Math.min(j10, i11));
                    if (e02 == -1) {
                        return -1L;
                    }
                    this.f8767e -= (int) e02;
                    return e02;
                }
                this.f8763a.skip(this.f);
                this.f = (short) 0;
                if ((this.f8765c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f8766d;
                xc.h hVar = this.f8763a;
                Logger logger = f.f8761a;
                int readByte = (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
                this.f8767e = readByte;
                this.f8764b = readByte;
                byte readByte2 = (byte) (this.f8763a.readByte() & 255);
                this.f8765c = (byte) (this.f8763a.readByte() & 255);
                Logger logger2 = f.f8761a;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(b.a(true, this.f8766d, this.f8764b, readByte2, this.f8765c));
                }
                readInt = this.f8763a.readInt() & Integer.MAX_VALUE;
                this.f8766d = readInt;
                if (readByte2 != 9) {
                    f.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                    throw null;
                }
            } while (readInt == i10);
            f.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f8768a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f8769b = new String[64];

        /* renamed from: c, reason: collision with root package name */
        public static final String[] f8770c = new String[256];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f8770c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f8769b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i12 = 0; i12 < 1; i12++) {
                int i13 = iArr[i12];
                String[] strArr3 = f8769b;
                strArr3[i13 | 8] = defpackage.g.f(new StringBuilder(), strArr3[i13], "|PADDED");
            }
            String[] strArr4 = f8769b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr2[i14];
                for (int i16 = 0; i16 < 1; i16++) {
                    int i17 = iArr[i16];
                    String[] strArr5 = f8769b;
                    int i18 = i17 | i15;
                    strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strArr5[i17]);
                    sb2.append('|');
                    strArr5[i18 | 8] = defpackage.g.f(sb2, strArr5[i15], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f8769b;
                if (i10 >= strArr6.length) {
                    return;
                }
                if (strArr6[i10] == null) {
                    strArr6[i10] = f8770c[i10];
                }
                i10++;
            }
        }

        public static String a(boolean z10, int i10, int i11, byte b10, byte b11) {
            String str;
            String str2;
            String str3;
            String format = b10 < 10 ? f8768a[b10] : String.format("0x%02x", Byte.valueOf(b10));
            if (b11 == 0) {
                str = "";
            } else {
                if (b10 != 2 && b10 != 3) {
                    if (b10 == 4 || b10 == 6) {
                        str = b11 == 1 ? "ACK" : f8770c[b11];
                    } else if (b10 != 7 && b10 != 8) {
                        String str4 = b11 < 64 ? f8769b[b11] : f8770c[b11];
                        if (b10 == 5 && (b11 & 4) != 0) {
                            str2 = "HEADERS";
                            str3 = "PUSH_PROMISE";
                        } else if (b10 != 0 || (b11 & 32) == 0) {
                            str = str4;
                        } else {
                            str2 = "PRIORITY";
                            str3 = "COMPRESSED";
                        }
                        str = str4.replace(str2, str3);
                    }
                }
                str = f8770c[b11];
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = str;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    public static final class c implements jb.b {

        /* renamed from: a, reason: collision with root package name */
        public final xc.h f8771a;

        /* renamed from: b, reason: collision with root package name */
        public final a f8772b;

        /* renamed from: c, reason: collision with root package name */
        public final e.a f8773c;

        public c(s sVar) {
            this.f8771a = sVar;
            a aVar = new a(sVar);
            this.f8772b = aVar;
            this.f8773c = new e.a(aVar);
        }

        public final void C(b.a aVar, int i10, byte b10, int i11) {
            e1 e1Var = null;
            boolean z10 = false;
            if (i11 == 0) {
                f.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                throw null;
            }
            boolean z11 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f8771a.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                this.f8771a.readInt();
                this.f8771a.readByte();
                aVar.getClass();
                i10 -= 5;
            }
            ArrayList g10 = g(f.c(i10, b10, readByte), readByte, b10, i11);
            i.d dVar = (i.d) aVar;
            j jVar = dVar.f7307a;
            if (jVar.a()) {
                jVar.f7311a.log(jVar.f7312b, a0.j.u(1) + " HEADERS: streamId=" + i11 + " headers=" + g10 + " endStream=" + z11);
            }
            if (hb.i.this.M != Integer.MAX_VALUE) {
                long j10 = 0;
                for (int i12 = 0; i12 < g10.size(); i12++) {
                    jb.d dVar2 = (jb.d) g10.get(i12);
                    j10 += dVar2.f8744b.i() + dVar2.f8743a.i() + 32;
                }
                int min = (int) Math.min(j10, 2147483647L);
                int i13 = hb.i.this.M;
                if (min > i13) {
                    e1 e1Var2 = e1.f5075k;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = z11 ? "trailer" : "header";
                    objArr[1] = Integer.valueOf(i13);
                    objArr[2] = Integer.valueOf(min);
                    e1Var = e1Var2.g(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
                }
            }
            synchronized (hb.i.this.f7287k) {
                try {
                    hb.h hVar = (hb.h) hb.i.this.f7290n.get(Integer.valueOf(i11));
                    if (hVar == null) {
                        if (hb.i.this.p(i11)) {
                            hb.i.this.f7285i.R(i11, jb.a.STREAM_CLOSED);
                        } else {
                            z10 = true;
                        }
                    } else if (e1Var == null) {
                        pb.c cVar = hVar.f7269l.J;
                        pb.b.f13110a.getClass();
                        hVar.f7269l.q(g10, z11);
                    } else {
                        if (!z11) {
                            hb.i.this.f7285i.R(i11, jb.a.CANCEL);
                        }
                        hVar.f7269l.i(new s0(), e1Var, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                hb.i.i(hb.i.this, "Received header for unknown stream: " + i11);
            }
        }

        public final void H(b.a aVar, int i10, byte b10, int i11) {
            b1 b1Var;
            if (i10 != 8) {
                f.d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
                throw null;
            }
            if (i11 != 0) {
                f.d("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
            int readInt = this.f8771a.readInt();
            int readInt2 = this.f8771a.readInt();
            boolean z10 = (b10 & 1) != 0;
            i.d dVar = (i.d) aVar;
            long j10 = (readInt << 32) | (readInt2 & KeyboardMap.kValueMask);
            dVar.f7307a.d(1, j10);
            if (!z10) {
                synchronized (hb.i.this.f7287k) {
                    hb.i.this.f7285i.e(readInt, readInt2, true);
                }
                return;
            }
            synchronized (hb.i.this.f7287k) {
                hb.i iVar = hb.i.this;
                b1Var = iVar.f7299x;
                if (b1Var != null) {
                    long j11 = b1Var.f6196a;
                    if (j11 == j10) {
                        iVar.f7299x = null;
                    } else {
                        hb.i.T.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j11), Long.valueOf(j10)));
                    }
                } else {
                    hb.i.T.warning("Received unexpected ping ack. No ping outstanding");
                }
                b1Var = null;
            }
            if (b1Var != null) {
                synchronized (b1Var) {
                    if (!b1Var.f6199d) {
                        b1Var.f6199d = true;
                        long a10 = b1Var.f6197b.a(TimeUnit.NANOSECONDS);
                        b1Var.f = a10;
                        LinkedHashMap linkedHashMap = b1Var.f6198c;
                        b1Var.f6198c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new z0((u.a) entry.getKey(), a10));
                            } catch (Throwable th) {
                                b1.f6195g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                }
            }
        }

        public final void I(b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                f.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                throw null;
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f8771a.readByte() & 255) : (short) 0;
            int readInt = this.f8771a.readInt() & Integer.MAX_VALUE;
            ArrayList g10 = g(f.c(i10 - 4, b10, readByte), readByte, b10, i11);
            i.d dVar = (i.d) aVar;
            j jVar = dVar.f7307a;
            if (jVar.a()) {
                jVar.f7311a.log(jVar.f7312b, a0.j.u(1) + " PUSH_PROMISE: streamId=" + i11 + " promisedStreamId=" + readInt + " headers=" + g10);
            }
            synchronized (hb.i.this.f7287k) {
                hb.i.this.f7285i.R(i11, jb.a.PROTOCOL_ERROR);
            }
        }

        public final void M(b.a aVar, int i10, int i11) {
            jb.a aVar2;
            if (i10 != 4) {
                f.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
                throw null;
            }
            if (i11 == 0) {
                f.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
            int readInt = this.f8771a.readInt();
            jb.a[] values = jb.a.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    aVar2 = null;
                    break;
                }
                aVar2 = values[i12];
                if (aVar2.f8738a == readInt) {
                    break;
                } else {
                    i12++;
                }
            }
            if (aVar2 == null) {
                f.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                throw null;
            }
            i.d dVar = (i.d) aVar;
            dVar.f7307a.e(1, i11, aVar2);
            e1 a10 = hb.i.x(aVar2).a("Rst Stream");
            e1.a aVar3 = a10.f5081a;
            boolean z10 = aVar3 == e1.a.CANCELLED || aVar3 == e1.a.DEADLINE_EXCEEDED;
            synchronized (hb.i.this.f7287k) {
                hb.h hVar = (hb.h) hb.i.this.f7290n.get(Integer.valueOf(i11));
                if (hVar != null) {
                    pb.c cVar = hVar.f7269l.J;
                    pb.b.f13110a.getClass();
                    hb.i.this.l(i11, a10, aVar2 == jb.a.REFUSED_STREAM ? t.a.REFUSED : t.a.PROCESSED, z10, null, null);
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        
            jb.f.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(r6));
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void Q(jb.b.a r8, int r9, byte r10, int r11) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: jb.f.c.Q(jb.b$a, int, byte, int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b0(jb.b.a r13, int r14, int r15) {
            /*
                r12 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3 = 4
                if (r14 != r3) goto L93
                xc.h r14 = r12.f8771a
                int r14 = r14.readInt()
                long r3 = (long) r14
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = r3 & r5
                r5 = 0
                int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r14 == 0) goto L8b
                hb.i$d r13 = (hb.i.d) r13
                jb.a r10 = jb.a.PROTOCOL_ERROR
                hb.j r5 = r13.f7307a
                r5.g(r0, r15, r3)
                if (r14 != 0) goto L3a
                java.lang.String r14 = "Received 0 flow control window increment."
                if (r15 != 0) goto L29
                hb.i r13 = hb.i.this
                goto L84
            L29:
                hb.i r5 = hb.i.this
                eb.e1 r13 = eb.e1.f5077m
                eb.e1 r7 = r13.g(r14)
                gb.t$a r8 = gb.t.a.PROCESSED
                r9 = 0
                r11 = 0
                r6 = r15
                r5.l(r6, r7, r8, r9, r10, r11)
                goto L87
            L3a:
                hb.i r14 = hb.i.this
                java.lang.Object r14 = r14.f7287k
                monitor-enter(r14)
                if (r15 != 0) goto L4b
                hb.i r13 = hb.i.this     // Catch: java.lang.Throwable -> L88
                hb.p r13 = r13.f7286j     // Catch: java.lang.Throwable -> L88
                int r15 = (int) r3     // Catch: java.lang.Throwable -> L88
                r13.c(r1, r15)     // Catch: java.lang.Throwable -> L88
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L88
                goto L87
            L4b:
                hb.i r1 = hb.i.this     // Catch: java.lang.Throwable -> L88
                java.util.HashMap r1 = r1.f7290n     // Catch: java.lang.Throwable -> L88
                java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L88
                hb.h r1 = (hb.h) r1     // Catch: java.lang.Throwable -> L88
                if (r1 == 0) goto L6f
                hb.i r0 = hb.i.this     // Catch: java.lang.Throwable -> L88
                hb.p r0 = r0.f7286j     // Catch: java.lang.Throwable -> L88
                hb.h$b r1 = r1.f7269l     // Catch: java.lang.Throwable -> L88
                java.lang.Object r5 = r1.f7275x     // Catch: java.lang.Throwable -> L88
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L88
                hb.p$b r1 = r1.K     // Catch: java.lang.Throwable -> L6c
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                int r3 = (int) r3
                r0.c(r1, r3)     // Catch: java.lang.Throwable -> L88
                goto L78
            L6c:
                r13 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6c
                throw r13     // Catch: java.lang.Throwable -> L88
            L6f:
                hb.i r1 = hb.i.this     // Catch: java.lang.Throwable -> L88
                boolean r1 = r1.p(r15)     // Catch: java.lang.Throwable -> L88
                if (r1 != 0) goto L78
                goto L79
            L78:
                r0 = r2
            L79:
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L88
                if (r0 == 0) goto L87
                hb.i r13 = hb.i.this
                java.lang.String r14 = "Received window_update for unknown stream: "
                java.lang.String r14 = defpackage.f.h(r14, r15)
            L84:
                hb.i.i(r13, r14)
            L87:
                return
            L88:
                r13 = move-exception
                monitor-exit(r14)     // Catch: java.lang.Throwable -> L88
                throw r13
            L8b:
                java.lang.String r13 = "windowSizeIncrement was 0"
                java.lang.Object[] r14 = new java.lang.Object[r2]
                jb.f.d(r13, r14)
                throw r1
            L93:
                java.lang.String r13 = "TYPE_WINDOW_UPDATE length !=4: %s"
                java.lang.Object[] r15 = new java.lang.Object[r0]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r15[r2] = r14
                jb.f.d(r13, r15)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jb.f.c.b0(jb.b$a, int, int):void");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f8771a.close();
        }

        public final boolean f(b.a aVar) {
            hb.h hVar;
            jb.a aVar2;
            e1 e1Var;
            try {
                this.f8771a.u0(9L);
                xc.h hVar2 = this.f8771a;
                int readByte = (hVar2.readByte() & 255) | ((hVar2.readByte() & 255) << 16) | ((hVar2.readByte() & 255) << 8);
                if (readByte < 0 || readByte > 16384) {
                    f.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(readByte));
                    throw null;
                }
                byte readByte2 = (byte) (this.f8771a.readByte() & 255);
                byte readByte3 = (byte) (this.f8771a.readByte() & 255);
                int readInt = this.f8771a.readInt() & Integer.MAX_VALUE;
                Logger logger = f.f8761a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.a(true, readInt, readByte, readByte2, readByte3));
                }
                switch (readByte2) {
                    case 0:
                        boolean z10 = (readByte3 & 1) != 0;
                        if ((readByte3 & 32) != 0) {
                            f.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short readByte4 = (readByte3 & 8) != 0 ? (short) (this.f8771a.readByte() & 255) : (short) 0;
                        int c10 = f.c(readByte, readByte3, readByte4);
                        xc.h hVar3 = this.f8771a;
                        i.d dVar = (i.d) aVar;
                        dVar.f7307a.b(1, readInt, hVar3.t(), c10, z10);
                        hb.i iVar = hb.i.this;
                        synchronized (iVar.f7287k) {
                            hVar = (hb.h) iVar.f7290n.get(Integer.valueOf(readInt));
                        }
                        if (hVar != null) {
                            long j10 = c10;
                            hVar3.u0(j10);
                            xc.f fVar = new xc.f();
                            fVar.g0(hVar3.t(), j10);
                            pb.c cVar = hVar.f7269l.J;
                            pb.b.f13110a.getClass();
                            synchronized (hb.i.this.f7287k) {
                                hVar.f7269l.p(readByte - c10, fVar, z10);
                            }
                        } else {
                            if (!hb.i.this.p(readInt)) {
                                hb.i.i(hb.i.this, "Received data for unknown stream: " + readInt);
                                this.f8771a.skip(readByte4);
                                return true;
                            }
                            synchronized (hb.i.this.f7287k) {
                                hb.i.this.f7285i.R(readInt, jb.a.STREAM_CLOSED);
                            }
                            hVar3.skip(c10);
                        }
                        hb.i iVar2 = hb.i.this;
                        int i10 = iVar2.f7295s + readByte;
                        iVar2.f7295s = i10;
                        if (i10 >= iVar2.f * 0.5f) {
                            synchronized (iVar2.f7287k) {
                                hb.i.this.f7285i.d(0, r6.f7295s);
                            }
                            hb.i.this.f7295s = 0;
                        }
                        this.f8771a.skip(readByte4);
                        return true;
                    case 1:
                        C(aVar, readByte, readByte3, readInt);
                        return true;
                    case 2:
                        if (readByte != 5) {
                            f.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(readByte));
                            throw null;
                        }
                        if (readInt == 0) {
                            f.d("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        this.f8771a.readInt();
                        this.f8771a.readByte();
                        aVar.getClass();
                        return true;
                    case 3:
                        M(aVar, readByte, readInt);
                        return true;
                    case 4:
                        Q(aVar, readByte, readByte3, readInt);
                        return true;
                    case 5:
                        I(aVar, readByte, readByte3, readInt);
                        return true;
                    case 6:
                        H(aVar, readByte, readByte3, readInt);
                        return true;
                    case 7:
                        if (readByte < 8) {
                            f.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(readByte));
                            throw null;
                        }
                        if (readInt != 0) {
                            f.d("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int readInt2 = this.f8771a.readInt();
                        int readInt3 = this.f8771a.readInt();
                        int i11 = readByte - 8;
                        jb.a[] values = jb.a.values();
                        int length = values.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                aVar2 = values[i12];
                                if (aVar2.f8738a != readInt3) {
                                    i12++;
                                }
                            } else {
                                aVar2 = null;
                            }
                        }
                        if (aVar2 == null) {
                            f.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt3));
                            throw null;
                        }
                        xc.i iVar3 = xc.i.f17259d;
                        if (i11 > 0) {
                            iVar3 = this.f8771a.l(i11);
                        }
                        i.d dVar2 = (i.d) aVar;
                        dVar2.f7307a.c(1, readInt2, aVar2, iVar3);
                        if (aVar2 == jb.a.ENHANCE_YOUR_CALM) {
                            String t = iVar3.t();
                            hb.i.T.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", dVar2, t));
                            if ("too_many_pings".equals(t)) {
                                hb.i.this.L.run();
                            }
                        }
                        long j11 = aVar2.f8738a;
                        v0.g[] gVarArr = v0.g.f6848d;
                        v0.g gVar = (j11 >= ((long) gVarArr.length) || j11 < 0) ? null : gVarArr[(int) j11];
                        if (gVar == null) {
                            e1Var = e1.c(v0.g.f6847c.f6851b.f5081a.f5098a).g("Unrecognized HTTP/2 error code: " + j11);
                        } else {
                            e1Var = gVar.f6851b;
                        }
                        e1 a10 = e1Var.a("Received Goaway");
                        if (iVar3.i() > 0) {
                            a10 = a10.a(iVar3.t());
                        }
                        hb.i iVar4 = hb.i.this;
                        Map<jb.a, e1> map = hb.i.S;
                        iVar4.t(readInt2, null, a10);
                        return true;
                    case 8:
                        b0(aVar, readByte, readInt);
                        return true;
                    default:
                        this.f8771a.skip(readByte);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final ArrayList g(int i10, short s10, byte b10, int i11) {
            a aVar = this.f8772b;
            aVar.f8767e = i10;
            aVar.f8764b = i10;
            aVar.f = s10;
            aVar.f8765c = b10;
            aVar.f8766d = i11;
            e.a aVar2 = this.f8773c;
            while (!aVar2.f8750b.v()) {
                int readByte = aVar2.f8750b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                boolean z10 = false;
                if ((readByte & 128) == 128) {
                    int e10 = aVar2.e(readByte, 127) - 1;
                    if (e10 >= 0 && e10 <= e.f8747b.length - 1) {
                        z10 = true;
                    }
                    if (!z10) {
                        int length = aVar2.f + 1 + (e10 - e.f8747b.length);
                        if (length >= 0) {
                            jb.d[] dVarArr = aVar2.f8753e;
                            if (length <= dVarArr.length - 1) {
                                aVar2.f8749a.add(dVarArr[length]);
                            }
                        }
                        StringBuilder l10 = defpackage.f.l("Header index too large ");
                        l10.append(e10 + 1);
                        throw new IOException(l10.toString());
                    }
                    aVar2.f8749a.add(e.f8747b[e10]);
                } else if (readByte == 64) {
                    xc.i d10 = aVar2.d();
                    e.a(d10);
                    aVar2.c(new jb.d(d10, aVar2.d()));
                } else if ((readByte & 64) == 64) {
                    aVar2.c(new jb.d(aVar2.b(aVar2.e(readByte, 63) - 1), aVar2.d()));
                } else if ((readByte & 32) == 32) {
                    int e11 = aVar2.e(readByte, 31);
                    aVar2.f8752d = e11;
                    if (e11 < 0 || e11 > aVar2.f8751c) {
                        StringBuilder l11 = defpackage.f.l("Invalid dynamic table size update ");
                        l11.append(aVar2.f8752d);
                        throw new IOException(l11.toString());
                    }
                    int i12 = aVar2.f8755h;
                    if (e11 < i12) {
                        if (e11 == 0) {
                            Arrays.fill(aVar2.f8753e, (Object) null);
                            aVar2.f = aVar2.f8753e.length - 1;
                            aVar2.f8754g = 0;
                            aVar2.f8755h = 0;
                        } else {
                            aVar2.a(i12 - e11);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    xc.i d11 = aVar2.d();
                    e.a(d11);
                    aVar2.f8749a.add(new jb.d(d11, aVar2.d()));
                } else {
                    aVar2.f8749a.add(new jb.d(aVar2.b(aVar2.e(readByte, 15) - 1), aVar2.d()));
                }
            }
            e.a aVar3 = this.f8773c;
            aVar3.getClass();
            ArrayList arrayList = new ArrayList(aVar3.f8749a);
            aVar3.f8749a.clear();
            return arrayList;
        }
    }

    public static final class d implements jb.c {

        /* renamed from: a, reason: collision with root package name */
        public final xc.g f8774a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8775b = true;

        /* renamed from: c, reason: collision with root package name */
        public final xc.f f8776c;

        /* renamed from: d, reason: collision with root package name */
        public final e.b f8777d;

        /* renamed from: e, reason: collision with root package name */
        public int f8778e;
        public boolean f;

        public d(r rVar) {
            this.f8774a = rVar;
            xc.f fVar = new xc.f();
            this.f8776c = fVar;
            this.f8777d = new e.b(fVar);
            this.f8778e = 16384;
        }

        @Override // jb.c
        public final synchronized void A(boolean z10, int i10, List list) {
            if (this.f) {
                throw new IOException("closed");
            }
            g(i10, list, z10);
        }

        @Override // jb.c
        public final synchronized void L(x xVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            int i10 = this.f8778e;
            if ((xVar.f2331a & 32) != 0) {
                i10 = ((int[]) xVar.f2334d)[5];
            }
            this.f8778e = i10;
            f(0, 0, (byte) 4, (byte) 1);
            this.f8774a.flush();
        }

        @Override // jb.c
        public final synchronized void R(int i10, jb.a aVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (aVar.f8738a == -1) {
                throw new IllegalArgumentException();
            }
            f(i10, 4, (byte) 3, (byte) 0);
            this.f8774a.writeInt(aVar.f8738a);
            this.f8774a.flush();
        }

        @Override // jb.c
        public final synchronized void a0(x xVar) {
            if (this.f) {
                throw new IOException("closed");
            }
            int i10 = 0;
            f(0, Integer.bitCount(xVar.f2331a) * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (xVar.a(i10)) {
                    this.f8774a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f8774a.writeInt(((int[]) xVar.f2334d)[i10]);
                }
                i10++;
            }
            this.f8774a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            this.f = true;
            this.f8774a.close();
        }

        @Override // jb.c
        public final synchronized void d(int i10, long j10) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw new IllegalArgumentException(String.format(Locale.US, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10)));
            }
            f(i10, 4, (byte) 8, (byte) 0);
            this.f8774a.writeInt((int) j10);
            this.f8774a.flush();
        }

        @Override // jb.c
        public final synchronized void e(int i10, int i11, boolean z10) {
            if (this.f) {
                throw new IOException("closed");
            }
            f(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f8774a.writeInt(i10);
            this.f8774a.writeInt(i11);
            this.f8774a.flush();
        }

        public final void f(int i10, int i11, byte b10, byte b11) {
            Logger logger = f.f8761a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.a(false, i10, i11, b10, b11));
            }
            int i12 = this.f8778e;
            if (i11 > i12) {
                throw new IllegalArgumentException(String.format(Locale.US, "FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11)));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "reserved bit set: %s", Integer.valueOf(i10)));
            }
            xc.g gVar = this.f8774a;
            gVar.writeByte((i11 >>> 16) & 255);
            gVar.writeByte((i11 >>> 8) & 255);
            gVar.writeByte(i11 & 255);
            this.f8774a.writeByte(b10 & 255);
            this.f8774a.writeByte(b11 & 255);
            this.f8774a.writeInt(i10 & Integer.MAX_VALUE);
        }

        @Override // jb.c
        public final synchronized void flush() {
            if (this.f) {
                throw new IOException("closed");
            }
            this.f8774a.flush();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(int r17, java.util.List r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 458
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: jb.f.d.g(int, java.util.List, boolean):void");
        }

        @Override // jb.c
        public final synchronized void o0(jb.a aVar, byte[] bArr) {
            if (this.f) {
                throw new IOException("closed");
            }
            if (aVar.f8738a == -1) {
                throw new IllegalArgumentException(String.format(Locale.US, "errorCode.httpCode == -1", new Object[0]));
            }
            f(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f8774a.writeInt(0);
            this.f8774a.writeInt(aVar.f8738a);
            if (bArr.length > 0) {
                this.f8774a.write(bArr);
            }
            this.f8774a.flush();
        }

        @Override // jb.c
        public final int t0() {
            return this.f8778e;
        }

        @Override // jb.c
        public final synchronized void u(boolean z10, int i10, xc.f fVar, int i11) {
            if (this.f) {
                throw new IOException("closed");
            }
            f(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
            if (i11 > 0) {
                this.f8774a.g0(fVar, i11);
            }
        }

        @Override // jb.c
        public final synchronized void w() {
            if (this.f) {
                throw new IOException("closed");
            }
            if (this.f8775b) {
                Logger logger = f.f8761a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", f.f8762b.l()));
                }
                this.f8774a.write(f.f8762b.s());
                this.f8774a.flush();
            }
        }
    }

    static {
        xc.i iVar = xc.i.f17259d;
        f8762b = i.a.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int c(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public static void d(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // jb.h
    public final d a(r rVar) {
        return new d(rVar);
    }

    @Override // jb.h
    public final c b(s sVar) {
        return new c(sVar);
    }
}
