package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: w2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096r {

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f20361a;

    /* renamed from: b, reason: collision with root package name */
    public final C2086h f20362b;

    public C2096r(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f20361a = new Messenger(iBinder);
            this.f20362b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f20362b = new C2086h(iBinder);
            this.f20361a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public final void a(Message message) {
        Messenger messenger = this.f20361a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C2086h c2086h = this.f20362b;
        if (c2086h == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c2086h.b(message);
    }
}
