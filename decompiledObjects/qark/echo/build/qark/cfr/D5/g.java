/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package D5;

import E5.c;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import java.util.HashMap;
import java.util.Map;
import w5.a;

public class g {
    public final k a;
    public Map b;
    public final k.c c;

    public g(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            @Override
            public void onMethodCall(j j8, k.d d8) {
                g.a(g.this);
            }
        };
        this.a = object = new k((c)object, "flutter/deferredcomponent", q.b);
        object.e(c8);
        t5.a.e().a();
        this.b = new HashMap();
    }

    public static /* synthetic */ x5.a a(g g8) {
        g8.getClass();
        return null;
    }

}

