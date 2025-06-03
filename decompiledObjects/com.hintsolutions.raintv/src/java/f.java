/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.core.app.ActivityCompat
 *  java.lang.Object
 *  java.lang.Runnable
 */
import android.app.Activity;
import androidx.core.app.ActivityCompat;

public final class f
implements Runnable {
    public final Activity a;

    public /* synthetic */ f(Activity activity) {
        this.a = activity;
    }

    public final void run() {
        ActivityCompat.a((Activity)this.a);
    }
}

