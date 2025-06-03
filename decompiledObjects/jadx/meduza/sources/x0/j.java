package x0;

import android.os.Bundle;
import s1.c;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16693b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f16692a = i10;
        this.f16693b = obj;
    }

    @Override // s1.c.b
    public final Bundle a() {
        Bundle lambda$init$0;
        switch (this.f16692a) {
            case 0:
                lambda$init$0 = ((m) this.f16693b).lambda$init$0();
                return lambda$init$0;
            case 1:
                return ((y) this.f16693b).W();
            default:
                return b1.e0.a((b1.e0) this.f16693b);
        }
    }
}
