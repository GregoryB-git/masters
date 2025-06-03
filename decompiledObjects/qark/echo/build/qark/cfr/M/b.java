/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package M;

import android.database.Cursor;
import android.widget.Filter;

public class b
extends Filter {
    public a a;

    public b(a a8) {
        this.a = a8;
    }

    public CharSequence convertResultToString(Object object) {
        return this.a.c((Cursor)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        charSequence = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            filterResults.count = charSequence.getCount();
        } else {
            filterResults.count = 0;
            charSequence = null;
        }
        filterResults.values = charSequence;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults object) {
        charSequence = this.a.b();
        object = object.values;
        if (object != null && object != charSequence) {
            this.a.a((Cursor)object);
        }
    }

    public static interface a {
        public void a(Cursor var1);

        public Cursor b();

        public CharSequence c(Cursor var1);

        public Cursor d(CharSequence var1);
    }

}

