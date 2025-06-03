// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import g0.z;
import android.net.Uri;
import java.util.Map;
import i0.k;
import i0.y;
import g0.a;
import i0.g;

public final class q implements g
{
    public final g a;
    public final int b;
    public final a c;
    public final byte[] d;
    public int e;
    
    public q(final g a, final int n, final a c) {
        g0.a.a(n > 0);
        this.a = a;
        this.b = n;
        this.c = c;
        this.d = new byte[1];
        this.e = n;
    }
    
    @Override
    public void c(final y y) {
        g0.a.e(y);
        this.a.c(y);
    }
    
    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public long e(final k k) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Map g() {
        return this.a.g();
    }
    
    @Override
    public Uri k() {
        return this.a.k();
    }
    
    public final boolean q() {
        if (this.a.read(this.d, 0, 1) == -1) {
            return false;
        }
        final int n = (this.d[0] & 0xFF) << 4;
        if (n == 0) {
            return true;
        }
        final byte[] array = new byte[n];
        int n2 = n;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = n;
            if (n2 <= 0) {
                break;
            }
            final int read = this.a.read(array, n3, n2);
            if (read == -1) {
                return false;
            }
            n3 += read;
            n2 -= read;
        }
        while (n4 > 0 && array[n4 - 1] == 0) {
            --n4;
        }
        if (n4 > 0) {
            this.c.a(new z(array, n4));
        }
        return true;
    }
    
    @Override
    public int read(final byte[] array, int read, final int b) {
        if (this.e == 0) {
            if (!this.q()) {
                return -1;
            }
            this.e = this.b;
        }
        read = this.a.read(array, read, Math.min(this.e, b));
        if (read != -1) {
            this.e -= read;
        }
        return read;
    }
    
    public interface a
    {
        void a(final z p0);
    }
}
