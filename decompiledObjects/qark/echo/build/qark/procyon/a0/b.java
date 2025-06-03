// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.media.AudioFocusRequest;
import android.os.Build$VERSION;
import androidx.media.a;
import android.media.AudioManager;

public abstract class b
{
    public static int a(final AudioManager audioManager, final androidx.media.a a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (a == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return b.a.a(audioManager, a.c());
        }
        return audioManager.abandonAudioFocus(a.e());
    }
    
    public static int b(final AudioManager audioManager, final androidx.media.a a) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (a == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return b.a.b(audioManager, a.c());
        }
        return audioManager.requestAudioFocus(a.e(), a.b().a(), a.d());
    }
    
    public abstract static class a
    {
        public static int a(final AudioManager audioManager, final AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        
        public static int b(final AudioManager audioManager, final AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }
}
