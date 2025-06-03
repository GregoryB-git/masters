// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import android.util.Log;
import androidx.lifecycle.t;
import java.util.HashMap;
import androidx.lifecycle.s;
import androidx.lifecycle.r;

public final class q extends r
{
    public static final s.a j;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    static {
        j = new s.a() {
            @Override
            public r a(final Class clazz) {
                return new q(true);
            }
        };
    }
    
    public q(final boolean f) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.g = false;
        this.h = false;
        this.i = false;
        this.f = f;
    }
    
    public static q i(final t t) {
        return (q)new s(t, q.j).a(q.class);
    }
    
    @Override
    public void d() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.g = true;
    }
    
    public void e(final Fragment fragment) {
        if (this.i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.containsKey(fragment.t)) {
            return;
        }
        this.c.put(fragment.t, fragment);
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (q.class != o.getClass()) {
            return false;
        }
        final q q = (q)o;
        return this.c.equals(q.c) && this.d.equals(q.d) && this.e.equals(q.e);
    }
    
    public void f(final Fragment obj) {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(obj);
            Log.d("FragmentManager", sb.toString());
        }
        final q q = this.d.get(obj.t);
        if (q != null) {
            q.d();
            this.d.remove(obj.t);
        }
        final t t = this.e.get(obj.t);
        if (t != null) {
            t.a();
            this.e.remove(obj.t);
        }
    }
    
    public Fragment g(final String key) {
        return this.c.get(key);
    }
    
    public q h(final Fragment fragment) {
        q value;
        if ((value = this.d.get(fragment.t)) == null) {
            value = new q(this.f);
            this.d.put(fragment.t, value);
        }
        return value;
    }
    
    @Override
    public int hashCode() {
        return (this.c.hashCode() * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }
    
    public Collection j() {
        return new ArrayList(this.c.values());
    }
    
    public t k(final Fragment fragment) {
        t value;
        if ((value = this.e.get(fragment.t)) == null) {
            value = new t();
            this.e.put(fragment.t, value);
        }
        return value;
    }
    
    public boolean l() {
        return this.g;
    }
    
    public void m(final Fragment obj) {
        if (this.i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.remove(obj.t) != null && n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public void n(final boolean i) {
        this.i = i;
    }
    
    public boolean o(final Fragment fragment) {
        if (!this.c.containsKey(fragment.t)) {
            return true;
        }
        if (this.f) {
            return this.g;
        }
        return this.h ^ true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator<Object> iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator<String> iterator2 = this.d.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append(iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator<String> iterator3 = this.e.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append(iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
