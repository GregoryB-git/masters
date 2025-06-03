/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.net.Uri
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

public final class j2
implements Predicate {
    public final int a;
    public final String b;

    public /* synthetic */ j2(String string2, int n) {
        this.a = n;
        this.b = string2;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 7: {
                return IntentSanitizer.Builder.k((String)this.b, (Uri)((Uri)object));
            }
            case 6: {
                return IntentSanitizer.Builder.m((String)this.b, (ComponentName)((ComponentName)object));
            }
            case 5: {
                return this.b.equals((Object)((String)object));
            }
            case 4: {
                return this.b.equals((Object)((String)object));
            }
            case 3: {
                return IntentSanitizer.Builder.n((String)this.b, (Uri)((Uri)object));
            }
            case 2: {
                return this.b.equals((Object)((String)object));
            }
            case 1: {
                return this.b.equals((Object)((String)object));
            }
            case 0: {
                return IntentSanitizer.Builder.g((String)this.b, (Uri)((Uri)object));
            }
        }
        return IntentSanitizer.Builder.c((String)this.b, (Uri)((Uri)object));
    }
}

