// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public abstract class Y implements IInterface
{
    public final IBinder b;
    public final String c;
    
    public Y(final IBinder b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    public IBinder asBinder() {
        return this.b;
    }
    
    public final Parcel n() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
    
    public final Parcel o(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    public final void v(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
