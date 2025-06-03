/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.el
 *  com.yandex.metrica.impl.ob.el$b
 *  com.yandex.metrica.impl.ob.nk
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.nk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Ck {
    @NonNull
    private final List<Ck> a = new ArrayList();
    @NonNull
    private final el b;

    public Ck(@NonNull el el2) {
        this.b = el2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public a a(@NonNull Uk object, @NonNull nk nk2, int n2, int n3) {
        void var13_23;
        int n4;
        int n5;
        JSONObject jSONObject;
        int n6;
        int n7;
        int n8;
        int n9;
        block29: {
            el.b b2;
            JSONObject jSONObject2;
            block28: {
                block27: {
                    jSONObject2 = new JSONObject();
                    n9 = n3 + 1;
                    JSONObject jSONObject3 = jSONObject2;
                    b2 = this.b.a(nk2);
                    JSONObject jSONObject4 = jSONObject2;
                    boolean bl = ((Uk)object).f;
                    n8 = 1;
                    if (bl) break block27;
                    JSONObject jSONObject5 = jSONObject2;
                    if (this.b.a()) break block27;
                    n7 = 0;
                    break block28;
                }
                n7 = 1;
            }
            n6 = n8;
            if (b2 != null) {
                JSONObject jSONObject6 = jSONObject2;
                n6 = !((Uk)object).i ? n8 : 0;
            }
            jSONObject = jSONObject2;
            if (n7 != 0) {
                jSONObject = jSONObject2;
                if (n6 != 0) {
                    JSONObject jSONObject7 = jSONObject2;
                    jSONObject = this.b.a((Uk)object, b2);
                }
            }
            JSONObject jSONObject8 = jSONObject;
            n7 = jSONObject.toString().getBytes().length;
            n6 = n7 + n2;
            n8 = n9;
            n7 = n6;
            n8 = n9;
            n7 = n6;
            jSONObject2 = new JSONArray();
            n8 = n9;
            n7 = n6;
            jSONObject.put("ch", (Object)jSONObject2);
            n8 = n9;
            n7 = n6 += 8;
            if (n6 > ((Uk)object).n) break block29;
            n8 = n9;
            n7 = n6;
            if (n9 > ((Uk)object).m) break block29;
            n8 = n9;
            n7 = n6;
            b2 = this.a.iterator();
            while (true) {
                a a2;
                block30: {
                    JSONObject jSONObject9 = jSONObject;
                    n5 = n9;
                    n4 = n6;
                    n8 = n9;
                    n7 = n6;
                    if (!b2.hasNext()) return new a(n4 - n2, n5 - n3, (JSONObject)var13_23);
                    n8 = n9;
                    n7 = n6;
                    a2 = ((Ck)b2.next()).a((Uk)object, nk2, n6 + 1, n9);
                    n8 = n9;
                    n7 = n6;
                    JSONObject jSONObject10 = a2.c;
                    if (jSONObject10 == null) break block30;
                    n8 = n9;
                    n7 = n6;
                    jSONObject2.put((Object)jSONObject10);
                }
                n8 = n9;
                n7 = n6;
                n4 = a2.a;
                if (n4 == 0) {
                    JSONObject jSONObject11 = jSONObject;
                    n5 = n9;
                    n4 = n6;
                    return new a(n4 - n2, n5 - n3, (JSONObject)var13_23);
                }
                n8 = n9;
                n7 = n6;
                n9 += a2.b;
                n6 += n4;
                continue;
                break;
            }
        }
        n8 = n9;
        n7 = n6;
        try {
            return new a(0, 0, null);
        }
        catch (Throwable throwable) {
            JSONObject jSONObject12 = jSONObject;
            n5 = n8;
            n4 = n7;
            return new a(n4 - n2, n5 - n3, (JSONObject)var13_23);
        }
        catch (Throwable throwable) {
            n4 = n2;
            n5 = n9;
        }
        return new a(n4 - n2, n5 - n3, (JSONObject)var13_23);
    }

    @NonNull
    public el a() {
        return this.b;
    }

    public void a(@NonNull Ck ck) {
        this.a.add((Object)ck);
    }

    public static class a {
        public final int a;
        public final int b;
        @Nullable
        public final JSONObject c;

        public a(int n2, int n3, @Nullable JSONObject jSONObject) {
            this.a = n2;
            this.b = n3;
            this.c = jSONObject;
        }
    }
}

