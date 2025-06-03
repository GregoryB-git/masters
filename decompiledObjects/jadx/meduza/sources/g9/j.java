package g9;

import g9.i;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap<j9.i, i> f5978a = new TreeMap<>();

    public final void a(i iVar) {
        i iVar2;
        i.a aVar = i.a.REMOVED;
        i.a aVar2 = i.a.METADATA;
        j9.i key = iVar.f5972b.getKey();
        i iVar3 = this.f5978a.get(key);
        if (iVar3 == null) {
            this.f5978a.put(key, iVar);
            return;
        }
        i.a aVar3 = iVar3.f5971a;
        i.a aVar4 = iVar.f5971a;
        i.a aVar5 = i.a.ADDED;
        if (aVar4 != aVar5 && aVar3 == aVar2) {
            this.f5978a.put(key, iVar);
            return;
        }
        if (aVar4 != aVar2 || aVar3 == aVar) {
            i.a aVar6 = i.a.MODIFIED;
            if (aVar4 == aVar6 && aVar3 == aVar6) {
                iVar2 = new i(aVar6, iVar.f5972b);
            } else if (aVar4 == aVar6 && aVar3 == aVar5) {
                iVar2 = new i(aVar5, iVar.f5972b);
            } else {
                if (aVar4 == aVar && aVar3 == aVar5) {
                    this.f5978a.remove(key);
                    return;
                }
                if (aVar4 == aVar && aVar3 == aVar6) {
                    this.f5978a.put(key, new i(aVar, iVar3.f5972b));
                    return;
                } else {
                    if (aVar4 != aVar5 || aVar3 != aVar) {
                        x6.b.T("Unsupported combination of changes %s after %s", aVar4, aVar3);
                        throw null;
                    }
                    iVar2 = new i(aVar6, iVar.f5972b);
                }
            }
        } else {
            iVar2 = new i(aVar3, iVar.f5972b);
        }
        this.f5978a.put(key, iVar2);
    }
}
