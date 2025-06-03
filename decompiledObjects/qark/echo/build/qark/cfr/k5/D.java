/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  java.lang.Object
 */
package k5;

import android.media.AudioManager;
import k5.E;

public final class D
implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ E.a o;

    public /* synthetic */ D(E.a a8) {
        this.o = a8;
    }

    public final void onAudioFocusChange(int n8) {
        E.a.a(this.o, n8);
    }
}

