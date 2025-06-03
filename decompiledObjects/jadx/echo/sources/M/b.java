package M;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f3474a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f3474a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f3474a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d7 = this.f3474a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d7 != null) {
            filterResults.count = d7.getCount();
        } else {
            filterResults.count = 0;
            d7 = null;
        }
        filterResults.values = d7;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b7 = this.f3474a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b7) {
            return;
        }
        this.f3474a.a((Cursor) obj);
    }
}
