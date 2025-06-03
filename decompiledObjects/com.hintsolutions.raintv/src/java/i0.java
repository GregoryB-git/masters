/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.activity.ComponentActivity
 *  androidx.activity.contextaware.OnContextAvailableListener
 *  java.lang.Object
 */
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;

public final class i0
implements OnContextAvailableListener {
    public final ComponentActivity a;

    public /* synthetic */ i0(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    public final void onContextAvailable(Context context) {
        ComponentActivity.a((ComponentActivity)this.a, (Context)context);
    }
}

