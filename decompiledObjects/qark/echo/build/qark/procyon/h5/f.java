// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h5;

import g5.c;
import g5.a;
import g5.b;

public final class f
{
    public b a;
    public a b;
    public c c;
    public int d;
    public h5.b e;
    
    public f() {
        this.d = -1;
    }
    
    public static boolean b(final int n) {
        return n >= 0 && n < 8;
    }
    
    public h5.b a() {
        return this.e;
    }
    
    public void c(final a b) {
        this.b = b;
    }
    
    public void d(final int d) {
        this.d = d;
    }
    
    public void e(final h5.b e) {
        this.e = e;
    }
    
    public void f(final b a) {
        this.a = a;
    }
    
    public void g(final c c) {
        this.c = c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        }
        else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
