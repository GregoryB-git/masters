/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ListView
 */
package L;

import L.a;
import L.f;
import android.view.View;
import android.widget.ListView;

public class e
extends a {
    public final ListView G;

    public e(ListView listView) {
        super((View)listView);
        this.G = listView;
    }

    @Override
    public boolean a(int n8) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n8) {
        ListView listView = this.G;
        int n9 = listView.getCount();
        if (n9 == 0) {
            return false;
        }
        int n10 = listView.getChildCount();
        int n11 = listView.getFirstVisiblePosition();
        if (n8 > 0) {
            if (n11 + n10 < n9 || listView.getChildAt(n10 - 1).getBottom() > listView.getHeight()) return true;
            return false;
        }
        if (n8 >= 0) return false;
        if (n11 > 0 || listView.getChildAt(0).getTop() < 0) return true;
        return false;
    }

    @Override
    public void j(int n8, int n9) {
        f.a(this.G, n9);
    }
}

