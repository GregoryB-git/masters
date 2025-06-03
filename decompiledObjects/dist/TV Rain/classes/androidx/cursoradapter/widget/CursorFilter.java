package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter
  extends Filter
{
  public CursorFilterClient mClient;
  
  public CursorFilter(CursorFilterClient paramCursorFilterClient)
  {
    mClient = paramCursorFilterClient;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return mClient.convertToString((Cursor)paramObject);
  }
  
  public Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = mClient.runQueryOnBackgroundThread(paramCharSequence);
    paramCharSequence = new Filter.FilterResults();
    if (localCursor != null)
    {
      count = localCursor.getCount();
      values = localCursor;
    }
    else
    {
      count = 0;
      values = null;
    }
    return paramCharSequence;
  }
  
  public void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = mClient.getCursor();
    paramFilterResults = values;
    if ((paramFilterResults != null) && (paramFilterResults != paramCharSequence)) {
      mClient.changeCursor((Cursor)paramFilterResults);
    }
  }
  
  public static abstract interface CursorFilterClient
  {
    public abstract void changeCursor(Cursor paramCursor);
    
    public abstract CharSequence convertToString(Cursor paramCursor);
    
    public abstract Cursor getCursor();
    
    public abstract Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     androidx.cursoradapter.widget.CursorFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */