package com.google.android.gms.internal.measurement;

import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzg {
    public static double zza(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return Math.floor(Math.abs(d10)) * (d10 > 0.0d ? 1 : -1);
    }

    public static int zza(zzh zzhVar) {
        int zzb = zzb(zzhVar.zza("runtime.counter").zze().doubleValue() + 1.0d);
        if (zzb > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(zzb)));
        return zzb;
    }

    public static zzbv zza(String str) {
        zzbv zza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object zza(zzaq zzaqVar) {
        if (zzaq.zzd.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return zza((zzap) zzaqVar);
        }
        if (!(zzaqVar instanceof zzaf)) {
            return !zzaqVar.zze().isNaN() ? zzaqVar.zze() : zzaqVar.zzf();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
        while (it.hasNext()) {
            Object zza = zza(it.next());
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> zza(zzap zzapVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzapVar.zza()) {
            Object zza = zza(zzapVar.zza(str));
            if (zza != null) {
                hashMap.put(str, zza);
            }
        }
        return hashMap;
    }

    public static void zza(zzbv zzbvVar, int i10, List<zzaq> list) {
        zza(zzbvVar.name(), i10, list);
    }

    public static void zza(String str, int i10, List<zzaq> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (!(zzaqVar instanceof zzai)) {
            return zzaqVar instanceof zzas ? zzaqVar.zzf().equals(zzaqVar2.zzf()) : zzaqVar instanceof zzag ? zzaqVar.zzd().equals(zzaqVar2.zzd()) : zzaqVar == zzaqVar2;
        }
        if (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue())) {
            return false;
        }
        return zzaqVar.zze().equals(zzaqVar2.zze());
    }

    public static int zzb(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d10)) * (d10 > 0.0d ? 1 : -1)) % 4.294967296E9d);
    }

    public static void zzb(zzbv zzbvVar, int i10, List<zzaq> list) {
        zzb(zzbvVar.name(), i10, list);
    }

    public static void zzb(String str, int i10, List<zzaq> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean zzb(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double zze = zzaqVar.zze();
        return !zze.isNaN() && zze.doubleValue() >= 0.0d && zze.equals(Double.valueOf(Math.floor(zze.doubleValue())));
    }

    public static long zzc(double d10) {
        return zzb(d10) & KeyboardMap.kValueMask;
    }

    public static void zzc(String str, int i10, List<zzaq> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }
}
