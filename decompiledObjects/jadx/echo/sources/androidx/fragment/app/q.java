package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends androidx.lifecycle.r {

    /* renamed from: j, reason: collision with root package name */
    public static final s.a f9518j = new a();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9522f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9519c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9520d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f9521e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f9523g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9524h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9525i = false;

    public class a implements s.a {
        @Override // androidx.lifecycle.s.a
        public androidx.lifecycle.r a(Class cls) {
            return new q(true);
        }
    }

    public q(boolean z7) {
        this.f9522f = z7;
    }

    public static q i(androidx.lifecycle.t tVar) {
        return (q) new androidx.lifecycle.s(tVar, f9518j).a(q.class);
    }

    @Override // androidx.lifecycle.r
    public void d() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f9523g = true;
    }

    public void e(Fragment fragment) {
        if (this.f9525i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f9519c.containsKey(fragment.f9280t)) {
                return;
            }
            this.f9519c.put(fragment.f9280t, fragment);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9519c.equals(qVar.f9519c) && this.f9520d.equals(qVar.f9520d) && this.f9521e.equals(qVar.f9521e);
    }

    public void f(Fragment fragment) {
        if (n.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = (q) this.f9520d.get(fragment.f9280t);
        if (qVar != null) {
            qVar.d();
            this.f9520d.remove(fragment.f9280t);
        }
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) this.f9521e.get(fragment.f9280t);
        if (tVar != null) {
            tVar.a();
            this.f9521e.remove(fragment.f9280t);
        }
    }

    public Fragment g(String str) {
        return (Fragment) this.f9519c.get(str);
    }

    public q h(Fragment fragment) {
        q qVar = (q) this.f9520d.get(fragment.f9280t);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f9522f);
        this.f9520d.put(fragment.f9280t, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f9519c.hashCode() * 31) + this.f9520d.hashCode()) * 31) + this.f9521e.hashCode();
    }

    public Collection j() {
        return new ArrayList(this.f9519c.values());
    }

    public androidx.lifecycle.t k(Fragment fragment) {
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) this.f9521e.get(fragment.f9280t);
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t();
        this.f9521e.put(fragment.f9280t, tVar2);
        return tVar2;
    }

    public boolean l() {
        return this.f9523g;
    }

    public void m(Fragment fragment) {
        if (this.f9525i) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f9519c.remove(fragment.f9280t) == null || !n.D0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void n(boolean z7) {
        this.f9525i = z7;
    }

    public boolean o(Fragment fragment) {
        if (this.f9519c.containsKey(fragment.f9280t)) {
            return this.f9522f ? this.f9523g : !this.f9524h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f9519c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f9520d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f9521e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
