package m6;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f10314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f10315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10316c = 2;

    public r(Activity activity, Intent intent) {
        this.f10314a = intent;
        this.f10315b = activity;
    }

    @Override // m6.t
    public final void a() {
        Intent intent = this.f10314a;
        if (intent != null) {
            this.f10315b.startActivityForResult(intent, this.f10316c);
        }
    }
}
