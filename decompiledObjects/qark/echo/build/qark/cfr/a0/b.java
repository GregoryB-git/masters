/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioFocusRequest
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package a0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.media.AudioAttributesCompat;

public abstract class b {
    public static int a(AudioManager audioManager, androidx.media.a a8) {
        if (audioManager != null) {
            if (a8 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return a.a(audioManager, a8.c());
                }
                return audioManager.abandonAudioFocus(a8.e());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static int b(AudioManager audioManager, androidx.media.a a8) {
        if (audioManager != null) {
            if (a8 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return a.b(audioManager, a8.c());
                }
                return audioManager.requestAudioFocus(a8.e(), a8.b().a(), a8.d());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static abstract class a {
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

}

