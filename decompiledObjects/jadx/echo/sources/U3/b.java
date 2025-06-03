package U3;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b extends Reader {

    /* renamed from: o, reason: collision with root package name */
    public List f6362o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6363p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f6364q;

    /* renamed from: s, reason: collision with root package name */
    public int f6366s = this.f6364q;

    /* renamed from: r, reason: collision with root package name */
    public int f6365r;

    /* renamed from: t, reason: collision with root package name */
    public int f6367t = this.f6365r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6368u = false;

    public b() {
        this.f6362o = null;
        this.f6362o = new ArrayList();
    }

    public void a(String str) {
        if (this.f6368u) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            this.f6362o.add(str);
        }
    }

    public final long b(long j7) {
        long j8 = 0;
        while (this.f6365r < this.f6362o.size() && j8 < j7) {
            long j9 = j7 - j8;
            long h7 = h();
            if (j9 < h7) {
                this.f6364q = (int) (this.f6364q + j9);
                j8 += j9;
            } else {
                j8 += h7;
                this.f6364q = 0;
                this.f6365r++;
            }
        }
        return j8;
    }

    public final void c() {
        if (this.f6363p) {
            throw new IOException("Stream already closed");
        }
        if (!this.f6368u) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
        this.f6363p = true;
    }

    public final String e() {
        if (this.f6365r < this.f6362o.size()) {
            return (String) this.f6362o.get(this.f6365r);
        }
        return null;
    }

    public final int h() {
        String e7 = e();
        if (e7 == null) {
            return 0;
        }
        return e7.length() - this.f6364q;
    }

    public void i() {
        if (this.f6368u) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.f6368u = true;
    }

    @Override // java.io.Reader
    public void mark(int i7) {
        c();
        this.f6366s = this.f6364q;
        this.f6367t = this.f6365r;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        c();
        String e7 = e();
        if (e7 == null) {
            return -1;
        }
        char charAt = e7.charAt(this.f6364q);
        b(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public boolean ready() {
        c();
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        this.f6364q = this.f6366s;
        this.f6365r = this.f6367t;
    }

    @Override // java.io.Reader
    public long skip(long j7) {
        c();
        return b(j7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f6362o.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        c();
        int remaining = charBuffer.remaining();
        String e7 = e();
        int i7 = 0;
        while (remaining > 0 && e7 != null) {
            int min = Math.min(e7.length() - this.f6364q, remaining);
            String str = (String) this.f6362o.get(this.f6365r);
            int i8 = this.f6364q;
            charBuffer.put(str, i8, i8 + min);
            remaining -= min;
            i7 += min;
            b(min);
            e7 = e();
        }
        if (i7 > 0 || e7 != null) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i7, int i8) {
        c();
        String e7 = e();
        int i9 = 0;
        while (e7 != null && i9 < i8) {
            int min = Math.min(h(), i8 - i9);
            int i10 = this.f6364q;
            e7.getChars(i10, i10 + min, cArr, i7 + i9);
            i9 += min;
            b(min);
            e7 = e();
        }
        if (i9 > 0 || e7 != null) {
            return i9;
        }
        return -1;
    }
}
