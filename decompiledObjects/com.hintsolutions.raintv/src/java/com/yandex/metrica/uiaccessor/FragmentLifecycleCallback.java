/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.a;
import java.lang.ref.WeakReference;

public class FragmentLifecycleCallback
extends FragmentManager.FragmentLifecycleCallbacks {
    @NonNull
    private final a.a a;
    @NonNull
    private final WeakReference<Activity> b;

    public FragmentLifecycleCallback(@NonNull a.a a2, @NonNull Activity activity) {
        this.a = a2;
        this.b = new WeakReference((Object)activity);
    }

    public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        fragmentManager = (Activity)this.b.get();
        if (fragmentManager != null) {
            this.a.fragmentAttached((Activity)fragmentManager);
        }
    }
}

