/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.URLDecoder
 *  java.nio.charset.Charset
 */
package i0;

import android.net.Uri;
import android.util.Base64;
import d0.A;
import g0.M;
import g0.a;
import i0.b;
import i0.h;
import i0.k;
import java.net.URLDecoder;
import java.nio.charset.Charset;

public final class e
extends b {
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
    public long e(k k8) {
        this.s(k8);
        this.e = k8;
        byte[] arrby = k8.a.normalizeScheme();
        StringBuilder stringBuilder = arrby.getScheme();
        boolean bl = "data".equals((Object)stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unsupported scheme: ");
        stringBuilder2.append((String)stringBuilder);
        a.b(bl, stringBuilder2.toString());
        stringBuilder = M.b1(arrby.getSchemeSpecificPart(), ",");
        if (stringBuilder.length == 2) {
            arrby = stringBuilder[1];
            if (stringBuilder[0].contains((CharSequence)";base64")) {
                try {
                    this.f = Base64.decode((String)arrby, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error while parsing Base64 encoded string: ");
                    stringBuilder.append((String)arrby);
                    throw A.b(stringBuilder.toString(), (Throwable)illegalArgumentException);
                }
            } else {
                this.f = M.r0(URLDecoder.decode((String)arrby, (String)W2.e.a.name()));
            }
            long l8 = k8.g;
            arrby = this.f;
            if (l8 <= (long)arrby.length) {
                int n8;
                this.g = n8 = (int)l8;
                this.h = n8 = arrby.length - n8;
                l8 = k8.h;
                if (l8 != -1L) {
                    this.h = (int)Math.min((long)n8, (long)l8);
                }
                this.t(k8);
                l8 = k8.h;
                if (l8 != -1L) {
                    return l8;
                }
                return this.h;
            }
            this.f = null;
            throw new h(2008);
        }
        k8 = new StringBuilder();
        k8.append("Unexpected URI format: ");
        k8.append((Object)arrby);
        throw A.b(k8.toString(), null);
    }

    @Override
    public Uri k() {
        k k8 = this.e;
        if (k8 != null) {
            return k8.a;
        }
        return null;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        if (n9 == 0) {
            return 0;
        }
        int n10 = this.h;
        if (n10 == 0) {
            return -1;
        }
        n9 = Math.min((int)n9, (int)n10);
        System.arraycopy((Object)M.i(this.f), (int)this.g, (Object)arrby, (int)n8, (int)n9);
        this.g += n9;
        this.h -= n9;
        this.q(n9);
        return n9;
    }
}

