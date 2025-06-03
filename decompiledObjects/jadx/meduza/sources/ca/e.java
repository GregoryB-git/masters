package ca;

import android.content.Context;
import d8.b;
import d8.k;
import o9.l;

/* loaded from: classes.dex */
public final class e {

    public interface a<T> {
        String e(Context context);
    }

    public static d8.b<?> a(String str, String str2) {
        ca.a aVar = new ca.a(str, str2);
        b.a b10 = d8.b.b(d.class);
        b10.f3592e = 1;
        b10.f = new d8.a(aVar);
        return b10.b();
    }

    public static d8.b<?> b(String str, a<Context> aVar) {
        b.a b10 = d8.b.b(d.class);
        b10.f3592e = 1;
        b10.a(k.d(Context.class));
        b10.f = new l(1, str, aVar);
        return b10.b();
    }
}
