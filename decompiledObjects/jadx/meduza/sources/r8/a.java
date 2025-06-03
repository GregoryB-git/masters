package r8;

import nc.g0;
import org.json.JSONObject;
import r8.c;

/* loaded from: classes.dex */
public final class a implements g {
    public static c b(g0 g0Var) {
        c.b bVar = new c.b(8);
        c.a aVar = new c.a(true, false, false);
        g0Var.getClass();
        return new c(System.currentTimeMillis() + 3600000, bVar, aVar, 10.0d, 1.2d, 60);
    }

    @Override // r8.g
    public final c a(g0 g0Var, JSONObject jSONObject) {
        return b(g0Var);
    }
}
