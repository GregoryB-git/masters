package A2;

import android.content.Intent;
import z2.InterfaceC2304g;

/* loaded from: classes.dex */
public final class A extends B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2304g f371b;

    public A(Intent intent, InterfaceC2304g interfaceC2304g, int i7) {
        this.f370a = intent;
        this.f371b = interfaceC2304g;
    }

    @Override // A2.B
    public final void a() {
        Intent intent = this.f370a;
        if (intent != null) {
            this.f371b.startActivityForResult(intent, 2);
        }
    }
}
