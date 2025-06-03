// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import android.window.BackEvent;
import E5.l;
import E5.c;
import E5.q;
import E5.j;
import w5.a;
import E5.k;

public class f
{
    public final k a;
    public final k.c b;
    
    public f(final a a) {
        final k.c b = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                d.a(null);
            }
        };
        this.b = b;
        (this.a = new k(a, "flutter/backgesture", q.b)).e((k.c)b);
    }
    
    public final Map a(final BackEvent backEvent) {
        final HashMap<String, List<Float>> hashMap = new HashMap<String, List<Float>>(3);
        final float a = D5.b.a(backEvent);
        final float a2 = D5.c.a(backEvent);
        List<Float> list;
        if (!Float.isNaN(a) && !Float.isNaN(a2)) {
            list = Arrays.asList(a, a2);
        }
        else {
            list = null;
        }
        hashMap.put("touchOffset", list);
        hashMap.put("progress", (List<Float>)d.a(backEvent));
        hashMap.put("swipeEdge", (List<Float>)e.a(backEvent));
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
    
    public void d(final BackEvent backEvent) {
        t5.b.f("BackGestureChannel", "Sending message to start back gesture");
        this.a.c("startBackGesture", this.a(backEvent));
    }
    
    public void e(final BackEvent backEvent) {
        t5.b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.a.c("updateBackGestureProgress", this.a(backEvent));
    }
}
