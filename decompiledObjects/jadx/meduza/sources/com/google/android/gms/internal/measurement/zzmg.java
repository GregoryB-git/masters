package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzmg {
    private static final zzmu<?, ?> zza = new zzmw();

    public static int zza(int i10, Object obj, zzme<?> zzmeVar) {
        return obj instanceof zzku ? zzjn.zzb(i10, (zzku) obj) : zzjn.zzb(i10, (zzlm) obj, zzmeVar);
    }

    public static int zza(int i10, List<zziy> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = zzjn.zzf(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzf += zzjn.zza(list.get(i11));
        }
        return zzf;
    }

    public static int zza(int i10, List<zzlm> list, zzme<?> zzmeVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzjn.zza(i10, list.get(i12), zzmeVar);
        }
        return i11;
    }

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjn.zza(i10, true) * size;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzmu<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzmu<UT, UB> zzmuVar) {
        if (ub2 == null) {
            ub2 = zzmuVar.zzc(obj);
        }
        zzmuVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzkl zzklVar, UB ub2, zzmu<UT, UB> zzmuVar) {
        if (zzklVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzklVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzmuVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzklVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzmuVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zziy> list, zznl zznlVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zznl zznlVar, zzme<?> zzmeVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i10, list, (zzme) zzmeVar);
    }

    public static void zza(int i10, List<Boolean> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i10, list, z10);
    }

    public static <T, FT extends zzjy<FT>> void zza(zzjv<FT> zzjvVar, T t, T t10) {
        zzjw<FT> zza2 = zzjvVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjvVar.zzb(t).zza(zza2);
    }

    public static <T> void zza(zzlj zzljVar, T t, T t10, long j10) {
        zzmz.zza(t, j10, zzljVar.zza(zzmz.zze(t, j10), zzmz.zze(t10, j10)));
    }

    public static <T, UT, UB> void zza(zzmu<UT, UB> zzmuVar, T t, T t10) {
        zzmuVar.zzc(t, zzmuVar.zza(zzmuVar.zzd(t), zzmuVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzkg.class.isAssignableFrom(cls);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzb(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzf = zzjn.zzf(i10) * size;
        if (list instanceof zzkx) {
            zzkx zzkxVar = (zzkx) list;
            while (i11 < size) {
                Object zza2 = zzkxVar.zza(i11);
                zzf = (zza2 instanceof zziy ? zzjn.zza((zziy) zza2) : zzjn.zza((String) zza2)) + zzf;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzf = (obj instanceof zziy ? zzjn.zza((zziy) obj) : zzjn.zza((String) obj)) + zzf;
                i11++;
            }
        }
        return zzf;
    }

    public static int zzb(int i10, List<?> list, zzme<?> zzmeVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = zzjn.zzf(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzf = (obj instanceof zzku ? zzjn.zza((zzku) obj) : zzjn.zza((zzlm) obj, zzmeVar)) + zzf;
        }
        return zzf;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zzb(list);
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkh) {
            zzkh zzkhVar = (zzkh) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zza(zzkhVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zza(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzb(int i10, List<String> list, zznl zznlVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zznl zznlVar, zzme<?> zzmeVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i10, list, (zzme) zzmeVar);
    }

    public static void zzb(int i10, List<Double> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i10, list, z10);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjn.zzb(i10, 0) * size;
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static void zzc(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzc(i10, list, z10);
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjn.zza(i10, 0L) * size;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static void zzd(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzd(i10, list, z10);
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkh) {
            zzkh zzkhVar = (zzkh) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzc(zzkhVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zze(int i10, List<Long> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zze(i10, list, z10);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * list.size()) + zzf(list);
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzb(zzlbVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzb(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzf(int i10, List<Float> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzf(i10, list, z10);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zzg(list);
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkh) {
            zzkh zzkhVar = (zzkh) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zze(zzkhVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zze(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzg(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzg(i10, list, z10);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zzh(list);
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzd(zzlbVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzh(int i10, List<Long> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzh(i10, list, z10);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zzi(list);
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkh) {
            zzkh zzkhVar = (zzkh) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzg(zzkhVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zzg(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzi(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzi(i10, list, z10);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjn.zzf(i10) * size) + zzj(list);
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zze(zzlbVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjn.zze(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzj(int i10, List<Long> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zznl zznlVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzn(i10, list, z10);
    }
}
