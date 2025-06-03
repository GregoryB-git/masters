/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 */
package I4;

import I4.j;
import M4.l;
import java.io.IOException;
import java.io.OutputStream;

public final class b
extends OutputStream {
    public final OutputStream o;
    public final l p;
    public G4.j q;
    public long r = -1L;

    public b(OutputStream outputStream, G4.j j8, l l8) {
        this.o = outputStream;
        this.q = j8;
        this.p = l8;
    }

    public void close() {
        long l8 = this.r;
        if (l8 != -1L) {
            this.q.v(l8);
        }
        this.q.z(this.p.c());
        try {
            this.o.close();
            return;
        }
        catch (IOException iOException) {
            this.q.A(this.p.c());
            j.d(this.q);
            throw iOException;
        }
    }

    public void flush() {
        try {
            this.o.flush();
            return;
        }
        catch (IOException iOException) {
            this.q.A(this.p.c());
            j.d(this.q);
            throw iOException;
        }
    }

    public void write(int n8) {
        try {
            long l8;
            this.o.write(n8);
            this.r = l8 = this.r + 1L;
            this.q.v(l8);
            return;
        }
        catch (IOException iOException) {
            this.q.A(this.p.c());
            j.d(this.q);
            throw iOException;
        }
    }

    public void write(byte[] arrby) {
        try {
            long l8;
            this.o.write(arrby);
            this.r = l8 = this.r + (long)arrby.length;
            this.q.v(l8);
            return;
        }
        catch (IOException iOException) {
            this.q.A(this.p.c());
            j.d(this.q);
            throw iOException;
        }
    }

    public void write(byte[] arrby, int n8, int n9) {
        try {
            long l8;
            this.o.write(arrby, n8, n9);
            this.r = l8 = this.r + (long)n9;
            this.q.v(l8);
            return;
        }
        catch (IOException iOException) {
            this.q.A(this.p.c());
            j.d(this.q);
            throw iOException;
        }
    }
}

