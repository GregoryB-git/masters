package androidx.browser.browseractions;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.widget.TextViewCompat;
import java.util.List;

class BrowserActionsFallbackMenuUi
  implements AdapterView.OnItemClickListener
{
  private static final String TAG = "BrowserActionskMenuUi";
  private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
  private final Context mContext;
  private final List<BrowserActionItem> mMenuItems;
  public BrowserActionsFallMenuUiListener mMenuUiListener;
  private final Uri mUri;
  
  public BrowserActionsFallbackMenuUi(Context paramContext, Uri paramUri, List<BrowserActionItem> paramList)
  {
    mContext = paramContext;
    mUri = paramUri;
    mMenuItems = paramList;
  }
  
  private BrowserActionsFallbackMenuView initMenuView(View paramView)
  {
    BrowserActionsFallbackMenuView localBrowserActionsFallbackMenuView = (BrowserActionsFallbackMenuView)paramView.findViewById(R.id.browser_actions_menu_view);
    final TextView localTextView = (TextView)paramView.findViewById(R.id.browser_actions_header_text);
    localTextView.setText(mUri.toString());
    localTextView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (TextViewCompat.getMaxLines(localTextView) == Integer.MAX_VALUE)
        {
          localTextView.setMaxLines(1);
          localTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        else
        {
          localTextView.setMaxLines(Integer.MAX_VALUE);
          localTextView.setEllipsize(null);
        }
      }
    });
    paramView = (ListView)paramView.findViewById(R.id.browser_actions_menu_items);
    paramView.setAdapter(new BrowserActionsFallbackMenuAdapter(mMenuItems, mContext));
    paramView.setOnItemClickListener(this);
    return localBrowserActionsFallbackMenuView;
  }
  
  public void displayMenu()
  {
    final View localView = LayoutInflater.from(mContext).inflate(R.layout.browser_actions_context_menu_page, null);
    BrowserActionsFallbackMenuDialog localBrowserActionsFallbackMenuDialog = new BrowserActionsFallbackMenuDialog(mContext, initMenuView(localView));
    mBrowserActionsDialog = localBrowserActionsFallbackMenuDialog;
    localBrowserActionsFallbackMenuDialog.setContentView(localView);
    if (mMenuUiListener != null) {
      mBrowserActionsDialog.setOnShowListener(new DialogInterface.OnShowListener()
      {
        public void onShow(DialogInterface paramAnonymousDialogInterface)
        {
          mMenuUiListener.onMenuShown(localView);
        }
      });
    }
    mBrowserActionsDialog.show();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((BrowserActionItem)mMenuItems.get(paramInt)).getAction();
    try
    {
      paramAdapterView.send();
      mBrowserActionsDialog.dismiss();
    }
    catch (PendingIntent.CanceledException paramAdapterView)
    {
      Log.e("BrowserActionskMenuUi", "Failed to send custom item action", paramAdapterView);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public void setMenuUiListener(BrowserActionsFallMenuUiListener paramBrowserActionsFallMenuUiListener)
  {
    mMenuUiListener = paramBrowserActionsFallMenuUiListener;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public static abstract interface BrowserActionsFallMenuUiListener
  {
    public abstract void onMenuShown(View paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuUi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */