// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity.result;

import android.os.BaseBundle;
import java.util.Iterator;
import androidx.lifecycle.g;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcelable;
import android.content.Intent;
import java.util.HashMap;
import android.os.Bundle;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry
{
    public Random a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final transient Map e;
    public final Map f;
    public final Bundle g;
    
    public ActivityResultRegistry() {
        this.a = new Random();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new Bundle();
    }
    
    public final void a(final int n, final String s) {
        this.b.put(n, s);
        this.c.put(s, n);
    }
    
    public final boolean b(final int i, final int n, final Intent intent) {
        final String s = this.b.get(i);
        if (s == null) {
            return false;
        }
        this.d(s, n, intent, (c)this.e.get(s));
        return true;
    }
    
    public final boolean c(final int i, final Object o) {
        final String s = this.b.get(i);
        if (s == null) {
            return false;
        }
        final c c = this.e.get(s);
        if (c != null) {
            final b a = c.a;
            if (a != null) {
                a.a(o);
                return true;
            }
        }
        this.g.remove(s);
        this.f.put(s, o);
        return true;
    }
    
    public final void d(final String s, final int n, final Intent intent, final c c) {
        if (c != null) {
            final b a = c.a;
            if (a != null) {
                a.a(c.b.c(n, intent));
                return;
            }
        }
        this.f.remove(s);
        this.g.putParcelable(s, (Parcelable)new a(n, intent));
    }
    
    public final int e() {
        int n = this.a.nextInt(2147418112);
        int i;
        while (true) {
            i = n + 65536;
            if (!this.b.containsKey(i)) {
                break;
            }
            n = this.a.nextInt(2147418112);
        }
        return i;
    }
    
    public abstract void f(final int p0, final d.a p1, final Object p2, final w.b p3);
    
    public final void g(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final ArrayList integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        final ArrayList stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null) {
            if (integerArrayList == null) {
                return;
            }
            for (int size = stringArrayList.size(), i = 0; i < size; ++i) {
                this.a(integerArrayList.get(i), stringArrayList.get(i));
            }
            this.a = (Random)bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        }
    }
    
    public final void h(final Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)this.g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)this.a);
    }
    
    public final androidx.activity.result.c i(final String s, final h obj, final d.a a, final b b) {
        final androidx.lifecycle.d g = obj.g();
        if (!g.b().c(androidx.lifecycle.d.c.r)) {
            final int k = this.k(s);
            d d;
            if ((d = this.d.get(s)) == null) {
                d = new d(g);
            }
            d.a(new f() {
                @Override
                public void a(final h h, final androidx.lifecycle.d.b obj) {
                    if (androidx.lifecycle.d.b.ON_START.equals(obj)) {
                        ActivityResultRegistry.this.e.put(s, new c(b, a));
                        if (ActivityResultRegistry.this.f.containsKey(s)) {
                            final Object value = ActivityResultRegistry.this.f.get(s);
                            ActivityResultRegistry.this.f.remove(s);
                            b.a(value);
                        }
                        final a a = (a)ActivityResultRegistry.this.g.getParcelable(s);
                        if (a != null) {
                            ActivityResultRegistry.this.g.remove(s);
                            b.a(a.c(a.b(), a.a()));
                        }
                    }
                    else {
                        if (androidx.lifecycle.d.b.ON_STOP.equals(obj)) {
                            ActivityResultRegistry.this.e.remove(s);
                            return;
                        }
                        if (androidx.lifecycle.d.b.ON_DESTROY.equals(obj)) {
                            ActivityResultRegistry.this.l(s);
                        }
                    }
                }
            });
            this.d.put(s, d);
            return new androidx.activity.result.c() {
                @Override
                public void b(final Object o, final w.b b) {
                    ActivityResultRegistry.this.f(k, a, o, b);
                }
                
                @Override
                public void c() {
                    ActivityResultRegistry.this.l(s);
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(obj);
        sb.append(" is attempting to register while current state is ");
        sb.append(g.b());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final androidx.activity.result.c j(final String s, final d.a a, final b b) {
        final int k = this.k(s);
        this.e.put(s, new c(b, a));
        if (this.f.containsKey(s)) {
            final Object value = this.f.get(s);
            this.f.remove(s);
            b.a(value);
        }
        final a a2 = (a)this.g.getParcelable(s);
        if (a2 != null) {
            this.g.remove(s);
            b.a(a.c(a2.b(), a2.a()));
        }
        return new androidx.activity.result.c() {
            @Override
            public void b(final Object o, final w.b b) {
                ActivityResultRegistry.this.f(k, a, o, b);
            }
            
            @Override
            public void c() {
                ActivityResultRegistry.this.l(s);
            }
        };
    }
    
    public final int k(final String s) {
        final Integer n = this.c.get(s);
        if (n != null) {
            return n;
        }
        final int e = this.e();
        this.a(e, s);
        return e;
    }
    
    public final void l(final String s) {
        final Integer n = this.c.remove(s);
        if (n != null) {
            this.b.remove(n);
        }
        this.e.remove(s);
        if (this.f.containsKey(s)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(s);
            sb.append(": ");
            sb.append(this.f.get(s));
            Log.w("ActivityResultRegistry", sb.toString());
            this.f.remove(s);
        }
        if (((BaseBundle)this.g).containsKey(s)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(s);
            sb2.append(": ");
            sb2.append(this.g.getParcelable(s));
            Log.w("ActivityResultRegistry", sb2.toString());
            this.g.remove(s);
        }
        final d d = this.d.get(s);
        if (d != null) {
            d.b();
            this.d.remove(s);
        }
    }
    
    public static class c
    {
        public final b a;
        public final d.a b;
        
        public c(final b a, final d.a b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class d
    {
        public final androidx.lifecycle.d a;
        public final ArrayList b;
        
        public d(final androidx.lifecycle.d a) {
            this.a = a;
            this.b = new ArrayList();
        }
        
        public void a(final f e) {
            this.a.a(e);
            this.b.add(e);
        }
        
        public void b() {
            final Iterator<f> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.a.c(iterator.next());
            }
            this.b.clear();
        }
    }
}
