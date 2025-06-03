/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.fragment.app.FragmentActivity
 *  androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.FragmentLifecycleCallback;
import com.yandex.metrica.uiaccessor.b;

public class a
implements b {
    @NonNull
    private final a a;
    @Nullable
    private FragmentManager.FragmentLifecycleCallbacks b;

    public a(@NonNull a a2) throws Throwable {
        this.a = a2;
    }

    @Override
    public void subscribe(@NonNull Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity) {
            if (this.b == null) {
                this.b = new FragmentLifecycleCallback(this.a, activity);
            }
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            activity.unregisterFragmentLifecycleCallbacks(this.b);
            activity.registerFragmentLifecycleCallbacks(this.b, true);
        }
    }

    @Override
    public void unsubscribe(@NonNull Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity && this.b != null) {
            ((FragmentActivity)activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.b);
        }
    }
}

