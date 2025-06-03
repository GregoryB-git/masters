package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import m7.l;
import m7.t;

/* loaded from: classes.dex */
public abstract class o extends b implements t {
    public o() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
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
