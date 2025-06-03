/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.Pair
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package com.google.firebase.iid;

import V2.b;
import V2.j;
import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import p4.r;

public class a {
    public final Executor a;
    public final Map b = new t.a();

    public a(Executor executor) {
        this.a = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j a(String string2, String object, a a8) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block6 : {
                    try {
                        string2 = new Pair((Object)string2, object);
                        object = (j)this.b.get((Object)string2);
                        if (object == null) break block5;
                        if (!Log.isLoggable((String)"FirebaseInstanceId", (int)3)) break block6;
                        string2 = String.valueOf((Object)string2);
                        a8 = new StringBuilder(string2.length() + 29);
                        a8.append("Joining ongoing request for: ");
                        a8.append(string2);
                        Log.d((String)"FirebaseInstanceId", (String)a8.toString());
                    }
                    catch (Throwable throwable2) {}
                }
                return object;
            }
            if (Log.isLoggable((String)"FirebaseInstanceId", (int)3)) {
                object = String.valueOf((Object)string2);
                StringBuilder stringBuilder = new StringBuilder(object.length() + 24);
                stringBuilder.append("Making new request for: ");
                stringBuilder.append((String)object);
                Log.d((String)"FirebaseInstanceId", (String)stringBuilder.toString());
            }
            object = a8.start().h(this.a, new r(this, (Pair)string2));
            this.b.put((Object)string2, object);
            return object;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ j b(Pair pair, j j8) {
        synchronized (this) {
            this.b.remove((Object)pair);
            return j8;
        }
    }

    public static interface a {
        public j start();
    }

}

