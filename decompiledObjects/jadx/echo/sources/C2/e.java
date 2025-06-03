package C2;

import A2.AbstractC0321g;
import A2.C0318d;
import A2.C0334u;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import x2.C2190d;
import z2.InterfaceC2301d;
import z2.InterfaceC2307j;

/* loaded from: classes.dex */
public final class e extends AbstractC0321g {

    /* renamed from: I, reason: collision with root package name */
    public final C0334u f921I;

    public e(Context context, Looper looper, C0318d c0318d, C0334u c0334u, InterfaceC2301d interfaceC2301d, InterfaceC2307j interfaceC2307j) {
        super(context, looper, 270, c0318d, interfaceC2301d, interfaceC2307j);
        this.f921I = c0334u;
    }

    @Override // A2.AbstractC0317c
    public final Bundle A() {
        return this.f921I.b();
    }

    @Override // A2.AbstractC0317c
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // A2.AbstractC0317c
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // A2.AbstractC0317c
    public final boolean I() {
        return true;
    }

    @Override // A2.AbstractC0317c, y2.C2270a.f
    public final int h() {
        return 203400000;
    }

    @Override // A2.AbstractC0317c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // A2.AbstractC0317c
    public final C2190d[] v() {
        return K2.d.f3187b;
    }
}
