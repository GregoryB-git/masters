/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package L5;

import E5.k;
import L5.B;
import L5.y;
import V2.j;
import V2.m;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public class C {
    public final V2.k a = new V2.k();
    public final k b;

    public C(k k8) {
        this.b = k8;
    }

    public static /* synthetic */ void a(C c8, Map map) {
        c8.d(map);
    }

    public Object c(Map map) {
        new Handler(Looper.getMainLooper()).post((Runnable)new B(this, map));
        return m.a(this.a.a());
    }

    public final /* synthetic */ void d(Map map) {
        this.b.d("FirebaseDatabase#callTransactionHandler", (Object)map, new k.d(){

            @Override
            public void a(Object object) {
                C.this.a.c(object);
            }

            @Override
            public void b(String object, String string2, Object object2) {
                HashMap hashMap = new HashMap();
                String string3 = string2;
                if (string2 == null) {
                    string3 = "An unknown error occurred";
                }
                string2 = hashMap;
                if (object2 instanceof Map) {
                    string2 = (Map)object2;
                }
                object = new y((String)object, string3, (Map)string2);
                C.this.a.b((Exception)object);
            }

            @Override
            public void c() {
            }
        });
    }

}

