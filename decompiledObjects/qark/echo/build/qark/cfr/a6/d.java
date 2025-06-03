/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 */
package a6;

import a6.b;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class d
implements Serializable {
    public static final a p = new a(null);
    private static final long serialVersionUID = 0L;
    public final Class o;

    public d(Enum[] class_) {
        Intrinsics.checkNotNullParameter((Object)class_, "entries");
        class_ = class_.getClass().getComponentType();
        Intrinsics.b((Object)class_);
        this.o = class_;
    }

    private final Object readResolve() {
        Object[] arrobject = this.o.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(arrobject, "getEnumConstants(...)");
        return b.a((Enum[])arrobject);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

