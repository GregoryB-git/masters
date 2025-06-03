package com.google.android.gms.internal.auth;

import a0.j;
import defpackage.f;

/* loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z10) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            j.t(f.m("Invalid long value for ", this.zzc, ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
