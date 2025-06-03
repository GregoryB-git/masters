package f2;

import f2.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c implements b.InterfaceC0079b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f5308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5310c;

    public c(Method method, Object obj, Object obj2) {
        this.f5308a = method;
        this.f5309b = obj;
        this.f5310c = obj2;
    }

    @Override // f2.b.InterfaceC0079b
    public final void dispose() {
        this.f5308a.invoke(this.f5309b, this.f5310c);
    }
}
