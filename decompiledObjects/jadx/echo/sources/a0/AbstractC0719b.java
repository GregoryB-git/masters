package a0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0719b {

    /* renamed from: a0.b$a */
    public static class a {
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static int a(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? a.a(audioManager, aVar.c()) : audioManager.abandonAudioFocus(aVar.e());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    public static int b(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? a.b(audioManager, aVar.c()) : audioManager.requestAudioFocus(aVar.e(), aVar.b().a(), aVar.d());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
