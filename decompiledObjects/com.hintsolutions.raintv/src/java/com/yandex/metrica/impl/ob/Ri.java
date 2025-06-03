/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.xf$e
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Hi;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.t9;
import com.yandex.metrica.impl.ob.xf;
import org.json.JSONArray;
import org.json.JSONObject;

public class ri {
    @NonNull
    private final t9 a;

    public ri() {
        this(new t9());
    }

    @VisibleForTesting
    public ri(@NonNull t9 t92) {
        this.a = t92;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(@NonNull Hi hi2, @NonNull Gl.a object) {
        if ((object = object.optJSONObject("diagnostics")) == null) return;
        JSONArray jSONArray = object.optJSONArray("functionalities");
        if (jSONArray == null) return;
        int n4 = 0;
        String string = null;
        ja ja2 = null;
        Object object2 = null;
        while (true) {
            void var9_11;
            Object object3;
            block7: {
                if (n4 >= jSONArray.length()) {
                    hi2.a(new ka((ja)((Object)string), ja2, (ja)object2));
                    return;
                }
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(n4);
                    object3 = jSONObject.getString("tag");
                    object = this.a;
                    xf.e e4 = new xf.e();
                    e4.a = jSONObject.getLong("expiration_timestamp");
                    e4.b = jSONObject.optInt("interval", e4.b);
                    object = ((t9)object).a(e4);
                    if ("activation".equals(object3)) {
                        object3 = object;
                        ja ja3 = ja2;
                        break block7;
                    }
                    if ("clids_info".equals(object3)) {
                        object3 = string;
                        Object object4 = object;
                        break block7;
                    }
                    boolean bl = "preload_info".equals(object3);
                    object3 = string;
                    ja ja4 = ja2;
                    if (bl) {
                        object2 = object;
                        ja ja5 = ja2;
                        object3 = string;
                    }
                }
                catch (Throwable throwable) {
                    object3 = string;
                    ja ja6 = ja2;
                }
            }
            ++n4;
            string = object3;
            ja2 = var9_11;
        }
    }
}

