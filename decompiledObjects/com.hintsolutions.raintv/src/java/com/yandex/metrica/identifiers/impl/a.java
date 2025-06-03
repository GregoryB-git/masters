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
import com.yandex.metrica.identifiers.impl.b;
import com.yandex.metrica.identifiers.impl.c;

class a
implements c {
    private IBinder a;

    public a(IBinder iBinder) {
        this.a = iBinder;
    }

    public IBinder asBinder() {
        return this.a;
    }

    @Override
    public String b() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.a.transact(1, parcel, parcel2, 0)) {
                int n4 = b.a;
            }
            parcel2.readException();
            String string = parcel2.readString();
            return string;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    @Override
    public boolean d() {
        boolean bl;
        Parcel parcel;
        Parcel parcel2;
        block4: {
            int n4;
            IBinder iBinder;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                parcel2.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                iBinder = this.a;
                bl = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            if (!iBinder.transact(2, parcel2, parcel, 0)) {
                n4 = b.a;
            }
            parcel.readException();
            n4 = parcel.readInt();
            if (n4 == 0) break block4;
            bl = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl;
    }
}

