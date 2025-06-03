/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.messaging.EnhancedIntentService
 *  java.lang.Object
 */
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;

public final class i1
implements OnCompleteListener {
    public final EnhancedIntentService a;
    public final Intent b;

    public /* synthetic */ i1(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.a = enhancedIntentService;
        this.b = intent;
    }

    public final void onComplete(Task task) {
        EnhancedIntentService.a((EnhancedIntentService)this.a, (Intent)this.b, (Task)task);
    }
}

