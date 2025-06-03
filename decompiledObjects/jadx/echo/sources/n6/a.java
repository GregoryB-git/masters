package n6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f18065a;

    public a(b sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f18065a = new AtomicReference(sequence);
    }

    @Override // n6.b
    public Iterator iterator() {
        b bVar = (b) this.f18065a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
