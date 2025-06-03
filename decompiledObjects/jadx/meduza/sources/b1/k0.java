package b1;

import android.app.Application;
import android.os.Bundle;
import b1.q0;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class k0 extends q0.d implements q0.b {

    /* renamed from: a, reason: collision with root package name */
    public Application f1751a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f1752b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1753c;

    /* renamed from: d, reason: collision with root package name */
    public k f1754d;

    /* renamed from: e, reason: collision with root package name */
    public s1.c f1755e;

    public k0(Application application, s1.e eVar, Bundle bundle) {
        q0.a aVar;
        ec.i.e(eVar, "owner");
        this.f1755e = eVar.getSavedStateRegistry();
        this.f1754d = eVar.getLifecycle();
        this.f1753c = bundle;
        this.f1751a = application;
        if (application != null) {
            if (q0.a.f1783c == null) {
                q0.a.f1783c = new q0.a(application);
            }
            aVar = q0.a.f1783c;
            ec.i.b(aVar);
        } else {
            aVar = new q0.a(null);
        }
        this.f1752b = aVar;
    }

    @Override // b1.q0.b
    public final <T extends o0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // b1.q0.b
    public final o0 b(Class cls, c1.b bVar) {
        String str = (String) bVar.f2211a.get(r0.f1787a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (bVar.f2211a.get(h0.f1734a) == null || bVar.f2211a.get(h0.f1735b) == null) {
            if (this.f1754d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) bVar.f2211a.get(p0.f1779a);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a10 = l0.a(cls, (!isAssignableFrom || application == null) ? l0.f1758b : l0.f1757a);
        return a10 == null ? this.f1752b.b(cls, bVar) : (!isAssignableFrom || application == null) ? l0.b(cls, a10, h0.a(bVar)) : l0.b(cls, a10, application, h0.a(bVar));
    }

    @Override // b1.q0.d
    public final void c(o0 o0Var) {
        if (this.f1754d != null) {
            s1.c cVar = this.f1755e;
            ec.i.b(cVar);
            k kVar = this.f1754d;
            ec.i.b(kVar);
            i.a(o0Var, cVar, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b1.o0 d(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            b1.k r0 = r9.f1754d
            if (r0 == 0) goto Lb4
            java.lang.Class<b1.a> r1 = b1.a.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L13
            android.app.Application r2 = r9.f1751a
            if (r2 == 0) goto L13
            java.util.List<java.lang.Class<?>> r2 = b1.l0.f1757a
            goto L15
        L13:
            java.util.List<java.lang.Class<?>> r2 = b1.l0.f1758b
        L15:
            java.lang.reflect.Constructor r2 = b1.l0.a(r10, r2)
            if (r2 != 0) goto L3b
            android.app.Application r11 = r9.f1751a
            if (r11 == 0) goto L26
            b1.q0$a r11 = r9.f1752b
            b1.o0 r10 = r11.a(r10)
            goto L3a
        L26:
            b1.q0$c r11 = b1.q0.c.f1785a
            if (r11 != 0) goto L31
            b1.q0$c r11 = new b1.q0$c
            r11.<init>()
            b1.q0.c.f1785a = r11
        L31:
            b1.q0$c r11 = b1.q0.c.f1785a
            ec.i.b(r11)
            b1.o0 r10 = r11.a(r10)
        L3a:
            return r10
        L3b:
            s1.c r3 = r9.f1755e
            ec.i.b(r3)
            android.os.Bundle r4 = r9.f1753c
            android.os.Bundle r5 = r3.a(r11)
            java.lang.Class<? extends java.lang.Object>[] r6 = b1.e0.f
            b1.e0 r4 = b1.e0.a.a(r5, r4)
            b1.g0 r5 = new b1.g0
            r5.<init>(r11, r4)
            r5.b(r0, r3)
            b1.k$b r11 = r0.b()
            b1.k$b r6 = b1.k.b.INITIALIZED
            r7 = 1
            r8 = 0
            if (r11 == r6) goto L75
            b1.k$b r6 = b1.k.b.STARTED
            int r11 = r11.compareTo(r6)
            if (r11 < 0) goto L68
            r11 = r7
            goto L69
        L68:
            r11 = r8
        L69:
            if (r11 == 0) goto L6c
            goto L75
        L6c:
            b1.j r11 = new b1.j
            r11.<init>(r0, r3)
            r0.a(r11)
            goto L78
        L75:
            r3.d()
        L78:
            if (r1 == 0) goto L8a
            android.app.Application r11 = r9.f1751a
            if (r11 == 0) goto L8a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r11
            r0[r7] = r4
            b1.o0 r10 = b1.l0.b(r10, r2, r0)
            goto L92
        L8a:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r8] = r4
            b1.o0 r10 = b1.l0.b(r10, r2, r11)
        L92:
            java.lang.String r11 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r0 = r10.f1766a
            monitor-enter(r0)
            java.util.HashMap r1 = r10.f1766a     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto La4
            java.util.HashMap r2 = r10.f1766a     // Catch: java.lang.Throwable -> Lb1
            r2.put(r11, r5)     // Catch: java.lang.Throwable -> Lb1
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r1 != 0) goto La8
            goto La9
        La8:
            r5 = r1
        La9:
            boolean r11 = r10.f1768c
            if (r11 == 0) goto Lb0
            b1.o0.a(r5)
        Lb0:
            return r10
        Lb1:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r10
        Lb4:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r11 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.k0.d(java.lang.Class, java.lang.String):b1.o0");
    }
}
