package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements h, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public g6.a f6799o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Object f6800p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6801q;

    public p(g6.a initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f6799o = initializer;
        this.f6800p = r.f6802a;
        this.f6801q = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    public boolean a() {
        return this.f6800p != r.f6802a;
    }

    @Override // V5.h
    public Object getValue() {
        Object obj;
        Object obj2 = this.f6800p;
        r rVar = r.f6802a;
        if (obj2 != rVar) {
            return obj2;
        }
        synchronized (this.f6801q) {
            obj = this.f6800p;
            if (obj == rVar) {
                g6.a aVar = this.f6799o;
                Intrinsics.b(aVar);
                obj = aVar.invoke();
                this.f6800p = obj;
                this.f6799o = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(g6.a aVar, Object obj, int i7, kotlin.jvm.internal.g gVar) {
        this(aVar, (i7 & 2) != 0 ? null : obj);
    }
}
