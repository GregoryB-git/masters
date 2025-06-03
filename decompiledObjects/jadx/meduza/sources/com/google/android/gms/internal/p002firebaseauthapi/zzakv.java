package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public class zzakv {
    private volatile zzaln zza;
    private volatile zzaiw zzb;
    private volatile boolean zzc;

    private final zzaln zzb(zzaln zzalnVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzalnVar;
                        this.zzb = zzaiw.zza;
                    } catch (zzakm unused) {
                        this.zzc = true;
                        this.zza = zzalnVar;
                        this.zzb = zzaiw.zza;
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
        if (!(obj instanceof zzakv)) {
            return false;
        }
        zzakv zzakvVar = (zzakv) obj;
        zzaln zzalnVar = this.zza;
        zzaln zzalnVar2 = zzakvVar.zza;
        return (zzalnVar == null && zzalnVar2 == null) ? zzb().equals(zzakvVar.zzb()) : (zzalnVar == null || zzalnVar2 == null) ? zzalnVar != null ? zzalnVar.equals(zzakvVar.zzb(zzalnVar.zzs())) : zzb(zzalnVar2.zzs()).equals(zzalnVar2) : zzalnVar.equals(zzalnVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzaln zza(zzaln zzalnVar) {
        zzaln zzalnVar2 = this.zza;
        this.zzb = null;
        this.zza = zzalnVar;
        return zzalnVar2;
    }

    public final zzaiw zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zzaiw.zza : this.zza.zzj();
            return this.zzb;
        }
    }
}
