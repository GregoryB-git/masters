package m5;

import E5.j;
import E5.k;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements k.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17824a;

    /* renamed from: b, reason: collision with root package name */
    public final E5.c f17825b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f17826c = new HashMap();

    public g(Context context, E5.c cVar) {
        this.f17824a = context;
        this.f17825b = cVar;
    }

    public void a() {
        Iterator it = new ArrayList(this.f17826c.values()).iterator();
        while (it.hasNext()) {
            ((C1685d) it.next()).B0();
        }
        this.f17826c.clear();
    }

    @Override // E5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        HashMap hashMap;
        String str = jVar.f1670a;
        str.hashCode();
        switch (str) {
            case "init":
                String str2 = (String) jVar.a("id");
                if (!this.f17826c.containsKey(str2)) {
                    this.f17826c.put(str2, new C1685d(this.f17824a, this.f17825b, str2, (Map) jVar.a("audioLoadConfiguration"), (List) jVar.a("androidAudioEffects"), (Boolean) jVar.a("androidOffloadSchedulingEnabled")));
                    dVar.a(null);
                    return;
                } else {
                    dVar.b("Platform player " + str2 + " already exists", null, null);
                    return;
                }
            case "disposePlayer":
                String str3 = (String) jVar.a("id");
                C1685d c1685d = (C1685d) this.f17826c.get(str3);
                if (c1685d != null) {
                    c1685d.B0();
                    this.f17826c.remove(str3);
                }
                hashMap = new HashMap();
                break;
            case "disposeAllPlayers":
                a();
                hashMap = new HashMap();
                break;
            default:
                dVar.c();
                return;
        }
        dVar.a(hashMap);
    }
}
