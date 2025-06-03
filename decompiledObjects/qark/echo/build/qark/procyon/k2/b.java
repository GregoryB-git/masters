// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k2;

public abstract class b
{
    public static Object a(int n, Object apply, final a a, final c c) {
        int n2 = n;
        Object a2 = apply;
        if (n < 1) {
            return a.apply(apply);
        }
        do {
            apply = a.apply(a2);
            a2 = c.a(a2, apply);
            if (a2 == null) {
                break;
            }
            n = n2 - 1;
        } while ((n2 = n) >= 1);
        return apply;
    }
}
