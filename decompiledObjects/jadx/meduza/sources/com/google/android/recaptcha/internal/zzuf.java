package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;

/* loaded from: classes.dex */
public final class zzuf extends zznd implements zzoj {
    private static final zzuf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private zznk zzg = zznd.zzB();

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zznd.zzI(zzuf.class, zzufVar);
        zzls zzg = zzls.zzg();
        zzpw zzpwVar = zzpw.zzi;
        zznd.zzs(zzg, "", null, null, 490775251, zzpwVar, String.class);
        zznd.zzs(zzls.zzg(), "", null, null, 490775252, zzpwVar, String.class);
    }

    private zzuf() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzue.class});
        }
        if (i11 == 3) {
            return new zzuf();
        }
        zzug zzugVar = null;
        if (i11 == 4) {
            return new zzuc(zzugVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzuf.class) {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            }
        }
        return zzoqVar;
    }

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i10;
        switch (this.zze) {
            case 0:
                i10 = 2;
                break;
            case 1:
                i10 = 3;
                break;
            case 2:
                i10 = 4;
                break;
            case 3:
                i10 = 5;
                break;
            case 4:
                i10 = 6;
                break;
            case 5:
                i10 = 7;
                break;
            case 6:
                i10 = 8;
                break;
            case 7:
                i10 = 9;
                break;
            case 8:
                i10 = 10;
                break;
            case 9:
                i10 = 11;
                break;
            case 10:
                i10 = 12;
                break;
            case 11:
                i10 = 13;
                break;
            case 12:
                i10 = 14;
                break;
            case 13:
                i10 = 15;
                break;
            case 14:
                i10 = 16;
                break;
            case 15:
                i10 = 17;
                break;
            case 16:
                i10 = 18;
                break;
            case 17:
                i10 = 19;
                break;
            case 18:
                i10 = 20;
                break;
            case 19:
                i10 = 21;
                break;
            case 20:
                i10 = 22;
                break;
            case 21:
                i10 = 23;
                break;
            case 22:
                i10 = 24;
                break;
            case 23:
                i10 = 25;
                break;
            case 24:
                i10 = 26;
                break;
            case 25:
                i10 = 27;
                break;
            case 26:
                i10 = 28;
                break;
            case 27:
                i10 = 29;
                break;
            case 28:
                i10 = 30;
                break;
            case 29:
                i10 = 31;
                break;
            case 30:
                i10 = 32;
                break;
            case 31:
                i10 = 33;
                break;
            case 32:
                i10 = 34;
                break;
            case 33:
                i10 = 35;
                break;
            case 34:
                i10 = 36;
                break;
            case 35:
                i10 = 37;
                break;
            case 36:
                i10 = 38;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                i10 = 39;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                i10 = 40;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                i10 = 41;
                break;
            case 40:
                i10 = 42;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i10 = 43;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
