package com.google.android.gms.internal.auth;

import a0.j;
import android.util.Base64;
import defpackage.f;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzcy extends zzdc {
    public final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z10, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhs.zzp(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            j.t(f.m("Invalid byte[] value for ", this.zzc, ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
