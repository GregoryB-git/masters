package m7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r extends a implements s {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.s
    public final void y(Bundle bundle, u uVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10340b);
        int i10 = l.f10365a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(uVar);
        g(3, obtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.s
    public final void z1(Bundle bundle, t tVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10340b);
        int i10 = l.f10365a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(tVar);
        g(2, obtain);
    }
}
