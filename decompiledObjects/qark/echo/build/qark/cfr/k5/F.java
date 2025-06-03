/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
package k5;

import A5.a;
import E5.c;
import E5.j;
import E5.k;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k5.E;

public class F
implements a,
k.c {
    public static Map c;
    public static List d;
    public k a;
    public E b;

    static {
        d = new ArrayList();
    }

    public final /* varargs */ void a(String string2, Object ... arrobject) {
        for (F f8 : d) {
            ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])arrobject));
            f8.a.c(string2, (Object)arrayList);
        }
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        k k8;
        c c8 = b8.b();
        this.a = k8 = new k(c8, "com.ryanheise.audio_session");
        k8.e(this);
        this.b = new E(b8.a(), c8);
        d.add((Object)this);
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.a.e(null);
        this.a = null;
        this.b.b();
        this.b = null;
        d.remove((Object)this);
    }

    @Override
    public void onMethodCall(j object, k.d d8) {
        List list = (List)object.b;
        object = object.a;
        object.hashCode();
        if (!object.equals((Object)"setConfiguration")) {
            if (!object.equals((Object)"getConfiguration")) {
                d8.c();
                return;
            }
            d8.a((Object)c);
            return;
        }
        c = (Map)list.get(0);
        d8.a(null);
        this.a("onConfigurationChanged", new Object[]{c});
    }
}

