// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.View;
import android.view.ViewGroup;

public class n
{
    public int a;
    public int b;
    
    public n(final ViewGroup viewGroup) {
    }
    
    public int a() {
        return this.a | this.b;
    }
    
    public void b(final View view, final View view2, final int n) {
        this.c(view, view2, n, 0);
    }
    
    public void c(final View view, final View view2, final int n, final int n2) {
        if (n2 == 1) {
            this.b = n;
            return;
        }
        this.a = n;
    }
    
    public void d(final View view, final int n) {
        if (n == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }
}
