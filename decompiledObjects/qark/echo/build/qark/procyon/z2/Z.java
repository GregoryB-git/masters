// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import M2.e;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.Collections;
import t.a;
import android.os.Bundle;
import java.util.Map;
import java.util.WeakHashMap;
import android.app.Fragment;

public final class Z extends Fragment implements g
{
    public static final WeakHashMap r;
    public final Map o;
    public int p;
    public Bundle q;
    
    static {
        r = new WeakHashMap();
    }
    
    public Z() {
        this.o = Collections.synchronizedMap((Map<Object, Object>)new a());
        this.p = 0;
    }
    
    public static Z f(final Activity activity) {
        final WeakHashMap r = Z.r;
        final WeakReference<Fragment> weakReference = r.get(activity);
        if (weakReference != null) {
            final Z z = weakReference.get();
            if (z != null) {
                return z;
            }
        }
        try {
            final Z z2 = (Z)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            Z referent = null;
            Label_0085: {
                if (z2 != null) {
                    referent = z2;
                    if (!z2.isRemoving()) {
                        break Label_0085;
                    }
                }
                referent = new Z();
                activity.getFragmentManager().beginTransaction().add((Fragment)referent, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            r.put(activity, new WeakReference<Fragment>(referent));
            return referent;
        }
        catch (ClassCastException cause) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", cause);
        }
    }
    
    public final void a(final String str, final LifecycleCallback lifecycleCallback) {
        if (!this.o.containsKey(str)) {
            this.o.put(str, lifecycleCallback);
            if (this.p > 0) {
                new e(Looper.getMainLooper()).post((Runnable)new Y(this, lifecycleCallback, str));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final LifecycleCallback b(final String s, final Class clazz) {
        return clazz.cast(this.o.get(s));
    }
    
    public final Activity c() {
        return this.getActivity();
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().e(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle q) {
        super.onCreate(q);
        this.p = 1;
        this.q = q;
        for (final Map.Entry<K, LifecycleCallback> entry : this.o.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (q != null) {
                bundle = q.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.p = 5;
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().g();
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.p = 3;
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.o.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.p = 2;
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.p = 4;
        final Iterator<LifecycleCallback> iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }
}
