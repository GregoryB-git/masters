package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public class zznt {
    public volatile zzoi zza;
    private volatile zzle zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznt)) {
            return false;
        }
        zznt zzntVar = (zznt) obj;
        zzoi zzoiVar = this.zza;
        zzoi zzoiVar2 = zzntVar.zza;
        if (zzoiVar == null && zzoiVar2 == null) {
            return zzb().equals(zzntVar.zzb());
        }
        if (zzoiVar != null && zzoiVar2 != null) {
            return zzoiVar.equals(zzoiVar2);
        }
        if (zzoiVar != null) {
            zzntVar.zzd(zzoiVar.zzm());
            return zzoiVar.equals(zzntVar.zza);
        }
        zzd(zzoiVar2.zzm());
        return this.zza.equals(zzoiVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzlc) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzo();
        }
        return 0;
    }

    public final zzle zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zzle.zzb : this.zza.zzb();
            return this.zzb;
        }
    }

    public final zzoi zzc(zzoi zzoiVar) {
        zzoi zzoiVar2 = this.zza;
        this.zzb = null;
        this.zza = zzoiVar;
        return zzoiVar2;
    }

    public final void zzd(zzoi zzoiVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzoiVar;
                this.zzb = zzle.zzb;
            } catch (zznn unused) {
                this.zza = zzoiVar;
                this.zzb = zzle.zzb;
            }
        }
    }
}
