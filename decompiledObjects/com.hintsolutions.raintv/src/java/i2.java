/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ComponentName
 *  android.net.Uri
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

public final class i2
implements Predicate {
    public final int a;

    public /* synthetic */ i2(int n) {
        this.a = n;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 10: {
                return IntentSanitizer.Builder.d((ComponentName)((ComponentName)object));
            }
            case 9: {
                return IntentSanitizer.Builder.q((ClipData)((ClipData)object));
            }
            case 8: {
                return IntentSanitizer.Builder.b((Uri)((Uri)object));
            }
            case 7: {
                return IntentSanitizer.Builder.o((ComponentName)((ComponentName)object));
            }
            case 6: {
                return IntentSanitizer.Builder.h((String)((String)object));
            }
            case 5: {
                return IntentSanitizer.Builder.j((String)((String)object));
            }
            case 4: {
                return IntentSanitizer.Builder.a((String)((String)object));
            }
            case 3: {
                return IntentSanitizer.Builder.i((Uri)((Uri)object));
            }
            case 2: {
                return IntentSanitizer.Builder.e((String)((String)object));
            }
            case 1: {
                return IntentSanitizer.Builder.l((Object)object);
            }
            case 0: {
                return IntentSanitizer.Builder.f((Object)object);
            }
        }
        return Predicate.c((Object)object);
    }
}

