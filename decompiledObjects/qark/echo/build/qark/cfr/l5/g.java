/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package l5;

import com.ryanheise.audioservice.AudioService;

public final class g
implements Runnable {
    public final /* synthetic */ AudioService o;

    public /* synthetic */ g(AudioService audioService) {
        this.o = audioService;
    }

    public final void run() {
        AudioService.t(this.o);
    }
}

