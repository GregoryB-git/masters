package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class zzrc extends zznd implements zzoj {
    private static final zzrc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private Object zzg;
    private int zzh;
    private int zzi;
    private long zzn;
    private zzml zzo;
    private int zzp;
    private zzqq zzq;
    private zzro zzr;
    private zzpj zzt;
    private zzml zzu;
    private int zzw;
    private int zzf = 0;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzs = "";
    private zzni zzv = zznd.zzy();

    static {
        zzrc zzrcVar = new zzrc();
        zzb = zzrcVar;
        zznd.zzI(zzrc.class, zzrcVar);
    }

    private zzrc() {
    }

    public static /* synthetic */ void zzO(zzrc zzrcVar, int i10) {
        zzni zzniVar = zzrcVar.zzv;
        if (!zzniVar.zzc()) {
            zzrcVar.zzv = zznd.zzz(zzniVar);
        }
        zzrcVar.zzv.zzh(0);
    }

    public static /* synthetic */ void zzP(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzj = str;
    }

    public static /* synthetic */ void zzR(zzrc zzrcVar, zzqq zzqqVar) {
        zzrcVar.zzq = zzqqVar;
        zzrcVar.zze |= 2;
    }

    public static /* synthetic */ void zzS(zzrc zzrcVar, String str) {
        str.getClass();
        zzrcVar.zzk = str;
    }

    public static /* synthetic */ void zzT(zzrc zzrcVar, zzro zzroVar) {
        zzroVar.getClass();
        zzrcVar.zzr = zzroVar;
        zzrcVar.zze |= 4;
    }

    public static /* synthetic */ void zzU(zzrc zzrcVar, int i10) {
        zzrcVar.zze |= 32;
        zzrcVar.zzw = i10;
    }

    public static /* synthetic */ void zzab(zzrc zzrcVar, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzrcVar.zzi = i10 - 2;
    }

    public static zzra zzi() {
        return (zzra) zzb.zzq();
    }

    public static zzrc zzk() {
        return zzb;
    }

    public static zzrc zzl(byte[] bArr) {
        return (zzrc) zznd.zzx(zzb, bArr);
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
        int i10;
        switch (this.zzh) {
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
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzZ() {
        int i10 = this.zzp;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzqq zzg() {
        zzqq zzqqVar = this.zzq;
        return zzqqVar == null ? zzqq.zzj() : zzqqVar;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi"});
        }
        if (i11 == 3) {
            return new zzrc();
        }
        zzrb zzrbVar = null;
        if (i11 == 4) {
            return new zzra(zzrbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzrc.class) {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            }
        }
        return zzoqVar;
    }
}
