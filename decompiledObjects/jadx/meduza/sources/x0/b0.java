package x0;

import android.util.Log;
import b1.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 extends b1.o0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f16537j = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16540g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, i> f16538d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, b0> f16539e = new HashMap<>();
    public final HashMap<String, b1.s0> f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f16541h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16542i = false;

    public class a implements q0.b {
        @Override // b1.q0.b
        public final <T extends b1.o0> T a(Class<T> cls) {
            return new b0(true);
        }

        @Override // b1.q0.b
        public final b1.o0 b(Class cls, c1.b bVar) {
            return a(cls);
        }
    }

    public b0(boolean z10) {
        this.f16540g = z10;
    }

    @Override // b1.o0
    public final void b() {
        if (y.L(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f16541h = true;
    }

    public final void c(i iVar) {
        if (this.f16542i) {
            if (y.L(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f16538d.containsKey(iVar.mWho)) {
                return;
            }
            this.f16538d.put(iVar.mWho, iVar);
            if (y.L(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + iVar);
            }
        }
    }

    public final void d(String str, boolean z10) {
        if (y.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z10);
    }

    public final void e(i iVar, boolean z10) {
        if (y.L(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + iVar);
        }
        f(iVar.mWho, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f16538d.equals(b0Var.f16538d) && this.f16539e.equals(b0Var.f16539e) && this.f.equals(b0Var.f);
    }

    public final void f(String str, boolean z10) {
        b0 b0Var = this.f16539e.get(str);
        if (b0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b0Var.f16539e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b0Var.d((String) it.next(), true);
                }
            }
            b0Var.b();
            this.f16539e.remove(str);
        }
        b1.s0 s0Var = this.f.get(str);
        if (s0Var != null) {
            s0Var.a();
            this.f.remove(str);
        }
    }

    public final void g(i iVar) {
        if (this.f16542i) {
            if (y.L(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f16538d.remove(iVar.mWho) != null) && y.L(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + iVar);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f16539e.hashCode() + (this.f16538d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<i> it = this.f16538d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f16539e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
