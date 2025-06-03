// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import java.io.File;
import java.io.InputStream;
import F.g;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import z.e;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public abstract class n
{
    public ConcurrentHashMap a;
    
    public n() {
        this.a = new ConcurrentHashMap();
    }
    
    public static Object e(final Object[] array, final int n, final b b) {
        int n2;
        if ((n & 0x1) == 0x0) {
            n2 = 400;
        }
        else {
            n2 = 700;
        }
        return f(array, n2, (n & 0x2) != 0x0, b);
    }
    
    public static Object f(final Object[] array, final int n, final boolean b, final b b2) {
        final int length = array.length;
        Object o = null;
        int n2 = Integer.MAX_VALUE;
        int n5;
        for (int i = 0; i < length; ++i, n2 = n5) {
            final Object o2 = array[i];
            final int abs = Math.abs(b2.a(o2) - n);
            int n3;
            if (b2.b(o2) == b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            final int n4 = abs * 2 + n3;
            if (o == null || (n5 = n2) > n4) {
                o = o2;
                n5 = n4;
            }
        }
        return o;
    }
    
    public abstract Typeface a(final Context p0, final e.c p1, final Resources p2, final int p3);
    
    public abstract Typeface b(final Context p0, final CancellationSignal p1, final g.b[] p2, final int p3);
    
    public Typeface c(Context e, final InputStream inputStream) {
        e = (Context)o.e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!o.d((File)e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(((File)e).getPath());
        }
        catch (RuntimeException ex) {
            goto Label_0051;
        }
        finally {
            ((File)e).delete();
        }
    }
    
    public Typeface d(Context e, final Resources resources, final int n, final String s, final int n2) {
        e = (Context)o.e(e);
        if (e == null) {
            return null;
        }
        try {
            if (!o.c((File)e, resources, n)) {
                return null;
            }
            return Typeface.createFromFile(((File)e).getPath());
        }
        catch (RuntimeException ex) {
            goto Label_0054;
        }
        finally {
            ((File)e).delete();
        }
    }
    
    public g.b g(final g.b[] array, final int n) {
        return (g.b)e(array, n, (b)new b() {
            public int c(final g.b b) {
                return b.e();
            }
            
            public boolean d(final g.b b) {
                return b.f();
            }
        });
    }
    
    public interface b
    {
        int a(final Object p0);
        
        boolean b(final Object p0);
    }
}
