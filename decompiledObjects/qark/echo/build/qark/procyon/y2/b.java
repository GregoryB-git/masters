// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y2;

import com.google.android.gms.common.api.Status;

public class b extends Exception
{
    public final Status o;
    
    public b(final Status o) {
        final int d = o.d();
        String f;
        if (o.f() != null) {
            f = o.f();
        }
        else {
            f = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(": ");
        sb.append(f);
        super(sb.toString());
        this.o = o;
    }
    
    public Status a() {
        return this.o;
    }
}
