package com.google.android.recaptcha.internal;

import dc.p;
import ec.t;
import java.util.Arrays;
import nc.d0;
import nc.j1;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzfr extends i implements p {
    public final /* synthetic */ Exception zza;
    public final /* synthetic */ zzgd zzb;
    public final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, e eVar) {
        super(2, eVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, eVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zztd zztdVar;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        d0 d0Var = (d0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVar = ((zzce) exc).zza();
            zztdVar.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zzf = zzte.zzf();
            zzf.zze(zzgdVar.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zztdVar = zzf;
        }
        zzte zzteVar = (zzte) zztdVar.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        t.a(this.zza.getClass()).e();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zza = zzev.zza(zzb, zzbnVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        j1 j1Var = (j1) d0Var.f().get(j1.b.f11509a);
        if (j1Var != null ? j1Var.isActive() : true) {
            zzft zzftVar = this.zzc;
            zzkh zzh = zzkh.zzh();
            byte[] zzd2 = zzteVar.zzd();
            zzkh zzh2 = zzkh.zzh();
            byte[] zzd3 = zza.zzd();
            zzftVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzh.zzi(zzd2, 0, zzd2.length), zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return h.f13851a;
    }
}
