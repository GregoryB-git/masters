// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.app.Activity;
import android.os.Looper;
import java.util.Iterator;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import androidx.fragment.app.e;
import java.util.Collections;
import t.a;
import android.os.Bundle;
import java.util.Map;
import java.util.WeakHashMap;
import androidx.fragment.app.Fragment;

public final class b0 extends Fragment implements g
{
    public static final WeakHashMap r0;
    public final Map o0;
    public int p0;
    public Bundle q0;
    
    static {
        r0 = new WeakHashMap();
    }
    
    public b0() {
        this.o0 = Collections.synchronizedMap((Map<Object, Object>)new a());
        this.p0 = 0;
    }
    
    public static b0 J1(final e e) {
        final WeakHashMap r0 = b0.r0;
        final WeakReference<Fragment> weakReference = r0.get(e);
        if (weakReference != null) {
            final b0 b0 = weakReference.get();
            if (b0 != null) {
                return b0;
            }
        }
        try {
            final b0 b2 = (b0)e.n().h0("SupportLifecycleFragmentImpl");
            b0 referent = null;
            Label_0085: {
                if (b2 != null) {
                    referent = b2;
                    if (!b2.b0()) {
                        break Label_0085;
                    }
                }
                referent = new b0();
                e.n().m().d(referent, "SupportLifecycleFragmentImpl").g();
            }
            r0.put(e, new WeakReference<Fragment>(referent));
            return referent;
        }
        catch (ClassCastException cause) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", cause);
        }
    }
    
    @Override
    public final void H0() {
        super.H0();
        this.p0 = 3;
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    @Override
    public final void I0(final Bundle bundle) {
        super.I0(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.o0.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    @Override
    public final void J0() {
        super.J0();
        this.p0 = 2;
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }
    
    @Override
    public final void K0() {
        super.K0();
        this.p0 = 4;
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }
    
    @Override
    public final void a(final String str, final LifecycleCallback lifecycleCallback) {
        if (!this.o0.containsKey(str)) {
            this.o0.put(str, lifecycleCallback);
            if (this.p0 > 0) {
                new M2.e(Looper.getMainLooper()).post((Runnable)new a0(this, lifecycleCallback, str));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final LifecycleCallback b(final String s, final Class clazz) {
        return clazz.cast(this.o0.get(s));
    }
    
    @Override
    public final void h(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.h(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    @Override
    public final void h0(final int n, final int n2, final Intent intent) {
        super.h0(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().e(n, n2, intent);
        }
    }
    
    @Override
    public final void m0(final Bundle q0) {
        super.m0(q0);
        this.p0 = 1;
        this.q0 = q0;
        for (final Map.Entry<K, LifecycleCallback> entry : this.o0.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (q0 != null) {
                bundle = q0.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
    }
    
    @Override
    public final void r0() {
        super.r0();
        this.p0 = 5;
        final Iterator<LifecycleCallback> iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().g();
        }
    }
}
