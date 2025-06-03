package x0;

import android.content.Intent;
import io.flutter.embedding.android.FlutterView;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements d0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16706b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f16705a = i10;
        this.f16706b = obj;
    }

    @Override // d0.a
    public final void accept(Object obj) {
        switch (this.f16705a) {
            case 0:
                ((m) this.f16706b).lambda$init$2((Intent) obj);
                break;
            case 1:
                y yVar = (y) this.f16706b;
                u.l lVar = (u.l) obj;
                if (yVar.N()) {
                    yVar.o(lVar.f14806a, false);
                    break;
                }
                break;
            default:
                ((FlutterView) this.f16706b).setWindowInfoListenerDisplayFeatures((i2.k) obj);
                break;
        }
    }
}
