package okhttp3;

import ec.i;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import xc.p;
import xc.r;

/* loaded from: classes.dex */
public abstract class RequestBody {

    /* renamed from: okhttp3.RequestBody$1, reason: invalid class name */
    class AnonymousClass1 extends RequestBody {
        @Override // okhttp3.RequestBody
        public final long a() {
            throw null;
        }

        @Override // okhttp3.RequestBody
        public final MediaType b() {
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void d(r rVar) {
            rVar.f();
            throw null;
        }
    }

    /* renamed from: okhttp3.RequestBody$3, reason: invalid class name */
    class AnonymousClass3 extends RequestBody {
        @Override // okhttp3.RequestBody
        public final long a() {
            throw null;
        }

        @Override // okhttp3.RequestBody
        public final MediaType b() {
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void d(r rVar) {
            try {
                Logger logger = p.f17277a;
                i.e(null, "<this>");
                throw null;
            } catch (Throwable th) {
                byte[] bArr = Util.f12372a;
                throw th;
            }
        }
    }

    public static RequestBody c(final MediaType mediaType, final byte[] bArr) {
        final int length = bArr.length;
        long length2 = bArr.length;
        long j10 = 0;
        long j11 = length;
        byte[] bArr2 = Util.f12372a;
        if ((j10 | j11) < 0 || j10 > length2 || length2 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new RequestBody() { // from class: okhttp3.RequestBody.2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f12334d = 0;

            @Override // okhttp3.RequestBody
            public final long a() {
                return length;
            }

            @Override // okhttp3.RequestBody
            public final MediaType b() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final void d(r rVar) {
                rVar.g(bArr, this.f12334d, length);
            }
        };
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public abstract void d(r rVar);
}
