package androidx.emoji2.text;

import androidx.emoji2.text.d;

/* loaded from: classes.dex */
public final class c extends d.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f976a;

    public c(d.a aVar) {
        this.f976a = aVar;
    }

    @Override // androidx.emoji2.text.d.h
    public final void a(Throwable th) {
        this.f976a.f988a.d(th);
    }

    @Override // androidx.emoji2.text.d.h
    public final void b(h hVar) {
        d.a aVar = this.f976a;
        aVar.f987c = hVar;
        aVar.f986b = new f(aVar.f987c, new d.i(), aVar.f988a.f985h);
        aVar.f988a.e();
    }
}
