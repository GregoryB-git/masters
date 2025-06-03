package com.google.android.recaptcha.internal;

import b.a0;
import dc.p;
import nc.d0;
import nc.d2;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzdg extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzdt zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j10, zzsp zzspVar, e eVar) {
        super(2, eVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzspVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e10;
        d2 e11;
        zzbd e12;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        vb.a aVar = vb.a.f16085a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                f.b(obj);
            } catch (zzbd e13) {
                e12 = e13;
                zzs3 = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (d2 e14) {
                e11 = e14;
                zzs2 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e15) {
                e10 = e15;
                zzs = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            f.b(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j10 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object M = a0.M(j10, zzdfVar, this);
                if (M == aVar) {
                    return aVar;
                }
                zzenVar = zzf;
                obj = M;
            } catch (zzbd e16) {
                zzenVar = zzf;
                e12 = e16;
                zzs3 = this.zzc.zzs(e12, e12);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (d2 e17) {
                zzenVar = zzf;
                e11 = e17;
                zzs2 = this.zzc.zzs(e11, new zzbd(zzbb.zzc, zzba.zzb, e11.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e18) {
                zzenVar = zzf;
                e10 = e18;
                zzs = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzZ, e10.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
