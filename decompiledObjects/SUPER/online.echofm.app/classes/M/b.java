package M;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

public class b
  extends Filter
{
  public a a;
  
  public b(a parama)
  {
    a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return a.c((Cursor)paramObject);
  }
  
  public Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = a.d(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null) {
      count = paramCharSequence.getCount();
    }
    for (;;)
    {
      values = paramCharSequence;
      break;
      count = 0;
      paramCharSequence = null;
    }
    return localFilterResults;
  }
  
  public void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = a.b();
    paramFilterResults = values;
    if ((paramFilterResults != null) && (paramFilterResults != paramCharSequence)) {
      a.a((Cursor)paramFilterResults);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Cursor paramCursor);
    
    public abstract Cursor b();
    
    public abstract CharSequence c(Cursor paramCursor);
    
    public abstract Cursor d(CharSequence paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     M.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */