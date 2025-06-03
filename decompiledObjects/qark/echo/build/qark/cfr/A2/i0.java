/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 */
package A2;

import A2.e0;
import A2.g0;
import A2.h0;
import A2.j0;
import A2.n;
import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

public final class i0
implements Handler.Callback {
    public final /* synthetic */ j0 o;

    public /* synthetic */ i0(j0 j02, h0 h02) {
        this.o = j02;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message object) {
        int n8 = object.what;
        if (n8 != 0) {
            if (n8 != 1) {
                return false;
            }
            HashMap hashMap = j0.k(this.o);
            // MONITORENTER : hashMap
            e0 e02 = (e0)object.obj;
            g0 g02 = (g0)j0.k(this.o).get((Object)e02);
            if (g02 != null && g02.a() == 3) {
                Object object2 = String.valueOf((Object)e02);
                object = new StringBuilder();
                object.append("Timeout waiting for ServiceConnection callback ");
                object.append((String)object2);
                object2 = new Exception();
                Log.e((String)"GmsClientSupervisor", (String)object.toString(), (Throwable)object2);
                object = object2 = g02.b();
                if (object2 == null) {
                    object = e02.b();
                }
                object2 = object;
                if (object == null) {
                    object = e02.d();
                    n.i(object);
                    object2 = new ComponentName((String)object, "unknown");
                }
                g02.onServiceDisconnected((ComponentName)object2);
            }
            // MONITOREXIT : hashMap
            return true;
        }
        HashMap hashMap = j0.k(this.o);
        // MONITORENTER : hashMap
        object = (e0)object.obj;
        g0 g03 = (g0)j0.k(this.o).get(object);
        if (g03 != null && g03.i()) {
            if (g03.j()) {
                g03.g("GmsClientSupervisor");
            }
            j0.k(this.o).remove(object);
        }
        // MONITOREXIT : hashMap
        return true;
        catch (Throwable throwable) {
            throw throwable;
        }
    }
}

