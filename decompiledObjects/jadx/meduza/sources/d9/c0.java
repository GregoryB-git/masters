package d9;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c0 extends Task<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3647a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public d0 f3648b = d0.f3654g;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource<d0> f3649c;

    /* renamed from: d, reason: collision with root package name */
    public final Task<d0> f3650d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f3651e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Executor f3652a = TaskExecutors.MAIN_THREAD;

        /* renamed from: b, reason: collision with root package name */
        public defpackage.e f3653b;

        public a(defpackage.e eVar) {
            this.f3653b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f3653b.equals(((a) obj).f3653b);
        }

        public final int hashCode() {
            return this.f3653b.hashCode();
        }
    }

    public c0() {
        TaskCompletionSource<d0> taskCompletionSource = new TaskCompletionSource<>();
        this.f3649c = taskCompletionSource;
        this.f3650d = taskCompletionSource.getTask();
        this.f3651e = new ArrayDeque();
    }

    public final void a(com.google.firebase.firestore.f fVar) {
        synchronized (this.f3647a) {
            try {
                d0 d0Var = this.f3648b;
                d0 d0Var2 = new d0(d0Var.f3655a, d0Var.f3656b, d0Var.f3657c, d0Var.f3658d, fVar, 1);
                this.f3648b = d0Var2;
                Iterator it = this.f3651e.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    aVar.f3652a.execute(new g.q(14, aVar, d0Var2));
                }
                this.f3651e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3649c.setException(fVar);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f3650d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f3650d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f3650d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCompleteListener(Activity activity, OnCompleteListener<d0> onCompleteListener) {
        return this.f3650d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCompleteListener(OnCompleteListener<d0> onCompleteListener) {
        return this.f3650d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnCompleteListener(Executor executor, OnCompleteListener<d0> onCompleteListener) {
        return this.f3650d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f3650d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f3650d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f3650d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnSuccessListener(Activity activity, OnSuccessListener<? super d0> onSuccessListener) {
        return this.f3650d.addOnSuccessListener(activity, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnSuccessListener(OnSuccessListener<? super d0> onSuccessListener) {
        return this.f3650d.addOnSuccessListener(onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task<d0> addOnSuccessListener(Executor executor, OnSuccessListener<? super d0> onSuccessListener) {
        return this.f3650d.addOnSuccessListener(executor, onSuccessListener);
    }

    public final void b(d0 d0Var) {
        boolean b10 = q0.g.b(d0Var.f3659e, 3);
        StringBuilder l10 = defpackage.f.l("Expected success, but was ");
        l10.append(defpackage.f.q(d0Var.f3659e));
        x6.b.Z(l10.toString(), b10, new Object[0]);
        synchronized (this.f3647a) {
            this.f3648b = d0Var;
            Iterator it = this.f3651e.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.f3652a.execute(new g.q(14, aVar, this.f3648b));
            }
            this.f3651e.clear();
        }
        this.f3649c.setResult(d0Var);
    }

    public final void c(d0 d0Var) {
        synchronized (this.f3647a) {
            this.f3648b = d0Var;
            Iterator it = this.f3651e.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.f3652a.execute(new g.q(14, aVar, d0Var));
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<d0, TContinuationResult> continuation) {
        return this.f3650d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<d0, TContinuationResult> continuation) {
        return this.f3650d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<d0, Task<TContinuationResult>> continuation) {
        return this.f3650d.continueWithTask(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<d0, Task<TContinuationResult>> continuation) {
        return this.f3650d.continueWithTask(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        return this.f3650d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public final d0 getResult() {
        return this.f3650d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f3650d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        return this.f3650d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        return this.f3650d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<d0, TContinuationResult> successContinuation) {
        return this.f3650d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<d0, TContinuationResult> successContinuation) {
        return this.f3650d.onSuccessTask(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final d0 getResult(Class cls) {
        return this.f3650d.getResult(cls);
    }
}
