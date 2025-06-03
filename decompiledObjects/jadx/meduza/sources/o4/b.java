package o4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import o4.d;
import o4.j;
import p2.m0;
import v5.e0;
import w5.g;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f11755a;

    /* renamed from: b, reason: collision with root package name */
    public final e f11756b;

    /* renamed from: c, reason: collision with root package name */
    public final d f11757c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11758d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11759e;
    public int f = 0;

    public static final class a implements j.b {

        /* renamed from: a, reason: collision with root package name */
        public final n7.q<HandlerThread> f11760a;

        /* renamed from: b, reason: collision with root package name */
        public final n7.q<HandlerThread> f11761b;

        public a(int i10) {
            d9.p pVar = new d9.p(i10);
            d9.q qVar = new d9.q(i10);
            this.f11760a = pVar;
            this.f11761b = qVar;
        }

        @Override // o4.j.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b a(j.a aVar) {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f11798a.f11804a;
            b bVar2 = null;
            try {
                m0.i("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f11760a.get(), this.f11761b.get(), false);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                m0.B();
                b.o(bVar, aVar.f11799b, aVar.f11801d, aVar.f11802e);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f11755a = mediaCodec;
        this.f11756b = new e(handlerThread);
        this.f11757c = new d(mediaCodec, handlerThread2);
        this.f11758d = z10;
    }

    public static void o(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        e eVar = bVar.f11756b;
        MediaCodec mediaCodec = bVar.f11755a;
        x6.b.H(eVar.f11777c == null);
        eVar.f11776b.start();
        Handler handler = new Handler(eVar.f11776b.getLooper());
        mediaCodec.setCallback(eVar, handler);
        eVar.f11777c = handler;
        m0.i("configureCodec");
        bVar.f11755a.configure(mediaFormat, surface, mediaCrypto, 0);
        m0.B();
        d dVar = bVar.f11757c;
        if (!dVar.f) {
            dVar.f11766b.start();
            dVar.f11767c = new c(dVar, dVar.f11766b.getLooper());
            dVar.f = true;
        }
        m0.i("startCodec");
        bVar.f11755a.start();
        m0.B();
        bVar.f = 1;
    }

    public static String p(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // o4.j
    public final void a() {
    }

    @Override // o4.j
    public final MediaFormat b() {
        MediaFormat mediaFormat;
        e eVar = this.f11756b;
        synchronized (eVar.f11775a) {
            mediaFormat = eVar.f11781h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // o4.j
    public final void c(int i10, z3.c cVar, long j10) {
        this.f11757c.c(i10, cVar, j10);
    }

    @Override // o4.j
    public final void d(Bundle bundle) {
        q();
        this.f11755a.setParameters(bundle);
    }

    @Override // o4.j
    public final void e(int i10, long j10) {
        this.f11755a.releaseOutputBuffer(i10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:13:0x0045, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:26:0x0035, B:27:0x0047, B:28:0x004c, B:29:0x004d, B:30:0x004f, B:31:0x0050, B:32:0x0052), top: B:3:0x000a }] */
    @Override // o4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f() {
        /*
            r7 = this;
            o4.d r0 = r7.f11757c
            r0.b()
            o4.e r0 = r7.f11756b
            java.lang.Object r1 = r0.f11775a
            monitor-enter(r1)
            long r2 = r0.f11784k     // Catch: java.lang.Throwable -> L55
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f11785l     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r5 = -1
            if (r2 == 0) goto L20
            goto L45
        L20:
            java.lang.IllegalStateException r2 = r0.f11786m     // Catch: java.lang.Throwable -> L55
            r6 = 0
            if (r2 != 0) goto L50
            android.media.MediaCodec$CodecException r2 = r0.f11783j     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L4d
            o4.i r0 = r0.f11778d     // Catch: java.lang.Throwable -> L55
            int r2 = r0.f11795c     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L30
            r3 = r4
        L30:
            if (r3 == 0) goto L33
            goto L45
        L33:
            if (r2 == 0) goto L47
            int[] r3 = r0.f11796d     // Catch: java.lang.Throwable -> L55
            int r6 = r0.f11793a     // Catch: java.lang.Throwable -> L55
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L55
            int r6 = r6 + r4
            int r4 = r0.f11797e     // Catch: java.lang.Throwable -> L55
            r4 = r4 & r6
            r0.f11793a = r4     // Catch: java.lang.Throwable -> L55
            int r2 = r2 + r5
            r0.f11795c = r2     // Catch: java.lang.Throwable -> L55
            r5 = r3
        L45:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            return r5
        L47:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L4d:
            r0.f11783j = r6     // Catch: java.lang.Throwable -> L55
            throw r2     // Catch: java.lang.Throwable -> L55
        L50:
            r0.f11786m = r6     // Catch: java.lang.Throwable -> L55
            throw r2     // Catch: java.lang.Throwable -> L55
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r0
        L55:
            r0 = move-exception
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.f():int");
    }

    @Override // o4.j
    public final void flush() {
        this.f11757c.a();
        this.f11755a.flush();
        e eVar = this.f11756b;
        synchronized (eVar.f11775a) {
            eVar.f11784k++;
            Handler handler = eVar.f11777c;
            int i10 = e0.f15881a;
            handler.post(new b.d(eVar, 9));
        }
        this.f11755a.start();
    }

    @Override // o4.j
    public final void g(final j.c cVar, Handler handler) {
        q();
        this.f11755a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o4.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b bVar = b.this;
                j.c cVar2 = cVar;
                bVar.getClass();
                ((g.c) cVar2).b(j10);
            }
        }, handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:13:0x006e, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:26:0x0035, B:28:0x0046, B:32:0x0063, B:33:0x0070, B:34:0x0075, B:35:0x0076, B:36:0x0078, B:37:0x0079, B:38:0x007b), top: B:3:0x000a }] */
    @Override // o4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            o4.d r0 = r10.f11757c
            r0.b()
            o4.e r0 = r10.f11756b
            java.lang.Object r1 = r0.f11775a
            monitor-enter(r1)
            long r2 = r0.f11784k     // Catch: java.lang.Throwable -> L7e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L1b
            boolean r2 = r0.f11785l     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r5 = -1
            if (r2 == 0) goto L20
            goto L6e
        L20:
            java.lang.IllegalStateException r2 = r0.f11786m     // Catch: java.lang.Throwable -> L7e
            r6 = 0
            if (r2 != 0) goto L79
            android.media.MediaCodec$CodecException r2 = r0.f11783j     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L76
            o4.i r2 = r0.f11779e     // Catch: java.lang.Throwable -> L7e
            int r6 = r2.f11795c     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L30
            r3 = r4
        L30:
            if (r3 == 0) goto L33
            goto L6e
        L33:
            if (r6 == 0) goto L70
            int[] r3 = r2.f11796d     // Catch: java.lang.Throwable -> L7e
            int r7 = r2.f11793a     // Catch: java.lang.Throwable -> L7e
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L7e
            int r7 = r7 + r4
            int r4 = r2.f11797e     // Catch: java.lang.Throwable -> L7e
            r4 = r4 & r7
            r2.f11793a = r4     // Catch: java.lang.Throwable -> L7e
            int r6 = r6 + r5
            r2.f11795c = r6     // Catch: java.lang.Throwable -> L7e
            if (r3 < 0) goto L60
            android.media.MediaFormat r2 = r0.f11781h     // Catch: java.lang.Throwable -> L7e
            x6.b.K(r2)     // Catch: java.lang.Throwable -> L7e
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L7e
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L7e
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L7e
            int r6 = r0.size     // Catch: java.lang.Throwable -> L7e
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L7e
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L7e
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L7e
            goto L6d
        L60:
            r11 = -2
            if (r3 != r11) goto L6d
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.f11780g     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L7e
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L7e
            r0.f11781h = r11     // Catch: java.lang.Throwable -> L7e
        L6d:
            r5 = r3
        L6e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            return r5
        L70:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L7e
            r11.<init>()     // Catch: java.lang.Throwable -> L7e
            throw r11     // Catch: java.lang.Throwable -> L7e
        L76:
            r0.f11783j = r6     // Catch: java.lang.Throwable -> L7e
            throw r2     // Catch: java.lang.Throwable -> L7e
        L79:
            r0.f11786m = r6     // Catch: java.lang.Throwable -> L7e
            throw r2     // Catch: java.lang.Throwable -> L7e
        L7c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r11
        L7e:
            r11 = move-exception
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.h(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // o4.j
    public final void i(int i10, int i11, int i12, long j10) {
        d.a aVar;
        d dVar = this.f11757c;
        dVar.b();
        ArrayDeque<d.a> arrayDeque = d.f11763g;
        synchronized (arrayDeque) {
            aVar = arrayDeque.isEmpty() ? new d.a() : arrayDeque.removeFirst();
        }
        aVar.f11770a = i10;
        aVar.f11771b = 0;
        aVar.f11772c = i11;
        aVar.f11774e = j10;
        aVar.f = i12;
        c cVar = dVar.f11767c;
        int i13 = e0.f15881a;
        cVar.obtainMessage(0, aVar).sendToTarget();
    }

    @Override // o4.j
    public final void j(int i10, boolean z10) {
        this.f11755a.releaseOutputBuffer(i10, z10);
    }

    @Override // o4.j
    public final void k(int i10) {
        q();
        this.f11755a.setVideoScalingMode(i10);
    }

    @Override // o4.j
    public final ByteBuffer l(int i10) {
        return this.f11755a.getInputBuffer(i10);
    }

    @Override // o4.j
    public final void m(Surface surface) {
        q();
        this.f11755a.setOutputSurface(surface);
    }

    @Override // o4.j
    public final ByteBuffer n(int i10) {
        return this.f11755a.getOutputBuffer(i10);
    }

    public final void q() {
        if (this.f11758d) {
            try {
                d dVar = this.f11757c;
                b5.g gVar = dVar.f11769e;
                synchronized (gVar) {
                    gVar.f1869a = false;
                }
                c cVar = dVar.f11767c;
                cVar.getClass();
                cVar.obtainMessage(2).sendToTarget();
                b5.g gVar2 = dVar.f11769e;
                synchronized (gVar2) {
                    while (!gVar2.f1869a) {
                        gVar2.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // o4.j
    public final void release() {
        try {
            if (this.f == 1) {
                d dVar = this.f11757c;
                if (dVar.f) {
                    dVar.a();
                    dVar.f11766b.quit();
                }
                dVar.f = false;
                e eVar = this.f11756b;
                synchronized (eVar.f11775a) {
                    eVar.f11785l = true;
                    eVar.f11776b.quit();
                    eVar.a();
                }
            }
            this.f = 2;
        } finally {
            if (!this.f11759e) {
                this.f11755a.release();
                this.f11759e = true;
            }
        }
    }
}
