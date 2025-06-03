package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;
import m7.u;

/* loaded from: classes.dex */
public abstract class q extends b implements u {
    public q() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) l.a(parcel, Bundle.CREATOR);
        l.b(parcel);
        b(bundle);
        return true;
    }
}
