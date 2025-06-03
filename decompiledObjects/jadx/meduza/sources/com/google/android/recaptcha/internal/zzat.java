package com.google.android.recaptcha.internal;

import ec.j;
import java.util.LinkedHashMap;
import java.util.Map;
import sb.y;

/* loaded from: classes.dex */
final class zzat extends j implements dc.a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map;
        map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // dc.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
