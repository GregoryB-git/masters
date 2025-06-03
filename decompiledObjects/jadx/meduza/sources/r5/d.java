package r5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import o7.l0;
import o7.t;
import r5.f;
import z4.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements f.h.a, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13638c;

    public /* synthetic */ d(Object obj, Object obj2, boolean z10) {
        this.f13637b = obj;
        this.f13638c = obj2;
        this.f13636a = z10;
    }

    @Override // r5.f.h.a
    public final l0 b(int i10, i0 i0Var, int[] iArr) {
        f fVar = (f) this.f13637b;
        f.c cVar = (f.c) this.f13638c;
        boolean z10 = this.f13636a;
        fVar.getClass();
        e eVar = new e(fVar);
        t.b bVar = t.f12050b;
        t.a aVar = new t.a();
        for (int i11 = 0; i11 < i0Var.f17684a; i11++) {
            aVar.c(new f.a(i10, i0Var, i11, cVar, iArr[i11], z10, eVar));
        }
        return aVar.e();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.f13637b;
        Intent intent = (Intent) this.f13638c;
        boolean z10 = this.f13636a;
        Object obj = aa.j.f310c;
        return (v6.e.a() && ((Integer) task.getResult()).intValue() == 402) ? aa.j.a(context, intent, z10).continueWith(new m.b(3), new e0.d(29)) : task;
    }
}
