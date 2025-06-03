// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import android.net.Uri;
import java.net.URLDecoder;
import android.util.Base64;
import d0.A;
import g0.M;
import g0.a;

public final class e extends b
{
    public k e;
    public byte[] f;
    public int g;
    public int h;
    
    public e() {
        super(false);
    }
    
    @Override
    public void close() {
        if (this.f != null) {
            this.f = null;
            this.r();
        }
        this.e = null;
    }
    
    @Override
    public long e(final k e) {
        this.s(e);
        this.e = e;
        final Uri normalizeScheme = e.a.normalizeScheme();
        final String scheme = normalizeScheme.getScheme();
        final boolean equals = "data".equals(scheme);
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported scheme: ");
        sb.append(scheme);
        g0.a.b(equals, sb.toString());
        final String[] b1 = M.b1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (b1.length != 2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected URI format: ");
            sb2.append(normalizeScheme);
            throw A.b(sb2.toString(), null);
        }
        final String s = b1[1];
        Label_0172: {
            if (b1[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(s, 0);
                    break Label_0172;
                }
                catch (IllegalArgumentException ex) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error while parsing Base64 encoded string: ");
                    sb3.append(s);
                    throw A.b(sb3.toString(), ex);
                }
            }
            this.f = M.r0(URLDecoder.decode(s, e.a.name()));
        }
        final long g = e.g;
        final byte[] f = this.f;
        if (g > f.length) {
            this.f = null;
            throw new h(2008);
        }
        final int g2 = (int)g;
        this.g = g2;
        final int h = f.length - g2;
        this.h = h;
        final long h2 = e.h;
        if (h2 != -1L) {
            this.h = (int)Math.min(h, h2);
        }
        this.t(e);
        final long h3 = e.h;
        if (h3 != -1L) {
            return h3;
        }
        return this.h;
    }
    
    @Override
    public Uri k() {
        final k e = this.e;
        if (e != null) {
            return e.a;
        }
        return null;
    }
    
    @Override
    public int read(final byte[] array, final int n, int min) {
        if (min == 0) {
            return 0;
        }
        final int h = this.h;
        if (h == 0) {
            return -1;
        }
        min = Math.min(min, h);
        System.arraycopy(M.i(this.f), this.g, array, n, min);
        this.g += min;
        this.h -= min;
        this.q(min);
        return min;
    }
}
