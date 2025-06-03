/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  java.lang.Object
 *  kotlinx.coroutines.CompletableDeferred
 *  kotlinx.coroutines.tasks.TasksKt
 */
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.tasks.TasksKt;

public final class o4
implements OnCompleteListener {
    public final CompletableDeferred a;

    public /* synthetic */ o4(CompletableDeferred completableDeferred) {
        this.a = completableDeferred;
    }

    public final void onComplete(Task task) {
        TasksKt.a((CompletableDeferred)this.a, (Task)task);
    }
}

