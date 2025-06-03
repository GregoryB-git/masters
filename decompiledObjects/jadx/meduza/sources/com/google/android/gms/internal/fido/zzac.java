package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import k6.e;
import m6.a;

/* loaded from: classes.dex */
public final class zzac extends c {
    public zzac(Context context, Looper looper, a aVar, e.a aVar2, e.b bVar) {
        super(context, looper, R.styleable.AppCompatTheme_windowActionModeOverlay, aVar, aVar2, bVar);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean usesClientTelemetry() {
        return true;
    }
}
