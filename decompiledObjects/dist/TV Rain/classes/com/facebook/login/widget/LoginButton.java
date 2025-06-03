package com.facebook.login.widget;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R.color;
import com.facebook.common.R.drawable;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.R.string;
import com.facebook.login.R.style;
import com.facebook.login.R.styleable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class LoginButton
  extends FacebookButtonBase
{
  private static final String TAG = LoginButton.class.getName();
  private AccessTokenTracker accessTokenTracker;
  private boolean confirmLogout;
  private String loginLogoutEventName = "fb_login_view_usage";
  private LoginManager loginManager;
  private String loginText;
  private String logoutText;
  private LoginButtonProperties properties = new LoginButtonProperties();
  private boolean toolTipChecked;
  private long toolTipDisplayTime = 6000L;
  private ToolTipMode toolTipMode;
  private ToolTipPopup toolTipPopup;
  private ToolTipPopup.Style toolTipStyle = ToolTipPopup.Style.BLUE;
  
  public LoginButton(Context paramContext)
  {
    super(paramContext, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
  }
  
  public LoginButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
  }
  
  public LoginButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0, "fb_login_button_create", "fb_login_button_did_tap");
  }
  
  private void checkToolTipSettings()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      int i = 3.$SwitchMap$com$facebook$login$widget$LoginButton$ToolTipMode[toolTipMode.ordinal()];
      if (i != 1)
      {
        if (i == 2) {
          displayToolTip(getResources().getString(R.string.com_facebook_tooltip_default));
        }
      }
      else
      {
        String str = Utility.getMetadataApplicationId(getContext());
        Executor localExecutor = FacebookSdk.getExecutor();
        Runnable local1 = new com/facebook/login/widget/LoginButton$1;
        local1.<init>(this, str);
        localExecutor.execute(local1);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void displayToolTip(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ToolTipPopup localToolTipPopup = new com/facebook/login/widget/ToolTipPopup;
      localToolTipPopup.<init>(paramString, this);
      toolTipPopup = localToolTipPopup;
      localToolTipPopup.setStyle(toolTipStyle);
      toolTipPopup.setNuxDisplayTime(toolTipDisplayTime);
      toolTipPopup.show();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  private int measureButtonWidth(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i = measureTextWidth(paramString);
      int j = getCompoundPaddingLeft();
      int k = getCompoundDrawablePadding();
      int m = getCompoundPaddingRight();
      return j + k + i + m;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
    return 0;
  }
  
  private void parseLoginButtonAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      toolTipMode = ToolTipMode.DEFAULT;
      paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_login_view, paramInt1, paramInt2);
      try
      {
        confirmLogout = paramAttributeSet.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
        loginText = paramAttributeSet.getString(R.styleable.com_facebook_login_view_com_facebook_login_text);
        logoutText = paramAttributeSet.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text);
        toolTipMode = ToolTipMode.fromInt(paramAttributeSet.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, ToolTipMode.DEFAULT.getValue()));
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
  
  private void setButtonText()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Resources localResources = getResources();
      Object localObject;
      if ((!isInEditMode()) && (AccessToken.isCurrentAccessTokenActive()))
      {
        localObject = logoutText;
        if (localObject == null) {
          localObject = localResources.getString(R.string.com_facebook_loginview_log_out_button);
        }
        setText((CharSequence)localObject);
      }
      else
      {
        localObject = loginText;
        if (localObject != null)
        {
          setText((CharSequence)localObject);
        }
        else
        {
          String str = localResources.getString(R.string.com_facebook_loginview_log_in_button_continue);
          int i = getWidth();
          localObject = str;
          if (i != 0)
          {
            localObject = str;
            if (measureButtonWidth(str) > i) {
              localObject = localResources.getString(R.string.com_facebook_loginview_log_in_button);
            }
          }
          setText((CharSequence)localObject);
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  /* Error */
  private void showToolTipPerSettings(FetchedAppSettings paramFetchedAppSettings)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 125	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: ifnull +34 -> 43
    //   12: aload_1
    //   13: invokevirtual 313	com/facebook/internal/FetchedAppSettings:getNuxEnabled	()Z
    //   16: ifeq +27 -> 43
    //   19: aload_0
    //   20: invokevirtual 316	android/view/View:getVisibility	()I
    //   23: ifne +20 -> 43
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual 319	com/facebook/internal/FetchedAppSettings:getNuxContent	()Ljava/lang/String;
    //   31: invokespecial 159	com/facebook/login/widget/LoginButton:displayToolTip	(Ljava/lang/String;)V
    //   34: goto +9 -> 43
    //   37: astore_1
    //   38: aload_1
    //   39: aload_0
    //   40: invokestatic 188	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   43: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	LoginButton
    //   0	44	1	paramFetchedAppSettings	FetchedAppSettings
    // Exception table:
    //   from	to	target	type
    //   12	34	37	finally
  }
  
  public void clearPermissions()
  {
    properties.clearPermissions();
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
      setInternalOnClickListener(getNewLoginClickListener());
      parseLoginButtonAttributes(paramContext, paramAttributeSet, paramInt1, paramInt2);
      if (isInEditMode())
      {
        setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
        loginText = "Continue with Facebook";
      }
      else
      {
        paramContext = new com/facebook/login/widget/LoginButton$2;
        paramContext.<init>(this);
        accessTokenTracker = paramContext;
      }
      setButtonText();
      setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), R.drawable.com_facebook_button_icon), null, null, null);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  public void dismissToolTip()
  {
    ToolTipPopup localToolTipPopup = toolTipPopup;
    if (localToolTipPopup != null)
    {
      localToolTipPopup.dismiss();
      toolTipPopup = null;
    }
  }
  
  public String getAuthType()
  {
    return properties.getAuthType();
  }
  
  public DefaultAudience getDefaultAudience()
  {
    return properties.getDefaultAudience();
  }
  
  public int getDefaultRequestCode()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  public int getDefaultStyleResource()
  {
    return R.style.com_facebook_loginview_default_style;
  }
  
  public LoginBehavior getLoginBehavior()
  {
    return properties.getLoginBehavior();
  }
  
  public LoginManager getLoginManager()
  {
    if (loginManager == null) {
      loginManager = LoginManager.getInstance();
    }
    return loginManager;
  }
  
  public LoginClickListener getNewLoginClickListener()
  {
    return new LoginClickListener();
  }
  
  public List<String> getPermissions()
  {
    return properties.getPermissions();
  }
  
  public long getToolTipDisplayTime()
  {
    return toolTipDisplayTime;
  }
  
  public ToolTipMode getToolTipMode()
  {
    return toolTipMode;
  }
  
  public void onAttachedToWindow()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onAttachedToWindow();
      AccessTokenTracker localAccessTokenTracker = accessTokenTracker;
      if ((localAccessTokenTracker != null) && (!localAccessTokenTracker.isTracking()))
      {
        accessTokenTracker.startTracking();
        setButtonText();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void onDetachedFromWindow()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onDetachedFromWindow();
      AccessTokenTracker localAccessTokenTracker = accessTokenTracker;
      if (localAccessTokenTracker != null) {
        localAccessTokenTracker.stopTracking();
      }
      dismissToolTip();
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
      super.onDraw(paramCanvas);
      if ((!toolTipChecked) && (!isInEditMode()))
      {
        toolTipChecked = true;
        checkToolTipSettings();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCanvas, this);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      setButtonText();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject = getPaint().getFontMetrics();
      int i = getCompoundPaddingTop();
      paramInt2 = (int)Math.ceil(Math.abs(top) + Math.abs(bottom));
      int j = getCompoundPaddingBottom();
      Resources localResources = getResources();
      String str = loginText;
      localObject = str;
      if (str == null)
      {
        localObject = localResources.getString(R.string.com_facebook_loginview_log_in_button_continue);
        k = measureButtonWidth((String)localObject);
        if (View.resolveSize(k, paramInt1) < k) {
          localObject = localResources.getString(R.string.com_facebook_loginview_log_in_button);
        }
      }
      int k = measureButtonWidth((String)localObject);
      str = logoutText;
      localObject = str;
      if (str == null) {
        localObject = localResources.getString(R.string.com_facebook_loginview_log_out_button);
      }
      setMeasuredDimension(View.resolveSize(Math.max(k, measureButtonWidth((String)localObject)), paramInt1), i + paramInt2 + j);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      super.onVisibilityChanged(paramView, paramInt);
      if (paramInt != 0) {
        dismissToolTip();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<LoginResult> paramFacebookCallback)
  {
    getLoginManager().registerCallback(paramCallbackManager, paramFacebookCallback);
  }
  
  public void setAuthType(String paramString)
  {
    properties.setAuthType(paramString);
  }
  
  public void setDefaultAudience(DefaultAudience paramDefaultAudience)
  {
    properties.setDefaultAudience(paramDefaultAudience);
  }
  
  public void setLoginBehavior(LoginBehavior paramLoginBehavior)
  {
    properties.setLoginBehavior(paramLoginBehavior);
  }
  
  public void setLoginManager(LoginManager paramLoginManager)
  {
    loginManager = paramLoginManager;
  }
  
  public void setLoginText(String paramString)
  {
    loginText = paramString;
    setButtonText();
  }
  
  public void setLogoutText(String paramString)
  {
    logoutText = paramString;
    setButtonText();
  }
  
  public void setPermissions(List<String> paramList)
  {
    properties.setPermissions(paramList);
  }
  
  public void setPermissions(String... paramVarArgs)
  {
    properties.setPermissions(Arrays.asList(paramVarArgs));
  }
  
  public void setProperties(LoginButtonProperties paramLoginButtonProperties)
  {
    properties = paramLoginButtonProperties;
  }
  
  public void setPublishPermissions(List<String> paramList)
  {
    properties.setPermissions(paramList);
  }
  
  public void setPublishPermissions(String... paramVarArgs)
  {
    properties.setPermissions(Arrays.asList(paramVarArgs));
  }
  
  public void setReadPermissions(List<String> paramList)
  {
    properties.setPermissions(paramList);
  }
  
  public void setReadPermissions(String... paramVarArgs)
  {
    properties.setPermissions(Arrays.asList(paramVarArgs));
  }
  
  public void setToolTipDisplayTime(long paramLong)
  {
    toolTipDisplayTime = paramLong;
  }
  
  public void setToolTipMode(ToolTipMode paramToolTipMode)
  {
    toolTipMode = paramToolTipMode;
  }
  
  public void setToolTipStyle(ToolTipPopup.Style paramStyle)
  {
    toolTipStyle = paramStyle;
  }
  
  public void unregisterCallback(CallbackManager paramCallbackManager)
  {
    getLoginManager().unregisterCallback(paramCallbackManager);
  }
  
  public static class LoginButtonProperties
  {
    private String authType = "rerequest";
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private List<String> permissions = Collections.emptyList();
    
    public void clearPermissions()
    {
      permissions = null;
    }
    
    public String getAuthType()
    {
      return authType;
    }
    
    public DefaultAudience getDefaultAudience()
    {
      return defaultAudience;
    }
    
    public LoginBehavior getLoginBehavior()
    {
      return loginBehavior;
    }
    
    public List<String> getPermissions()
    {
      return permissions;
    }
    
    public void setAuthType(String paramString)
    {
      authType = paramString;
    }
    
    public void setDefaultAudience(DefaultAudience paramDefaultAudience)
    {
      defaultAudience = paramDefaultAudience;
    }
    
    public void setLoginBehavior(LoginBehavior paramLoginBehavior)
    {
      loginBehavior = paramLoginBehavior;
    }
    
    public void setPermissions(List<String> paramList)
    {
      permissions = paramList;
    }
  }
  
  public class LoginClickListener
    implements View.OnClickListener
  {
    public LoginClickListener() {}
    
    public LoginManager getLoginManager()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return null;
      }
      try
      {
        LoginManager localLoginManager = LoginManager.getInstance();
        localLoginManager.setDefaultAudience(getDefaultAudience());
        localLoginManager.setLoginBehavior(getLoginBehavior());
        localLoginManager.setAuthType(getAuthType());
        return localLoginManager;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
      return null;
    }
    
    public void onClick(View paramView)
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        LoginButton.access$300(LoginButton.this, paramView);
        AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
        if (AccessToken.isCurrentAccessTokenActive()) {
          performLogout(getContext());
        } else {
          performLogin();
        }
        paramView = new com/facebook/appevents/InternalAppEventsLogger;
        paramView.<init>(getContext());
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        int i = 0;
        if (localAccessToken != null) {
          j = 0;
        } else {
          j = 1;
        }
        localBundle.putInt("logging_in", j);
        int j = i;
        if (AccessToken.isCurrentAccessTokenActive()) {
          j = 1;
        }
        localBundle.putInt("access_token_expired", j);
        paramView.logEventImplicitly(LoginButton.access$400(LoginButton.this), localBundle);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramView, this);
      }
    }
    
    public void performLogin()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        LoginManager localLoginManager = getLoginManager();
        if (getFragment() != null) {
          localLoginManager.logIn(getFragment(), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(LoginButton.this)));
        } else if (getNativeFragment() != null) {
          localLoginManager.logIn(getNativeFragment(), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(LoginButton.this)));
        } else {
          localLoginManager.logIn(LoginButton.access$700(LoginButton.this), LoginButton.LoginButtonProperties.access$600(LoginButton.access$500(LoginButton.this)));
        }
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
    
    public void performLogout(Context paramContext)
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        LoginManager localLoginManager = getLoginManager();
        if (LoginButton.access$800(LoginButton.this))
        {
          String str1 = getResources().getString(R.string.com_facebook_loginview_log_out_action);
          String str2 = getResources().getString(R.string.com_facebook_loginview_cancel_action);
          Object localObject = Profile.getCurrentProfile();
          if ((localObject != null) && (((Profile)localObject).getName() != null)) {
            localObject = String.format(getResources().getString(R.string.com_facebook_loginview_logged_in_as), new Object[] { ((Profile)localObject).getName() });
          } else {
            localObject = getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
          }
          AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
          localBuilder.<init>(paramContext);
          paramContext = localBuilder.setMessage((CharSequence)localObject).setCancelable(true);
          localObject = new com/facebook/login/widget/LoginButton$LoginClickListener$1;
          ((1)localObject).<init>(this, localLoginManager);
          paramContext.setPositiveButton(str1, (DialogInterface.OnClickListener)localObject).setNegativeButton(str2, null);
          localBuilder.create().show();
        }
        else
        {
          localLoginManager.logOut();
        }
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramContext, this);
      }
    }
  }
  
  public static enum ToolTipMode
  {
    public static ToolTipMode DEFAULT;
    private int intValue;
    private String stringValue;
    
    static
    {
      ToolTipMode localToolTipMode1 = new ToolTipMode("AUTOMATIC", 0, "automatic", 0);
      AUTOMATIC = localToolTipMode1;
      ToolTipMode localToolTipMode2 = new ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
      DISPLAY_ALWAYS = localToolTipMode2;
      ToolTipMode localToolTipMode3 = new ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
      NEVER_DISPLAY = localToolTipMode3;
      $VALUES = new ToolTipMode[] { localToolTipMode1, localToolTipMode2, localToolTipMode3 };
      DEFAULT = localToolTipMode1;
    }
    
    private ToolTipMode(String paramString, int paramInt)
    {
      stringValue = paramString;
      intValue = paramInt;
    }
    
    public static ToolTipMode fromInt(int paramInt)
    {
      for (ToolTipMode localToolTipMode : ) {
        if (localToolTipMode.getValue() == paramInt) {
          return localToolTipMode;
        }
      }
      return null;
    }
    
    public int getValue()
    {
      return intValue;
    }
    
    public String toString()
    {
      return stringValue;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.LoginButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */