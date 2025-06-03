package b1;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import b1.k;

/* loaded from: classes.dex */
public final class c0 extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1719b = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f1720a;

    public interface a {
        void a();

        void onCreate();

        void onResume();
    }

    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Activity activity, k.a aVar) {
            ec.i.e(activity, "activity");
            ec.i.e(aVar, "event");
            if (activity instanceof q) {
                ((q) activity).getLifecycle().f(aVar);
            } else if (activity instanceof o) {
                k lifecycle = ((o) activity).getLifecycle();
                if (lifecycle instanceof p) {
                    ((p) lifecycle).f(aVar);
                }
            }
        }

        public static void b(Activity activity) {
            ec.i.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new c0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            ec.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ec.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            ec.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ec.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            b.a(activity, k.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ec.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            ec.i.e(activity, "activity");
            ec.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ec.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ec.i.e(activity, "activity");
        }
    }

    public final void a(k.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            ec.i.d(activity, "activity");
            b.a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f1720a;
        if (aVar != null) {
            aVar.onCreate();
        }
        a(k.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(k.a.ON_DESTROY);
        this.f1720a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(k.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f1720a;
        if (aVar != null) {
            aVar.onResume();
        }
        a(k.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f1720a;
        if (aVar != null) {
            aVar.a();
        }
        a(k.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(k.a.ON_STOP);
    }
}
