/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 */
package L5;

import E5.k;
import L5.C;
import L5.x;
import L5.y;
import Q3.b;
import Q3.c;
import Q3.m;
import Q3.r;
import V2.j;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class D
implements r.b {
    public final k a;
    public final V2.k b;
    public final int c;

    public D(k k8, int n8) {
        this.a = k8;
        this.c = n8;
        this.b = new V2.k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public r.c a(m object) {
        Object object2 = new HashMap();
        Object object3 = new HashMap();
        object2.put((Object)"key", (Object)object.a());
        object2.put((Object)"value", object.c());
        object3.put((Object)"snapshot", object2);
        object3.put((Object)"transactionKey", (Object)this.c);
        try {
            object2 = new C(this.a).c((Map)object3);
            Objects.requireNonNull((Object)object2);
            object2 = (Map)object2;
            object3 = object2.get((Object)"aborted");
            Objects.requireNonNull((Object)object3);
            boolean bl = (Boolean)object3;
            object3 = object2.get((Object)"exception");
            Objects.requireNonNull((Object)object3);
            boolean bl2 = (Boolean)object3;
            if (bl) return r.a();
            if (bl2) return r.a();
            object.d(object2.get((Object)"value"));
            return r.b((m)object);
        }
        catch (Exception exception) {}
        Log.e((String)"firebase_database", (String)"An unexpected exception occurred for a transaction.", (Throwable)exception);
        return r.a();
    }

    @Override
    public void b(c object, boolean bl, b b8) {
        if (object != null) {
            this.b.b(y.a((c)object));
            return;
        }
        if (b8 != null) {
            object = new x(b8);
            b8 = new HashMap();
            b8.put((Object)"committed", (Object)bl);
            this.b.c((Object)object.b((Map)b8).a());
        }
    }

    public j c() {
        return this.b.a();
    }
}

