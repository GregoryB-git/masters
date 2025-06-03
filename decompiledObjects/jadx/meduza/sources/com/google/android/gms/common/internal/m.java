package com.google.android.gms.common.internal;

import android.os.IBinder;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes.dex */
public final class m extends zza implements ICancelToken {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
        zzD(2, zza());
    }
}
