/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.System
 */
package P3;

import P3.d;

public class b
implements d {
    public final int a;

    public b(int n8) {
        this.a = n8;
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] arrstackTraceElement) {
        int n8 = arrstackTraceElement.length;
        int n9 = this.a;
        if (n8 <= n9) {
            return arrstackTraceElement;
        }
        n8 = n9 / 2;
        int n10 = n9 - n8;
        StackTraceElement[] arrstackTraceElement2 = new StackTraceElement[n9];
        System.arraycopy((Object)arrstackTraceElement, (int)0, (Object)arrstackTraceElement2, (int)0, (int)n10);
        System.arraycopy((Object)arrstackTraceElement, (int)(arrstackTraceElement.length - n8), (Object)arrstackTraceElement2, (int)n10, (int)n8);
        return arrstackTraceElement2;
    }
}

