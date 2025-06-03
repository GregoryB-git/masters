package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zzjt {
    public static final zzjt zza = new zzjt(true);
    private static volatile boolean zzb = false;
    private static volatile zzjt zzc;
    private final Map<zza, zzkg.zzd<?, ?>> zzd;

    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i10) {
            this.zza = obj;
            this.zzb = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    public zzjt() {
        this.zzd = new HashMap();
    }

    private zzjt(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public static zzjt zza() {
        zzjt zzjtVar = zzc;
        if (zzjtVar != null) {
            return zzjtVar;
        }
        synchronized (zzjt.class) {
            zzjt zzjtVar2 = zzc;
            if (zzjtVar2 != null) {
                return zzjtVar2;
            }
            zzjt zza2 = zzkf.zza(zzjt.class);
            zzc = zza2;
            return zza2;
        }
    }

    public final <ContainingType extends zzlm> zzkg.zzd<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzkg.zzd) this.zzd.get(new zza(containingtype, i10));
    }
}
