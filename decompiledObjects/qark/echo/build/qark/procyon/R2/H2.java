// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.res.Resources$NotFoundException;
import x2.p;
import android.text.TextUtils;
import A2.n;
import android.content.Context;
import android.content.res.Resources;

public final class H2
{
    public final Resources a;
    public final String b;
    
    public H2(final Context context, final String b) {
        n.i(context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty((CharSequence)b)) {
            this.b = b;
            return;
        }
        this.b = a(context);
    }
    
    public static String a(final Context context) {
        try {
            return context.getResources().getResourcePackageName(p.a);
        }
        catch (Resources$NotFoundException ex) {
            return context.getPackageName();
        }
    }
    
    public final String b(String string) {
        final int identifier = this.a.getIdentifier(string, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        try {
            string = this.a.getString(identifier);
            return string;
        }
        catch (Resources$NotFoundException ex) {
            return null;
        }
    }
}
