/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package i0;

import android.net.Uri;
import d0.v;
import g0.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class k {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    static {
        v.a("media3.datasource");
    }

    public k(Uri uri, long l8, int n8, byte[] arrby, Map map, long l9, long l10, String string2, int n9, Object object) {
        long l11 = l8 + l9;
        boolean bl = true;
        boolean bl2 = l11 >= 0L;
        a.a(bl2);
        bl2 = l9 >= 0L;
        a.a(bl2);
        bl2 = bl;
        if (l10 <= 0L) {
            bl2 = l10 == -1L ? bl : false;
        }
        a.a(bl2);
        this.a = (Uri)a.e((Object)uri);
        this.b = l8;
        this.c = n8;
        if (arrby == null || arrby.length == 0) {
            arrby = null;
        }
        this.d = arrby;
        this.e = Collections.unmodifiableMap((Map)new HashMap(map));
        this.g = l9;
        this.f = l11;
        this.h = l10;
        this.i = string2;
        this.j = n9;
        this.k = object;
    }

    public /* synthetic */ k(Uri uri, long l8, int n8, byte[] arrby, Map map, long l9, long l10, String string2, int n9, Object object,  a8) {
        this(uri, l8, n8, arrby, map, l9, l10, string2, n9, object);
    }

    public static String c(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public b a() {
        return new b(this, null);
    }

    public final String b() {
        return k.c(this.c);
    }

    public boolean d(int n8) {
        if ((this.j & n8) == n8) {
            return true;
        }
        return false;
    }

    public k e(long l8) {
        long l9 = this.h;
        long l10 = -1L;
        if (l9 != -1L) {
            l10 = l9 - l8;
        }
        return this.f(l8, l10);
    }

    public k f(long l8, long l9) {
        if (l8 == 0L && this.h == l9) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, this.e, this.g + l8, l9, this.i, this.j, this.k);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSpec[");
        stringBuilder.append(this.b());
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.g);
        stringBuilder.append(", ");
        stringBuilder.append(this.h);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class b {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;

        public b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        public b(k k8) {
            this.a = k8.a;
            this.b = k8.b;
            this.c = k8.c;
            this.d = k8.d;
            this.e = k8.e;
            this.f = k8.g;
            this.g = k8.h;
            this.h = k8.i;
            this.i = k8.j;
            this.j = k8.k;
        }

        public /* synthetic */ b(k k8,  a8) {
            this(k8);
        }

        public k a() {
            a.i((Object)this.a, "The uri must be set.");
            return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public b b(int n8) {
            this.i = n8;
            return this;
        }

        public b c(byte[] arrby) {
            this.d = arrby;
            return this;
        }

        public b d(int n8) {
            this.c = n8;
            return this;
        }

        public b e(Map map) {
            this.e = map;
            return this;
        }

        public b f(String string2) {
            this.h = string2;
            return this;
        }

        public b g(long l8) {
            this.g = l8;
            return this;
        }

        public b h(long l8) {
            this.f = l8;
            return this;
        }

        public b i(Uri uri) {
            this.a = uri;
            return this;
        }

        public b j(String string2) {
            this.a = Uri.parse((String)string2);
            return this;
        }
    }

}

