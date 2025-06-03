// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.util.Collections;
import g0.a;
import java.util.Map;
import android.net.Uri;

public final class x implements g
{
    public final g a;
    public long b;
    public Uri c;
    public Map d;
    
    public x(final g g) {
        this.a = (g)g0.a.e(g);
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }
    
    @Override
    public void c(final y y) {
        g0.a.e(y);
        this.a.c(y);
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public long e(final k k) {
        this.c = k.a;
        this.d = Collections.emptyMap();
        final long e = this.a.e(k);
        this.c = (Uri)g0.a.e(this.k());
        this.d = this.g();
        return e;
    }
    
    @Override
    public Map g() {
        return this.a.g();
    }
    
    @Override
    public Uri k() {
        return this.a.k();
    }
    
    public long q() {
        return this.b;
    }
    
    public Uri r() {
        return this.c;
    }
    
    @Override
    public int read(final byte[] array, int read, final int n) {
        read = this.a.read(array, read, n);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
    
    public Map s() {
        return this.d;
    }
    
    public void t() {
        this.b = 0L;
    }
}
