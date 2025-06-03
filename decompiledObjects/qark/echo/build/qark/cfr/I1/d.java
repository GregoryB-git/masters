/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package I1;

import D1.a;
import I1.e;
import O1.P;
import O1.v;
import W5.m;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {
    public static final d a = new d();
    public static final String b = e.class.getSimpleName();

    public static final Bundle a(e.a a8, String string2, List list) {
        Throwable throwable2;
        block6 : {
            Bundle bundle;
            block4 : {
                block5 : {
                    if (T1.a.d(d.class)) {
                        return null;
                    }
                    try {
                        Intrinsics.checkNotNullParameter((Object)a8, "eventType");
                        Intrinsics.checkNotNullParameter(string2, "applicationId");
                        Intrinsics.checkNotNullParameter((Object)list, "appEvents");
                        bundle = new Bundle();
                        bundle.putString("event", a8.toString());
                        bundle.putString("app_id", string2);
                        if (e.a.q != a8) break block4;
                        a8 = a.b(list, string2);
                        if (a8.length() != 0) break block5;
                        return null;
                    }
                    catch (Throwable throwable2) {}
                }
                bundle.putString("custom_events", a8.toString());
                return bundle;
                break block6;
            }
            return bundle;
        }
        T1.a.b(throwable2, d.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONArray b(List list, String object) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            list = m.I((Collection)list);
            a.d(list);
            boolean bl = this.c((String)object);
            list = list.iterator();
            do {
                if (!list.hasNext()) {
                    return jSONArray;
                }
                object = (y1.e)list.next();
                if (object.g()) {
                    if (!(object.h() ^ true) && (!object.h() || !bl)) continue;
                    jSONArray.put((Object)object.e());
                    continue;
                }
                P p8 = P.a;
                P.j0(b, Intrinsics.i("Event with invalid checksum: ", object));
            } while (true);
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c(String object) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            object = v.q((String)object, false);
            if (object == null) return false;
        }
        catch (Throwable throwable) {}
        return object.n();
        T1.a.b(throwable, this);
        return false;
    }
}

