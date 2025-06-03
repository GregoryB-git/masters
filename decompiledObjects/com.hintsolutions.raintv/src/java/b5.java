/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  java.util.function.Supplier
 */
import java.util.function.Supplier;

public final class b5
extends ThreadLocal {
    public final Supplier a;

    public /* synthetic */ b5(a5 a52) {
        this.a = a52;
    }

    public final /* synthetic */ Object initialValue() {
        return this.a.get();
    }
}

