package g9;

import android.app.Activity;
import android.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g9.a$a, reason: collision with other inner class name */
    public static class C0096a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5915a = new ArrayList();
    }

    public static class b extends Fragment {

        /* renamed from: a, reason: collision with root package name */
        public C0096a f5916a = new C0096a();

        @Override // android.app.Fragment
        public final void onStop() {
            C0096a c0096a;
            super.onStop();
            synchronized (this.f5916a) {
                c0096a = this.f5916a;
                this.f5916a = new C0096a();
            }
            Iterator it = c0096a.f5915a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class c extends x0.i {

        /* renamed from: a, reason: collision with root package name */
        public C0096a f5917a = new C0096a();

        @Override // x0.i
        public final void onStop() {
            C0096a c0096a;
            super.onStop();
            synchronized (this.f5917a) {
                c0096a = this.f5917a;
                this.f5917a = new C0096a();
            }
            Iterator it = c0096a.f5915a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static void a(Activity activity, d9.b0 b0Var) {
        if (activity != null) {
            boolean z10 = activity instanceof x0.m;
            if (z10) {
                x0.m mVar = (x0.m) activity;
                mVar.runOnUiThread(new x0.f(17, mVar, new b.k(b0Var, 11)));
            } else {
                b.m mVar2 = new b.m(b0Var, 14);
                x6.b.Z("onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", !z10, new Object[0]);
                activity.runOnUiThread(new g.q(15, activity, mVar2));
            }
        }
    }

    public static <T> T b(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder m10 = defpackage.f.m("Fragment with tag '", str, "' is a ");
            m10.append(obj.getClass().getName());
            m10.append(" but should be a ");
            m10.append(cls.getName());
            throw new IllegalStateException(m10.toString());
        }
    }
}
