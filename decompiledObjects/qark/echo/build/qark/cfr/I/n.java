/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package I;

import android.view.View;
import android.view.ViewGroup;

public class n {
    public int a;
    public int b;

    public n(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void b(View view, View view2, int n8) {
        this.c(view, view2, n8, 0);
    }

    public void c(View view, View view2, int n8, int n9) {
        if (n9 == 1) {
            this.b = n8;
            return;
        }
        this.a = n8;
    }

    public void d(View view, int n8) {
        if (n8 == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }
}

