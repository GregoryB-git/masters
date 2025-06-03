package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.b;
import androidx.appcompat.app.b.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.CreateWindowCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsAlertCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsBeforeUnloadCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsConfirmCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsPromptCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.PermissionRequestCallback;
import g;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import v.a;

public class InAppWebViewChromeClient
  extends WebChromeClient
  implements PluginRegistry.ActivityResultListener, ActivityResultListener
{
  public static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
  public static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
  public static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
  public static final String LOG_TAG = "IABWebChromeClient";
  private static final int PICKER = 1;
  private static final int PICKER_LEGACY = 3;
  public final String DEFAULT_MIME_TYPES = "*/*";
  public final Map<DialogInterface, JsResult> dialogs = new HashMap();
  private ValueCallback<Uri[]> filePathCallback;
  private ValueCallback<Uri> filePathCallbackLegacy;
  private Uri imageOutputFileUri;
  private InAppBrowserDelegate inAppBrowserDelegate;
  public InAppWebView inAppWebView;
  private View mCustomView;
  private WebChromeClient.CustomViewCallback mCustomViewCallback;
  private int mOriginalOrientation;
  private int mOriginalSystemUiVisibility;
  public InAppWebViewFlutterPlugin plugin;
  private Uri videoOutputFileUri;
  
  public InAppWebViewChromeClient(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, InAppWebView paramInAppWebView, InAppBrowserDelegate paramInAppBrowserDelegate)
  {
    plugin = paramInAppWebViewFlutterPlugin;
    inAppWebView = paramInAppWebView;
    inAppBrowserDelegate = paramInAppBrowserDelegate;
    if (paramInAppBrowserDelegate != null) {
      paramInAppBrowserDelegate.getActivityResultListeners().add(this);
    }
    paramInAppWebViewFlutterPlugin = activityPluginBinding;
    if (paramInAppWebViewFlutterPlugin != null) {
      paramInAppWebViewFlutterPlugin.addActivityResultListener(this);
    }
  }
  
  private Boolean acceptsAny(String[] paramArrayOfString)
  {
    if (isArrayEmpty(paramArrayOfString).booleanValue()) {
      return Boolean.TRUE;
    }
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfString[j].equals("*/*")) {
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }
  
  private Boolean acceptsImages(String paramString)
  {
    String str = paramString;
    if (paramString.matches("\\.\\w+")) {
      str = getMimeTypeFromExtension(paramString.replace(".", ""));
    }
    boolean bool;
    if ((!str.isEmpty()) && (!str.toLowerCase().contains("image"))) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsImages(String[] paramArrayOfString)
  {
    String[] arrayOfString = getAcceptedMimeType(paramArrayOfString);
    boolean bool;
    if ((!acceptsAny(paramArrayOfString).booleanValue()) && (!arrayContainsString(arrayOfString, "image").booleanValue())) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsVideo(String paramString)
  {
    String str = paramString;
    if (paramString.matches("\\.\\w+")) {
      str = getMimeTypeFromExtension(paramString.replace(".", ""));
    }
    boolean bool;
    if ((!str.isEmpty()) && (!str.toLowerCase().contains("video"))) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private Boolean acceptsVideo(String[] paramArrayOfString)
  {
    String[] arrayOfString = getAcceptedMimeType(paramArrayOfString);
    boolean bool;
    if ((!acceptsAny(paramArrayOfString).booleanValue()) && (!arrayContainsString(arrayOfString, "video").booleanValue())) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private Boolean arrayContainsString(String[] paramArrayOfString, String paramString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      if ((str != null) && (str.contains(paramString))) {
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }
  
  private String[] getAcceptedMimeType(String[] paramArrayOfString)
  {
    if (isArrayEmpty(paramArrayOfString).booleanValue()) {
      return new String[] { "*/*" };
    }
    String[] arrayOfString = new String[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i];
      if (str.matches("\\.\\w+")) {
        arrayOfString[i] = getMimeTypeFromExtension(str.replace(".", ""));
      } else {
        arrayOfString[i] = str;
      }
    }
    return arrayOfString;
  }
  
  private Activity getActivity()
  {
    Object localObject = inAppBrowserDelegate;
    if (localObject != null) {
      return ((InAppBrowserDelegate)localObject).getActivity();
    }
    localObject = plugin;
    if (localObject != null) {
      return activity;
    }
    return null;
  }
  
  private File getCapturedFile(String paramString)
  {
    boolean bool = paramString.equals("android.media.action.IMAGE_CAPTURE");
    Object localObject = "";
    String str;
    if (bool)
    {
      paramString = Environment.DIRECTORY_PICTURES;
      paramString = "image";
      str = ".jpg";
    }
    else if (paramString.equals("android.media.action.VIDEO_CAPTURE"))
    {
      paramString = Environment.DIRECTORY_MOVIES;
      paramString = "video";
      str = ".mp4";
    }
    else
    {
      str = "";
      paramString = (String)localObject;
    }
    localObject = getActivity();
    if (localObject == null) {
      return null;
    }
    return File.createTempFile(paramString, str, ((Context)localObject).getApplicationContext().getExternalFilesDir(null));
  }
  
  private Uri getCapturedMediaFile()
  {
    Uri localUri = imageOutputFileUri;
    if ((localUri != null) && (isFileNotEmpty(localUri))) {
      return imageOutputFileUri;
    }
    localUri = videoOutputFileUri;
    if ((localUri != null) && (isFileNotEmpty(localUri))) {
      return videoOutputFileUri;
    }
    return null;
  }
  
  private Intent getFileChooserIntent(String paramString)
  {
    String str;
    if (paramString.isEmpty()) {
      str = "*/*";
    } else {
      str = paramString;
    }
    if (paramString.matches("\\.\\w+")) {
      str = getMimeTypeFromExtension(paramString.replace(".", ""));
    }
    paramString = new Intent("android.intent.action.GET_CONTENT");
    paramString.addCategory("android.intent.category.OPENABLE");
    paramString.setType(str);
    return paramString;
  }
  
  private Intent getFileChooserIntent(String[] paramArrayOfString, boolean paramBoolean)
  {
    Intent localIntent = new Intent("android.intent.action.GET_CONTENT");
    localIntent.addCategory("android.intent.category.OPENABLE");
    localIntent.setType("*/*");
    localIntent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(paramArrayOfString));
    localIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", paramBoolean);
    return localIntent;
  }
  
  private String getMimeTypeFromExtension(String paramString)
  {
    if (paramString != null) {
      paramString = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  private Uri getOutputUri(String paramString)
  {
    try
    {
      paramString = getCapturedFile(paramString);
    }
    catch (IOException paramString)
    {
      Log.e("IABWebChromeClient", "Error occurred while creating the File", paramString);
      paramString = null;
    }
    if (paramString == null) {
      return null;
    }
    Activity localActivity = getActivity();
    if (localActivity == null) {
      return null;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(localActivity.getApplicationContext().getPackageName());
    ((StringBuilder)localObject).append(".");
    ((StringBuilder)localObject).append("flutter_inappwebview_android.fileprovider");
    localObject = ((StringBuilder)localObject).toString();
    try
    {
      paramString = v.b.getUriForFile(localActivity.getApplicationContext(), (String)localObject, paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      Log.e("IABWebChromeClient", "", paramString);
    }
    return null;
  }
  
  private Intent getPhotoIntent()
  {
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    Uri localUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
    imageOutputFileUri = localUri;
    localIntent.putExtra("output", localUri);
    return localIntent;
  }
  
  private Uri[] getSelectedFiles(Intent paramIntent, int paramInt)
  {
    Uri[] arrayOfUri = null;
    if ((paramIntent != null) && (paramIntent.getData() != null))
    {
      if (paramInt == -1) {
        return WebChromeClient.FileChooserParams.parseResult(paramInt, paramIntent);
      }
      return null;
    }
    paramInt = 0;
    if ((paramIntent != null) && (paramIntent.getClipData() != null))
    {
      int i = paramIntent.getClipData().getItemCount();
      arrayOfUri = new Uri[i];
      while (paramInt < i)
      {
        arrayOfUri[paramInt] = paramIntent.getClipData().getItemAt(paramInt).getUri();
        paramInt++;
      }
      return arrayOfUri;
    }
    Uri localUri = getCapturedMediaFile();
    paramIntent = arrayOfUri;
    if (localUri != null)
    {
      paramIntent = new Uri[1];
      paramIntent[0] = localUri;
    }
    return paramIntent;
  }
  
  private Intent getVideoIntent()
  {
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    Uri localUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
    videoOutputFileUri = localUri;
    localIntent.putExtra("output", localUri);
    return localIntent;
  }
  
  private Boolean isArrayEmpty(String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    boolean bool1 = false;
    boolean bool2;
    if (i != 0)
    {
      bool2 = bool1;
      if (paramArrayOfString.length == 1)
      {
        bool2 = bool1;
        if (paramArrayOfString[0].length() != 0) {}
      }
    }
    else
    {
      bool2 = true;
    }
    return Boolean.valueOf(bool2);
  }
  
  private boolean isFileNotEmpty(Uri paramUri)
  {
    Activity localActivity = getActivity();
    boolean bool = false;
    if (localActivity == null) {
      return false;
    }
    try
    {
      paramUri = localActivity.getContentResolver().openAssetFileDescriptor(paramUri, "r");
      long l = paramUri.getLength();
      paramUri.close();
      if (l > 0L) {
        bool = true;
      }
    }
    catch (IOException paramUri)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public void createAlertDialog(String paramString1, final JsResult paramJsResult, String paramString2, String paramString3)
  {
    Object localObject = paramString1;
    if (paramString2 != null)
    {
      localObject = paramString1;
      if (!paramString2.isEmpty()) {
        localObject = paramString2;
      }
    }
    paramString1 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsResult.confirm();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString2 = getActivity();
    if (paramString2 == null) {
      return;
    }
    paramString2 = new b.a(paramString2, 2131951910);
    a.f = ((CharSequence)localObject);
    if ((paramString3 != null) && (!paramString3.isEmpty()))
    {
      localObject = a;
      g = paramString3;
      h = paramString1;
    }
    else
    {
      paramString2.setPositiveButton(17039370, paramString1);
    }
    paramString1 = new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        paramJsResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    a.k = paramString1;
    paramString1 = paramString2.create();
    dialogs.put(paramString1, paramJsResult);
    paramString1.show();
  }
  
  public void createBeforeUnloadDialog(String paramString1, final JsResult paramJsResult, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = paramString1;
    if (paramString2 != null)
    {
      localObject = paramString1;
      if (!paramString2.isEmpty()) {
        localObject = paramString2;
      }
    }
    DialogInterface.OnClickListener local13 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsResult.confirm();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString2 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString1 = getActivity();
    if (paramString1 == null) {
      return;
    }
    paramString1 = new b.a(paramString1, 2131951910);
    a.f = ((CharSequence)localObject);
    if ((paramString3 != null) && (!paramString3.isEmpty()))
    {
      localObject = a;
      g = paramString3;
      h = local13;
    }
    else
    {
      paramString1.setPositiveButton(17039370, local13);
    }
    if ((paramString4 != null) && (!paramString4.isEmpty()))
    {
      paramString3 = a;
      i = paramString4;
      j = paramString2;
    }
    else
    {
      paramString1.setNegativeButton(17039360, paramString2);
    }
    paramString2 = new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        paramJsResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    a.k = paramString2;
    paramString1 = paramString1.create();
    dialogs.put(paramString1, paramJsResult);
    paramString1.show();
  }
  
  public void createConfirmDialog(String paramString1, final JsResult paramJsResult, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = paramString1;
    if (paramString2 != null)
    {
      localObject = paramString1;
      if (!paramString2.isEmpty()) {
        localObject = paramString2;
      }
    }
    DialogInterface.OnClickListener local5 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsResult.confirm();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString1 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString2 = getActivity();
    if (paramString2 == null) {
      return;
    }
    paramString2 = new b.a(paramString2, 2131951910);
    a.f = ((CharSequence)localObject);
    if ((paramString3 != null) && (!paramString3.isEmpty()))
    {
      localObject = a;
      g = paramString3;
      h = local5;
    }
    else
    {
      paramString2.setPositiveButton(17039370, local5);
    }
    if ((paramString4 != null) && (!paramString4.isEmpty()))
    {
      paramString3 = a;
      i = paramString4;
      j = paramString1;
    }
    else
    {
      paramString2.setNegativeButton(17039360, paramString1);
    }
    paramString1 = new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        paramJsResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    a.k = paramString1;
    paramString1 = paramString2.create();
    dialogs.put(paramString1, paramJsResult);
    paramString1.show();
  }
  
  public void createPromptDialog(WebView paramWebView, String paramString1, String paramString2, final JsPromptResult paramJsPromptResult, String paramString3, String paramString4, final String paramString5, String paramString6, String paramString7)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramWebView.getContext());
    final EditText localEditText = new EditText(paramWebView.getContext());
    localEditText.setMaxLines(1);
    paramWebView = paramString2;
    if (paramString4 != null)
    {
      paramWebView = paramString2;
      if (!paramString4.isEmpty()) {
        paramWebView = paramString4;
      }
    }
    localEditText.setText(paramWebView);
    localEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    localFrameLayout.setPaddingRelative(45, 15, 45, 0);
    localFrameLayout.addView(localEditText);
    paramWebView = paramString1;
    if (paramString3 != null)
    {
      paramWebView = paramString1;
      if (!paramString3.isEmpty()) {
        paramWebView = paramString3;
      }
    }
    paramString3 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Object localObject = localEditText.getText().toString();
        JsPromptResult localJsPromptResult = paramJsPromptResult;
        String str = paramString5;
        if (str != null) {
          localObject = str;
        }
        localJsPromptResult.confirm((String)localObject);
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString1 = new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramJsPromptResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    paramString2 = getActivity();
    if (paramString2 == null) {
      return;
    }
    paramString2 = new b.a(paramString2, 2131951910);
    a.f = paramWebView;
    if ((paramString7 != null) && (!paramString7.isEmpty()))
    {
      paramWebView = a;
      g = paramString7;
      h = paramString3;
    }
    else
    {
      paramString2.setPositiveButton(17039370, paramString3);
    }
    if ((paramString6 != null) && (!paramString6.isEmpty()))
    {
      paramWebView = a;
      i = paramString6;
      j = paramString1;
    }
    else
    {
      paramString2.setNegativeButton(17039360, paramString1);
    }
    paramWebView = new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        paramJsPromptResult.cancel();
        paramAnonymousDialogInterface.dismiss();
        this$0.dialogs.remove(paramAnonymousDialogInterface);
      }
    };
    a.k = paramWebView;
    paramWebView = paramString2.create();
    paramString1 = f;
    h = localFrameLayout;
    i = 0;
    j = false;
    dialogs.put(paramWebView, paramJsPromptResult);
    paramWebView.show();
  }
  
  public void dispose()
  {
    Iterator localIterator = dialogs.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      ((JsResult)((Map.Entry)localObject).getValue()).cancel();
      ((DialogInterface)((Map.Entry)localObject).getKey()).dismiss();
    }
    dialogs.clear();
    Object localObject = plugin;
    if (localObject != null)
    {
      localObject = activityPluginBinding;
      if (localObject != null) {
        ((ActivityPluginBinding)localObject).removeActivityResultListener(this);
      }
    }
    localObject = inAppBrowserDelegate;
    if (localObject != null)
    {
      ((InAppBrowserDelegate)localObject).getActivityResultListeners().clear();
      inAppBrowserDelegate = null;
    }
    filePathCallbackLegacy = null;
    filePathCallback = null;
    videoOutputFileUri = null;
    imageOutputFileUri = null;
    inAppWebView = null;
    plugin = null;
  }
  
  public Bitmap getDefaultVideoPoster()
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = customSettings.defaultVideoPoster;
      if (localObject != null)
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        inMutable = true;
        return BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length, localOptions);
      }
    }
    return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
  }
  
  public ViewGroup getRootView()
  {
    Activity localActivity = getActivity();
    if (localActivity == null) {
      return null;
    }
    return (ViewGroup)localActivity.findViewById(16908290);
  }
  
  public boolean needsCameraPermission()
  {
    Activity localActivity = getActivity();
    boolean bool = true;
    if (localActivity == null) {
      return true;
    }
    PackageManager localPackageManager = localActivity.getPackageManager();
    try
    {
      if (Arrays.asList(getPackageInfogetApplicationContextgetPackageName4096requestedPermissions).contains("android.permission.CAMERA"))
      {
        int i = a.checkSelfPermission(localActivity, "android.permission.CAMERA");
        if (i != 0) {}
      }
      else
      {
        bool = false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((filePathCallback == null) && (filePathCallbackLegacy == null)) {
      return true;
    }
    ValueCallback localValueCallback;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 3) {
        break label106;
      }
      if (paramInt2 == -1)
      {
        if (paramIntent != null) {
          paramIntent = paramIntent.getData();
        } else {
          paramIntent = getCapturedMediaFile();
        }
      }
      else {
        paramIntent = null;
      }
      localValueCallback = filePathCallbackLegacy;
      if (localValueCallback == null) {
        break label106;
      }
    }
    else
    {
      if (paramInt2 == -1) {
        paramIntent = getSelectedFiles(paramIntent, paramInt2);
      } else {
        paramIntent = null;
      }
      localValueCallback = filePathCallback;
      if (localValueCallback == null) {
        break label106;
      }
    }
    localValueCallback.onReceiveValue(paramIntent);
    label106:
    filePathCallback = null;
    filePathCallbackLegacy = null;
    imageOutputFileUri = null;
    videoOutputFileUri = null;
    return true;
  }
  
  public void onCloseWindow(WebView paramWebView)
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((WebViewChannelDelegate)localObject).onCloseWindow();
      }
    }
    super.onCloseWindow(paramWebView);
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((WebViewChannelDelegate)localObject).onConsoleMessage(paramConsoleMessage.message(), paramConsoleMessage.messageLevel().ordinal());
      }
    }
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    Object localObject = plugin;
    if (localObject != null)
    {
      localObject = inAppWebViewManager;
      if (localObject != null)
      {
        i = windowAutoincrementId + 1;
        windowAutoincrementId = i;
        break label45;
      }
    }
    final int i = 0;
    label45:
    WebView.HitTestResult localHitTestResult = paramWebView.getHitTestResult();
    String str = localHitTestResult.getExtra();
    localObject = str;
    if (localHitTestResult.getType() == 8)
    {
      localObject = paramWebView.getHandler().obtainMessage();
      paramWebView.requestFocusNodeHref((Message)localObject);
      paramWebView = ((Message)localObject).getData();
      localObject = str;
      if (paramWebView != null)
      {
        paramWebView = paramWebView.getString("url");
        localObject = str;
        if (paramWebView != null)
        {
          localObject = str;
          if (!paramWebView.isEmpty()) {
            localObject = paramWebView;
          }
        }
      }
    }
    paramWebView = new CreateWindowAction(new URLRequest((String)localObject, "GET", null, null), true, paramBoolean2, false, i, paramBoolean1);
    localObject = plugin;
    if (localObject != null)
    {
      localObject = inAppWebViewManager;
      if (localObject != null) {
        windowWebViewMessages.put(Integer.valueOf(i), paramMessage);
      }
    }
    paramMessage = inAppWebView;
    if (paramMessage != null)
    {
      paramMessage = channelDelegate;
      if (paramMessage != null)
      {
        paramMessage.onCreateWindow(paramWebView, new WebViewChannelDelegate.CreateWindowCallback()
        {
          public void defaultBehaviour(Boolean paramAnonymousBoolean)
          {
            paramAnonymousBoolean = plugin;
            if (paramAnonymousBoolean != null)
            {
              paramAnonymousBoolean = inAppWebViewManager;
              if (paramAnonymousBoolean != null) {
                windowWebViewMessages.remove(Integer.valueOf(i));
              }
            }
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
            defaultBehaviour(null);
          }
          
          public boolean nonNullSuccess(Boolean paramAnonymousBoolean)
          {
            return paramAnonymousBoolean.booleanValue() ^ true;
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public void onGeolocationPermissionsHidePrompt()
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((WebViewChannelDelegate)localObject).onGeolocationPermissionsHidePrompt();
      }
    }
  }
  
  public void onGeolocationPermissionsShowPrompt(final String paramString, final GeolocationPermissions.Callback paramCallback)
  {
    paramCallback = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback()
    {
      public void defaultBehaviour(GeolocationPermissionShowPromptResponse paramAnonymousGeolocationPermissionShowPromptResponse)
      {
        paramCallback.invoke(paramString, false, false);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse paramAnonymousGeolocationPermissionShowPromptResponse)
      {
        paramCallback.invoke(paramAnonymousGeolocationPermissionShowPromptResponse.getOrigin(), paramAnonymousGeolocationPermissionShowPromptResponse.isAllow(), paramAnonymousGeolocationPermissionShowPromptResponse.isRetain());
        return false;
      }
    };
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null)
      {
        ((WebViewChannelDelegate)localObject).onGeolocationPermissionsShowPrompt(paramString, paramCallback);
        return;
      }
    }
    paramCallback.defaultBehaviour(null);
  }
  
  public void onHideCustomView()
  {
    Object localObject1 = getActivity();
    if (localObject1 == null) {
      return;
    }
    ViewGroup localViewGroup = getRootView();
    if (localViewGroup == null) {
      return;
    }
    Object localObject2 = mCustomView;
    if (localObject2 != null) {
      ((FrameLayout)localViewGroup).removeView((View)localObject2);
    }
    mCustomView = null;
    localViewGroup.setSystemUiVisibility(mOriginalSystemUiVisibility);
    ((Activity)localObject1).setRequestedOrientation(mOriginalOrientation);
    localObject2 = mCustomViewCallback;
    if (localObject2 != null) {
      ((WebChromeClient.CustomViewCallback)localObject2).onCustomViewHidden();
    }
    mCustomViewCallback = null;
    ((Activity)localObject1).getWindow().clearFlags(512);
    localObject1 = inAppWebView;
    if (localObject1 != null)
    {
      localObject1 = channelDelegate;
      if (localObject1 != null) {
        ((WebViewChannelDelegate)localObject1).onExitFullscreen();
      }
      inAppWebView.setInFullscreen(false);
    }
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, final String paramString2, final JsResult paramJsResult)
  {
    paramWebView = inAppWebView;
    if (paramWebView != null)
    {
      paramWebView = channelDelegate;
      if (paramWebView != null)
      {
        paramWebView.onJsAlert(paramString1, paramString2, null, new WebViewChannelDelegate.JsAlertCallback()
        {
          public void defaultBehaviour(JsAlertResponse paramAnonymousJsAlertResponse)
          {
            String str1 = null;
            String str2;
            if (paramAnonymousJsAlertResponse != null)
            {
              str2 = paramAnonymousJsAlertResponse.getMessage();
              str1 = paramAnonymousJsAlertResponse.getConfirmButtonTitle();
              paramAnonymousJsAlertResponse = str2;
              str2 = str1;
            }
            else
            {
              str2 = null;
              paramAnonymousJsAlertResponse = str1;
            }
            createAlertDialog(paramString2, paramJsResult, paramAnonymousJsAlertResponse, str2);
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
            paramJsResult.cancel();
          }
          
          public boolean nonNullSuccess(JsAlertResponse paramAnonymousJsAlertResponse)
          {
            boolean bool = paramAnonymousJsAlertResponse.isHandledByClient();
            int i = 1;
            if (bool)
            {
              paramAnonymousJsAlertResponse = paramAnonymousJsAlertResponse.getAction();
              if (paramAnonymousJsAlertResponse != null) {
                i = paramAnonymousJsAlertResponse.intValue();
              }
              if (Integer.valueOf(i).intValue() != 0) {
                paramJsResult.cancel();
              } else {
                paramJsResult.confirm();
              }
              return false;
            }
            return true;
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, final String paramString2, final JsResult paramJsResult)
  {
    paramWebView = inAppWebView;
    if (paramWebView != null)
    {
      paramWebView = channelDelegate;
      if (paramWebView != null)
      {
        paramWebView.onJsBeforeUnload(paramString1, paramString2, new WebViewChannelDelegate.JsBeforeUnloadCallback()
        {
          public void defaultBehaviour(JsBeforeUnloadResponse paramAnonymousJsBeforeUnloadResponse)
          {
            String str;
            Object localObject1;
            Object localObject2;
            if (paramAnonymousJsBeforeUnloadResponse != null)
            {
              str = paramAnonymousJsBeforeUnloadResponse.getMessage();
              localObject1 = paramAnonymousJsBeforeUnloadResponse.getConfirmButtonTitle();
              localObject2 = paramAnonymousJsBeforeUnloadResponse.getCancelButtonTitle();
              paramAnonymousJsBeforeUnloadResponse = str;
            }
            else
            {
              str = null;
              paramAnonymousJsBeforeUnloadResponse = str;
              localObject2 = paramAnonymousJsBeforeUnloadResponse;
              localObject1 = paramAnonymousJsBeforeUnloadResponse;
              paramAnonymousJsBeforeUnloadResponse = str;
            }
            createBeforeUnloadDialog(paramString2, paramJsResult, paramAnonymousJsBeforeUnloadResponse, (String)localObject1, (String)localObject2);
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
            paramJsResult.cancel();
          }
          
          public boolean nonNullSuccess(JsBeforeUnloadResponse paramAnonymousJsBeforeUnloadResponse)
          {
            boolean bool = paramAnonymousJsBeforeUnloadResponse.isHandledByClient();
            int i = 1;
            if (bool)
            {
              paramAnonymousJsBeforeUnloadResponse = paramAnonymousJsBeforeUnloadResponse.getAction();
              if (paramAnonymousJsBeforeUnloadResponse != null) {
                i = paramAnonymousJsBeforeUnloadResponse.intValue();
              }
              if (Integer.valueOf(i).intValue() != 0) {
                paramJsResult.cancel();
              } else {
                paramJsResult.confirm();
              }
              return false;
            }
            return true;
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, final String paramString2, final JsResult paramJsResult)
  {
    paramWebView = inAppWebView;
    if (paramWebView != null)
    {
      paramWebView = channelDelegate;
      if (paramWebView != null)
      {
        paramWebView.onJsConfirm(paramString1, paramString2, null, new WebViewChannelDelegate.JsConfirmCallback()
        {
          public void defaultBehaviour(JsConfirmResponse paramAnonymousJsConfirmResponse)
          {
            String str1;
            Object localObject;
            if (paramAnonymousJsConfirmResponse != null)
            {
              str1 = paramAnonymousJsConfirmResponse.getMessage();
              String str2 = paramAnonymousJsConfirmResponse.getConfirmButtonTitle();
              localObject = paramAnonymousJsConfirmResponse.getCancelButtonTitle();
              paramAnonymousJsConfirmResponse = str2;
            }
            else
            {
              str1 = null;
              paramAnonymousJsConfirmResponse = str1;
              localObject = paramAnonymousJsConfirmResponse;
            }
            createConfirmDialog(paramString2, paramJsResult, str1, paramAnonymousJsConfirmResponse, (String)localObject);
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
            paramJsResult.cancel();
          }
          
          public boolean nonNullSuccess(JsConfirmResponse paramAnonymousJsConfirmResponse)
          {
            boolean bool = paramAnonymousJsConfirmResponse.isHandledByClient();
            int i = 1;
            if (bool)
            {
              paramAnonymousJsConfirmResponse = paramAnonymousJsConfirmResponse.getAction();
              if (paramAnonymousJsConfirmResponse != null) {
                i = paramAnonymousJsConfirmResponse.intValue();
              }
              if (Integer.valueOf(i).intValue() != 0) {
                paramJsResult.cancel();
              } else {
                paramJsResult.confirm();
              }
              return false;
            }
            return true;
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public boolean onJsPrompt(final WebView paramWebView, String paramString1, final String paramString2, final String paramString3, final JsPromptResult paramJsPromptResult)
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null)
      {
        ((WebViewChannelDelegate)localObject).onJsPrompt(paramString1, paramString2, paramString3, null, new WebViewChannelDelegate.JsPromptCallback()
        {
          public void defaultBehaviour(JsPromptResponse paramAnonymousJsPromptResponse)
          {
            String str1;
            Object localObject1;
            Object localObject2;
            Object localObject3;
            if (paramAnonymousJsPromptResponse != null)
            {
              str1 = paramAnonymousJsPromptResponse.getMessage();
              String str2 = paramAnonymousJsPromptResponse.getDefaultValue();
              localObject1 = paramAnonymousJsPromptResponse.getValue();
              localObject2 = paramAnonymousJsPromptResponse.getConfirmButtonTitle();
              localObject3 = paramAnonymousJsPromptResponse.getCancelButtonTitle();
              paramAnonymousJsPromptResponse = str2;
            }
            else
            {
              str1 = null;
              paramAnonymousJsPromptResponse = str1;
              localObject1 = paramAnonymousJsPromptResponse;
              localObject3 = localObject1;
              localObject2 = localObject3;
            }
            createPromptDialog(paramWebView, paramString2, paramString3, paramJsPromptResult, str1, paramAnonymousJsPromptResponse, (String)localObject1, (String)localObject3, (String)localObject2);
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
            paramJsPromptResult.cancel();
          }
          
          public boolean nonNullSuccess(JsPromptResponse paramAnonymousJsPromptResponse)
          {
            boolean bool = paramAnonymousJsPromptResponse.isHandledByClient();
            int i = 1;
            if (bool)
            {
              Integer localInteger = paramAnonymousJsPromptResponse.getAction();
              if (localInteger != null) {
                i = localInteger.intValue();
              }
              if (Integer.valueOf(i).intValue() != 0) {
                paramJsPromptResult.cancel();
              } else {
                paramJsPromptResult.confirm(paramAnonymousJsPromptResponse.getValue());
              }
              return false;
            }
            return true;
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public void onPermissionRequest(final PermissionRequest paramPermissionRequest)
  {
    WebViewChannelDelegate.PermissionRequestCallback local18 = new WebViewChannelDelegate.PermissionRequestCallback()
    {
      public void defaultBehaviour(PermissionResponse paramAnonymousPermissionResponse)
      {
        paramPermissionRequest.deny();
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        j.t(paramAnonymousString1, paramAnonymousString2, "IABWebChromeClient");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(PermissionResponse paramAnonymousPermissionResponse)
      {
        Object localObject = paramAnonymousPermissionResponse.getAction();
        if (localObject != null)
        {
          if (((Integer)localObject).intValue() != 1)
          {
            paramPermissionRequest.deny();
          }
          else
          {
            localObject = new String[paramAnonymousPermissionResponse.getResources().size()];
            paramAnonymousPermissionResponse = (String[])paramAnonymousPermissionResponse.getResources().toArray((Object[])localObject);
            paramPermissionRequest.grant(paramAnonymousPermissionResponse);
          }
          return false;
        }
        return true;
      }
    };
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null)
      {
        ((WebViewChannelDelegate)localObject).onPermissionRequest(paramPermissionRequest.getOrigin().toString(), Arrays.asList(paramPermissionRequest.getResources()), null, local18);
        return;
      }
    }
    local18.defaultBehaviour(null);
  }
  
  public void onPermissionRequestCanceled(PermissionRequest paramPermissionRequest)
  {
    Object localObject = inAppWebView;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((WebViewChannelDelegate)localObject).onPermissionRequestCanceled(paramPermissionRequest.getOrigin().toString(), Arrays.asList(paramPermissionRequest.getResources()));
      }
    }
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    Object localObject1 = inAppBrowserDelegate;
    if (localObject1 != null) {
      ((InAppBrowserDelegate)localObject1).didChangeProgress(paramInt);
    }
    localObject1 = (InAppWebView)paramWebView;
    Object localObject2 = inAppWebViewClientCompat;
    if (localObject2 != null)
    {
      ((InAppWebViewClientCompat)localObject2).loadCustomJavaScriptOnPageStarted(paramWebView);
    }
    else
    {
      localObject2 = inAppWebViewClient;
      if (localObject2 != null) {
        ((InAppWebViewClient)localObject2).loadCustomJavaScriptOnPageStarted(paramWebView);
      }
    }
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onProgressChanged(paramInt);
    }
  }
  
  public void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap)
  {
    super.onReceivedIcon(paramWebView, paramBitmap);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    try
    {
      localByteArrayOutputStream.close();
    }
    catch (IOException localIOException)
    {
      Log.e("IABWebChromeClient", "", localIOException);
    }
    paramBitmap.recycle();
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onReceivedIcon(localByteArrayOutputStream.toByteArray());
    }
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    super.onReceivedTitle(paramWebView, paramString);
    InAppBrowserDelegate localInAppBrowserDelegate = inAppBrowserDelegate;
    if (localInAppBrowserDelegate != null) {
      localInAppBrowserDelegate.didChangeTitle(paramString);
    }
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onTitleChanged(paramString);
    }
  }
  
  public void onReceivedTouchIconUrl(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    super.onReceivedTouchIconUrl(paramWebView, paramString, paramBoolean);
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onReceivedTouchIconUrl(paramString, paramBoolean);
    }
  }
  
  public void onRequestFocus(WebView paramWebView)
  {
    paramWebView = inAppWebView;
    if (paramWebView != null)
    {
      paramWebView = channelDelegate;
      if (paramWebView != null) {
        paramWebView.onRequestFocus();
      }
    }
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    if (mCustomView != null)
    {
      onHideCustomView();
      return;
    }
    Activity localActivity = getActivity();
    if (localActivity == null) {
      return;
    }
    ViewGroup localViewGroup = getRootView();
    if (localViewGroup == null) {
      return;
    }
    mCustomView = paramView;
    mOriginalSystemUiVisibility = localViewGroup.getSystemUiVisibility();
    mOriginalOrientation = localActivity.getRequestedOrientation();
    mCustomViewCallback = paramCustomViewCallback;
    paramView = mCustomView;
    if (paramView != null) {
      paramView.setBackgroundColor(-16777216);
    }
    localViewGroup.setSystemUiVisibility(7942);
    localActivity.getWindow().setFlags(512, 512);
    ((FrameLayout)localViewGroup).addView(mCustomView, FULLSCREEN_LAYOUT_PARAMS);
    paramView = inAppWebView;
    if (paramView != null)
    {
      paramView = channelDelegate;
      if (paramView != null) {
        paramView.onEnterFullscreen();
      }
      inAppWebView.setInFullscreen(true);
    }
  }
  
  public boolean onShowFileChooser(WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    paramWebView = paramFileChooserParams.getAcceptTypes();
    int i = paramFileChooserParams.getMode();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return startPickerIntent(paramValueCallback, paramWebView, bool, paramFileChooserParams.isCaptureEnabled());
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback)
  {
    startPickerIntent(paramValueCallback, "", null);
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString)
  {
    startPickerIntent(paramValueCallback, paramString, null);
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    startPickerIntent(paramValueCallback, paramString1, paramString2);
  }
  
  public void startPickerIntent(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    filePathCallbackLegacy = paramValueCallback;
    boolean bool1 = acceptsImages(paramString1).booleanValue();
    boolean bool2 = acceptsVideo(paramString1).booleanValue();
    if ((paramString2 != null) && (!needsCameraPermission()))
    {
      if (bool1)
      {
        paramValueCallback = getPhotoIntent();
        break label64;
      }
      if (bool2)
      {
        paramValueCallback = getVideoIntent();
        break label64;
      }
    }
    paramValueCallback = null;
    label64:
    paramString2 = paramValueCallback;
    if (paramValueCallback == null)
    {
      paramString2 = Intent.createChooser(getFileChooserIntent(paramString1), "");
      paramValueCallback = new ArrayList();
      if (!needsCameraPermission())
      {
        if (bool1) {
          paramValueCallback.add(getPhotoIntent());
        }
        if (bool2) {
          paramValueCallback.add(getVideoIntent());
        }
      }
      paramString2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])paramValueCallback.toArray(new Parcelable[0]));
    }
    paramValueCallback = getActivity();
    if ((paramValueCallback != null) && (paramString2.resolveActivity(paramValueCallback.getPackageManager()) != null)) {
      paramValueCallback.startActivityForResult(paramString2, 3);
    } else {
      Log.d("IABWebChromeClient", "there is no Activity to handle this Intent");
    }
  }
  
  public boolean startPickerIntent(ValueCallback<Uri[]> paramValueCallback, String[] paramArrayOfString, boolean paramBoolean1, boolean paramBoolean2)
  {
    filePathCallback = paramValueCallback;
    boolean bool1 = acceptsImages(paramArrayOfString).booleanValue();
    boolean bool2 = acceptsVideo(paramArrayOfString).booleanValue();
    if ((paramBoolean2) && (!needsCameraPermission()))
    {
      if (bool1)
      {
        paramValueCallback = getPhotoIntent();
        break label65;
      }
      if (bool2)
      {
        paramValueCallback = getVideoIntent();
        break label65;
      }
    }
    paramValueCallback = null;
    label65:
    Object localObject = paramValueCallback;
    if (paramValueCallback == null)
    {
      paramValueCallback = new ArrayList();
      if (!needsCameraPermission())
      {
        if (bool1) {
          paramValueCallback.add(getPhotoIntent());
        }
        if (bool2) {
          paramValueCallback.add(getVideoIntent());
        }
      }
      paramArrayOfString = getFileChooserIntent(paramArrayOfString, paramBoolean1);
      localObject = new Intent("android.intent.action.CHOOSER");
      ((Intent)localObject).putExtra("android.intent.extra.INTENT", paramArrayOfString);
      ((Intent)localObject).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])paramValueCallback.toArray(new Parcelable[0]));
    }
    paramValueCallback = getActivity();
    if ((paramValueCallback != null) && (((Intent)localObject).resolveActivity(paramValueCallback.getPackageManager()) != null)) {
      paramValueCallback.startActivityForResult((Intent)localObject, 1);
    } else {
      Log.d("IABWebChromeClient", "there is no Activity to handle this Intent");
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */