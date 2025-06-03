package com.google.android.recaptcha.internal;

import ec.i;
import java.lang.reflect.Method;
import sb.j;
import sb.s;

/* loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? j.j(objArr) : s.f14324a);
        return true;
    }
}
