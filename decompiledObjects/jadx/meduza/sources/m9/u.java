package m9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import eb.e;
import eb.e1;
import eb.s0;
import java.util.HashSet;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes.dex */
public final class u extends e.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f10888b;

    public u(v vVar, TaskCompletionSource taskCompletionSource) {
        this.f10888b = vVar;
        this.f10887a = taskCompletionSource;
    }

    @Override // eb.e.a
    public final void a(s0 s0Var, e1 e1Var) {
        TaskCompletionSource taskCompletionSource;
        com.google.firebase.firestore.f g10;
        if (!e1Var.e()) {
            taskCompletionSource = this.f10887a;
            this.f10888b.getClass();
            HashSet hashSet = j.f10815d;
            Throwable th = e1Var.f5083c;
            if (th instanceof SSLHandshakeException) {
                th.getMessage().contains("no ciphers available");
            }
            g10 = n9.o.g(e1Var);
        } else {
            if (this.f10887a.getTask().isComplete()) {
                return;
            }
            taskCompletionSource = this.f10887a;
            g10 = new com.google.firebase.firestore.f("Received onClose with status OK, but no message.", f.a.INTERNAL);
        }
        taskCompletionSource.setException(g10);
    }

    @Override // eb.e.a
    public final void c(Object obj) {
        this.f10887a.setResult(obj);
    }
}
