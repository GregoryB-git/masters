package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzed;
import e7.f2;
import m6.j;

/* loaded from: classes.dex */
final class zzeg extends zzed.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzed zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzed zzedVar, String str, String str2, Context context, Bundle bundle) {
        super(zzedVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzdl zzdlVar;
        zzdl zzdlVar2;
        String str4;
        String str5;
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str6 = this.zzd;
                String str7 = this.zzc;
                str5 = this.zzg.zzc;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            j.i(this.zze);
            zzed zzedVar = this.zzg;
            zzedVar.zzj = zzedVar.zza(this.zze, true);
            zzdlVar = this.zzg.zzj;
            if (zzdlVar == null) {
                str4 = this.zzg.zzc;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.zze, ModuleDescriptor.MODULE_ID);
            zzdz zzdzVar = new zzdz(114010L, Math.max(a10, r0), DynamiteModule.d(this.zze, ModuleDescriptor.MODULE_ID, false) < a10, str, str2, str3, this.zzf, f2.a(this.zze));
            zzdlVar2 = this.zzg.zzj;
            j.i(zzdlVar2);
            zzdlVar2.initialize(ObjectWrapper.wrap(this.zze), zzdzVar, this.zza);
        } catch (Exception e10) {
            this.zzg.zza(e10, true, false);
        }
    }
}
