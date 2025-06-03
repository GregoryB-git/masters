/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONObject
 */
package F1;

import H1.f;
import O1.q;
import W5.m;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.B;

public final class a {
    public static final a a = new a();
    public static boolean b;
    public static boolean c;

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            b = true;
            q q8 = q.a;
            c = q.d("FBSDKFeatureIntegritySample", B.m(), false);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void c(Map var0) {
        block8 : {
            block9 : {
                if (T1.a.d(a.class)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)var0, "parameters");
                    if (a.b == false) return;
                    var1_3 = var0.isEmpty();
                    if (var1_3) {
                        return;
                    }
                    try {
                        var2_4 = m.G((Iterable)var0.keySet());
                        var3_5 = new JSONObject();
                        var4_6 = var2_4.iterator();
lbl13: // 3 sources:
                        if (!var4_6.hasNext()) {
                            if (var3_5.length() == 0) return;
                            var2_4 = var3_5.toString();
                            Intrinsics.checkNotNullExpressionValue(var2_4, "restrictiveParamJson.toString()");
                            var0.put((Object)"_onDeviceParams", var2_4);
                            return;
                        }
                        var5_7 = (String)var4_6.next();
                        var2_4 = var0.get((Object)var5_7);
                        if (var2_4 == null) throw new IllegalStateException("Required value was null.".toString());
                        var2_4 = (String)var2_4;
                        var6_8 = a.a;
                        if (!var6_8.d(var5_7) && !var6_8.d((String)var2_4)) ** GOTO lbl13
                        var0.remove((Object)var5_7);
                        if (a.c) break block8;
                        break block9;
                    }
                    catch (Exception var0_2) {
                        return;
                    }
                }
                catch (Throwable var0_1) {}
                T1.a.b(var0_1, a.class);
                return;
            }
            var2_4 = "";
        }
        var3_5.put(var5_7, var2_4);
        ** GOTO lbl13
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(String arrstring) {
        Throwable throwable2;
        block5 : {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                float[] arrf = new float[30];
                for (int i8 = 0; i8 < 30; ++i8) {
                    arrf[i8] = 0.0f;
                }
                f f8 = f.a;
                String[] arrstring2 = new String[]{arrstring};
                arrstring = f.q(f.a.o, new float[][]{arrf}, arrstring2);
                if (arrstring != null) break block5;
                return "none";
            }
            catch (Throwable throwable2) {}
        }
        if ((arrstring = arrstring[0]) == null) {
            return "none";
        }
        return arrstring;
        T1.a.b(throwable2, this);
        return null;
    }

    public final boolean d(String string2) {
        boolean bl;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            bl = Intrinsics.a("none", this.b(string2));
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
        return bl ^ true;
    }
}

