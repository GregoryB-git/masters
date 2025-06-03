// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl
{
    public AudioAttributes a;
    public int b;
    
    public AudioAttributesImplApi21() {
        this.b = -1;
    }
    
    public AudioAttributesImplApi21(final AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }
    
    public AudioAttributesImplApi21(final AudioAttributes a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int a() {
        final int b = this.b;
        if (b != -1) {
            return b;
        }
        return AudioAttributesCompat.c(false, this.c(), this.d());
    }
    
    @Override
    public Object b() {
        return this.a;
    }
    
    public int c() {
        return this.a.getFlags();
    }
    
    public int d() {
        return this.a.getUsage();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof AudioAttributesImplApi21 && this.a.equals((Object)((AudioAttributesImplApi21)o).a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.a);
        return sb.toString();
    }
    
    public static class a implements AudioAttributesImpl.a
    {
        public final AudioAttributes$Builder a;
        
        public a() {
            this.a = new AudioAttributes$Builder();
        }
        
        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.a.build());
        }
        
        public a e(final int contentType) {
            this.a.setContentType(contentType);
            return this;
        }
        
        public a f(final int flags) {
            this.a.setFlags(flags);
            return this;
        }
        
        public a g(final int n) {
            int usage = n;
            if (n == 16) {
                usage = 12;
            }
            this.a.setUsage(usage);
            return this;
        }
    }
}
