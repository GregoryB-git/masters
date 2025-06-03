/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package z2;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface g {
    public void a(String var1, LifecycleCallback var2);

    public LifecycleCallback b(String var1, Class var2);

    public Activity c();

    public void startActivityForResult(Intent var1, int var2);
}

