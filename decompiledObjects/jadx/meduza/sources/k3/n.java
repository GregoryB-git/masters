package k3;

import java.util.HashMap;
import java.util.Map;
import k3.h;

/* loaded from: classes.dex */
public abstract class n {

    public static abstract class a {
        public final void a(String str, String str2) {
            Map<String, String> map = ((h.a) this).f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract m d();

    public abstract long e();

    public abstract byte[] f();

    public abstract byte[] g();

    public final int h(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer i();

    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final h.a m() {
        h.a aVar = new h.a();
        aVar.d(k());
        aVar.f8883b = c();
        aVar.f8887g = i();
        aVar.f8888h = j();
        aVar.f8889i = f();
        aVar.f8890j = g();
        aVar.c(d());
        aVar.f8885d = Long.valueOf(e());
        aVar.f8886e = Long.valueOf(l());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
