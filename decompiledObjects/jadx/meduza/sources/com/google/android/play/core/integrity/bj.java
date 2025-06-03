package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f2989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j10) {
        super(str, j10);
        this.f2989a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        long j10;
        j10 = this.f2989a.f2992e;
        bundle.putLong("cloud.prj", j10);
        return this.f2989a.f2990c.c(activity, bundle);
    }
}
