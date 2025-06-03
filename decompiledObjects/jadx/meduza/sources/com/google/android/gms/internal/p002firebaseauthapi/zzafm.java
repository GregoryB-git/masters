package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;
import u7.f;

/* loaded from: classes.dex */
public final class zzafm {
    private static final Map<String, zzafl> zza = new b();
    private static final Map<String, List<WeakReference<zzafo>>> zzb = new b();

    public static String zza(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            return g.d(zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    private static String zza(String str, int i10, boolean z10) {
        StringBuilder sb2;
        String str2;
        if (z10) {
            sb2 = new StringBuilder("http://[");
            sb2.append(str);
            str2 = "]:";
        } else {
            sb2 = new StringBuilder("http://");
            sb2.append(str);
            str2 = ":";
        }
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        return sb2.toString();
    }

    public static void zza(String str, zzafo zzafoVar) {
        Map<String, List<WeakReference<zzafo>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzafoVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzafoVar));
                map.put(str, arrayList);
            }
        }
    }

    public static String zzb(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        return g.d(zzaflVar != null ? g.d("", zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        return g.d(zzaflVar != null ? g.d("", zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        return g.d(zzaflVar != null ? g.d("", zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static void zza(f fVar, String str, int i10) {
        fVar.a();
        String str2 = fVar.f15086c.f15096a;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            map.put(str2, new zzafl(str, i10));
        }
        Map<String, List<WeakReference<zzafo>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(str2)) {
                boolean z10 = false;
                Iterator<WeakReference<zzafo>> it = map2.get(str2).iterator();
                while (it.hasNext()) {
                    zzafo zzafoVar = it.next().get();
                    if (zzafoVar != null) {
                        z10 = true;
                        zzafoVar.zza();
                    }
                }
                if (!z10) {
                    zza.remove(str2);
                }
            }
        }
    }

    public static boolean zza(f fVar) {
        Map<String, zzafl> map = zza;
        fVar.a();
        return map.containsKey(fVar.f15086c.f15096a);
    }
}
