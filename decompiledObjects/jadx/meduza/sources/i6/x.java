package i6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f7617a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f7618b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f7619c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f7620d;

    public x(int i10, int i11, Bundle bundle) {
        this.f7617a = i10;
        this.f7619c = i11;
        this.f7620d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(z3.f fVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + fVar.toString());
        }
        this.f7618b.setException(fVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f7618b.setResult(bundle);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Request { what=");
        l10.append(this.f7619c);
        l10.append(" id=");
        l10.append(this.f7617a);
        l10.append(" oneWay=");
        l10.append(b());
        l10.append("}");
        return l10.toString();
    }
}
