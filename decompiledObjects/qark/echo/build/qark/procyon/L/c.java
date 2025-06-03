// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.os.Build$VERSION;
import android.widget.EdgeEffect;
import android.util.AttributeSet;
import android.content.Context;

public abstract class c
{
    public static EdgeEffect a(final Context context, final AttributeSet set) {
        if (Build$VERSION.SDK_INT >= 31) {
            return b.a(context, set);
        }
        return new EdgeEffect(context);
    }
    
    public static float b(final EdgeEffect edgeEffect) {
        if (Build$VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }
    
    public static void c(final EdgeEffect edgeEffect, final float n, final float n2) {
        a.a(edgeEffect, n, n2);
    }
    
    public static float d(final EdgeEffect edgeEffect, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, n, n2);
        }
        c(edgeEffect, n, n2);
        return n;
    }
    
    public abstract static class a
    {
        public static void a(final EdgeEffect edgeEffect, final float n, final float n2) {
            edgeEffect.onPull(n, n2);
        }
    }
    
    public abstract static class b
    {
        public static EdgeEffect a(final Context context, final AttributeSet set) {
            try {
                return new EdgeEffect(context, set);
            }
            finally {
                return new EdgeEffect(context);
            }
        }
        
        public static float b(final EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            }
            finally {
                return 0.0f;
            }
        }
        
        public static float c(final EdgeEffect edgeEffect, final float n, final float n2) {
            while (true) {
                try {
                    return edgeEffect.onPullDistance(n, n2);
                    edgeEffect.onPull(n, n2);
                    return 0.0f;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
