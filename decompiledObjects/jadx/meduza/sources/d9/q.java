package d9;

import android.database.Cursor;
import android.os.HandlerThread;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.firestore.f;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements n9.i, d8.e, n7.q, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3707a;

    public /* synthetic */ q(int i10) {
        this.f3707a = i10;
    }

    @Override // n9.i
    public Object apply(Object obj) {
        switch (this.f3707a) {
            case 0:
                g9.u uVar = (g9.u) obj;
                uVar.d();
                return uVar.f6090d.a(new b.d(uVar, 14));
            case 1:
                return Tasks.forException(new com.google.firebase.firestore.f("Persistence cannot be cleared while the firestore instance is running.", f.a.FAILED_PRECONDITION));
            case 2:
                return Long.valueOf(((Cursor) obj).getLong(0));
            default:
                int i10 = i9.y0.f7843k;
                return Long.valueOf(((Cursor) obj).getLong(0));
        }
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        ga.h components$lambda$3;
        h3.i lambda$getComponents$1;
        switch (this.f3707a) {
            case 0:
                return ExecutorsRegistrar.f3112c.get();
            case 1:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(uVar);
                return lambda$getComponents$1;
            default:
                components$lambda$3 = FirebaseSessionsRegistrar.getComponents$lambda$3(uVar);
                return components$lambda$3;
        }
    }

    @Override // n7.q
    public Object get() {
        return new HandlerThread(o4.b.p(this.f3707a, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f3707a) {
            case 0:
                w3.b bVar = (w3.b) obj;
                bVar.q();
                bVar.j0();
                bVar.R();
                break;
            default:
                w3.b bVar2 = (w3.b) obj;
                bVar2.x();
                bVar2.N();
                bVar2.R();
                break;
        }
    }
}
