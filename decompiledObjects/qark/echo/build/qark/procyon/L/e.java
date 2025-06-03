// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;

public class e extends a
{
    public final ListView G;
    
    public e(final ListView g) {
        super((View)g);
        this.G = g;
    }
    
    @Override
    public boolean a(final int n) {
        return false;
    }
    
    @Override
    public boolean b(final int n) {
        final ListView g = this.G;
        final int count = ((AdapterView)g).getCount();
        if (count == 0) {
            return false;
        }
        final int childCount = ((ViewGroup)g).getChildCount();
        final int firstVisiblePosition = ((AdapterView)g).getFirstVisiblePosition();
        if (n > 0) {
            if (firstVisiblePosition + childCount >= count && ((ViewGroup)g).getChildAt(childCount - 1).getBottom() <= ((View)g).getHeight()) {
                return false;
            }
        }
        else {
            if (n >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && ((ViewGroup)g).getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void j(final int n, final int n2) {
        f.a(this.G, n2);
    }
}
