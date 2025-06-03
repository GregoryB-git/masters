/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Pair
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 */
package R2;

import E2.e;
import R2.B5;
import R2.C;
import R2.C5;
import R2.D5;
import R2.G2;
import R2.K;
import R2.N5;
import R2.P1;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.f;
import R2.f5;
import R2.g;
import R2.l2;
import R2.m3;
import R2.o3;
import R2.p;
import R2.q2;
import R2.q3;
import R2.x2;
import R2.z5;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s2.a;

public final class g5
extends C5 {
    public final Map d = new HashMap();
    public final q2 e;
    public final q2 f;
    public final q2 g;
    public final q2 h;
    public final q2 i;

    public g5(D5 o32) {
        super((D5)o32);
        o32 = this.i();
        o32.getClass();
        this.e = new q2((l2)o32, "last_delete_stale", 0L);
        o32 = this.i();
        o32.getClass();
        this.f = new q2((l2)o32, "backoff", 0L);
        o32 = this.i();
        o32.getClass();
        this.g = new q2((l2)o32, "last_upload", 0L);
        o32 = this.i();
        o32.getClass();
        this.h = new q2((l2)o32, "last_upload_attempt", 0L);
        o32 = this.i();
        o32.getClass();
        this.i = new q2((l2)o32, "midnight_offset", 0L);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final Pair y(String string2) {
        long l9;
        long l8;
        Object object;
        Object object2;
        block9 : {
            Exception exception222;
            long l10;
            block8 : {
                block7 : {
                    block6 : {
                        this.n();
                        l9 = this.b().b();
                        object2 = (f5)this.d.get((Object)string2);
                        if (object2 != null && l9 < object2.c) {
                            return new Pair((Object)object2.a, (Object)object2.b);
                        }
                        a.b(true);
                        l10 = this.f().C(string2) + l9;
                        try {
                            l8 = this.f().x(string2, K.d);
                            if (l8 <= 0L) break block6;
                            object = a.a(this.a());
                            break block7;
                        }
                        catch (Exception exception222) {
                            break block8;
                        }
                    }
                    object = a.a(this.a());
                }
                if (object == null) {
                    return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
                }
                object2 = object.a();
                object = object2 != null ? new f5((String)object2, object.b(), l10) : new f5("", object.b(), l10);
                break block9;
            }
            this.j().F().b("Unable to get advertising id", (Object)exception222);
            object = new f5("", false, l10);
        }
        this.d.put((Object)string2, object);
        a.b(false);
        return new Pair((Object)object.a, (Object)object.b);
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        if (object2 == null) return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
        if (l9 >= object2.c + l8) return new Pair((Object)"00000000-0000-0000-0000-000000000000", (Object)Boolean.FALSE);
        return new Pair((Object)object2.a, (Object)object2.b);
    }

    public final String A(String string2, boolean bl) {
        this.n();
        string2 = bl ? (String)this.y((String)string2).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest = S5.T0();
        if (messageDigest == null) {
            return null;
        }
        return String.format((Locale)Locale.US, (String)"%032X", (Object[])new Object[]{new BigInteger(1, messageDigest.digest(string2.getBytes()))});
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final Pair z(String string2, q3 q32) {
        if (q32.x()) {
            return this.y(string2);
        }
        return new Pair((Object)"", (Object)Boolean.FALSE);
    }
}

