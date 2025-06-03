/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.function.Supplier
 *  kotlin.sequences.Sequence
 *  kotlin.streams.jdk8.StreamsKt
 */
import java.util.function.Supplier;
import kotlin.sequences.Sequence;
import kotlin.streams.jdk8.StreamsKt;

public final class n4
implements Supplier {
    public final Sequence a;

    public /* synthetic */ n4(Sequence sequence) {
        this.a = sequence;
    }

    public final Object get() {
        return StreamsKt.a((Sequence)this.a);
    }
}

