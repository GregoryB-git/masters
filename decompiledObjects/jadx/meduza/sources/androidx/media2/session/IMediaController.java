package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public interface IMediaController extends IInterface {

    public static abstract class Stub extends Binder implements IMediaController {

        public static class a implements IMediaController {

            /* renamed from: b, reason: collision with root package name */
            public static IMediaController f1080b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1081a;

            public a(IBinder iBinder) {
                this.f1081a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1081a;
            }
        }

        public Stub() {
            attachInterface(this, "androidx.media2.session.IMediaController");
        }

        public static IMediaController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaController");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaController)) ? new a(iBinder) : (IMediaController) queryLocalInterface;
        }

        public static IMediaController getDefaultImpl() {
            return a.f1080b;
        }

        public static boolean setDefaultImpl(IMediaController iMediaController) {
            if (a.f1080b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaController == null) {
                return false;
            }
            a.f1080b = iMediaController;
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.media2.session.IMediaController");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    O0();
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readLong();
                    parcel.readLong();
                    parcel.readInt();
                    o();
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readLong();
                    parcel.readLong();
                    parcel.readFloat();
                    G2();
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    parcel.readLong();
                    parcel.readLong();
                    parcel.readLong();
                    S();
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImplListSlice.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    f();
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    U0();
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    f0();
                    return true;
                case 8:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    c();
                    return true;
                case 9:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    h();
                    return true;
                case 10:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    C2();
                    return true;
                case 11:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readLong();
                    parcel.readLong();
                    parcel.readLong();
                    t2();
                    return true;
                case 12:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    s();
                    return true;
                case 13:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    X1();
                    return true;
                case 14:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.createTypedArrayList(ParcelImpl.CREATOR);
                    F2();
                    return true;
                case 15:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    r0();
                    return true;
                case 16:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                    }
                    e();
                    return true;
                case 17:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    P();
                    return true;
                case 18:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    Z2();
                    return true;
                case 19:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readString();
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    Z0();
                    return true;
                case 20:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    parcel.readString();
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    y2();
                    return true;
                case 21:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    z();
                    return true;
                case 22:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    Parcelable.Creator<ParcelImpl> creator = ParcelImpl.CREATOR;
                    parcel.createTypedArrayList(creator);
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    p1();
                    return true;
                case 23:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    s0();
                    return true;
                case 24:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    v0();
                    return true;
                case 25:
                    parcel.enforceInterface("androidx.media2.session.IMediaController");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    Q0();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void C2();

    void F2();

    void G2();

    void O0();

    void P();

    void Q0();

    void S();

    void U0();

    void X1();

    void Z0();

    void Z2();

    void c();

    void e();

    void f();

    void f0();

    void h();

    void o();

    void p1();

    void r0();

    void s();

    void s0();

    void t2();

    void v0();

    void y2();

    void z();
}
