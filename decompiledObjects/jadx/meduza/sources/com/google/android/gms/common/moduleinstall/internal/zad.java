package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public abstract class zad extends zab {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zac.zab(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 == 2) {
            zac.zab(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 == 3) {
            zac.zab(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        zac.zab(parcel);
        throw new UnsupportedOperationException();
    }
}
