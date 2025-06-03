// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.net.Uri;
import java.util.concurrent.Executor;
import android.graphics.Typeface;
import android.os.Handler;
import android.content.Context;

public abstract class g
{
    public static Typeface a(final Context context, final e e, final int n, final boolean b, final int n2, final Handler handler, final c c) {
        final F.a a = new F.a(c, handler);
        if (b) {
            return f.e(context, e, a, n, n2);
        }
        return f.d(context, e, n, null, a);
    }
    
    public static class a
    {
        public final int a;
        public final b[] b;
        
        public a(final int a, final b[] b) {
            this.a = a;
            this.b = b;
        }
        
        public static a a(final int n, final b[] array) {
            return new a(n, array);
        }
        
        public b[] b() {
            return this.b;
        }
        
        public int c() {
            return this.a;
        }
    }
    
    public static class b
    {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        
        public b(final Uri uri, final int b, final int c, final boolean d, final int e) {
            this.a = (Uri)H.e.b(uri);
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public static b a(final Uri uri, final int n, final int n2, final boolean b, final int n3) {
            return new b(uri, n, n2, b, n3);
        }
        
        public int b() {
            return this.e;
        }
        
        public int c() {
            return this.b;
        }
        
        public Uri d() {
            return this.a;
        }
        
        public int e() {
            return this.c;
        }
        
        public boolean f() {
            return this.d;
        }
    }
    
    public abstract static class c
    {
        public abstract void a(final int p0);
        
        public abstract void b(final Typeface p0);
    }
}
