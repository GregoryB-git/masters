package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;

/* loaded from: classes.dex */
public abstract class j extends b implements m7.q {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) l.a(parcel, Bundle.CREATOR);
            l.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) l.a(parcel, Bundle.CREATOR);
        l.b(parcel);
        b(bundle4);
        return true;
    }
}
