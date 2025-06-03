/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import w2.h;

public final class r {
    public final Messenger a;
    public final h b;

    public r(IBinder object) {
        String string2 = object.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals((Object)string2)) {
            this.a = new Messenger((IBinder)object);
            this.b = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals((Object)string2)) {
            this.b = new h((IBinder)object);
            this.a = null;
            return;
        }
        object = String.valueOf((Object)string2);
        object = object.length() != 0 ? "Invalid interface descriptor: ".concat((String)object) : new String("Invalid interface descriptor: ");
        Log.w((String)"MessengerIpcClient", (String)object);
        throw new RemoteException();
    }

    public final void a(Message message) {
        Object object = this.a;
        if (object != null) {
            object.send(message);
            return;
        }
        object = this.b;
        if (object != null) {
            object.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}

