// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import androidx.annotation.NonNull;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.app.FragmentManager;
import android.os.Build$VERSION;
import android.app.Activity;
import android.app.Fragment;

public class q extends Fragment
{
    public a o;
    
    public static void a(final Activity activity, final d.b b) {
        if (activity instanceof h) {
            final d g = ((h)activity).g();
            if (g instanceof i) {
                ((i)g).h(b);
            }
        }
    }
    
    public static q f(final Activity activity) {
        return (q)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }
    
    public static void g(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    public final void b(final d.b b) {
        if (Build$VERSION.SDK_INT < 29) {
            a(this.getActivity(), b);
        }
    }
    
    public final void c(final a a) {
        if (a != null) {
            a.a();
        }
    }
    
    public final void d(final a a) {
        if (a != null) {
            a.b();
        }
    }
    
    public final void e(final a a) {
        if (a != null) {
            a.c();
        }
    }
    
    public void h(final a o) {
        this.o = o;
    }
    
    public void onActivityCreated(final Bundle bundle) {
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
    
    public interface a
    {
        void a();
        
        void b();
        
        void c();
    }
    
    public static class b implements Application$ActivityLifecycleCallbacks
    {
        public static void registerIn(final Activity activity) {
            p.a(activity, (Application$ActivityLifecycleCallbacks)new b());
        }
        
        public void onActivityCreated(@NonNull final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityDestroyed(@NonNull final Activity activity) {
        }
        
        public void onActivityPaused(@NonNull final Activity activity) {
        }
        
        public void onActivityPostCreated(@NonNull final Activity activity, final Bundle bundle) {
            q.a(activity, d.b.ON_CREATE);
        }
        
        public void onActivityPostResumed(@NonNull final Activity activity) {
            q.a(activity, d.b.ON_RESUME);
        }
        
        public void onActivityPostStarted(@NonNull final Activity activity) {
            q.a(activity, d.b.ON_START);
        }
        
        public void onActivityPreDestroyed(@NonNull final Activity activity) {
            q.a(activity, d.b.ON_DESTROY);
        }
        
        public void onActivityPrePaused(@NonNull final Activity activity) {
            q.a(activity, d.b.ON_PAUSE);
        }
        
        public void onActivityPreStopped(@NonNull final Activity activity) {
            q.a(activity, d.b.ON_STOP);
        }
        
        public void onActivityResumed(@NonNull final Activity activity) {
        }
        
        public void onActivitySaveInstanceState(@NonNull final Activity activity, @NonNull final Bundle bundle) {
        }
        
        public void onActivityStarted(@NonNull final Activity activity) {
        }
        
        public void onActivityStopped(@NonNull final Activity activity) {
        }
    }
}
