/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.WeakHashMap
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Dh;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Lh;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.T1;
import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.Tk;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.Vh;
import com.yandex.metrica.impl.ob.W0;
import com.yandex.metrica.impl.ob.Wh;
import com.yandex.metrica.impl.ob.Zh;
import com.yandex.metrica.impl.ob.f0;
import com.yandex.metrica.impl.ob.ka;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class Uh
implements Wh,
Q0 {
    public static final Map<Th, IParamsCallback.Reason> j = Collections.unmodifiableMap((Map)new HashMap<Th, IParamsCallback.Reason>(){
        {
            this.put((Object)((Object)Th.b), (Object)((Object)IParamsCallback.Reason.UNKNOWN));
            this.put((Object)((Object)Th.c), (Object)((Object)IParamsCallback.Reason.NETWORK));
            this.put((Object)((Object)Th.d), (Object)((Object)IParamsCallback.Reason.INVALID_RESPONSE));
        }
    });
    private final List<String> a = Arrays.asList((Object[])new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_clids"});
    private final T1 b;
    private final Zh c;
    @NonNull
    private final Handler d;
    @Nullable
    private Pl e;
    private final f0.a f;
    private final Object g = new Object();
    private final Map<Lh, List<String>> h = new WeakHashMap();
    private Map<String, String> i;

    public Uh(@NonNull Context context, T1 t1, V8 v8, @NonNull Handler handler) {
        this(t1, new Zh(context, v8), handler);
    }

    @VisibleForTesting
    public Uh(T1 t1, @NonNull Zh zh, @NonNull Handler handler) {
        this.b = t1;
        this.c = zh;
        this.d = handler;
        this.f = new f0.a(this){

            @Override
            public void a(int n3, @NonNull Bundle bundle) {
            }
        };
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(@NonNull Lh var1_1, @NonNull Bundle var2_2) {
        block15: {
            block17: {
                block16: {
                    if (!this.h.containsKey((Object)var1_1)) break block15;
                    var8_3 = (List)this.h.get((Object)var1_1);
                    var4_4 = this.c.a((Collection<String>)var8_3);
                    var7_5 = null;
                    var5_6 /* !! */  = null;
                    if (!var4_4) break block16;
                    if (var8_3 == null) {
                        var2_2 /* !! */  = var5_6 /* !! */ ;
                    } else {
                        var2_2 /* !! */  = new HashMap();
                        this.c.a((List<String>)var8_3, (Map<String, W0>)var2_2 /* !! */ );
                    }
                    var1_1.onReceive((Map<String, W0>)var2_2 /* !! */ );
                    break block17;
                }
                if (var2_2 /* !! */ .containsKey("startup_error_key_code")) {
                    var3_7 = var2_2 /* !! */ .getInt("startup_error_key_code");
                    var2_2 /* !! */  = Th.b;
                    if (var3_7 != 1) {
                        if (var3_7 == 2) {
                            var2_2 /* !! */  = Th.d;
                        }
                    } else {
                        var2_2 /* !! */  = Th.c;
                    }
                } else {
                    var2_2 /* !! */  = null;
                }
                var5_6 /* !! */  = var2_2 /* !! */ ;
                if (var2_2 /* !! */  != null) ** GOTO lbl36
                if (!this.c.a()) {
                    var5_6 /* !! */  = this.e;
                    if (var5_6 /* !! */  != null) {
                        var5_6 /* !! */ .fw("Clids error. Passed clids: %s, and clids from server are empty.", new Object[]{this.i});
                    }
                    var6_8 /* !! */  = IParamsCallback.Reason.INCONSISTENT_CLIDS;
                    var5_6 /* !! */  = var2_2 /* !! */ ;
                    var2_2 /* !! */  = var6_8 /* !! */ ;
                } else {
                    var5_6 /* !! */  = Th.b;
lbl36:
                    // 2 sources

                    var2_2 /* !! */  = null;
                }
                var6_8 /* !! */  = var2_2 /* !! */ ;
                if (var2_2 /* !! */  == null) {
                    var6_8 /* !! */  = Uh.j;
                    var2_2 /* !! */  = IParamsCallback.Reason.UNKNOWN;
                    if ((var5_6 /* !! */  = var6_8 /* !! */ .get((Object)var5_6 /* !! */ )) != null) {
                        var2_2 /* !! */  = var5_6 /* !! */ ;
                    }
                    var6_8 /* !! */  = (IParamsCallback.Reason)var2_2 /* !! */ ;
                }
                if (var8_3 == null) {
                    var2_2 /* !! */  = var7_5;
                } else {
                    var2_2 /* !! */  = new HashMap();
                    this.c.a((List<String>)var8_3, (Map<String, W0>)var2_2 /* !! */ );
                }
                var1_1.a((IParamsCallback.Reason)var6_8 /* !! */ , (Map<String, W0>)var2_2 /* !! */ );
            }
            this.h.remove((Object)var1_1);
            if (this.h.isEmpty()) {
                this.b.f();
            }
        }
    }

    private void f() {
        Map.Entry entry2;
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry2 : this.h.entrySet()) {
            List list = (List)entry2.getValue();
            if (!this.c.a((Collection<String>)list)) continue;
            weakHashMap.put(entry2.getKey(), (Object)list);
        }
        entry2 = weakHashMap.entrySet().iterator();
        while (entry2.hasNext()) {
            Object object = (Lh)((Map.Entry)entry2.next()).getKey();
            if (object == null) continue;
            this.a((Lh)object, new Bundle());
        }
        weakHashMap.clear();
    }

    @Override
    public long a() {
        return this.c.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull Bundle bundle, @Nullable Lh lh) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            this.c.a(bundle);
            this.f();
            this.f();
            if (lh != null) {
                this.a(lh, bundle);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(IIdentifierCallback object, @NonNull List<String> bundle, @Nullable Map<String, String> map) {
        Object object2 = new Dh((IIdentifierCallback)object);
        Object object3 = object = this.g;
        synchronized (object3) {
            this.c.a(map);
            if (this.h.isEmpty()) {
                this.b.g();
            }
            this.h.put(object2, bundle);
            if (this.c.b((List<String>)bundle)) {
                Vh vh = new Vh(this, (Lh)object2);
                object2 = new f0(this.d, vh);
                this.b.a((List<String>)bundle, (ResultReceiver)object2, map);
            } else {
                bundle = new Bundle();
                this.a((Lh)object2, bundle);
            }
            return;
        }
    }

    public void a(@NonNull Pl pl2) {
        this.e = pl2;
    }

    public void a(@NonNull Tk tk2) {
        this.c.a(tk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string2) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            this.b.a(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(List<String> list) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            List<String> list2 = this.c.b();
            if (A2.b(list)) {
                if (!A2.b(list2)) {
                    this.c.a((List<String>)null);
                    this.b.a((List<String>)null);
                }
            } else if (!A2.a(list, list2)) {
                this.c.a(list);
                this.b.a(list);
            } else {
                this.b.a(list2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Map<String, String> map) {
        Object object;
        if (A2.b(map)) return;
        Object object2 = object = this.g;
        synchronized (object2) {
            map = Gl.i(map);
            this.i = map;
            this.b.a(map);
            this.c.a(map);
            return;
        }
    }

    public String b() {
        return this.c.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@Nullable String string2) {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            this.b.b(string2);
            return;
        }
    }

    @NonNull
    public ka c() {
        return this.c.d();
    }

    @Nullable
    public Sk d() {
        return this.c.f();
    }

    public String e() {
        return this.c.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void g() {
        Object object;
        Object object2 = object = this.g;
        // MONITORENTER : object2
        Object object3 = this.c;
        Zh zh = object3;
        // MONITORENTER : zh
        boolean bl = ((Zh)object3).b((List<String>)Arrays.asList((Object[])new String[]{"yandex_mobile_metrica_clids", "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"}));
        // MONITOREXIT : zh
        if (bl) {
            Map<String, String> map = this.i;
            List<String> list = this.a;
            object3 = this.f;
            f0 f02 = new f0(this.d, (f0.a)object3);
            this.b.a(list, f02, map);
        }
        // MONITOREXIT : object2
    }
}

