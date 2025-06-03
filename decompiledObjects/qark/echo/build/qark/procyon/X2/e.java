// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.k;
import java.util.Map;

public abstract class e implements Entry
{
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Entry;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final Entry entry = (Entry)o;
            b3 = b2;
            if (k.a(this.getKey(), entry.getKey())) {
                b3 = b2;
                if (k.a(this.getValue(), entry.getValue())) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public abstract Object getKey();
    
    @Override
    public abstract Object getValue();
    
    @Override
    public int hashCode() {
        final Object key = this.getKey();
        final Object value = this.getValue();
        int hashCode = 0;
        int hashCode2;
        if (key == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = key.hashCode();
        }
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append("=");
        sb.append(this.getValue());
        return sb.toString();
    }
}
