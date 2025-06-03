package m0;

import android.database.Cursor;
import android.util.Log;
import android.view.View;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import l.t0;

public final class b
  extends Filter
{
  public a a;
  
  public b(a parama)
  {
    a = parama;
  }
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    a locala = a;
    paramObject = (Cursor)paramObject;
    return ((t0)locala).d((Cursor)paramObject);
  }
  
  public final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Object localObject = (t0)a;
    if (paramCharSequence == null)
    {
      paramCharSequence = "";
    }
    else
    {
      localObject.getClass();
      paramCharSequence = paramCharSequence.toString();
    }
    if ((s.getVisibility() == 0) && (s.getWindowVisibility() == 0)) {
      try
      {
        paramCharSequence = ((t0)localObject).h(t, paramCharSequence);
        if (paramCharSequence != null) {
          paramCharSequence.getCount();
        }
      }
      catch (RuntimeException paramCharSequence)
      {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", paramCharSequence);
      }
    }
    paramCharSequence = null;
    localObject = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      count = paramCharSequence.getCount();
      values = paramCharSequence;
    }
    else
    {
      count = 0;
      values = null;
    }
    return (Filter.FilterResults)localObject;
  }
  
  public final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = a;
    Cursor localCursor = c;
    paramFilterResults = values;
    if ((paramFilterResults != null) && (paramFilterResults != localCursor))
    {
      paramFilterResults = (Cursor)paramFilterResults;
      ((t0)paramCharSequence).c(paramFilterResults);
    }
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     m0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */