package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;

/* loaded from: classes.dex */
final /* synthetic */ class zznm {
    public static final /* synthetic */ int[] zza;
    private static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzwb.zza.values().length];
        zza = iArr;
        try {
            iArr[zzwb.zza.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzwb.zza.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzxd.values().length];
        zzb = iArr2;
        try {
            iArr2[zzxd.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzb[zzxd.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzb[zzxd.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzb[zzxd.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
