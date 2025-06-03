/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.core.util.Consumer
 *  java.lang.Object
 *  java.util.function.Consumer
 */
import android.location.Location;
import java.util.function.Consumer;

public final class v2
implements Consumer {
    public final androidx.core.util.Consumer a;

    public /* synthetic */ v2(androidx.core.util.Consumer consumer) {
        this.a = consumer;
    }

    public final void accept(Object object) {
        this.a.accept((Object)((Location)object));
    }
}

