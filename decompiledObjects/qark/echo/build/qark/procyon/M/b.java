// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M;

import android.widget.Filter$FilterResults;
import android.database.Cursor;
import android.widget.Filter;

public class b extends Filter
{
    public a a;
    
    public b(final a a) {
        this.a = a;
    }
    
    public CharSequence convertResultToString(final Object o) {
        return this.a.c((Cursor)o);
    }
    
    public Filter$FilterResults performFiltering(final CharSequence charSequence) {
        Cursor d = this.a.d(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (d != null) {
            filter$FilterResults.count = d.getCount();
        }
        else {
            filter$FilterResults.count = 0;
            d = null;
        }
        filter$FilterResults.values = d;
        return filter$FilterResults;
    }
    
    public void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor b = this.a.b();
        final Object values = filter$FilterResults.values;
        if (values != null && values != b) {
            this.a.a((Cursor)values);
        }
    }
    
    public interface a
    {
        void a(final Cursor p0);
        
        Cursor b();
        
        CharSequence c(final Cursor p0);
        
        Cursor d(final CharSequence p0);
    }
}
