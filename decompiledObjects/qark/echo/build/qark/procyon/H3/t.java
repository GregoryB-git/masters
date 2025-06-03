// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.io.File;
import java.io.IOException;
import E3.f;
import M3.g;

public class t
{
    public final String a;
    public final g b;
    
    public t(final String a, final g b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean a() {
        try {
            return this.b().createNewFile();
        }
        catch (IOException ex) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.a);
            f.e(sb.toString(), ex);
            return false;
        }
    }
    
    public final File b() {
        return this.b.e(this.a);
    }
    
    public boolean c() {
        return this.b().exists();
    }
    
    public boolean d() {
        return this.b().delete();
    }
}
