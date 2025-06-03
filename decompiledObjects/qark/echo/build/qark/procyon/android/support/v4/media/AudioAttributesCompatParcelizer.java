// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import v1.b;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final b b) {
        return androidx.media.AudioAttributesCompatParcelizer.read(b);
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final b b) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, b);
    }
}
