package y0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Set;
import sb.u;
import x0.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static c f17301a = c.f17311c;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: y0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0262b {
        void a();
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f17311c = new c();

        /* renamed from: a, reason: collision with root package name */
        public final Set<a> f17312a = u.f14326a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f17313b = new LinkedHashMap();
    }

    public static c a(x0.i iVar) {
        while (iVar != null) {
            if (iVar.isAdded()) {
                ec.i.d(iVar.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            iVar = iVar.getParentFragment();
        }
        return f17301a;
    }

    public static void b(c cVar, k kVar) {
        x0.i iVar = kVar.f17314a;
        String name = iVar.getClass().getName();
        if (cVar.f17312a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, kVar);
        }
        cVar.getClass();
        if (cVar.f17312a.contains(a.PENALTY_DEATH)) {
            e(iVar, new w.g(4, name, kVar));
        }
    }

    public static void c(k kVar) {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("StrictMode violation in ");
            l10.append(kVar.f17314a.getClass().getName());
            Log.d("FragmentManager", l10.toString(), kVar);
        }
    }

    public static final void d(x0.i iVar, String str) {
        ec.i.e(iVar, "fragment");
        ec.i.e(str, "previousFragmentId");
        y0.a aVar = new y0.a(iVar, str);
        c(aVar);
        c a10 = a(iVar);
        if (a10.f17312a.contains(a.DETECT_FRAGMENT_REUSE) && f(a10, iVar.getClass(), y0.a.class)) {
            b(a10, aVar);
        }
    }

    public static void e(x0.i iVar, Runnable runnable) {
        if (iVar.isAdded()) {
            Handler handler = iVar.getParentFragmentManager().f16787w.f16758c;
            if (!ec.i.a(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public static boolean f(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f17313b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (ec.i.a(cls2.getSuperclass(), k.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
