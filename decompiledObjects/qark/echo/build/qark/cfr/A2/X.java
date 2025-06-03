/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Message
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.M;
import A2.c;
import A2.k;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;

public final class X
implements ServiceConnection {
    public final int a;
    public final /* synthetic */ c b;

    public X(c c8, int n8) {
        this.b = c8;
        this.a = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = this.b;
        if (iBinder == null) {
            c.d0((c)object, 16);
            return;
        }
        Object object2 = c.W((c)object);
        // MONITORENTER : object2
        c c8 = this.b;
        object = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        object = object != null && object instanceof k ? (k)object : new M(iBinder);
        c.a0(c8, (k)object);
        // MONITOREXIT : object2
        this.b.e0(0, null, this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        object = c.W(this.b);
        synchronized (object) {
            c.a0(this.b, null);
        }
        object = this.b.l;
        object.sendMessage(object.obtainMessage(6, this.a, 1));
    }
}

