// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

public final class A
{
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    
    public A(final AudioTrack audioTrack) {
        this.a = new a(audioTrack);
        this.h();
    }
    
    public void a() {
        if (this.b == 4) {
            this.h();
        }
    }
    
    public void b() {
        final a a = this.a;
        if (a != null) {
            a.a();
        }
    }
    
    public long c() {
        final a a = this.a;
        if (a != null) {
            return a.b();
        }
        return -1L;
    }
    
    public long d() {
        final a a = this.a;
        if (a != null) {
            return a.c();
        }
        return -9223372036854775807L;
    }
    
    public boolean e() {
        return this.b == 2;
    }
    
    public boolean f(final long e) {
        final a a = this.a;
        boolean b = false;
        if (a != null) {
            if (e - this.e < this.d) {
                return false;
            }
            this.e = e;
            final boolean d = a.d();
            final int b2 = this.b;
            Label_0195: {
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                if (b2 == 4) {
                                    break Label_0195;
                                }
                                throw new IllegalStateException();
                            }
                            else if (!d) {
                                break Label_0195;
                            }
                        }
                        else if (d) {
                            break Label_0195;
                        }
                    }
                    else if (d) {
                        if (this.a.b() > this.f) {
                            this.i(2);
                        }
                        break Label_0195;
                    }
                    this.h();
                }
                else if (d) {
                    b = b;
                    if (this.a.c() < this.c) {
                        return b;
                    }
                    this.f = this.a.b();
                    this.i(1);
                }
                else if (e - this.c > 500000L) {
                    this.i(3);
                }
            }
            b = d;
        }
        return b;
    }
    
    public void g() {
        this.i(4);
    }
    
    public void h() {
        if (this.a != null) {
            this.i(0);
        }
    }
    
    public final void i(final int b) {
        this.b = b;
        long d = 10000L;
        if (b != 0) {
            if (b != 1) {
                if (b != 2 && b != 3) {
                    if (b != 4) {
                        throw new IllegalStateException();
                    }
                    d = 500000L;
                }
                else {
                    d = 10000000L;
                }
            }
        }
        else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000L;
        }
        this.d = d;
    }
    
    public static final class a
    {
        public final AudioTrack a;
        public final AudioTimestamp b;
        public long c;
        public long d;
        public long e;
        public boolean f;
        public long g;
        
        public a(final AudioTrack a) {
            this.a = a;
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
            final boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                final long framePosition = this.b.framePosition;
                final long d = this.d;
                if (d > framePosition) {
                    if (this.f) {
                        this.g += d;
                        this.f = false;
                    }
                    else {
                        ++this.c;
                    }
                }
                this.d = framePosition;
                this.e = framePosition + this.g + (this.c << 32);
            }
            return timestamp;
        }
    }
}
