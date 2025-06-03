package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzac extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzae zzc;
    public final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, e eVar) {
        super(2, eVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzac(this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        vb.a aVar = vb.a.f16085a;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i10 = 2;
            this.zzb = 2;
            if (e10 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                if (errorCode == -100) {
                    i10 = 44;
                } else if (errorCode == -12) {
                    i10 = 39;
                } else if (errorCode == -3) {
                    i10 = 30;
                } else if (errorCode == -2) {
                    i10 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i10 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i10 = 53;
                            break;
                        case -17:
                            i10 = 52;
                            break;
                        case -16:
                            i10 = 43;
                            break;
                        case -15:
                            i10 = 42;
                            break;
                        case -14:
                            i10 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i10 = 36;
                                    break;
                                case -8:
                                    i10 = 35;
                                    break;
                                case -7:
                                    i10 = 34;
                                    break;
                                case -6:
                                    i10 = 33;
                                    break;
                                case -5:
                                    i10 = 32;
                                    break;
                            }
                    }
                } else {
                    i10 = 28;
                }
            } else {
                i10 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i10);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj == aVar) {
                return aVar;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            f.b(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                f.b(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            f.b(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}
