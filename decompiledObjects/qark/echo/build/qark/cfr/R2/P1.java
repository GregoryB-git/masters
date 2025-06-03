/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.util.Iterator
 */
package R2;

import R2.K;
import R2.M1;
import R2.N1;
import R2.O1;
import R2.f;
import java.util.Iterator;

public final class P1 {
    public static final Object h = new Object();
    public final String a;
    public final N1 b;
    public final Object c;
    public final Object d;
    public final Object e = new Object();
    public volatile Object f = null;
    public volatile Object g = null;

    public P1(String string2, Object object, Object object2, N1 n12) {
        this.a = string2;
        this.c = object;
        this.d = object2;
        this.b = n12;
    }

    public /* synthetic */ P1(String string2, Object object, Object object2, N1 n12, O1 o12) {
        this(string2, object, object2, n12);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object a(Object var1_1) {
        var3_7 = this.e;
        // MONITORENTER : var3_7
        // MONITOREXIT : var3_7
        if (var1_1 != null) {
            return var1_1;
        }
        if (M1.a == null) {
            return this.c;
        }
        var3_7 = P1.h;
        // MONITORENTER : var3_7
        if (f.a()) {
            if (this.g == null) {
                return this.c;
            }
            var1_1 = this.g;
            // MONITOREXIT : var3_7
            return var1_1;
        }
        // MONITOREXIT : var3_7
        try {
            var4_8 = K.z0().iterator();
        }
        catch (SecurityException var1_3) {
            ** GOTO lbl-1000
        }
        do {
            if (var4_8.hasNext()) {
                var5_10 = (P1)var4_8.next();
                var2_9 = f.a();
                if (var2_9 != false) throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                var3_7 = null;
                var6_11 = var5_10.b;
                var1_1 = var3_7;
                if (var6_11 != null) {
                    var1_1 = var6_11.a();
                }
            } else lbl-1000: // 2 sources:
            {
                if ((var1_1 = this.b) == null) {
                    return this.c;
                }
                return var1_1.a();
                catch (IllegalStateException var1_4) {
                    var1_1 = var3_7;
                }
            }
            var3_7 = P1.h;
            // MONITORENTER : var3_7
            var5_10.g = var1_1;
            // MONITOREXIT : var3_7
        } while (true);
        catch (SecurityException var1_5) {
            return this.c;
        }
        catch (IllegalStateException var1_6) {
            return this.c;
        }
    }

    public final String b() {
        return this.a;
    }
}

