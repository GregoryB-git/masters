package w1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import io.meduza.meduza.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f16184d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f16185e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f16188c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f16187b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16186a = new HashMap();

    public a(Context context) {
        this.f16188c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f16184d == null) {
            synchronized (f16185e) {
                if (f16184d == null) {
                    f16184d = new a(context);
                }
            }
        }
        return f16184d;
    }

    public final void a(Bundle bundle) {
        String string = this.f16188c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f16187b.add(cls);
                        }
                    }
                }
                Iterator it = this.f16187b.iterator();
                while (it.hasNext()) {
                    b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (z1.a.b()) {
            try {
                Trace.beginSection(z1.a.c(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f16186a.containsKey(cls)) {
            obj = this.f16186a.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : a10) {
                        if (!this.f16186a.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f16188c);
                hashSet.remove(cls);
                this.f16186a.put(cls, obj);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return obj;
    }
}
