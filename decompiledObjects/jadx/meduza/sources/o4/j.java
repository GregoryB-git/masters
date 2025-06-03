package o4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import v3.i0;

/* loaded from: classes.dex */
public interface j {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final l f11798a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f11799b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f11800c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f11801d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f11802e;

        public a(l lVar, MediaFormat mediaFormat, i0 i0Var, Surface surface, MediaCrypto mediaCrypto) {
            this.f11798a = lVar;
            this.f11799b = mediaFormat;
            this.f11800c = i0Var;
            this.f11801d = surface;
            this.f11802e = mediaCrypto;
        }
    }

    public interface b {
        j a(a aVar);
    }

    public interface c {
    }

    void a();

    MediaFormat b();

    void c(int i10, z3.c cVar, long j10);

    void d(Bundle bundle);

    void e(int i10, long j10);

    int f();

    void flush();

    void g(c cVar, Handler handler);

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(int i10, int i11, int i12, long j10);

    void j(int i10, boolean z10);

    void k(int i10);

    ByteBuffer l(int i10);

    void m(Surface surface);

    ByteBuffer n(int i10);

    void release();
}
