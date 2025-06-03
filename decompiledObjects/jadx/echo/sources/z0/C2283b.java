package z0;

import c1.j;
import c1.k;
import c1.t;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2283b extends j {

    /* renamed from: p, reason: collision with root package name */
    public final t f21597p;

    public C2283b(String str, t tVar) {
        super(str);
        this.f21597p = tVar;
    }

    @Override // c1.j
    public k B(byte[] bArr, int i7, boolean z7) {
        if (z7) {
            this.f21597p.b();
        }
        return this.f21597p.a(bArr, 0, i7);
    }
}
