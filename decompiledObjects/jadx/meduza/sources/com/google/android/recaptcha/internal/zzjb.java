package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.d;
import sb.y;

/* loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        d[] dVarArr = {new d(-4, zzba.zzo), new d(-12, zzba.zzp), new d(-6, zzba.zzk), new d(-11, zzba.zzm), new d(-13, zzba.zzq), new d(-14, zzba.zzr), new d(-2, zzba.zzl), new d(-7, zzba.zzs), new d(-5, zzba.zzt), new d(-9, zzba.zzu), new d(-8, zzba.zzE), new d(-15, zzba.zzn), new d(-1, zzba.zzv), new d(-3, zzba.zzx), new d(-10, zzba.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(15));
        for (int i10 = 0; i10 < 15; i10++) {
            d dVar = dVarArr[i10];
            linkedHashMap.put(dVar.f13844a, dVar.f13845b);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            linkedHashMap.put(-16, zzba.zzw);
        }
        if (i11 >= 27) {
            linkedHashMap.put(1, zzba.zzA);
            linkedHashMap.put(2, zzba.zzB);
            linkedHashMap.put(0, zzba.zzC);
            linkedHashMap.put(3, zzba.zzD);
        }
        if (i11 >= 29) {
            linkedHashMap.put(4, zzba.zzz);
        }
        return linkedHashMap;
    }
}
