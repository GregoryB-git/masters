/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.ConcurrentHashMap
 */
package A;

import A.o;
import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import z.e;

public abstract class n {
    public ConcurrentHashMap a = new ConcurrentHashMap();

    public static Object e(Object[] arrobject, int n8, b b8) {
        int n9 = (n8 & 1) == 0 ? 400 : 700;
        boolean bl = (n8 & 2) != 0;
        return n.f(arrobject, n9, bl, b8);
    }

    public static Object f(Object[] arrobject, int n8, boolean bl, b b8) {
        int n9 = arrobject.length;
        Object object = null;
        int n10 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11;
            block4 : {
                Object object2;
                int n12;
                block3 : {
                    object2 = arrobject[i8];
                    n12 = Math.abs((int)(b8.a(object2) - n8));
                    n11 = b8.b(object2) == bl ? 0 : 1;
                    n12 = n12 * 2 + n11;
                    if (object == null) break block3;
                    n11 = n10;
                    if (n10 <= n12) break block4;
                }
                object = object2;
                n11 = n12;
            }
            n10 = n11;
        }
        return object;
    }

    public abstract Typeface a(Context var1, e.c var2, Resources var3, int var4);

    public abstract Typeface b(Context var1, CancellationSignal var2, g.b[] var3, int var4);

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public Typeface c(Context var1_1, InputStream var2_2) {
        block6 : {
            if ((var1_1 = o.e(var1_1)) == null) {
                return null;
            }
            var3_5 = o.d((File)var1_1, var2_2);
            if (var3_5) break block6;
            var1_1.delete();
            return null;
        }
        try {
            var2_2 = Typeface.createFromFile((String)var1_1.getPath());
        }
        catch (Throwable var2_3) {
            var1_1.delete();
            throw var2_3;
        }
        var1_1.delete();
        return var2_2;
lbl16: // 1 sources:
        do {
            var1_1.delete();
            return null;
            break;
        } while (true);
        catch (RuntimeException var2_4) {
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public Typeface d(Context var1_1, Resources var2_2, int var3_5, String var4_6, int var5_7) {
        block6 : {
            if ((var1_1 = o.e(var1_1)) == null) {
                return null;
            }
            var6_8 = o.c((File)var1_1, var2_2, var3_5);
            if (var6_8) break block6;
            var1_1.delete();
            return null;
        }
        try {
            var2_2 = Typeface.createFromFile((String)var1_1.getPath());
        }
        catch (Throwable var2_3) {
            var1_1.delete();
            throw var2_3;
        }
        var1_1.delete();
        return var2_2;
lbl16: // 1 sources:
        do {
            var1_1.delete();
            return null;
            break;
        } while (true);
        catch (RuntimeException var2_4) {
            ** continue;
        }
    }

    public g.b g(g.b[] arrb, int n8) {
        return (g.b)n.e(arrb, n8, new b(){

            public int c(g.b b8) {
                return b8.e();
            }

            public boolean d(g.b b8) {
                return b8.f();
            }
        });
    }

    public static interface b {
        public int a(Object var1);

        public boolean b(Object var1);
    }

}

