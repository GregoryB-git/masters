package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final m7.k f2957a;

    /* renamed from: b, reason: collision with root package name */
    private final m7.k f2958b;

    public at(m7.k kVar, m7.k kVar2) {
        this.f2957a = kVar;
        this.f2958b = kVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, m7.e eVar) {
        Object a10 = this.f2957a.a();
        a10.getClass();
        k kVar = (k) this.f2958b.a();
        kVar.getClass();
        activity.getClass();
        eVar.getClass();
        return new as((Context) a10, kVar, activity, taskCompletionSource, eVar);
    }
}
