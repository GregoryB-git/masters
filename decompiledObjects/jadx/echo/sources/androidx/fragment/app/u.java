package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9547a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9548b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public q f9549c;

    public void a(Fragment fragment) {
        if (this.f9547a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f9547a) {
            this.f9547a.add(fragment);
        }
        fragment.f9286z = true;
    }

    public void b() {
        this.f9548b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f9548b.get(str) != null;
    }

    public void d(int i7) {
        for (t tVar : this.f9548b.values()) {
            if (tVar != null) {
                tVar.t(i7);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f9548b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (t tVar : this.f9548b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment k7 = tVar.k();
                    printWriter.println(k7);
                    k7.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f9547a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = (Fragment) this.f9547a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        t tVar = (t) this.f9548b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    public Fragment g(int i7) {
        for (int size = this.f9547a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f9547a.get(size);
            if (fragment != null && fragment.f9246K == i7) {
                return fragment;
            }
        }
        for (t tVar : this.f9548b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (k7.f9246K == i7) {
                    return k7;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f9547a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f9547a.get(size);
                if (fragment != null && str.equals(fragment.f9248M)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f9548b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (str.equals(k7.f9248M)) {
                    return k7;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment l7;
        for (t tVar : this.f9548b.values()) {
            if (tVar != null && (l7 = tVar.k().l(str)) != null) {
                return l7;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f9256U;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f9547a.indexOf(fragment);
        for (int i7 = indexOf - 1; i7 >= 0; i7--) {
            Fragment fragment2 = (Fragment) this.f9547a.get(i7);
            if (fragment2.f9256U == viewGroup && (view2 = fragment2.f9257V) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f9547a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f9547a.get(indexOf);
            if (fragment3.f9256U == viewGroup && (view = fragment3.f9257V) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f9548b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f9548b.values()) {
            arrayList.add(tVar != null ? tVar.k() : null);
        }
        return arrayList;
    }

    public t m(String str) {
        return (t) this.f9548b.get(str);
    }

    public List n() {
        ArrayList arrayList;
        if (this.f9547a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9547a) {
            arrayList = new ArrayList(this.f9547a);
        }
        return arrayList;
    }

    public q o() {
        return this.f9549c;
    }

    public void p(t tVar) {
        Fragment k7 = tVar.k();
        if (c(k7.f9280t)) {
            return;
        }
        this.f9548b.put(k7.f9280t, tVar);
        if (k7.f9252Q) {
            if (k7.f9251P) {
                this.f9549c.e(k7);
            } else {
                this.f9549c.m(k7);
            }
            k7.f9252Q = false;
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k7);
        }
    }

    public void q(t tVar) {
        Fragment k7 = tVar.k();
        if (k7.f9251P) {
            this.f9549c.m(k7);
        }
        if (((t) this.f9548b.put(k7.f9280t, null)) != null && n.D0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k7);
        }
    }

    public void r() {
        Iterator it = this.f9547a.iterator();
        while (it.hasNext()) {
            t tVar = (t) this.f9548b.get(((Fragment) it.next()).f9280t);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f9548b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment k7 = tVar2.k();
                if (k7.f9236A && !k7.Y()) {
                    q(tVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.f9547a) {
            this.f9547a.remove(fragment);
        }
        fragment.f9286z = false;
    }

    public void t() {
        this.f9548b.clear();
    }

    public void u(List list) {
        this.f9547a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f7 = f(str);
                if (f7 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f7);
                }
                a(f7);
            }
        }
    }

    public ArrayList v() {
        ArrayList arrayList = new ArrayList(this.f9548b.size());
        for (t tVar : this.f9548b.values()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                s r7 = tVar.r();
                arrayList.add(r7);
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k7 + ": " + r7.f9526A);
                }
            }
        }
        return arrayList;
    }

    public ArrayList w() {
        synchronized (this.f9547a) {
            try {
                if (this.f9547a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f9547a.size());
                Iterator it = this.f9547a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.f9280t);
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f9280t + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(q qVar) {
        this.f9549c = qVar;
    }
}
