package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import okhttp3.internal.Util;
import xc.f;
import xc.h;

/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {

    public static final class BomAwareReader extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12360a;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f12360a = true;
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            if (this.f12360a) {
                throw new IOException("Stream closed");
            }
            Util.b(null, null);
            throw null;
        }
    }

    public static ResponseBody C(byte[] bArr) {
        final f fVar = new f();
        fVar.m5write(bArr);
        final long length = bArr.length;
        return new ResponseBody() { // from class: okhttp3.ResponseBody.1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MediaType f12357a = null;

            @Override // okhttp3.ResponseBody
            public final h H() {
                return fVar;
            }

            @Override // okhttp3.ResponseBody
            public final long f() {
                return length;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType g() {
                return this.f12357a;
            }
        };
    }

    public abstract h H();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Util.e(H());
    }

    public abstract long f();

    public abstract MediaType g();
}
