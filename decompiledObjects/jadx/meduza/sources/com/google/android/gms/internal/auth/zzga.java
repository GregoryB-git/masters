package com.google.android.gms.internal.auth;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int zzl = zzl(i10);
        long j10 = zzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i10);
        long j11 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object zzf = zzhj.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzE(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r30, com.google.android.gms.internal.auth.zzfu r31, com.google.android.gms.internal.auth.zzgc r32, com.google.android.gms.internal.auth.zzfl r33, com.google.android.gms.internal.auth.zzgz r34, com.google.android.gms.internal.auth.zzem r35, com.google.android.gms.internal.auth.zzfs r36) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
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

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzr = zzr(i10);
        int zzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
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

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int zzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j10, zzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j10, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int zzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = zzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j10, zzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j10, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int zzl = zzl(i10);
        long j10 = 1048575 & zzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e1, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f5, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f3, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0609, code lost:
    
        if (r1 == 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x060b, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0619, code lost:
    
        if (r0 >= r11) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x061b, code lost:
    
        r1 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0621, code lost:
    
        if (r14 != r9.zza) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0623, code lost:
    
        r0 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r1, r9);
        r1 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0629, code lost:
    
        if (r1 < 0) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x062d, code lost:
    
        if (r1 > (r38.length - r0)) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x062f, code lost:
    
        if (r1 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0611, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzk(r38, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0636, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x063b, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x063c, code lost:
    
        r1 = r0;
        r12 = r5;
        r7 = r13;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0619, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzk(r38, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0781, code lost:
    
        if (r5.zzb != 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0783, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0787, code lost:
    
        r12.zze(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x078a, code lost:
    
        if (r2 >= r40) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x078c, code lost:
    
        r8 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0792, code lost:
    
        if (r14 != r5.zza) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0794, code lost:
    
        r2 = com.google.android.gms.internal.auth.zzdu.zzk(r38, r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x079c, code lost:
    
        if (r5.zzb == 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0785, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0787, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0c84, code lost:
    
        if (r6 == 1048575) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0c86, code lost:
    
        r10.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0c8a, code lost:
    
        r3 = r0.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0c8e, code lost:
    
        if (r3 >= r0.zzj) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0c90, code lost:
    
        r5 = r0.zzh[r3];
        r6 = r0.zzc[r5];
        r6 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r0.zzo(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ca2, code lost:
    
        if (r6 != null) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0ca9, code lost:
    
        if (r0.zzq(r5) != null) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0cae, code lost:
    
        r6 = (com.google.android.gms.internal.auth.zzfr) r6;
        r1 = (com.google.android.gms.internal.auth.zzfq) r0.zzs(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0cb6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0cab, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cb7, code lost:
    
        if (r8 != 0) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0cb9, code lost:
    
        if (r1 != r11) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0cc0, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0cc5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0cc1, code lost:
    
        if (r1 > r11) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0cc3, code lost:
    
        if (r4 != r8) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cca, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0c2f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:288:0x062f -> B:280:0x060b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x06ca -> B:313:0x06a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:337:0x0714 -> B:331:0x06eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:375:0x079c -> B:369:0x0783). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) {
        /*
            Method dump skipped, instructions count: 3420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        int i10;
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzo = zzo(i10);
                int i11 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j10 = i11;
                if (zzn != 9) {
                    if (zzn == 60 || zzn == 68) {
                        if (!zzI(obj, this.zzc[i10], i10)) {
                        }
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    } else {
                        switch (zzn) {
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
                                this.zzk.zza(obj, j10);
                                continue;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    }
                }
                i10 = zzE(obj, i10) ? 0 : i10 + 3;
                zzr(i10).zze(zzb.getObject(obj, j10));
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i10)) {
                        zzhj.zzl(obj, j10, zzhj.zza(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i10)) {
                        zzhj.zzm(obj, j10, zzhj.zzb(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 3:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 4:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 5:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 6:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 7:
                    if (zzE(obj2, i10)) {
                        zzhj.zzk(obj, j10, zzhj.zzt(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 9:
                case 17:
                    zzx(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 11:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 12:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 13:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 14:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 15:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                    zzz(obj, i10);
                    break;
                case 16:
                    if (!zzE(obj2, i10)) {
                        break;
                    }
                    zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                    zzz(obj, i10);
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
                    this.zzk.zzb(obj, obj2, j10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    int i12 = zzgk.zza;
                    zzhj.zzp(obj, j10, zzfs.zza(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10)));
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
                    if (!zzI(obj2, i11, i10)) {
                        break;
                    }
                    zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                    zzA(obj, i11, i10);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzy(obj, obj2, i10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzI(obj2, i11, i10)) {
                        break;
                    }
                    zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                    zzA(obj, i11, i10);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzo = zzo(i10);
            long j10 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i10) && Double.doubleToLongBits(zzhj.zza(obj, j10)) == Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i10) && Float.floatToIntBits(zzhj.zzb(obj, j10)) == Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i10) && zzhj.zzt(obj, j10) == zzhj.zzt(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i10) && zzhj.zzc(obj, j10) == zzhj.zzc(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i10) && zzhj.zzd(obj, j10) == zzhj.zzd(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i10) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    if (!zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    long zzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzi) {
            int i15 = this.zzh[i14];
            int i16 = this.zzc[i15];
            int zzo = zzo(i15);
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
            if ((268435456 & zzo) != 0 && !zzF(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj, i16, i15) && !zzG(obj, zzo, zzr(i15))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzfr) zzhj.zzf(obj, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzr.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj, i15, i10, i11, i19) && !zzG(obj, zzo, zzr(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }
}
