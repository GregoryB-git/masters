package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ScrollingTabContainerView;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowDecorActionBar$TabImpl
  extends ActionBar.Tab
{
  private ActionBar.TabListener mCallback;
  private CharSequence mContentDesc;
  private View mCustomView;
  private Drawable mIcon;
  private int mPosition = -1;
  private Object mTag;
  private CharSequence mText;
  
  public WindowDecorActionBar$TabImpl(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public ActionBar.TabListener getCallback()
  {
    return mCallback;
  }
  
  public CharSequence getContentDescription()
  {
    return mContentDesc;
  }
  
  public View getCustomView()
  {
    return mCustomView;
  }
  
  public Drawable getIcon()
  {
    return mIcon;
  }
  
  public int getPosition()
  {
    return mPosition;
  }
  
  public Object getTag()
  {
    return mTag;
  }
  
  public CharSequence getText()
  {
    return mText;
  }
  
  public void select()
  {
    this$0.selectTab(this);
  }
  
  public ActionBar.Tab setContentDescription(int paramInt)
  {
    return setContentDescription(this$0.mContext.getResources().getText(paramInt));
  }
  
  public ActionBar.Tab setContentDescription(CharSequence paramCharSequence)
  {
    mContentDesc = paramCharSequence;
    int i = mPosition;
    if (i >= 0) {
      this$0.mTabScrollView.updateTab(i);
    }
    return this;
  }
  
  public ActionBar.Tab setCustomView(int paramInt)
  {
    return setCustomView(LayoutInflater.from(this$0.getThemedContext()).inflate(paramInt, null));
  }
  
  public ActionBar.Tab setCustomView(View paramView)
  {
    mCustomView = paramView;
    int i = mPosition;
    if (i >= 0) {
      this$0.mTabScrollView.updateTab(i);
    }
    return this;
  }
  
  public ActionBar.Tab setIcon(int paramInt)
  {
    return setIcon(AppCompatResources.getDrawable(this$0.mContext, paramInt));
  }
  
  public ActionBar.Tab setIcon(Drawable paramDrawable)
  {
    mIcon = paramDrawable;
    int i = mPosition;
    if (i >= 0) {
      this$0.mTabScrollView.updateTab(i);
    }
    return this;
  }
  
  public void setPosition(int paramInt)
  {
    mPosition = paramInt;
  }
  
  public ActionBar.Tab setTabListener(ActionBar.TabListener paramTabListener)
  {
    mCallback = paramTabListener;
    return this;
  }
  
  public ActionBar.Tab setTag(Object paramObject)
  {
    mTag = paramObject;
    return this;
  }
  
  public ActionBar.Tab setText(int paramInt)
  {
    return setText(this$0.mContext.getResources().getText(paramInt));
  }
  
  public ActionBar.Tab setText(CharSequence paramCharSequence)
  {
    mText = paramCharSequence;
    int i = mPosition;
    if (i >= 0) {
      this$0.mTabScrollView.updateTab(i);
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar.TabImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */