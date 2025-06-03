package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import defpackage.f;
import p6.a;

/* loaded from: classes.dex */
final class zzaff implements OnFailureListener {
    public zzaff(zzafd zzafdVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = zzafd.zza;
        aVar.c(f.j("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
