package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzku {
    private volatile zzlm zza;
    private volatile zziy zzb;
    private volatile boolean zzc;

    private final zzlm zzb(zzlm zzlmVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzlmVar;
                        this.zzb = zziy.zza;
                    } catch (zzkp unused) {
                        this.zzc = true;
                        this.zza = zzlmVar;
                        this.zzb = zziy.zza;
                    }
                }
            }
        }
        return this.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzku)) {
            return false;
        }
        zzku zzkuVar = (zzku) obj;
        zzlm zzlmVar = this.zza;
        zzlm zzlmVar2 = zzkuVar.zza;
        return (zzlmVar == null && zzlmVar2 == null) ? zzb().equals(zzkuVar.zzb()) : (zzlmVar == null || zzlmVar2 == null) ? zzlmVar != null ? zzlmVar.equals(zzkuVar.zzb(zzlmVar.zzal())) : zzb(zzlmVar2.zzal()).equals(zzlmVar2) : zzlmVar.equals(zzlmVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzcf();
        }
        return 0;
    }

    public final zzlm zza(zzlm zzlmVar) {
        zzlm zzlmVar2 = this.zza;
        this.zzb = null;
        this.zza = zzlmVar;
        return zzlmVar2;
    }

    public final zziy zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zziy.zza : this.zza.zzcd();
            return this.zzb;
        }
    }
}
