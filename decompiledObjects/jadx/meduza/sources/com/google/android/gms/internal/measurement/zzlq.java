package com.google.android.gms.internal.measurement;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import defpackage.f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzlq<T> implements zzme<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlu zzn;
    private final zzkw zzo;
    private final zzmu<?, ?> zzp;
    private final zzjv<?> zzq;
    private final zzlj zzr;

    private zzlq(int[] iArr, Object[] objArr, int i10, int i11, zzlm zzlmVar, boolean z10, int[] iArr2, int i12, int i13, zzlu zzluVar, zzkw zzkwVar, zzmu<?, ?> zzmuVar, zzjv<?> zzjvVar, zzlj zzljVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzlmVar instanceof zzkg;
        this.zzh = zzjvVar != null && zzjvVar.zza(zzlmVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzn = zzluVar;
        this.zzo = zzkwVar;
        this.zzp = zzmuVar;
        this.zzq = zzjvVar;
        this.zzg = zzlmVar;
        this.zzr = zzljVar;
    }

    private static <T> double zza(T t, long j10) {
        return ((Double) zzmz.zze(t, j10)).doubleValue();
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    private static int zza(byte[] bArr, int i10, int i11, zzng zzngVar, Class<?> cls, zzit zzitVar) {
        int zzd;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i12;
        long j10;
        switch (zzlt.zza[zzngVar.ordinal()]) {
            case 1:
                zzd = zziu.zzd(bArr, i10, zzitVar);
                valueOf = Boolean.valueOf(zzitVar.zzb != 0);
                zzitVar.zzc = valueOf;
                return zzd;
            case 2:
                return zziu.zza(bArr, i10, zzitVar);
            case 3:
                valueOf2 = Double.valueOf(zziu.zza(bArr, i10));
                zzitVar.zzc = valueOf2;
                return i10 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(zziu.zzc(bArr, i10));
                zzitVar.zzc = valueOf3;
                return i10 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(zziu.zzd(bArr, i10));
                zzitVar.zzc = valueOf2;
                return i10 + 8;
            case 8:
                valueOf3 = Float.valueOf(zziu.zzb(bArr, i10));
                zzitVar.zzc = valueOf3;
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                zzd = zziu.zzc(bArr, i10, zzitVar);
                i12 = zzitVar.zza;
                valueOf = Integer.valueOf(i12);
                zzitVar.zzc = valueOf;
                return zzd;
            case 12:
            case 13:
                zzd = zziu.zzd(bArr, i10, zzitVar);
                j10 = zzitVar.zzb;
                valueOf = Long.valueOf(j10);
                zzitVar.zzc = valueOf;
                return zzd;
            case 14:
                return zziu.zza(zzma.zza().zza((Class) cls), bArr, i10, i11, zzitVar);
            case 15:
                zzd = zziu.zzc(bArr, i10, zzitVar);
                i12 = zzjk.zze(zzitVar.zza);
                valueOf = Integer.valueOf(i12);
                zzitVar.zzc = valueOf;
                return zzd;
            case 16:
                zzd = zziu.zzd(bArr, i10, zzitVar);
                j10 = zzjk.zza(zzitVar.zzb);
                valueOf = Long.valueOf(j10);
                zzitVar.zzc = valueOf;
                return zzd;
            case 17:
                return zziu.zzb(bArr, i10, zzitVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.measurement.zzlq<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.zzlk r34, com.google.android.gms.internal.measurement.zzlu r35, com.google.android.gms.internal.measurement.zzkw r36, com.google.android.gms.internal.measurement.zzmu<?, ?> r37, com.google.android.gms.internal.measurement.zzjv<?> r38, com.google.android.gms.internal.measurement.zzlj r39) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzlu, com.google.android.gms.internal.measurement.zzkw, com.google.android.gms.internal.measurement.zzmu, com.google.android.gms.internal.measurement.zzjv, com.google.android.gms.internal.measurement.zzlj):com.google.android.gms.internal.measurement.zzlq");
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzkl zzklVar, UB ub2, zzmu<UT, UB> zzmuVar, Object obj) {
        zzlh<?, ?> zza2 = this.zzr.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzklVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzmuVar.zzc(obj);
                }
                zzjd zzc = zziy.zzc(zzle.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzle.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmuVar.zza((zzmu<UT, UB>) ub2, i11, zzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i10) {
        zzme zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzlq<T>) t, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i10, int i11) {
        zzme zze = zze(i11);
        if (!zzc((zzlq<T>) t, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzmu<UT, UB> zzmuVar, Object obj2) {
        zzkl zzd;
        int i11 = this.zzc[i10];
        Object zze = zzmz.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzr.zze(zze), zzd, (zzkl) ub2, (zzmu<UT, zzkl>) zzmuVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
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

    private static void zza(int i10, Object obj, zznl zznlVar) {
        if (obj instanceof String) {
            zznlVar.zza(i10, (String) obj);
        } else {
            zznlVar.zza(i10, (zziy) obj);
        }
    }

    private static <UT, UB> void zza(zzmu<UT, UB> zzmuVar, T t, zznl zznlVar) {
        zzmuVar.zzb((zzmu<UT, UB>) zzmuVar.zzd(t), zznlVar);
    }

    private final <K, V> void zza(zznl zznlVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zznlVar.zza(i10, this.zzr.zza(zzf(i11)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t, int i10, int i11, Object obj) {
        zzb.putObject(t, zzc(i11) & 1048575, obj);
        zzb((zzlq<T>) t, i10, i11);
    }

    private final void zza(Object obj, int i10, zzmf zzmfVar) {
        long j10;
        Object zzp;
        if (zzg(i10)) {
            j10 = i10 & 1048575;
            zzp = zzmfVar.zzr();
        } else {
            int i11 = i10 & 1048575;
            if (this.zzi) {
                j10 = i11;
                zzp = zzmfVar.zzq();
            } else {
                j10 = i11;
                zzp = zzmfVar.zzp();
            }
        }
        zzmz.zza(obj, j10, zzp);
    }

    private final void zza(T t, int i10, Object obj) {
        zzb.putObject(t, zzc(i10) & 1048575, obj);
        zzb((zzlq<T>) t, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t10, int i10) {
        if (zzc((zzlq<T>) t10, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
            }
            zzme zze = zze(i10);
            if (!zzc((zzlq<T>) t, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                } else {
                    unsafe.putObject(t, zzc, object);
                }
                zzb((zzlq<T>) t, i10);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final boolean zza(T t, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzc((zzlq<T>) t, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzme zzmeVar) {
        return zzmeVar.zze(zzmz.zze(obj, i10 & 1048575));
    }

    private static <T> float zzb(T t, long j10) {
        return ((Float) zzmz.zze(t, j10)).floatValue();
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    private final void zzb(T t, int i10) {
        int zzb2 = zzb(i10);
        long j10 = 1048575 & zzb2;
        if (j10 == 1048575) {
            return;
        }
        zzmz.zza((Object) t, j10, (1 << (zzb2 >>> 20)) | zzmz.zzc(t, j10));
    }

    private final void zzb(T t, int i10, int i11) {
        zzmz.zza((Object) t, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t10, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzlq<T>) t10, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
            }
            zzme zze = zze(i10);
            if (!zzc((zzlq<T>) t, i11, i10)) {
                if (zzg(object)) {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                } else {
                    unsafe.putObject(t, zzc, object);
                }
                zzb((zzlq<T>) t, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> int zzc(T t, long j10) {
        return ((Integer) zzmz.zze(t, j10)).intValue();
    }

    public static zzmx zzc(Object obj) {
        zzkg zzkgVar = (zzkg) obj;
        zzmx zzmxVar = zzkgVar.zzb;
        if (zzmxVar != zzmx.zzc()) {
            return zzmxVar;
        }
        zzmx zzd = zzmx.zzd();
        zzkgVar.zzb = zzd;
        return zzd;
    }

    private final boolean zzc(T t, int i10) {
        int zzb2 = zzb(i10);
        long j10 = zzb2 & 1048575;
        if (j10 != 1048575) {
            return (zzmz.zzc(t, j10) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j11 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmz.zza(t, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmz.zzb(t, j11)) != 0;
            case 2:
                return zzmz.zzd(t, j11) != 0;
            case 3:
                return zzmz.zzd(t, j11) != 0;
            case 4:
                return zzmz.zzc(t, j11) != 0;
            case 5:
                return zzmz.zzd(t, j11) != 0;
            case 6:
                return zzmz.zzc(t, j11) != 0;
            case 7:
                return zzmz.zzh(t, j11);
            case 8:
                Object zze = zzmz.zze(t, j11);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zziy) {
                    return !zziy.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmz.zze(t, j11) != null;
            case 10:
                return !zziy.zza.equals(zzmz.zze(t, j11));
            case 11:
                return zzmz.zzc(t, j11) != 0;
            case 12:
                return zzmz.zzc(t, j11) != 0;
            case 13:
                return zzmz.zzc(t, j11) != 0;
            case 14:
                return zzmz.zzd(t, j11) != 0;
            case 15:
                return zzmz.zzc(t, j11) != 0;
            case 16:
                return zzmz.zzd(t, j11) != 0;
            case 17:
                return zzmz.zze(t, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t, int i10, int i11) {
        return zzmz.zzc(t, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final boolean zzc(T t, T t10, int i10) {
        return zzc((zzlq<T>) t, i10) == zzc((zzlq<T>) t10, i10);
    }

    private static <T> long zzd(T t, long j10) {
        return ((Long) zzmz.zze(t, j10)).longValue();
    }

    private final zzkl zzd(int i10) {
        return (zzkl) this.zzd[((i10 / 3) << 1) + 1];
    }

    private final zzme zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzme zzmeVar = (zzme) this.zzd[i11];
        if (zzmeVar != null) {
            return zzmeVar;
        }
        zzme<T> zza2 = zzma.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private static <T> boolean zze(T t, long j10) {
        return ((Boolean) zzmz.zze(t, j10)).booleanValue();
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException(f.j("Mutating immutable message: ", String.valueOf(obj)));
        }
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkg) {
            return ((zzkg) obj).zzcq();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0224, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0231, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023e, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024b, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019c, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024d, code lost:
    
        r12 = r12 + ((com.google.android.gms.internal.measurement.zzjn.zzg(r0) + com.google.android.gms.internal.measurement.zzjn.zzf(r13)) + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01aa, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d4, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f0, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01fd, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020a, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0217, code lost:
    
        if (r0 > 0) goto L122;
     */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r19) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0a39, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0574, code lost:
    
        if (r1 == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0576, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.zziy.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0584, code lost:
    
        if (r0 >= r9) goto L670;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0586, code lost:
    
        r1 = com.google.android.gms.internal.measurement.zziu.zzc(r14, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x058c, code lost:
    
        if (r15 != r13.zza) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x058e, code lost:
    
        r0 = com.google.android.gms.internal.measurement.zziu.zzc(r14, r1, r13);
        r1 = r13.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0594, code lost:
    
        if (r1 < 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0598, code lost:
    
        if (r1 > (r14.length - r0)) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x059a, code lost:
    
        if (r1 != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x057c, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.zziy.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x05a1, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05a6, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0584, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.zziy.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06da, code lost:
    
        if (r10.zzb != 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06dc, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06e0, code lost:
    
        r12.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06e3, code lost:
    
        if (r0 >= r2) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x06e5, code lost:
    
        r5 = com.google.android.gms.internal.measurement.zziu.zzc(r14, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x06eb, code lost:
    
        if (r15 != r10.zza) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x06ed, code lost:
    
        r0 = com.google.android.gms.internal.measurement.zziu.zzd(r14, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x06f5, code lost:
    
        if (r10.zzb == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x06de, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x06e0, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d34, code lost:
    
        if (r13 == 1048575) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d36, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d3c, code lost:
    
        r3 = null;
        r8 = r11.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d43, code lost:
    
        if (r8 >= r11.zzm) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d45, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmx) zza((java.lang.Object) r31, r11.zzk[r8], (int) r3, (com.google.android.gms.internal.measurement.zzmu<UT, int>) r11.zzp, (java.lang.Object) r31);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d5b, code lost:
    
        if (r3 == null) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d5d, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d62, code lost:
    
        if (r6 != 0) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d64, code lost:
    
        if (r7 != r9) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d6b, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d70, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d6c, code lost:
    
        if (r7 > r9) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d6e, code lost:
    
        if (r10 != r6) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d75, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0d1f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x065f  */
    /* JADX WARN: Type inference failed for: r1v124, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x059a -> B:215:0x0576). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:250:0x0627 -> B:244:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x066f -> B:262:0x0646). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x06f5 -> B:300:0x06dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.zzit r36) {
        /*
            Method dump skipped, instructions count: 3594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzit):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05b5 A[Catch: all -> 0x026f, TryCatch #8 {all -> 0x026f, blocks: (B:213:0x0586, B:17:0x05b0, B:19:0x05b5, B:20:0x05ba, B:53:0x00ce, B:13:0x00db, B:55:0x00e0, B:56:0x00fb, B:58:0x00ee, B:60:0x00ff, B:62:0x010d, B:64:0x011b, B:66:0x0125, B:69:0x012c, B:70:0x0132, B:72:0x013c, B:74:0x014a, B:12:0x0154, B:76:0x0163, B:78:0x016c, B:80:0x017a, B:82:0x0189, B:84:0x0198, B:86:0x01a7, B:88:0x01b6, B:90:0x01c5, B:92:0x01d4, B:94:0x01e3, B:96:0x01f3, B:97:0x0214, B:98:0x01fd, B:100:0x0205, B:102:0x0225, B:104:0x0237, B:106:0x0245, B:108:0x0253, B:110:0x0261), top: B:212:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05eb A[LOOP:3: B:229:0x05e7->B:231:0x05eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzmf] */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzmf r19, com.google.android.gms.internal.measurement.zzjt r20) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzjt):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b31  */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznl r25) {
        /*
            Method dump skipped, instructions count: 3176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznl):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, T t10) {
        zzf(t);
        t10.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j10 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlq<T>) t10, i10)) {
                        zzmz.zza(t, j10, zzmz.zza(t10, j10));
                        zzb((zzlq<T>) t, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlq<T>) t10, i10)) {
                        zzmz.zza((Object) t, j10, zzmz.zzb(t10, j10));
                        zzb((zzlq<T>) t, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzd(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 3:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzd(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 4:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 5:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzd(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 6:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 7:
                    if (zzc((zzlq<T>) t10, i10)) {
                        zzmz.zzc(t, j10, zzmz.zzh(t10, j10));
                        zzb((zzlq<T>) t, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza(t, j10, zzmz.zze(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 9:
                case 17:
                    zza(t, t10, i10);
                    break;
                case 10:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza(t, j10, zzmz.zze(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 11:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 12:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 13:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 14:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzd(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 15:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzc(t10, j10));
                    zzb((zzlq<T>) t, i10);
                    break;
                case 16:
                    if (!zzc((zzlq<T>) t10, i10)) {
                        break;
                    }
                    zzmz.zza((Object) t, j10, zzmz.zzd(t10, j10));
                    zzb((zzlq<T>) t, i10);
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
                    this.zzo.zza(t, t10, j10);
                    break;
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    zzmg.zza(this.zzr, t, t10, j10);
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
                    if (!zzc((zzlq<T>) t10, i11, i10)) {
                        break;
                    }
                    zzmz.zza(t, j10, zzmz.zze(t10, j10));
                    zzb((zzlq<T>) t, i11, i10);
                    break;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzb(t, t10, i10);
                    break;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzc((zzlq<T>) t10, i11, i10)) {
                        break;
                    }
                    zzmz.zza(t, j10, zzmz.zze(t10, j10));
                    zzb((zzlq<T>) t, i11, i10);
                    break;
            }
        }
        zzmg.zza(this.zzp, t, t10);
        if (this.zzh) {
            zzmg.zza(this.zzq, t, t10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zza(T t, byte[] bArr, int i10, int i11, zzit zzitVar) {
        zza((zzlq<T>) t, bArr, i10, i11, 0, zzitVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ce, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e0, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzh(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzc(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmz.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmz.zzd(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmz.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmz.zzb(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmz.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmz.zza(r11, r6))) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zza(com.google.android.gms.internal.measurement.zzmz.zze(r10, r6), com.google.android.gms.internal.measurement.zzmz.zze(r11, r6)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.measurement.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlq.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzme
    public final void zzd(T t) {
        int i10;
        if (zzg(t)) {
            if (t instanceof zzkg) {
                zzkg zzkgVar = (zzkg) t;
                zzkgVar.zzc(Integer.MAX_VALUE);
                zzkgVar.zza = 0;
                zzkgVar.zzcp();
            }
            int length = this.zzc.length;
            while (i10 < length) {
                int zzc = zzc(i10);
                long j10 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (!zzc((zzlq<T>) t, this.zzc[i10], i10)) {
                        }
                        zze(i10).zzd(zzb.getObject(t, j10));
                    } else {
                        switch (i11) {
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
                                this.zzo.zzb(t, j10);
                                continue;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j10);
                                if (object != null) {
                                    unsafe.putObject(t, j10, this.zzr.zzc(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        zze(i10).zzd(zzb.getObject(t, j10));
                    }
                }
                i10 = zzc((zzlq<T>) t, i10) ? 0 : i10 + 3;
                zze(i10).zzd(zzb.getObject(t, j10));
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzme] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzme] */
    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zze(T t) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.zzl) {
                return !this.zzh || this.zzq.zza(t).zzg();
            }
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & zzc) != 0) && !zza((zzlq<T>) t, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzlq<T>) t, i16, i15) && !zza((Object) t, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzmz.zze(t, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzr.zza(zzf(i15)).zzc.zzb() == zznj.MESSAGE) {
                                    ?? r12 = 0;
                                    Iterator<?> it = zzd.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = zzma.zza().zza((Class) next.getClass());
                                        }
                                        if (!r12.zze(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzmz.zze(t, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!zze.zze(list.get(i21))) {
                            z10 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (zza((zzlq<T>) t, i15, i10, i11, i19) && !zza((Object) t, zzc, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }
}
