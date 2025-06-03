package d9;

import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.streamhandler.QuerySnapshotsStreamHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3701c;

    public /* synthetic */ o0(int i10, Object obj, Object obj2) {
        this.f3699a = i10;
        this.f3700b = obj;
        this.f3701c = obj2;
    }

    @Override // d9.l
    public final void a(Object obj, com.google.firebase.firestore.f fVar) {
        switch (this.f3699a) {
            case 0:
                com.google.firebase.firestore.i iVar = (com.google.firebase.firestore.i) this.f3700b;
                l lVar = (l) this.f3701c;
                g9.s0 s0Var = (g9.s0) obj;
                iVar.getClass();
                if (fVar == null) {
                    x6.b.Z("Got event without value or error set", s0Var != null, new Object[0]);
                    lVar.a(new com.google.firebase.firestore.k(iVar, s0Var, iVar.f3190b), null);
                    break;
                } else {
                    lVar.a(null, fVar);
                    break;
                }
            default:
                ((QuerySnapshotsStreamHandler) this.f3700b).lambda$onListen$0((EventChannel.EventSink) this.f3701c, (com.google.firebase.firestore.k) obj, fVar);
                break;
        }
    }
}
