package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import j6.d;
import k6.e;
import m6.a;
import z5.i;

/* loaded from: classes.dex */
public final class zzam extends c {
    public zzam(Context context, Looper looper, a aVar, e.a aVar2, e.b bVar) {
        super(context, looper, R.styleable.AppCompatTheme_windowFixedHeightMajor, aVar, aVar2, bVar);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return com.google.android.gms.auth.account.zzd.zzb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final d[] getApiFeatures() {
        return new d[]{i.f17808d};
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean usesClientTelemetry() {
        return true;
    }
}
