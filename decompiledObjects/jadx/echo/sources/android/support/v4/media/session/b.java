package android.support.v4.media.session;

import N4.h;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.appsflyer.attribution.RequestError;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C0148a implements b {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f8286b;

            public C0148a(IBinder iBinder) {
                this.f8286b = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void A(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface(aVar);
                    this.f8286b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent T() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f8286b.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PendingIntent) C0149b.d(obtain2, PendingIntent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean Y0(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    C0149b.f(obtain, keyEvent, 0);
                    this.f8286b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8286b;
            }

            @Override // android.support.v4.media.session.b
            public void u0(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface(aVar);
                    this.f8286b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0148a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String N02;
            Parcelable T6;
            int i9;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i7) {
                case 1:
                    j0(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR), (MediaSessionCompat.ResultReceiverWrapper) C0149b.d(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    i9 = Y0((KeyEvent) C0149b.d(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 3:
                    A(a.AbstractBinderC0146a.n(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    u0(a.AbstractBinderC0146a.n(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    i9 = R();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 6:
                    N02 = N0();
                    parcel2.writeNoException();
                    parcel2.writeString(N02);
                    return true;
                case 7:
                    N02 = e();
                    parcel2.writeNoException();
                    parcel2.writeString(N02);
                    return true;
                case 8:
                    T6 = T();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 9:
                    long w02 = w0();
                    parcel2.writeNoException();
                    parcel2.writeLong(w02);
                    return true;
                case 10:
                    T6 = C0();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 11:
                    z(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    J(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    p();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    v0(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    A0(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    G0((Uri) C0149b.d(parcel, Uri.CREATOR), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    y0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    j();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    E0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    o0();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    H0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    I((RatingCompat) C0149b.d(parcel, RatingCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    y(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    T6 = r0();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 28:
                    T6 = f();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 29:
                    List k02 = k0();
                    parcel2.writeNoException();
                    C0149b.e(parcel2, k02, 1);
                    return true;
                case 30:
                    CharSequence p02 = p0();
                    parcel2.writeNoException();
                    if (p02 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(p02, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    T6 = r();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 32:
                    i9 = X();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 33:
                    g();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    s0(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    Y(parcel.readString(), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    M((Uri) C0149b.d(parcel, Uri.CREATOR), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    i9 = q();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 38:
                    i9 = H();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 39:
                    i(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    z0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case RequestError.NO_DEV_KEY /* 41 */:
                    S((MediaDescriptionCompat) C0149b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    D((MediaDescriptionCompat) C0149b.d(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    Q((MediaDescriptionCompat) C0149b.d(parcel, MediaDescriptionCompat.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    V(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    i9 = b0();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 46:
                    k(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    i9 = U();
                    parcel2.writeNoException();
                    parcel2.writeInt(i9);
                    return true;
                case 48:
                    s(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    u(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    T6 = t0();
                    parcel2.writeNoException();
                    C0149b.f(parcel2, T6, 1);
                    return true;
                case 51:
                    B((RatingCompat) C0149b.d(parcel, RatingCompat.CREATOR), (Bundle) C0149b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.b$b, reason: collision with other inner class name */
    public static class C0149b {
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int i7) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i8 = 0; i8 < size; i8++) {
                f(parcel, (Parcelable) list.get(i8), i7);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    void A(android.support.v4.media.session.a aVar);

    void A0(String str, Bundle bundle);

    void B(RatingCompat ratingCompat, Bundle bundle);

    ParcelableVolumeInfo C0();

    void D(MediaDescriptionCompat mediaDescriptionCompat, int i7);

    void E0();

    void G0(Uri uri, Bundle bundle);

    boolean H();

    void H0(long j7);

    void I(RatingCompat ratingCompat);

    void J(int i7, int i8, String str);

    void M(Uri uri, Bundle bundle);

    String N0();

    void Q(MediaDescriptionCompat mediaDescriptionCompat);

    boolean R();

    void S(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent T();

    int U();

    void V(int i7);

    int X();

    void Y(String str, Bundle bundle);

    boolean Y0(KeyEvent keyEvent);

    boolean b0();

    String e();

    PlaybackStateCompat f();

    void g();

    void i(int i7);

    void j();

    void j0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void k(boolean z7);

    List k0();

    void next();

    void o0();

    void p();

    CharSequence p0();

    void previous();

    int q();

    Bundle r();

    MediaMetadataCompat r0();

    void s(int i7);

    void s0(String str, Bundle bundle);

    void stop();

    Bundle t0();

    void u(float f7);

    void u0(android.support.v4.media.session.a aVar);

    void v0(String str, Bundle bundle);

    long w0();

    void y(String str, Bundle bundle);

    void y0(long j7);

    void z(int i7, int i8, String str);

    void z0(boolean z7);
}
