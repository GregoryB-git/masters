package u3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import r4.InterfaceC1922b;
import t3.C1991c;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2008a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19765a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f19766b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1922b f19767c;

    public C2008a(Context context, InterfaceC1922b interfaceC1922b) {
        this.f19766b = context;
        this.f19767c = interfaceC1922b;
    }

    public C1991c a(String str) {
        return new C1991c(this.f19766b, this.f19767c, str);
    }

    public synchronized C1991c b(String str) {
        try {
            if (!this.f19765a.containsKey(str)) {
                this.f19765a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1991c) this.f19765a.get(str);
    }
}
