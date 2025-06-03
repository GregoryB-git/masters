/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  java.lang.String
 */
package C2;

import A2.g;
import A2.u;
import C2.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import z2.d;
import z2.j;

public final class e
extends g {
    public final u I;

    public e(Context context, Looper looper, A2.d d8, u u8, d d9, j j8) {
        super(context, looper, 270, d8, d9, j8);
        this.I = u8;
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
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (iInterface instanceof a) {
            return (a)iInterface;
        }
        return new a(iBinder);
    }

    @Override
    public final x2.d[] v() {
        return K2.d.b;
    }
}

