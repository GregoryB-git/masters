package t0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d0.AbstractC1203z;
import d0.C1194q;
import g0.M;
import java.nio.ByteBuffer;
import t0.C1973b;
import t0.InterfaceC1984m;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973b implements InterfaceC1984m {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f19426a;

    /* renamed from: b, reason: collision with root package name */
    public final C1980i f19427b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1985n f19428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19429d;

    /* renamed from: e, reason: collision with root package name */
    public int f19430e;

    /* renamed from: t0.b$b, reason: collision with other inner class name */
    public static final class C0270b implements InterfaceC1984m.b {

        /* renamed from: a, reason: collision with root package name */
        public final W2.s f19431a;

        /* renamed from: b, reason: collision with root package name */
        public final W2.s f19432b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19433c;

        public C0270b(final int i7) {
            this(new W2.s() { // from class: t0.c
                @Override // W2.s
                public final Object get() {
                    HandlerThread f7;
                    f7 = C1973b.C0270b.f(i7);
                    return f7;
                }
            }, new W2.s() { // from class: t0.d
                @Override // W2.s
                public final Object get() {
                    HandlerThread g7;
                    g7 = C1973b.C0270b.g(i7);
                    return g7;
                }
            });
        }

        public static /* synthetic */ HandlerThread f(int i7) {
            return new HandlerThread(C1973b.t(i7));
        }

        public static /* synthetic */ HandlerThread g(int i7) {
            return new HandlerThread(C1973b.u(i7));
        }

        public static boolean h(C1194q c1194q) {
            int i7 = M.f14261a;
            if (i7 < 34) {
                return false;
            }
            return i7 >= 35 || AbstractC1203z.s(c1194q.f12726n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [t0.b$a] */
        /* JADX WARN: Type inference failed for: r1v1, types: [t0.b] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // t0.InterfaceC1984m.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1973b a(InterfaceC1984m.a aVar) {
            MediaCodec mediaCodec;
            int i7;
            InterfaceC1985n c1978g;
            C1973b c1973b;
            String str = aVar.f19473a.f19482a;
            ?? r12 = 0;
            r12 = 0;
            try {
                g0.F.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    i7 = aVar.f19478f;
                    if (this.f19433c && h(aVar.f19475c)) {
                        c1978g = new C1971L(mediaCodec);
                        i7 |= 4;
                    } else {
                        c1978g = new C1978g(mediaCodec, (HandlerThread) this.f19432b.get());
                    }
                    c1973b = new C1973b(mediaCodec, (HandlerThread) this.f19431a.get(), c1978g);
                } catch (Exception e7) {
                    e = e7;
                }
                try {
                    g0.F.b();
                    c1973b.w(aVar.f19474b, aVar.f19476d, aVar.f19477e, i7);
                    return c1973b;
                } catch (Exception e8) {
                    e = e8;
                    r12 = c1973b;
                    if (r12 != 0) {
                        r12.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e9) {
                e = e9;
                mediaCodec = null;
            }
        }

        public void e(boolean z7) {
            this.f19433c = z7;
        }

        public C0270b(W2.s sVar, W2.s sVar2) {
            this.f19431a = sVar;
            this.f19432b = sVar2;
            this.f19433c = true;
        }
    }

    public C1973b(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC1985n interfaceC1985n) {
        this.f19426a = mediaCodec;
        this.f19427b = new C1980i(handlerThread);
        this.f19428c = interfaceC1985n;
        this.f19430e = 0;
    }

    public static String t(int i7) {
        return v(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int i7) {
        return v(i7, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String v(int i7, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            str2 = "Audio";
        } else if (i7 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // t0.InterfaceC1984m
    public void a(int i7, int i8, j0.c cVar, long j7, int i9) {
        this.f19428c.a(i7, i8, cVar, j7, i9);
    }

    @Override // t0.InterfaceC1984m
    public void b(int i7, int i8, int i9, long j7, int i10) {
        this.f19428c.b(i7, i8, i9, j7, i10);
    }

    @Override // t0.InterfaceC1984m
    public void c(Bundle bundle) {
        this.f19428c.c(bundle);
    }

    @Override // t0.InterfaceC1984m
    public int d(MediaCodec.BufferInfo bufferInfo) {
        this.f19428c.d();
        return this.f19427b.d(bufferInfo);
    }

    @Override // t0.InterfaceC1984m
    public boolean e() {
        return false;
    }

    @Override // t0.InterfaceC1984m
    public void f(int i7, boolean z7) {
        this.f19426a.releaseOutputBuffer(i7, z7);
    }

    @Override // t0.InterfaceC1984m
    public void flush() {
        this.f19428c.flush();
        this.f19426a.flush();
        this.f19427b.e();
        this.f19426a.start();
    }

    @Override // t0.InterfaceC1984m
    public void g(int i7) {
        this.f19426a.setVideoScalingMode(i7);
    }

    @Override // t0.InterfaceC1984m
    public MediaFormat h() {
        return this.f19427b.g();
    }

    @Override // t0.InterfaceC1984m
    public ByteBuffer i(int i7) {
        return this.f19426a.getInputBuffer(i7);
    }

    @Override // t0.InterfaceC1984m
    public void j(Surface surface) {
        this.f19426a.setOutputSurface(surface);
    }

    @Override // t0.InterfaceC1984m
    public ByteBuffer k(int i7) {
        return this.f19426a.getOutputBuffer(i7);
    }

    @Override // t0.InterfaceC1984m
    public boolean l(InterfaceC1984m.c cVar) {
        this.f19427b.p(cVar);
        return true;
    }

    @Override // t0.InterfaceC1984m
    public void m(int i7, long j7) {
        this.f19426a.releaseOutputBuffer(i7, j7);
    }

    @Override // t0.InterfaceC1984m
    public int n() {
        this.f19428c.d();
        return this.f19427b.c();
    }

    @Override // t0.InterfaceC1984m
    public void o(final InterfaceC1984m.d dVar, Handler handler) {
        this.f19426a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: t0.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                C1973b.this.x(dVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // t0.InterfaceC1984m
    public void release() {
        try {
            if (this.f19430e == 1) {
                this.f19428c.shutdown();
                this.f19427b.q();
            }
            this.f19430e = 2;
            if (this.f19429d) {
                return;
            }
            try {
                int i7 = M.f14261a;
                if (i7 >= 30 && i7 < 33) {
                    this.f19426a.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f19429d) {
                try {
                    int i8 = M.f14261a;
                    if (i8 >= 30 && i8 < 33) {
                        this.f19426a.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    public final void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        this.f19427b.h(this.f19426a);
        g0.F.a("configureCodec");
        this.f19426a.configure(mediaFormat, surface, mediaCrypto, i7);
        g0.F.b();
        this.f19428c.start();
        g0.F.a("startCodec");
        this.f19426a.start();
        g0.F.b();
        this.f19430e = 1;
    }

    public final /* synthetic */ void x(InterfaceC1984m.d dVar, MediaCodec mediaCodec, long j7, long j8) {
        dVar.a(this, j7, j8);
    }
}
