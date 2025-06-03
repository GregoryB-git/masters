// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q;

import android.os.BaseBundle;
import android.os.Bundle;

public final class a
{
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    
    public a(final Integer a, final Integer b, final Integer c, final Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Bundle a() {
        final Bundle bundle = new Bundle();
        final Integer a = this.a;
        if (a != null) {
            ((BaseBundle)bundle).putInt("android.support.customtabs.extra.TOOLBAR_COLOR", (int)a);
        }
        final Integer b = this.b;
        if (b != null) {
            ((BaseBundle)bundle).putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", (int)b);
        }
        final Integer c = this.c;
        if (c != null) {
            ((BaseBundle)bundle).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", (int)c);
        }
        final Integer d = this.d;
        if (d != null) {
            ((BaseBundle)bundle).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", (int)d);
        }
        return bundle;
    }
    
    public static final class a
    {
        public Integer a;
        public Integer b;
        public Integer c;
        public Integer d;
        
        public q.a a() {
            return new q.a(this.a, this.b, this.c, this.d);
        }
    }
}
