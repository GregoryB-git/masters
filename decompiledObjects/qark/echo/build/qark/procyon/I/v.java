// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.ViewGroup;

public abstract class v
{
    public static boolean a(final ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
    
    public abstract static class a
    {
        public static int a(final ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
        
        public static boolean b(final ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
        
        public static void c(final ViewGroup viewGroup, final boolean transitionGroup) {
            viewGroup.setTransitionGroup(transitionGroup);
        }
    }
}
