// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import java.io.IOException;
import M4.l;
import G4.j;
import java.io.InputStream;

public final class a extends InputStream
{
    public final InputStream o;
    public final j p;
    public final l q;
    public long r;
    public long s;
    public long t;
    
    public a(final InputStream o, final j p3, final l q) {
        this.r = -1L;
        this.t = -1L;
        this.q = q;
        this.o = o;
        this.p = p3;
        this.s = p3.j();
    }
    
    @Override
    public int available() {
        try {
            return this.o.available();
        }
        catch (IOException ex) {
            this.p.A(this.q.c());
            I4.j.d(this.p);
            throw ex;
        }
    }
    
    @Override
    public void close() {
        final long c = this.q.c();
        if (this.t == -1L) {
            this.t = c;
        }
        while (true) {
            try {
                this.o.close();
                final long r = this.r;
                if (r != -1L) {
                    this.p.y(r);
                }
                final long s = this.s;
                if (s != -1L) {
                    this.p.B(s);
                }
                this.p.A(this.t);
                this.p.g();
                return;
                this.p.A(this.q.c());
                I4.j.d(this.p);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void mark(final int readlimit) {
        this.o.mark(readlimit);
    }
    
    @Override
    public boolean markSupported() {
        return this.o.markSupported();
    }
    
    @Override
    public int read() {
        while (true) {
            try {
                final int read = this.o.read();
                final long c = this.q.c();
                if (this.s == -1L) {
                    this.s = c;
                }
                if (read == -1 && this.t == -1L) {
                    this.t = c;
                    this.p.A(c);
                    this.p.g();
                    return read;
                }
                final long r = this.r + 1L;
                this.r = r;
                this.p.y(r);
                return read;
                this.p.A(this.q.c());
                I4.j.d(this.p);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public int read(final byte[] b) {
        while (true) {
            try {
                final int read = this.o.read(b);
                final long c = this.q.c();
                if (this.s == -1L) {
                    this.s = c;
                }
                if (read == -1 && this.t == -1L) {
                    this.t = c;
                    this.p.A(c);
                    this.p.g();
                    return read;
                }
                final long r = this.r + read;
                this.r = r;
                this.p.y(r);
                return read;
                this.p.A(this.q.c());
                I4.j.d(this.p);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public int read(final byte[] b, int read, final int len) {
        while (true) {
            try {
                read = this.o.read(b, read, len);
                final long c = this.q.c();
                if (this.s == -1L) {
                    this.s = c;
                }
                if (read == -1 && this.t == -1L) {
                    this.t = c;
                    this.p.A(c);
                    this.p.g();
                    return read;
                }
                final long r = this.r + read;
                this.r = r;
                this.p.y(r);
                return read;
                this.p.A(this.q.c());
                I4.j.d(this.p);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void reset() {
        try {
            this.o.reset();
        }
        catch (IOException ex) {
            this.p.A(this.q.c());
            I4.j.d(this.p);
            throw ex;
        }
    }
    
    @Override
    public long skip(long skip) {
        while (true) {
            try {
                skip = this.o.skip(skip);
                final long c = this.q.c();
                if (this.s == -1L) {
                    this.s = c;
                }
                if (skip == -1L && this.t == -1L) {
                    this.t = c;
                    this.p.A(c);
                    return skip;
                }
                final long r = this.r + skip;
                this.r = r;
                this.p.y(r);
                return skip;
                this.p.A(this.q.c());
                I4.j.d(this.p);
                throw;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
}
