// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import android.system.OsConstants;
import android.system.ErrnoException;
import java.io.IOException;
import java.io.FileNotFoundException;
import g0.M;
import android.text.TextUtils;
import g0.a;
import android.net.Uri;
import java.io.RandomAccessFile;

public final class p extends i0.b
{
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;
    
    public p() {
        super(false);
    }
    
    public static RandomAccessFile u(final Uri uri) {
        int n = 2006;
        try {
            return new RandomAccessFile((String)g0.a.e(uri.getPath()), "r");
        }
        catch (RuntimeException ex) {
            throw new b(ex, 2000);
        }
        catch (SecurityException ex2) {
            throw new b(ex2, 2006);
        }
        catch (FileNotFoundException ex3) {
            if (TextUtils.isEmpty((CharSequence)uri.getQuery()) && TextUtils.isEmpty((CharSequence)uri.getFragment())) {
                if (M.a < 21 || !b(ex3.getCause())) {
                    n = 2005;
                }
                throw new b(ex3, n);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), ex3, 1004);
        }
    }
    
    @Override
    public void close() {
        this.f = null;
        try {
            Label_0029: {
                try {
                    final RandomAccessFile e = this.e;
                    if (e != null) {
                        e.close();
                    }
                    break Label_0029;
                }
                finally {
                    this.e = null;
                    if (this.h) {
                        this.h = false;
                        this.r();
                    }
                    // iftrue(Label_0050:, !this.h)
                    while (true) {
                        this.h = false;
                        this.r();
                        return;
                        this.e = null;
                        continue;
                    }
                    Label_0050:;
                }
            }
        }
        catch (IOException ex) {}
    }
    
    @Override
    public long e(final k k) {
        final Uri a = k.a;
        this.f = a;
        this.s(k);
        final RandomAccessFile u = u(a);
        this.e = u;
        try {
            u.seek(k.g);
            long h;
            if ((h = k.h) == -1L) {
                h = this.e.length() - k.g;
            }
            this.g = h;
            if (h >= 0L) {
                this.h = true;
                this.t(k);
                return this.g;
            }
            throw new b(null, null, 2008);
        }
        catch (IOException ex) {
            throw new b(ex, 2000);
        }
    }
    
    @Override
    public Uri k() {
        return this.f;
    }
    
    @Override
    public int read(final byte[] b, int read, final int n) {
        if (n == 0) {
            return 0;
        }
        if (this.g == 0L) {
            return -1;
        }
        try {
            read = ((RandomAccessFile)M.i(this.e)).read(b, read, (int)Math.min(this.g, n));
            if (read > 0) {
                this.g -= read;
                this.q(read);
            }
            return read;
        }
        catch (IOException ex) {
            throw new b(ex, 2000);
        }
    }
    
    public abstract static final class a
    {
        private static boolean b(final Throwable t) {
            return t instanceof ErrnoException && ((ErrnoException)t).errno == OsConstants.EACCES;
        }
    }
    
    public static class b extends h
    {
        public b(final String s, final Throwable t, final int n) {
            super(s, t, n);
        }
        
        public b(final Throwable t, final int n) {
            super(t, n);
        }
    }
}
