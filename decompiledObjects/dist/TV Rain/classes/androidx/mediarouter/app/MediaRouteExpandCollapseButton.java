package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.ContextCompat;
import androidx.mediarouter.R.drawable;
import androidx.mediarouter.R.string;

class MediaRouteExpandCollapseButton
  extends AppCompatImageButton
{
  public final AnimationDrawable mCollapseAnimationDrawable;
  public final String mCollapseGroupDescription;
  public final AnimationDrawable mExpandAnimationDrawable;
  public final String mExpandGroupDescription;
  public boolean mIsGroupExpanded;
  public View.OnClickListener mListener;
  
  public MediaRouteExpandCollapseButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MediaRouteExpandCollapseButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = (AnimationDrawable)ContextCompat.getDrawable(paramContext, R.drawable.mr_group_expand);
    mExpandAnimationDrawable = paramAttributeSet;
    AnimationDrawable localAnimationDrawable = (AnimationDrawable)ContextCompat.getDrawable(paramContext, R.drawable.mr_group_collapse);
    mCollapseAnimationDrawable = localAnimationDrawable;
    Object localObject = new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(paramContext, paramInt), PorterDuff.Mode.SRC_IN);
    paramAttributeSet.setColorFilter((ColorFilter)localObject);
    localAnimationDrawable.setColorFilter((ColorFilter)localObject);
    localObject = paramContext.getString(R.string.mr_controller_expand_group);
    mExpandGroupDescription = ((String)localObject);
    mCollapseGroupDescription = paramContext.getString(R.string.mr_controller_collapse_group);
    setImageDrawable(paramAttributeSet.getFrame(0));
    setContentDescription((CharSequence)localObject);
    super.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Object localObject = MediaRouteExpandCollapseButton.this;
        boolean bool = mIsGroupExpanded ^ true;
        mIsGroupExpanded = bool;
        if (bool)
        {
          ((AppCompatImageButton)localObject).setImageDrawable(mExpandAnimationDrawable);
          mExpandAnimationDrawable.start();
          localObject = MediaRouteExpandCollapseButton.this;
          ((View)localObject).setContentDescription(mCollapseGroupDescription);
        }
        else
        {
          ((AppCompatImageButton)localObject).setImageDrawable(mCollapseAnimationDrawable);
          mCollapseAnimationDrawable.start();
          localObject = MediaRouteExpandCollapseButton.this;
          ((View)localObject).setContentDescription(mExpandGroupDescription);
        }
        localObject = mListener;
        if (localObject != null) {
          ((View.OnClickListener)localObject).onClick(paramAnonymousView);
        }
      }
    });
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    mListener = paramOnClickListener;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteExpandCollapseButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */