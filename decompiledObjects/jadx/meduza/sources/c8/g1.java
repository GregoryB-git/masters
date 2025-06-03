package c8;

import com.google.android.gms.internal.p002firebaseauthapi.zzahg;

/* loaded from: classes.dex */
public final class g1 implements b8.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2449a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.f f2450b;

    public g1(zzahg zzahgVar) {
        int i10;
        if (zzahgVar.zzg()) {
            zzahgVar.zzc();
        } else {
            zzahgVar.zzb();
        }
        zzahgVar.zzb();
        n7.f fVar = null;
        if (!zzahgVar.zzh()) {
            this.f2449a = 3;
            this.f2450b = null;
            return;
        }
        String zzd = zzahgVar.zzd();
        zzd.getClass();
        i10 = 5;
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i10 = 6;
                break;
            case "PASSWORD_RESET":
                i10 = 0;
                break;
            case "VERIFY_EMAIL":
                i10 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i10 = 4;
                break;
            case "RECOVER_EMAIL":
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        this.f2449a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f2450b = null;
            return;
        }
        if (zzahgVar.zzf()) {
            fVar = new e1(zzahgVar.zzb(), x6.b.F0(zzahgVar.zza()));
        } else if (zzahgVar.zzg()) {
            fVar = new f1(zzahgVar.zzc(), zzahgVar.zzb());
        } else if (zzahgVar.zze()) {
            fVar = new e1(zzahgVar.zzb());
        }
        this.f2450b = fVar;
    }

    @Override // b8.b
    public final int a() {
        return this.f2449a;
    }

    @Override // b8.b
    public final n7.f b() {
        return this.f2450b;
    }
}
