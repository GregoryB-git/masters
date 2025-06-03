package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import b8.c1;
import b8.t0;
import java.util.ArrayList;
import java.util.List;
import m6.j;

/* loaded from: classes.dex */
public final class zzagl {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahb zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private c1 zzk;
    private List<zzagz> zzl;
    private zzaj<t0> zzm;

    public zzagl() {
        this.zzf = new zzahb();
        this.zzm = zzaj.zzh();
    }

    public zzagl(String str, String str2, boolean z10, String str3, String str4, zzahb zzahbVar, String str5, String str6, long j10, long j11, boolean z11, c1 c1Var, List<zzagz> list, zzaj<t0> zzajVar) {
        zzahb zzahbVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzahbVar == null) {
            zzahbVar2 = new zzahb();
        } else {
            List<zzahc> zza = zzahbVar.zza();
            zzahb zzahbVar3 = new zzahb();
            if (zza != null) {
                zzahbVar3.zza().addAll(zza);
            }
            zzahbVar2 = zzahbVar3;
        }
        this.zzf = zzahbVar2;
        this.zzg = str6;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final long zza() {
        return this.zzh;
    }

    public final zzagl zza(c1 c1Var) {
        this.zzk = c1Var;
        return this;
    }

    public final zzagl zza(zzaj<t0> zzajVar) {
        j.i(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    public final zzagl zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzagl zza(List<zzahc> list) {
        j.i(list);
        zzahb zzahbVar = new zzahb();
        this.zzf = zzahbVar;
        zzahbVar.zza().addAll(list);
        return this;
    }

    public final zzagl zza(boolean z10) {
        this.zzj = z10;
        return this;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final zzagl zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzagl zzc(String str) {
        this.zze = str;
        return this;
    }

    public final zzaj<t0> zzd() {
        return this.zzm;
    }

    public final c1 zze() {
        return this.zzk;
    }

    public final zzahb zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzagz> zzk() {
        return this.zzl;
    }

    public final List<zzahc> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }
}
