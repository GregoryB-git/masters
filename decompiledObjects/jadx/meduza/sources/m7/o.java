package m7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class o extends a implements p {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.p
    public final void J(Bundle bundle, q qVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10340b);
        int i10 = l.f10365a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(qVar);
        g(2, obtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.p
    public final void y(Bundle bundle, u uVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10340b);
        int i10 = l.f10365a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(uVar);
        g(6, obtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.p
    public final void z0(Bundle bundle, q qVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10340b);
        int i10 = l.f10365a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(qVar);
        g(3, obtain);
    }
}
