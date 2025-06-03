package d9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.firestore.i f3636a;

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.firebase.firestore.a> f3637b;

    public a(com.google.firebase.firestore.i iVar, r0 r0Var) {
        this.f3636a = iVar;
        this.f3637b = r0Var;
    }

    public final Task<com.google.firebase.firestore.b> a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("AggregateSource must not be null");
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Task) this.f3636a.f3190b.a(new defpackage.e(this, 0))).continueWith(n9.f.f11361b, new k1.a(9, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3636a.equals(aVar.f3636a) && this.f3637b.equals(aVar.f3637b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3636a, this.f3637b);
    }
}
