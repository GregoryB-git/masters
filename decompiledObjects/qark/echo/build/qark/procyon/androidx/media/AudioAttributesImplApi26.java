// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21
{
    public AudioAttributesImplApi26() {
    }
    
    public AudioAttributesImplApi26(final AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
    
    public static class a extends AudioAttributesImplApi21.a
    {
        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi26(super.a.build());
        }
        
        public a h(final int usage) {
            super.a.setUsage(usage);
            return this;
        }
    }
}
