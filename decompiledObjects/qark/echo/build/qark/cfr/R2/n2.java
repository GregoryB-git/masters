/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package R2;

import A2.n;
import R2.K;
import R2.P1;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.g7;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n2 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ l2 d;

    public n2(l2 l22, String string2, Bundle bundle) {
        this.d = l22;
        n.e(string2);
        this.a = string2;
        this.b = new Bundle();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Bundle a() {
        if (this.c != null) return this.c;
        var6_1 = this.d.F().getString(this.a, null);
        if (var6_1 == null) ** GOTO lbl93
        var5_2 = new Bundle();
        var6_1 = new JSONArray(var6_1);
        var2_4 = 0;
        do {
            block27 : {
                block26 : {
                    block25 : {
                        block21 : {
                            block22 : {
                                block23 : {
                                    block24 : {
                                        var1_5 = var6_1.length();
                                        if (var2_4 >= var1_5) ** GOTO lbl89
                                        var8_10 = var6_1.getJSONObject(var2_4);
                                        var7_8 = var8_10.getString("n");
                                        var9_11 = var8_10.getString("t");
                                        var1_5 = var9_11.hashCode();
                                        if (var1_5 == 100) break block21;
                                        if (var1_5 == 108) break block22;
                                        if (var1_5 == 115) break block23;
                                        if (var1_5 == 3352) break block24;
                                        if (var1_5 != 3445) break block25;
                                        if (!var9_11.equals((Object)"la")) break block25;
                                        var1_5 = 4;
                                        break block26;
                                    }
                                    if (!var9_11.equals((Object)"ia")) break block25;
                                    var1_5 = 3;
                                    break block26;
                                }
                                if (!var9_11.equals((Object)"s")) break block25;
                                var1_5 = 0;
                                break block26;
                            }
                            if (!var9_11.equals((Object)"l")) break block25;
                            var1_5 = 2;
                            break block26;
                        }
                        var4_7 = var9_11.equals((Object)"d");
                        if (!var4_7) break block25;
                        var1_5 = 1;
                        break block26;
                    }
                    var1_5 = -1;
                }
                if (var1_5 == 0) ** GOTO lbl84
                if (var1_5 == 1) ** GOTO lbl82
                if (var1_5 == 2) ** GOTO lbl80
                if (var1_5 == 3) ** GOTO lbl69
                if (var1_5 == 4) ** GOTO lbl58
                this.d.j().G().b("Unrecognized persisted bundle type. Type", var9_11);
                break block27;
lbl58: // 1 sources:
                if (!g7.a() || !this.d.f().s(K.M0)) break block27;
                var8_10 = new JSONArray(var8_10.getString("v"));
                var3_6 = var8_10.length();
                var9_11 = new long[var3_6];
                for (var1_5 = 0; var1_5 < var3_6; ++var1_5) {
                    var9_11[var1_5] = (int)var8_10.optLong(var1_5);
                }
                var5_2.putLongArray(var7_8, (long[])var9_11);
                break block27;
lbl69: // 1 sources:
                if (!g7.a() || !this.d.f().s(K.M0)) break block27;
                var8_10 = new JSONArray(var8_10.getString("v"));
                var3_6 = var8_10.length();
                var9_11 = new int[var3_6];
                for (var1_5 = 0; var1_5 < var3_6; ++var1_5) {
                    var9_11[var1_5] = var8_10.optInt(var1_5);
                }
                var5_2.putIntArray(var7_8, var9_11);
                break block27;
lbl80: // 1 sources:
                var5_2.putLong(var7_8, Long.parseLong((String)var8_10.getString("v")));
                break block27;
lbl82: // 1 sources:
                var5_2.putDouble(var7_8, Double.parseDouble((String)var8_10.getString("v")));
                break block27;
lbl84: // 1 sources:
                var5_2.putString(var7_8, var8_10.getString("v"));
                break block27;
lbl86: // 1 sources:
                try {
                    this.d.j().G().a("Error reading value from SharedPreferences. Value dropped");
                    break block27;
lbl89: // 1 sources:
                    this.c = var5_2;
                    ** GOTO lbl93
                }
                catch (JSONException var5_3) {
                    ** continue;
                }
lbl91: // 1 sources:
                do {
                    this.d.j().G().a("Error loading bundle from SharedPreferences. Values will be lost");
lbl93: // 3 sources:
                    if (this.c != null) return this.c;
                    this.c = this.b;
                    return this.c;
                    break;
                } while (true);
                catch (NumberFormatException | JSONException var7_9) {}
                ** GOTO lbl86
            }
            ++var2_4;
        } while (true);
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle = this.d.F().edit();
        if (bundle2.size() == 0) {
            bundle.remove(this.a);
        } else {
            bundle.putString(this.a, this.c(bundle2));
        }
        bundle.apply();
        this.c = bundle2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) {
            Object object = (String)iterator.next();
            Object object2 = bundle.get((String)object);
            if (object2 == null) continue;
            try {
                JSONObject jSONObject;
                block18 : {
                    block21 : {
                        block15 : {
                            block17 : {
                                block20 : {
                                    block11 : {
                                        block19 : {
                                            block9 : {
                                                block7 : {
                                                    block16 : {
                                                        block14 : {
                                                            block13 : {
                                                                block12 : {
                                                                    block10 : {
                                                                        block8 : {
                                                                            jSONObject = new JSONObject();
                                                                            jSONObject.put("n", object);
                                                                            boolean bl = g7.a();
                                                                            if (!bl || !this.d.f().s(K.M0)) break block7;
                                                                            if (!(object2 instanceof String)) break block8;
                                                                            jSONObject.put("v", (Object)String.valueOf((Object)object2));
                                                                            break block9;
                                                                        }
                                                                        if (!(object2 instanceof Long)) break block10;
                                                                        jSONObject.put("v", (Object)String.valueOf((Object)object2));
                                                                        break block11;
                                                                    }
                                                                    if (!(object2 instanceof int[])) break block12;
                                                                    jSONObject.put("v", (Object)Arrays.toString((int[])((int[])object2)));
                                                                    object = "ia";
                                                                    break block13;
                                                                }
                                                                if (!(object2 instanceof long[])) break block14;
                                                                jSONObject.put("v", (Object)Arrays.toString((long[])((long[])object2)));
                                                                object = "la";
                                                            }
                                                            jSONObject.put("t", object);
                                                            break block15;
                                                        }
                                                        if (!(object2 instanceof Double)) break block16;
                                                        jSONObject.put("v", (Object)String.valueOf((Object)object2));
                                                        break block17;
                                                    }
                                                    object = this.d.j().G();
                                                    jSONObject = object2.getClass();
                                                    break block18;
                                                }
                                                jSONObject.put("v", (Object)String.valueOf((Object)object2));
                                                if (!(object2 instanceof String)) break block19;
                                            }
                                            jSONObject.put("t", (Object)"s");
                                            break block15;
                                        }
                                        if (!(object2 instanceof Long)) break block20;
                                    }
                                    jSONObject.put("t", (Object)"l");
                                    break block15;
                                }
                                if (!(object2 instanceof Double)) break block21;
                            }
                            jSONObject.put("t", (Object)"d");
                        }
                        jSONArray.put((Object)jSONObject);
                        continue;
                    }
                    object = this.d.j().G();
                    jSONObject = object2.getClass();
                }
                object.b("Cannot serialize bundle value to SharedPreferences. Type", (Object)jSONObject);
                continue;
            }
            catch (JSONException jSONException) {}
            this.d.j().G().b("Cannot serialize bundle value to SharedPreferences", (Object)jSONException);
        }
        return jSONArray.toString();
    }
}

