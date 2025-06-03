package com.google.android.gms.auth;

import android.content.Intent;
import defpackage.g;
import z3.f;

/* loaded from: classes.dex */
public class UserRecoverableAuthException extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2749b;

    public UserRecoverableAuthException(String str, Intent intent, int i10) {
        super(str);
        this.f2748a = intent;
        g.j(i10);
        this.f2749b = i10;
    }
}
