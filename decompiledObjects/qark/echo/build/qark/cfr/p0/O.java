/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 */
package p0;

import X2.w;
import android.net.Uri;
import android.text.TextUtils;
import d0.g;
import g0.M;
import g0.a;
import i0.g;
import i0.i;
import i0.k;
import i0.t;
import i0.x;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p0.F;
import p0.Q;
import p0.S;

public final class O
implements Q {
    public final g.a a;
    public final String b;
    public final boolean c;
    public final Map d;

    public O(String string2, boolean bl, g.a a8) {
        boolean bl2 = !bl || !TextUtils.isEmpty((CharSequence)string2);
        a.a(bl2);
        this.a = a8;
        this.b = string2;
        this.c = bl;
        this.d = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] c(g.a object, String object2, byte[] object3, Map arrby) {
        Throwable throwable2;
        x x8 = new x(object.a());
        object2 = new k.b().j((String)object2).e((Map)arrby).d(2).c((byte[])object3).b(1).a();
        int n8 = 0;
        object = object2;
        do {
            object3 = new i(x8, (k)object);
            {
                catch (Exception exception) {
                    throw new S((k)object2, (Uri)a.e((Object)x8.r()), x8.g(), x8.q(), (Throwable)exception);
                }
            }
            arrby = Y2.a.b((InputStream)object3);
            M.m((Closeable)object3);
            return arrby;
            {
                String string2;
                catch (Throwable throwable2) {
                    break;
                }
                catch (t t8) {}
                {
                    string2 = O.d(t8, n8);
                    if (string2 == null) throw t8;
                }
                ++n8;
                {
                    object = object.a().j(string2).a();
                }
                {
                    M.m((Closeable)object3);
                    continue;
                }
            }
            break;
        } while (true);
        {
            M.m((Closeable)object3);
            throw throwable2;
        }
    }

    public static String d(t t8, int n8) {
        int n9 = t8.r;
        if (!(n9 != 307 && n9 != 308 || n8 >= 5 || (t8 = t8.t) == null || (t8 = (List)t8.get((Object)"Location")) == null || t8.isEmpty())) {
            return (String)t8.get(0);
        }
        return null;
    }

    @Override
    public byte[] a(UUID object, F.d d8) {
        object = new StringBuilder();
        object.append(d8.b());
        object.append("&signedRequest=");
        object.append(M.H(d8.a()));
        object = object.toString();
        return O.c(this.a, (String)object, null, Collections.emptyMap());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] b(UUID object, F.a a8) {
        String string2;
        String string3;
        block9 : {
            block8 : {
                string2 = a8.b();
                if (this.c) break block8;
                string3 = string2;
                if (!TextUtils.isEmpty((CharSequence)string2)) break block9;
            }
            string3 = this.b;
        }
        if (TextUtils.isEmpty((CharSequence)string3)) {
            object = new k.b();
            a8 = Uri.EMPTY;
            throw new S(object.i((Uri)a8).a(), (Uri)a8, w.j(), 0L, (Throwable)new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uUID = g.e;
        string2 = uUID.equals(object) ? "text/xml" : (g.c.equals(object) ? "application/json" : "application/octet-stream");
        hashMap.put((Object)"Content-Type", (Object)string2);
        if (uUID.equals(object)) {
            hashMap.put((Object)"SOAPAction", (Object)"http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        object = this.d;
        synchronized (object) {
            hashMap.putAll(this.d);
            return O.c(this.a, string3, a8.a(), (Map)hashMap);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(String string2, String string3) {
        a.e(string2);
        a.e(string3);
        Map map = this.d;
        synchronized (map) {
            this.d.put((Object)string2, (Object)string3);
            return;
        }
    }
}

