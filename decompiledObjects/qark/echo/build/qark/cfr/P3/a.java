/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 */
package P3;

import P3.b;
import P3.d;

public class a
implements d {
    public final int a;
    public final d[] b;
    public final b c;

    public /* varargs */ a(int n8, d ... arrd) {
        this.a = n8;
        this.b = arrd;
        this.c = new b(n8);
    }

    @Override
    public StackTraceElement[] a(StackTraceElement[] arrstackTraceElement) {
        if (arrstackTraceElement.length <= this.a) {
            return arrstackTraceElement;
        }
        d[] arrd = this.b;
        int n8 = arrd.length;
        StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement;
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = arrd[i8];
            if (arrstackTraceElement2.length <= this.a) break;
            arrstackTraceElement2 = d8.a(arrstackTraceElement);
        }
        arrstackTraceElement = arrstackTraceElement2;
        if (arrstackTraceElement2.length > this.a) {
            arrstackTraceElement = this.c.a(arrstackTraceElement2);
        }
        return arrstackTraceElement;
    }
}

