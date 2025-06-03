package u6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A {

    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public A(int i7) {
        this.array = new AtomicReferenceArray<>(i7);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i7) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i7 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i7);
        }
        return null;
    }

    public final void c(int i7, Object obj) {
        int a7;
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i7 < length) {
            atomicReferenceArray.set(i7, obj);
            return;
        }
        a7 = l6.f.a(i7 + 1, length * 2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(a7);
        for (int i8 = 0; i8 < length; i8++) {
            atomicReferenceArray2.set(i8, atomicReferenceArray.get(i8));
        }
        atomicReferenceArray2.set(i7, obj);
        this.array = atomicReferenceArray2;
    }
}
