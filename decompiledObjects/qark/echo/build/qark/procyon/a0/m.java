// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import H.c;
import android.text.TextUtils;

public class m implements g
{
    public String a;
    public int b;
    public int c;
    
    public m(final String a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        if (this.b >= 0 && m.b >= 0) {
            return TextUtils.equals((CharSequence)this.a, (CharSequence)m.a) && this.b == m.b && this.c == m.c;
        }
        return TextUtils.equals((CharSequence)this.a, (CharSequence)m.a) && this.c == m.c;
    }
    
    @Override
    public int hashCode() {
        return H.c.b(this.a, this.c);
    }
}
