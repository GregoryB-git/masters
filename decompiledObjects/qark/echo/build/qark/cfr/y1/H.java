/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package y1;

import G1.h;
import O1.P;
import V5.t;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.F;
import y1.e;

public final class H {
    public static final a f = new a(null);
    public static final String g = H.class.getSimpleName();
    public static final int h = 1000;
    public final O1.a a;
    public final String b;
    public List c;
    public final List d;
    public int e;

    public H(O1.a a8, String string2) {
        Intrinsics.checkNotNullParameter(a8, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(string2, "anonymousAppDeviceGUID");
        this.a = a8;
        this.b = string2;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(e e8) {
        synchronized (this) {
            boolean bl = T1.a.d(this);
            if (bl) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(e8, "event");
                if (this.c.size() + this.d.size() >= h) {
                    ++this.e;
                } else {
                    this.c.add((Object)e8);
                }
                return;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(boolean var1_1) {
        // MONITORENTER : this
        var2_2 = T1.a.d(this);
        if (var2_2) {
            // MONITOREXIT : this
            return;
        }
        if (!var1_1) ** GOTO lbl9
        try {
            this.c.addAll((Collection)this.d);
lbl9: // 2 sources:
            this.d.clear();
            this.e = 0;
            // MONITOREXIT : this
            return;
        }
        catch (Throwable var3_3) {}
        T1.a.b(var3_3, this);
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        synchronized (this) {
            boolean bl = T1.a.d(this);
            if (bl) {
                return 0;
            }
            try {
                return this.c.size();
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, this);
                return 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List d() {
        synchronized (this) {
            boolean bl = T1.a.d(this);
            if (bl) {
                return null;
            }
            try {
                List list = this.c;
                this.c = new ArrayList();
                return list;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, this);
                return null;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int e(F var1_1, Context var2_4, boolean var3_5, boolean var4_6) {
        block12 : {
            block11 : {
                if (T1.a.d(this)) {
                    return 0;
                }
                Intrinsics.checkNotNullParameter(var1_1, "request");
                Intrinsics.checkNotNullParameter((Object)var2_4, "applicationContext");
                // MONITORENTER : this
                var5_7 = this.e;
                var7_8 = D1.a.a;
                D1.a.d(this.c);
                this.d.addAll((Collection)this.c);
                this.c.clear();
                var7_8 = new JSONArray();
                for (e var9_10 : this.d) {
                    if (var9_10.g()) {
                        if (!var3_5 && var9_10.h()) continue;
                        var7_8.put((Object)var9_10.e());
                        continue;
                    }
                    var10_11 = P.a;
                    P.j0(H.g, Intrinsics.i("Event with invalid checksum: ", var9_10));
                }
                var6_12 = var7_8.length();
                ** if (var6_12 != 0) goto lbl-1000
lbl-1000: // 1 sources:
                {
                    // MONITOREXIT : this
                    return 0;
                }
lbl-1000: // 1 sources:
                {
                    break block11;
                }
                catch (Throwable var1_2) {}
                break block12;
            }
            var8_9 = t.a;
            // MONITOREXIT : this
            this.f(var1_1, var2_4, var5_7, (JSONArray)var7_8, var4_6);
            return var7_8.length();
        }
        T1.a.b(var1_2, this);
        return 0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void f(F f8, Context object, int n8, JSONArray object2, boolean bl) {
        block6 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                h h8 = h.a;
                h8 = h.a(h.a.p, this.a, this.b, bl, (Context)object);
                object = h8;
                if (this.e > 0) {
                    h8.put("num_skipped_events", n8);
                    object = h8;
                }
                break block6;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return;
            catch (JSONException jSONException) {}
            object = new JSONObject();
        }
        f8.E((JSONObject)object);
        object = f8.u();
        object2 = object2.toString();
        Intrinsics.checkNotNullExpressionValue(object2, "events.toString()");
        object.putString("custom_events", (String)object2);
        f8.H(object2);
        f8.G((Bundle)object);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

