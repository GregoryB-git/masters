// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s2;

import java.util.Iterator;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.Map;

public final class b extends Thread
{
    public final /* synthetic */ Map o;
    
    public b(final a a, final Map o) {
        this.o = o;
    }
    
    @Override
    public final void run() {
        final Map o = this.o;
        final Uri$Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (final String s : o.keySet()) {
            buildUpon.appendQueryParameter(s, (String)o.get(s));
        }
        d.a(buildUpon.build().toString());
    }
}
