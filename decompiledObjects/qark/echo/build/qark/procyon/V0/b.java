// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import d0.q;
import d0.y;
import d0.w;
import d0.x;

public abstract class b implements x.b
{
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SCTE-35 splice command: type=");
        sb.append(this.getClass().getSimpleName());
        return sb.toString();
    }
}
