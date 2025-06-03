package A2;

import A2.AbstractC0317c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import x2.C2188b;

/* loaded from: classes.dex */
public final class Y extends K {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f402h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC0317c abstractC0317c, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0317c, i7, bundle);
        this.f402h = abstractC0317c;
        this.f401g = iBinder;
    }

    @Override // A2.K
    public final void f(C2188b c2188b) {
        if (this.f402h.f434v != null) {
            this.f402h.f434v.o(c2188b);
        }
        this.f402h.L(c2188b);
    }

    @Override // A2.K
    public final boolean g() {
        String str;
        String interfaceDescriptor;
        AbstractC0317c.a aVar;
        AbstractC0317c.a aVar2;
        try {
            IBinder iBinder = this.f401g;
            AbstractC0328n.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f402h.E().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f402h.E() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface s7 = this.f402h.s(this.f401g);
        if (s7 == null || !(AbstractC0317c.g0(this.f402h, 2, 4, s7) || AbstractC0317c.g0(this.f402h, 3, 4, s7))) {
            return false;
        }
        this.f402h.f438z = null;
        Bundle x7 = this.f402h.x();
        AbstractC0317c abstractC0317c = this.f402h;
        aVar = abstractC0317c.f433u;
        if (aVar == null) {
            return true;
        }
        aVar2 = abstractC0317c.f433u;
        aVar2.v(x7);
        return true;
    }
}
