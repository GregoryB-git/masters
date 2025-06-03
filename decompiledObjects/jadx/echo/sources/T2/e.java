package T2;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e extends K2.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // K2.b
    public final boolean Z0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                K2.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                K2.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                K2.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) K2.c.a(parcel, l.CREATOR);
                K2.c.b(parcel);
                K(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                K2.c.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
