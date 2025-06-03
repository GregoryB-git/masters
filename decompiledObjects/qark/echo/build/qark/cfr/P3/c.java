/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.System
 *  java.util.HashMap
 */
package P3;

import P3.d;
import java.util.HashMap;

public class c
implements d {
    public final int a;

    public c(int n8) {
        this.a = n8;
    }

    public static boolean b(StackTraceElement[] arrstackTraceElement, int n8, int n9) {
        int n10 = n9 - n8;
        if (n9 + n10 > arrstackTraceElement.length) {
            return false;
        }
        for (int i8 = 0; i8 < n10; ++i8) {
            if (arrstackTraceElement[n8 + i8].equals((Object)arrstackTraceElement[n9 + i8])) continue;
            return false;
        }
        return true;
    }

    public static StackTraceElement[] c(StackTraceElement[] arrstackTraceElement, int n8) {
        int n9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] arrstackTraceElement2 = new StackTraceElement[arrstackTraceElement.length];
        int n10 = n9 = 0;
        int n11 = 1;
        while (n9 < arrstackTraceElement.length) {
            int n12;
            StackTraceElement stackTraceElement = arrstackTraceElement[n9];
            Integer n13 = (Integer)hashMap.get((Object)stackTraceElement);
            if (n13 != null && c.b(arrstackTraceElement, n13, n9)) {
                int n14 = n9 - n13;
                int n15 = n10;
                n12 = n11;
                if (n11 < n8) {
                    System.arraycopy((Object)arrstackTraceElement, (int)n9, (Object)arrstackTraceElement2, (int)n10, (int)n14);
                    n15 = n10 + n14;
                    n12 = n11 + 1;
                }
                n14 = n14 - 1 + n9;
                n10 = n15;
                n11 = n12;
                n12 = n14;
            } else {
                arrstackTraceElement2[n10] = arrstackTraceElement[n9];
                ++n10;
                n11 = 1;
                n12 = n9;
            }
            hashMap.put((Object)stackTraceElement, (Object)n9);
            n9 = n12 + 1;
        }
        arrstackTraceElement = new StackTraceElement[n10];
        System.arraycopy((Object)arrstackTraceElement2, (int)0, (Object)arrstackTraceElement, (int)0, (int)n10);
        return arrstackTraceElement;
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] arrstackTraceElement) {
        StackTraceElement[] arrstackTraceElement2 = c.c(arrstackTraceElement, this.a);
        if (arrstackTraceElement2.length < arrstackTraceElement.length) {
            return arrstackTraceElement2;
        }
        return arrstackTraceElement;
    }
}

