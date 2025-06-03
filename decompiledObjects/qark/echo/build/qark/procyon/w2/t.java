// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.util.Log;
import android.os.Bundle;
import V2.k;

public abstract class t
{
    public final int a;
    public final k b;
    public final int c;
    public final Bundle d;
    
    public t(final int a, final int c, final Bundle d) {
        this.b = new k();
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public abstract void a(final Bundle p0);
    
    public abstract boolean b();
    
    public final void c(final u obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 14 + value2.length());
            sb.append("Failing ");
            sb.append(value);
            sb.append(" with ");
            sb.append(value2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.b(obj);
    }
    
    public final void d(final Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 16 + value2.length());
            sb.append("Finishing ");
            sb.append(value);
            sb.append(" with ");
            sb.append(value2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.c(obj);
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(c);
        sb.append(" id=");
        sb.append(a);
        sb.append(" oneWay=");
        sb.append(this.b());
        sb.append("}");
        return sb.toString();
    }
}
