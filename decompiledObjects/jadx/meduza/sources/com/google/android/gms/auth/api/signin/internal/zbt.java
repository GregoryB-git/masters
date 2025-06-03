package com.google.android.gms.auth.api.signin.internal;

import a0.j;
import android.content.Context;
import android.os.Binder;
import v6.h;

/* loaded from: classes.dex */
public final class zbt extends zbo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2807a;

    public zbt(Context context) {
        this.f2807a = context;
    }

    public final void g() {
        if (!h.a(this.f2807a, Binder.getCallingUid())) {
            throw new SecurityException(j.h("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
