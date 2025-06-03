// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import V2.b;
import android.util.Log;
import V2.j;
import t.a;
import java.util.Map;
import java.util.concurrent.Executor;

public class W
{
    public final Executor a;
    public final Map b;
    
    public W(final Executor a) {
        this.b = new t.a();
        this.a = a;
    }
    
    public j b(final String str, a a) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0150: {
            Label_0071: {
                j j;
                try {
                    j = this.b.get(str);
                    if (j == null) {
                        break Label_0071;
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        a = (a)new StringBuilder();
                        ((StringBuilder)a).append("Joining ongoing request for: ");
                        ((StringBuilder)a).append(str);
                        Log.d("FirebaseMessaging", ((StringBuilder)a).toString());
                    }
                }
                finally {
                    break Label_0150;
                }
                return j;
            }
            final String str2;
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Making new request for: ");
                sb.append(str2);
                Log.d("FirebaseMessaging", sb.toString());
            }
            final j h = a.start().h(this.a, new V(this, str2));
            this.b.put(str2, h);
            return h;
        }
    }
    // monitorexit(this)
    
    public interface a
    {
        j start();
    }
}
