// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import l6.d;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class A
{
    @NotNull
    private volatile AtomicReferenceArray<Object> array;
    
    public A(final int length) {
        this.array = new AtomicReferenceArray<Object>(length);
    }
    
    public final int a() {
        return this.array.length();
    }
    
    public final Object b(final int i) {
        final AtomicReferenceArray<Object> array = this.array;
        if (i < array.length()) {
            return array.get(i);
        }
        return null;
    }
    
    public final void c(final int n, final Object o) {
        final AtomicReferenceArray<Object> array = this.array;
        final int length = array.length();
        if (n < length) {
            array.set(n, o);
            return;
        }
        final AtomicReferenceArray array2 = new AtomicReferenceArray<Object>(d.a(n + 1, length * 2));
        for (int i = 0; i < length; ++i) {
            array2.set(i, array.get(i));
        }
        array2.set(n, o);
        this.array = (AtomicReferenceArray<Object>)array2;
    }
}
