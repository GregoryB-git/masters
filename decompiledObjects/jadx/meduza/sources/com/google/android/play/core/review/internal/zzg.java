package com.google.android.play.core.review.internal;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.f;
import j7.c;
import j7.g;
import k7.a;
import k7.i;
import k7.n;

/* loaded from: classes.dex */
public abstract class zzg extends zzb {
    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean g(int i10, Parcel parcel) {
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = a.f9103a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(f.h("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        g gVar = (g) this;
        n nVar = gVar.f8537c.f8539a;
        if (nVar != null) {
            TaskCompletionSource taskCompletionSource = gVar.f8536b;
            synchronized (nVar.f) {
                nVar.f9123e.remove(taskCompletionSource);
            }
            nVar.a().post(new i(nVar));
        }
        gVar.f8535a.a("onGetLaunchReviewFlowInfo", new Object[0]);
        gVar.f8536b.trySetResult(new c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }
}
