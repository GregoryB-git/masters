package v3;

import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements l.b, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f15805a;

    public /* synthetic */ w(d0 d0Var) {
        this.f15805a = d0Var;
    }

    @Override // v5.l.b
    public final void d(Object obj, v5.h hVar) {
        ((f1.c) obj).e0(this.f15805a.f, new f1.b(hVar));
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        ((f1.c) obj).F(this.f15805a.N);
    }
}
