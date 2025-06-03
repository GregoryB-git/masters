// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

public final class s extends r
{
    public final String r;
    
    public s(final String s, final k k) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid content type: ");
        sb.append(s);
        super(sb.toString(), k, 2003, 1);
        this.r = s;
    }
}
