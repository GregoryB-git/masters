/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.p;

public class q
extends Fragment {
    public a o;

    public static void a(Activity object, d.b b8) {
        if (object instanceof h && (object = ((h)object).g()) instanceof i) {
            ((i)object).h(b8);
        }
    }

    public static q f(Activity activity) {
        return (q)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        if ((activity = activity.getFragmentManager()).findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            activity.beginTransaction().add((Fragment)new q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            activity.executePendingTransactions();
        }
    }

    public final void b(d.b b8) {
        if (Build.VERSION.SDK_INT < 29) {
            q.a(this.getActivity(), b8);
        }
    }

    public final void c(a a8) {
        if (a8 != null) {
            a8.a();
        }
    }

    public final void d(a a8) {
        if (a8 != null) {
            a8.b();
        }
    }

    public final void e(a a8) {
        if (a8 != null) {
            a8.c();
        }
    }

    public void h(a a8) {
        this.o = a8;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c(this.o);
        this.b(d.b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        this.b(d.b.ON_DESTROY);
        this.o = null;
    }

    public void onPause() {
        super.onPause();
        this.b(d.b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.d(this.o);
        this.b(d.b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.e(this.o);
        this.b(d.b.ON_START);
    }

    public void onStop() {
        super.onStop();
        this.b(d.b.ON_STOP);
    }

    public static interface a {
        public void a();

        public void b();

        public void c();
    }

    public static class b
    implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            p.a(activity, new b());
        }

        public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityPostCreated(@NonNull Activity activity, Bundle bundle) {
            q.a(activity, d.b.ON_CREATE);
        }

        public void onActivityPostResumed(@NonNull Activity activity) {
            q.a(activity, d.b.ON_RESUME);
        }

        public void onActivityPostStarted(@NonNull Activity activity) {
            q.a(activity, d.b.ON_START);
        }

        public void onActivityPreDestroyed(@NonNull Activity activity) {
            q.a(activity, d.b.ON_DESTROY);
        }

        public void onActivityPrePaused(@NonNull Activity activity) {
            q.a(activity, d.b.ON_PAUSE);
        }

        public void onActivityPreStopped(@NonNull Activity activity) {
            q.a(activity, d.b.ON_STOP);
        }

        public void onActivityResumed(@NonNull Activity activity) {
        }

        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

}

