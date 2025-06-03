package b3;

import b.a0;
import defpackage.f;
import ec.i;
import java.util.Iterator;
import java.util.List;
import o2.j;
import sb.q;
import x2.n;
import x2.s;
import x2.x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1822a;

    static {
        String f = j.f("DiagnosticsWrkr");
        i.d(f, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f1822a = f;
    }

    public static final String a(n nVar, x xVar, x2.j jVar, List list) {
        StringBuilder l10 = f.l("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            x2.i c10 = jVar.c(a0.s(sVar));
            Integer valueOf = c10 != null ? Integer.valueOf(c10.f16815c) : null;
            l10.append('\n' + sVar.f16830a + "\t " + sVar.f16832c + "\t " + valueOf + "\t " + sVar.f16831b.name() + "\t " + q.p(nVar.b(sVar.f16830a), ",", null, null, null, 62) + "\t " + q.p(xVar.a(sVar.f16830a), ",", null, null, null, 62) + '\t');
        }
        String sb2 = l10.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
