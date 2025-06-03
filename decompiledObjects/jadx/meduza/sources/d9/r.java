package d9;

import android.database.Cursor;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements n9.i, d8.e, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3711a;

    public /* synthetic */ r(int i10) {
        this.f3711a = i10;
    }

    @Override // n9.i
    public Object apply(Object obj) {
        switch (this.f3711a) {
            case 0:
                g9.u uVar = (g9.u) obj;
                uVar.d();
                return uVar.f6090d.a(new g9.n(uVar, 1));
            default:
                int i10 = i9.y0.f7843k;
                return Long.valueOf(((Cursor) obj).getLong(0));
        }
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        ea.v components$lambda$4;
        h3.i lambda$getComponents$2;
        ea.o components$lambda$0;
        switch (this.f3711a) {
            case 0:
                return ExecutorsRegistrar.f3111b.get();
            case 1:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(uVar);
                return lambda$getComponents$2;
            case 2:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(uVar);
                return components$lambda$0;
            default:
                components$lambda$4 = FirebaseSessionsRegistrar.getComponents$lambda$4(uVar);
                return components$lambda$4;
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        ((f1.c) obj).q(this.f3711a);
    }
}
