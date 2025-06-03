package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f3024a = this;

    /* renamed from: b, reason: collision with root package name */
    private final m7.k f3025b;

    /* renamed from: c, reason: collision with root package name */
    private final m7.k f3026c;

    /* renamed from: d, reason: collision with root package name */
    private final m7.k f3027d;

    /* renamed from: e, reason: collision with root package name */
    private final m7.k f3028e;
    private final m7.k f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        m7.j jVar = new m7.j(context);
        this.f3025b = jVar;
        adVar = ac.f2918a;
        m7.k b10 = m7.h.b(adVar);
        this.f3026c = b10;
        mVar = l.f3017a;
        au auVar = new au(jVar, mVar);
        this.f3027d = auVar;
        mVar2 = l.f3017a;
        m7.k b11 = m7.h.b(new al(jVar, b10, auVar, mVar2));
        this.f3028e = b11;
        this.f = m7.h.b(new ab(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
