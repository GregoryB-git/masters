package M4;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3543a;

    public g() {
        this.f3543a = null;
    }

    public static g a() {
        return new g();
    }

    public static g b(Object obj) {
        return obj == null ? a() : e(obj);
    }

    public static g e(Object obj) {
        return new g(obj);
    }

    public Object c() {
        Object obj = this.f3543a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f3543a != null;
    }

    public g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f3543a = obj;
    }
}
