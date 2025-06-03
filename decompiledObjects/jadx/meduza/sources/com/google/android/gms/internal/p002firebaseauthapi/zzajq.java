package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajq implements zzanm {
    private final zzajo zza;

    private zzajq(zzajo zzajoVar) {
        zzajo zzajoVar2 = (zzajo) zzaki.zza(zzajoVar, "output");
        this.zza = zzajoVar2;
        zzajoVar2.zza = this;
    }

    public static zzajq zza(zzajo zzajoVar) {
        zzajq zzajqVar = zzajoVar.zza;
        return zzajqVar != null ? zzajqVar : new zzajq(zzajoVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, float f) {
        this.zza.zzb(i10, f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, zzaiw zzaiwVar) {
        this.zza.zzc(i10, zzaiwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final <K, V> void zza(int i10, zzale<K, V> zzaleVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i10, 2);
            this.zza.zzl(zzalf.zza(zzaleVar, entry.getKey(), entry.getValue()));
            zzalf.zza(this.zza, zzaleVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzaiw) {
            this.zza.zzd(i10, (zzaiw) obj);
        } else {
            this.zza.zzb(i10, (zzaln) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, Object obj, zzamc zzamcVar) {
        zzajo zzajoVar = this.zza;
        zzajoVar.zzj(i10, 3);
        zzamcVar.zza((zzamc) obj, (zzanm) zzajoVar.zza);
        zzajoVar.zzj(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, List<zzaiw> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, List<?> list, zzamc zzamcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaiu)) {
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
                i12 += zzajo.zza(list.get(i13).booleanValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        zzaiu zzaiuVar = (zzaiu) list;
        if (!z10) {
            while (i11 < zzaiuVar.size()) {
                this.zza.zzb(i10, zzaiuVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaiuVar.size(); i15++) {
            i14 += zzajo.zza(zzaiuVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzaiuVar.size()) {
            this.zza.zzb(zzaiuVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzj(i10, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, Object obj, zzamc zzamcVar) {
        this.zza.zzc(i10, (zzaln) obj, zzamcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzaku)) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzaku zzakuVar = (zzaku) list;
        while (i11 < list.size()) {
            Object zza = zzakuVar.zza(i11);
            if (zza instanceof String) {
                this.zza.zzb(i10, (String) zza);
            } else {
                this.zza.zzc(i10, (zzaiw) zza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, List<?> list, zzamc zzamcVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzamcVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajt)) {
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
                i12 += zzajo.zza(list.get(i13).doubleValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (!z10) {
            while (i11 < zzajtVar.size()) {
                this.zza.zzb(i10, zzajtVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzajtVar.size(); i15++) {
            i14 += zzajo.zza(zzajtVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzajtVar.size()) {
            this.zza.zzb(zzajtVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zza(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzh(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zza(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzj(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i10, int i11) {
        this.zza.zzg(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zzb(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzg(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zzb(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzi(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaky)) {
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
                i12 += zzajo.zza(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z10) {
            while (i11 < zzakyVar.size()) {
                this.zza.zzf(i10, zzakyVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakyVar.size(); i15++) {
            i14 += zzajo.zza(zzakyVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakyVar.size()) {
            this.zza.zzf(zzakyVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i10, int i11) {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzake)) {
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
                i12 += zzajo.zza(list.get(i13).floatValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        zzake zzakeVar = (zzake) list;
        if (!z10) {
            while (i11 < zzakeVar.size()) {
                this.zza.zzb(i10, zzakeVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakeVar.size(); i15++) {
            i14 += zzajo.zza(zzakeVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakeVar.size()) {
            this.zza.zzb(zzakeVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zzc(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzh(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zzc(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzj(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaky)) {
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
                i12 += zzajo.zzb(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z10) {
            while (i11 < zzakyVar.size()) {
                this.zza.zzh(i10, zzakyVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakyVar.size(); i15++) {
            i14 += zzajo.zzb(zzakyVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakyVar.size()) {
            this.zza.zzh(zzakyVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zze(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzg(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zze(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzi(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaky)) {
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
                i12 += zzajo.zzc(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzf(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z10) {
            while (i11 < zzakyVar.size()) {
                this.zza.zzf(i10, zzakyVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakyVar.size(); i15++) {
            i14 += zzajo.zzc(zzakyVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakyVar.size()) {
            this.zza.zzf(zzakyVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zzf(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzi(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zzf(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzk(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaky)) {
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
                i12 += zzajo.zzd(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzg(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z10) {
            while (i11 < zzakyVar.size()) {
                this.zza.zzg(i10, zzakyVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakyVar.size(); i15++) {
            i14 += zzajo.zzd(zzakyVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakyVar.size()) {
            this.zza.zzg(zzakyVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakj)) {
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
                i12 += zzajo.zzh(list.get(i13).intValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzakj zzakjVar = (zzakj) list;
        if (!z10) {
            while (i11 < zzakjVar.size()) {
                this.zza.zzk(i10, zzakjVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakjVar.size(); i15++) {
            i14 += zzajo.zzh(zzakjVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakjVar.size()) {
            this.zza.zzl(zzakjVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanm
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaky)) {
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
                i12 += zzajo.zze(list.get(i13).longValue());
            }
            this.zza.zzl(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzaky zzakyVar = (zzaky) list;
        if (!z10) {
            while (i11 < zzakyVar.size()) {
                this.zza.zzh(i10, zzakyVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzj(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzakyVar.size(); i15++) {
            i14 += zzajo.zze(zzakyVar.zzb(i15));
        }
        this.zza.zzl(i14);
        while (i11 < zzakyVar.size()) {
            this.zza.zzh(zzakyVar.zzb(i11));
            i11++;
        }
    }
}
