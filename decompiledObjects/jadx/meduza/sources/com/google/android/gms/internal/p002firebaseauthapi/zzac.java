package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzac extends zzd<String> {
    public final CharSequence zza;
    private final zzf zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    public zzac(zzv zzvVar, CharSequence charSequence) {
        zzf zzfVar;
        int i10;
        zzfVar = zzvVar.zza;
        this.zzb = zzfVar;
        this.zzc = false;
        i10 = zzvVar.zzc;
        this.zze = i10;
        this.zza = charSequence;
    }

    public abstract int zza(int i10);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final /* synthetic */ String zza() {
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int zzb = zzb(i11);
            if (zzb == -1) {
                zzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(zzb);
            }
            int i12 = this.zzd;
            if (i12 != i10) {
                while (i10 < zzb && this.zzb.zza(this.zza.charAt(i10))) {
                    i10++;
                }
                while (zzb > i10 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                    zzb--;
                }
                int i13 = this.zze;
                if (i13 == 1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                    while (zzb > i10 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                } else {
                    this.zze = i13 - 1;
                }
                return this.zza.subSequence(i10, zzb).toString();
            }
            int i14 = i12 + 1;
            this.zzd = i14;
            if (i14 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzb(int i10);
}
