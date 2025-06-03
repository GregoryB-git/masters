package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.TextView;

class AlertController$AlertParams$2
  extends CursorAdapter
{
  private final int mIsCheckedIndex;
  private final int mLabelIndex;
  
  public AlertController$AlertParams$2(AlertController.AlertParams paramAlertParams, Context paramContext, Cursor paramCursor, boolean paramBoolean, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController)
  {
    super(paramContext, paramCursor, paramBoolean);
    paramContext = getCursor();
    mLabelIndex = paramContext.getColumnIndexOrThrow(mLabelColumn);
    mIsCheckedIndex = paramContext.getColumnIndexOrThrow(mIsCheckedColumn);
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    ((CheckedTextView)paramView.findViewById(16908308)).setText(paramCursor.getString(mLabelIndex));
    paramView = val$listView;
    int i = paramCursor.getPosition();
    int j = paramCursor.getInt(mIsCheckedIndex);
    boolean bool = true;
    if (j != 1) {
      bool = false;
    }
    paramView.setItemChecked(i, bool);
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this$0.mInflater.inflate(val$dialog.mMultiChoiceItemLayout, paramViewGroup, false);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */