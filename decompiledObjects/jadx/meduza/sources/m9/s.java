package m9;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class s extends eb.x<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb.e[] f10882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f10883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f10884c;

    public s(v vVar, eb.e[] eVarArr, Task task) {
        this.f10884c = vVar;
        this.f10882a = eVarArr;
        this.f10883b = task;
    }

    @Override // eb.x0, eb.e
    public final void b() {
        if (this.f10882a[0] == null) {
            this.f10883b.addOnSuccessListener(this.f10884c.f10893a.f11322a, new w3.v(20));
        } else {
            super.b();
        }
    }

    @Override // eb.x0
    public final eb.e<Object, Object> f() {
        x6.b.Z("ClientCall used before onOpen() callback", this.f10882a[0] != null, new Object[0]);
        return this.f10882a[0];
    }
}
