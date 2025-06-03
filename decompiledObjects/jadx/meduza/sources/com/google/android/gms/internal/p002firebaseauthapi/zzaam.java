package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import b8.c0;
import com.google.android.gms.common.api.Status;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
final class zzaam implements zzaew<zzaik> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzaew zzb;
    private final /* synthetic */ zzaan zzc;

    public zzaam(zzaan zzaanVar, zzadp zzadpVar, zzaew zzaewVar) {
        this.zza = zzadpVar;
        this.zzb = zzaewVar;
        this.zzc = zzaanVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final void zza(zzaik zzaikVar) {
        zzaik zzaikVar2 = zzaikVar;
        if (TextUtils.isEmpty(zzaikVar2.zze())) {
            this.zzc.zza.zza(new zzagw(zzaikVar2.zzd(), zzaikVar2.zzb(), Long.valueOf(zzaikVar2.zza()), "Bearer"), null, Constants.SIGN_IN_METHOD_PHONE, Boolean.valueOf(zzaikVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025, null, null, null), new c0(null, null, zzaikVar2.zzc(), zzaikVar2.zze(), true));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(str);
    }
}
