package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    public final int f10247o;

    public GooglePlayServicesManifestException(int i7, String str) {
        super(str);
        this.f10247o = i7;
    }
}
