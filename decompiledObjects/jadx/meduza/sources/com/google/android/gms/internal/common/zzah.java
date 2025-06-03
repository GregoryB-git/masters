package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzah extends zzae {
    public zzah() {
        throw null;
    }

    public zzah(int i10) {
        super(4);
    }

    public final zzah zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzah zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }
}
