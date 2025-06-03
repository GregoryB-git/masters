/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import V2.b;
import V2.j;
import android.util.Log;
import com.google.firebase.messaging.V;
import java.util.Map;
import java.util.concurrent.Executor;

public class W {
    public final Executor a;
    public final Map b = new t.a();

    public W(Executor executor) {
        this.a = executor;
    }

    public static /* synthetic */ j a(W w8, String string2, j j8) {
        return w8.c(string2, j8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j b(String string2, a object) {
        synchronized (this) {
            j j8;
            Throwable throwable2;
            block5 : {
                block6 : {
                    try {
                        j8 = (j)this.b.get((Object)string2);
                        if (j8 == null) break block5;
                        if (!Log.isLoggable((String)"FirebaseMessaging", (int)3)) break block6;
                        object = new StringBuilder();
                        object.append("Joining ongoing request for: ");
                        object.append(string2);
                        Log.d((String)"FirebaseMessaging", (String)object.toString());
                    }
                    catch (Throwable throwable2) {}
                }
                return j8;
            }
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                j8 = new StringBuilder();
                j8.append("Making new request for: ");
                j8.append(string2);
                Log.d((String)"FirebaseMessaging", (String)j8.toString());
            }
            object = object.start().h(this.a, new V(this, string2));
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
    public final /* synthetic */ j c(String string2, j j8) {
        synchronized (this) {
            this.b.remove((Object)string2);
            return j8;
        }
    }

    public static interface a {
        public j start();
    }

}

