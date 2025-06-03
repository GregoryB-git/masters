package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzago {
    private List<zzagl> zza;

    public zzago() {
        this.zza = new ArrayList();
    }

    public zzago(List<zzagl> list) {
        this.zza = Collections.unmodifiableList(list);
    }

    public final List<zzagl> zza() {
        return this.zza;
    }
}
