package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R.drawable;
import com.facebook.login.R.id;
import com.facebook.login.R.layout;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class ToolTipPopup
{
  public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000L;
  private final WeakReference<View> mAnchorViewRef;
  private final Context mContext;
  private long mNuxDisplayTime = 6000L;
  private PopupContentView mPopupContent;
  private PopupWindow mPopupWindow;
  private final ViewTreeObserver.OnScrollChangedListener mScrollListener = new ViewTreeObserver.OnScrollChangedListener()
  {
    public void onScrollChanged()
    {
      if ((ToolTipPopup.access$000(ToolTipPopup.this).get() != null) && (ToolTipPopup.access$100(ToolTipPopup.this) != null) && (ToolTipPopup.access$100(ToolTipPopup.this).isShowing())) {
        if (ToolTipPopup.access$100(ToolTipPopup.this).isAboveAnchor()) {
          ToolTipPopup.access$200(ToolTipPopup.this).showBottomArrow();
        } else {
          ToolTipPopup.access$200(ToolTipPopup.this).showTopArrow();
        }
      }
    }
  };
  private Style mStyle = Style.BLUE;
  private final String mText;
  
  public ToolTipPopup(String paramString, View paramView)
  {
    mText = paramString;
    mAnchorViewRef = new WeakReference(paramView);
    mContext = paramView.getContext();
  }
  
  private void registerObserver()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      unregisterObserver();
      if (mAnchorViewRef.get() != null) {
        ((View)mAnchorViewRef.get()).getViewTreeObserver().addOnScrollChangedListener(mScrollListener);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void unregisterObserver()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (mAnchorViewRef.get() != null) {
        ((View)mAnchorViewRef.get()).getViewTreeObserver().removeOnScrollChangedListener(mScrollListener);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void updateArrows()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      PopupWindow localPopupWindow = mPopupWindow;
      if ((localPopupWindow != null) && (localPopupWindow.isShowing())) {
        if (mPopupWindow.isAboveAnchor()) {
          mPopupContent.showBottomArrow();
        } else {
          mPopupContent.showTopArrow();
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void dismiss()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      unregisterObserver();
      PopupWindow localPopupWindow = mPopupWindow;
      if (localPopupWindow != null) {
        localPopupWindow.dismiss();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void setNuxDisplayTime(long paramLong)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      mNuxDisplayTime = paramLong;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void setStyle(Style paramStyle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      mStyle = paramStyle;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramStyle, this);
    }
  }
  
  public void show()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (mAnchorViewRef.get() != null)
      {
        Object localObject = new com/facebook/login/widget/ToolTipPopup$PopupContentView;
        ((PopupContentView)localObject).<init>(this, mContext);
        mPopupContent = ((PopupContentView)localObject);
        ((TextView)((View)localObject).findViewById(R.id.com_facebook_tooltip_bubble_view_text_body)).setText(mText);
        if (mStyle == Style.BLUE)
        {
          PopupContentView.access$300(mPopupContent).setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
          PopupContentView.access$400(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
          PopupContentView.access$500(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
          PopupContentView.access$600(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
        }
        else
        {
          PopupContentView.access$300(mPopupContent).setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
          PopupContentView.access$400(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
          PopupContentView.access$500(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
          PopupContentView.access$600(mPopupContent).setImageResource(R.drawable.com_facebook_tooltip_black_xout);
        }
        localObject = ((Activity)mContext).getWindow().getDecorView();
        int i = ((View)localObject).getWidth();
        int j = ((View)localObject).getHeight();
        registerObserver();
        mPopupContent.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE));
        localObject = new android/widget/PopupWindow;
        PopupContentView localPopupContentView = mPopupContent;
        ((PopupWindow)localObject).<init>(localPopupContentView, localPopupContentView.getMeasuredWidth(), mPopupContent.getMeasuredHeight());
        mPopupWindow = ((PopupWindow)localObject);
        ((PopupWindow)localObject).showAsDropDown((View)mAnchorViewRef.get());
        updateArrows();
        if (mNuxDisplayTime > 0L)
        {
          localPopupContentView = mPopupContent;
          localObject = new com/facebook/login/widget/ToolTipPopup$2;
          ((2)localObject).<init>(this);
          localPopupContentView.postDelayed((Runnable)localObject, mNuxDisplayTime);
        }
        mPopupWindow.setTouchable(true);
        localPopupContentView = mPopupContent;
        localObject = new com/facebook/login/widget/ToolTipPopup$3;
        ((3)localObject).<init>(this);
        localPopupContentView.setOnClickListener((View.OnClickListener)localObject);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public class PopupContentView
    extends FrameLayout
  {
    private View bodyFrame;
    private ImageView bottomArrow;
    private ImageView topArrow;
    private ImageView xOut;
    
    public PopupContentView(Context paramContext)
    {
      super();
      init();
    }
    
    private void init()
    {
      LayoutInflater.from(getContext()).inflate(R.layout.com_facebook_tooltip_bubble, this);
      topArrow = ((ImageView)findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer));
      bottomArrow = ((ImageView)findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer));
      bodyFrame = findViewById(R.id.com_facebook_body_frame);
      xOut = ((ImageView)findViewById(R.id.com_facebook_button_xout));
    }
    
    public void showBottomArrow()
    {
      topArrow.setVisibility(4);
      bottomArrow.setVisibility(0);
    }
    
    public void showTopArrow()
    {
      topArrow.setVisibility(0);
      bottomArrow.setVisibility(4);
    }
  }
  
  public static enum Style
  {
    static
    {
      Style localStyle1 = new Style("BLUE", 0);
      BLUE = localStyle1;
      Style localStyle2 = new Style("BLACK", 1);
      BLACK = localStyle2;
      $VALUES = new Style[] { localStyle1, localStyle2 };
    }
    
    private Style() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.ToolTipPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */