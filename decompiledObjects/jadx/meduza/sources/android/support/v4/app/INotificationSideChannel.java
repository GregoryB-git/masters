package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {

    /* renamed from: m, reason: collision with root package name */
    public static final String f420m = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        public static class a implements INotificationSideChannel {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f421a;

            public a(IBinder iBinder) {
                this.f421a = iBinder;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void A0(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f420m);
                    obtain.writeString(str);
                    this.f421a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void M0(int i10, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f420m);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    this.f421a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void P2(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f420m);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f421a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f421a;
            }
        }

        public Stub() {
            attachInterface(this, INotificationSideChannel.f420m);
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.f420m);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) ? new a(iBinder) : (INotificationSideChannel) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = INotificationSideChannel.f420m;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                P2(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
            } else if (i10 == 2) {
                M0(parcel.readInt(), parcel.readString(), parcel.readString());
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                A0(parcel.readString());
            }
            return true;
        }
    }

    void A0(String str);

    void M0(int i10, String str, String str2);

    void P2(String str, int i10, String str2, Notification notification);
}
