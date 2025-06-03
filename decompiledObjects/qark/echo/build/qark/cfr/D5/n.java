/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package D5;

import E5.c;
import E5.g;
import E5.j;
import E5.k;
import E5.l;
import java.util.HashMap;
import t5.b;
import w5.a;

public class n {
    public final k a;
    public final k.c b;

    public n(a object) {
        k.c c8;
        this.b = c8 = new k.c(){

            @Override
            public void onMethodCall(j j8, k.d d8) {
                d8.a(null);
            }
        };
        this.a = object = new k((c)object, "flutter/navigation", g.a);
        object.e(c8);
    }

    public void a() {
        b.f("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }

    public void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to push route information '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        b.f("NavigationChannel", stringBuilder.toString());
        stringBuilder = new HashMap();
        stringBuilder.put((Object)"location", (Object)string2);
        this.a.c("pushRouteInformation", (Object)stringBuilder);
    }

    public void c(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to set initial route to '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        b.f("NavigationChannel", stringBuilder.toString());
        this.a.c("setInitialRoute", string2);
    }

}

