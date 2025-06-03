package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        zznd zzl;
        if (((zzna) this.zza).zzL()) {
            ((zzna) this.zza).zzb.zzg();
            zzl = super.zzl();
        } else {
            zzl = this.zza;
        }
        return (zzna) zzl;
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
