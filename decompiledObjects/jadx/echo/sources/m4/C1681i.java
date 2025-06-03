package m4;

import j4.C1376b;
import j4.C1377c;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1681i implements j4.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17771a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17772b = false;

    /* renamed from: c, reason: collision with root package name */
    public C1377c f17773c;

    /* renamed from: d, reason: collision with root package name */
    public final C1678f f17774d;

    public C1681i(C1678f c1678f) {
        this.f17774d = c1678f;
    }

    public final void a() {
        if (this.f17771a) {
            throw new C1376b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f17771a = true;
    }

    public void b(C1377c c1377c, boolean z7) {
        this.f17771a = false;
        this.f17773c = c1377c;
        this.f17772b = z7;
    }

    @Override // j4.g
    public j4.g d(String str) {
        a();
        this.f17774d.i(this.f17773c, str, this.f17772b);
        return this;
    }

    @Override // j4.g
    public j4.g e(boolean z7) {
        a();
        this.f17774d.o(this.f17773c, z7, this.f17772b);
        return this;
    }
}
