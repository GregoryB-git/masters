/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;

public interface IMetricaService
extends IInterface {
    public void a(int var1, Bundle var2) throws RemoteException;

    public void a(Bundle var1) throws RemoteException;

    public void b(Bundle var1) throws RemoteException;

    public void reportData(Bundle var1) throws RemoteException;

    public static abstract class com.yandex.metrica.IMetricaService$a
    extends Binder
    implements IMetricaService {
        public static final int a = 0;

        public com.yandex.metrica.IMetricaService$a() {
            this.attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        public static IMetricaService a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
            if (iInterface != null && iInterface instanceof IMetricaService) {
                return (IMetricaService)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n, Parcel parcel, Parcel object, int n2) throws RemoteException {
            if (n != 1598968902) {
                Object var9_5 = null;
                String string2 = null;
                String string3 = null;
                Object var5_8 = null;
                Object var8_9 = null;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    return super.onTransact(n, parcel, object, n2);
                                }
                                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                                n = parcel.readInt();
                                object = var8_9;
                                if (parcel.readInt() != 0) {
                                    object = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                                }
                                MetricaService.a().a(n, (Bundle)object);
                                return true;
                            }
                            parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                            object = var9_5;
                            if (parcel.readInt() != 0) {
                                object = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                            }
                            MetricaService.a().a((Bundle)object);
                            return true;
                        }
                        parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                        object = string2;
                        if (parcel.readInt() != 0) {
                            object = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                        }
                        MetricaService.a().b((Bundle)object);
                        return true;
                    }
                    parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                    object = string3;
                    if (parcel.readInt() != 0) {
                        object = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    MetricaService.a().reportData((Bundle)object);
                    return true;
                }
                parcel.enforceInterface("com.yandex.metrica.IMetricaService");
                string2 = parcel.readString();
                n = parcel.readInt();
                string3 = parcel.readString();
                object = var5_8;
                if (parcel.readInt() != 0) {
                    object = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                MetricaService.a().a(string2, n, string3, (Bundle)object);
                return true;
            }
            object.writeString("com.yandex.metrica.IMetricaService");
            return true;
        }

        public static class a
        implements IMetricaService {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override
            public void a(int n, Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcel.writeInt(n);
                    if (bundle != null) {
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    if (!this.a.transact(5, parcel, null, 1)) {
                        n = a;
                    }
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void a(Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcel.writeInt(1);
                    bundle.writeToParcel(parcel, 0);
                    if (!this.a.transact(4, parcel, null, 1)) {
                        int n = a;
                    }
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            @Override
            public void b(Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcel.writeInt(1);
                    bundle.writeToParcel(parcel, 0);
                    if (!this.a.transact(3, parcel, null, 1)) {
                        int n = a;
                    }
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void reportData(Bundle bundle) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    parcel.writeInt(1);
                    bundle.writeToParcel(parcel, 0);
                    if (!this.a.transact(2, parcel, null, 1)) {
                        int n = a;
                    }
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }
        }
    }
}

