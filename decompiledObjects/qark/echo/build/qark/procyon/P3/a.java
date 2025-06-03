// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P3;

public class a implements d
{
    public final int a;
    public final d[] b;
    public final b c;
    
    public a(final int a, final d... b) {
        this.a = a;
        this.b = b;
        this.c = new b(a);
    }
    
    @Override
    public StackTraceElement[] a(StackTraceElement[] a) {
        if (a.length <= this.a) {
            return a;
        }
        final d[] b = this.b;
        final int length = b.length;
        int i = 0;
        StackTraceElement[] a2 = a;
        while (i < length) {
            final d d = b[i];
            if (a2.length <= this.a) {
                break;
            }
            a2 = d.a(a);
            ++i;
        }
        a = a2;
        if (a2.length > this.a) {
            a = this.c.a(a2);
        }
        return a;
    }
}
