// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C2;

import android.os.Parcel;
import android.os.Parcelable;
import K2.c;
import A2.r;
import android.os.IBinder;
import android.os.IInterface;

public final class a extends K2.a implements IInterface
{
    public a(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }
    
    public final void Z0(final r r) {
        final Parcel n = this.n();
        K2.c.c(n, (Parcelable)r);
        this.v(1, n);
    }
}
