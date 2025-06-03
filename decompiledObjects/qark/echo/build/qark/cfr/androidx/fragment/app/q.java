/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class q
extends r {
    public static final s.a j = new s.a(){

        @Override
        public r a(Class class_) {
            return new q(true);
        }
    };
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final boolean f;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    public q(boolean bl) {
        this.f = bl;
    }

    public static q i(t t8) {
        return (q)new s(t8, j).a(q.class);
    }

    @Override
    public void d() {
        if (n.D0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCleared called for ");
            stringBuilder.append((Object)this);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.g = true;
    }

    public void e(Fragment fragment) {
        if (this.i) {
            if (n.D0(2)) {
                Log.v((String)"FragmentManager", (String)"Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.containsKey((Object)fragment.t)) {
            return;
        }
        this.c.put((Object)fragment.t, (Object)fragment);
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating retained Fragments: Added ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (q.class != object.getClass()) {
                return false;
            }
            object = (q)object;
            if (this.c.equals((Object)object.c) && this.d.equals((Object)object.d) && this.e.equals((Object)object.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void f(Fragment fragment) {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("Clearing non-config state for ");
            object.append((Object)fragment);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        if ((object = (q)this.d.get((Object)fragment.t)) != null) {
            object.d();
            this.d.remove((Object)fragment.t);
        }
        if ((object = (t)this.e.get((Object)fragment.t)) != null) {
            object.a();
            this.e.remove((Object)fragment.t);
        }
    }

    public Fragment g(String string2) {
        return (Fragment)this.c.get((Object)string2);
    }

    public q h(Fragment fragment) {
        q q8;
        q q9 = q8 = (q)this.d.get((Object)fragment.t);
        if (q8 == null) {
            q9 = new q(this.f);
            this.d.put((Object)fragment.t, (Object)q9);
        }
        return q9;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }

    public Collection j() {
        return new ArrayList(this.c.values());
    }

    public t k(Fragment fragment) {
        t t8;
        t t9 = t8 = (t)this.e.get((Object)fragment.t);
        if (t8 == null) {
            t9 = new t();
            this.e.put((Object)fragment.t, (Object)t9);
        }
        return t9;
    }

    public boolean l() {
        return this.g;
    }

    public void m(Fragment fragment) {
        if (this.i) {
            if (n.D0(2)) {
                Log.v((String)"FragmentManager", (String)"Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.c.remove((Object)fragment.t) != null && n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating retained Fragments: Removed ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public void n(boolean bl) {
        this.i = bl;
    }

    public boolean o(Fragment fragment) {
        if (!this.c.containsKey((Object)fragment.t)) {
            return true;
        }
        if (this.f) {
            return this.g;
        }
        return this.h ^ true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append("} Fragments (");
        Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") Child Non Config (");
        iterator = this.d.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") ViewModelStores (");
        iterator = this.e.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

}

