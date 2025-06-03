package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzad extends zzah {
    public final /* synthetic */ zzae zza;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, a6.b
    public final void zzb(Account account) {
        this.zza.setResult((zzae) new zzai(account != null ? Status.f2812e : zzal.zza, account));
    }
}
