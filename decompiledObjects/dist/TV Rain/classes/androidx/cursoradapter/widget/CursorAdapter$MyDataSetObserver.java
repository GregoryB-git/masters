package androidx.cursoradapter.widget;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

class CursorAdapter$MyDataSetObserver
  extends DataSetObserver
{
  public CursorAdapter$MyDataSetObserver(CursorAdapter paramCursorAdapter) {}
  
  public void onChanged()
  {
    CursorAdapter localCursorAdapter = this$0;
    mDataValid = true;
    localCursorAdapter.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    CursorAdapter localCursorAdapter = this$0;
    mDataValid = false;
    localCursorAdapter.notifyDataSetInvalidated();
  }
}

/* Location:
 * Qualified Name:     androidx.cursoradapter.widget.CursorAdapter.MyDataSetObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */