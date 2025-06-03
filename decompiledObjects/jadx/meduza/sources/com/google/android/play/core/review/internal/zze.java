package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import k7.b;
import k7.c;

/* loaded from: classes.dex */
public abstract class zze extends zzb implements c {
    public static c zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new b(iBinder);
    }
}
