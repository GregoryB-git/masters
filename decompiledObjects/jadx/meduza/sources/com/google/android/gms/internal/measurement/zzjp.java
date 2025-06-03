package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzjp implements zznl {
    private final zzjn zza;

    private zzjp(zzjn zzjnVar) {
        zzjn zzjnVar2 = (zzjn) zzkj.zza(zzjnVar, "output");
        this.zza = zzjnVar2;
        zzjnVar2.zza = this;
    }

    public static zzjp zza(zzjn zzjnVar) {
        zzjp zzjpVar = zzjnVar.zza;
        return zzjpVar != null ? zzjpVar : new zzjp(zzjnVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, float f) {
        this.zza.zzb(i10, f);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, zziy zziyVar) {
        this.zza.zzc(i10, zziyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final <K, V> void zza(int i10, zzlh<K, V> zzlhVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i10, 2);
            this.zza.zzk(zzle.zza(zzlhVar, entry.getKey(), entry.getValue()));
            zzle.zza(this.zza, zzlhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, Object obj) {
        if (obj instanceof zziy) {
            this.zza.zzd(i10, (zziy) obj);
        } else {
            this.zza.zzb(i10, (zzlm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, Object obj, zzme zzmeVar) {
        zzjn zzjnVar = this.zza;
        zzjnVar.zzj(i10, 3);
        zzmeVar.zza((zzme) obj, (zznl) zzjnVar.zza);
        zzjnVar.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, List<zziy> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, List<?> list, zzme zzmeVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzmeVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zziw)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zza(list.get(i13).booleanValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        zziw zziwVar = (zziw) list;
        if (!z10) {
            while (i11 < zziwVar.size()) {
                this.zza.zzb(i10, zziwVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zziwVar.size(); i15++) {
            i14 += zzjn.zza(zziwVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zziwVar.size()) {
            this.zza.zzb(zziwVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzj(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, Object obj, zzme zzmeVar) {
        this.zza.zzc(i10, (zzlm) obj, zzmeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzkx)) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzkx zzkxVar = (zzkx) list;
        while (i11 < list.size()) {
            Object zza = zzkxVar.zza(i11);
            if (zza instanceof String) {
                this.zza.zzb(i10, (String) zza);
            } else {
                this.zza.zzc(i10, (zziy) zza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, List<?> list, zzme zzmeVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzmeVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzjs)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zza(list.get(i13).doubleValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (!z10) {
            while (i11 < zzjsVar.size()) {
                this.zza.zzb(i10, zzjsVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzjsVar.size(); i15++) {
            i14 += zzjn.zza(zzjsVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzjsVar.size()) {
            this.zza.zzb(zzjsVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzc(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zza(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzh(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zza(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzi(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzd(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzb(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzg(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zzb(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzh(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zze(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zza(list.get(i13).longValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzlb zzlbVar = (zzlb) list;
        if (!z10) {
            while (i11 < zzlbVar.size()) {
                this.zza.zzf(i10, zzlbVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlbVar.size(); i15++) {
            i14 += zzjn.zza(zzlbVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzlbVar.size()) {
            this.zza.zzf(zzlbVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzf(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zza(list.get(i13).floatValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        zzkc zzkcVar = (zzkc) list;
        if (!z10) {
            while (i11 < zzkcVar.size()) {
                this.zza.zzb(i10, zzkcVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkcVar.size(); i15++) {
            i14 += zzjn.zza(zzkcVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkcVar.size()) {
            this.zza.zzb(zzkcVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzc(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzh(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zzc(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzi(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzb(list.get(i13).longValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzlb zzlbVar = (zzlb) list;
        if (!z10) {
            while (i11 < zzlbVar.size()) {
                this.zza.zzh(i10, zzlbVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlbVar.size(); i15++) {
            i14 += zzjn.zzb(zzlbVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzlbVar.size()) {
            this.zza.zzh(zzlbVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzd(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzg(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zzd(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzh(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzc(list.get(i13).longValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzlb zzlbVar = (zzlb) list;
        if (!z10) {
            while (i11 < zzlbVar.size()) {
                this.zza.zzf(i10, zzlbVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlbVar.size(); i15++) {
            i14 += zzjn.zzc(zzlbVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzlbVar.size()) {
            this.zza.zzf(zzlbVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zze(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzi(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zze(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzj(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzd(list.get(i13).longValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzg(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzlb zzlbVar = (zzlb) list;
        if (!z10) {
            while (i11 < zzlbVar.size()) {
                this.zza.zzg(i10, zzlbVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlbVar.size(); i15++) {
            i14 += zzjn.zzd(zzlbVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzlbVar.size()) {
            this.zza.zzg(zzlbVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzk(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zzg(list.get(i13).intValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzkh zzkhVar = (zzkh) list;
        if (!z10) {
            while (i11 < zzkhVar.size()) {
                this.zza.zzk(i10, zzkhVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkhVar.size(); i15++) {
            i14 += zzjn.zzg(zzkhVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzkhVar.size()) {
            this.zza.zzk(zzkhVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzj(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzjn.zze(list.get(i13).longValue());
            }
            this.zza.zzk(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzlb zzlbVar = (zzlb) list;
        if (!z10) {
            while (i11 < zzlbVar.size()) {
                this.zza.zzh(i10, zzlbVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlbVar.size(); i15++) {
            i14 += zzjn.zze(zzlbVar.zzb(i15));
        }
        this.zza.zzk(i14);
        while (i11 < zzlbVar.size()) {
            this.zza.zzh(zzlbVar.zzb(i11));
            i11++;
        }
    }
}
