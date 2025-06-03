// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import android.media.metrics.LogSessionId;
import m0.O;
import k0.g0;
import java.util.Objects;
import j0.b;
import android.media.MediaDrm$KeyRequest;
import android.text.TextUtils;
import java.util.HashMap;
import android.media.MediaDrm$ProvisionRequest;
import l0.y1;
import java.util.Map;
import android.media.MediaCryptoException;
import android.media.MediaCrypto;
import android.media.MediaDrm$OnEventListener;
import d0.m;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import W2.e;
import g0.z;
import android.media.UnsupportedSchemeException;
import g0.M;
import g0.o;
import d0.g;
import g0.a;
import android.media.MediaDrm;
import java.util.UUID;

public final class N implements F
{
    public static final c d;
    public final UUID a;
    public final MediaDrm b;
    public int c;
    
    static {
        d = new H();
    }
    
    public N(final UUID obj) {
        g0.a.e(obj);
        g0.a.b(g.b.equals(obj) ^ true, "Use C.CLEARKEY_UUID instead");
        this.a = obj;
        final MediaDrm b = new MediaDrm(u(obj));
        this.b = b;
        this.c = 1;
        if (g.d.equals(obj) && C()) {
            w(b);
        }
    }
    
    public static boolean C() {
        return "ASUS_Z00AD".equals(M.d);
    }
    
    public static N D(final UUID uuid) {
        try {
            return new N(uuid);
        }
        catch (Exception ex2) {}
        catch (UnsupportedSchemeException ex) {
            throw new T(1, (Exception)ex);
        }
        final Exception ex2;
        throw new T(2, ex2);
    }
    
    public static byte[] p(final byte[] array) {
        final z z = new z(array);
        final int t = z.t();
        final short v = z.v();
        final short v2 = z.v();
        if (v != 1 || v2 != 1) {
            o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return array;
        }
        final short v3 = z.v();
        final Charset e = W2.e.e;
        final String e2 = z.E(v3, e);
        if (e2.contains("<LA_URL>")) {
            return array;
        }
        final int index = e2.indexOf("</DATA>");
        if (index == -1) {
            o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(e2.substring(0, index));
        sb.append("<LA_URL>https://x</LA_URL>");
        sb.append(e2.substring(index));
        final String string = sb.toString();
        final int capacity = t + 52;
        final ByteBuffer allocate = ByteBuffer.allocate(capacity);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(capacity);
        allocate.putShort(v);
        allocate.putShort(v2);
        allocate.putShort((short)(string.length() * 2));
        allocate.put(string.getBytes(e));
        return allocate.array();
    }
    
    public static byte[] r(final UUID obj, final byte[] array) {
        if (g.c.equals(obj)) {
            return p0.a.a(array);
        }
        return array;
    }
    
    public static byte[] s(final UUID obj, byte[] array) {
        final UUID e = g.e;
        byte[] a = array;
        if (e.equals(obj)) {
            final byte[] e2 = Z0.o.e(array, obj);
            if (e2 != null) {
                array = e2;
            }
            a = Z0.o.a(e, p(array));
        }
        if (M.a >= 23 || !g.d.equals(obj)) {
            if (!e.equals(obj) || !"Amazon".equals(M.c)) {
                return a;
            }
            final String d = M.d;
            if (!"AFTB".equals(d) && !"AFTS".equals(d) && !"AFTM".equals(d) && !"AFTT".equals(d)) {
                return a;
            }
        }
        final byte[] e3 = Z0.o.e(a, obj);
        if (e3 != null) {
            return e3;
        }
        return a;
    }
    
    public static String t(final UUID obj, final String s) {
        if (M.a < 26 && g.c.equals(obj) && ("video/mp4".equals(s) || "audio/mp4".equals(s))) {
            return "cenc";
        }
        return s;
    }
    
    public static UUID u(final UUID obj) {
        UUID b = obj;
        if (M.a < 27) {
            b = obj;
            if (g.c.equals(obj)) {
                b = g.b;
            }
        }
        return b;
    }
    
    public static void w(final MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }
    
    public static m.b y(final UUID obj, final List list) {
        if (g.d.equals(obj)) {
            Label_0215: {
                if (M.a >= 28 && list.size() > 1) {
                    final m.b b = list.get(0);
                    int n;
                    for (int i = n = 0; i < list.size(); ++i) {
                        final m.b b2 = list.get(i);
                        final byte[] array = (byte[])g0.a.e(b2.s);
                        if (!M.c(b2.r, b.r) || !M.c(b2.q, b.q) || !Z0.o.c(array)) {
                            break Label_0215;
                        }
                        n += array.length;
                    }
                    final byte[] array2 = new byte[n];
                    int n2;
                    for (int j = n2 = 0; j < list.size(); ++j) {
                        final byte[] array3 = (byte[])g0.a.e(list.get(j).s);
                        final int length = array3.length;
                        System.arraycopy(array3, 0, array2, n2, length);
                        n2 += length;
                    }
                    return b.b(array2);
                }
            }
            for (int k = 0; k < list.size(); ++k) {
                final m.b b3 = list.get(k);
                final int g = Z0.o.g((byte[])g0.a.e(b3.s));
                final int a = M.a;
                if (a < 23 && g == 0) {
                    return b3;
                }
                if (a >= 23 && g == 1) {
                    return b3;
                }
            }
        }
        return list.get(0);
    }
    
    public final boolean E() {
        return M.a < 21 && g.d.equals(this.a) && "L3".equals(this.x("securityLevel"));
    }
    
    @Override
    public void a(final b b) {
        final MediaDrm b2 = this.b;
        Object onEventListener;
        if (b == null) {
            onEventListener = null;
        }
        else {
            onEventListener = new I(this, b);
        }
        b2.setOnEventListener((MediaDrm$OnEventListener)onEventListener);
    }
    
    @Override
    public boolean b(final byte[] array, final String s) {
        Label_0056: {
            if (M.a >= 31 && this.z()) {
                final boolean b = N.a.a(this.b, s);
                break Label_0056;
            }
            try {
                final MediaCrypto mediaCrypto = new MediaCrypto(this.a, array);
                try {
                    final boolean b = mediaCrypto.requiresSecureDecoderComponent(s);
                    mediaCrypto.release();
                    if (b) {
                        goto Label_0092;
                    }
                    goto Label_0101;
                }
                catch (MediaCryptoException ex) {}
            }
            catch (MediaCryptoException ex2) {}
        }
        goto Label_0067;
    }
    
    @Override
    public void c(final byte[] array, final byte[] array2) {
        this.b.restoreKeys(array, array2);
    }
    
    @Override
    public Map d(final byte[] array) {
        return this.b.queryKeyStatus(array);
    }
    
    @Override
    public void e(final byte[] array) {
        this.b.closeSession(array);
    }
    
    @Override
    public void f(final byte[] array, final y1 y1) {
        if (M.a < 31) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    N.a.b(this.b, array, y1);
                    return;
                    o.h("FrameworkMediaDrm", "setLogSessionId failed.");
                    return;
                }
                catch (UnsupportedOperationException ex) {}
                continue;
            }
        }
    }
    
    @Override
    public byte[] g(final byte[] array, final byte[] array2) {
        byte[] b = array2;
        if (g.c.equals(this.a)) {
            b = p0.a.b(array2);
        }
        return this.b.provideKeyResponse(array, b);
    }
    
    @Override
    public d h() {
        final MediaDrm$ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }
    
    @Override
    public void i(final byte[] array) {
        this.b.provideProvisionResponse(array);
    }
    
    @Override
    public F.a j(final byte[] array, final List list, int requestType, final HashMap hashMap) {
        m.b y;
        Object s;
        String t;
        if (list != null) {
            y = y(this.a, list);
            s = s(this.a, (byte[])g0.a.e(y.s));
            t = t(this.a, y.r);
        }
        else {
            y = null;
            s = (t = null);
        }
        final MediaDrm$KeyRequest keyRequest = this.b.getKeyRequest(array, (byte[])s, t, requestType, hashMap);
        final byte[] r = r(this.a, keyRequest.getData());
        String s3;
        final String s2 = s3 = this.q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty((CharSequence)s2)) {
            s3 = s2;
            if (y != null) {
                s3 = s2;
                if (!TextUtils.isEmpty((CharSequence)y.q)) {
                    s3 = y.q;
                }
            }
        }
        if (M.a >= 23) {
            requestType = keyRequest.getRequestType();
        }
        else {
            requestType = Integer.MIN_VALUE;
        }
        return new F.a(r, s3, requestType);
    }
    
    @Override
    public int k() {
        return 2;
    }
    
    @Override
    public byte[] m() {
        return this.b.openSession();
    }
    
    public final String q(final String s) {
        if ("<LA_URL>https://x</LA_URL>".equals(s)) {
            return "";
        }
        if (M.a >= 33 && "https://default.url".equals(s)) {
            final String x = this.x("version");
            if (Objects.equals(x, "1.2") || Objects.equals(x, "aidl-1")) {
                return "";
            }
        }
        return s;
    }
    
    @Override
    public void release() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0035: {
            try {
                final int c = this.c - 1;
                this.c = c;
                if (c == 0) {
                    this.b.release();
                }
            }
            finally {
                break Label_0035;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public G v(final byte[] array) {
        return new G(u(this.a), array, this.E());
    }
    
    public String x(final String s) {
        return this.b.getPropertyString(s);
    }
    
    public final boolean z() {
        if (this.a.equals(g.d)) {
            final String x = this.x("version");
            return !x.startsWith("v5.") && !x.startsWith("14.") && !x.startsWith("15.") && !x.startsWith("16.0");
        }
        return this.a.equals(g.c);
    }
    
    public abstract static class a
    {
        public static boolean a(final MediaDrm mediaDrm, final String s) {
            return p0.M.a(mediaDrm, s);
        }
        
        public static void b(final MediaDrm mediaDrm, final byte[] array, final y1 y1) {
            final LogSessionId a = y1.a();
            if (!O.a(a, (Object)g0.a())) {
                L.a(K.a(g0.a.e(J.a(mediaDrm, array))), a);
            }
        }
    }
}
