package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import defpackage.f;
import java.io.UnsupportedEncodingException;
import java.util.List;
import m6.j;

/* loaded from: classes.dex */
public final class zzagy {
    public static long zza(String str) {
        zzagx zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzagx zzb(String str) {
        j.e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            throw new RuntimeException(f.j("Invalid idToken ", str));
        }
        String str2 = zza.get(1);
        try {
            return zzagx.zza(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Unable to decode token", e10);
        }
    }
}
