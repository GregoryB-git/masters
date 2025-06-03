package d8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements t9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3622a;

    public /* synthetic */ r(int i10) {
        this.f3622a = i10;
    }

    @Override // t9.b
    public final Object get() {
        switch (this.f3622a) {
            case 0:
                return null;
            case 1:
                o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f3110a;
                return Executors.newSingleThreadScheduledExecutor(new e8.a("Firebase Scheduler", 0, null));
            default:
                com.google.firebase.messaging.a aVar = FirebaseMessaging.f3229m;
                return null;
        }
    }
}
