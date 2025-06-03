package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882d {

    /* renamed from: a, reason: collision with root package name */
    public C0891e f10864a;

    /* renamed from: b, reason: collision with root package name */
    public C0891e f10865b;

    /* renamed from: c, reason: collision with root package name */
    public List f10866c;

    public C0882d() {
        this.f10864a = new C0891e("", 0L, null);
        this.f10865b = new C0891e("", 0L, null);
        this.f10866c = new ArrayList();
    }

    public final C0891e a() {
        return this.f10864a;
    }

    public final void b(C0891e c0891e) {
        this.f10864a = c0891e;
        this.f10865b = (C0891e) c0891e.clone();
        this.f10866c.clear();
    }

    public final void c(String str, long j7, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C0891e.c(str2, this.f10864a.b(str2), map.get(str2)));
        }
        this.f10866c.add(new C0891e(str, j7, hashMap));
    }

    public final /* synthetic */ Object clone() {
        C0882d c0882d = new C0882d((C0891e) this.f10864a.clone());
        Iterator it = this.f10866c.iterator();
        while (it.hasNext()) {
            c0882d.f10866c.add((C0891e) ((C0891e) it.next()).clone());
        }
        return c0882d;
    }

    public final C0891e d() {
        return this.f10865b;
    }

    public final void e(C0891e c0891e) {
        this.f10865b = c0891e;
    }

    public final List f() {
        return this.f10866c;
    }

    public C0882d(C0891e c0891e) {
        this.f10864a = c0891e;
        this.f10865b = (C0891e) c0891e.clone();
        this.f10866c = new ArrayList();
    }
}
