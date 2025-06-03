package l6;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f {
    public final g mLifecycleFragment;

    public f(g gVar) {
        this.mLifecycleFragment = gVar;
    }

    public static g getFragment(Activity activity) {
        return getFragment(new e(activity));
    }

    public static g getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static g getFragment(e eVar) {
        h1 h1Var;
        j1 j1Var;
        Activity activity = eVar.f9670a;
        if (!(activity instanceof x0.m)) {
            if (!(activity instanceof Activity)) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = h1.f9688b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (h1Var = (h1) weakReference.get()) == null) {
                try {
                    h1Var = (h1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (h1Var == null || h1Var.isRemoving()) {
                        h1Var = new h1();
                        activity.getFragmentManager().beginTransaction().add(h1Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(h1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
                }
            }
            return h1Var;
        }
        x0.m mVar = (x0.m) activity;
        WeakHashMap weakHashMap2 = j1.f9695b;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(mVar);
        if (weakReference2 == null || (j1Var = (j1) weakReference2.get()) == null) {
            try {
                j1Var = (j1) mVar.getSupportFragmentManager().E("SLifecycleFragmentImpl");
                if (j1Var == null || j1Var.isRemoving()) {
                    j1Var = new j1();
                    x0.y supportFragmentManager = mVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    x0.a aVar = new x0.a(supportFragmentManager);
                    aVar.e(0, j1Var, "SLifecycleFragmentImpl");
                    aVar.d(true);
                }
                weakHashMap2.put(mVar, new WeakReference(j1Var));
            } catch (ClassCastException e11) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
            }
        }
        return j1Var;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity b10 = this.mLifecycleFragment.b();
        m6.j.i(b10);
        return b10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
