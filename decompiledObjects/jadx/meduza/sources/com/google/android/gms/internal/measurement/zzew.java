package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzew extends zzdu {
    private final /* synthetic */ Runnable zza;

    public zzew(zzet zzetVar, Runnable runnable) {
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzdr
    public final void a_() {
        this.zza.run();
    }
}
