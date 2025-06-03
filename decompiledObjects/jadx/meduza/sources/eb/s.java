package eb;

import eb.j;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final n7.f f5199c = new n7.f(String.valueOf(','));

    /* renamed from: d, reason: collision with root package name */
    public static final s f5200d = new s(j.b.f5135a, false, new s(new j.a(), true, new s()));

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f5201a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5202b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r f5203a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5204b;

        public a(r rVar, boolean z10) {
            x6.b.y(rVar, "decompressor");
            this.f5203a = rVar;
            this.f5204b = z10;
        }
    }

    public s() {
        this.f5201a = new LinkedHashMap(0);
        this.f5202b = new byte[0];
    }

    public s(j jVar, boolean z10, s sVar) {
        String a10 = jVar.a();
        x6.b.s("Comma is currently not allowed in message encoding", !a10.contains(","));
        int size = sVar.f5201a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(sVar.f5201a.containsKey(jVar.a()) ? size : size + 1);
        for (a aVar : sVar.f5201a.values()) {
            String a11 = aVar.f5203a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new a(aVar.f5203a, aVar.f5204b));
            }
        }
        linkedHashMap.put(a10, new a(jVar, z10));
        Map<String, a> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f5201a = unmodifiableMap;
        n7.f fVar = f5199c;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry<String, a> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().f5204b) {
                hashSet.add(entry.getKey());
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        fVar.getClass();
        Iterator it = unmodifiableSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        fVar.a(sb2, it);
        this.f5202b = sb2.toString().getBytes(Charset.forName("US-ASCII"));
    }
}
