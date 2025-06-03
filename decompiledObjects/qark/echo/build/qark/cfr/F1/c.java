/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  org.json.JSONArray
 */
package F1;

import O1.v;
import T1.a;
import V5.h;
import V5.i;
import W5.I;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import x1.B;

public final class c {
    public static final c a = new c();
    public static boolean b;
    public static final h c;
    public static HashSet d;

    static {
        c = i.a(.o);
    }

    public static final void b() {
        if (a.d(c.class)) {
            return;
        }
        try {
            b = true;
            a.d();
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, c.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(Bundle bundle) {
        if (a.d(c.class)) {
            return;
        }
        try {
            if (b && bundle != null && !bundle.isEmpty()) {
                if (d == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Set set = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue((Object)set, "parameters.keySet()");
                for (String string2 : set) {
                    HashSet hashSet = d;
                    Intrinsics.b((Object)hashSet);
                    if (hashSet.contains((Object)string2)) continue;
                    Intrinsics.checkNotNullExpressionValue(string2, "param");
                    arrayList.add((Object)string2);
                }
                arrayList = arrayList.iterator();
                while (arrayList.hasNext()) {
                    bundle.remove((String)arrayList.next());
                }
                bundle.putString("pm", "1");
            }
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final HashSet a(JSONArray jSONArray) {
        int n8;
        int n9;
        HashSet hashSet;
        block7 : {
            if (a.d(this)) {
                return null;
            }
            if (jSONArray == null) return null;
            if (jSONArray.length() != 0) break block7;
            return null;
        }
        try {
            hashSet = new HashSet();
            n9 = jSONArray.length();
            if (n9 <= 0) return hashSet;
            n8 = 0;
        }
        catch (Throwable throwable) {}
        do {
            int n10 = n8 + 1;
            String string2 = jSONArray.getString(n8);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
            hashSet.add((Object)string2);
            if (n10 >= n9) {
                return hashSet;
            }
            n8 = n10;
            continue;
            break;
        } while (true);
        a.b(throwable, this);
        return null;
    }

    public final HashSet c() {
        if (a.d(this)) {
            return null;
        }
        try {
            HashSet hashSet = (HashSet)c.getValue();
            return hashSet;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        if (a.d(this)) {
            return;
        }
        try {
            Object object = v.a;
            object = v.q(B.m(), false);
            if (object == null) {
                return;
            }
            HashSet hashSet = this.a(object.g());
            object = hashSet;
            if (hashSet == null) {
                object = this.c();
            }
            d = object;
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }

}

