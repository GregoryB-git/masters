package d8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements t9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3596a;

    public /* synthetic */ g(int i10) {
        this.f3596a = i10;
    }

    @Override // t9.b
    public final Object get() {
        switch (this.f3596a) {
            case 0:
                return Collections.emptySet();
            default:
                o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f3110a;
                return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new e8.a("Firebase Blocking", 11, null)));
        }
    }
}
