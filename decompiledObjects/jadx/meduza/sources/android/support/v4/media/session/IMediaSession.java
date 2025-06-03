package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;

/* loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    public static abstract class Stub extends Binder implements IMediaSession {

        public static class a implements IMediaSession {

            /* renamed from: b, reason: collision with root package name */
            public static IMediaSession f464b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f465a;

            public a(IBinder iBinder) {
                this.f465a = iBinder;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void G(IMediaControllerCallback iMediaControllerCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (this.f465a.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().G(iMediaControllerCallback);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final MediaMetadataCompat H0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f465a.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().H0();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void J0(IMediaControllerCallback iMediaControllerCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    if (this.f465a.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().J0(iMediaControllerCallback);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f465a;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PlaybackStateCompat d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f465a.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().d();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PendingIntent d0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f465a.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().d0();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final List<MediaSessionCompat.QueueItem> o2() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f465a.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().o2();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean u1(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f465a.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().u1(keyEvent);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) ? new a(iBinder) : (IMediaSession) queryLocalInterface;
        }

        public static IMediaSession getDefaultImpl() {
            return a.f464b;
        }

        public static boolean setDefaultImpl(IMediaSession iMediaSession) {
            if (a.f464b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            a.f464b = iMediaSession;
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean u12 = u1(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(u12 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    G(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    J0(IMediaControllerCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean Z = Z();
                    parcel2.writeNoException();
                    parcel2.writeInt(Z ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String Q2 = Q2();
                    parcel2.writeNoException();
                    parcel2.writeString(Q2);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String p10 = p();
                    parcel2.writeNoException();
                    parcel2.writeString(p10);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent d02 = d0();
                    parcel2.writeNoException();
                    if (d02 != null) {
                        parcel2.writeInt(1);
                        d02.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long w10 = w();
                    parcel2.writeNoException();
                    parcel2.writeLong(w10);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo E2 = E2();
                    parcel2.writeNoException();
                    if (E2 != null) {
                        parcel2.writeInt(1);
                        E2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    parcel.readString();
                    y0(readInt, readInt2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    parcel.readString();
                    R0(readInt3, readInt4);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    F0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    x2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    V0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    B2(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    l();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    c1(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    N(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    O(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat H0 = H0();
                    parcel2.writeNoException();
                    if (H0 != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(H0.f455a);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat d10 = d();
                    parcel2.writeNoException();
                    if (d10 != null) {
                        parcel2.writeInt(1);
                        d10.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> o22 = o2();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(o22);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence C0 = C0();
                    parcel2.writeNoException();
                    if (C0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(C0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    i0();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    a();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    W2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    R(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int x10 = x();
                    parcel2.writeNoException();
                    parcel2.writeInt(x10);
                    return true;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    M();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    a0();
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b0(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    F1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b2(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean e22 = e2();
                    parcel2.writeNoException();
                    parcel2.writeInt(e22 ? 1 : 0);
                    return true;
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    J1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int a22 = a2();
                    parcel2.writeNoException();
                    parcel2.writeInt(a22);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    L2(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    r1(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle j10 = j();
                    parcel2.writeNoException();
                    if (j10 != null) {
                        parcel2.writeInt(1);
                        j10.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    C1(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void B2(long j10);

    CharSequence C0();

    void C1(RatingCompat ratingCompat, Bundle bundle);

    ParcelableVolumeInfo E2();

    void F0(Bundle bundle, String str);

    void F1(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void G(IMediaControllerCallback iMediaControllerCallback);

    MediaMetadataCompat H0();

    void J0(IMediaControllerCallback iMediaControllerCallback);

    void J1(boolean z10);

    void L2(int i10);

    void M();

    void N(RatingCompat ratingCompat);

    void O(Bundle bundle, String str);

    String Q2();

    void R(Uri uri, Bundle bundle);

    void R0(int i10, int i11);

    void V0(Uri uri, Bundle bundle);

    void W2(Bundle bundle, String str);

    void Y(MediaDescriptionCompat mediaDescriptionCompat);

    boolean Z();

    void a();

    void a0();

    int a2();

    void b();

    void b0(MediaDescriptionCompat mediaDescriptionCompat);

    void b2(int i10);

    void c1(long j10);

    PlaybackStateCompat d();

    PendingIntent d0();

    boolean e2();

    Bundle getExtras();

    void i0();

    Bundle j();

    void k2(Bundle bundle, String str);

    void l();

    void n2(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void next();

    List<MediaSessionCompat.QueueItem> o2();

    String p();

    void pause();

    void previous();

    void r1(float f);

    void stop();

    void u(int i10);

    boolean u1(KeyEvent keyEvent);

    void v();

    long w();

    int x();

    void x2(Bundle bundle, String str);

    void y0(int i10, int i11);
}
