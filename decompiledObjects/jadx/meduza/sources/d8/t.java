package d8;

import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f3627a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f3628b;

    public @interface a {
    }

    public t(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f3627a = cls;
        this.f3628b = cls2;
    }

    public static <T> t<T> a(Class<T> cls) {
        return new t<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f3628b.equals(tVar.f3628b)) {
            return this.f3627a.equals(tVar.f3627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3627a.hashCode() + (this.f3628b.hashCode() * 31);
    }

    public final String toString() {
        if (this.f3627a == a.class) {
            return this.f3628b.getName();
        }
        StringBuilder l10 = defpackage.f.l("@");
        l10.append(this.f3627a.getName());
        l10.append(" ");
        l10.append(this.f3628b.getName());
        return l10.toString();
    }
}
