// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c6;

import kotlin.jvm.internal.Intrinsics;

public abstract class a extends a
{
    private final boolean c(final int n) {
        final Integer b = a.b;
        return b == null || b >= n;
    }
    
    @Override
    public void a(final Throwable t, final Throwable exception) {
        Intrinsics.checkNotNullParameter(t, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.c(19)) {
            t.addSuppressed(exception);
            return;
        }
        super.a(t, exception);
    }
    
    public static final class a
    {
        public static final a a;
        public static final Integer b;
        
        static {
            a = new a();
            final Integer n = null;
            while (true) {
                try {
                    final Object value = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                    Integer n2;
                    if (value instanceof Integer) {
                        n2 = (Integer)value;
                    }
                    else {
                        n2 = null;
                    }
                    Integer b2 = n;
                    if (n2 != null) {
                        b2 = n;
                        if (n2.intValue() > 0) {
                            b2 = n2;
                        }
                    }
                    b = b2;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
