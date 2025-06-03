// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl
{
    public int a;
    public int b;
    public int c;
    public int d;
    
    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }
    
    public AudioAttributesImplBase(final int b, final int c, final int a, final int d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public int a() {
        final int d = this.d;
        if (d != -1) {
            return d;
        }
        return AudioAttributesCompat.c(false, this.c, this.a);
    }
    
    @Override
    public Object b() {
        return null;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        final int c = this.c;
        final int a = this.a();
        int n;
        if (a == 6) {
            n = (c | 0x4);
        }
        else {
            n = c;
            if (a == 7) {
                n = (c | 0x1);
            }
        }
        return n & 0x111;
    }
    
    public int e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof AudioAttributesImplBase;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase)o;
        boolean b3 = b2;
        if (this.b == audioAttributesImplBase.c()) {
            b3 = b2;
            if (this.c == audioAttributesImplBase.d()) {
                b3 = b2;
                if (this.a == audioAttributesImplBase.e()) {
                    b3 = b2;
                    if (this.d == audioAttributesImplBase.d) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.a, this.d });
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
    
    public static class a implements AudioAttributesImpl.a
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public a() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
        }
        
        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }
        
        public a e(final int n) {
            int b = n;
            if (n != 0 && (b = n) != 1 && (b = n) != 2 && (b = n) != 3 && (b = n) != 4) {
                b = 0;
            }
            this.b = b;
            return this;
        }
        
        public a f(final int n) {
            this.c |= (n & 0x3FF);
            return this;
        }
        
        public a g(final int n) {
            int a = n;
            switch (n) {
                case 16: {
                    a = 12;
                }
                default: {
                    a = 0;
                }
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15: {
                    this.a = a;
                    return this;
                }
            }
        }
    }
}
