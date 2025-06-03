package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class w {
    public m6.c b(Class cls) {
        return new e(cls);
    }

    public m6.d c(Class cls, String str) {
        return new m(cls, str);
    }

    public String f(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(l lVar) {
        return f(lVar);
    }

    public m6.e a(i iVar) {
        return iVar;
    }

    public m6.f d(n nVar) {
        return nVar;
    }

    public m6.g e(p pVar) {
        return pVar;
    }
}
