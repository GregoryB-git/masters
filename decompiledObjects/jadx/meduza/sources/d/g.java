package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b1.k;
import b1.m;
import b1.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3314a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3315b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3316c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<String> f3317d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f3318e = new HashMap();
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f3319g = new Bundle();

    public static class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final d.b<O> f3320a;

        /* renamed from: b, reason: collision with root package name */
        public final e.a<?, O> f3321b;

        public a(e.a aVar, d.b bVar) {
            this.f3320a = bVar;
            this.f3321b = aVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final k f3322a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<m> f3323b = new ArrayList<>();

        public b(k kVar) {
            this.f3322a = kVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f3314a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f3318e.get(str);
        if (aVar == null || aVar.f3320a == null || !this.f3317d.contains(str)) {
            this.f.remove(str);
            this.f3319g.putParcelable(str, new d.a(i11, intent));
            return true;
        }
        aVar.f3320a.a(aVar.f3321b.c(i11, intent));
        this.f3317d.remove(str);
        return true;
    }

    public abstract void b(int i10, e.a aVar, Object obj);

    public final e c(String str, o oVar, e.a aVar, d.b bVar) {
        k lifecycle = oVar.getLifecycle();
        if (lifecycle.b().compareTo(k.b.STARTED) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + oVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        b bVar2 = (b) this.f3316c.get(str);
        if (bVar2 == null) {
            bVar2 = new b(lifecycle);
        }
        d dVar = new d(this, str, bVar, aVar);
        bVar2.f3322a.a(dVar);
        bVar2.f3323b.add(dVar);
        this.f3316c.put(str, bVar2);
        return new e(this, str, aVar);
    }

    public final f d(String str, e.a aVar, d.b bVar) {
        e(str);
        this.f3318e.put(str, new a(aVar, bVar));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            bVar.a(obj);
        }
        d.a aVar2 = (d.a) this.f3319g.getParcelable(str);
        if (aVar2 != null) {
            this.f3319g.remove(str);
            bVar.a(aVar.c(aVar2.f3305a, aVar2.f3306b));
        }
        return new f(this, str, aVar);
    }

    public final void e(String str) {
        if (((Integer) this.f3315b.get(str)) != null) {
            return;
        }
        gc.c.f7002a.getClass();
        int nextInt = gc.c.f7003b.a().nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f3314a.containsKey(Integer.valueOf(i10))) {
                this.f3314a.put(Integer.valueOf(i10), str);
                this.f3315b.put(str, Integer.valueOf(i10));
                return;
            } else {
                gc.c.f7002a.getClass();
                nextInt = gc.c.f7003b.a().nextInt(2147418112);
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f3317d.contains(str) && (num = (Integer) this.f3315b.remove(str)) != null) {
            this.f3314a.remove(num);
        }
        this.f3318e.remove(str);
        if (this.f.containsKey(str)) {
            StringBuilder m10 = defpackage.f.m("Dropping pending result for request ", str, ": ");
            m10.append(this.f.get(str));
            Log.w("ActivityResultRegistry", m10.toString());
            this.f.remove(str);
        }
        if (this.f3319g.containsKey(str)) {
            StringBuilder m11 = defpackage.f.m("Dropping pending result for request ", str, ": ");
            m11.append(this.f3319g.getParcelable(str));
            Log.w("ActivityResultRegistry", m11.toString());
            this.f3319g.remove(str);
        }
        b bVar = (b) this.f3316c.get(str);
        if (bVar != null) {
            Iterator<m> it = bVar.f3323b.iterator();
            while (it.hasNext()) {
                bVar.f3322a.c(it.next());
            }
            bVar.f3323b.clear();
            this.f3316c.remove(str);
        }
    }
}
