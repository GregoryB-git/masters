package okhttp3.internal.ws;

import java.io.IOException;
import xc.f;
import xc.w;
import xc.z;

/* loaded from: classes.dex */
final class WebSocketWriter {

    public final class FrameSink implements w {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12682a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12683b;

        @Override // xc.w
        public final z c() {
            throw null;
        }

        @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f12683b) {
                throw null;
            }
            throw new IOException("closed");
        }

        @Override // xc.w, java.io.Flushable
        public final void flush() {
            if (!this.f12683b) {
                throw null;
            }
            throw new IOException("closed");
        }

        @Override // xc.w
        public final void g0(f fVar, long j10) {
            if (!this.f12683b) {
                throw null;
            }
            throw new IOException("closed");
        }
    }

    public final void a(int i10, long j10, boolean z10, boolean z11) {
        throw null;
    }
}
