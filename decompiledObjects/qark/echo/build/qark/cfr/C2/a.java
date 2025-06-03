/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.String
 */
package C2;

import A2.r;
import K2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class a
extends K2.a
implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void Z0(r r8) {
        Parcel parcel = this.n();
        c.c(parcel, r8);
        this.v(1, parcel);
    }
}

