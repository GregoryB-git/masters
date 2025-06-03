/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tasks.TaskCompletionSource
 *  com.google.firebase.messaging.FirebaseMessaging
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

public final class y1
implements Runnable {
    public final int a;
    public final FirebaseMessaging b;
    public final TaskCompletionSource c;

    public /* synthetic */ y1(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int n) {
        this.a = n;
        this.b = firebaseMessaging;
        this.c = taskCompletionSource;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                FirebaseMessaging.j((FirebaseMessaging)this.b, (TaskCompletionSource)this.c);
                return;
            }
            case 0: {
                FirebaseMessaging.e((FirebaseMessaging)this.b, (TaskCompletionSource)this.c);
                return;
            }
        }
        FirebaseMessaging.i((FirebaseMessaging)this.b, (TaskCompletionSource)this.c);
    }
}

