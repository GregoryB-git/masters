package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import h7.d;
import h7.j;

/* loaded from: classes.dex */
public abstract class zad extends zab implements d {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                com.google.android.gms.internal.base.zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                com.google.android.gms.internal.base.zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                com.google.android.gms.internal.base.zac.zab(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                j jVar = (j) com.google.android.gms.internal.base.zac.zaa(parcel, j.CREATOR);
                com.google.android.gms.internal.base.zac.zab(parcel);
                L1(jVar);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.internal.base.zac.zab(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
