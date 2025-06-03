// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;

public abstract class f
{
    public static final Object[] a;
    
    static {
        a = new Object[0];
    }
    
    public static final Object[] a(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        final int size = collection.size();
        if (size != 0) {
            final Iterator<Object> iterator = collection.iterator();
            if (iterator.hasNext()) {
                Object[] array = new Object[size];
                int n = 0;
                while (true) {
                    final int newLength = n + 1;
                    array[n] = iterator.next();
                    Object[] copy;
                    if (newLength >= array.length) {
                        if (!iterator.hasNext()) {
                            return array;
                        }
                        int newLength2;
                        if ((newLength2 = newLength * 3 + 1 >>> 1) <= newLength) {
                            newLength2 = 2147483645;
                            if (newLength >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy = Arrays.copyOf(array, newLength2);
                        Intrinsics.checkNotNullExpressionValue(copy, "copyOf(...)");
                    }
                    else {
                        copy = array;
                        if (!iterator.hasNext()) {
                            final Object[] copy2 = Arrays.copyOf(array, newLength);
                            Intrinsics.checkNotNullExpressionValue(copy2, "copyOf(...)");
                            return copy2;
                        }
                    }
                    n = newLength;
                    array = copy;
                }
            }
        }
        return f.a;
    }
    
    public static final Object[] b(final Collection collection, final Object[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        array.getClass();
        final int size = collection.size();
        int n = 0;
        Object[] copy;
        if (size == 0) {
            copy = array;
            if (array.length > 0) {
                array[0] = null;
                return array;
            }
        }
        else {
            final Iterator<Object> iterator = collection.iterator();
            if (!iterator.hasNext()) {
                copy = array;
                if (array.length > 0) {
                    array[0] = null;
                    return array;
                }
            }
            else {
                Object[] array2;
                if (size <= array.length) {
                    array2 = array;
                }
                else {
                    final Object instance = Array.newInstance(array.getClass().getComponentType(), size);
                    Intrinsics.c(instance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    array2 = (Object[])instance;
                }
                while (true) {
                    final int newLength = n + 1;
                    array2[n] = iterator.next();
                    Object[] copy2;
                    if (newLength >= array2.length) {
                        if (!iterator.hasNext()) {
                            return array2;
                        }
                        int newLength2;
                        if ((newLength2 = newLength * 3 + 1 >>> 1) <= newLength) {
                            newLength2 = 2147483645;
                            if (newLength >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy2 = Arrays.copyOf(array2, newLength2);
                        Intrinsics.checkNotNullExpressionValue(copy2, "copyOf(...)");
                    }
                    else {
                        copy2 = array2;
                        if (!iterator.hasNext()) {
                            if (array2 == array) {
                                array[newLength] = null;
                                return array;
                            }
                            copy = Arrays.copyOf(array2, newLength);
                            Intrinsics.checkNotNullExpressionValue(copy, "copyOf(...)");
                            break;
                        }
                    }
                    n = newLength;
                    array2 = copy2;
                }
            }
        }
        return copy;
    }
}
