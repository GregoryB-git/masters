// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

public class O
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    
    public O() {
        this.a = 0;
        this.b = 0;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
    }
    
    public int a() {
        if (this.g) {
            return this.a;
        }
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        if (this.g) {
            return this.b;
        }
        return this.a;
    }
    
    public void e(final int n, final int n2) {
        this.h = false;
        if (n != Integer.MIN_VALUE) {
            this.e = n;
            this.a = n;
        }
        if (n2 != Integer.MIN_VALUE) {
            this.f = n2;
            this.b = n2;
        }
    }
    
    public void f(final boolean g) {
        if (g == this.g) {
            return;
        }
        this.g = g;
        while (true) {
            Label_0112: {
                if (!this.h) {
                    this.a = this.e;
                    break Label_0112;
                }
                int b;
                if (g) {
                    int a = this.d;
                    if (a == Integer.MIN_VALUE) {
                        a = this.e;
                    }
                    this.a = a;
                    b = this.c;
                    if (b == Integer.MIN_VALUE) {
                        break Label_0112;
                    }
                }
                else {
                    int a2 = this.c;
                    if (a2 == Integer.MIN_VALUE) {
                        a2 = this.e;
                    }
                    this.a = a2;
                    b = this.d;
                    if (b == Integer.MIN_VALUE) {
                        break Label_0112;
                    }
                }
                this.b = b;
                return;
            }
            int b = this.f;
            continue;
        }
    }
    
    public void g(final int a, final int b) {
        this.c = a;
        this.d = b;
        this.h = true;
        if (this.g) {
            if (b != Integer.MIN_VALUE) {
                this.a = b;
            }
            if (a != Integer.MIN_VALUE) {
                this.b = a;
            }
        }
        else {
            if (a != Integer.MIN_VALUE) {
                this.a = a;
            }
            if (b != Integer.MIN_VALUE) {
                this.b = b;
            }
        }
    }
}
