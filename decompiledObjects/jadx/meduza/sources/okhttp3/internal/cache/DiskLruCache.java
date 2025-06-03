package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: okhttp3.internal.cache.DiskLruCache$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$2, reason: invalid class name */
    class AnonymousClass2 extends FaultHidingSink {
        public AnonymousClass2() {
            throw null;
        }

        @Override // okhttp3.internal.cache.FaultHidingSink
        public final void f() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$3, reason: invalid class name */
    class AnonymousClass3 implements Iterator<Snapshot> {

        /* renamed from: a, reason: collision with root package name */
        public Snapshot f12405a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f12405a = null;
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Snapshot snapshot = this.f12405a;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                try {
                    snapshot.getClass();
                    throw null;
                } catch (IOException unused) {
                }
            } finally {
                this.f12405a = null;
            }
        }
    }

    public final class Editor {

        /* renamed from: okhttp3.internal.cache.DiskLruCache$Editor$1, reason: invalid class name */
        class AnonymousClass1 extends FaultHidingSink {
            public AnonymousClass1() {
                throw null;
            }

            @Override // okhttp3.internal.cache.FaultHidingSink
            public final void f() {
                throw null;
            }
        }

        public Editor() {
            throw null;
        }
    }

    public final class Entry {
        public Entry() {
            throw null;
        }
    }

    public final class Snapshot implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
    }
}
