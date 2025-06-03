package s0;

import s0.g;

/* loaded from: classes.dex */
public final class f extends g.a {

    /* renamed from: a, reason: collision with root package name */
    public int f13961a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f13962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f13963c;

    public f(g gVar) {
        this.f13963c = gVar;
        this.f13962b = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13961a < this.f13962b;
    }
}
