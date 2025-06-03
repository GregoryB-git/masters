package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i10, int i11, zzoi zzoiVar, boolean z10, int[] iArr2, int i12, int i13, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzoiVar instanceof zznd;
        boolean z11 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzow zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzow zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int zzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j10, zze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j10, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzov zzovVar) {
        zzps.zzs(obj, i10 & 1048575, zzM(i10) ? zzovVar.zzs() : this.zzi ? zzovVar.zzr() : zzovVar.zzp());
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = 1048575 & zzr;
        if (j10 == 1048575) {
            return;
        }
        zzps.zzq(obj, j10, (1 << (zzr >>> 20)) | zzps.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzps.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j10 = zzr & 1048575;
        if (j10 != 1048575) {
            return (zzps.zzc(obj, j10) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i10);
        long j11 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j11)) != 0;
            case 2:
                return zzps.zzd(obj, j11) != 0;
            case 3:
                return zzps.zzd(obj, j11) != 0;
            case 4:
                return zzps.zzc(obj, j11) != 0;
            case 5:
                return zzps.zzd(obj, j11) != 0;
            case 6:
                return zzps.zzc(obj, j11) != 0;
            case 7:
                return zzps.zzw(obj, j11);
            case 8:
                Object zzf = zzps.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j11) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j11));
            case 11:
                return zzps.zzc(obj, j11) != 0;
            case 12:
                return zzps.zzc(obj, j11) != 0;
            case 13:
                return zzps.zzc(obj, j11) != 0;
            case 14:
                return zzps.zzd(obj, j11) != 0;
            case 15:
                return zzps.zzc(obj, j11) != 0;
            case 16:
                return zzps.zzd(obj, j11) != 0;
            case 17:
                return zzps.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzps.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzps.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i10, (String) obj);
        } else {
            zzpyVar.zzd(i10, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzof r34, com.google.android.recaptcha.internal.zzoo r35, com.google.android.recaptcha.internal.zznv r36, com.google.android.recaptcha.internal.zzpl r37, com.google.android.recaptcha.internal.zzmp r38, com.google.android.recaptcha.internal.zzod r39) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzps.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzps.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzps.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzps.zzf(obj, j10)).longValue();
    }

    private final zznh zzw(int i10) {
        int i11 = i10 / 3;
        return (zznh) this.zzd[i11 + i11 + 1];
    }

    private final zzow zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzow zzowVar = (zzow) objArr[i12];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzpl zzplVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzps.zzf(obj, zzu(i10) & 1048575);
        if (zzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0261, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzln.zzA(r13 << 3);
        r2 = com.google.android.recaptcha.internal.zzln.zzA(r0);
        r18 = r10;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ca, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d8, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f4, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0204, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0211, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021e, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022b, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0238, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0245, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0252, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025f, code lost:
    
        if (r0 > 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04b6, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04cb, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04e1, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x05e0, code lost:
    
        r0 = r13 << 3;
        r1 = r8.getInt(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0564, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzle) != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0598, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05b3, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05c8, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05de, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05fa, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0611, code lost:
    
        r0 = r13 << 3;
        r1 = r8.getLong(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x060f, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0635, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0652, code lost:
    
        if (zzO(r20, r9, r17, r12, r14) != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0146, code lost:
    
        r18 = r10;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0654, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzln.zzA(r13 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013a, code lost:
    
        r18 = r10;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0637, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzln.zzA(r13 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        r0 = r13 << 3;
        r1 = zzp(r20, r1);
        r18 = r10;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x05e6, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0617, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzln.zzA(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00eb, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zzle) != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x057b, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzln.zzA(r0);
        r1 = com.google.android.recaptcha.internal.zzln.zzz((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ff, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010d, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0128, code lost:
    
        r0 = r13 << 3;
        r1 = zzv(r20, r1);
        r18 = r10;
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0144, code lost:
    
        if (zzR(r20, r13, r9) != false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cc, code lost:
    
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e6, code lost:
    
        r1 = r1 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e2, code lost:
    
        r6 = r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
    
        if (r2 != null) goto L68;
     */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0516, code lost:
    
        if (r3 == 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0518, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0526, code lost:
    
        if (r0 >= r5) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0528, code lost:
    
        r3 = com.google.android.recaptcha.internal.zzku.zzi(r35, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x052e, code lost:
    
        if (r24 != r12.zza) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0530, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzku.zzi(r35, r3, r12);
        r3 = r12.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0536, code lost:
    
        if (r3 < 0) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x053a, code lost:
    
        if (r3 > (r35.length - r0)) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x053c, code lost:
    
        if (r3 != 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x051e, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzk(r35, r0, r3));
        r0 = r0 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0544, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x054a, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x054b, code lost:
    
        r24 = true;
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0526, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zzle.zzk(r35, r0, r3));
        r0 = r0 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06a8, code lost:
    
        if (r12.zzb != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06aa, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06ae, code lost:
    
        r13.zze(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06b1, code lost:
    
        if (r1 >= r5) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06b3, code lost:
    
        r2 = com.google.android.recaptcha.internal.zzku.zzi(r35, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x06b9, code lost:
    
        if (r0 != r12.zza) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06bb, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzku.zzl(r35, r2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06c3, code lost:
    
        if (r12.zzb == 0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06ac, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x06ae, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0c85, code lost:
    
        if (r5 == 1048575) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c87, code lost:
    
        r31.putInt(r34, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c8d, code lost:
    
        r8 = r13.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c92, code lost:
    
        if (r8 >= r13.zzl) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c94, code lost:
    
        zzy(r34, r13.zzj[r8], null, r13.zzm, r34);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ca9, code lost:
    
        if (r10 != 0) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cab, code lost:
    
        if (r6 != r12) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0cb3, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0cb8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0cb4, code lost:
    
        if (r6 > r12) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0cb6, code lost:
    
        if (r9 != r10) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cbe, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b50 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x090f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b62 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x053c -> B:253:0x0518). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:291:0x05d5 -> B:285:0x05b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:309:0x0628 -> B:303:0x05ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:350:0x06c3 -> B:344:0x06aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.recaptcha.internal.zzkt r39) {
        /*
            Method dump skipped, instructions count: 3448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        int i10;
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            while (i10 < iArr.length) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j10 = i11;
                if (zzt != 9) {
                    if (zzt == 60 || zzt == 68) {
                        if (!zzR(obj, this.zzc[i10], i10)) {
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    } else {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            case 40:
                            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                            case 48:
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                ((zznk) zzps.zzf(obj, j10)).zzb();
                                continue;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzN(obj, i10) ? 0 : i10 + 3;
                zzx(i10).zzf(zzb.getObject(obj, j10));
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzps.zzo(obj, j10, zzps.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzps.zzp(obj, j10, zzps.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 3:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 4:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 5:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 6:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 7:
                    if (zzN(obj2, i10)) {
                        zzps.zzm(obj, j10, zzps.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 9:
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 11:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 12:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 13:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 14:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 15:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 16:
                    if (!zzN(obj2, i10)) {
                        break;
                    }
                    zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                    zzH(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case 40:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case 48:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zznk zznkVar = (zznk) zzps.zzf(obj, j10);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j10);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j10, zznkVar2);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    int i13 = zzoy.zza;
                    zzps.zzs(obj, j10, zzod.zzb(zzps.zzf(obj, j10), zzps.zzf(obj2, j10)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzF(obj, obj2, i10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzR(obj2, i12, i10)) {
                        break;
                    }
                    zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                    zzI(obj, i12, i10);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x0139  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r12, com.google.android.recaptcha.internal.zzov r13, com.google.android.recaptcha.internal.zzmo r14) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzov, com.google.android.recaptcha.internal.zzmo):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkt zzktVar) {
        zzc(obj, bArr, i10, i11, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzpy r25) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i10) && Double.doubleToLongBits(zzps.zza(obj, j10)) == Double.doubleToLongBits(zzps.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i10) && Float.floatToIntBits(zzps.zzb(obj, j10)) == Float.floatToIntBits(zzps.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i10) && zzps.zzw(obj, j10) == zzps.zzw(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i10) && zzps.zzc(obj, j10) == zzps.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i10) && zzps.zzd(obj, j10) == zzps.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i10) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case 40:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case 48:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    if (!zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long zzr = zzr(i10) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i14];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
