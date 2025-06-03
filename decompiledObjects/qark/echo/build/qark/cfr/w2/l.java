/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Queue
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package w2;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.Queue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w2.o;
import w2.q;
import w2.r;
import w2.t;
import w2.w;

public final class l
implements Runnable {
    public final /* synthetic */ q o;

    public /* synthetic */ l(q q8) {
        this.o = q8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        var1_1 = this.o;
        do lbl-1000: // 3 sources:
        {
            // MONITORENTER : var1_1
            if (var1_1.a != 2) {
                // MONITOREXIT : var1_1
                return;
            }
            if (var1_1.d.isEmpty()) {
                var1_1.f();
                // MONITOREXIT : var1_1
                return;
            }
            var2_2 = (t)var1_1.d.poll();
            var1_1.e.put(var2_2.a, (Object)var2_2);
            w.e(var1_1.f).schedule((Runnable)new o(var1_1, var2_2), 30L, TimeUnit.SECONDS);
            // MONITOREXIT : var1_1
            break;
        } while (true);
        catch (Throwable var2_4) {
            throw var2_4;
        }
        {
            if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
                var3_5 = String.valueOf((Object)var2_2);
                var4_6 = new StringBuilder(var3_5.length() + 8);
                var4_6.append("Sending ");
                var4_6.append(var3_5);
                Log.d((String)"MessengerIpcClient", (String)var4_6.toString());
            }
            var3_5 = w.a(var1_1.f);
            var5_7 = var1_1.b;
            var4_6 = Message.obtain();
            var4_6.what = var2_2.c;
            var4_6.arg1 = var2_2.a;
            var4_6.replyTo = var5_7;
            var5_7 = new Bundle();
            var5_7.putBoolean("oneWay", var2_2.b());
            var5_7.putString("pkg", var3_5.getPackageName());
            var5_7.putBundle("data", var2_2.d);
            var4_6.setData((Bundle)var5_7);
            try {
                var1_1.c.a(var4_6);
            }
            catch (RemoteException var2_3) {
                var1_1.a(2, var2_3.getMessage());
            }
            ** while (true)
        }
    }
}

