/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  java.lang.Object
 *  java.lang.System
 */
package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import h.b;

public abstract class d
extends b {
    public a A;
    public boolean B;

    public d(a a8) {
        if (a8 != null) {
            this.h(a8);
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.onStateChange(this.getState());
    }

    @Override
    public void h(b.c c8) {
        super.h(c8);
        if (c8 instanceof a) {
            this.A = (a)c8;
        }
    }

    public int[] j(AttributeSet attributeSet) {
        int n8;
        int n9 = attributeSet.getAttributeCount();
        int[] arrn = new int[n9];
        int n10 = n8 = 0;
        while (n8 < n9) {
            int n11 = attributeSet.getAttributeNameResource(n8);
            int n12 = n10;
            if (n11 != 0) {
                n12 = n10;
                if (n11 != 16842960) {
                    n12 = n10;
                    if (n11 != 16843161) {
                        n12 = attributeSet.getAttributeBooleanValue(n8, false) ? n11 : - n11;
                        arrn[n10] = n12;
                        n12 = n10 + 1;
                    }
                }
            }
            ++n8;
            n10 = n12;
        }
        return StateSet.trimStateSet((int[])arrn, (int)n10);
    }

    @Override
    public Drawable mutate() {
        if (!this.B && super.mutate() == this) {
            this.A.r();
            this.B = true;
        }
        return this;
    }

    public abstract boolean onStateChange(int[] var1);

    public static abstract class a
    extends b.c {
        public int[][] J;

        public a(a a8, d d8, Resources resources) {
            super(a8, d8, resources);
            if (a8 != null) {
                this.J = a8.J;
                return;
            }
            this.J = new int[this.f()][];
        }

        public int A(int[] arrn) {
            int[][] arrn2 = this.J;
            int n8 = this.h();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!StateSet.stateSetMatches((int[])arrn2[i8], (int[])arrn)) continue;
                return i8;
            }
            return -1;
        }

        @Override
        public void o(int n8, int n9) {
            super.o(n8, n9);
            int[][] arrarrn = new int[n9][];
            System.arraycopy((Object)this.J, (int)0, (Object)arrarrn, (int)0, (int)n8);
            this.J = arrarrn;
        }

        @Override
        public abstract void r();

        public int z(int[] arrn, Drawable drawable2) {
            int n8 = this.a(drawable2);
            this.J[n8] = arrn;
            return n8;
        }
    }

}

