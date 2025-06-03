package O3;

import H3.InterfaceC0401x;
import O3.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements h {
    public static d b(InterfaceC0401x interfaceC0401x) {
        return new d(interfaceC0401x.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // O3.h
    public d a(InterfaceC0401x interfaceC0401x, JSONObject jSONObject) {
        return b(interfaceC0401x);
    }
}
