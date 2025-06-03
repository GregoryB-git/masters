/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package z2;

import M2.e;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import t.a;
import z2.Y;
import z2.g;

public final class Z
extends Fragment
implements g {
    public static final WeakHashMap r = new WeakHashMap();
    public final Map o = Collections.synchronizedMap((Map)new a());
    public int p = 0;
    public Bundle q;

    public static Z f(Activity activity) {
        Object object;
        WeakHashMap weakHashMap;
        block7 : {
            block6 : {
                Z z8;
                weakHashMap = r;
                object = (WeakReference)weakHashMap.get((Object)activity);
                if (object != null && (object = (Z)object.get()) != null) {
                    return object;
                }
                try {
                    z8 = (Z)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (z8 == null) break block6;
                    object = z8;
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", (Throwable)classCastException);
                }
                if (!z8.isRemoving()) break block7;
            }
            object = new Z();
            activity.getFragmentManager().beginTransaction().add((Fragment)object, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        weakHashMap.put((Object)activity, (Object)new WeakReference(object));
        return object;
    }

    @Override
    public final void a(String string2, LifecycleCallback lifecycleCallback) {
        if (!this.o.containsKey((Object)string2)) {
            this.o.put((Object)string2, (Object)lifecycleCallback);
            if (this.p > 0) {
                new e(Looper.getMainLooper()).post((Runnable)new Y(this, lifecycleCallback, string2));
            }
            return;
        }
        lifecycleCallback = new StringBuilder();
        lifecycleCallback.append("LifecycleCallback with tag ");
        lifecycleCallback.append(string2);
        lifecycleCallback.append(" already added to this fragment.");
        throw new IllegalArgumentException(lifecycleCallback.toString());
    }

    @Override
    public final LifecycleCallback b(String string2, Class class_) {
        return (LifecycleCallback)class_.cast(this.o.get((Object)string2));
    }

    @Override
    public final Activity c() {
        return this.getActivity();
    }

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        super.dump(string2, fileDescriptor, printWriter, arrstring);
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).a(string2, fileDescriptor, printWriter, arrstring);
        }
    }

    public final void onActivityResult(int n8, int n9, Intent intent) {
        super.onActivityResult(n8, n9, intent);
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).e(n8, n9, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = 1;
        this.q = bundle;
        Iterator iterator = this.o.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
            entry = bundle != null ? bundle.getBundle((String)entry.getKey()) : null;
            lifecycleCallback.f((Bundle)entry);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.p = 5;
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.p = 3;
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.o.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback)entry.getValue()).i(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }

    public final void onStart() {
        super.onStart();
        this.p = 2;
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.p = 4;
        Iterator iterator = this.o.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }
}

