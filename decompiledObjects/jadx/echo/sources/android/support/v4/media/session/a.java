package android.support.v4.media.session;

import N4.h;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0146a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C0147a implements a {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f8285b;

            public C0147a(IBinder iBinder) {
                this.f8285b = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void C() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f8285b.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void E(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(obtain, mediaMetadataCompat, 0);
                    this.f8285b.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void J0(boolean z7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z7 ? 1 : 0);
                    this.f8285b.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void Q0(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(obtain, playbackStateCompat, 0);
                    this.f8285b.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void X0(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(obtain, parcelableVolumeInfo, 0);
                    this.f8285b.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8285b;
            }

            @Override // android.support.v4.media.session.a
            public void d0(int i7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i7);
                    this.f8285b.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void l0(List list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.e(obtain, list, 0);
                    this.f8285b.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void m(int i7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i7);
                    this.f8285b.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0146a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0147a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i7) {
                case 1:
                    t(parcel.readString(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    C();
                    return true;
                case 3:
                    Q0((PlaybackStateCompat) b.d(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    E((MediaMetadataCompat) b.d(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    l0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    x((CharSequence) b.d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    g0((Bundle) b.d(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    X0((ParcelableVolumeInfo) b.d(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    m(parcel.readInt());
                    return true;
                case 10:
                    w(parcel.readInt() != 0);
                    return true;
                case 11:
                    J0(parcel.readInt() != 0);
                    return true;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    d0(parcel.readInt());
                    return true;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    f0();
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }
    }

    public static class b {
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

    void C();

    void E(MediaMetadataCompat mediaMetadataCompat);

    void J0(boolean z7);

    void Q0(PlaybackStateCompat playbackStateCompat);

    void X0(ParcelableVolumeInfo parcelableVolumeInfo);

    void d0(int i7);

    void f0();

    void g0(Bundle bundle);

    void l0(List list);

    void m(int i7);

    void t(String str, Bundle bundle);

    void w(boolean z7);

    void x(CharSequence charSequence);
}
