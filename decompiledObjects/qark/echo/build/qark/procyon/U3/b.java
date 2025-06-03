// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U3;

import java.util.Iterator;
import java.nio.CharBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Reader;

public class b extends Reader
{
    public List o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    
    public b() {
        this.o = null;
        this.p = false;
        this.s = this.q;
        this.t = this.r;
        this.u = false;
        this.o = new ArrayList();
    }
    
    public void a(final String s) {
        if (!this.u) {
            if (s.length() > 0) {
                this.o.add(s);
            }
            return;
        }
        throw new IllegalStateException("Trying to add string after reading");
    }
    
    public final long b(final long n) {
        long n2 = 0L;
        while (this.r < this.o.size() && n2 < n) {
            final int h = this.h();
            final long n3 = n - n2;
            final long n4 = h;
            if (n3 < n4) {
                this.q += (int)n3;
                n2 += n3;
            }
            else {
                n2 += n4;
                this.q = 0;
                ++this.r;
            }
        }
        return n2;
    }
    
    public final void c() {
        if (this.p) {
            throw new IOException("Stream already closed");
        }
        if (this.u) {
            return;
        }
        throw new IOException("Reader needs to be frozen before read operations can be called");
    }
    
    @Override
    public void close() {
        this.c();
        this.p = true;
    }
    
    public final String e() {
        if (this.r < this.o.size()) {
            return this.o.get(this.r);
        }
        return null;
    }
    
    public final int h() {
        final String e = this.e();
        if (e == null) {
            return 0;
        }
        return e.length() - this.q;
    }
    
    public void i() {
        if (!this.u) {
            this.u = true;
            return;
        }
        throw new IllegalStateException("Trying to freeze frozen StringListReader");
    }
    
    @Override
    public void mark(final int n) {
        this.c();
        this.s = this.q;
        this.t = this.r;
    }
    
    @Override
    public boolean markSupported() {
        return true;
    }
    
    @Override
    public int read() {
        this.c();
        final String e = this.e();
        if (e == null) {
            return -1;
        }
        final char char1 = e.charAt(this.q);
        this.b(1L);
        return char1;
    }
    
    @Override
    public int read(final CharBuffer charBuffer) {
        this.c();
        int remaining = charBuffer.remaining();
        String s = this.e();
        int n = 0;
        while (remaining > 0 && s != null) {
            final int min = Math.min(s.length() - this.q, remaining);
            final String src = this.o.get(this.r);
            final int q = this.q;
            charBuffer.put(src, q, q + min);
            remaining -= min;
            n += min;
            this.b(min);
            s = this.e();
        }
        if (n > 0) {
            return n;
        }
        if (s != null) {
            return n;
        }
        return -1;
    }
    
    @Override
    public int read(final char[] dst, final int n, final int n2) {
        this.c();
        String s;
        int n3;
        int min;
        int q;
        for (s = this.e(), n3 = 0; s != null && n3 < n2; s = this.e()) {
            min = Math.min(this.h(), n2 - n3);
            q = this.q;
            s.getChars(q, q + min, dst, n + n3);
            n3 += min;
            this.b(min);
        }
        if (n3 > 0) {
            return n3;
        }
        if (s != null) {
            return n3;
        }
        return -1;
    }
    
    @Override
    public boolean ready() {
        this.c();
        return true;
    }
    
    @Override
    public void reset() {
        this.q = this.s;
        this.r = this.t;
    }
    
    @Override
    public long skip(final long n) {
        this.c();
        return this.b(n);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = this.o.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }
}
