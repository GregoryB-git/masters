package d9;

import android.database.Cursor;
import android.os.HandlerThread;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.Set;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements n9.i, d8.e, n7.q, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3702a;

    public /* synthetic */ p(int i10) {
        this.f3702a = i10;
    }

    @Override // n9.i
    public Object apply(Object obj) {
        switch (this.f3702a) {
            case 0:
                g9.u uVar = (g9.u) obj;
                uVar.d();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                uVar.f6090d.a(new x0.q0(11, uVar, taskCompletionSource));
                return taskCompletionSource.getTask();
            default:
                return Integer.valueOf(((Cursor) obj).getInt(0));
        }
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        ea.a0 components$lambda$2;
        h3.i lambda$getComponents$0;
        v8.b lambda$getComponents$02;
        u9.d lambda$getComponents$03;
        switch (this.f3702a) {
            case 0:
                return ExecutorsRegistrar.f3110a.get();
            case 1:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(uVar);
                return lambda$getComponents$0;
            case 2:
                lambda$getComponents$02 = FirebaseDynamicLinkRegistrar.lambda$getComponents$0(uVar);
                return lambda$getComponents$02;
            case 3:
                lambda$getComponents$03 = FirebaseInstallationsRegistrar.lambda$getComponents$0(uVar);
                return lambda$getComponents$03;
            case 4:
                Set g10 = uVar.g(ca.d.class);
                ca.c cVar = ca.c.f2554b;
                if (cVar == null) {
                    synchronized (ca.c.class) {
                        cVar = ca.c.f2554b;
                        if (cVar == null) {
                            cVar = new ca.c();
                            ca.c.f2554b = cVar;
                        }
                    }
                }
                return new ca.b(g10, cVar);
            default:
                components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(uVar);
                return components$lambda$2;
        }
    }

    @Override // n7.q
    public Object get() {
        return new HandlerThread(o4.b.p(this.f3702a, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f3702a) {
            case 0:
                ((w3.b) obj).G();
                break;
            default:
                ((w3.b) obj).K();
                break;
        }
    }
}
