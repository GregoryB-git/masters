/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Locale
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicReference
 *  org.json.JSONObject
 */
package O3;

import H3.C;
import H3.D;
import H3.W;
import H3.x;
import H3.y;
import H3.z;
import O3.a;
import O3.b;
import O3.c;
import O3.d;
import O3.e;
import O3.g;
import O3.i;
import O3.j;
import O3.k;
import V2.m;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class f
implements i {
    public final Context a;
    public final j b;
    public final g c;
    public final x d;
    public final a e;
    public final k f;
    public final y g;
    public final AtomicReference h;
    public final AtomicReference i;

    public f(Context context, j j8, x x8, g g8, a a8, k k8, y y8) {
        AtomicReference atomicReference;
        this.h = atomicReference = new AtomicReference();
        this.i = new AtomicReference((Object)new V2.k());
        this.a = context;
        this.b = j8;
        this.d = x8;
        this.c = g8;
        this.e = a8;
        this.f = k8;
        this.g = y8;
        atomicReference.set((Object)b.b(x8));
    }

    public static f l(Context context, String string2, C c8, L3.b object, String string3, String string4, M3.g object2, y y8) {
        String string5 = c8.g();
        W w8 = new W();
        g g8 = new g(w8);
        object2 = new a((M3.g)object2);
        object = new c(String.format((Locale)Locale.US, (String)"https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", (Object[])new Object[]{string2}), (L3.b)object);
        return new f(context, new j(string2, c8.h(), c8.i(), c8.j(), c8, H3.i.h(H3.i.n(context), string2, string4, string3), string4, string3, z.c(string5).e()), w8, g8, (a)object2, (k)object, y8);
    }

    @Override
    public V2.j a() {
        return ((V2.k)this.i.get()).a();
    }

    @Override
    public d b() {
        return (d)this.h.get();
    }

    public boolean k() {
        return this.n().equals((Object)this.b.f) ^ true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d m(e object) {
        Object object2;
        block8 : {
            block5 : {
                Object var5_4;
                block6 : {
                    block7 : {
                        object2 = null;
                        var5_4 = null;
                        if (e.p.equals(object)) return object2;
                        JSONObject jSONObject = this.e.b();
                        if (jSONObject == null) break block5;
                        object2 = this.c.b(jSONObject);
                        if (object2 == null) break block6;
                        this.q(jSONObject, "Loaded cached settings: ");
                        long l8 = this.d.a();
                        if (e.q.equals(object) || !object2.a(l8)) break block7;
                        E3.f.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        E3.f.f().i("Returning cached settings.");
                        return object2;
                    }
                    catch (Exception exception) {
                        object = object2;
                        object2 = exception;
                    }
                    break block8;
                }
                try {
                    E3.f.f().e("Failed to parse cached settings data.", null);
                    return null;
                }
                catch (Exception exception) {
                    object = var5_4;
                }
                break block8;
            }
            E3.f.f().b("No cached settings data found.");
            return null;
        }
        E3.f.f().e("Failed to get cached settings", (Throwable)object2);
        return object;
    }

    public final String n() {
        return H3.i.r(this.a).getString("existing_instance_identifier", "");
    }

    public V2.j o(e object, Executor executor) {
        if (!this.k() && (object = this.m((e)((Object)object))) != null) {
            this.h.set(object);
            ((V2.k)this.i.get()).e(object);
            return m.e(null);
        }
        object = this.m(e.q);
        if (object != null) {
            this.h.set(object);
            ((V2.k)this.i.get()).e(object);
        }
        return this.g.k(executor).p(executor, new V2.i(){

            public V2.j b(Void object) {
                Object object2 = f.this.f.a(f.this.b, true);
                if (object2 != null) {
                    object = f.this.c.b((JSONObject)object2);
                    f.this.e.c(object.c, (JSONObject)object2);
                    f.this.q((JSONObject)object2, "Loaded settings: ");
                    object2 = f.this;
                    ((f)object2).r(f.c((f)object2).f);
                    f.this.h.set(object);
                    ((V2.k)f.this.i.get()).e(object);
                }
                return m.e(null);
            }
        });
    }

    public V2.j p(Executor executor) {
        return this.o(e.o, executor);
    }

    public final void q(JSONObject jSONObject, String string2) {
        E3.f f8 = E3.f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(jSONObject.toString());
        f8.b(stringBuilder.toString());
    }

    public final boolean r(String string2) {
        SharedPreferences.Editor editor = H3.i.r(this.a).edit();
        editor.putString("existing_instance_identifier", string2);
        editor.apply();
        return true;
    }

}

