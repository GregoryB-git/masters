// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C2;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import z2.j;
import A2.d;
import android.os.Looper;
import android.content.Context;
import A2.u;
import A2.g;

public final class e extends g
{
    public final u I;
    
    public e(final Context context, final Looper looper, final d d, final u i, final z2.d d2, final j j) {
        super(context, looper, 270, d, d2, j);
        this.I = i;
    }
    
    @Override
    public final Bundle A() {
        return this.I.b();
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    @Override
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    @Override
    public final boolean I() {
        return true;
    }
    
    @Override
    public final int h() {
        return 203400000;
    }
    
    @Override
    public final x2.d[] v() {
        return K2.d.b;
    }
}
