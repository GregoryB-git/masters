// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import g0.M;
import java.io.IOException;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;
import android.content.res.AssetManager;

public final class a extends b
{
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;
    
    public a(final Context context) {
        super(false);
        this.e = context.getAssets();
    }
    
    @Override
    public void close() {
        this.f = null;
        try {
            Label_0029: {
                try {
                    final InputStream g = this.g;
                    if (g != null) {
                        g.close();
                    }
                    break Label_0029;
                }
                finally {
                    this.g = null;
                    if (this.i) {
                        this.i = false;
                        this.r();
                    }
                    final IOException ex;
                    throw new a(ex, 2000);
                    this.g = null;
                    // iftrue(Label_0050:, !this.i)
                    this.i = false;
                    this.r();
                    Label_0050:;
                }
            }
        }
        catch (IOException ex2) {}
    }
    
    @Override
    public long e(final k k) {
        while (true) {
            try {
                final Uri a = k.a;
                this.f = a;
                final String s = (String)g0.a.e(a.getPath());
                String s2;
                if (s.startsWith("/android_asset/")) {
                    s2 = s.substring(15);
                }
                else {
                    s2 = s;
                    if (s.startsWith("/")) {
                        s2 = s.substring(1);
                    }
                }
                this.s(k);
                final InputStream open = this.e.open(s2, 1);
                this.g = open;
                if (open.skip(k.g) >= k.g) {
                    final long h = k.h;
                    if (h != -1L) {
                        this.h = h;
                    }
                    else {
                        final long h2 = this.g.available();
                        this.h = h2;
                        if (h2 == 2147483647L) {
                            this.h = -1L;
                        }
                    }
                    this.i = true;
                    this.t(k);
                    return this.h;
                }
                throw new a((Throwable)null, 2008);
                int n = 2000;
                final IOException ex;
                throw new a(ex, n);
                throw;
                n = 2005;
                throw new a(ex, n);
            }
            catch (IOException ex2) {}
            catch (a a3) {}
            final a a3;
            final a a2 = a3;
            continue;
        }
    }
    
    @Override
    public Uri k() {
        return this.f;
    }
    
    @Override
    public int read(final byte[] b, int read, int len) {
        if (len == 0) {
            return 0;
        }
        final long h = this.h;
        if (h == 0L) {
            return -1;
        }
        Label_0046: {
            if (h == -1L) {
                break Label_0046;
            }
            final long b2 = len;
            try {
                len = (int)Math.min(h, b2);
                read = ((InputStream)M.i(this.g)).read(b, read, len);
                if (read == -1) {
                    return -1;
                }
                final long h2 = this.h;
                if (h2 != -1L) {
                    this.h = h2 - read;
                }
                this.q(read);
                return read;
            }
            catch (IOException ex) {
                throw new a(ex, 2000);
            }
        }
    }
    
    public static final class a extends h
    {
        public a(final Throwable t, final int n) {
            super(t, n);
        }
    }
}
