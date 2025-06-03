package b1;

import android.app.Application;
import c1.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1781b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.a f1782c;

    public static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static a f1783c;

        /* renamed from: b, reason: collision with root package name */
        public final Application f1784b;

        public a(Application application) {
            this.f1784b = application;
        }

        @Override // b1.q0.c, b1.q0.b
        public final <T extends o0> T a(Class<T> cls) {
            Application application = this.f1784b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // b1.q0.c, b1.q0.b
        public final o0 b(Class cls, c1.b bVar) {
            if (this.f1784b != null) {
                return a(cls);
            }
            Application application = (Application) bVar.f2211a.get(p0.f1779a);
            if (application != null) {
                return c(cls, application);
            }
            if (b1.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public final <T extends o0> T c(Class<T> cls, Application application) {
            if (!b1.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                ec.i.d(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    public interface b {
        <T extends o0> T a(Class<T> cls);

        o0 b(Class cls, c1.b bVar);
    }

    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static c f1785a;

        @Override // b1.q0.b
        public <T extends o0> T a(Class<T> cls) {
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                ec.i.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // b1.q0.b
        public o0 b(Class cls, c1.b bVar) {
            return a(cls);
        }
    }

    public static class d {
        public void c(o0 o0Var) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, b bVar) {
        this(s0Var, bVar, a.C0033a.f2212b);
        ec.i.e(s0Var, "store");
    }

    public q0(s0 s0Var, b bVar, c1.a aVar) {
        ec.i.e(s0Var, "store");
        ec.i.e(aVar, "defaultCreationExtras");
        this.f1780a = s0Var;
        this.f1781b = bVar;
        this.f1782c = aVar;
    }

    public final <T extends o0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName);
    }

    public final o0 b(Class cls, String str) {
        o0 a10;
        ec.i.e(str, Constants.KEY);
        s0 s0Var = this.f1780a;
        s0Var.getClass();
        o0 o0Var = (o0) s0Var.f1790a.get(str);
        if (cls.isInstance(o0Var)) {
            Object obj = this.f1781b;
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                ec.i.b(o0Var);
                dVar.c(o0Var);
            }
            ec.i.c(o0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return o0Var;
        }
        c1.b bVar = new c1.b(this.f1782c);
        bVar.f2211a.put(r0.f1787a, str);
        try {
            a10 = this.f1781b.b(cls, bVar);
        } catch (AbstractMethodError unused) {
            a10 = this.f1781b.a(cls);
        }
        s0 s0Var2 = this.f1780a;
        s0Var2.getClass();
        ec.i.e(a10, "viewModel");
        o0 o0Var2 = (o0) s0Var2.f1790a.put(str, a10);
        if (o0Var2 != null) {
            o0Var2.b();
        }
        return a10;
    }
}
