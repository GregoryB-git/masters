package androidx.appcompat.widget;

import android.database.DataSetObserver;

class ListPopupWindow$PopupDataSetObserver
  extends DataSetObserver
{
  public ListPopupWindow$PopupDataSetObserver(ListPopupWindow paramListPopupWindow) {}
  
  public void onChanged()
  {
    if (this$0.isShowing()) {
      this$0.show();
    }
  }
  
  public void onInvalidated()
  {
    this$0.dismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ListPopupWindow.PopupDataSetObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */