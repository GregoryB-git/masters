// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import V2.b;
import p4.r;
import android.util.Log;
import android.util.Pair;
import V2.j;
import java.util.Map;
import java.util.concurrent.Executor;

public class a
{
    public final Executor a;
    public final Map b;
    
    public a(final Executor a) {
        this.b = new a();
        this.a = a;
    }
    
    public j a(String value, String value2, a a) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0188: {
            Label_0093: {
                try {
                    final Pair obj = new Pair((Object)value, (Object)value2);
                    value2 = (String)this.b.get(obj);
                    if (value2 == null) {
                        break Label_0093;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        value = String.valueOf(obj);
                        a = (a)new StringBuilder(value.length() + 29);
                        ((StringBuilder)a).append("Joining ongoing request for: ");
                        ((StringBuilder)a).append(value);
                        Log.d("FirebaseInstanceId", ((StringBuilder)a).toString());
                    }
                }
                finally {
                    break Label_0188;
                }
                return (j)value2;
            }
            final Throwable obj2;
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                value2 = String.valueOf(obj2);
                final StringBuilder sb = new StringBuilder(value2.length() + 24);
                sb.append("Making new request for: ");
                sb.append(value2);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            final j h = a.start().h(this.a, new r(this, (Pair)obj2));
            this.b.put(obj2, h);
            return h;
        }
    }
    // monitorexit(this)
    
    public interface a
    {
        j start();
    }
}
