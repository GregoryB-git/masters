// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.ImageView;

public abstract class d
{
    public static ColorStateList a(final ImageView imageView) {
        return a.a(imageView);
    }
    
    public static PorterDuff$Mode b(final ImageView imageView) {
        return a.b(imageView);
    }
    
    public static void c(final ImageView imageView, final ColorStateList list) {
        a.c(imageView, list);
    }
    
    public static void d(final ImageView imageView, final PorterDuff$Mode porterDuff$Mode) {
        a.d(imageView, porterDuff$Mode);
    }
    
    public abstract static class a
    {
        public static ColorStateList a(final ImageView imageView) {
            return imageView.getImageTintList();
        }
        
        public static PorterDuff$Mode b(final ImageView imageView) {
            return imageView.getImageTintMode();
        }
        
        public static void c(final ImageView imageView, final ColorStateList imageTintList) {
            imageView.setImageTintList(imageTintList);
        }
        
        public static void d(final ImageView imageView, final PorterDuff$Mode imageTintMode) {
            imageView.setImageTintMode(imageTintMode);
        }
    }
}
