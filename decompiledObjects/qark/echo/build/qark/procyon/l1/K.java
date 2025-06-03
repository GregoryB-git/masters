// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import F0.t;
import g0.E;
import g0.z;

public interface K
{
    void a(final z p0, final int p1);
    
    void b();
    
    void c(final E p0, final t p1, final d p2);
    
    public static final class a
    {
        public final String a;
        public final int b;
        public final byte[] c;
        
        public a(final String a, final int b, final byte[] c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final String b;
        public final int c;
        public final List d;
        public final byte[] e;
        
        public b(final int a, final String b, final int c, final List list, final byte[] e) {
            this.a = a;
            this.b = b;
            this.c = c;
            List<Object> d;
            if (list == null) {
                d = Collections.emptyList();
            }
            else {
                d = Collections.unmodifiableList((List<?>)list);
            }
            this.d = d;
            this.e = e;
        }
        
        public int a() {
            final int c = this.c;
            if (c == 2) {
                return 2048;
            }
            if (c != 3) {
                return 0;
            }
            return 512;
        }
    }
    
    public interface c
    {
        SparseArray a();
        
        K b(final int p0, final b p1);
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;
        
        public d(final int n, final int n2) {
            this(Integer.MIN_VALUE, n, n2);
        }
        
        public d(final int i, final int b, final int c) {
            String string;
            if (i != Integer.MIN_VALUE) {
                final StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                string = sb.toString();
            }
            else {
                string = "";
            }
            this.a = string;
            this.b = b;
            this.c = c;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
        
        public void a() {
            final int d = this.d;
            int b;
            if (d == Integer.MIN_VALUE) {
                b = this.b;
            }
            else {
                b = d + this.c;
            }
            this.d = b;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(this.d);
            this.e = sb.toString();
        }
        
        public String b() {
            this.d();
            return this.e;
        }
        
        public int c() {
            this.d();
            return this.d;
        }
        
        public final void d() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
