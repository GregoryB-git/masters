package com.google.android.gms.internal.auth;

import a0.j;
import defpackage.f;

/* loaded from: classes.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z10) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        j.t(f.m("Invalid boolean value for ", this.zzc, ": "), (String) obj, "PhenotypeFlag");
        return null;
    }
}
