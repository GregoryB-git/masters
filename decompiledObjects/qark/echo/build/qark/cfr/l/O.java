/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package l;

public class O {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

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

    public void e(int n8, int n9) {
        this.h = false;
        if (n8 != Integer.MIN_VALUE) {
            this.e = n8;
            this.a = n8;
        }
        if (n9 != Integer.MIN_VALUE) {
            this.f = n9;
            this.b = n9;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(boolean bl) {
        int n8;
        block6 : {
            block5 : {
                block3 : {
                    block4 : {
                        if (bl == this.g) {
                            return;
                        }
                        this.g = bl;
                        if (!this.h) break block3;
                        if (!bl) break block4;
                        n8 = this.d;
                        if (n8 == Integer.MIN_VALUE) {
                            n8 = this.e;
                        }
                        this.a = n8;
                        n8 = this.c;
                        if (n8 == Integer.MIN_VALUE) break block5;
                        break block6;
                    }
                    n8 = this.c;
                    if (n8 == Integer.MIN_VALUE) {
                        n8 = this.e;
                    }
                    this.a = n8;
                    n8 = this.d;
                    if (n8 == Integer.MIN_VALUE) break block5;
                    break block6;
                }
                this.a = this.e;
            }
            n8 = this.f;
        }
        this.b = n8;
    }

    public void g(int n8, int n9) {
        this.c = n8;
        this.d = n9;
        this.h = true;
        if (this.g) {
            if (n9 != Integer.MIN_VALUE) {
                this.a = n9;
            }
            if (n8 != Integer.MIN_VALUE) {
                this.b = n8;
                return;
            }
        } else {
            if (n8 != Integer.MIN_VALUE) {
                this.a = n8;
            }
            if (n9 != Integer.MIN_VALUE) {
                this.b = n9;
            }
        }
    }
}

