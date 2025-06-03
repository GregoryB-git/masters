/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaDrm
 *  android.media.MediaDrm$KeyRequest
 *  android.media.MediaDrm$OnEventListener
 *  android.media.MediaDrm$ProvisionRequest
 *  android.media.UnsupportedSchemeException
 *  android.media.metrics.LogSessionId
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.charset.Charset
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.UUID
 */
package p0;

import W2.e;
import Z0.o;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import d0.g;
import d0.m;
import g0.z;
import j0.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import k0.g0;
import l0.y1;
import m0.O;
import p0.C;
import p0.F;
import p0.G;
import p0.H;
import p0.I;
import p0.J;
import p0.K;
import p0.L;
import p0.M;
import p0.T;

public final class N
implements F {
    public static final F.c d = new H();
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public N(UUID uUID) {
        MediaDrm mediaDrm;
        g0.a.e((Object)uUID);
        g0.a.b(g.b.equals((Object)uUID) ^ true, "Use C.CLEARKEY_UUID instead");
        this.a = uUID;
        this.b = mediaDrm = new MediaDrm(N.u(uUID));
        this.c = 1;
        if (g.d.equals((Object)uUID) && N.C()) {
            N.w(mediaDrm);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ F B(UUID uUID) {
        try {
            return N.D(uUID);
        }
        catch (T t8) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
        stringBuilder.append((Object)uUID);
        stringBuilder.append(".");
        g0.o.c("FrameworkMediaDrm", stringBuilder.toString());
        return new C();
    }

    public static boolean C() {
        return "ASUS_Z00AD".equals((Object)g0.M.d);
    }

    public static N D(UUID object) {
        UnsupportedSchemeException unsupportedSchemeException2;
        block3 : {
            try {
                object = new N((UUID)object);
                return object;
            }
            catch (Exception exception) {
            }
            catch (UnsupportedSchemeException unsupportedSchemeException2) {
                break block3;
            }
            throw new T(2, exception);
        }
        throw new T(1, (Exception)unsupportedSchemeException2);
    }

    public static /* synthetic */ F n(UUID uUID) {
        return N.B(uUID);
    }

    public static /* synthetic */ void o(N n8, F.b b8, MediaDrm mediaDrm, byte[] arrby, int n9, int n10, byte[] arrby2) {
        n8.A(b8, mediaDrm, arrby, n9, n10, arrby2);
    }

    public static byte[] p(byte[] object) {
        Object object2 = new z((byte[])object);
        int n8 = object2.t();
        short s8 = object2.v();
        short s9 = object2.v();
        if (s8 == 1 && s9 == 1) {
            int n9 = object2.v();
            Charset charset = e.e;
            if ((object2 = object2.E(n9, charset)).contains((CharSequence)"<LA_URL>")) {
                return object;
            }
            n9 = object2.indexOf("</DATA>");
            if (n9 == -1) {
                g0.o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            object = new StringBuilder();
            object.append(object2.substring(0, n9));
            object.append("<LA_URL>https://x</LA_URL>");
            object.append(object2.substring(n9));
            object = object.toString();
            object2 = ByteBuffer.allocate((int)(n8 += 52));
            object2.order(ByteOrder.LITTLE_ENDIAN);
            object2.putInt(n8);
            object2.putShort(s8);
            object2.putShort(s9);
            object2.putShort((short)(object.length() * 2));
            object2.put(object.getBytes(charset));
            return object2.array();
        }
        g0.o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return object;
    }

    public static byte[] r(UUID uUID, byte[] arrby) {
        if (g.c.equals((Object)uUID)) {
            return p0.a.a(arrby);
        }
        return arrby;
    }

    public static byte[] s(UUID arrby, byte[] object) {
        UUID uUID = g.e;
        byte[] arrby2 = object;
        if (uUID.equals((Object)arrby)) {
            arrby2 = o.e((byte[])object, (UUID)arrby);
            if (arrby2 != null) {
                object = arrby2;
            }
            arrby2 = o.a(uUID, N.p((byte[])object));
        }
        if ((g0.M.a < 23 && g.d.equals((Object)arrby) || uUID.equals((Object)arrby) && "Amazon".equals((Object)g0.M.c) && ("AFTB".equals(object = g0.M.d) || "AFTS".equals(object) || "AFTM".equals(object) || "AFTT".equals(object))) && (arrby = o.e(arrby2, (UUID)arrby)) != null) {
            return arrby;
        }
        return arrby2;
    }

    public static String t(UUID uUID, String string2) {
        if (g0.M.a < 26 && g.c.equals((Object)uUID) && ("video/mp4".equals((Object)string2) || "audio/mp4".equals((Object)string2))) {
            return "cenc";
        }
        return string2;
    }

    public static UUID u(UUID uUID) {
        UUID uUID2 = uUID;
        if (g0.M.a < 27) {
            uUID2 = uUID;
            if (g.c.equals((Object)uUID)) {
                uUID2 = g.b;
            }
        }
        return uUID2;
    }

    public static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static m.b y(UUID object, List list) {
        int n8;
        int n9;
        block8 : {
            if (!g.d.equals(object)) {
                return (m.b)list.get(0);
            }
            if (g0.M.a >= 28 && list.size() > 1) {
                byte[] arrby;
                Object object2;
                object = (m.b)list.get(0);
                n9 = n8 = 0;
                while (n8 < list.size()) {
                    object2 = (m.b)list.get(n8);
                    arrby = (byte[])g0.a.e(object2.s);
                    if (g0.M.c(object2.r, object.r) && g0.M.c(object2.q, object.q) && o.c(arrby)) {
                        n9 += arrby.length;
                        ++n8;
                        continue;
                    }
                    break block8;
                }
                object2 = new byte[n9];
                n9 = n8 = 0;
                while (n8 < list.size()) {
                    arrby = (byte[])g0.a.e(((m.b)list.get((int)n8)).s);
                    int n10 = arrby.length;
                    System.arraycopy((Object)arrby, (int)0, (Object)object2, (int)n9, (int)n10);
                    n9 += n10;
                    ++n8;
                }
                return object.b((byte[])object2);
            }
        }
        n8 = 0;
        while (n8 < list.size()) {
            object = (m.b)list.get(n8);
            n9 = o.g((byte[])g0.a.e(object.s));
            int n11 = g0.M.a;
            if (n11 < 23 && n9 == 0) {
                return object;
            }
            if (n11 >= 23 && n9 == 1) {
                return object;
            }
            ++n8;
        }
        return (m.b)list.get(0);
    }

    public final /* synthetic */ void A(F.b b8, MediaDrm mediaDrm, byte[] arrby, int n8, int n9, byte[] arrby2) {
        b8.a(this, arrby, n8, n9, arrby2);
    }

    public final boolean E() {
        if (g0.M.a < 21 && g.d.equals((Object)this.a) && "L3".equals((Object)this.x("securityLevel"))) {
            return true;
        }
        return false;
    }

    @Override
    public void a(F.b object) {
        MediaDrm mediaDrm = this.b;
        object = object == null ? null : new I(this, (F.b)object);
        mediaDrm.setOnEventListener((MediaDrm.OnEventListener)object);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(byte[] mediaCrypto, String string2) {
        block11 : {
            block10 : {
                void var2_6;
                Object var5_9;
                block9 : {
                    Object var4_10;
                    boolean bl;
                    if (g0.M.a >= 31 && this.z()) {
                        bl = a.a(this.b, string2);
                    } else {
                        var5_9 = null;
                        var4_10 = null;
                        mediaCrypto = new MediaCrypto(this.a, (byte[])mediaCrypto);
                        bl = mediaCrypto.requiresSecureDecoderComponent(string2);
                        mediaCrypto.release();
                    }
                    if (!bl) return false;
                    break block11;
                    catch (Throwable throwable) {
                        break block9;
                    }
                    catch (Throwable throwable) {
                        mediaCrypto = var4_10;
                    }
                }
                if (mediaCrypto == null) throw var2_6;
                mediaCrypto.release();
                throw var2_6;
                catch (MediaCryptoException mediaCryptoException) {
                    mediaCrypto = var5_9;
                    break block10;
                }
                catch (MediaCryptoException mediaCryptoException) {}
            }
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        }
        if (this.E()) return false;
        return true;
    }

    @Override
    public void c(byte[] arrby, byte[] arrby2) {
        this.b.restoreKeys(arrby, arrby2);
    }

    @Override
    public Map d(byte[] arrby) {
        return this.b.queryKeyStatus(arrby);
    }

    @Override
    public void e(byte[] arrby) {
        this.b.closeSession(arrby);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(byte[] arrby, y1 y12) {
        if (g0.M.a >= 31) {
            try {
                a.b(this.b, arrby, y12);
                return;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {}
            g0.o.h("FrameworkMediaDrm", "setLogSessionId failed.");
        }
    }

    @Override
    public byte[] g(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = arrby2;
        if (g.c.equals((Object)this.a)) {
            arrby3 = p0.a.b(arrby2);
        }
        return this.b.provideKeyResponse(arrby, arrby3);
    }

    @Override
    public F.d h() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new F.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override
    public void i(byte[] arrby) {
        this.b.provideProvisionResponse(arrby);
    }

    @Override
    public F.a j(byte[] object, List object2, int n8, HashMap object3) {
        MediaDrm.KeyRequest keyRequest;
        byte[] arrby;
        if (object2 != null) {
            object2 = N.y(this.a, (List)object2);
            keyRequest = N.s(this.a, (byte[])g0.a.e(object2.s));
            arrby = N.t(this.a, object2.r);
        } else {
            object2 = null;
            keyRequest = null;
            arrby = keyRequest;
        }
        keyRequest = this.b.getKeyRequest((byte[])object, (byte[])keyRequest, (String)arrby, n8, (HashMap)object3);
        arrby = N.r(this.a, keyRequest.getData());
        object = object3 = this.q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty((CharSequence)object3)) {
            object = object3;
            if (object2 != null) {
                object = object3;
                if (!TextUtils.isEmpty((CharSequence)object2.q)) {
                    object = object2.q;
                }
            }
        }
        n8 = g0.M.a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE;
        return new F.a(arrby, (String)object, n8);
    }

    @Override
    public int k() {
        return 2;
    }

    @Override
    public byte[] m() {
        return this.b.openSession();
    }

    public final String q(String string2) {
        String string3;
        if ("<LA_URL>https://x</LA_URL>".equals((Object)string2)) {
            return "";
        }
        if (g0.M.a >= 33 && "https://default.url".equals((Object)string2) && (Objects.equals((Object)(string3 = this.x("version")), (Object)"1.2") || Objects.equals((Object)string3, (Object)"aidl-1"))) {
            return "";
        }
        return string2;
    }

    @Override
    public void release() {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        int n8;
                        this.c = n8 = this.c - 1;
                        if (n8 != 0) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.b.release();
                }
                return;
            }
            throw throwable2;
        }
    }

    public G v(byte[] arrby) {
        boolean bl = this.E();
        return new G(N.u(this.a), arrby, bl);
    }

    public String x(String string2) {
        return this.b.getPropertyString(string2);
    }

    public final boolean z() {
        if (this.a.equals((Object)g.d)) {
            String string2 = this.x("version");
            if (!(string2.startsWith("v5.") || string2.startsWith("14.") || string2.startsWith("15.") || string2.startsWith("16.0"))) {
                return true;
            }
            return false;
        }
        return this.a.equals((Object)g.c);
    }

    public static abstract class a {
        public static boolean a(MediaDrm mediaDrm, String string2) {
            return M.a(mediaDrm, string2);
        }

        public static void b(MediaDrm mediaDrm, byte[] arrby, y1 y12) {
            if (!O.a((LogSessionId)(y12 = y12.a()), (Object)g0.a())) {
                L.a(K.a(g0.a.e((Object)J.a(mediaDrm, arrby))), (LogSessionId)y12);
            }
        }
    }

}

