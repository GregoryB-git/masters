package wc;

import com.google.android.gms.tasks.Task;
import ea.q;
import java.util.concurrent.CancellationException;
import nc.l;
import p2.m0;

/* loaded from: classes.dex */
public final class c {
    public static final Object a(Task task, q.a.C0070a c0070a) {
        if (!task.isComplete()) {
            l lVar = new l(1, m0.P(c0070a));
            lVar.t();
            task.addOnCompleteListener(a.f16487a, new b(lVar));
            Object s10 = lVar.s();
            vb.a aVar = vb.a.f16085a;
            return s10;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
