// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import java.net.URLConnection;
import java.net.URL;

public class n
{
    public final URL a;
    
    public n(final URL a) {
        this.a = a;
    }
    
    public URLConnection a() {
        return this.a.openConnection();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
