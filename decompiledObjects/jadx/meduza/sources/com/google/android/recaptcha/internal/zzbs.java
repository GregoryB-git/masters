package com.google.android.recaptcha.internal;

import android.content.Context;
import j6.f;

/* loaded from: classes.dex */
public final class zzbs {
    private final f zza;

    public zzbs() {
        this.zza = f.f8490b;
    }

    public zzbs(f fVar) {
        this.zza = fVar;
    }

    public final int zza(Context context) {
        int b10 = this.zza.b(context);
        return (b10 == 1 || b10 == 3 || b10 == 9) ? 4 : 3;
    }
}
