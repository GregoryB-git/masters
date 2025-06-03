// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import x2.p;
import android.content.Context;
import android.content.res.Resources;

public class q
{
    public final Resources a;
    public final String b;
    
    public q(final Context context) {
        n.i(context);
        final Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(p.a);
    }
    
    public String a(final String s) {
        final int identifier = this.a.getIdentifier(s, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
