package com.google.android.gms.internal.p002firebaseauthapi;

import c8.e1;
import c8.f1;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;
import x6.b;

/* loaded from: classes.dex */
final class zzadk extends zzaeg<String, z0> {
    private final String zzu;
    private final String zzv;

    public zzadk(String str, String str2) {
        super(4);
        j.f("code cannot be null or empty", str);
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzd(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        char c10;
        zzahg zzahgVar = this.zzm;
        if (zzahgVar.zzg()) {
            zzahgVar.zzc();
        } else {
            zzahgVar.zzb();
        }
        zzahgVar.zzb();
        char c11 = 3;
        if (zzahgVar.zzh()) {
            String zzd = zzahgVar.zzd();
            zzd.getClass();
            c10 = 0;
            switch (zzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c10 = 6;
                    break;
                case "PASSWORD_RESET":
                    break;
                case "VERIFY_EMAIL":
                    c10 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    c10 = 5;
                    break;
                case "EMAIL_SIGNIN":
                    c10 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c10 = 2;
                    break;
                default:
                    c10 = 3;
                    break;
            }
            if (c10 != 4 && c10 != 3) {
                if (zzahgVar.zzf()) {
                    new e1(zzahgVar.zzb(), b.F0(zzahgVar.zza()));
                } else if (zzahgVar.zzg()) {
                    new f1(zzahgVar.zzc(), zzahgVar.zzb());
                } else if (zzahgVar.zze()) {
                    new e1(zzahgVar.zzb());
                }
            }
            c11 = c10;
        }
        if (c11 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }
}
