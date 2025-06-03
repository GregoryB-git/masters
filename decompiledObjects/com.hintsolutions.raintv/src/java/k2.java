/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.UriMatcher
 *  android.net.Uri
 *  androidx.core.content.UriMatcherCompat
 *  androidx.core.util.Predicate
 *  java.lang.Object
 */
import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;

public final class k2
implements Predicate {
    public final int a;
    public final Object b;

    public /* synthetic */ k2(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ((ComponentName)this.b).equals((Object)((ComponentName)object));
            }
        }
        return UriMatcherCompat.a((UriMatcher)((UriMatcher)this.b), (Uri)((Uri)object));
    }
}

