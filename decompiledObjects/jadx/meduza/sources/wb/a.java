package wb;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import wb.f;

/* loaded from: classes.dex */
public abstract class a implements ub.e<Object>, d, Serializable {
    private final ub.e<Object> completion;

    public a(ub.e<Object> eVar) {
        this.completion = eVar;
    }

    public ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        ec.i.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public ub.e<rb.h> create(ub.e<?> eVar) {
        ec.i.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ub.e<Object> eVar = this.completion;
        if (eVar instanceof d) {
            return (d) eVar;
        }
        return null;
    }

    public final ub.e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i10 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i10 = -1;
        }
        int i11 = i10 >= 0 ? eVar.l()[i10] : -1;
        f.a aVar = f.f16482b;
        if (aVar == null) {
            try {
                f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f16482b = aVar2;
                aVar = aVar2;
            } catch (Exception unused2) {
                aVar = f.f16481a;
                f.f16482b = aVar;
            }
        }
        if (aVar != f.f16481a && (method = aVar.f16483a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.f16484b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = aVar.f16485c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ub.e
    public final void resumeWith(Object obj) {
        ub.e eVar = this;
        while (true) {
            a aVar = (a) eVar;
            ub.e eVar2 = aVar.completion;
            ec.i.b(eVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == vb.a.f16085a) {
                    return;
                }
            } catch (Throwable th) {
                obj = rb.f.a(th);
            }
            aVar.releaseIntercepted();
            if (!(eVar2 instanceof a)) {
                eVar2.resumeWith(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public String toString() {
        StringBuilder l10 = defpackage.f.l("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        l10.append(stackTraceElement);
        return l10.toString();
    }
}
