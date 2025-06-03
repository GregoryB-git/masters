package t0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import g0.AbstractC1297a;
import g0.M;
import java.io.IOException;
import java.nio.ByteBuffer;
import t0.InterfaceC1984m;

/* renamed from: t0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1970K implements InterfaceC1984m {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f19420a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f19421b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f19422c;

    /* renamed from: t0.K$b */
    public static class b implements InterfaceC1984m.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [t0.K$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // t0.InterfaceC1984m.b
        public InterfaceC1984m a(InterfaceC1984m.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec b7 = b(aVar);
                try {
                    g0.F.a("configureCodec");
                    b7.configure(aVar.f19474b, aVar.f19476d, aVar.f19477e, aVar.f19478f);
                    g0.F.b();
                    g0.F.a("startCodec");
                    b7.start();
                    g0.F.b();
                    return new C1970K(b7);
                } catch (IOException | RuntimeException e7) {
                    e = e7;
                    mediaCodec = b7;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e8) {
                e = e8;
            } catch (RuntimeException e9) {
                e = e9;
            }
        }

        public MediaCodec b(InterfaceC1984m.a aVar) {
            AbstractC1297a.e(aVar.f19473a);
            String str = aVar.f19473a.f19482a;
            g0.F.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            g0.F.b();
            return createByCodecName;
        }
    }

    public C1970K(MediaCodec mediaCodec) {
        this.f19420a = mediaCodec;
        if (M.f14261a < 21) {
            this.f19421b = mediaCodec.getInputBuffers();
            this.f19422c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(InterfaceC1984m.d dVar, MediaCodec mediaCodec, long j7, long j8) {
        dVar.a(this, j7, j8);
    }

    @Override // t0.InterfaceC1984m
    public void a(int i7, int i8, j0.c cVar, long j7, int i9) {
        this.f19420a.queueSecureInputBuffer(i7, i8, cVar.a(), j7, i9);
    }

    @Override // t0.InterfaceC1984m
    public void b(int i7, int i8, int i9, long j7, int i10) {
        this.f19420a.queueInputBuffer(i7, i8, i9, j7, i10);
    }

    @Override // t0.InterfaceC1984m
    public void c(Bundle bundle) {
        this.f19420a.setParameters(bundle);
    }

    @Override // t0.InterfaceC1984m
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f19420a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && M.f14261a < 21) {
                this.f19422c = this.f19420a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // t0.InterfaceC1984m
    public boolean e() {
        return false;
    }

    @Override // t0.InterfaceC1984m
    public void f(int i7, boolean z7) {
        this.f19420a.releaseOutputBuffer(i7, z7);
    }

    @Override // t0.InterfaceC1984m
    public void flush() {
        this.f19420a.flush();
    }

    @Override // t0.InterfaceC1984m
    public void g(int i7) {
        this.f19420a.setVideoScalingMode(i7);
    }

    @Override // t0.InterfaceC1984m
    public MediaFormat h() {
        return this.f19420a.getOutputFormat();
    }

    @Override // t0.InterfaceC1984m
    public ByteBuffer i(int i7) {
        return M.f14261a >= 21 ? this.f19420a.getInputBuffer(i7) : ((ByteBuffer[]) M.i(this.f19421b))[i7];
    }

    @Override // t0.InterfaceC1984m
    public void j(Surface surface) {
        this.f19420a.setOutputSurface(surface);
    }

    @Override // t0.InterfaceC1984m
    public ByteBuffer k(int i7) {
        return M.f14261a >= 21 ? this.f19420a.getOutputBuffer(i7) : ((ByteBuffer[]) M.i(this.f19422c))[i7];
    }

    @Override // t0.InterfaceC1984m
    public /* synthetic */ boolean l(InterfaceC1984m.c cVar) {
        return AbstractC1983l.a(this, cVar);
    }

    @Override // t0.InterfaceC1984m
    public void m(int i7, long j7) {
        this.f19420a.releaseOutputBuffer(i7, j7);
    }

    @Override // t0.InterfaceC1984m
    public int n() {
        return this.f19420a.dequeueInputBuffer(0L);
    }

    @Override // t0.InterfaceC1984m
    public void o(final InterfaceC1984m.d dVar, Handler handler) {
        this.f19420a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: t0.J
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j7, long j8) {
                C1970K.this.q(dVar, mediaCodec, j7, j8);
            }
        }, handler);
    }

    @Override // t0.InterfaceC1984m
    public void release() {
        this.f19421b = null;
        this.f19422c = null;
        try {
            int i7 = M.f14261a;
            if (i7 >= 30 && i7 < 33) {
                this.f19420a.stop();
            }
        } finally {
            this.f19420a.release();
        }
    }
}
