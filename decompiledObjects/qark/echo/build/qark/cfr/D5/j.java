/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package D5;

import E5.c;
import E5.k;
import E5.l;
import E5.q;
import java.util.HashMap;
import java.util.Map;

public class j {
    public final k a;
    public b b;
    public final k.c c;

    public j(c object) {
        k.c c8;
        this.c = c8 = new k.c(){
            public Map a;
            {
                this.a = new HashMap();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void onMethodCall(E5.j object, k.d d8) {
                if (j.this.b != null) {
                    object = object.a;
                    object.hashCode();
                    if (!object.equals((Object)"getKeyboardState")) {
                        d8.c();
                        return;
                    }
                    try {
                        this.a = j.this.b.a();
                    }
                    catch (IllegalStateException illegalStateException) {
                        d8.b("error", illegalStateException.getMessage(), null);
                    }
                }
                d8.a((Object)this.a);
            }
        };
        this.a = object = new k((c)object, "flutter/keyboard", q.b);
        object.e(c8);
    }

    public void b(b b8) {
        this.b = b8;
    }

    public static interface b {
        public Map a();
    }

}

