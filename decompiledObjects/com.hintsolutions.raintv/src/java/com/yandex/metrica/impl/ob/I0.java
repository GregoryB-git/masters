/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.g0
 *  com.yandex.metrica.impl.ob.h0
 *  com.yandex.metrica.impl.ob.in
 *  com.yandex.metrica.impl.ob.w
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.EnumMap
 *  java.util.LinkedList
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.F2;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.I2;
import com.yandex.metrica.impl.ob.K2;
import com.yandex.metrica.impl.ob.Kj;
import com.yandex.metrica.impl.ob.Nj;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.g0;
import com.yandex.metrica.impl.ob.h0;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.hi;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.ij;
import com.yandex.metrica.impl.ob.in;
import com.yandex.metrica.impl.ob.mn;
import com.yandex.metrica.impl.ob.oc;
import com.yandex.metrica.impl.ob.om;
import com.yandex.metrica.impl.ob.rg;
import com.yandex.metrica.impl.ob.s;
import com.yandex.metrica.impl.ob.w;
import com.yandex.metrica.impl.ob.y0;
import com.yandex.metrica.impl.ob.yg;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i0 {
    @NonNull
    private final Context a;
    @NonNull
    private final E b;
    @NonNull
    private final w c;
    @NonNull
    private final oc d;
    @NonNull
    private final I2 e;
    private ContentValues f;
    private yg g;

    public i0(Context context) {
        this(context, F0.g().c(), F0.g().b(), oc.a(context), H2.a(context));
    }

    @VisibleForTesting
    public i0(@NonNull Context context, @NonNull E e4, @NonNull w w2, @NonNull oc oc2, @NonNull H2 h22) {
        this.a = context;
        this.b = e4;
        this.c = w2;
        this.d = oc2;
        this.e = h22.a();
    }

    public static /* synthetic */ ContentValues a(i0 i02) {
        return i02.f;
    }

    private void a(@NonNull JSONObject jSONObject) throws JSONException {
        jSONObject = jSONObject.putOpt("dId", (Object)((rg)((Object)this.g)).g()).putOpt("uId", (Object)((rg)((Object)this.g)).w()).putOpt("appVer", (Object)((rg)((Object)this.g)).f()).putOpt("appBuild", (Object)((rg)((Object)this.g)).b());
        this.g.getClass();
        jSONObject = jSONObject.putOpt("analyticsSdkVersionName", (Object)"5.2.0");
        this.g.getClass();
        jSONObject = jSONObject.putOpt("kitBuildNumber", (Object)"45002146").putOpt("kitBuildType", (Object)((rg)((Object)this.g)).j()).putOpt("osVer", (Object)((rg)((Object)this.g)).o()).putOpt("osApiLev", (Object)((rg)((Object)this.g)).n()).putOpt("lang", (Object)((rg)((Object)this.g)).k()).putOpt("root", (Object)((rg)((Object)this.g)).h()).putOpt("app_debuggable", (Object)this.g.z()).putOpt("app_framework", (Object)((rg)((Object)this.g)).c()).putOpt("attribution_id", (Object)this.g.C());
        this.g.getClass();
        jSONObject.putOpt("commit_hash", (Object)"e44a8b69c7d76049d312caec6fb8a01b60982d8f");
    }

    private void a(@NonNull JSONObject jSONObject, @NonNull K2 k22) throws JSONException {
        jSONObject.put("lat", k22.getLatitude());
        jSONObject.put("lon", k22.getLongitude());
        jSONObject.putOpt("timestamp", (Object)k22.getTime());
        Object object = k22.hasAccuracy() ? Float.valueOf((float)k22.getAccuracy()) : null;
        jSONObject.putOpt("precision", object);
        object = k22.hasBearing() ? Float.valueOf((float)k22.getBearing()) : null;
        jSONObject.putOpt("direction", object);
        object = k22.hasSpeed() ? Float.valueOf((float)k22.getSpeed()) : null;
        jSONObject.putOpt("speed", object);
        object = k22.hasAltitude() ? Double.valueOf((double)k22.getAltitude()) : null;
        jSONObject.putOpt("altitude", object);
        jSONObject.putOpt("provider", (Object)com.yandex.metrica.impl.ob.b.a(k22.getProvider(), null));
        jSONObject.putOpt("original_provider", (Object)k22.a());
    }

    public i0 a(ContentValues contentValues) {
        this.f = contentValues;
        return this;
    }

    public i0 a(@NonNull yg yg2) {
        this.g = yg2;
        return this;
    }

    public void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.a(jSONObject);
        }
        catch (Throwable throwable) {
            jSONObject = new JSONObject();
        }
        this.f.put("report_request_parameters", jSONObject.toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull om object, @NonNull s.a object2, @NonNull in<hi.b, Object> object3) {
        void var1_22;
        void var1_18;
        void var3_32;
        void var1_13;
        void var2_25;
        Boolean bl;
        c0 c02 = object.a;
        this.f.put("name", c02.a);
        this.f.put("value", c02.b);
        this.f.put("type", Integer.valueOf((int)c02.e));
        this.f.put("custom_type", Integer.valueOf((int)c02.f));
        this.f.put("error_environment", c02.h());
        this.f.put("user_info", c02.o());
        this.f.put("truncated", Integer.valueOf((int)c02.h));
        this.f.put("connection_type", Integer.valueOf((int)H1.b(this.a)));
        this.f.put("profile_id", c02.l());
        this.f.put("encrypting_mode", Integer.valueOf((int)object.b.a()));
        this.f.put("first_occurrence_status", Integer.valueOf((int)c02.i().a));
        y0 y02 = c02.m();
        if (y02 != null) {
            this.f.put("source", Integer.valueOf((int)y02.a));
        }
        if ((bl = c02.c()) != null) {
            this.f.put("attribution_id_changed", bl);
        }
        this.f.put("open_id", c02.j());
        this.f.put("app_environment", var2_25.a);
        this.f.put("app_environment_revision", Long.valueOf((long)var2_25.b));
        JSONObject jSONObject = new JSONObject();
        Object var6_45 = null;
        try {
            void var5_38;
            void var1_7;
            jSONObject.put("enabled", this.g.Q());
            if (this.g.Q()) {
                Location location = this.g.H();
                if (location == null) {
                    Location location2 = this.d.a();
                    Object var1_4 = null;
                } else {
                    K2 k22 = K2.a(location);
                }
            } else {
                Object var2_28 = null;
                Object var1_6 = null;
            }
            void var5_35 = var1_7;
            if (var1_7 == null) {
                void var2_29;
                void var5_36 = var1_7;
                if (var2_29 != null) {
                    K2 k23 = K2.b((Location)var2_29);
                }
            }
            if (var5_38 != null) {
                this.a(jSONObject, (K2)var5_38);
            }
            ContentValues contentValues = this.f;
            contentValues.put("location_info", jSONObject.toString());
        }
        catch (Throwable throwable) {}
        EnumMap enumMap = new EnumMap(hi.b.class);
        Kj kj2 = F0.g().v();
        LinkedList linkedList = new LinkedList();
        kj2.a((ij)new h0(this, linkedList));
        hi.b b2 = hi.b.a;
        enumMap.put((Enum)b2, this.e.a());
        hi.b b3 = hi.b.b;
        if (linkedList.isEmpty()) {
            Object var1_11 = null;
        } else {
            Collection collection = (Collection)linkedList.getFirst();
        }
        enumMap.put((Enum)b3, (Object)var1_13);
        mn mn2 = var3_32.a((Map)enumMap);
        ContentValues contentValues = this.f;
        int n4 = mn2.a == mn.a.b ? 1 : 0;
        contentValues.put("has_omitted_data", Integer.valueOf((int)n4));
        mn.a a2 = mn2.a;
        Object d4 = mn2.b;
        if (d4 == null) {
            Object var1_16 = null;
        } else {
            Collection collection = (Collection)((Map)d4).get((Object)b3);
        }
        kj2.a((Nj)new g0(this));
        mn.a a3 = mn.a.a;
        if ((a2 == a3 || a2 == mn.a.c) && var1_18 != null) {
            this.f.put("cell_info", Gl.a((Collection<hj>)var1_18).toString());
        }
        mn.a a5 = mn2.a;
        Object d5 = mn2.b;
        if (d5 == null) {
            Object var1_20 = var6_45;
        } else {
            Collection collection = (Collection)((Map)d5).get((Object)b2);
        }
        if ((a5 == mn.a.c || a5 == a3) && var1_22 != null) {
            JSONArray jSONArray = F2.a((Collection<F2>)var1_22);
            this.f.put("wifi_network_info", jSONArray.toString());
        }
        this.f.put("battery_charge_type", Integer.valueOf((int)this.b.b().a()));
        this.f.put("collection_mode", hc.a.a(this.c.c()).a());
    }
}

