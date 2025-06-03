/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

public final class k
extends Enum {
    public static final /* enum */ k p;
    public static final /* enum */ k q;
    public static final /* enum */ k r;
    public static final /* enum */ k s;
    public static final /* enum */ k t;
    public static final /* enum */ k u;
    public static final /* enum */ k v;
    public static final /* enum */ k w;
    public static final /* synthetic */ k[] x;
    public final char o;

    static {
        k k8;
        k k9;
        k k10;
        k k11;
        k k12;
        k k13;
        k k14;
        k k15;
        p = k13 = new k('0');
        q = k11 = new k('1');
        r = k10 = new k('2');
        s = k9 = new k('3');
        t = k12 = new k('4');
        u = k15 = new k('5');
        v = k8 = new k('6');
        w = k14 = new k('9');
        x = new k[]{k13, k11, k10, k9, k12, k15, k8, k14};
    }

    public k(char c8) {
        this.o = c8;
    }

    public static k e(char c8) {
        for (k k8 : k.values()) {
            if (k8.o != c8) continue;
            return k8;
        }
        return p;
    }

    public static k[] values() {
        return (k[])x.clone();
    }
}

