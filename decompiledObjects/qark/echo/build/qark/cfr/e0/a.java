/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.List
 */
package e0;

import X2.v;
import e0.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public final v a;
    public final List b;
    public ByteBuffer[] c;
    public b.a d;
    public b.a e;
    public boolean f;

    public a(v object) {
        this.a = object;
        this.b = new ArrayList();
        this.c = new ByteBuffer[0];
        this.d = object = b.a.e;
        this.e = object;
        this.f = false;
    }

    public b.a a(b.a a8) {
        if (!a8.equals(b.a.e)) {
            for (int i8 = 0; i8 < this.a.size(); ++i8) {
                b b8 = (b)this.a.get(i8);
                b.a a9 = b8.g(a8);
                if (!b8.a()) continue;
                g0.a.f(a9.equals(b.a.e) ^ true);
                a8 = a9;
            }
            this.e = a8;
            return a8;
        }
        throw new b.b(a8);
    }

    public void b() {
        int n8;
        this.b.clear();
        this.d = this.e;
        int n9 = 0;
        this.f = false;
        for (n8 = 0; n8 < this.a.size(); ++n8) {
            b b8 = (b)this.a.get(n8);
            b8.flush();
            if (!b8.a()) continue;
            this.b.add((Object)b8);
        }
        this.c = new ByteBuffer[this.b.size()];
        for (n8 = n9; n8 <= this.c(); ++n8) {
            this.c[n8] = ((b)this.b.get(n8)).d();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public ByteBuffer d() {
        if (!this.f()) {
            return b.a;
        }
        ByteBuffer byteBuffer = this.c[this.c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        this.g(b.a);
        return this.c[this.c()];
    }

    public boolean e() {
        if (this.f && ((b)this.b.get(this.c())).c() && !this.c[this.c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (this.a.size() != object.a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            if (this.a.get(i8) == object.a.get(i8)) continue;
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.b.isEmpty() ^ true;
    }

    public final void g(ByteBuffer byteBuffer) {
        int n8;
        do {
            int n9;
            n8 = n9 = 0;
            while (n9 <= this.c()) {
                int n10;
                if (this.c[n9].hasRemaining()) {
                    n10 = n8;
                } else {
                    b b8 = (b)this.b.get(n9);
                    if (b8.c()) {
                        n10 = n8;
                        if (!this.c[n9].hasRemaining()) {
                            n10 = n8;
                            if (n9 < this.c()) {
                                ((b)this.b.get(n9 + 1)).e();
                                n10 = n8;
                            }
                        }
                    } else {
                        ByteBuffer byteBuffer2 = n9 > 0 ? this.c[n9 - 1] : (byteBuffer.hasRemaining() ? byteBuffer : b.a);
                        long l8 = byteBuffer2.remaining();
                        b8.f(byteBuffer2);
                        this.c[n9] = b8.d();
                        n10 = l8 - (long)byteBuffer2.remaining() <= 0L && !this.c[n9].hasRemaining() ? 0 : 1;
                        n10 = n8 | n10;
                    }
                }
                ++n9;
                n8 = n10;
            }
        } while (n8 != 0);
    }

    public void h() {
        if (this.f()) {
            if (this.f) {
                return;
            }
            this.f = true;
            ((b)this.b.get(0)).e();
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (this.f()) {
            if (this.f) {
                return;
            }
            this.g(byteBuffer);
        }
    }

    public void j() {
        Object object;
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            object = (b)this.a.get(i8);
            object.flush();
            object.b();
        }
        this.c = new ByteBuffer[0];
        this.d = object = b.a.e;
        this.e = object;
        this.f = false;
    }
}

