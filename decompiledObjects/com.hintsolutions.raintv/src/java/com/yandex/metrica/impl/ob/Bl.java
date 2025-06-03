/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  org.json.JSONArray
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.impl.ob.vk;
import java.util.List;
import org.json.JSONArray;

public class bl
implements vk {
    @NonNull
    private final List<el> a;

    public bl(@NonNull List<el> list) {
        this.a = list;
    }

    @Override
    @NonNull
    public Object a(@NonNull Qk qk2, @NonNull Uk uk2, @NonNull nk nk2, int n2) {
        JSONArray jSONArray = new JSONArray();
        if (this.a.isEmpty()) {
            return jSONArray;
        }
        for (el el2 : this.a) {
            int n3;
            block10: {
                int n5;
                el.b b2;
                block9: {
                    b2 = el2.a(nk2);
                    boolean bl2 = uk2.f;
                    n5 = 0;
                    if (bl2) break block9;
                    n3 = n5;
                    if (!el2.a()) break block10;
                }
                if (b2 != null && uk2.i) {
                    n3 = n5;
                } else {
                    el2 = el2.a(uk2, b2);
                    int n6 = el2.toString().getBytes().length + 1;
                    int n9 = jSONArray.length();
                    n3 = n5;
                    if (n2 + n6 <= uk2.n) {
                        n3 = n5;
                        if (n9 < uk2.m) {
                            jSONArray.put((Object)el2);
                            n3 = n6;
                        }
                    }
                }
            }
            n2 += n3;
        }
        return jSONArray;
    }
}

