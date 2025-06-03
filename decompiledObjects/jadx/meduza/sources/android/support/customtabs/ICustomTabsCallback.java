package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p.b;
import p.c;
import p.d;
import p.e;
import p.f;
import p.g;
import p.h;
import p.i;
import p.j;
import p.k;
import p.l;
import p.m;

/* loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    /* renamed from: g, reason: collision with root package name */
    public static final String f408g = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        public static class a implements ICustomTabsCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f409a;

            public a(IBinder iBinder) {
                this.f409a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f409a;
            }
        }

        public Stub() {
            attachInterface(this, ICustomTabsCallback.f408g);
        }

        public static ICustomTabsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.f408g);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsCallback)) ? new a(iBinder) : (ICustomTabsCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ICustomTabsCallback.f408g;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    int readInt = parcel.readInt();
                    Bundle bundle = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar = (m) this;
                    if (mVar.f12721b != null) {
                        mVar.f12720a.post(new d(mVar, readInt, bundle));
                    }
                    return true;
                case 3:
                    String readString = parcel.readString();
                    Bundle bundle2 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar2 = (m) this;
                    if (mVar2.f12721b != null) {
                        mVar2.f12720a.post(new e(mVar2, readString, bundle2));
                    }
                    return true;
                case 4:
                    Bundle bundle3 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar3 = (m) this;
                    if (mVar3.f12721b != null) {
                        mVar3.f12720a.post(new f(mVar3, bundle3));
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String readString2 = parcel.readString();
                    Bundle bundle4 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar4 = (m) this;
                    if (mVar4.f12721b != null) {
                        mVar4.f12720a.post(new g(mVar4, readString2, bundle4));
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int readInt2 = parcel.readInt();
                    Uri uri = (Uri) a.a(parcel, Uri.CREATOR);
                    boolean z10 = parcel.readInt() != 0;
                    Bundle bundle5 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar5 = (m) this;
                    if (mVar5.f12721b != null) {
                        mVar5.f12720a.post(new h(mVar5, readInt2, uri, z10, bundle5));
                    }
                    return true;
                case 7:
                    String readString3 = parcel.readString();
                    Bundle bundle6 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    b bVar = ((m) this).f12721b;
                    Bundle extraCallbackWithResult = bVar == null ? null : bVar.extraCallbackWithResult(readString3, bundle6);
                    parcel2.writeNoException();
                    if (extraCallbackWithResult != null) {
                        parcel2.writeInt(1);
                        extraCallbackWithResult.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    Bundle bundle7 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar6 = (m) this;
                    if (mVar6.f12721b != null) {
                        mVar6.f12720a.post(new i(mVar6, readInt3, readInt4, bundle7));
                    }
                    return true;
                case 9:
                    Bundle bundle8 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar7 = (m) this;
                    if (mVar7.f12721b != null) {
                        mVar7.f12720a.post(new j(mVar7, bundle8));
                    }
                    return true;
                case 10:
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    int readInt7 = parcel.readInt();
                    int readInt8 = parcel.readInt();
                    int readInt9 = parcel.readInt();
                    Bundle bundle9 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar8 = (m) this;
                    if (mVar8.f12721b != null) {
                        mVar8.f12720a.post(new k(mVar8, readInt5, readInt6, readInt7, readInt8, readInt9, bundle9));
                    }
                    return true;
                case 11:
                    Bundle bundle10 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar9 = (m) this;
                    if (mVar9.f12721b != null) {
                        mVar9.f12720a.post(new l(mVar9, bundle10));
                    }
                    return true;
                case 12:
                    Bundle bundle11 = (Bundle) a.a(parcel, Bundle.CREATOR);
                    m mVar10 = (m) this;
                    if (mVar10.f12721b != null) {
                        mVar10.f12720a.post(new c(mVar10, bundle11));
                    }
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
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
}
