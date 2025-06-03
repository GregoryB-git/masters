// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n6;

import kotlin.jvm.internal.Intrinsics;
import java.util.Iterator;

public abstract class f extends e
{
    public static b a(final Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "<this>");
        return c.b(new b() {
            @Override
            public Iterator iterator() {
                return iterator;
            }
        });
    }
    
    public static b b(final b b) {
        Intrinsics.checkNotNullParameter(b, "<this>");
        if (b instanceof a) {
            return b;
        }
        return new a(b);
    }
}
