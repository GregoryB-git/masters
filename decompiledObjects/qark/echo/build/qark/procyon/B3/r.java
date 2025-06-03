// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

public final class r
{
    public final F a;
    public final int b;
    public final int c;
    
    public r(final F f, final int b, final int c) {
        this.a = (F)E.c(f, "Null dependency anInterface.");
        this.b = b;
        this.c = c;
    }
    
    public r(final Class clazz, final int n, final int n2) {
        this(F.b(clazz), n, n2);
    }
    
    public static r a(final Class clazz) {
        return new r(clazz, 0, 2);
    }
    
    public static String b(final int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported injection: ");
        sb.append(i);
        throw new AssertionError((Object)sb.toString());
    }
    
    public static r h(final Class clazz) {
        return new r(clazz, 0, 0);
    }
    
    public static r i(final Class clazz) {
        return new r(clazz, 0, 1);
    }
    
    public static r j(final F f) {
        return new r(f, 1, 0);
    }
    
    public static r k(final Class clazz) {
        return new r(clazz, 1, 0);
    }
    
    public static r l(final F f) {
        return new r(f, 1, 1);
    }
    
    public static r m(final Class clazz) {
        return new r(clazz, 1, 1);
    }
    
    public static r n(final Class clazz) {
        return new r(clazz, 2, 0);
    }
    
    public F c() {
        return this.a;
    }
    
    public boolean d() {
        return this.c == 2;
    }
    
    public boolean e() {
        return this.c == 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof r;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final r r = (r)o;
            b3 = b2;
            if (this.a.equals(r.a)) {
                b3 = b2;
                if (this.b == r.b) {
                    b3 = b2;
                    if (this.c == r.c) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public boolean f() {
        return this.b == 1;
    }
    
    public boolean g() {
        return this.b == 2;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        final int b = this.b;
        String str;
        if (b == 1) {
            str = "required";
        }
        else if (b == 0) {
            str = "optional";
        }
        else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }
}
