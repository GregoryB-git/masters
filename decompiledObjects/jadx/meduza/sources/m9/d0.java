package m9;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10768a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10769b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10770c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10771d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10772e;

    public /* synthetic */ d0(Object obj, Map map, Map map2, Map map3, Set set) {
        this.f10768a = obj;
        this.f10769b = map;
        this.f10770c = map2;
        this.f10771d = map3;
        this.f10772e = set;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RemoteEvent{snapshotVersion=");
        l10.append((j9.q) this.f10768a);
        l10.append(", targetChanges=");
        l10.append((Map) this.f10769b);
        l10.append(", targetMismatches=");
        l10.append((Map) this.f10770c);
        l10.append(", documentUpdates=");
        l10.append((Map) this.f10771d);
        l10.append(", resolvedLimboDocuments=");
        l10.append((Set) this.f10772e);
        l10.append('}');
        return l10.toString();
    }
}
