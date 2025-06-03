package aa;

import aa.h;
import aa.o0;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class n0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final a f341a;

    public interface a {
    }

    public n0(h.a aVar) {
        this.f341a = aVar;
    }

    public final void a(o0.a aVar) {
        Task processIntent;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        a aVar2 = this.f341a;
        processIntent = h.this.processIntent(aVar.f352a);
        processIntent.addOnCompleteListener(new m1.b(6), new m0(aVar, 0));
    }
}
