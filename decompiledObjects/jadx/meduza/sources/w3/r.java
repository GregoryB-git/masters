package w3;

import v5.l;
import w3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16224a;

    public /* synthetic */ r(b.a aVar, int i10) {
        this.f16224a = i10;
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f16224a) {
            case 0:
                ((b) obj).F0();
                break;
            case 1:
                ((b) obj).f();
                break;
            default:
                ((b) obj).Y();
                break;
        }
    }
}
