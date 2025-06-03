/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.res.ResourcesCompat$FontCallback
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import androidx.core.content.res.ResourcesCompat;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.hintsolutions.raintv.utils.AddToFavoritesHelper;

public final class c4
implements Runnable {
    public final int a;
    public final int b;
    public final Object c;

    public /* synthetic */ c4(Object object, int n, int n2) {
        this.a = n2;
        this.c = object;
        this.b = n;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AudioRendererEventListener.EventDispatcher.c((AudioRendererEventListener.EventDispatcher)((AudioRendererEventListener.EventDispatcher)this.c), (int)this.b);
                return;
            }
            case 0: {
                ResourcesCompat.FontCallback.a((ResourcesCompat.FontCallback)((ResourcesCompat.FontCallback)this.c), (int)this.b);
                return;
            }
        }
        AddToFavoritesHelper.a((AddToFavoritesHelper)this.c, this.b);
    }
}

