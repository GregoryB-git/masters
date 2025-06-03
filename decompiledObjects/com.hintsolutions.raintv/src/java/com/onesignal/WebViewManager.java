/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Base64
 *  android.webkit.JavascriptInterface
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.InAppMessageView;
import com.onesignal.OSInAppMessageContent;
import com.onesignal.OSInAppMessageInternal;
import com.onesignal.OSUtils;
import com.onesignal.OSViewUtils;
import com.onesignal.OSWebView;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=19)
class WebViewManager
extends ActivityLifecycleHandler.ActivityAvailableListener {
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private static final int MARGIN_PX_SIZE = OSViewUtils.dpToPx(24);
    private static final String TAG = "com.onesignal.WebViewManager";
    @Nullable
    public static WebViewManager lastInstance = null;
    @NonNull
    private Activity activity;
    private boolean closing = false;
    @Nullable
    private String currentActivityName = null;
    private boolean dismissFired = false;
    private Integer lastPageHeight = null;
    @NonNull
    private OSInAppMessageInternal message;
    @NonNull
    private OSInAppMessageContent messageContent;
    @Nullable
    private InAppMessageView messageView;
    private final Object messageViewSyncLock = new Object(this){
        public final WebViewManager this$0;
        {
            this.this$0 = webViewManager;
        }
    };
    @Nullable
    private OSWebView webView;

    public WebViewManager(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull Activity activity, @NonNull OSInAppMessageContent oSInAppMessageContent) {
        this.message = oSInAppMessageInternal;
        this.activity = activity;
        this.messageContent = oSInAppMessageContent;
    }

    public static /* synthetic */ void access$100(WebViewManager webViewManager, Activity activity, String string2, boolean bl) {
        webViewManager.setupWebView(activity, string2, bl);
    }

    public static /* synthetic */ void access$1000(WebViewManager webViewManager, Activity activity) {
        webViewManager.setWebViewToMaxSize(activity);
    }

    public static /* synthetic */ void access$1100(WebViewManager webViewManager) {
        webViewManager.updateSafeAreaInsets();
    }

    public static /* synthetic */ void access$1200(WebViewManager webViewManager, Integer n) {
        webViewManager.showMessageView(n);
    }

    public static /* synthetic */ boolean access$1402(WebViewManager webViewManager, boolean bl) {
        webViewManager.dismissFired = bl;
        return bl;
    }

    public static /* synthetic */ boolean access$702(WebViewManager webViewManager, boolean bl) {
        webViewManager.closing = bl;
        return bl;
    }

    public static /* synthetic */ OSWebView access$900(WebViewManager webViewManager) {
        return webViewManager.webView;
    }

    private void blurryRenderingWebViewForKitKatWorkAround(@NonNull WebView webView) {
    }

    private void calculateHeightAndShowWebViewAfterNewActivity() {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView == null) {
            return;
        }
        if (inAppMessageView.getDisplayPosition() == Position.FULL_SCREEN && !this.messageContent.isFullBleed()) {
            this.showMessageView(null);
            return;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "In app message new activity, calculate height and show ");
        OSViewUtils.decorViewReady(this.activity, new Runnable(this){
            public final WebViewManager this$0;
            {
                this.this$0 = webViewManager;
            }

            public void run() {
                WebViewManager webViewManager = this.this$0;
                WebViewManager.access$1000(webViewManager, WebViewManager.access$500(webViewManager));
                if (WebViewManager.access$300(this.this$0).isFullBleed()) {
                    WebViewManager.access$1100(this.this$0);
                }
                WebViewManager.access$900(this.this$0).evaluateJavascript("getPageMetaData()", (ValueCallback)new ValueCallback<String>(this){
                    public final 6 this$1;
                    {
                        this.this$1 = var1_1;
                    }

                    public void onReceiveValue(String string2) {
                        try {
                            WebViewManager webViewManager = this.this$1.this$0;
                            Activity activity = WebViewManager.access$500(webViewManager);
                            JSONObject jSONObject = new JSONObject(string2);
                            int n = WebViewManager.access$600(webViewManager, activity, jSONObject);
                            WebViewManager.access$1200(this.this$1.this$0, n);
                        }
                        catch (JSONException jSONException) {
                            jSONException.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    private void createNewInAppMessageView(boolean bl) {
        this.lastPageHeight = this.messageContent.getPageHeight();
        this.setMessageView(new InAppMessageView(this.webView, this.messageContent, bl));
        this.messageView.setMessageController(new InAppMessageView.InAppMessageViewListener(this){
            public final WebViewManager this$0;
            {
                this.this$0 = webViewManager;
            }

            @Override
            public void onMessageWasDismissed() {
                OneSignal.getInAppMessageController().messageWasDismissed(this.this$0.message);
                this.this$0.removeActivityListener();
            }

            @Override
            public void onMessageWasShown() {
                OneSignal.getInAppMessageController().onMessageWasShown(this.this$0.message);
            }

            @Override
            public void onMessageWillDismiss() {
                OneSignal.getInAppMessageController().onMessageWillDismiss(this.this$0.message);
            }
        });
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(TAG);
            stringBuilder.append(this.message.messageId);
            activityLifecycleHandler.addActivityAvailableListener(stringBuilder.toString(), this);
        }
    }

    public static void dismissCurrentInAppMessage() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        Object object = z2.t("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ");
        object.append((Object)lastInstance);
        OneSignal.onesignalLog(lOG_LEVEL, object.toString());
        object = lastInstance;
        if (object != null) {
            ((WebViewManager)object).dismissAndAwaitNextMessage(null);
        }
    }

    private static void enableWebViewRemoteDebugging() {
        if (OneSignal.atLogLevel(OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled((boolean)true);
        }
    }

    private int getWebViewMaxSizeX(Activity activity) {
        if (this.messageContent.isFullBleed()) {
            return OSViewUtils.getFullbleedWindowWidth(activity);
        }
        int n = MARGIN_PX_SIZE;
        return OSViewUtils.getWindowWidth(activity) - n * 2;
    }

    private int getWebViewMaxSizeY(Activity activity) {
        int n = this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2;
        return OSViewUtils.getWindowHeight(activity) - n;
    }

    private static void initInAppMessage(@NonNull Activity activity, @NonNull OSInAppMessageInternal runnable, @NonNull OSInAppMessageContent oSInAppMessageContent) {
        if (oSInAppMessageContent.isFullBleed()) {
            WebViewManager.setContentSafeAreaInsets(oSInAppMessageContent, activity);
        }
        try {
            WebViewManager webViewManager;
            String string2 = Base64.encodeToString((byte[])oSInAppMessageContent.getContentHtml().getBytes("UTF-8"), (int)2);
            lastInstance = webViewManager = new WebViewManager((OSInAppMessageInternal)runnable, activity, oSInAppMessageContent);
            runnable = new Runnable(webViewManager, activity, string2, oSInAppMessageContent){
                public final String val$base64Str;
                public final OSInAppMessageContent val$content;
                public final Activity val$currentActivity;
                public final WebViewManager val$webViewManager;
                {
                    this.val$webViewManager = webViewManager;
                    this.val$currentActivity = activity;
                    this.val$base64Str = string2;
                    this.val$content = oSInAppMessageContent;
                }

                public void run() {
                    Exception exception2;
                    block2: {
                        try {
                            WebViewManager.access$100(this.val$webViewManager, this.val$currentActivity, this.val$base64Str, this.val$content.isFullBleed());
                        }
                        catch (Exception exception2) {
                            if (exception2.getMessage() == null || !exception2.getMessage().contains((CharSequence)"No WebView installed")) break block2;
                            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error setting up WebView: ", exception2);
                        }
                        return;
                    }
                    throw exception2;
                }
            };
            OSUtils.runOnMainUIThread(runnable);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Catch on initInAppMessage: ", unsupportedEncodingException);
            unsupportedEncodingException.printStackTrace();
        }
    }

    private int pageRectToViewHeight(@NonNull Activity activity, @NonNull JSONObject object) {
        int n;
        block3: {
            int n2;
            try {
                int n3 = OSViewUtils.dpToPx(object.getJSONObject("rect").getInt("height"));
                object = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getPageHeightData:pxHeight: ");
                stringBuilder.append(n3);
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
                n2 = this.getWebViewMaxSizeY(activity);
                n = n3;
                if (n3 <= n2) break block3;
            }
            catch (JSONException jSONException) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "pageRectToViewHeight could not get page height", jSONException);
                return -1;
            }
            activity = new StringBuilder();
            activity.append("getPageHeightData:pxHeight is over screen max: ");
            activity.append(n2);
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), activity.toString());
            n = n2;
        }
        return n;
    }

    private void removeActivityListener() {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(TAG);
            stringBuilder.append(this.message.messageId);
            activityLifecycleHandler.removeActivityAvailableListener(stringBuilder.toString());
        }
    }

    private static void setContentSafeAreaInsets(OSInAppMessageContent oSInAppMessageContent, @NonNull Activity object) {
        String string2 = oSInAppMessageContent.getContentHtml();
        object = OSViewUtils.getCutoutAndStatusBarInsets(object);
        String string3 = String.format((String)"\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", (Object[])new Object[]{String.format((String)"{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", (Object[])new Object[]{(int)object[0], (int)object[1], (int)object[2], (int)object[3]})});
        object = new StringBuilder();
        object.append(string2);
        object.append(string3);
        oSInAppMessageContent.setContentHtml(object.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setMessageView(InAppMessageView inAppMessageView) {
        Object object;
        Object object2 = object = this.messageViewSyncLock;
        synchronized (object2) {
            this.messageView = inAppMessageView;
            return;
        }
    }

    private void setWebViewToMaxSize(Activity activity) {
        this.webView.layout(0, 0, this.getWebViewMaxSizeX(activity), this.getWebViewMaxSizeY(activity));
    }

    @SuppressLint(value={"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void setupWebView(@NonNull Activity activity, @NonNull String string2, boolean bl) {
        OSWebView oSWebView;
        WebViewManager.enableWebViewRemoteDebugging();
        this.webView = oSWebView = new OSWebView((Context)activity);
        oSWebView.setOverScrollMode(2);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new Object(this){
            public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
            public static final String EVENT_TYPE_KEY = "type";
            public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
            public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
            public static final String EVENT_TYPE_RESIZE = "resize";
            public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
            public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
            public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
            public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
            public static final String JS_OBJ_NAME = "OSAndroid";
            public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
            public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
            public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
            public final WebViewManager this$0;
            {
                this.this$0 = webViewManager;
            }

            @NonNull
            private Position getDisplayLocation(JSONObject jSONObject) {
                Position position;
                block4: {
                    Position position2;
                    position = position2 = Position.FULL_SCREEN;
                    if (!jSONObject.has(IAM_DISPLAY_LOCATION_KEY)) break block4;
                    position = position2;
                    try {
                        if (!jSONObject.get(IAM_DISPLAY_LOCATION_KEY).equals((Object)"")) {
                            position = Position.valueOf(jSONObject.optString(IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN").toUpperCase());
                        }
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                        position = position2;
                    }
                }
                return position;
            }

            private boolean getDragToDismissDisabled(JSONObject jSONObject) {
                try {
                    boolean bl = jSONObject.getBoolean(IAM_DRAG_TO_DISMISS_DISABLED_KEY);
                    return bl;
                }
                catch (JSONException jSONException) {
                    return false;
                }
            }

            private int getPageHeightData(JSONObject jSONObject) {
                try {
                    WebViewManager webViewManager = this.this$0;
                    int n = webViewManager.pageRectToViewHeight(webViewManager.activity, jSONObject.getJSONObject(IAM_PAGE_META_DATA_KEY));
                    return n;
                }
                catch (JSONException jSONException) {
                    return -1;
                }
            }

            private void handleActionTaken(JSONObject jSONObject) throws JSONException {
                jSONObject = jSONObject.getJSONObject("body");
                String string2 = jSONObject.optString("id", null);
                WebViewManager.access$702(this.this$0, jSONObject.getBoolean("close"));
                if (((WebViewManager)this.this$0).message.isPreview) {
                    OneSignal.getInAppMessageController().onMessageActionOccurredOnPreview(this.this$0.message, jSONObject);
                } else if (string2 != null) {
                    OneSignal.getInAppMessageController().onMessageActionOccurredOnMessage(this.this$0.message, jSONObject);
                }
                if (this.this$0.closing) {
                    this.this$0.dismissAndAwaitNextMessage(null);
                }
            }

            private void handlePageChange(JSONObject jSONObject) throws JSONException {
                OneSignal.getInAppMessageController().onPageChanged(this.this$0.message, jSONObject);
            }

            private void handleRenderComplete(JSONObject jSONObject) {
                Position position = this.getDisplayLocation(jSONObject);
                int n = position == Position.FULL_SCREEN ? -1 : this.getPageHeightData(jSONObject);
                boolean bl = this.getDragToDismissDisabled(jSONObject);
                this.this$0.messageContent.setDisplayLocation(position);
                this.this$0.messageContent.setPageHeight(n);
                this.this$0.createNewInAppMessageView(bl);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @JavascriptInterface
            public void postMessage(String string2) {
                try {
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("OSJavaScriptInterface:postMessage: ");
                    stringBuilder.append(string2);
                    OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                    stringBuilder = new JSONObject(string2);
                    string2 = stringBuilder.getString(EVENT_TYPE_KEY);
                    int n = -1;
                    switch (string2.hashCode()) {
                        default: {
                            break;
                        }
                        case 1851145598: {
                            if (!string2.equals((Object)EVENT_TYPE_ACTION_TAKEN)) break;
                            n = 1;
                            break;
                        }
                        case 42998156: {
                            if (!string2.equals((Object)EVENT_TYPE_RENDERING_COMPLETE)) break;
                            n = 0;
                            break;
                        }
                        case -934437708: {
                            if (!string2.equals((Object)EVENT_TYPE_RESIZE)) break;
                            return;
                        }
                        case -1484226720: {
                            if (!string2.equals((Object)EVENT_TYPE_PAGE_CHANGE)) break;
                            n = 3;
                        }
                    }
                    if (n == 0) {
                        this.handleRenderComplete((JSONObject)stringBuilder);
                        return;
                    }
                    if (n == 1) {
                        if (this.this$0.messageView.isDragging()) return;
                        this.handleActionTaken((JSONObject)stringBuilder);
                        return;
                    }
                    if (n != 3) {
                        return;
                    }
                    this.handlePageChange((JSONObject)stringBuilder);
                    return;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        }, "OSAndroid");
        if (bl) {
            this.webView.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.webView.setFitsSystemWindows(false);
            }
        }
        this.blurryRenderingWebViewForKitKatWorkAround(this.webView);
        OSViewUtils.decorViewReady(activity, new Runnable(this, activity, string2){
            public final WebViewManager this$0;
            public final String val$base64Message;
            public final Activity val$currentActivity;
            {
                this.this$0 = webViewManager;
                this.val$currentActivity = activity;
                this.val$base64Message = string2;
            }

            public void run() {
                WebViewManager.access$1000(this.this$0, this.val$currentActivity);
                WebViewManager.access$900(this.this$0).loadData(this.val$base64Message, "text/html; charset=utf-8", "base64");
            }
        });
    }

    public static void showMessageContent(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull OSInAppMessageContent oSInAppMessageContent) {
        Activity activity = OneSignal.getCurrentActivity();
        Object object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in app message showMessageContent on currentActivity: ");
        stringBuilder.append((Object)activity);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        if (activity != null) {
            object = lastInstance;
            if (object != null && oSInAppMessageInternal.isPreview) {
                ((WebViewManager)object).dismissAndAwaitNextMessage(new OneSignalGenericCallback(activity, oSInAppMessageInternal, oSInAppMessageContent){
                    public final OSInAppMessageContent val$content;
                    public final Activity val$currentActivity;
                    public final OSInAppMessageInternal val$message;
                    {
                        this.val$currentActivity = activity;
                        this.val$message = oSInAppMessageInternal;
                        this.val$content = oSInAppMessageContent;
                    }

                    @Override
                    public void onComplete() {
                        lastInstance = null;
                        WebViewManager.initInAppMessage(this.val$currentActivity, this.val$message, this.val$content);
                    }
                });
            } else {
                WebViewManager.initInAppMessage(activity, oSInAppMessageInternal, oSInAppMessageContent);
            }
            return;
        }
        Looper.prepare();
        new Handler().postDelayed(new Runnable(oSInAppMessageInternal, oSInAppMessageContent){
            public final OSInAppMessageContent val$content;
            public final OSInAppMessageInternal val$message;
            {
                this.val$message = oSInAppMessageInternal;
                this.val$content = oSInAppMessageContent;
            }

            public void run() {
                WebViewManager.showMessageContent(this.val$message, this.val$content);
            }
        }, 200L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void showMessageView(@Nullable Integer n) {
        Object object;
        Object object2 = object = this.messageViewSyncLock;
        synchronized (object2) {
            if (this.messageView == null) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "No messageView found to update a with a new height.");
                return;
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("In app message, showing first one with height: ");
            stringBuilder.append((Object)n);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.messageView.setWebView(this.webView);
            if (n != null) {
                this.lastPageHeight = n;
                this.messageView.updateHeight(n);
            }
            this.messageView.showView(this.activity);
            this.messageView.checkIfShouldDismiss();
            return;
        }
    }

    private void updateSafeAreaInsets() {
        OSUtils.runOnMainUIThread(new Runnable(this){
            public final WebViewManager this$0;
            {
                this.this$0 = webViewManager;
            }

            public void run() {
                Object object = OSViewUtils.getCutoutAndStatusBarInsets(WebViewManager.access$500(this.this$0));
                object = String.format((String)"setSafeAreaInsets(%s)", (Object[])new Object[]{String.format((String)"{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", (Object[])new Object[]{object[0], object[1], object[2], object[3]})});
                WebViewManager.access$900(this.this$0).evaluateJavascript((String)object, null);
            }
        });
    }

    @Override
    public void available(@NonNull Activity object) {
        String string2 = this.currentActivityName;
        this.activity = object;
        this.currentActivityName = object.getLocalClassName();
        object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("In app message activity available currentActivityName: ");
        stringBuilder.append(this.currentActivityName);
        stringBuilder.append(" lastActivityName: ");
        stringBuilder.append(string2);
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        if (string2 == null) {
            this.showMessageView(null);
        } else if (!string2.equals((Object)this.currentActivityName)) {
            if (!this.closing) {
                object = this.messageView;
                if (object != null) {
                    ((InAppMessageView)object).removeAllViews();
                }
                this.showMessageView(this.lastPageHeight);
            }
        } else {
            this.calculateHeightAndShowWebViewAfterNewActivity();
        }
    }

    public void dismissAndAwaitNextMessage(@Nullable OneSignalGenericCallback oneSignalGenericCallback) {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView != null && !this.dismissFired) {
            if (this.message != null && inAppMessageView != null) {
                OneSignal.getInAppMessageController().onMessageWillDismiss(this.message);
            }
            this.messageView.dismissAndAwaitNextMessage(new OneSignalGenericCallback(this, oneSignalGenericCallback){
                public final WebViewManager this$0;
                public final OneSignalGenericCallback val$callback;
                {
                    this.this$0 = webViewManager;
                    this.val$callback = oneSignalGenericCallback;
                }

                @Override
                public void onComplete() {
                    WebViewManager.access$1402(this.this$0, false);
                    this.this$0.setMessageView(null);
                    OneSignalGenericCallback oneSignalGenericCallback = this.val$callback;
                    if (oneSignalGenericCallback != null) {
                        oneSignalGenericCallback.onComplete();
                    }
                }
            });
            this.dismissFired = true;
            return;
        }
        if (oneSignalGenericCallback != null) {
            oneSignalGenericCallback.onComplete();
        }
    }

    @Override
    public void stopped(@NonNull Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("In app message activity stopped, cleaning views, currentActivityName: ");
        stringBuilder.append(this.currentActivityName);
        stringBuilder.append("\nactivity: ");
        stringBuilder.append((Object)this.activity);
        stringBuilder.append("\nmessageView: ");
        stringBuilder.append((Object)this.messageView);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (this.messageView != null && activity.getLocalClassName().equals((Object)this.currentActivityName)) {
            this.messageView.removeAllViews();
        }
    }
}

