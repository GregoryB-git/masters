// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.util.Log;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class u
{
    public final ArrayList a;
    public final HashMap b;
    public q c;
    
    public u() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
    
    public void a(final Fragment obj) {
        if (!this.a.contains(obj)) {
            synchronized (this.a) {
                this.a.add(obj);
                // monitorexit(this.a)
                obj.z = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    public void b() {
        this.b.values().removeAll(Collections.singleton((Object)null));
    }
    
    public boolean c(final String key) {
        return this.b.get(key) != null;
    }
    
    public void d(final int n) {
        for (final t t : this.b.values()) {
            if (t != null) {
                t.t(n);
            }
        }
    }
    
    public void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        if (!this.b.isEmpty()) {
            printWriter.print(s);
            printWriter.print("Active Fragments:");
            for (final t t : this.b.values()) {
                printWriter.print(s);
                if (t != null) {
                    final Fragment k = t.k();
                    printWriter.println(k);
                    k.h(string, fileDescriptor, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = this.a.size();
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final Fragment fragment = this.a.get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }
    
    public Fragment f(final String key) {
        final t t = this.b.get(key);
        if (t != null) {
            return t.k();
        }
        return null;
    }
    
    public Fragment g(final int n) {
        for (int i = this.a.size() - 1; i >= 0; --i) {
            final Fragment fragment = this.a.get(i);
            if (fragment != null && fragment.K == n) {
                return fragment;
            }
        }
        for (final t t : this.b.values()) {
            if (t != null) {
                final Fragment k = t.k();
                if (k.K == n) {
                    return k;
                }
                continue;
            }
        }
        return null;
    }
    
    public Fragment h(final String s) {
        if (s != null) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final Fragment fragment = this.a.get(i);
                if (fragment != null && s.equals(fragment.M)) {
                    return fragment;
                }
            }
        }
        if (s != null) {
            for (final t t : this.b.values()) {
                if (t != null) {
                    final Fragment k = t.k();
                    if (s.equals(k.M)) {
                        return k;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    public Fragment i(final String s) {
        for (final t t : this.b.values()) {
            if (t != null) {
                final Fragment l = t.k().l(s);
                if (l != null) {
                    return l;
                }
                continue;
            }
        }
        return null;
    }
    
    public int j(Fragment o) {
        final ViewGroup u = o.U;
        if (u == null) {
            return -1;
        }
        final int index = this.a.indexOf(o);
        int index2 = index - 1;
        int index3;
        while (true) {
            index3 = index;
            if (index2 < 0) {
                break;
            }
            o = (Fragment)this.a.get(index2);
            if (o.U == u) {
                final View v = o.V;
                if (v != null) {
                    return u.indexOfChild(v) + 1;
                }
            }
            --index2;
        }
        while (true) {
            ++index3;
            if (index3 >= this.a.size()) {
                return -1;
            }
            o = (Fragment)this.a.get(index3);
            if (o.U != u) {
                continue;
            }
            final View v2 = o.V;
            if (v2 != null) {
                return u.indexOfChild(v2);
            }
        }
    }
    
    public List k() {
        final ArrayList<t> list = new ArrayList<t>();
        for (final t e : this.b.values()) {
            if (e != null) {
                list.add(e);
            }
        }
        return list;
    }
    
    public List l() {
        final ArrayList<Fragment> list = new ArrayList<Fragment>();
        for (final t t : this.b.values()) {
            Fragment k;
            if (t != null) {
                k = t.k();
            }
            else {
                k = null;
            }
            list.add(k);
        }
        return list;
    }
    
    public t m(final String key) {
        return this.b.get(key);
    }
    
    public List n() {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            return new ArrayList(this.a);
        }
    }
    
    public q o() {
        return this.c;
    }
    
    public void p(final t value) {
        final Fragment k = value.k();
        if (this.c(k.t)) {
            return;
        }
        this.b.put(k.t, value);
        if (k.Q) {
            if (k.P) {
                this.c.e(k);
            }
            else {
                this.c.m(k);
            }
            k.Q = false;
        }
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public void q(final t t) {
        final Fragment k = t.k();
        if (k.P) {
            this.c.m(k);
        }
        if (this.b.put(k.t, null) == null) {
            return;
        }
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public void r() {
        final Iterator<Fragment> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final t t = this.b.get(iterator.next().t);
            if (t != null) {
                t.m();
            }
        }
        for (final t t2 : this.b.values()) {
            if (t2 != null) {
                t2.m();
                final Fragment k = t2.k();
                if (!k.A || k.Y()) {
                    continue;
                }
                this.q(t2);
            }
        }
    }
    
    public void s(final Fragment o) {
        synchronized (this.a) {
            this.a.remove(o);
            // monitorexit(this.a)
            o.z = false;
        }
    }
    
    public void t() {
        this.b.clear();
    }
    
    public void u(final List list) {
        this.a.clear();
        if (list != null) {
            for (final String s : list) {
                final Fragment f = this.f(s);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No instantiated fragment for (");
                    sb.append(s);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                if (n.D0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: added (");
                    sb2.append(s);
                    sb2.append("): ");
                    sb2.append(f);
                    Log.v("FragmentManager", sb2.toString());
                }
                this.a(f);
            }
        }
    }
    
    public ArrayList v() {
        final ArrayList<s> list = new ArrayList<s>(this.b.size());
        for (final t t : this.b.values()) {
            if (t != null) {
                final Fragment k = t.k();
                final s r = t.r();
                list.add(r);
                if (!n.D0(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Saved state of ");
                sb.append(k);
                sb.append(": ");
                sb.append(r.A);
                Log.v("FragmentManager", sb.toString());
            }
        }
        return list;
    }
    
    public ArrayList w() {
        final ArrayList a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.a.isEmpty()) {
                    // monitorexit(a)
                    return null;
                }
                final ArrayList<String> list = new ArrayList<String>(this.a.size());
                for (final Fragment obj : this.a) {
                    list.add(obj.t);
                    if (n.D0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(obj.t);
                        sb.append("): ");
                        sb.append(obj);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                // monitorexit(a)
                return list;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void x(final q c) {
        this.c = c;
    }
}
