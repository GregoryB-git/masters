// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import X2.w;
import java.util.Collections;
import java.util.UUID;
import java.util.List;
import i0.t;
import android.net.Uri;
import java.io.Closeable;
import g0.M;
import java.io.InputStream;
import i0.i;
import i0.k;
import i0.x;
import java.util.HashMap;
import g0.a;
import android.text.TextUtils;
import java.util.Map;
import i0.g;

public final class O implements Q
{
    public final g.a a;
    public final String b;
    public final boolean c;
    public final Map d;
    
    public O(final String b, final boolean c, final g.a a) {
        g0.a.a(!c || !TextUtils.isEmpty((CharSequence)b));
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new HashMap();
    }
    
    public static byte[] c(final g.a a, String a2, byte[] array, final Map map) {
        final x x = new x(a.a());
        a2 = (String)new k.b().j(a2).e(map).d(2).c(array).b(1).a();
        int n = 0;
        Object a3 = a2;
        while (true) {
            try {
                final Object o;
                array = (byte[])(o = new i(x, (k)a3));
                final byte[] array2 = Y2.a.b((InputStream)o);
                final byte[] array3 = array;
                M.m((Closeable)(Object)array3);
                return array2;
            }
            catch (Exception ex) {
                throw new S((k)a2, (Uri)a.e(x.r()), x.g(), x.q(), (Throwable)a);
            }
            try {
                try {
                    final Object o = array;
                    final byte[] array2 = Y2.a.b((InputStream)o);
                    final byte[] array3 = array;
                    M.m((Closeable)(Object)array3);
                    return array2;
                }
                finally {}
            }
            catch (t t) {
                final String d = d(t, n);
                if (d != null) {
                    ++n;
                    a3 = ((k)a).a().j(d).a();
                    M.m((Closeable)(Object)array);
                    continue;
                }
                throw t;
            }
            break;
        }
        M.m((Closeable)(Object)array);
        throw a;
    }
    
    public static String d(final t t, final int n) {
        final int r = t.r;
        if ((r == 307 || r == 308) && n < 5) {
            final Map t2 = t.t;
            if (t2 != null) {
                final List<String> list = t2.get("Location");
                if (list != null && !list.isEmpty()) {
                    return list.get(0);
                }
            }
        }
        return null;
    }
    
    @Override
    public byte[] a(final UUID uuid, final F.d d) {
        final StringBuilder sb = new StringBuilder();
        sb.append(d.b());
        sb.append("&signedRequest=");
        sb.append(M.H(d.a()));
        return c(this.a, sb.toString(), null, Collections.emptyMap());
    }
    
    @Override
    public byte[] b(final UUID obj, final F.a a) {
        final String b = a.b();
        String b2 = null;
        Label_0028: {
            if (!this.c) {
                b2 = b;
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    break Label_0028;
                }
            }
            b2 = this.b;
        }
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final UUID e = d0.g.e;
            String s;
            if (e.equals(obj)) {
                s = "text/xml";
            }
            else if (d0.g.c.equals(obj)) {
                s = "application/json";
            }
            else {
                s = "application/octet-stream";
            }
            hashMap.put("Content-Type", s);
            if (e.equals(obj)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                hashMap.putAll((Map<?, ?>)this.d);
                // monitorexit(this.d)
                return c(this.a, b2, a.a(), hashMap);
            }
        }
        final k.b b3 = new k.b();
        final Uri empty = Uri.EMPTY;
        throw new S(b3.i(empty).a(), empty, w.j(), 0L, new IllegalStateException("No license URL"));
    }
    
    public void e(final String s, final String s2) {
        g0.a.e(s);
        g0.a.e(s2);
        synchronized (this.d) {
            this.d.put(s, s2);
        }
    }
}
