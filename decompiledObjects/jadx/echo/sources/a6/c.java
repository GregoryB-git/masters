package a6;

import W5.AbstractC0673c;
import W5.C0681k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends AbstractC0673c implements InterfaceC0753a, Serializable {

    /* renamed from: p, reason: collision with root package name */
    public final Enum[] f8139p;

    public c(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f8139p = entries;
    }

    private final Object writeReplace() {
        return new d(this.f8139p);
    }

    @Override // W5.AbstractC0671a
    public int a() {
        return this.f8139p.length;
    }

    @Override // W5.AbstractC0671a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return false;
    }

    public boolean d(Enum element) {
        Object l7;
        Intrinsics.checkNotNullParameter(element, "element");
        l7 = C0681k.l(this.f8139p, element.ordinal());
        return ((Enum) l7) == element;
    }

    @Override // W5.AbstractC0673c, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Enum get(int i7) {
        AbstractC0673c.f6878o.a(i7, this.f8139p.length);
        return this.f8139p[i7];
    }

    public int g(Enum element) {
        Object l7;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        l7 = C0681k.l(this.f8139p, ordinal);
        if (((Enum) l7) == element) {
            return ordinal;
        }
        return -1;
    }

    public int i(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // W5.AbstractC0673c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    @Override // W5.AbstractC0673c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }
}
