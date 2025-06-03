// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import A2.m;

public abstract class b
{
    public static boolean a(final int[] array, final int n) {
        if (array == null) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean b(final Object[] array, final Object o) {
        int length;
        if (array != null) {
            length = array.length;
        }
        else {
            length = 0;
        }
        int i = 0;
        while (i < length) {
            if (m.a(array[i], o)) {
                if (i >= 0) {
                    return true;
                }
                break;
            }
            else {
                ++i;
            }
        }
        return false;
    }
}
