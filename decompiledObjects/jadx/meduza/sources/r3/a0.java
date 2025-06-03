package r3;

import android.content.Context;
import b8.c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import i9.f0;
import i9.m1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t8.e;

/* loaded from: classes.dex */
public final class a0 implements m3.b, z4.x, Continuation, f0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f13549a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13550b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13551c;

    public /* synthetic */ a0(b8.r rVar, String str, b8.c cVar) {
        this.f13549a = str;
        this.f13550b = cVar;
        this.f13551c = rVar;
    }

    public /* synthetic */ a0(i9.w wVar) {
        this.f13550b = wVar;
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3) {
        this.f13549a = obj;
        this.f13550b = obj2;
        this.f13551c = obj3;
    }

    public static Method g(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return g(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final long a() {
        Object obj = this.f13551c;
        if (((c4.i) obj) != null) {
            return ((c4.i) obj).getPosition();
        }
        return -1L;
    }

    public final Method b(Class cls) {
        Method g10;
        Class cls2;
        String str = (String) this.f13550b;
        if (str == null || !((g10 = g(cls, str, (Class[]) this.f13551c)) == null || (cls2 = (Class) this.f13549a) == null || cls2.isAssignableFrom(g10.getReturnType()))) {
            return null;
        }
        return g10;
    }

    @Override // i9.f0
    public final void c(j9.i iVar) {
        ((Set) this.f13551c).add(iVar);
    }

    @Override // i9.f0
    public final void d() {
        i9.y yVar = ((i9.w) this.f13550b).f7831h;
        ArrayList arrayList = new ArrayList();
        for (j9.i iVar : (Set) this.f13551c) {
            if (!q(iVar)) {
                arrayList.add(iVar);
            }
        }
        yVar.b(arrayList);
        this.f13551c = null;
    }

    @Override // i9.f0
    public final void e(j9.i iVar) {
        ((Set) this.f13551c).remove(iVar);
    }

    @Override // i9.f0
    public final void f() {
        this.f13551c = new HashSet();
    }

    @Override // qb.a
    public final Object get() {
        return new z((Context) ((qb.a) this.f13549a).get(), (String) ((qb.a) this.f13550b).get(), ((Integer) ((qb.a) this.f13551c).get()).intValue());
    }

    @Override // i9.f0
    public final long h() {
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r6.f2276d != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0062, code lost:
    
        if (r6.f2276d != r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(t5.k r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, c4.j r15) {
        /*
            r7 = this;
            c4.e r6 = new c4.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f13551c = r6
            java.lang.Object r8 = r7.f13550b
            c4.h r8 = (c4.h) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.lang.Object r8 = r7.f13549a
            c4.k r8 = (c4.k) r8
            c4.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L25
            r8 = r8[r13]
            r7.f13550b = r8
            goto Lb9
        L25:
            int r10 = r8.length
            r0 = r13
        L27:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.i(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L36
            r7.f13550b = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f = r13
            goto L70
        L36:
            java.lang.Object r1 = r7.f13550b
            c4.h r1 = (c4.h) r1
            if (r1 != 0) goto L67
            long r1 = r6.f2276d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L43:
            r8 = move-exception
            java.lang.Object r9 = r7.f13550b
            c4.h r9 = (c4.h) r9
            if (r9 != 0) goto L52
            long r9 = r6.f2276d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            goto L52
        L51:
            r14 = r13
        L52:
            x6.b.H(r14)
            r6.f = r13
            throw r8
        L58:
            java.lang.Object r1 = r7.f13550b
            c4.h r1 = (c4.h) r1
            if (r1 != 0) goto L67
            long r1 = r6.f2276d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L65:
            r1 = r13
            goto L68
        L67:
            r1 = r14
        L68:
            x6.b.H(r1)
            r6.f = r13
            int r0 = r0 + 1
            goto L27
        L70:
            java.lang.Object r10 = r7.f13550b
            c4.h r10 = (c4.h) r10
            if (r10 != 0) goto Lb9
            z4.k0 r10 = new z4.k0
            java.lang.String r11 = "None of the available extractors ("
            java.lang.StringBuilder r11 = defpackage.f.l(r11)
            int r12 = v5.e0.f15881a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L85:
            int r14 = r8.length
            if (r13 >= r14) goto La2
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r12.append(r14)
            int r14 = r8.length
            int r14 = r14 + (-1)
            if (r13 >= r14) goto L9f
            java.lang.String r14 = ", "
            r12.append(r14)
        L9f:
            int r13 = r13 + 1
            goto L85
        La2:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lb9:
            java.lang.Object r8 = r7.f13550b
            c4.h r8 = (c4.h) r8
            r8.b(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.a0.i(t5.k, android.net.Uri, java.util.Map, long, long, c4.j):void");
    }

    public final Object j(Object obj, Object... objArr) {
        Method b10 = b(obj.getClass());
        if (b10 == null) {
            StringBuilder l10 = defpackage.f.l("Method ");
            l10.append((String) this.f13550b);
            l10.append(" not supported for object ");
            l10.append(obj);
            throw new AssertionError(l10.toString());
        }
        try {
            return b10.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + b10);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    @Override // i9.f0
    public final void k(j9.i iVar) {
        if (q(iVar)) {
            ((Set) this.f13551c).remove(iVar);
        } else {
            ((Set) this.f13551c).add(iVar);
        }
    }

    public final void l(Object obj, Object... objArr) {
        try {
            Method b10 = b(obj.getClass());
            if (b10 == null) {
                return;
            }
            try {
                b10.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // i9.f0
    public final void m(l3.l lVar) {
        this.f13549a = lVar;
    }

    @Override // i9.f0
    public final void n(j9.i iVar) {
        ((Set) this.f13551c).add(iVar);
    }

    @Override // i9.f0
    public final void o(m1 m1Var) {
        i9.z zVar = ((i9.w) this.f13550b).f;
        Iterator<j9.i> it = zVar.f(m1Var.f7735b).iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                zVar.f7863a.remove(m1Var.f7734a);
                zVar.f7864b.d(m1Var.f7735b);
                return;
            } else {
                ((Set) this.f13551c).add((j9.i) aVar.next());
            }
        }
    }

    public final Object p(Object obj, Object... objArr) {
        try {
            return j(obj, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final boolean q(j9.i iVar) {
        boolean z10;
        if (((i9.w) this.f13550b).f.f7864b.a(iVar)) {
            return true;
        }
        Iterator it = ((i9.w) this.f13550b).f7827c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (((i9.v) it.next()).l(iVar)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        l3.l lVar = (l3.l) this.f13549a;
        return lVar != null && lVar.a(iVar);
    }

    public final k9.f r(j9.i iVar, k9.m mVar) {
        Object obj = this.f13550b;
        return ((k9.d) obj) != null ? new k9.l(iVar, (j9.n) this.f13549a, (k9.d) obj, mVar, (List) this.f13551c) : new k9.o(iVar, (j9.n) this.f13549a, mVar, (List) this.f13551c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        b8.s sVar = (b8.s) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(((b8.r) this.f13551c).K());
        String str = sVar.f2137a;
        m6.j.i(str);
        String str2 = (String) this.f13549a;
        b8.c cVar = (b8.c) this.f13550b;
        firebaseAuth.getClass();
        m6.j.e(str);
        m6.j.e(str2);
        if (cVar == null) {
            cVar = new b8.c(new c.a());
        }
        String str3 = firebaseAuth.f3064i;
        if (str3 != null) {
            cVar.f2043p = str3;
        }
        return firebaseAuth.f3061e.zza(str, str2, cVar);
    }
}
