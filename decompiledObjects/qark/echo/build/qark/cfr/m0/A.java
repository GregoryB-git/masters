/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioTimestamp
 *  android.media.AudioTrack
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.System
 */
package m0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class A {
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public A(AudioTrack audioTrack) {
        this.a = new a(audioTrack);
        this.h();
    }

    public void a() {
        if (this.b == 4) {
            this.h();
        }
    }

    public void b() {
        a a8 = this.a;
        if (a8 != null) {
            a8.a();
        }
    }

    public long c() {
        a a8 = this.a;
        if (a8 != null) {
            return a8.b();
        }
        return -1L;
    }

    public long d() {
        a a8 = this.a;
        if (a8 != null) {
            return a8.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean f(long var1_1) {
        block8 : {
            block9 : {
                var7_2 = this.a;
                var4_4 = var5_3 = false;
                if (var7_2 == null) return var4_4;
                if (var1_1 - this.e < this.d) {
                    return false;
                }
                this.e = var1_1;
                var6_5 = var7_2.d();
                var3_6 = this.b;
                if (var3_6 == 0) break block8;
                if (var3_6 == 1) break block9;
                if (var3_6 != 2) {
                    if (var3_6 != 3) {
                        if (var3_6 != 4) throw new IllegalStateException();
                        return var6_5;
                    }
                    if (var6_5 == false) return var6_5;
                } else if (var6_5 != false) return var6_5;
                ** GOTO lbl-1000
            }
            if (var6_5) {
                if (this.a.b() <= this.f) return var6_5;
                this.i(2);
                return var6_5;
            } else lbl-1000: // 3 sources:
            {
                this.h();
            }
            return var6_5;
        }
        if (var6_5) {
            var4_4 = var5_3;
            if (this.a.c() < this.c) return var4_4;
            this.f = this.a.b();
            this.i(1);
            return var6_5;
        } else {
            if (var1_1 - this.c <= 500000L) return var6_5;
            this.i(3);
        }
        return var6_5;
    }

    public void g() {
        this.i(4);
    }

    public void h() {
        if (this.a != null) {
            this.i(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(int n8) {
        this.b = n8;
        long l8 = 10000L;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2 && n8 != 3) {
                    if (n8 != 4) {
                        throw new IllegalStateException();
                    }
                    l8 = 500000L;
                } else {
                    l8 = 10000000L;
                }
            }
        } else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000L;
        }
        this.d = l8;
    }

    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b;
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
            this.b = new AudioTimestamp();
        }

        public void a() {
            this.f = true;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.b.nanoTime / 1000L;
        }

        public boolean d() {
            boolean bl = this.a.getTimestamp(this.b);
            if (bl) {
                long l8 = this.d;
                long l9 = this.b.framePosition;
                if (l8 > l9) {
                    if (this.f) {
                        this.g += l8;
                        this.f = false;
                    } else {
                        ++this.c;
                    }
                }
                this.d = l9;
                this.e = l9 + this.g + (this.c << 32);
            }
            return bl;
        }
    }

}

