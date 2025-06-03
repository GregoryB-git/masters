package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.content.res.ResourcesCompat;
import java.util.List;

class BrowserActionsFallbackMenuAdapter
  extends BaseAdapter
{
  private final Context mContext;
  private final List<BrowserActionItem> mMenuItems;
  
  public BrowserActionsFallbackMenuAdapter(List<BrowserActionItem> paramList, Context paramContext)
  {
    mMenuItems = paramList;
    mContext = paramContext;
  }
  
  public int getCount()
  {
    return mMenuItems.size();
  }
  
  public Object getItem(int paramInt)
  {
    return mMenuItems.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = (BrowserActionItem)mMenuItems.get(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(mContext).inflate(R.layout.browser_actions_context_menu_row, null);
      paramViewGroup = new ViewHolderItem();
      mIcon = ((ImageView)paramView.findViewById(R.id.browser_actions_menu_item_icon));
      mText = ((TextView)paramView.findViewById(R.id.browser_actions_menu_item_text));
      paramView.setTag(paramViewGroup);
    }
    else
    {
      paramViewGroup = (ViewHolderItem)paramView.getTag();
    }
    mText.setText(((BrowserActionItem)localObject).getTitle());
    if (((BrowserActionItem)localObject).getIconId() != 0)
    {
      localObject = ResourcesCompat.getDrawable(mContext.getResources(), ((BrowserActionItem)localObject).getIconId(), null);
      mIcon.setImageDrawable((Drawable)localObject);
    }
    else
    {
      mIcon.setImageDrawable(null);
    }
    return paramView;
  }
  
  public static class ViewHolderItem
  {
    public ImageView mIcon;
    public TextView mText;
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */