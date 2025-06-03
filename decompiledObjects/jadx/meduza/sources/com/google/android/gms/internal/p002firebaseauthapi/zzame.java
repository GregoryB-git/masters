package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzame {
    private static final zzamv<?, ?> zza = new zzamx();

    public static int zza(int i10, Object obj, zzamc<?> zzamcVar) {
        return obj instanceof zzakv ? zzajo.zzb(i10, (zzakv) obj) : zzajo.zzb(i10, (zzaln) obj, zzamcVar);
    }

    public static int zza(int i10, List<zzaiw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzg += zzajo.zza(list.get(i11));
        }
        return zzg;
    }

    public static int zza(int i10, List<zzaln> list, zzamc<?> zzamcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzajo.zza(i10, list.get(i12), zzamcVar);
        }
        return i11;
    }

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zza(i10, true) * size;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzamv<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzamv<UT, UB> zzamvVar) {
        if (ub2 == null) {
            ub2 = zzamvVar.zzc(obj);
        }
        zzamvVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzakk zzakkVar, UB ub2, zzamv<UT, UB> zzamvVar) {
        if (zzakkVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzakkVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzamvVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzakkVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzamvVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zzaiw> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i10, list, (zzamc) zzamcVar);
    }

    public static void zza(int i10, List<Boolean> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i10, list, z10);
    }

    public static <T, FT extends zzaka<FT>> void zza(zzajx<FT> zzajxVar, T t, T t10) {
        zzajy<FT> zza2 = zzajxVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzajxVar.zzb(t).zza(zza2);
    }

    public static <T> void zza(zzalg zzalgVar, T t, T t10, long j10) {
        zzana.zza(t, j10, zzalgVar.zza(zzana.zze(t, j10), zzana.zze(t10, j10)));
    }

    public static <T, UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t, T t10) {
        zzamvVar.zzc(t, zzamvVar.zza(zzamvVar.zzd(t), zzamvVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzakg.class.isAssignableFrom(cls);
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
        int zzg = zzajo.zzg(i10) * size;
        if (list instanceof zzaku) {
            zzaku zzakuVar = (zzaku) list;
            while (i11 < size) {
                Object zza2 = zzakuVar.zza(i11);
                zzg = (zza2 instanceof zzaiw ? zzajo.zza((zzaiw) zza2) : zzajo.zza((String) zza2)) + zzg;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzg = (obj instanceof zzaiw ? zzajo.zza((zzaiw) obj) : zzajo.zza((String) obj)) + zzg;
                i11++;
            }
        }
        return zzg;
    }

    public static int zzb(int i10, List<?> list, zzamc<?> zzamcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzg = (obj instanceof zzakv ? zzajo.zza((zzakv) obj) : zzajo.zza((zzaln) obj, zzamcVar)) + zzg;
        }
        return zzg;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zzb(list);
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zza(zzakjVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zza(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzb(int i10, List<String> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i10, list, (zzamc) zzamcVar);
    }

    public static void zzb(int i10, List<Double> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i10, list, z10);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zzb(i10, 0) * size;
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static void zzc(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzc(i10, list, z10);
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajo.zza(i10, 0L) * size;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static void zzd(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzd(i10, list, z10);
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzc(zzakjVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zze(int i10, List<Long> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zze(i10, list, z10);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * list.size()) + zzf(list);
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzb(zzakyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzb(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzf(int i10, List<Float> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzf(i10, list, z10);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zzg(list);
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzf(zzakjVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzg(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzg(i10, list, z10);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zzh(list);
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzd(zzakyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzh(int i10, List<Long> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzh(i10, list, z10);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zzi(list);
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzh(zzakjVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzi(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzi(i10, list, z10);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajo.zzg(i10) * size) + zzj(list);
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zze(zzakyVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzajo.zze(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzj(int i10, List<Long> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzanm zzanmVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzn(i10, list, z10);
    }
}
