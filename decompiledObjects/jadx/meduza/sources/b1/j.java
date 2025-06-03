package b1;

import b1.k;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.c f1743b;

    public j(k kVar, s1.c cVar) {
        this.f1742a = kVar;
        this.f1743b = cVar;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        if (aVar == k.a.ON_START) {
            this.f1742a.c(this);
            this.f1743b.d();
        }
    }
}
