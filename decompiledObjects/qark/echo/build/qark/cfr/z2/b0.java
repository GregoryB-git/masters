/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
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
import z2.a0;
import z2.g;

public final class b0
extends Fragment
implements g {
    public static final WeakHashMap r0 = new WeakHashMap();
    public final Map o0 = Collections.synchronizedMap((Map)new a());
    public int p0 = 0;
    public Bundle q0;

    public static b0 J1(e e8) {
        Object object;
        WeakHashMap weakHashMap;
        block7 : {
            block6 : {
                b0 b02;
                weakHashMap = r0;
                object = (WeakReference)weakHashMap.get((Object)e8);
                if (object != null && (object = (b0)object.get()) != null) {
                    return object;
                }
                try {
                    b02 = (b0)e8.n().h0("SupportLifecycleFragmentImpl");
                    if (b02 == null) break block6;
                    object = b02;
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", (Throwable)classCastException);
                }
                if (!b02.b0()) break block7;
            }
            object = new b0();
            e8.n().m().d((Fragment)object, "SupportLifecycleFragmentImpl").g();
        }
        weakHashMap.put((Object)e8, (Object)new WeakReference(object));
        return object;
    }

    @Override
    public final void H0() {
        super.H0();
        this.p0 = 3;
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }

    @Override
    public final void I0(Bundle bundle) {
        super.I0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback)entry.getValue()).i(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }

    @Override
    public final void J0() {
        super.J0();
        this.p0 = 2;
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }

    @Override
    public final void K0() {
        super.K0();
        this.p0 = 4;
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }

    @Override
    public final void a(String string2, LifecycleCallback lifecycleCallback) {
        if (!this.o0.containsKey((Object)string2)) {
            this.o0.put((Object)string2, (Object)lifecycleCallback);
            if (this.p0 > 0) {
                new M2.e(Looper.getMainLooper()).post((Runnable)new a0(this, lifecycleCallback, string2));
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
        return (LifecycleCallback)class_.cast(this.o0.get((Object)string2));
    }

    @Override
    public final /* synthetic */ Activity c() {
        return this.n();
    }

    @Override
    public final void h(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        super.h(string2, fileDescriptor, printWriter, arrstring);
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).a(string2, fileDescriptor, printWriter, arrstring);
        }
    }

    @Override
    public final void h0(int n8, int n9, Intent intent) {
        super.h0(n8, n9, intent);
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).e(n8, n9, intent);
        }
    }

    @Override
    public final void m0(Bundle bundle) {
        super.m0(bundle);
        this.p0 = 1;
        this.q0 = bundle;
        Iterator iterator = this.o0.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
            entry = bundle != null ? bundle.getBundle((String)entry.getKey()) : null;
            lifecycleCallback.f((Bundle)entry);
        }
    }

    @Override
    public final void r0() {
        super.r0();
        this.p0 = 5;
        Iterator iterator = this.o0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).g();
        }
    }
}

