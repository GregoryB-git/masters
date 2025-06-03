/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.xf$k
 *  com.yandex.metrica.impl.ob.xf$k$a
 *  com.yandex.metrica.impl.ob.xf$k$a$a
 *  com.yandex.metrica.impl.ob.xf$k$a$a$a
 *  com.yandex.metrica.impl.ob.xf$k$a$b
 *  com.yandex.metrica.impl.ob.xf$k$a$b$a
 *  com.yandex.metrica.impl.ob.xf$k$b
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.E9;
import com.yandex.metrica.impl.ob.Fh;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.xf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class yi {
    private static final Map<String, Integer> a = Collections.unmodifiableMap((Map)new HashMap<String, Integer>(){
        {
            this.put("BACKGROUND", 0);
            Integer n7 = 2;
            this.put("FOREGROUND", n7);
            this.put("VISIBLE", n7);
        }
    });

    @NonNull
    private static xf.k.a.a a(@Nullable JSONObject jSONObject, boolean bl) {
        xf.k.a.a a2 = new xf.k.a.a();
        Boolean bl2 = Gl.a(jSONObject, "last_known_enabled", null);
        boolean bl3 = a2.a;
        Boolean bl4 = bl2;
        if (bl2 == null) {
            bl4 = bl3;
        }
        a2.a = bl4;
        bl4 = bl2 = Gl.a(jSONObject, "scanning_enabled", null);
        if (bl2 == null) {
            bl4 = bl;
        }
        a2.b = bl = bl4.booleanValue();
        if (jSONObject != null && bl) {
            xf.k.a.a.a a3 = new xf.k.a.a.a();
            bl2 = Gl.a(jSONObject, "duration_seconds", null);
            long l8 = a3.a;
            bl4 = bl2;
            if (bl2 == null) {
                bl4 = Long.valueOf((long)l8);
            }
            a3.a = bl4.longValue();
            bl4 = Gl.a(jSONObject, "interval_seconds", null);
            l8 = a3.b;
            jSONObject = bl4;
            if (bl4 == null) {
                jSONObject = Long.valueOf((long)l8);
            }
            a3.b = jSONObject.longValue();
            a2.c = a3;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull Hi hi2, @NonNull JSONObject object) {
        E9 e9 = new E9();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = object.optJSONArray("location_collecting");
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); ++i3) {
                int n7;
                xf.k.b b3;
                ArrayList arrayList2;
                xf.k.a a2;
                JSONObject jSONObject = jSONArray.optJSONObject(i3);
                if (jSONObject == null) continue;
                Fh fh2 = hi2.e();
                xf.k k8 = new xf.k();
                JSONObject jSONObject2 = jSONObject.optJSONObject("config");
                k8.a = a2 = new xf.k.a();
                if (jSONObject2 != null) {
                    void var2_33;
                    void var2_30;
                    void var2_27;
                    void var2_24;
                    void var2_21;
                    void var2_18;
                    void var2_14;
                    void var2_11;
                    void var2_8;
                    arrayList2 = null;
                    a2.a = Gl.a(Gl.a(jSONObject2, "min_update_interval_seconds", null), TimeUnit.SECONDS, k8.a.a);
                    xf.k.a a3 = k8.a;
                    if (jSONObject2.has("min_update_distance_meters")) {
                        try {
                            Float f9 = Float.valueOf((float)((float)jSONObject2.getDouble("min_update_distance_meters")));
                        }
                        catch (Throwable throwable) {}
                    }
                    Object var2_7 = null;
                    float f10 = k8.a.b;
                    b3 = var2_8;
                    if (var2_8 == null) {
                        b3 = Float.valueOf((float)f10);
                    }
                    a3.b = b3.floatValue();
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "records_count_to_force_flush", null);
                    n7 = k8.a.c;
                    xf.k.b b4 = b3;
                    if (b3 == null) {
                        Integer n8 = n7;
                    }
                    a3.c = var2_11.intValue();
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "max_records_count_in_batch", null);
                    n7 = k8.a.d;
                    xf.k.b b6 = b3;
                    if (b3 == null) {
                        Integer n10 = n7;
                    }
                    a3.d = var2_14.intValue();
                    b3 = k8.a;
                    Long l8 = Gl.a(jSONObject2, "max_age_seconds_to_force_flush", null);
                    a3 = TimeUnit.SECONDS;
                    b3.e = Gl.a(l8, (TimeUnit)a3, k8.a.e);
                    xf.k.a a7 = k8.a;
                    b3 = Gl.a(jSONObject2, "max_records_to_store_locally", null);
                    n7 = k8.a.f;
                    xf.k.b b7 = b3;
                    if (b3 == null) {
                        Integer n11 = n7;
                    }
                    a7.f = var2_18.intValue();
                    k8.a.j = Gl.a(Gl.a(jSONObject2, "lbs_min_update_interval_seconds", null), (TimeUnit)a3, k8.a.j);
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "location_collecting_enabled", null);
                    boolean bl = k8.a.g;
                    xf.k.b b9 = b3;
                    if (b3 == null) {
                        Boolean bl2 = bl;
                    }
                    bl = var2_21.booleanValue() && fh2.g;
                    a3.g = bl;
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "lbs_collecting_enabled", null);
                    bl = k8.a.h;
                    xf.k.b b10 = b3;
                    if (b3 == null) {
                        Boolean bl3 = bl;
                    }
                    bl = var2_24.booleanValue() && fh2.h;
                    a3.h = bl;
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "passive_collecting_enabled", null);
                    bl = k8.a.i;
                    xf.k.b b11 = b3;
                    if (b3 == null) {
                        Boolean bl4 = bl;
                    }
                    bl = var2_27.booleanValue() && fh2.g;
                    a3.i = bl;
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "all_cells_collecting_enabled", null);
                    bl = k8.a.p;
                    xf.k.b b12 = b3;
                    if (b3 == null) {
                        Boolean bl5 = bl;
                    }
                    bl = var2_30.booleanValue() && fh2.r;
                    a3.p = bl;
                    a3 = k8.a;
                    b3 = Gl.a(jSONObject2, "connected_cell_collecting_enabled", null);
                    bl = k8.a.q;
                    xf.k.b b13 = b3;
                    if (b3 == null) {
                        Boolean bl6 = bl;
                    }
                    bl = var2_33.booleanValue() && fh2.r;
                    a3.q = bl;
                    if (fh2.p) {
                        k8.a.k = yi.a(jSONObject2.optJSONObject("wifi_access_config"), false);
                    }
                    xf.k.a a9 = k8.a;
                    if (a9.h) {
                        a9.l = yi.a(jSONObject2.optJSONObject("lbs_access_config"), false);
                    }
                    xf.k.a a10 = k8.a;
                    if (a10.g) {
                        a10.m = yi.a(jSONObject2.optJSONObject("gps_access_config"), false);
                    }
                    xf.k.a a11 = k8.a;
                    if (a11.i) {
                        a11.n = yi.a(jSONObject2.optJSONObject("passive_access_config"), true);
                    }
                    if (fh2.i) {
                        void var2_42;
                        void var2_39;
                        fh2 = k8.a;
                        a3 = jSONObject2.optJSONObject("gpl_access_config");
                        xf.k.a.b b14 = new xf.k.a.b();
                        b3 = Gl.a((JSONObject)a3, "scanning_enabled", null);
                        bl = b14.b;
                        xf.k.b b15 = b3;
                        if (b3 == null) {
                            Boolean bl7 = bl;
                        }
                        b14.b = var2_39.booleanValue();
                        b3 = Gl.a((JSONObject)a3, "last_known_enabled", null);
                        bl = b14.a;
                        xf.k.b b16 = b3;
                        if (b3 == null) {
                            Boolean bl8 = bl;
                        }
                        b14.a = var2_42.booleanValue();
                        if (b14.b) {
                            void var2_49;
                            String string = Gl.b((JSONObject)a3, "priority");
                            b3 = Gl.a((JSONObject)a3, "duration_seconds", null);
                            a3 = Gl.a((JSONObject)a3, "interval_seconds", null);
                            ArrayList arrayList3 = arrayList2;
                            if (string != null) {
                                if (string.equals((Object)"PRIORITY_NO_POWER")) {
                                    Integer n12 = 0;
                                } else if (string.equals((Object)"PRIORITY_LOW_POWER")) {
                                    Integer n13 = 1;
                                } else if (string.equals((Object)"PRIORITY_BALANCED_POWER_ACCURACY")) {
                                    Integer n14 = 2;
                                } else {
                                    ArrayList arrayList4 = arrayList2;
                                    if (string.equals((Object)"PRIORITY_HIGH_ACCURACY")) {
                                        Integer n15 = 3;
                                    }
                                }
                            }
                            if (var2_49 != null && b3 != null && a3 != null) {
                                arrayList2 = new xf.k.a.b.a();
                                arrayList2.a = b3.longValue();
                                arrayList2.b = a3.longValue();
                                arrayList2.c = var2_49.intValue();
                                b14.c = arrayList2;
                            }
                        }
                        ((xf.k.a)fh2).o = b14;
                    }
                }
                k8.b = new xf.k.b();
                JSONObject jSONObject3 = jSONObject.optJSONObject("preconditions");
                if (jSONObject3 != null) {
                    b3 = k8.b;
                    arrayList2 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject3.optJSONArray("charge_types");
                    if (jSONArray2 != null) {
                        for (n7 = 0; n7 < jSONArray2.length(); ++n7) {
                            String string = jSONArray2.optString(n7);
                            if ("USB".equals((Object)string)) {
                                arrayList2.add((Object)1);
                                continue;
                            }
                            if ("AC".equals((Object)string)) {
                                arrayList2.add((Object)3);
                                continue;
                            }
                            if ("NONE".equals((Object)string)) {
                                arrayList2.add((Object)0);
                                continue;
                            }
                            if (!"WIRELESS".equals((Object)string)) continue;
                            arrayList2.add((Object)2);
                        }
                    }
                    int[] nArray = new int[arrayList2.size()];
                    arrayList2 = arrayList2.iterator();
                    n7 = 0;
                    while (arrayList2.hasNext()) {
                        nArray[n7] = (Integer)arrayList2.next();
                        ++n7;
                    }
                    b3.a = nArray;
                    b3 = k8.b;
                    arrayList2 = new ArrayList();
                    JSONArray jSONArray3 = jSONObject3.optJSONArray("app_statuses");
                    if (jSONArray3 != null) {
                        for (n7 = 0; n7 < jSONArray3.length(); ++n7) {
                            Integer n16 = (Integer)a.get((Object)jSONArray3.optString(n7, ""));
                            if (n16 == null) continue;
                            arrayList2.add((Object)n16);
                        }
                    }
                    int[] nArray2 = new int[arrayList2.size()];
                    arrayList2 = arrayList2.iterator();
                    n7 = 0;
                    while (arrayList2.hasNext()) {
                        nArray2[n7] = (Integer)arrayList2.next();
                        ++n7;
                    }
                    b3.b = nArray2;
                }
                arrayList.add((Object)e9.a(k8));
            }
        }
        hi2.b((List<hc>)arrayList);
    }
}

