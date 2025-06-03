// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Messenger;

public final class r
{
    public final Messenger a;
    public final h b;
    
    public r(final IBinder binder) {
        final String interfaceDescriptor = binder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(binder);
            this.b = null;
            return;
        }
        if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new h(binder);
            this.a = null;
            return;
        }
        final String value = String.valueOf(interfaceDescriptor);
        String concat;
        if (value.length() != 0) {
            concat = "Invalid interface descriptor: ".concat(value);
        }
        else {
            concat = new String("Invalid interface descriptor: ");
        }
        Log.w("MessengerIpcClient", concat);
        throw new RemoteException();
    }
    
    public final void a(final Message message) {
        final Messenger a = this.a;
        if (a != null) {
            a.send(message);
            return;
        }
        final h b = this.b;
        if (b != null) {
            b.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
