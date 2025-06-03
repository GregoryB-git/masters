package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class Y implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f10715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10716c;

    public Y(IBinder iBinder, String str) {
        this.f10715b = iBinder;
        this.f10716c = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f10715b;
    }

    public final Parcel n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10716c);
        return obtain;
    }

    public final Parcel o(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10715b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void v(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10715b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
