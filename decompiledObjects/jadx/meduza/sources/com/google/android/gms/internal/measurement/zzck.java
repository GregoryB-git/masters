package com.google.android.gms.internal.measurement;

import java.io.File;

/* loaded from: classes.dex */
final class zzck implements zzci {
    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(File file, String str) {
        return zza(file, str, zzco.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(File file, String str, zzco zzcoVar) {
        return zza(new File(file, str).getPath(), zzcoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(String str) {
        return zza(str, zzco.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(String str, zzco zzcoVar) {
        return zzb(str, zzcoVar, zzcl.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final String zza(String str, zzco zzcoVar, zzcl zzclVar) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zzb(String str, zzco zzcoVar, zzcl zzclVar) {
        return zzch.zza(this, str, zzcoVar, zzclVar);
    }
}
