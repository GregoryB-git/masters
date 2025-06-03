/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 */
package I4;

import I4.j;
import M4.l;
import N4.h;
import java.io.IOException;
import java.io.InputStream;

public final class a
extends InputStream {
    public final InputStream o;
    public final G4.j p;
    public final l q;
    public long r = -1L;
    public long s;
    public long t = -1L;

    public a(InputStream inputStream, G4.j j8, l l8) {
        this.q = l8;
        this.o = inputStream;
        this.p = j8;
        this.s = j8.j();
    }

    public int available() {
        try {
            int n8 = this.o.available();
            return n8;
        }
        catch (IOException iOException) {
            this.p.A(this.q.c());
            j.d(this.p);
            throw iOException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        long l8 = this.q.c();
        if (this.t == -1L) {
            this.t = l8;
        }
        try {
            this.o.close();
            l8 = this.r;
            if (l8 != -1L) {
                this.p.y(l8);
            }
            if ((l8 = this.s) != -1L) {
                this.p.B(l8);
            }
            this.p.A(this.t);
            this.p.g();
            return;
        }
        catch (IOException iOException) {}
        this.p.A(this.q.c());
        j.d(this.p);
        throw iOException;
    }

    public void mark(int n8) {
        this.o.mark(n8);
    }

    public boolean markSupported() {
        return this.o.markSupported();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read() {
        try {
            int n8 = this.o.read();
            long l8 = this.q.c();
            if (this.s == -1L) {
                this.s = l8;
            }
            if (n8 == -1 && this.t == -1L) {
                this.t = l8;
                this.p.A(l8);
                this.p.g();
                return n8;
            }
            this.r = l8 = this.r + 1L;
            this.p.y(l8);
            return n8;
        }
        catch (IOException iOException) {}
        this.p.A(this.q.c());
        j.d(this.p);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(byte[] arrby) {
        try {
            int n8 = this.o.read(arrby);
            long l8 = this.q.c();
            if (this.s == -1L) {
                this.s = l8;
            }
            if (n8 == -1 && this.t == -1L) {
                this.t = l8;
                this.p.A(l8);
                this.p.g();
                return n8;
            }
            this.r = l8 = this.r + (long)n8;
            this.p.y(l8);
            return n8;
        }
        catch (IOException iOException) {}
        this.p.A(this.q.c());
        j.d(this.p);
        throw iOException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(byte[] arrby, int n8, int n9) {
        try {
            n8 = this.o.read(arrby, n8, n9);
            long l8 = this.q.c();
            if (this.s == -1L) {
                this.s = l8;
            }
            if (n8 == -1 && this.t == -1L) {
                this.t = l8;
                this.p.A(l8);
                this.p.g();
                return n8;
            }
            this.r = l8 = this.r + (long)n8;
            this.p.y(l8);
            return n8;
        }
        catch (IOException iOException) {}
        this.p.A(this.q.c());
        j.d(this.p);
        throw iOException;
    }

    public void reset() {
        try {
            this.o.reset();
            return;
        }
        catch (IOException iOException) {
            this.p.A(this.q.c());
            j.d(this.p);
            throw iOException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long skip(long l8) {
        try {
            l8 = this.o.skip(l8);
            long l9 = this.q.c();
            if (this.s == -1L) {
                this.s = l9;
            }
            if (l8 == -1L && this.t == -1L) {
                this.t = l9;
                this.p.A(l9);
                return l8;
            }
            this.r = l9 = this.r + l8;
            this.p.y(l9);
            return l8;
        }
        catch (IOException iOException) {}
        this.p.A(this.q.c());
        j.d(this.p);
        throw iOException;
    }
}

