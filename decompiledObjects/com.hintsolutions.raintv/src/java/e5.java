/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tasks.Continuation
 *  com.google.android.gms.tasks.Task
 *  com.google.android.gms.tasks.TaskCompletionSource
 *  com.google.firebase.crashlytics.internal.common.Utils
 *  java.lang.Object
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;

public final class e5
implements Continuation {
    public final int a;
    public final TaskCompletionSource b;

    public /* synthetic */ e5(int n4, TaskCompletionSource taskCompletionSource) {
        this.a = n4;
        this.b = taskCompletionSource;
    }

    public final Object then(Task task) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return Utils.b((TaskCompletionSource)this.b, (Task)task);
            }
            case 0: {
                return Utils.d((TaskCompletionSource)this.b, (Task)task);
            }
        }
        return Utils.a((TaskCompletionSource)this.b, (Task)task);
    }
}

