package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class ah extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai f2930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j10) {
        super(str, j10);
        this.f2930a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        return this.f2930a.f2931a.b(activity, bundle);
    }
}
