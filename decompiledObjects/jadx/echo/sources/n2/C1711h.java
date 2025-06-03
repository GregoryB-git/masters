package n2;

import android.content.Context;
import h2.InterfaceC1333b;

/* renamed from: n2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711h implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17919a;

    public C1711h(U5.a aVar) {
        this.f17919a = aVar;
    }

    public static C1711h a(U5.a aVar) {
        return new C1711h(aVar);
    }

    public static String c(Context context) {
        return (String) h2.d.c(AbstractC1709f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f17919a.get());
    }
}
