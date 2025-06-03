package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import w8.d;

/* loaded from: classes.dex */
public interface IDynamicLinksCallbacks extends IInterface {

    public static abstract class Stub extends Binder implements IDynamicLinksCallbacks {

        public static class a implements IDynamicLinksCallbacks {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f3118a;

            public a(IBinder iBinder) {
                this.f3118a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3118a;
            }
        }

        public Stub() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        public static IDynamicLinksCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicLinksCallbacks)) ? new a(iBinder) : (IDynamicLinksCallbacks) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                return true;
            }
            if (i10 == 1) {
                m2((Status) a.a(parcel, Status.CREATOR), (w8.a) a.a(parcel, w8.a.CREATOR));
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                K0((Status) a.a(parcel, Status.CREATOR), (d) a.a(parcel, d.CREATOR));
            }
            return true;
        }
    }

    public static class a {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void K0(Status status, d dVar);

    void m2(Status status, w8.a aVar);
}
