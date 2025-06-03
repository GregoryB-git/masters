/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  com.google.android.gms.tasks.TaskCompletionSource
 *  com.google.firebase.messaging.EnhancedIntentService
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;

public final class g1
implements Runnable {
    public final EnhancedIntentService a;
    public final Intent b;
    public final TaskCompletionSource c;

    public /* synthetic */ g1(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.a = enhancedIntentService;
        this.b = intent;
        this.c = taskCompletionSource;
    }

    public final void run() {
        EnhancedIntentService.b((EnhancedIntentService)this.a, (Intent)this.b, (TaskCompletionSource)this.c);
    }
}

