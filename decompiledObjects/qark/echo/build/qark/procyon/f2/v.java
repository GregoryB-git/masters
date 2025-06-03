// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import android.content.Context;
import n2.d;
import java.io.Closeable;

public abstract class v implements Closeable
{
    public abstract d a();
    
    public abstract u b();
    
    @Override
    public void close() {
        this.a().close();
    }
    
    public interface a
    {
        v a();
        
        a b(final Context p0);
    }
}
