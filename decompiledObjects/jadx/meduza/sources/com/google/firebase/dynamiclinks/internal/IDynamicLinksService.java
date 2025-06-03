package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;

/* loaded from: classes.dex */
public interface IDynamicLinksService extends IInterface {

    public static abstract class Stub extends Binder implements IDynamicLinksService {

        public static class a implements IDynamicLinksService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f3119a;

            public a(IBinder iBinder) {
                this.f3119a = iBinder;
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public final void L(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongInterface(iDynamicLinksCallbacks);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3119a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.firebase.dynamiclinks.internal.IDynamicLinksService
            public final void R1(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongInterface(iDynamicLinksCallbacks);
                    obtain.writeString(str);
                    this.f3119a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3119a;
            }
        }

        public Stub() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        }

        public static IDynamicLinksService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicLinksService)) ? new a(iBinder) : (IDynamicLinksService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                return true;
            }
            if (i10 == 1) {
                R1(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                L(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void L(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle);

    void R1(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str);
}
