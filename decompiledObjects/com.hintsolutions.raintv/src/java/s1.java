/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  com.google.firebase.messaging.FcmBroadcastProcessor
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;

public final class s1
implements Callable {
    public final Context a;
    public final Intent b;

    public /* synthetic */ s1(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        return FcmBroadcastProcessor.a((Context)this.a, (Intent)this.b);
    }
}

