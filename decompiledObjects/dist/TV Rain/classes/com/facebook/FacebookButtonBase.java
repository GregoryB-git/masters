package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R.color;
import com.facebook.common.R.style;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

public abstract class FacebookButtonBase
  extends Button
{
  private String analyticsButtonCreatedEventName;
  private String analyticsButtonTappedEventName;
  private View.OnClickListener externalOnClickListener;
  private View.OnClickListener internalOnClickListener;
  private boolean overrideCompoundPadding;
  private int overrideCompoundPaddingLeft;
  private int overrideCompoundPaddingRight;
  private FragmentWrapper parentFragment;
  
  public FacebookButtonBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    super(paramContext, paramAttributeSet, 0);
    int i = paramInt2;
    if (paramInt2 == 0) {
      i = getDefaultStyleResource();
    }
    paramInt2 = i;
    if (i == 0) {
      paramInt2 = R.style.com_facebook_button;
    }
    configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    analyticsButtonCreatedEventName = paramString1;
    analyticsButtonTappedEventName = paramString2;
    setClickable(true);
    setFocusable(true);
  }
  
  private void logButtonCreated(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      InternalAppEventsLogger localInternalAppEventsLogger = new com/facebook/appevents/InternalAppEventsLogger;
      localInternalAppEventsLogger.<init>(paramContext);
      localInternalAppEventsLogger.logEventImplicitly(analyticsButtonCreatedEventName);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void logButtonTapped(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      InternalAppEventsLogger localInternalAppEventsLogger = new com/facebook/appevents/InternalAppEventsLogger;
      localInternalAppEventsLogger.<init>(paramContext);
      localInternalAppEventsLogger.logEventImplicitly(analyticsButtonTappedEventName);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void parseBackgroundAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (isInEditMode()) {
        return;
      }
      paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16842964 }, paramInt1, paramInt2);
      try
      {
        if (paramAttributeSet.hasValue(0))
        {
          paramInt1 = paramAttributeSet.getResourceId(0, 0);
          if (paramInt1 != 0) {
            setBackgroundResource(paramInt1);
          } else {
            setBackgroundColor(paramAttributeSet.getColor(0, 0));
          }
        }
        else
        {
          setBackgroundColor(ContextCompat.getColor(paramContext, R.color.com_facebook_blue));
        }
        return;
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  @SuppressLint({"ResourceType"})
  private void parseCompoundDrawableAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16843119, 16843117, 16843120, 16843118, 16843121 }, paramInt1, paramInt2);
      try
      {
        setCompoundDrawablesWithIntrinsicBounds(paramAttributeSet.getResourceId(0, 0), paramAttributeSet.getResourceId(1, 0), paramAttributeSet.getResourceId(2, 0), paramAttributeSet.getResourceId(3, 0));
        setCompoundDrawablePadding(paramAttributeSet.getDimensionPixelSize(4, 0));
        return;
      }
      finally
      {
        paramAttributeSet.recycle();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void parseContentAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16842966, 16842967, 16842968, 16842969 }, paramInt1, paramInt2);
      try
      {
        setPadding(paramContext.getDimensionPixelSize(0, 0), paramContext.getDimensionPixelSize(1, 0), paramContext.getDimensionPixelSize(2, 0), paramContext.getDimensionPixelSize(3, 0));
        return;
      }
      finally
      {
        paramContext.recycle();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void parseTextAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16842904 }, paramInt1, paramInt2);
      try
      {
        setTextColor(localTypedArray.getColorStateList(0));
        localTypedArray.recycle();
        localTypedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16842927 }, paramInt1, paramInt2);
        try
        {
          setGravity(localTypedArray.getInt(0, 17));
          localTypedArray.recycle();
          paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, new int[] { 16842901, 16842903, 16843087 }, paramInt1, paramInt2);
          try
          {
            setTextSize(0, paramAttributeSet.getDimensionPixelSize(0, 0));
            setTypeface(Typeface.defaultFromStyle(paramAttributeSet.getInt(1, 1)));
            setText(paramAttributeSet.getString(2));
            return;
          }
          finally
          {
            paramAttributeSet.recycle();
          }
          paramContext = finally;
        }
        finally
        {
          localTypedArray.recycle();
        }
        paramContext = finally;
      }
      finally {}
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void setupOnClickListener()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      View.OnClickListener local1 = new com/facebook/FacebookButtonBase$1;
      local1.<init>(this);
      super.setOnClickListener(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void callExternalOnClickListener(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      View.OnClickListener localOnClickListener = externalOnClickListener;
      if (localOnClickListener != null) {
        localOnClickListener.onClick(paramView);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      parseBackgroundAttributes(paramContext, paramAttributeSet, paramInt1, paramInt2);
      parseCompoundDrawableAttributes(paramContext, paramAttributeSet, paramInt1, paramInt2);
      parseContentAttributes(paramContext, paramAttributeSet, paramInt1, paramInt2);
      parseTextAttributes(paramContext, paramAttributeSet, paramInt1, paramInt2);
      setupOnClickListener();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  public Activity getActivity()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      for (Object localObject = getContext(); (!(localObject instanceof Activity)) && ((localObject instanceof ContextWrapper)); localObject = ((ContextWrapper)localObject).getBaseContext()) {}
      if ((localObject instanceof Activity)) {
        return (Activity)localObject;
      }
      localObject = new com/facebook/FacebookException;
      ((FacebookException)localObject).<init>("Unable to get Activity.");
      throw ((Throwable)localObject);
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public int getCompoundPaddingLeft()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i;
      if (overrideCompoundPadding) {
        i = overrideCompoundPaddingLeft;
      } else {
        i = super.getCompoundPaddingLeft();
      }
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  public int getCompoundPaddingRight()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i;
      if (overrideCompoundPadding) {
        i = overrideCompoundPaddingRight;
      } else {
        i = super.getCompoundPaddingRight();
      }
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  public abstract int getDefaultRequestCode();
  
  public int getDefaultStyleResource()
  {
    CrashShieldHandler.isObjectCrashing(this);
    return 0;
  }
  
  public androidx.fragment.app.Fragment getFragment()
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(this);
    androidx.fragment.app.Fragment localFragment = null;
    if (bool) {
      return null;
    }
    try
    {
      FragmentWrapper localFragmentWrapper = parentFragment;
      if (localFragmentWrapper != null) {
        localFragment = localFragmentWrapper.getSupportFragment();
      }
      return localFragment;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public android.app.Fragment getNativeFragment()
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(this);
    android.app.Fragment localFragment = null;
    if (bool) {
      return null;
    }
    try
    {
      FragmentWrapper localFragmentWrapper = parentFragment;
      if (localFragmentWrapper != null) {
        localFragment = localFragmentWrapper.getNativeFragment();
      }
      return localFragment;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public int getRequestCode()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i = getDefaultRequestCode();
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  public int measureTextWidth(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      double d = Math.ceil(getPaint().measureText(paramString));
      return (int)d;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
    return 0;
  }
  
  public void onAttachedToWindow()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onAttachedToWindow();
      if (!isInEditMode()) {
        logButtonCreated(getContext());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      int i;
      if ((getGravity() & 0x1) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        int j = getCompoundPaddingLeft();
        i = getCompoundPaddingRight();
        int k = getCompoundDrawablePadding();
        k = Math.min((getWidth() - (k + j) - i - measureTextWidth(getText().toString())) / 2, (j - getPaddingLeft()) / 2);
        overrideCompoundPaddingLeft = (j - k);
        overrideCompoundPaddingRight = (i + k);
        overrideCompoundPadding = true;
      }
      super.onDraw(paramCanvas);
      overrideCompoundPadding = false;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCanvas, this);
    }
  }
  
  public void setFragment(android.app.Fragment paramFragment)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FragmentWrapper localFragmentWrapper = new com/facebook/internal/FragmentWrapper;
      localFragmentWrapper.<init>(paramFragment);
      parentFragment = localFragmentWrapper;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFragment, this);
    }
  }
  
  public void setFragment(androidx.fragment.app.Fragment paramFragment)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FragmentWrapper localFragmentWrapper = new com/facebook/internal/FragmentWrapper;
      localFragmentWrapper.<init>(paramFragment);
      parentFragment = localFragmentWrapper;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFragment, this);
    }
  }
  
  public void setInternalOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      internalOnClickListener = paramOnClickListener;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramOnClickListener, this);
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      externalOnClickListener = paramOnClickListener;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramOnClickListener, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookButtonBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */