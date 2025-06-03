package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import d.AbstractC1161a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    public Random f8323a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final Map f8324b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f8325c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f8326d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f8327e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f8328f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8329g = new Bundle();

    public class a extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8334a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1161a f8335b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8336c;

        public a(int i7, AbstractC1161a abstractC1161a, String str) {
            this.f8334a = i7;
            this.f8335b = abstractC1161a;
            this.f8336c = str;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, w.b bVar) {
            ActivityResultRegistry.this.f(this.f8334a, this.f8335b, obj, bVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f8336c);
        }
    }

    public class b extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8338a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1161a f8339b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8340c;

        public b(int i7, AbstractC1161a abstractC1161a, String str) {
            this.f8338a = i7;
            this.f8339b = abstractC1161a;
            this.f8340c = str;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, w.b bVar) {
            ActivityResultRegistry.this.f(this.f8338a, this.f8339b, obj, bVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f8340c);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.b f8342a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1161a f8343b;

        public c(androidx.activity.result.b bVar, AbstractC1161a abstractC1161a) {
            this.f8342a = bVar;
            this.f8343b = abstractC1161a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.d f8344a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f8345b = new ArrayList();

        public d(androidx.lifecycle.d dVar) {
            this.f8344a = dVar;
        }

        public void a(f fVar) {
            this.f8344a.a(fVar);
            this.f8345b.add(fVar);
        }

        public void b() {
            Iterator it = this.f8345b.iterator();
            while (it.hasNext()) {
                this.f8344a.c((f) it.next());
            }
            this.f8345b.clear();
        }
    }

    public final void a(int i7, String str) {
        this.f8324b.put(Integer.valueOf(i7), str);
        this.f8325c.put(str, Integer.valueOf(i7));
    }

    public final boolean b(int i7, int i8, Intent intent) {
        String str = (String) this.f8324b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        d(str, i8, intent, (c) this.f8327e.get(str));
        return true;
    }

    public final boolean c(int i7, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f8324b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f8327e.get(str);
        if (cVar != null && (bVar = cVar.f8342a) != null) {
            bVar.a(obj);
            return true;
        }
        this.f8329g.remove(str);
        this.f8328f.put(str, obj);
        return true;
    }

    public final void d(String str, int i7, Intent intent, c cVar) {
        androidx.activity.result.b bVar;
        if (cVar != null && (bVar = cVar.f8342a) != null) {
            bVar.a(cVar.f8343b.c(i7, intent));
        } else {
            this.f8328f.remove(str);
            this.f8329g.putParcelable(str, new androidx.activity.result.a(i7, intent));
        }
    }

    public final int e() {
        int nextInt = this.f8323a.nextInt(2147418112);
        while (true) {
            int i7 = nextInt + 65536;
            if (!this.f8324b.containsKey(Integer.valueOf(i7))) {
                return i7;
            }
            nextInt = this.f8323a.nextInt(2147418112);
        }
    }

    public abstract void f(int i7, AbstractC1161a abstractC1161a, Object obj, w.b bVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a(integerArrayList.get(i7).intValue(), stringArrayList.get(i7));
        }
        this.f8323a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f8329g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f8324b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f8324b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f8329g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f8323a);
    }

    public final androidx.activity.result.c i(final String str, h hVar, final AbstractC1161a abstractC1161a, final androidx.activity.result.b bVar) {
        androidx.lifecycle.d g7 = hVar.g();
        if (g7.b().c(d.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + hVar + " is attempting to register while current state is " + g7.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int k7 = k(str);
        d dVar = (d) this.f8326d.get(str);
        if (dVar == null) {
            dVar = new d(g7);
        }
        dVar.a(new f() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.f
            public void a(h hVar2, d.b bVar2) {
                if (!d.b.ON_START.equals(bVar2)) {
                    if (d.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f8327e.remove(str);
                        return;
                    } else {
                        if (d.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f8327e.put(str, new c(bVar, abstractC1161a));
                if (ActivityResultRegistry.this.f8328f.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f8328f.get(str);
                    ActivityResultRegistry.this.f8328f.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar = (androidx.activity.result.a) ActivityResultRegistry.this.f8329g.getParcelable(str);
                if (aVar != null) {
                    ActivityResultRegistry.this.f8329g.remove(str);
                    bVar.a(abstractC1161a.c(aVar.b(), aVar.a()));
                }
            }
        });
        this.f8326d.put(str, dVar);
        return new a(k7, abstractC1161a, str);
    }

    public final androidx.activity.result.c j(String str, AbstractC1161a abstractC1161a, androidx.activity.result.b bVar) {
        int k7 = k(str);
        this.f8327e.put(str, new c(bVar, abstractC1161a));
        if (this.f8328f.containsKey(str)) {
            Object obj = this.f8328f.get(str);
            this.f8328f.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f8329g.getParcelable(str);
        if (aVar != null) {
            this.f8329g.remove(str);
            bVar.a(abstractC1161a.c(aVar.b(), aVar.a()));
        }
        return new b(k7, abstractC1161a, str);
    }

    public final int k(String str) {
        Integer num = (Integer) this.f8325c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e7 = e();
        a(e7, str);
        return e7;
    }

    public final void l(String str) {
        Integer num = (Integer) this.f8325c.remove(str);
        if (num != null) {
            this.f8324b.remove(num);
        }
        this.f8327e.remove(str);
        if (this.f8328f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8328f.get(str));
            this.f8328f.remove(str);
        }
        if (this.f8329g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f8329g.getParcelable(str));
            this.f8329g.remove(str);
        }
        d dVar = (d) this.f8326d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f8326d.remove(str);
        }
    }
}
