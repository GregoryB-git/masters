/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package R2;

import A2.n;
import R2.C5;
import R2.D5;
import R2.E;
import R2.K;
import R2.N5;
import R2.P1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b;
import R2.c;
import R2.d;
import R2.d6;
import R2.f6;
import R2.g;
import R2.g6;
import R2.h6;
import R2.p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.x1;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.a;

public final class b6
extends C5 {
    public String d;
    public Set e;
    public Map f;
    public Long g;
    public Long h;

    public b6(D5 d52) {
        super(d52);
    }

    public final boolean A(int n8, int n9) {
        d6 d62 = (d6)this.f.get((Object)n8);
        if (d62 == null) {
            return false;
        }
        return d6.b(d62).get(n9);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final d6 y(Integer n8) {
        if (this.f.containsKey((Object)n8)) {
            return (d6)this.f.get((Object)n8);
        }
        d6 d62 = new d6(this, this.d, null);
        this.f.put((Object)n8, (Object)d62);
        return d62;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List z(String var1_1, List var2_4, List var3_5, Long var4_6, Long var5_7) {
        block47 : {
            block51 : {
                block49 : {
                    block50 : {
                        block48 : {
                            block45 : {
                                n.e((String)var1_1);
                                n.i(var2_4);
                                n.i((Object)var3_5);
                                this.d = var1_1;
                                this.e = new HashSet();
                                this.f = new a();
                                this.g = var4_6;
                                this.h = var5_7;
                                var1_1 = var2_4.iterator();
                                while (var1_1.hasNext()) {
                                    if (!"_s".equals((Object)((com.google.android.gms.internal.measurement.Y1)var1_1.next()).b0())) continue;
                                    var8_9 = 1;
                                    break block45;
                                }
                                var8_9 = 0;
                            }
                            var6_10 = A6.a() != false && this.f().D(this.d, K.j0) != false ? 1 : 0;
                            var7_11 = A6.a() != false && this.f().D(this.d, K.i0) != false;
                            if (var8_9 != 0) {
                                var1_1 = this.q();
                                var4_6 = this.d;
                                var1_1.u();
                                var1_1.n();
                                n.e((String)var4_6);
                                var5_7 = new ContentValues();
                                var5_7.put("current_session_count", Integer.valueOf((int)0));
                                try {
                                    var1_1.B().update("events", (ContentValues)var5_7, "app_id = ?", new String[]{var4_6});
                                }
                                catch (SQLiteException var5_8) {
                                    var1_1.j().G().c("Error resetting session-scoped event counts. appId", Y1.v((String)var4_6), (Object)var5_8);
                                }
                            }
                            var5_7 = var1_1 = Collections.emptyMap();
                            if (var7_11) {
                                var5_7 = var1_1;
                                if (var6_10 != 0) {
                                    var5_7 = this.q().O0(this.d);
                                }
                            }
                            if ((var13_12 = this.q().N0(this.d)).isEmpty()) break block47;
                            var12_13 = new HashSet((Collection)var13_12.keySet());
                            if (var8_9 == 0) break block48;
                            var4_6 = this.d;
                            var1_1 = this.q().P0(this.d);
                            n.e((String)var4_6);
                            n.i((Object)var13_12);
                            var4_6 = new a();
                            if (var13_12.isEmpty()) break block49;
                            var14_14 = var13_12.keySet().iterator();
                            break block50;
                        }
                        var1_1 = var13_12;
                        break block51;
                    }
                    while (var14_14.hasNext()) {
                        var15_15 = (Integer)var14_14.next();
                        var15_15.intValue();
                        var17_17 = (f2)var13_12.get(var15_15);
                        var16_16 = (List)var1_1.get(var15_15);
                        if (var16_16 != null && !var16_16.isEmpty()) {
                            var18_18 = this.o().N(var17_17.Z(), (List)var16_16);
                            if (var18_18.isEmpty()) continue;
                            var18_18 = ((f2.a)var17_17.x()).y().z((Iterable)var18_18);
                            var19_19 = this.o().N(var17_17.b0(), (List)var16_16);
                            var18_18.C().D((Iterable)var19_19);
                            var19_19 = new ArrayList();
                            for (com.google.android.gms.internal.measurement.X1 var21_21 : var17_17.Y()) {
                                if (var16_16.contains((Object)var21_21.k())) continue;
                                var19_19.add((Object)var21_21);
                            }
                            var18_18.w().x((Iterable)var19_19);
                            var19_19 = new ArrayList();
                            for (g2 var20_20 : var17_17.a0()) {
                                if (var16_16.contains((Object)var20_20.K())) continue;
                                var19_19.add((Object)var20_20);
                            }
                            var18_18.A().B((Iterable)var19_19);
                            var4_6.put(var15_15, (Object)((f2)((Y3)var18_18.p())));
                            continue;
                        }
                        var4_6.put(var15_15, var17_17);
                    }
                }
                var1_1 = var4_6;
            }
            var12_13 = var12_13.iterator();
            while (var12_13.hasNext()) {
                block52 : {
                    var14_14 = (Integer)var12_13.next();
                    var14_14.intValue();
                    var18_18 = (f2)var1_1.get(var14_14);
                    var15_15 = new BitSet();
                    var16_16 = new BitSet();
                    var17_17 = new a();
                    if (var18_18 != null && var18_18.k() != 0) {
                        var19_19 = var18_18.Y().iterator();
                        while (var19_19.hasNext()) {
                            var4_6 = (com.google.android.gms.internal.measurement.X1)var19_19.next();
                            if (!var4_6.O()) continue;
                            var8_9 = var4_6.k();
                            var4_6 = var4_6.N() != false ? Long.valueOf((long)var4_6.K()) : null;
                            var17_17.put((Object)var8_9, var4_6);
                        }
                    }
                    var19_19 = new a();
                    if (var18_18 != null && var18_18.N() != 0) {
                        for (g2 var20_20 : var18_18.a0()) {
                            if (!var20_20.P() || var20_20.k() <= 0) continue;
                            var19_19.put((Object)var20_20.K(), (Object)var20_20.G(var20_20.k() - 1));
                        }
                    }
                    var4_6 = var1_1;
                    if (var18_18 == null) break block52;
                    var8_9 = 0;
                    do {
                        var4_6 = var1_1;
                        if (var8_9 >= var18_18.R() << 6) break;
                        if (!N5.d0(var18_18.b0(), var8_9)) ** GOTO lbl-1000
                        this.j().K().c("Filter already evaluated. audience ID, filter ID", var14_14, var8_9);
                        var16_16.set(var8_9);
                        if (N5.d0(var18_18.Z(), var8_9)) {
                            var15_15.set(var8_9);
                        } else lbl-1000: // 2 sources:
                        {
                            var17_17.remove((Object)var8_9);
                        }
                        ++var8_9;
                    } while (true);
                }
                var1_1 = (f2)var13_12.get(var14_14);
                if (var7_11 && var6_10 != 0 && (var18_18 = (List)var5_7.get(var14_14)) != null && this.h != null && this.g != null) {
                    var18_18 = var18_18.iterator();
                    while (var18_18.hasNext()) {
                        var20_20 = (x1)var18_18.next();
                        var8_9 = var20_20.L();
                        var9_22 = this.h / 1000L;
                        if (var20_20.S()) {
                            var9_22 = this.g / 1000L;
                        }
                        if (var17_17.containsKey((Object)var8_9)) {
                            var17_17.put((Object)var8_9, (Object)var9_22);
                        }
                        if (!var19_19.containsKey((Object)var8_9)) continue;
                        var19_19.put((Object)var8_9, (Object)var9_22);
                    }
                }
                var1_1 = new d6(this, this.d, (f2)var1_1, (BitSet)var15_15, (BitSet)var16_16, (Map)var17_17, var19_19, null);
                this.f.put(var14_14, var1_1);
                var1_1 = var4_6;
            }
        }
        if (!var2_4.isEmpty()) {
            var13_12 = new f6(this, null);
            var12_13 = new a();
            var14_14 = var2_4.iterator();
            block15 : while (var14_14.hasNext()) {
                var1_1 = (com.google.android.gms.internal.measurement.Y1)var14_14.next();
                var15_15 = var13_12.a(this.d, (com.google.android.gms.internal.measurement.Y1)var1_1);
                if (var15_15 == null) continue;
                var2_4 = this.q();
                var4_6 = this.d;
                var5_7 = var15_15.b0();
                var16_16 = var2_4.C0((String)var4_6, var1_1.b0());
                if (var16_16 == null) {
                    var2_4.j().L().c("Event aggregate wasn't created during raw event logging. appId, event", Y1.v((String)var4_6), var2_4.h().c((String)var5_7));
                    var4_6 = new E((String)var4_6, var1_1.b0(), 1L, 1L, 1L, var1_1.Y(), 0L, null, null, null, null);
                } else {
                    var4_6 = new E(var16_16.a, var16_16.b, var16_16.c + 1L, var16_16.d + 1L, var16_16.e + 1L, var16_16.f, var16_16.g, var16_16.h, var16_16.i, var16_16.j, var16_16.k);
                }
                this.q().T((E)var4_6);
                var9_22 = var4_6.c;
                var2_4 = var15_15.b0();
                var5_7 = var1_1 = (Map)var12_13.get(var2_4);
                if (var1_1 == null) {
                    var5_7 = this.q().H0(this.d, (String)var2_4);
                    var12_13.put(var2_4, var5_7);
                }
                var16_16 = var5_7.keySet().iterator();
                var1_1 = var12_13;
                var2_4 = var13_12;
                block16 : do {
                    var13_12 = var2_4;
                    var12_13 = var1_1;
                    if (!var16_16.hasNext()) continue block15;
                    var12_13 = (Integer)var16_16.next();
                    var6_10 = var12_13.intValue();
                    if (this.e.contains(var12_13)) {
                        this.j().K().b("Skipping failed audience ID", var12_13);
                        continue;
                    }
                    var13_12 = ((List)var5_7.get(var12_13)).iterator();
                    var11_23 = true;
                    do {
                        if (!var13_12.hasNext()) continue block16;
                        var17_17 = (x1)var13_12.next();
                        var18_18 = new h6(this, this.d, var6_10, (x1)var17_17);
                        var11_23 = var18_18.k(this.g, this.h, (com.google.android.gms.internal.measurement.Y1)var15_15, var9_22, (E)var4_6, this.A(var6_10, var17_17.L()));
                        if (!var11_23) break;
                        this.y((Integer)var12_13).c((d)var18_18);
                    } while (true);
                    this.e.add(var12_13);
                    if (var11_23) continue;
                    this.e.add(var12_13);
                } while (true);
            }
        }
        if (!var3_5.isEmpty()) {
            var4_6 = new a();
            block18 : for (Object var5_7 : var3_5) {
                var12_13 = var5_7.Z();
                var2_4 = (Map)var4_6.get(var12_13);
                var1_1 = var2_4;
                if (var2_4 == null) {
                    var1_1 = this.q().J0(this.d, (String)var12_13);
                    var4_6.put(var12_13, var1_1);
                }
                block19 : for (Iterator var13_12 : var1_1.keySet()) {
                    var6_10 = var13_12.intValue();
                    if (this.e.contains((Object)var13_12)) {
                        this.j().K().b("Skipping failed audience ID", (Object)var13_12);
                        continue block18;
                    }
                    var15_15 = ((List)var1_1.get((Object)var13_12)).iterator();
                    var11_23 = true;
                    while (var15_15.hasNext()) {
                        var14_14 = (A1)var15_15.next();
                        if (this.j().C(2)) {
                            var16_16 = this.j().K();
                            var2_4 = var14_14.P() != false ? Integer.valueOf((int)var14_14.k()) : null;
                            var16_16.d("Evaluating filter. audience, filter, property", (Object)var13_12, var2_4, this.h().g(var14_14.L()));
                            this.j().K().b("Filter definition", this.o().J((A1)var14_14));
                        }
                        if (var14_14.P() && var14_14.k() <= 256) {
                            var2_4 = new c(this, this.d, var6_10, (A1)var14_14);
                            var11_23 = var2_4.k(this.g, this.h, (h2)var5_7, this.A(var6_10, var14_14.k()));
                            if (var11_23) {
                                this.y((Integer)var13_12).c((d)var2_4);
                                continue;
                            }
                            this.e.add((Object)var13_12);
                            if (var11_23) continue block19;
                        } else {
                            var15_15 = this.j().L();
                            var16_16 = Y1.v(this.d);
                            var2_4 = var14_14.P() != false ? Integer.valueOf((int)var14_14.k()) : null;
                            var15_15.c("Invalid property filter ID. appId, id", var16_16, String.valueOf((Object)var2_4));
                        }
                        this.e.add((Object)var13_12);
                        continue block19;
                    }
                }
            }
        }
        var2_4 = new ArrayList();
        var1_1 = this.f.keySet();
        var1_1.removeAll((Collection)this.e);
        var3_5 = var1_1.iterator();
        while (var3_5.hasNext() != false) {
            block46 : {
                var1_1 = (Integer)var3_5.next();
                var6_10 = var1_1.intValue();
                var4_6 = (d6)this.f.get(var1_1);
                n.i(var4_6);
                var12_13 = var4_6.a(var6_10);
                var2_4.add(var12_13);
                var4_6 = this.q();
                var5_7 = this.d;
                var12_13 = var12_13.Q();
                var4_6.u();
                var4_6.n();
                n.e((String)var5_7);
                n.i(var12_13);
                var13_12 = var12_13.h();
                var12_13 = new ContentValues();
                var12_13.put("app_id", (String)var5_7);
                var12_13.put("audience_id", (Integer)var1_1);
                var12_13.put("current_results", (byte[])var13_12);
                var1_1 = var4_6.B();
                try {
                    if (var1_1.insertWithOnConflict("audience_filter_values", null, (ContentValues)var12_13, 5) != -1L) continue;
                    var4_6.j().G().b("Failed to insert filter results (got -1). appId", Y1.v((String)var5_7));
                    continue;
                }
                catch (SQLiteException var1_2) {
                    break block46;
                }
                catch (SQLiteException var1_3) {
                    // empty catch block
                }
            }
            var4_6.j().G().c("Error storing filter results. appId", Y1.v((String)var5_7), var1_1);
        }
        return var2_4;
    }
}

