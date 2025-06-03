package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public final class bp implements m7.i {

    /* renamed from: a, reason: collision with root package name */
    private final m7.k f3001a;

    /* renamed from: b, reason: collision with root package name */
    private final m7.k f3002b;

    /* renamed from: c, reason: collision with root package name */
    private final m7.k f3003c;

    /* renamed from: d, reason: collision with root package name */
    private final m7.k f3004d;

    public bp(m7.k kVar, m7.k kVar2, m7.k kVar3, m7.k kVar4) {
        this.f3001a = kVar;
        this.f3002b = kVar2;
        this.f3003c = kVar3;
        this.f3004d = kVar4;
    }

    @Override // m7.k
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f3001a.a(), (m7.v) this.f3002b.a(), ((au) this.f3003c).a(), new j());
    }
}
