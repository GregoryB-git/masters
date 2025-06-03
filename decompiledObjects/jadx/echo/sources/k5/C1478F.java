package k5;

import A5.a;
import E5.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: k5.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1478F implements A5.a, k.c {

    /* renamed from: c, reason: collision with root package name */
    public static Map f16209c;

    /* renamed from: d, reason: collision with root package name */
    public static List f16210d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public E5.k f16211a;

    /* renamed from: b, reason: collision with root package name */
    public C1477E f16212b;

    public final void a(String str, Object... objArr) {
        for (C1478F c1478f : f16210d) {
            c1478f.f16211a.c(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        E5.c b7 = bVar.b();
        E5.k kVar = new E5.k(b7, "com.ryanheise.audio_session");
        this.f16211a = kVar;
        kVar.e(this);
        this.f16212b = new C1477E(bVar.a(), b7);
        f16210d.add(this);
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f16211a.e(null);
        this.f16211a = null;
        this.f16212b.b();
        this.f16212b = null;
        f16210d.remove(this);
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, k.d dVar) {
        List list = (List) jVar.f1671b;
        String str = jVar.f1670a;
        str.hashCode();
        if (str.equals("setConfiguration")) {
            f16209c = (Map) list.get(0);
            dVar.a(null);
            a("onConfigurationChanged", f16209c);
        } else if (str.equals("getConfiguration")) {
            dVar.a(f16209c);
        } else {
            dVar.c();
        }
    }
}
