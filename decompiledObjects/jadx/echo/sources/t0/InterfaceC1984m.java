package t0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d0.C1194q;
import java.nio.ByteBuffer;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1984m {

    /* renamed from: t0.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p f19473a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f19474b;

        /* renamed from: c, reason: collision with root package name */
        public final C1194q f19475c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f19476d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f19477e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19478f;

        public a(p pVar, MediaFormat mediaFormat, C1194q c1194q, Surface surface, MediaCrypto mediaCrypto, int i7) {
            this.f19473a = pVar;
            this.f19474b = mediaFormat;
            this.f19475c = c1194q;
            this.f19476d = surface;
            this.f19477e = mediaCrypto;
            this.f19478f = i7;
        }

        public static a a(p pVar, MediaFormat mediaFormat, C1194q c1194q, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, c1194q, null, mediaCrypto, 0);
        }

        public static a b(p pVar, MediaFormat mediaFormat, C1194q c1194q, Surface surface, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, c1194q, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: t0.m$b */
    public interface b {
        InterfaceC1984m a(a aVar);
    }

    /* renamed from: t0.m$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: t0.m$d */
    public interface d {
        void a(InterfaceC1984m interfaceC1984m, long j7, long j8);
    }

    void a(int i7, int i8, j0.c cVar, long j7, int i9);

    void b(int i7, int i8, int i9, long j7, int i10);

    void c(Bundle bundle);

    int d(MediaCodec.BufferInfo bufferInfo);

    boolean e();

    void f(int i7, boolean z7);

    void flush();

    void g(int i7);

    MediaFormat h();

    ByteBuffer i(int i7);

    void j(Surface surface);

    ByteBuffer k(int i7);

    boolean l(c cVar);

    void m(int i7, long j7);

    int n();

    void o(d dVar, Handler handler);

    void release();
}
