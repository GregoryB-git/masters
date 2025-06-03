/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.IntentSanitizer
 *  androidx.core.util.Consumer
 *  java.lang.Object
 *  java.lang.String
 */
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

public final class h2
implements Consumer {
    public final int a;

    public /* synthetic */ h2(int n) {
        this.a = n;
    }

    public final void accept(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                IntentSanitizer.b((String)((String)object));
                return;
            }
        }
        IntentSanitizer.a((String)((String)object));
    }
}

