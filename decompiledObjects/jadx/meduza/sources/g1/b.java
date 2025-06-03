package g1;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class b {
    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        int abandonAudioFocusRequest;
        abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(audioFocusRequest);
        return abandonAudioFocusRequest;
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        int requestAudioFocus;
        requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
        return requestAudioFocus;
    }
}
