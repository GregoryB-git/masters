// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s;

import android.graphics.drawable.Drawable;

public abstract class e extends Drawable
{
    public static final double a;
    
    static {
        a = Math.cos(Math.toRadians(45.0));
    }
    
    public static float a(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            n3 = (float)(n + (1.0 - e.a) * n2);
        }
        return n3;
    }
    
    public static float b(float n, final float n2, final boolean b) {
        final float n3 = n *= 1.5f;
        if (b) {
            n = (float)(n3 + (1.0 - e.a) * n2);
        }
        return n;
    }
}
