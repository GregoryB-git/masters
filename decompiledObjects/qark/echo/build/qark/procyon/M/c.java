// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M;

import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a
{
    public int w;
    public int x;
    public LayoutInflater y;
    
    public c(final Context context, final int n, final Cursor cursor, final boolean b) {
        super(context, cursor, b);
        this.x = n;
        this.w = n;
        this.y = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    @Override
    public View g(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.y.inflate(this.x, viewGroup, false);
    }
    
    @Override
    public View h(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.y.inflate(this.w, viewGroup, false);
    }
}
