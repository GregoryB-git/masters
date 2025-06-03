package d4;

/* loaded from: classes.dex */
public abstract class r {
    public static n a() {
        return g.W();
    }

    public static boolean b(n nVar) {
        return nVar.t().isEmpty() && (nVar.isEmpty() || (nVar instanceof f) || (nVar instanceof t) || (nVar instanceof e));
    }

    public static n c(V3.k kVar, Object obj) {
        String str;
        n a7 = o.a(obj);
        if (a7 instanceof l) {
            a7 = new f(Double.valueOf(((Long) a7.getValue()).longValue()), a());
        }
        if (b(a7)) {
            return a7;
        }
        StringBuilder sb = new StringBuilder();
        if (kVar != null) {
            str = "Path '" + kVar + "'";
        } else {
            str = "Node";
        }
        sb.append(str);
        sb.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
        throw new Q3.d(sb.toString());
    }

    public static n d(Object obj) {
        return c(null, obj);
    }
}
