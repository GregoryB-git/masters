// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import java.util.List;
import android.graphics.Rect;
import H.c;
import android.os.Build$VERSION;
import android.view.DisplayCutout;

public final class d
{
    public final DisplayCutout a;
    
    public d(final DisplayCutout a) {
        this.a = a;
    }
    
    public static d e(final DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new d(displayCutout);
    }
    
    public int a() {
        if (Build$VERSION.SDK_INT >= 28) {
            return d.a.c(this.a);
        }
        return 0;
    }
    
    public int b() {
        if (Build$VERSION.SDK_INT >= 28) {
            return d.a.d(this.a);
        }
        return 0;
    }
    
    public int c() {
        if (Build$VERSION.SDK_INT >= 28) {
            return d.a.e(this.a);
        }
        return 0;
    }
    
    public int d() {
        if (Build$VERSION.SDK_INT >= 28) {
            return d.a.f(this.a);
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && d.class == o.getClass() && c.a(this.a, ((d)o).a));
    }
    
    @Override
    public int hashCode() {
        final DisplayCutout a = this.a;
        if (a == null) {
            return 0;
        }
        return I.c.a(a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisplayCutoutCompat{");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public abstract static class a
    {
        public static DisplayCutout a(final Rect rect, final List<Rect> list) {
            return new DisplayCutout(rect, (List)list);
        }
        
        public static List<Rect> b(final DisplayCutout displayCutout) {
            return (List<Rect>)displayCutout.getBoundingRects();
        }
        
        public static int c(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }
        
        public static int d(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }
        
        public static int e(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }
        
        public static int f(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }
}
