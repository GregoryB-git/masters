package com.google.android.recaptcha.internal;

import dc.l;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzea extends i implements l {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzec zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ r zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j10, r rVar, e eVar) {
        super(1, eVar);
        this.zzc = zzecVar;
        this.zzd = j10;
        this.zze = rVar;
    }

    @Override // wb.a
    public final e create(e eVar) {
        return new zzea(this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((e) obj)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e10;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zzb;
        if (i10 == 0) {
            f.b(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j10 = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j10, this);
                if (zzo != aVar) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return aVar;
            } catch (zzbd e11) {
                zzenVar = zzf;
                e10 = e11;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        if (i10 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                f.b(obj);
                zzenVar.zza();
                zzec zzecVar = this.zzc;
                zzcjVar = zzcm.zzb;
                zzecVar.zzf = zzcjVar;
                return Boolean.valueOf(this.zze.i0(h.f13851a));
            } catch (zzbd e12) {
                e10 = e12;
                this.zzc.zzd = e10;
                zzenVar.zzb(e10);
                throw e10;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            f.b(obj);
        } catch (zzbd e13) {
            e10 = e13;
            zzenVar = zzenVar2;
            this.zzc.zzd = e10;
            zzenVar.zzb(e10);
            throw e10;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j11 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j11, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return Boolean.valueOf(this.zze.i0(h.f13851a));
        }
        return aVar;
    }
}
