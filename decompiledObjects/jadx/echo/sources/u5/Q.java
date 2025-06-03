package u5;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInfoTrackerCallbackAdapter f19897a;

    public Q(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f19897a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, H.a aVar) {
        this.f19897a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(H.a aVar) {
        this.f19897a.removeWindowLayoutInfoListener(aVar);
    }
}
