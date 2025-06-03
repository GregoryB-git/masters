package o9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import ca.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.functions.FunctionsRegistrar;
import d8.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import k3.h;
import k3.s;
import o7.k0;
import o7.l0;
import o7.t;
import r3.t;
import r5.f;
import s3.b;
import t9.a;
import v5.l;
import z4.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements d8.e, b.a, t.a, l.a, f.h.a, a.InterfaceC0234a, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12125c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f12123a = i10;
        this.f12124b = obj;
        this.f12125c = obj2;
    }

    @Override // s3.b.a
    public Object a() {
        q3.k kVar = (q3.k) this.f12124b;
        kVar.f13257c.i((Iterable) this.f12125c);
        return null;
    }

    @Override // r3.t.a
    public Object apply(Object obj) {
        t tVar = (t) this.f12124b;
        s sVar = (s) this.f12125c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList c02 = tVar.c0(sQLiteDatabase, sVar, tVar.f13587d.c());
        for (h3.e eVar : h3.e.values()) {
            if (eVar != sVar.d()) {
                int c10 = tVar.f13587d.c() - c02.size();
                if (c10 <= 0) {
                    break;
                }
                c02.addAll(tVar.c0(sQLiteDatabase, sVar.e(eVar), c10));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < c02.size(); i10++) {
            sb2.append(((r3.i) c02.get(i10)).b());
            if (i10 < c02.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        t.k0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new io.flutter.plugins.firebase.auth.g(hashMap, 4));
        ListIterator listIterator = c02.listIterator();
        while (listIterator.hasNext()) {
            r3.i iVar = (r3.i) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(iVar.b()))) {
                h.a m10 = iVar.a().m();
                for (t.b bVar : (Set) hashMap.get(Long.valueOf(iVar.b()))) {
                    m10.a(bVar.f13589a, bVar.f13590b);
                }
                listIterator.set(new r3.b(iVar.b(), iVar.c(), m10.b()));
            }
        }
        return c02;
    }

    @Override // r5.f.h.a
    public l0 b(int i10, i0 i0Var, int[] iArr) {
        f.c cVar = (f.c) this.f12124b;
        String str = (String) this.f12125c;
        k0<Integer> k0Var = r5.f.f13640j;
        t.b bVar = o7.t.f12050b;
        t.a aVar = new t.a();
        for (int i11 = 0; i11 < i0Var.f17684a; i11++) {
            aVar.c(new f.g(i10, i0Var, i11, cVar, iArr[i11], str));
        }
        return aVar.e();
    }

    @Override // d8.e
    public Object g(u uVar) {
        i components$lambda$0;
        switch (this.f12123a) {
            case 0:
                components$lambda$0 = FunctionsRegistrar.getComponents$lambda$0((d8.t) this.f12124b, (d8.t) this.f12125c, uVar);
                return components$lambda$0;
            default:
                return new ca.a((String) this.f12124b, ((e.a) this.f12125c).e((Context) uVar.get(Context.class)));
        }
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
        a.InterfaceC0234a interfaceC0234a = (a.InterfaceC0234a) this.f12124b;
        a.InterfaceC0234a interfaceC0234a2 = (a.InterfaceC0234a) this.f12125c;
        interfaceC0234a.h(bVar);
        interfaceC0234a2.h(bVar);
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f12123a) {
            case 2:
                ((w3.b) obj).h0();
                break;
            case 3:
                w3.b bVar = (w3.b) obj;
                bVar.E();
                bVar.Z();
                break;
            default:
                w5.o oVar = (w5.o) this.f12125c;
                w3.b bVar2 = (w3.b) obj;
                bVar2.b(oVar);
                int i10 = oVar.f16429a;
                bVar2.z();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        e eVar = (e) this.f12124b;
        m mVar = (m) this.f12125c;
        TaskCompletionSource<Void> taskCompletionSource = e.f12090j;
        ec.i.e(eVar, "this$0");
        ec.i.e(mVar, "$options");
        return eVar.f12095d.a(mVar.f12129c);
    }
}
