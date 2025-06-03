// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import java.io.IOException;
import G4.j;
import M4.l;
import java.io.OutputStream;

public final class b extends OutputStream
{
    public final OutputStream o;
    public final l p;
    public j q;
    public long r;
    
    public b(final OutputStream o, final j q, final l p3) {
        this.r = -1L;
        this.o = o;
        this.q = q;
        this.p = p3;
    }
    
    @Override
    public void close() {
        final long r = this.r;
        if (r != -1L) {
            this.q.v(r);
        }
        this.q.z(this.p.c());
        try {
            this.o.close();
        }
        catch (IOException ex) {
            this.q.A(this.p.c());
            I4.j.d(this.q);
            throw ex;
        }
    }
    
    @Override
    public void flush() {
        try {
            this.o.flush();
        }
        catch (IOException ex) {
            this.q.A(this.p.c());
            I4.j.d(this.q);
            throw ex;
        }
    }
    
    @Override
    public void write(final int n) {
        try {
            this.o.write(n);
            final long r = this.r + 1L;
            this.r = r;
            this.q.v(r);
        }
        catch (IOException ex) {
            this.q.A(this.p.c());
            I4.j.d(this.q);
            throw ex;
        }
    }
    
    @Override
    public void write(final byte[] b) {
        try {
            this.o.write(b);
            final long r = this.r + b.length;
            this.r = r;
            this.q.v(r);
        }
        catch (IOException ex) {
            this.q.A(this.p.c());
            I4.j.d(this.q);
            throw ex;
        }
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) {
        try {
            this.o.write(b, off, len);
            final long r = this.r + len;
            this.r = r;
            this.q.v(r);
        }
        catch (IOException ex) {
            this.q.A(this.p.c());
            I4.j.d(this.q);
            throw ex;
        }
    }
}
