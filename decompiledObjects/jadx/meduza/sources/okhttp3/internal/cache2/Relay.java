package okhttp3.internal.cache2;

import xc.f;
import xc.i;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
final class Relay {

    public class RelaySource implements y {
        @Override // xc.y
        public final z c() {
            return null;
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // xc.y
        public final long e0(f fVar, long j10) {
            throw new IllegalStateException("closed");
        }
    }

    static {
        i iVar = i.f17259d;
        i.a.a("OkHttp cache v1\n");
        i.a.a("OkHttp DIRTY :(\n");
    }
}
