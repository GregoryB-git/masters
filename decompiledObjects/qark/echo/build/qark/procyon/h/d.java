// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;

public abstract class d extends b
{
    public a A;
    public boolean B;
    
    public d(final a a) {
        if (a != null) {
            this.h(a);
        }
    }
    
    @Override
    public void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(this.getState());
    }
    
    @Override
    public void h(final c c) {
        super.h(c);
        if (c instanceof a) {
            this.A = (a)c;
        }
    }
    
    public int[] j(final AttributeSet set) {
        final int attributeCount = set.getAttributeCount();
        final int[] array = new int[attributeCount];
        int n;
        int n2;
        for (int i = n = 0; i < attributeCount; ++i, n = n2) {
            final int attributeNameResource = set.getAttributeNameResource(i);
            n2 = n;
            if (attributeNameResource != 0) {
                n2 = n;
                if (attributeNameResource != 16842960) {
                    n2 = n;
                    if (attributeNameResource != 16843161) {
                        int n3;
                        if (set.getAttributeBooleanValue(i, false)) {
                            n3 = attributeNameResource;
                        }
                        else {
                            n3 = -attributeNameResource;
                        }
                        array[n] = n3;
                        n2 = n + 1;
                    }
                }
            }
        }
        return StateSet.trimStateSet(array, n);
    }
    
    @Override
    public Drawable mutate() {
        if (!this.B && super.mutate() == this) {
            this.A.r();
            this.B = true;
        }
        return this;
    }
    
    public abstract boolean onStateChange(final int[] p0);
    
    public abstract static class a extends c
    {
        public int[][] J;
        
        public a(final a a, final d d, final Resources resources) {
            super((c)a, d, resources);
            if (a != null) {
                this.J = a.J;
                return;
            }
            this.J = new int[((c)this).f()][];
        }
        
        public int A(final int[] array) {
            final int[][] j = this.J;
            for (int h = ((c)this).h(), i = 0; i < h; ++i) {
                if (StateSet.stateSetMatches(j[i], array)) {
                    return i;
                }
            }
            return -1;
        }
        
        @Override
        public void o(final int n, final int n2) {
            super.o(n, n2);
            final int[][] j = new int[n2][];
            System.arraycopy(this.J, 0, j, 0, n);
            this.J = j;
        }
        
        @Override
        public abstract void r();
        
        public int z(final int[] array, final Drawable drawable) {
            final int a = ((c)this).a(drawable);
            this.J[a] = array;
            return a;
        }
    }
}
