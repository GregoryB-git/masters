package A2;

import android.app.Activity;
import android.content.Intent;

/* renamed from: A2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339z extends B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f542c;

    public C0339z(Intent intent, Activity activity, int i7) {
        this.f540a = intent;
        this.f541b = activity;
        this.f542c = i7;
    }

    @Override // A2.B
    public final void a() {
        Intent intent = this.f540a;
        if (intent != null) {
            this.f541b.startActivityForResult(intent, this.f542c);
        }
    }
}
