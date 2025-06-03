package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m9.z;

/* loaded from: classes.dex */
public final class h implements u7.g, FirebaseFirestore.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3184a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final u7.f f3185b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3186c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.a<c8.b> f3187d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.a<a8.a> f3188e;
    public final z f;

    public h(Context context, u7.f fVar, t9.a aVar, t9.a aVar2, m9.l lVar) {
        this.f3186c = context;
        this.f3185b = fVar;
        this.f3187d = aVar;
        this.f3188e = aVar2;
        this.f = lVar;
        fVar.a();
        fVar.f15092j.add(this);
    }

    @Override // u7.g
    public final synchronized void a() {
        Iterator it = new ArrayList(this.f3184a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).i();
            x6.b.Z("terminate() should have removed its entry from `instances` for key: %s", !this.f3184a.containsKey(entry.getKey()), entry.getKey());
        }
    }
}
