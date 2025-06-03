/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.preference.PreferenceManager
 *  android.text.TextUtils
 *  android.webkit.CookieManager
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.vk.sdk.VKSdk$2
 *  com.vk.sdk.api.VKError
 *  com.vk.sdk.api.VKRequest
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.vk.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKAccessTokenTracker;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKObject;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.util.VKUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class VKSdk {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_API_ERRORS = false;
    public static final String EXTRA_ERROR_ID = "vk_extra_error_id";
    public static final int RESULT_ERROR = 0;
    public static final int RESULT_OK = -1;
    public static final String SDK_API_VERSION = "com_vk_sdk_ApiVersion";
    public static final String SDK_APP_ID = "com_vk_sdk_AppId";
    public static final String SDK_TAG = "VK SDK";
    private static final String VK_SDK_APP_ID_PREF_KEY = "VK_SDK_APP_ID_PLEASE_DONT_TOUCH";
    private static final String VK_SDK_APP_VERSION_PREF_KEY = "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH";
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static ArrayList<String> requestedPermissions;
    private static String sCurrentApiVersion;
    private static int sCurrentAppId;
    private static volatile LoginState sCurrentLoginState;
    private static boolean sIsCustomInitialize;
    private static final List<VKAccessTokenTracker> sVKTokenListeners;
    private static VKSdk vkSdk;
    private final Context applicationContext;

    static {
        sCurrentAppId = 0;
        vkSdk = null;
        sIsCustomInitialize = false;
        sVKTokenListeners = new CopyOnWriteArrayList();
    }

    private VKSdk(Context context) {
        this.applicationContext = context;
    }

    public static /* synthetic */ void access$100(Context context, VKCallback vKCallback) {
        VKSdk.updateLoginState(context, vKCallback);
    }

    public static /* synthetic */ void access$200(Context context) {
        VKSdk.onAccessTokenIsInvalid(context);
    }

    public static void addVKTokenTracker(VKAccessTokenTracker vKAccessTokenTracker) {
        sVKTokenListeners.add((Object)vKAccessTokenTracker);
    }

    private static CheckTokenResult checkAndSetToken(@NonNull Context object, @Nullable Map<String, String> object2) {
        block8: {
            block7: {
                Object object3;
                if (object2 != null && (object3 = requestedPermissions) != null) {
                    object2.put((Object)"scope", (Object)TextUtils.join((CharSequence)",", object3));
                }
                if ((object3 = VKAccessToken.tokenFromParameters(object2)) != null && object3.accessToken != null) {
                    VKAccessToken vKAccessToken = VKAccessToken.currentToken();
                    if (vKAccessToken != null) {
                        object2 = vKAccessToken.copyWithToken((VKAccessToken)object3);
                        VKAccessToken.replaceToken(object, vKAccessToken.copyWithToken((VKAccessToken)object3));
                        VKSdk.notifyVKTokenChanged(vKAccessToken, (VKAccessToken)object2);
                        return new CheckTokenResult(vKAccessToken, (VKAccessToken)object3);
                    }
                    VKAccessToken.replaceToken((Context)object, object3);
                    VKSdk.notifyVKTokenChanged(vKAccessToken, object3);
                    return new CheckTokenResult((VKAccessToken)object3);
                }
                if (object2 != null && object2.containsKey((Object)"success")) {
                    object2 = VKAccessToken.currentToken();
                    object = object3 != null ? object3 : VKAccessToken.currentToken();
                    return new CheckTokenResult((VKAccessToken)object2, (VKAccessToken)object);
                }
                object2 = new VKError(object2);
                if (object2.errorMessage != null) break block7;
                object = object2;
                if (object2.errorReason == null) break block8;
            }
            object = new VKError(-102);
        }
        return new CheckTokenResult((VKError)object);
    }

    public static VKSdk customInitialize(Context context, int n, String object) {
        int n3 = n;
        if (n == 0) {
            n3 = VKSdk.getIntFromPref(context, VK_SDK_APP_ID_PREF_KEY);
        }
        String string2 = object;
        if (TextUtils.isEmpty((CharSequence)object)) {
            string2 = VKSdk.getStringFromPref(context, VK_SDK_APP_VERSION_PREF_KEY, "5.21");
        }
        if (n3 != 0) {
            sIsCustomInitialize = true;
            object = VKSdk.initialize(context, n3, string2);
            n = sCurrentAppId;
            if (n != 0) {
                VKSdk.storeIntToPref(context, VK_SDK_APP_ID_PREF_KEY, n);
            }
            if ((string2 = sCurrentApiVersion) != null) {
                VKSdk.storeStringToPref(context, VK_SDK_APP_VERSION_PREF_KEY, string2);
            }
            return object;
        }
        throw new RuntimeException("your_app_id is 0");
    }

    private static void forceLoginState(LoginState loginState, VKCallback<LoginState> vKCallback) {
        sCurrentLoginState = loginState;
        if (vKCallback != null) {
            vKCallback.onResult(sCurrentLoginState);
        }
    }

    public static VKAccessToken getAccessToken() {
        return VKAccessToken.currentToken();
    }

    public static String getApiVersion() {
        return sCurrentApiVersion;
    }

    private static int getIntFromPref(@NonNull Context context, @NonNull String string2) {
        return PreferenceManager.getDefaultSharedPreferences((Context)context).getInt(string2, 0);
    }

    private static Integer getIntResByName(Context context, String string2) {
        int n = context.getResources().getIdentifier(string2, "integer", context.getPackageName());
        try {
            n = context.getResources().getInteger(n);
        }
        catch (Exception exception) {
            return 0;
        }
        return n;
    }

    private static String getStringFromPref(@NonNull Context context, @NonNull String string2, String string3) {
        return PreferenceManager.getDefaultSharedPreferences((Context)context).getString(string2, string3);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String getStringResByName(Context object, String string2, String string3) {
        String string4;
        void var1_3;
        int n = object.getResources().getIdentifier((String)var1_3, "string", object.getPackageName());
        try {
            String string5 = object.getString(n);
            boolean bl = TextUtils.isEmpty((CharSequence)string5);
            if (!bl) return string5;
            return string4;
        }
        catch (Exception exception) {
            return string4;
        }
    }

    public static int getsCurrentAppId() {
        return sCurrentAppId;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean hasInStack(@NonNull Class<?> clazz, @NonNull String string2) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        int n = stackTraceElementArray.length - 2;
        while (n >= 0) {
            StackTraceElement stackTraceElement = stackTraceElementArray[n];
            try {
                Class.forName((String)stackTraceElement.getClassName()).asSubclass(clazz);
                boolean bl = string2.equals((Object)stackTraceElement.getMethodName());
                if (bl) {
                    return true;
                }
            }
            catch (ClassCastException | ClassNotFoundException throwable) {}
            --n;
        }
        return false;
    }

    public static VKSdk initialize(Context context) {
        if (sCurrentAppId != 0) {
            return vkSdk;
        }
        if (!(context instanceof Application)) {
            if (context == null) {
                throw new NullPointerException("Application context cannot be null");
            }
            throw new RuntimeException("VKSdk.initialize(Context) must be call from Application#onCreate()");
        }
        if (VKSdk.hasInStack(Application.class, "onCreate")) {
            int n = VKSdk.getIntResByName(context, SDK_APP_ID);
            if (n != 0) {
                return VKSdk.initialize(context, n, VKSdk.getStringResByName(context, SDK_API_VERSION, "5.21"));
            }
            throw new RuntimeException("String <integer name=\"com_vk_sdk_AppId\">your_app_id</integer> did not find in your resources.xml");
        }
        throw new RuntimeException("VKSdk.initialize(Context) must be call from Application#onCreate()");
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static VKSdk initialize(Context object, int n, String string2) {
        Class<VKSdk> clazz = VKSdk.class;
        synchronized (VKSdk.class) {
            Object object2;
            block5: {
                void var2_4;
                void var1_3;
                if (sCurrentAppId != 0) return vkSdk;
                object2 = new VKSdk((Context)object);
                vkSdk = object2;
                sCurrentAppId = var1_3;
                object2 = var2_4;
                if (!TextUtils.isEmpty((CharSequence)var2_4)) break block5;
                object2 = "5.21";
            }
            sCurrentApiVersion = object2;
            sCurrentLoginState = LoginState.Unknown;
            VKSdk.wakeUpSession(object);
            return vkSdk;
        }
    }

    public static boolean isCustomInitialize() {
        return sIsCustomInitialize;
    }

    public static boolean isLoggedIn() {
        VKAccessToken vKAccessToken = VKAccessToken.currentToken();
        boolean bl = vKAccessToken != null && !vKAccessToken.isExpired();
        return bl;
    }

    public static void login(@NonNull Activity activity, String ... arrayList) {
        arrayList = VKSdk.preparingScopeList((String[])arrayList);
        requestedPermissions = arrayList;
        VKServiceActivity.startLoginActivity(activity, arrayList);
    }

    public static void login(@NonNull Fragment fragment, String ... arrayList) {
        arrayList = VKSdk.preparingScopeList((String[])arrayList);
        requestedPermissions = arrayList;
        VKServiceActivity.startLoginActivity(fragment, arrayList);
    }

    @SuppressLint(value={"NewApi"})
    public static void logout() {
        Context context = VKUIHelper.getApplicationContext();
        CookieManager.getInstance().removeAllCookies(null);
        VKAccessToken.replaceToken(VKUIHelper.getApplicationContext(), null);
        VKSdk.updateLoginState(context);
    }

    public static void notifySdkAboutApiError(VKError vKError) {
        if (vKError.errorCode == 5) {
            VKSdk.onAccessTokenIsInvalid(VKUIHelper.getApplicationContext());
        }
    }

    public static void notifyVKTokenChanged(VKAccessToken vKAccessToken, VKAccessToken vKAccessToken2) {
        handler.post(new Runnable(vKAccessToken, vKAccessToken2){
            public final VKAccessToken val$newToken;
            public final VKAccessToken val$oldToken;
            {
                this.val$oldToken = vKAccessToken;
                this.val$newToken = vKAccessToken2;
            }

            public void run() {
                Iterator iterator = sVKTokenListeners.iterator();
                while (iterator.hasNext()) {
                    ((VKAccessTokenTracker)iterator.next()).onVKAccessTokenChanged(this.val$oldToken, this.val$newToken);
                }
            }
        });
    }

    private static void onAccessTokenIsInvalid(@NonNull Context object) {
        if ((object = VKAccessToken.replaceToken(object, null)) != null) {
            VKSdk.notifyVKTokenChanged((VKAccessToken)object, null);
        }
    }

    public static boolean onActivityResult(int n, int n3, @Nullable Intent intent, @NonNull VKCallback<VKAccessToken> vKCallback) {
        if (n == VKServiceActivity.VKServiceType.Authorization.getOuterCode()) {
            if (n3 == -1) {
                vKCallback.onResult(VKAccessToken.currentToken());
            } else if (n3 == 0) {
                long l2 = 0L;
                if (intent != null) {
                    l2 = intent.getLongExtra(EXTRA_ERROR_ID, 0L);
                }
                vKCallback.onError((VKError)VKObject.getRegisteredObject(l2));
            }
            return true;
        }
        return false;
    }

    @NonNull
    private static ArrayList<String> preparingScopeList(String ... arrayList) {
        Object[] objectArray = arrayList;
        if (arrayList == null) {
            objectArray = new String[]{};
        }
        if (!(arrayList = new ArrayList((Collection)Arrays.asList((Object[])objectArray))).contains((Object)"offline")) {
            arrayList.add((Object)"offline");
        }
        return arrayList;
    }

    public static boolean processActivityResult(@NonNull Context context, int n, @Nullable Intent intent, @Nullable VKCallback<VKAccessToken> vKCallback) {
        if (n == -1 && intent != null) {
            HashMap hashMap;
            Object object;
            if (intent.hasExtra("extra-token-data")) {
                object = VKUtil.explodeQueryString(intent.getStringExtra("extra-token-data"));
            } else if (intent.getExtras() != null) {
                hashMap = new HashMap();
                Iterator iterator = intent.getExtras().keySet().iterator();
                while (true) {
                    object = hashMap;
                    if (iterator.hasNext()) {
                        object = (String)iterator.next();
                        hashMap.put(object, (Object)String.valueOf((Object)intent.getExtras().get((String)object)));
                        continue;
                    }
                    break;
                }
            } else {
                object = null;
            }
            object = VKSdk.checkAndSetToken(context, object);
            hashMap = object.error;
            if (hashMap != null && vKCallback != null) {
                vKCallback.onError((VKError)hashMap);
            } else if (object.token != null) {
                if (object.oldToken != null) {
                    if ((intent = VKRequest.getRegisteredRequest((long)intent.getLongExtra("extra-validation-request", 0L))) != null) {
                        intent.unregisterObject();
                        intent.repeat();
                    }
                } else {
                    VKSdk.trackVisitor(null);
                }
                if (vKCallback != null) {
                    vKCallback.onResult(object.token);
                }
            }
            requestedPermissions = null;
            VKSdk.updateLoginState(context);
            return true;
        }
        if (vKCallback != null) {
            vKCallback.onError(new VKError(-102));
        }
        VKSdk.updateLoginState(context);
        return false;
    }

    public static void removeVKTokenTracker(VKAccessTokenTracker vKAccessTokenTracker) {
        sVKTokenListeners.remove((Object)vKAccessTokenTracker);
    }

    private static void storeIntToPref(@NonNull Context context, @NonNull String string2, int n) {
        context = PreferenceManager.getDefaultSharedPreferences((Context)context).edit();
        context.putInt(string2, n);
        context.apply();
    }

    private static void storeStringToPref(@NonNull Context context, @NonNull String string2, String string3) {
        context = PreferenceManager.getDefaultSharedPreferences((Context)context).edit();
        context.putString(string2, string3);
        context.apply();
    }

    private static void trackVisitor(VKRequest.VKRequestListener vKRequestListener) {
        VKRequest vKRequest = new VKRequest("stats.trackVisitor");
        vKRequest.attempts = 0;
        vKRequest.executeWithListener(vKRequestListener);
    }

    private static void updateLoginState(Context context) {
        VKSdk.updateLoginState(context, null);
    }

    private static void updateLoginState(Context context, VKCallback<LoginState> vKCallback) {
        VKUIHelper.setApplicationContext(context);
        if (VKAccessToken.currentToken() != null) {
            VKSdk.forceLoginState(LoginState.LoggedIn, vKCallback);
        } else {
            VKSdk.forceLoginState(LoginState.LoggedOut, vKCallback);
        }
    }

    public static boolean wakeUpSession(@NonNull Context context) {
        return VKSdk.wakeUpSession(context, null);
    }

    public static boolean wakeUpSession(@NonNull Context context, VKCallback<LoginState> vKCallback) {
        Context context2 = context.getApplicationContext();
        VKUIHelper.setApplicationContext(context2);
        VKAccessToken vKAccessToken = VKAccessToken.currentToken();
        if (vKAccessToken != null && vKAccessToken.accessToken != null && !vKAccessToken.isExpired()) {
            VKSdk.forceLoginState(LoginState.Pending, vKCallback);
            VKSdk.trackVisitor((VKRequest.VKRequestListener)new 2(context, vKCallback, context2));
            return true;
        }
        VKSdk.updateLoginState(context, vKCallback);
        return false;
    }

    public static class CheckTokenResult {
        public VKError error;
        public VKAccessToken oldToken;
        public VKAccessToken token;

        public CheckTokenResult(VKAccessToken vKAccessToken) {
            this.token = vKAccessToken;
        }

        public CheckTokenResult(VKAccessToken vKAccessToken, VKAccessToken vKAccessToken2) {
            this.token = vKAccessToken2;
            this.oldToken = vKAccessToken;
        }

        public CheckTokenResult(VKError vKError) {
            this.error = vKError;
        }
    }

    public static final class LoginState
    extends Enum<LoginState> {
        private static final LoginState[] $VALUES;
        public static final /* enum */ LoginState LoggedIn;
        public static final /* enum */ LoginState LoggedOut;
        public static final /* enum */ LoginState Pending;
        public static final /* enum */ LoginState Unknown;

        static {
            LoginState loginState;
            LoginState loginState2;
            LoginState loginState3;
            LoginState loginState4;
            Unknown = loginState4 = new LoginState();
            LoggedOut = loginState3 = new LoginState();
            Pending = loginState2 = new LoginState();
            LoggedIn = loginState = new LoginState();
            $VALUES = new LoginState[]{loginState4, loginState3, loginState2, loginState};
        }

        public static LoginState valueOf(String string2) {
            return (LoginState)Enum.valueOf(LoginState.class, (String)string2);
        }

        public static LoginState[] values() {
            return (LoginState[])$VALUES.clone();
        }
    }
}

