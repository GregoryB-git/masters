package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.common.R.drawable;
import com.facebook.common.R.string;
import com.facebook.common.R.style;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import z2;

public class WebDialog
  extends Dialog
{
  private static final int API_EC_DIALOG_CANCEL = 4201;
  private static final int BACKGROUND_GRAY = -872415232;
  private static final int DEFAULT_THEME = R.style.com_facebook_activity_theme;
  public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
  private static final String DISPLAY_TOUCH = "touch";
  private static final String LOG_TAG = "FacebookSDK.WebDialog";
  private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
  private static final int MAX_PADDING_SCREEN_WIDTH = 800;
  private static final double MIN_SCALE_FACTOR = 0.5D;
  private static final int NO_PADDING_SCREEN_HEIGHT = 800;
  private static final int NO_PADDING_SCREEN_WIDTH = 480;
  private static InitCallback initCallback;
  private static volatile int webDialogTheme;
  private FrameLayout contentFrameLayout;
  private ImageView crossImageView;
  private String expectedRedirectUrl;
  private boolean isDetached;
  private boolean isPageFinished;
  private boolean listenerCalled;
  private OnCompleteListener onCompleteListener;
  private ProgressDialog spinner;
  private UploadStagingResourcesTask uploadTask;
  private String url;
  private WebView webView;
  private WindowManager.LayoutParams windowParams;
  
  public WebDialog(Context paramContext, String paramString)
  {
    this(paramContext, paramString, getWebDialogTheme());
  }
  
  private WebDialog(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, i);
    expectedRedirectUrl = "fbconnect://success";
    listenerCalled = false;
    isDetached = false;
    isPageFinished = false;
    url = paramString;
  }
  
  private WebDialog(Context paramContext, String paramString, Bundle paramBundle, int paramInt, OnCompleteListener paramOnCompleteListener)
  {
    super(paramContext, i);
    String str = "fbconnect://success";
    expectedRedirectUrl = "fbconnect://success";
    listenerCalled = false;
    isDetached = false;
    isPageFinished = false;
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = str;
    if (Utility.isChromeOS(paramContext)) {
      paramBundle = "fbconnect://chrome_os_success";
    }
    expectedRedirectUrl = paramBundle;
    localBundle.putString("redirect_uri", paramBundle);
    localBundle.putString("display", "touch");
    localBundle.putString("client_id", FacebookSdk.getApplicationId());
    localBundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] { FacebookSdk.getSdkVersion() }));
    onCompleteListener = paramOnCompleteListener;
    if ((paramString.equals("share")) && (localBundle.containsKey("media")))
    {
      uploadTask = new UploadStagingResourcesTask(paramString, localBundle);
    }
    else
    {
      paramBundle = ServerProtocol.getDialogAuthority();
      paramContext = new StringBuilder();
      paramContext.append(FacebookSdk.getGraphApiVersion());
      paramContext.append("/");
      paramContext.append("dialog/");
      paramContext.append(paramString);
      url = Utility.buildUri(paramBundle, paramContext.toString(), localBundle).toString();
    }
  }
  
  private void createCrossImage()
  {
    Object localObject = new ImageView(getContext());
    crossImageView = ((ImageView)localObject);
    ((View)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          cancel();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    });
    localObject = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
    crossImageView.setImageDrawable((Drawable)localObject);
    crossImageView.setVisibility(4);
  }
  
  private int getScaledSize(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    int i = (int)(paramInt1 / paramFloat);
    double d = 0.5D;
    if (i <= paramInt2) {
      d = 1.0D;
    } else if (i < paramInt3) {
      d = 0.5D + (paramInt3 - i) / (paramInt3 - paramInt2) * 0.5D;
    }
    return (int)(paramInt1 * d);
  }
  
  public static int getWebDialogTheme()
  {
    Validate.sdkInitialized();
    return webDialogTheme;
  }
  
  public static void initDefaultTheme(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if ((paramContext != null) && (metaData != null) && (webDialogTheme == 0)) {
        setWebDialogTheme(metaData.getInt("com.facebook.sdk.WebDialogTheme"));
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static WebDialog newInstance(Context paramContext, String paramString, Bundle paramBundle, int paramInt, OnCompleteListener paramOnCompleteListener)
  {
    initDefaultTheme(paramContext);
    return new WebDialog(paramContext, paramString, paramBundle, paramInt, paramOnCompleteListener);
  }
  
  public static void setInitCallback(InitCallback paramInitCallback)
  {
    initCallback = paramInitCallback;
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  private void setUpWebView(int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    WebView local3 = new WebView(getContext())
    {
      public void onWindowFocusChanged(boolean paramAnonymousBoolean)
      {
        try
        {
          super.onWindowFocusChanged(paramAnonymousBoolean);
          return;
        }
        catch (NullPointerException localNullPointerException)
        {
          for (;;) {}
        }
      }
    };
    webView = local3;
    InitCallback localInitCallback = initCallback;
    if (localInitCallback != null) {
      localInitCallback.onInit(local3);
    }
    webView.setVerticalScrollBarEnabled(false);
    webView.setHorizontalScrollBarEnabled(false);
    webView.setWebViewClient(new DialogWebViewClient(null));
    webView.getSettings().setJavaScriptEnabled(true);
    webView.loadUrl(url);
    webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    webView.setVisibility(4);
    webView.getSettings().setSavePassword(false);
    webView.getSettings().setSaveFormData(false);
    webView.setFocusable(true);
    webView.setFocusableInTouchMode(true);
    webView.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (!paramAnonymousView.hasFocus()) {
          paramAnonymousView.requestFocus();
        }
        return false;
      }
    });
    localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
    localLinearLayout.addView(webView);
    localLinearLayout.setBackgroundColor(-872415232);
    contentFrameLayout.addView(localLinearLayout);
  }
  
  public static void setWebDialogTheme(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = DEFAULT_THEME;
    }
    webDialogTheme = paramInt;
  }
  
  public void cancel()
  {
    if ((onCompleteListener != null) && (!listenerCalled)) {
      sendErrorToListener(new FacebookOperationCanceledException());
    }
  }
  
  public void dismiss()
  {
    Object localObject = webView;
    if (localObject != null) {
      ((WebView)localObject).stopLoading();
    }
    if (!isDetached)
    {
      localObject = spinner;
      if ((localObject != null) && (((Dialog)localObject).isShowing())) {
        spinner.dismiss();
      }
    }
    super.dismiss();
  }
  
  public OnCompleteListener getOnCompleteListener()
  {
    return onCompleteListener;
  }
  
  public WebView getWebView()
  {
    return webView;
  }
  
  public boolean isListenerCalled()
  {
    return listenerCalled;
  }
  
  public boolean isPageFinished()
  {
    return isPageFinished;
  }
  
  public void onAttachedToWindow()
  {
    isDetached = false;
    if (Utility.mustFixWindowParamsForAutofill(getContext()))
    {
      Object localObject = windowParams;
      if ((localObject != null) && (token == null))
      {
        token = getOwnerActivitygetWindowgetAttributestoken;
        localObject = z2.t("Set token on onAttachedToWindow(): ");
        ((StringBuilder)localObject).append(windowParams.token);
        Utility.logd("FacebookSDK.WebDialog", ((StringBuilder)localObject).toString());
      }
    }
    super.onAttachedToWindow();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new ProgressDialog(getContext());
    spinner = paramBundle;
    paramBundle.requestWindowFeature(1);
    spinner.setMessage(getContext().getString(R.string.com_facebook_loading));
    spinner.setCanceledOnTouchOutside(false);
    spinner.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        cancel();
      }
    });
    requestWindowFeature(1);
    contentFrameLayout = new FrameLayout(getContext());
    resize();
    getWindow().setGravity(17);
    getWindow().setSoftInputMode(16);
    createCrossImage();
    if (url != null) {
      setUpWebView(crossImageView.getDrawable().getIntrinsicWidth() / 2 + 1);
    }
    contentFrameLayout.addView(crossImageView, new ViewGroup.LayoutParams(-2, -2));
    setContentView(contentFrameLayout);
  }
  
  public void onDetachedFromWindow()
  {
    isDetached = true;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      WebView localWebView = webView;
      if ((localWebView != null) && (localWebView.canGoBack()))
      {
        webView.goBack();
        return true;
      }
      cancel();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onStart()
  {
    super.onStart();
    UploadStagingResourcesTask localUploadStagingResourcesTask = uploadTask;
    if ((localUploadStagingResourcesTask != null) && (localUploadStagingResourcesTask.getStatus() == AsyncTask.Status.PENDING))
    {
      uploadTask.execute(new Void[0]);
      spinner.show();
    }
    else
    {
      resize();
    }
  }
  
  public void onStop()
  {
    UploadStagingResourcesTask localUploadStagingResourcesTask = uploadTask;
    if (localUploadStagingResourcesTask != null)
    {
      localUploadStagingResourcesTask.cancel(true);
      spinner.dismiss();
    }
    super.onStop();
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    if (token == null) {
      windowParams = paramLayoutParams;
    }
    super.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public Bundle parseResponseUri(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    paramString = Utility.parseUrlQueryString(localUri.getQuery());
    paramString.putAll(Utility.parseUrlQueryString(localUri.getFragment()));
    return paramString;
  }
  
  public void resize()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int i = widthPixels;
    int j = heightPixels;
    int k;
    if (i < j) {
      k = i;
    } else {
      k = j;
    }
    int m = i;
    if (i < j) {
      m = j;
    }
    j = Math.min(getScaledSize(k, density, 480, 800), widthPixels);
    i = Math.min(getScaledSize(m, density, 800, 1280), heightPixels);
    getWindow().setLayout(j, i);
  }
  
  public void sendErrorToListener(Throwable paramThrowable)
  {
    if ((onCompleteListener != null) && (!listenerCalled))
    {
      listenerCalled = true;
      if ((paramThrowable instanceof FacebookException)) {
        paramThrowable = (FacebookException)paramThrowable;
      } else {
        paramThrowable = new FacebookException(paramThrowable);
      }
      onCompleteListener.onComplete(null, paramThrowable);
      dismiss();
    }
  }
  
  public void sendSuccessToListener(Bundle paramBundle)
  {
    OnCompleteListener localOnCompleteListener = onCompleteListener;
    if ((localOnCompleteListener != null) && (!listenerCalled))
    {
      listenerCalled = true;
      localOnCompleteListener.onComplete(paramBundle, null);
      dismiss();
    }
  }
  
  public void setExpectedRedirectUrl(String paramString)
  {
    expectedRedirectUrl = paramString;
  }
  
  public void setOnCompleteListener(OnCompleteListener paramOnCompleteListener)
  {
    onCompleteListener = paramOnCompleteListener;
  }
  
  public static class Builder
  {
    private AccessToken accessToken;
    private String action;
    private String applicationId;
    private Context context;
    private WebDialog.OnCompleteListener listener;
    private Bundle parameters;
    private int theme;
    
    public Builder(Context paramContext, String paramString, Bundle paramBundle)
    {
      accessToken = AccessToken.getCurrentAccessToken();
      if (!AccessToken.isCurrentAccessTokenActive())
      {
        String str = Utility.getMetadataApplicationId(paramContext);
        if (str != null) {
          applicationId = str;
        } else {
          throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
        }
      }
      finishInit(paramContext, paramString, paramBundle);
    }
    
    public Builder(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    {
      String str = paramString1;
      if (paramString1 == null) {
        str = Utility.getMetadataApplicationId(paramContext);
      }
      Validate.notNullOrEmpty(str, "applicationId");
      applicationId = str;
      finishInit(paramContext, paramString2, paramBundle);
    }
    
    private void finishInit(Context paramContext, String paramString, Bundle paramBundle)
    {
      context = paramContext;
      action = paramString;
      if (paramBundle != null) {
        parameters = paramBundle;
      } else {
        parameters = new Bundle();
      }
    }
    
    public WebDialog build()
    {
      AccessToken localAccessToken = accessToken;
      if (localAccessToken != null)
      {
        parameters.putString("app_id", localAccessToken.getApplicationId());
        parameters.putString("access_token", accessToken.getToken());
      }
      else
      {
        parameters.putString("app_id", applicationId);
      }
      return WebDialog.newInstance(context, action, parameters, theme, listener);
    }
    
    public String getApplicationId()
    {
      return applicationId;
    }
    
    public Context getContext()
    {
      return context;
    }
    
    public WebDialog.OnCompleteListener getListener()
    {
      return listener;
    }
    
    public Bundle getParameters()
    {
      return parameters;
    }
    
    public int getTheme()
    {
      return theme;
    }
    
    public Builder setOnCompleteListener(WebDialog.OnCompleteListener paramOnCompleteListener)
    {
      listener = paramOnCompleteListener;
      return this;
    }
    
    public Builder setTheme(int paramInt)
    {
      theme = paramInt;
      return this;
    }
  }
  
  public class DialogWebViewClient
    extends WebViewClient
  {
    private DialogWebViewClient() {}
    
    public void onPageFinished(WebView paramWebView, String paramString)
    {
      super.onPageFinished(paramWebView, paramString);
      if (!WebDialog.access$200(WebDialog.this)) {
        WebDialog.access$300(WebDialog.this).dismiss();
      }
      WebDialog.access$400(WebDialog.this).setBackgroundColor(0);
      WebDialog.access$500(WebDialog.this).setVisibility(0);
      WebDialog.access$600(WebDialog.this).setVisibility(0);
      WebDialog.access$702(WebDialog.this, true);
    }
    
    public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Webview loading URL: ");
      localStringBuilder.append(paramString);
      Utility.logd("FacebookSDK.WebDialog", localStringBuilder.toString());
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      if (!WebDialog.access$200(WebDialog.this)) {
        WebDialog.access$300(WebDialog.this).show();
      }
    }
    
    public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      sendErrorToListener(new FacebookDialogException(paramString1, paramInt, paramString2));
    }
    
    public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
    {
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      paramSslErrorHandler.cancel();
      sendErrorToListener(new FacebookDialogException(null, -11, null));
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      paramWebView = new StringBuilder();
      paramWebView.append("Redirect URL: ");
      paramWebView.append(paramString);
      Utility.logd("FacebookSDK.WebDialog", paramWebView.toString());
      Bundle localBundle;
      Object localObject;
      if (paramString.startsWith(WebDialog.access$100(WebDialog.this)))
      {
        localBundle = parseResponseUri(paramString);
        paramWebView = localBundle.getString("error");
        paramString = paramWebView;
        if (paramWebView == null) {
          paramString = localBundle.getString("error_type");
        }
        localObject = localBundle.getString("error_msg");
        paramWebView = (WebView)localObject;
        if (localObject == null) {
          paramWebView = localBundle.getString("error_message");
        }
        localObject = paramWebView;
        if (paramWebView == null) {
          localObject = localBundle.getString("error_description");
        }
        paramWebView = localBundle.getString("error_code");
        if (Utility.isNullOrEmpty(paramWebView)) {}
      }
      try
      {
        i = Integer.parseInt(paramWebView);
      }
      catch (NumberFormatException paramWebView)
      {
        int i;
        for (;;) {}
      }
      i = -1;
      if ((Utility.isNullOrEmpty(paramString)) && (Utility.isNullOrEmpty((String)localObject)) && (i == -1))
      {
        sendSuccessToListener(localBundle);
      }
      else if ((paramString != null) && ((paramString.equals("access_denied")) || (paramString.equals("OAuthAccessDeniedException"))))
      {
        cancel();
      }
      else if (i == 4201)
      {
        cancel();
      }
      else
      {
        paramWebView = new FacebookRequestError(i, paramString, (String)localObject);
        sendErrorToListener(new FacebookServiceException(paramWebView, (String)localObject));
      }
      return true;
      if (paramString.startsWith("fbconnect://cancel"))
      {
        cancel();
        return true;
      }
      if (paramString.contains("touch")) {
        return false;
      }
      try
      {
        localObject = getContext();
        paramWebView = new android/content/Intent;
        paramWebView.<init>("android.intent.action.VIEW", Uri.parse(paramString));
        ((Context)localObject).startActivity(paramWebView);
        return true;
      }
      catch (ActivityNotFoundException paramWebView)
      {
        return false;
      }
    }
  }
  
  public static abstract interface InitCallback
  {
    public abstract void onInit(WebView paramWebView);
  }
  
  public static abstract interface OnCompleteListener
  {
    public abstract void onComplete(Bundle paramBundle, FacebookException paramFacebookException);
  }
  
  public class UploadStagingResourcesTask
    extends AsyncTask<Void, Void, String[]>
  {
    private String action;
    private Exception[] exceptions;
    private Bundle parameters;
    
    public UploadStagingResourcesTask(String paramString, Bundle paramBundle)
    {
      action = paramString;
      parameters = paramBundle;
    }
    
    public String[] doInBackground(Void... paramVarArgs)
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return null;
      }
      try
      {
        String[] arrayOfString1 = parameters.getStringArray("media");
        String[] arrayOfString2 = new String[arrayOfString1.length];
        exceptions = new Exception[arrayOfString1.length];
        Object localObject = new java/util/concurrent/CountDownLatch;
        ((CountDownLatch)localObject).<init>(arrayOfString1.length);
        paramVarArgs = new java/util/concurrent/ConcurrentLinkedQueue;
        paramVarArgs.<init>();
        AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
        int i = 0;
        try
        {
          while (i < arrayOfString1.length)
          {
            if (isCancelled())
            {
              localObject = paramVarArgs.iterator();
              while (((Iterator)localObject).hasNext()) {
                ((AsyncTask)((Iterator)localObject).next()).cancel(true);
              }
              return null;
            }
            Uri localUri = Uri.parse(arrayOfString1[i]);
            if (Utility.isWebUri(localUri))
            {
              arrayOfString2[i] = localUri.toString();
              ((CountDownLatch)localObject).countDown();
            }
            else
            {
              GraphRequest.Callback local1 = new com/facebook/internal/WebDialog$UploadStagingResourcesTask$1;
              local1.<init>(this, arrayOfString2, i, (CountDownLatch)localObject);
              paramVarArgs.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(localAccessToken, localUri, local1).executeAsync());
            }
            i++;
          }
          ((CountDownLatch)localObject).await();
          return arrayOfString2;
        }
        catch (Exception localException)
        {
          paramVarArgs = paramVarArgs.iterator();
          while (paramVarArgs.hasNext()) {
            ((AsyncTask)paramVarArgs.next()).cancel(true);
          }
          return null;
        }
        return null;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramVarArgs, this);
      }
    }
    
    public void onPostExecute(String[] paramArrayOfString)
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        WebDialog.access$300(WebDialog.this).dismiss();
        for (localObject2 : exceptions) {
          if (localObject2 != null)
          {
            sendErrorToListener((Throwable)localObject2);
            return;
          }
        }
        if (paramArrayOfString == null)
        {
          ??? = WebDialog.this;
          paramArrayOfString = new com/facebook/FacebookException;
          paramArrayOfString.<init>("Failed to stage photos for web dialog");
          ((WebDialog)???).sendErrorToListener(paramArrayOfString);
          return;
        }
        Object localObject2 = Arrays.asList(paramArrayOfString);
        if (((List)localObject2).contains(null))
        {
          paramArrayOfString = WebDialog.this;
          ??? = new com/facebook/FacebookException;
          ((FacebookException)???).<init>("Failed to stage photos for web dialog");
          paramArrayOfString.sendErrorToListener((Throwable)???);
          return;
        }
        paramArrayOfString = parameters;
        ??? = new org/json/JSONArray;
        ((JSONArray)???).<init>((Collection)localObject2);
        Utility.putJSONValueInBundle(paramArrayOfString, "media", ???);
        ??? = ServerProtocol.getDialogAuthority();
        paramArrayOfString = new java/lang/StringBuilder;
        paramArrayOfString.<init>();
        paramArrayOfString.append(FacebookSdk.getGraphApiVersion());
        paramArrayOfString.append("/");
        paramArrayOfString.append("dialog/");
        paramArrayOfString.append(action);
        paramArrayOfString = Utility.buildUri((String)???, paramArrayOfString.toString(), parameters);
        WebDialog.access$902(WebDialog.this, paramArrayOfString.toString());
        ??? = WebDialog.access$600(WebDialog.this).getDrawable().getIntrinsicWidth();
        WebDialog.access$1000(WebDialog.this, ??? / 2 + 1);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramArrayOfString, this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WebDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */