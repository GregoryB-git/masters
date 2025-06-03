package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.platform.Platform;
import xc.h;
import xc.j;
import xc.k;
import xc.w;

/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: okhttp3.Cache$1, reason: invalid class name */
    public class AnonymousClass1 implements InternalCache {
        @Override // okhttp3.internal.cache.InternalCache
        public final void a() {
            throw null;
        }

        @Override // okhttp3.internal.cache.InternalCache
        public final CacheRequest b() {
            throw null;
        }

        @Override // okhttp3.internal.cache.InternalCache
        public final void c() {
            throw null;
        }

        @Override // okhttp3.internal.cache.InternalCache
        public final void d() {
            throw null;
        }

        @Override // okhttp3.internal.cache.InternalCache
        public final Response get() {
            throw null;
        }

        @Override // okhttp3.internal.cache.InternalCache
        public final void remove() {
            throw null;
        }
    }

    /* renamed from: okhttp3.Cache$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12159a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            this.f12159a = false;
            throw null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f12159a = true;
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f12159a) {
                throw new IllegalStateException("remove() before next()");
            }
            throw null;
        }
    }

    public final class CacheRequestImpl implements CacheRequest {

        /* renamed from: okhttp3.Cache$CacheRequestImpl$1, reason: invalid class name */
        class AnonymousClass1 extends j {
            public AnonymousClass1() {
                throw null;
            }

            @Override // xc.j, xc.w, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        public CacheRequestImpl() {
            throw null;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void a() {
            throw null;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final w b() {
            return null;
        }
    }

    public static class CacheResponseBody extends ResponseBody {

        /* renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        class AnonymousClass1 extends k {
            public AnonymousClass1() {
                throw null;
            }

            @Override // xc.k, xc.y, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        public CacheResponseBody() {
            throw null;
        }

        @Override // okhttp3.ResponseBody
        public final h H() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final long f() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType g() {
            return null;
        }
    }

    public static final class Entry {
        static {
            Platform.f12669a.getClass();
        }

        public Entry() {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
