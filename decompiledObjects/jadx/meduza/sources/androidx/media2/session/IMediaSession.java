package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media2.session.IMediaController;
import androidx.versionedparcelable.ParcelImpl;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    public static abstract class Stub extends Binder implements IMediaSession {

        public static class a implements IMediaSession {

            /* renamed from: b, reason: collision with root package name */
            public static IMediaSession f1082b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1083a;

            public a(IBinder iBinder) {
                this.f1083a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1083a;
            }
        }

        public Stub() {
            attachInterface(this, "androidx.media2.session.IMediaSession");
        }

        public static IMediaSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) ? new a(iBinder) : (IMediaSession) queryLocalInterface;
        }

        public static IMediaSession getDefaultImpl() {
            return a.f1082b;
        }

        public static boolean setDefaultImpl(IMediaSession iMediaSession) {
            if (a.f1082b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSession == null) {
                return false;
            }
            a.f1082b = iMediaSession;
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.media2.session.IMediaSession");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    n();
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    release();
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    S1();
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    q1();
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    b();
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    pause();
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    a();
                    return true;
                case 8:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    l();
                    return true;
                case 9:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    v();
                    return true;
                case 10:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    l0();
                    return true;
                case 11:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    Y0();
                    return true;
                case 12:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    parcel.readLong();
                    w2();
                    return true;
                case 13:
                    parcel.enforceInterface("androidx.media2.session.IMediaSession");
                    IMediaController.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                        ParcelImpl.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                    }
                    e();
                    return true;
                default:
                    switch (i10) {
                        case 20:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            S2();
                            return true;
                        case 21:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readFloat();
                            X();
                            return true;
                        case 22:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.createStringArrayList();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            D0();
                            return true;
                        case 23:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            j2();
                            return true;
                        case 24:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            p2();
                            return true;
                        case 25:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            b3();
                            return true;
                        case 26:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            m1();
                            return true;
                        case 27:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            v2();
                            return true;
                        case 28:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            A2();
                            return true;
                        case 29:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            e1();
                            return true;
                        case 30:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            A();
                            return true;
                        case 31:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            i1();
                            return true;
                        case 32:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            S0();
                            return true;
                        case 33:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            e0();
                            return true;
                        case 34:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            t1();
                            return true;
                        case 35:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            getItem();
                            return true;
                        case 36:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            parcel.readInt();
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            getChildren();
                            return true;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            u0();
                            return true;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            parcel.readInt();
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            k1();
                            return true;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            n0();
                            return true;
                        case 40:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readString();
                            L0();
                            return true;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                            }
                            l2();
                            return true;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            H();
                            return true;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                                ParcelImpl.CREATOR.createFromParcel(parcel);
                            }
                            a1();
                            return true;
                        case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            I0();
                            return true;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            parcel.enforceInterface("androidx.media2.session.IMediaSession");
                            IMediaController.Stub.asInterface(parcel.readStrongBinder());
                            parcel.readInt();
                            if (parcel.readInt() != 0) {
                            }
                            if (parcel.readInt() != 0) {
                            }
                            x1();
                            return true;
                        default:
                            return super.onTransact(i10, parcel, parcel2, i11);
                    }
            }
        }
    }

    void A();

    void A2();

    void D0();

    void H();

    void I0();

    void L0();

    void S0();

    void S1();

    void S2();

    void X();

    void Y0();

    void a();

    void a1();

    void b();

    void b3();

    void e();

    void e0();

    void e1();

    void getChildren();

    void getItem();

    void i1();

    void j2();

    void k1();

    void l();

    void l0();

    void l2();

    void m1();

    void n();

    void n0();

    void p2();

    void pause();

    void q1();

    void release();

    void t1();

    void u0();

    void v();

    void v2();

    void w2();

    void x1();
}
