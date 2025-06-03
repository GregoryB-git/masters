package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import m6.o0;

/* loaded from: classes.dex */
public final class g implements IGmsServiceBroker {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f2849a;

    public g(IBinder iBinder) {
        this.f2849a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void D(m6.e eVar, b bVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
            if (bVar != null) {
                obtain.writeInt(1);
                o0.a(bVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2849a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2849a;
    }
}
