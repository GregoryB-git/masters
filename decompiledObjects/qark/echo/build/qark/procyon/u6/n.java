// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

public abstract class n
{
    public static final void a(final int i) {
        if (i >= 1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but got ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
