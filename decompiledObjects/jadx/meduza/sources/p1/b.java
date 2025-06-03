package p1;

import android.content.Context;
import android.content.Intent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p1.j;
import t1.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12750a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12751b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0226c f12752c;

    /* renamed from: d, reason: collision with root package name */
    public final j.c f12753d;

    /* renamed from: e, reason: collision with root package name */
    public final List<j.b> f12754e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12755g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f12756h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f12757i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f12758j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12759k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12760l;

    /* renamed from: m, reason: collision with root package name */
    public final Set<Integer> f12761m;

    /* renamed from: n, reason: collision with root package name */
    public final Callable<InputStream> f12762n;

    /* renamed from: o, reason: collision with root package name */
    public final List<Object> f12763o;

    /* renamed from: p, reason: collision with root package name */
    public final List<q1.a> f12764p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12765q;

    public b(Context context, String str, c.InterfaceC0226c interfaceC0226c, j.c cVar, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        ec.i.e(context, "context");
        ec.i.e(cVar, "migrationContainer");
        a0.j.p(i10, "journalMode");
        ec.i.e(arrayList2, "typeConverters");
        ec.i.e(arrayList3, "autoMigrationSpecs");
        this.f12750a = context;
        this.f12751b = str;
        this.f12752c = interfaceC0226c;
        this.f12753d = cVar;
        this.f12754e = arrayList;
        this.f = z10;
        this.f12755g = i10;
        this.f12756h = executor;
        this.f12757i = executor2;
        this.f12758j = null;
        this.f12759k = z11;
        this.f12760l = z12;
        this.f12761m = linkedHashSet;
        this.f12762n = null;
        this.f12763o = arrayList2;
        this.f12764p = arrayList3;
        this.f12765q = false;
    }

    public final boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f12760l) {
            return false;
        }
        return this.f12759k && ((set = this.f12761m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
