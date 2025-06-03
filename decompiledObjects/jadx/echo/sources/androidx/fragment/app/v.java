package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final j f9550a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f9551b;

    /* renamed from: d, reason: collision with root package name */
    public int f9553d;

    /* renamed from: e, reason: collision with root package name */
    public int f9554e;

    /* renamed from: f, reason: collision with root package name */
    public int f9555f;

    /* renamed from: g, reason: collision with root package name */
    public int f9556g;

    /* renamed from: h, reason: collision with root package name */
    public int f9557h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9558i;

    /* renamed from: k, reason: collision with root package name */
    public String f9560k;

    /* renamed from: l, reason: collision with root package name */
    public int f9561l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f9562m;

    /* renamed from: n, reason: collision with root package name */
    public int f9563n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f9564o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f9565p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f9566q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f9568s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f9552c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f9559j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9567r = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9569a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f9570b;

        /* renamed from: c, reason: collision with root package name */
        public int f9571c;

        /* renamed from: d, reason: collision with root package name */
        public int f9572d;

        /* renamed from: e, reason: collision with root package name */
        public int f9573e;

        /* renamed from: f, reason: collision with root package name */
        public int f9574f;

        /* renamed from: g, reason: collision with root package name */
        public d.c f9575g;

        /* renamed from: h, reason: collision with root package name */
        public d.c f9576h;

        public a() {
        }

        public a(int i7, Fragment fragment) {
            this.f9569a = i7;
            this.f9570b = fragment;
            d.c cVar = d.c.RESUMED;
            this.f9575g = cVar;
            this.f9576h = cVar;
        }
    }

    public v(j jVar, ClassLoader classLoader) {
        this.f9550a = jVar;
        this.f9551b = classLoader;
    }

    public v b(int i7, Fragment fragment, String str) {
        j(i7, fragment, str, 1);
        return this;
    }

    public v c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f9256U = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public v d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f9552c.add(aVar);
        aVar.f9571c = this.f9553d;
        aVar.f9572d = this.f9554e;
        aVar.f9573e = this.f9555f;
        aVar.f9574f = this.f9556g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public v i() {
        if (this.f9558i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9559j = false;
        return this;
    }

    public void j(int i7, Fragment fragment, String str, int i8) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f9248M;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f9248M + " now " + str);
            }
            fragment.f9248M = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.f9246K;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f9246K + " now " + i7);
            }
            fragment.f9246K = i7;
            fragment.f9247L = i7;
        }
        e(new a(i8, fragment));
    }

    public v k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public v l(boolean z7) {
        this.f9567r = z7;
        return this;
    }
}
