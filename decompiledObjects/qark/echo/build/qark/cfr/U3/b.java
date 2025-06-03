/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.CharBuffer
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package U3;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
extends Reader {
    public List o = null;
    public boolean p = false;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;

    public b() {
        this.s = this.q;
        this.t = this.r;
        this.u = false;
        this.o = new ArrayList();
    }

    public void a(String string2) {
        if (!this.u) {
            if (string2.length() > 0) {
                this.o.add((Object)string2);
            }
            return;
        }
        throw new IllegalStateException("Trying to add string after reading");
    }

    public final long b(long l8) {
        long l9 = 0L;
        while (this.r < this.o.size() && l9 < l8) {
            long l10 = l8 - l9;
            int n8 = this.h();
            long l11 = n8;
            if (l10 < l11) {
                this.q = (int)((long)this.q + l10);
                l9 += l10;
                continue;
            }
            l9 += l11;
            this.q = 0;
            ++this.r;
        }
        return l9;
    }

    public final void c() {
        if (!this.p) {
            if (this.u) {
                return;
            }
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
        throw new IOException("Stream already closed");
    }

    public void close() {
        this.c();
        this.p = true;
    }

    public final String e() {
        if (this.r < this.o.size()) {
            return (String)this.o.get(this.r);
        }
        return null;
    }

    public final int h() {
        String string2 = this.e();
        if (string2 == null) {
            return 0;
        }
        return string2.length() - this.q;
    }

    public void i() {
        if (!this.u) {
            this.u = true;
            return;
        }
        throw new IllegalStateException("Trying to freeze frozen StringListReader");
    }

    public void mark(int n8) {
        this.c();
        this.s = this.q;
        this.t = this.r;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        this.c();
        String string2 = this.e();
        if (string2 == null) {
            return -1;
        }
        char c8 = string2.charAt(this.q);
        this.b(1L);
        return c8;
    }

    public int read(CharBuffer charBuffer) {
        this.c();
        int n8 = charBuffer.remaining();
        String string2 = this.e();
        int n9 = 0;
        while (n8 > 0 && string2 != null) {
            int n10 = Math.min((int)(string2.length() - this.q), (int)n8);
            string2 = (String)this.o.get(this.r);
            int n11 = this.q;
            charBuffer.put(string2, n11, n11 + n10);
            n8 -= n10;
            n9 += n10;
            this.b(n10);
            string2 = this.e();
        }
        if (n9 <= 0) {
            if (string2 != null) {
                return n9;
            }
            return -1;
        }
        return n9;
    }

    public int read(char[] arrc, int n8, int n9) {
        int n10;
        int n11;
        this.c();
        String string2 = this.e();
        for (n10 = 0; string2 != null && n10 < n9; n10 += n11) {
            n11 = Math.min((int)this.h(), (int)(n9 - n10));
            int n12 = this.q;
            string2.getChars(n12, n12 + n11, arrc, n8 + n10);
            this.b(n11);
            string2 = this.e();
        }
        if (n10 <= 0) {
            if (string2 != null) {
                return n10;
            }
            return -1;
        }
        return n10;
    }

    public boolean ready() {
        this.c();
        return true;
    }

    public void reset() {
        this.q = this.s;
        this.r = this.t;
    }

    public long skip(long l8) {
        this.c();
        return this.b(l8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.o.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
        }
        return stringBuilder.toString();
    }
}

