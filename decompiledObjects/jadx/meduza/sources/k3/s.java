package k3;

import android.util.Base64;
import k3.j;

/* loaded from: classes.dex */
public abstract class s {

    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(h3.e.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract h3.e d();

    public final j e(h3.e eVar) {
        j.a a10 = a();
        a10.b(b());
        a10.c(eVar);
        a10.f8900b = c();
        return a10.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
