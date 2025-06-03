package e7;

import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzs;

/* loaded from: classes.dex */
public final /* synthetic */ class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4130a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4131b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f4132c;

    static {
        int[] iArr = new int[zzgc.zza.zzd.values().length];
        f4132c = iArr;
        try {
            iArr[zzgc.zza.zzd.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4132c[zzgc.zza.zzd.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzgc.zza.zze.values().length];
        f4131b = iArr2;
        try {
            iArr2[zzgc.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4131b[zzgc.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4131b[zzgc.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4131b[zzgc.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzs.values().length];
        f4130a = iArr3;
        try {
            iArr3[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f4130a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f4130a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f4130a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
