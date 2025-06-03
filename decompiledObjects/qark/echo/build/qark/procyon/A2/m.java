// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public abstract class m
{
    public static boolean a(final Object o, final Object obj) {
        boolean b = true;
        if (o != obj) {
            if (o != null) {
                return o.equals(obj);
            }
            b = false;
        }
        return b;
    }
    
    public static int b(final Object... a) {
        return Arrays.hashCode(a);
    }
    
    public static a c(final Object o) {
        return new a(o, null);
    }
    
    public static final class a
    {
        public final List a;
        public final Object b;
        
        public a a(final String str, final Object obj) {
            final List a = this.a;
            n.i(str);
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("=");
            sb.append(value);
            a.add(sb.toString());
            return this;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                sb.append((String)this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
