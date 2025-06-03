package o4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import o4.j;
import p2.m0;
import v5.e0;
import w5.g;

/* loaded from: classes.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f11863a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f11864b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f11865c;

    public static class a implements j.b {
        public static MediaCodec b(j.a aVar) {
            aVar.f11798a.getClass();
            String str = aVar.f11798a.f11804a;
            m0.i("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            m0.B();
            return createByCodecName;
        }
    }

    public r(MediaCodec mediaCodec) {
        this.f11863a = mediaCodec;
        if (e0.f15881a < 21) {
            this.f11864b = mediaCodec.getInputBuffers();
            this.f11865c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // o4.j
    public final void a() {
    }

    @Override // o4.j
    public final MediaFormat b() {
        return this.f11863a.getOutputFormat();
    }

    @Override // o4.j
    public final void c(int i10, z3.c cVar, long j10) {
        this.f11863a.queueSecureInputBuffer(i10, 0, cVar.f17516i, j10, 0);
    }

    @Override // o4.j
    public final void d(Bundle bundle) {
        this.f11863a.setParameters(bundle);
    }

    @Override // o4.j
    public final void e(int i10, long j10) {
        this.f11863a.releaseOutputBuffer(i10, j10);
    }

    @Override // o4.j
    public final int f() {
        return this.f11863a.dequeueInputBuffer(0L);
    }

    @Override // o4.j
    public final void flush() {
        this.f11863a.flush();
    }

    @Override // o4.j
    public final void g(final j.c cVar, Handler handler) {
        this.f11863a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: o4.q
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                r rVar = r.this;
                j.c cVar2 = cVar;
                rVar.getClass();
                ((g.c) cVar2).b(j10);
            }
        }, handler);
    }

    @Override // o4.j
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f11863a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && e0.f15881a < 21) {
                this.f11865c = this.f11863a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // o4.j
    public final void i(int i10, int i11, int i12, long j10) {
        this.f11863a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // o4.j
    public final void j(int i10, boolean z10) {
        this.f11863a.releaseOutputBuffer(i10, z10);
    }

    @Override // o4.j
    public final void k(int i10) {
        this.f11863a.setVideoScalingMode(i10);
    }

    @Override // o4.j
    public final ByteBuffer l(int i10) {
        return e0.f15881a >= 21 ? this.f11863a.getInputBuffer(i10) : this.f11864b[i10];
    }

    @Override // o4.j
    public final void m(Surface surface) {
        this.f11863a.setOutputSurface(surface);
    }

    @Override // o4.j
    public final ByteBuffer n(int i10) {
        return e0.f15881a >= 21 ? this.f11863a.getOutputBuffer(i10) : this.f11865c[i10];
    }

    @Override // o4.j
    public final void release() {
        this.f11864b = null;
        this.f11865c = null;
        this.f11863a.release();
    }
}
