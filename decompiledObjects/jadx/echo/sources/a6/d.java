package a6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final a f8140p = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Class f8141o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public d(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.b(componentType);
        this.f8141o = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f8141o.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return b.a((Enum[]) enumConstants);
    }
}
