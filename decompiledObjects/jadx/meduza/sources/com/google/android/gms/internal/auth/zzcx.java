package com.google.android.gms.internal.auth;

import a0.j;
import defpackage.f;

/* loaded from: classes.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z10) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            j.t(f.m("Invalid double value for ", this.zzc, ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
