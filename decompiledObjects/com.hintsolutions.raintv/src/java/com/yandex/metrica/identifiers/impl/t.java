/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;
import com.yandex.metrica.identifiers.impl.v;

class t
implements v {
    private IBinder a;

    public t(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public String a() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            String string = parcel2.readString();
            return string;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    @Override
    public boolean c() {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        block3: {
            IBinder iBinder;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                parcel2.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder = this.a;
                bl = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            iBinder.transact(2, parcel2, parcel, 0);
            parcel.readException();
            int n4 = parcel.readInt();
            if (n4 == 0) break block3;
            bl = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl;
    }
}

