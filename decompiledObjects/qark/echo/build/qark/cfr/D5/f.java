/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package D5;

import D5.b;
import D5.c;
import D5.d;
import D5.e;
import E5.j;
import E5.k;
import E5.l;
import E5.q;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w5.a;

public class f {
    public final k a;
    public final k.c b;

    public f(a object) {
        k.c c8;
        this.b = c8 = new k.c(){

            @Override
            public void onMethodCall(j j8, k.d d8) {
                d8.a(null);
            }
        };
        this.a = object = new k((E5.c)object, "flutter/backgesture", q.b);
        object.e(c8);
    }

    public final Map a(BackEvent backEvent) {
        HashMap hashMap = new HashMap(3);
        float f8 = b.a(backEvent);
        float f9 = c.a(backEvent);
        List list = !Float.isNaN((float)f8) && !Float.isNaN((float)f9) ? Arrays.asList((Object[])new Float[]{Float.valueOf((float)f8), Float.valueOf((float)f9)}) : null;
        hashMap.put((Object)"touchOffset", (Object)list);
        hashMap.put((Object)"progress", (Object)Float.valueOf((float)d.a(backEvent)));
        hashMap.put((Object)"swipeEdge", (Object)e.a(backEvent));
        return hashMap;
    }

    public void b() {
        t5.b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.a.c("cancelBackGesture", null);
    }

    public void c() {
        t5.b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        t5.b.f("BackGestureChannel", "Sending message to start back gesture");
        this.a.c("startBackGesture", (Object)this.a(backEvent));
    }

    public void e(BackEvent backEvent) {
        t5.b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.a.c("updateBackGestureProgress", (Object)this.a(backEvent));
    }

}

