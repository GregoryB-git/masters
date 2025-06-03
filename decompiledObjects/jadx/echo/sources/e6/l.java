package e6;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f14056a;

    public static final class a implements Iterator, h6.a {

        /* renamed from: o, reason: collision with root package name */
        public String f14057o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f14058p;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f14057o;
            this.f14057o = null;
            Intrinsics.b(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14057o == null && !this.f14058p) {
                String readLine = l.this.f14056a.readLine();
                this.f14057o = readLine;
                if (readLine == null) {
                    this.f14058p = true;
                }
            }
            return this.f14057o != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f14056a = reader;
    }

    @Override // n6.b
    public Iterator iterator() {
        return new a();
    }
}
