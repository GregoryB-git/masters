package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;
import k6.c;
import p6.a;

/* loaded from: classes.dex */
final class zzafi extends zzadp {
    private final String zza;
    private final /* synthetic */ zzafd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafi(zzafd zzafdVar, zzadp zzadpVar, String str) {
        super(zzadpVar);
        this.zzb = zzafdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadp
    public final void zza(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = zzafd.zza;
        aVar.c("SMS verification code request failed: " + c.a(status.f2816a) + " " + status.f2817b, new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadp
    public final void zzb(String str) {
        a aVar;
        HashMap hashMap;
        aVar = zzafd.zza;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzafk zzafkVar = (zzafk) hashMap.get(this.zza);
        if (zzafkVar == null) {
            return;
        }
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzafkVar.zzg = true;
        zzafkVar.zzd = str;
        if (zzafkVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzafkVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzae.zzc(zzafkVar.zze)) {
                return;
            }
            zzafd.zzb(this.zzb, this.zza);
        }
    }
}
