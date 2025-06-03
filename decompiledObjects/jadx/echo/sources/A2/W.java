package A2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class W extends L {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0317c f397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398c;

    public W(AbstractC0317c abstractC0317c, int i7) {
        this.f397b = abstractC0317c;
        this.f398c = i7;
    }

    @Override // A2.InterfaceC0324j
    public final void F0(int i7, IBinder iBinder, a0 a0Var) {
        AbstractC0317c abstractC0317c = this.f397b;
        AbstractC0328n.j(abstractC0317c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC0328n.i(a0Var);
        AbstractC0317c.c0(abstractC0317c, a0Var);
        W0(i7, iBinder, a0Var.f404o);
    }

    @Override // A2.InterfaceC0324j
    public final void W0(int i7, IBinder iBinder, Bundle bundle) {
        AbstractC0328n.j(this.f397b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f397b.N(i7, iBinder, bundle, this.f398c);
        this.f397b = null;
    }

    @Override // A2.InterfaceC0324j
    public final void q0(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
