package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class zzcf extends ContentObserver {
    public final /* synthetic */ zzcg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcgVar, Handler handler) {
        super(null);
        this.zza = zzcgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.zza.zze();
    }
}
