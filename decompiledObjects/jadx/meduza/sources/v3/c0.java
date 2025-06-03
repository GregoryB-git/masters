package v3;

import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15255c;

    public /* synthetic */ c0(Object obj, int i10, int i11) {
        this.f15253a = i11;
        this.f15255c = obj;
        this.f15254b = i10;
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f15253a) {
            case 0:
                ((f1.c) obj).k0((o0) this.f15255c, this.f15254b);
                break;
            default:
                w3.b bVar = (w3.b) obj;
                bVar.B();
                bVar.V();
                break;
        }
    }
}
