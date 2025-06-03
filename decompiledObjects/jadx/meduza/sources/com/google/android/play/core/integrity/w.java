package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f3030a = this;

    /* renamed from: b, reason: collision with root package name */
    private final m7.k f3031b;

    /* renamed from: c, reason: collision with root package name */
    private final m7.k f3032c;

    /* renamed from: d, reason: collision with root package name */
    private final m7.k f3033d;

    /* renamed from: e, reason: collision with root package name */
    private final m7.k f3034e;
    private final m7.k f;

    /* renamed from: g, reason: collision with root package name */
    private final m7.k f3035g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        m7.j jVar = new m7.j(context);
        this.f3031b = jVar;
        bcVar = bb.f2970a;
        m7.k b10 = m7.h.b(bcVar);
        this.f3032c = b10;
        oVar = n.f3022a;
        au auVar = new au(jVar, oVar);
        this.f3033d = auVar;
        oVar2 = n.f3022a;
        m7.k b11 = m7.h.b(new bp(jVar, b10, auVar, oVar2));
        this.f3034e = b11;
        m7.k b12 = m7.h.b(new bu(b11));
        this.f = b12;
        this.f3035g = m7.h.b(new ba(b11, b12));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f3035g.a();
    }
}
