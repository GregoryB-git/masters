package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class zzap implements zzak, zzaq {
    private final Map<String, zzaq> zza = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzap) {
            return this.zza.equals(((zzap) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.zza.isEmpty()) {
            for (String str : this.zza.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.zza.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String str) {
        return this.zza.containsKey(str) ? this.zza.get(str) : zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        return "toString".equals(str) ? new zzas(toString()) : zzan.zza(this, new zzas(str), zzhVar, list);
    }

    public final List<String> zza() {
        return new ArrayList(this.zza.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zza(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzaqVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        Map<String, zzaq> map;
        String key;
        zzaq zzc;
        zzap zzapVar = new zzap();
        for (Map.Entry<String, zzaq> entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                map = zzapVar.zza;
                key = entry.getKey();
                zzc = entry.getValue();
            } else {
                map = zzapVar.zza;
                key = entry.getKey();
                zzc = entry.getValue().zzc();
            }
            map.put(key, zzc);
        }
        return zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return zzan.zza(this.zza);
    }
}
