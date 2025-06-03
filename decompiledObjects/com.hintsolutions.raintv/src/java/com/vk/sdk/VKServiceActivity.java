/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.vk.sdk.VKServiceActivity$1
 *  com.vk.sdk.api.VKError
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.vk.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKObject;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.api.VKError;
import com.vk.sdk.dialogs.VKCaptchaDialog;
import com.vk.sdk.dialogs.VKOpenAuthDialog;
import com.vk.sdk.util.VKStringJoiner;
import com.vk.sdk.util.VKUtil;
import java.util.ArrayList;

public class VKServiceActivity
extends Activity
implements DialogInterface.OnDismissListener {
    private static final String KEY_REQUEST = "arg3";
    private static final String KEY_SCOPE_LIST = "arg2";
    private static final String KEY_SDK_CUSTOM_INITIALIZE = "arg4";
    private static final String KEY_TYPE = "arg1";
    private static final String VK_APP_AUTH_ACTION = "com.vkontakte.android.action.SDK_AUTH";
    private static final String VK_APP_FINGERPRINT = "48761EEF50EE53AFC4CC9C5F10E6BDE7F8F5B82F";
    private static final String VK_APP_PACKAGE_ID = "com.vkontakte.android";

    public static /* synthetic */ long access$000(VKServiceActivity vKServiceActivity) {
        return vKServiceActivity.getRequestId();
    }

    @NonNull
    private static Intent createIntent(Context context, VKServiceType vKServiceType) {
        context = new Intent(context, VKServiceActivity.class);
        context.putExtra(KEY_TYPE, vKServiceType.name());
        context.putExtra(KEY_SDK_CUSTOM_INITIALIZE, VKSdk.isCustomInitialize());
        return context;
    }

    private long getRequestId() {
        return this.getIntent().getLongExtra(KEY_REQUEST, 0L);
    }

    @Nullable
    private ArrayList<String> getScopeList() {
        return this.getIntent().getStringArrayListExtra(KEY_SCOPE_LIST);
    }

    @NonNull
    private VKServiceType getType() {
        return VKServiceType.valueOf(this.getIntent().getStringExtra(KEY_TYPE));
    }

    public static void interruptWithError(Context context, VKError vKError, VKServiceType vKServiceType) {
        vKServiceType = VKServiceActivity.createIntent(context, vKServiceType);
        vKServiceType.setFlags(0x10000000);
        vKServiceType.putExtra(KEY_REQUEST, vKError.registerObject());
        if (context != null) {
            context.startActivity((Intent)vKServiceType);
        }
    }

    public static void startLoginActivity(@NonNull Activity activity, @NonNull ArrayList<String> arrayList) {
        Context context = activity.getApplicationContext();
        VKServiceType vKServiceType = VKServiceType.Authorization;
        context = VKServiceActivity.createIntent(context, vKServiceType);
        context.putStringArrayListExtra(KEY_SCOPE_LIST, arrayList);
        activity.startActivityForResult((Intent)context, vKServiceType.getOuterCode());
    }

    @TargetApi(value=11)
    public static void startLoginActivity(@NonNull Fragment fragment, ArrayList<String> arrayList) {
        Application application = fragment.getActivity().getApplication();
        VKServiceType vKServiceType = VKServiceType.Authorization;
        application = VKServiceActivity.createIntent((Context)application, vKServiceType);
        application.putStringArrayListExtra(KEY_SCOPE_LIST, arrayList);
        fragment.startActivityForResult((Intent)application, vKServiceType.getOuterCode());
    }

    public void onActivityResult(int n, int n3, Intent intent) {
        if (n == VKServiceType.Authorization.getOuterCode() || n == VKServiceType.Validation.getOuterCode()) {
            VKSdk.processActivityResult((Context)this, n3, intent, (VKCallback<VKAccessToken>)new 1(this));
        }
    }

    public void onActivityResultPublic(int n, int n3, Intent intent) {
        this.onActivityResult(n, n3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getIntent().getBooleanExtra(KEY_SDK_CUSTOM_INITIALIZE, false)) {
            VKSdk.customInitialize((Context)this, 0, null);
        }
        VKSdk.wakeUpSession(this.getApplicationContext());
        int n = 2.$SwitchMap$com$vk$sdk$VKServiceActivity$VKServiceType[this.getType().ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    bundle = (VKError)VKObject.getRegisteredObject(this.getRequestId());
                    if (bundle != null) {
                        if (!(TextUtils.isEmpty((CharSequence)bundle.redirectUri) || bundle.redirectUri.contains((CharSequence)"&ui=vk_sdk") || bundle.redirectUri.contains((CharSequence)"?ui=vk_sdk"))) {
                            bundle.redirectUri = bundle.redirectUri.indexOf(63) > 0 ? z2.s(new StringBuilder(), bundle.redirectUri, "&ui=vk_sdk") : z2.s(new StringBuilder(), bundle.redirectUri, "?ui=vk_sdk");
                        }
                        new VKOpenAuthDialog().show(this, new Bundle(), VKServiceType.Validation.getOuterCode(), (VKError)bundle);
                    } else {
                        this.finish();
                    }
                }
            } else {
                bundle = (VKError)VKObject.getRegisteredObject(this.getRequestId());
                if (bundle != null) {
                    new VKCaptchaDialog((VKError)bundle).show((Context)this, this);
                } else {
                    this.finish();
                }
            }
        } else {
            Context context = this.getApplicationContext();
            Bundle bundle2 = new Bundle();
            bundle2.putString("version", VKSdk.getApiVersion());
            bundle2.putInt("client_id", VKSdk.getsCurrentAppId());
            bundle2.putBoolean("revoke", true);
            bundle2.putString("scope", VKStringJoiner.join(this.getScopeList(), ","));
            String[] stringArray = VKUtil.getCertificateFingerprint(context, VK_APP_PACKAGE_ID);
            if (VKUtil.isAppInstalled(context, VK_APP_PACKAGE_ID) && VKUtil.isIntentAvailable(context, VK_APP_AUTH_ACTION) && stringArray.length > 0 && stringArray[0].equals((Object)VK_APP_FINGERPRINT)) {
                if (bundle == null) {
                    bundle = new Intent(VK_APP_AUTH_ACTION, null);
                    bundle.setPackage(VK_APP_PACKAGE_ID);
                    bundle.putExtras(bundle2);
                    this.startActivityForResult((Intent)bundle, VKServiceType.Authorization.getOuterCode());
                }
            } else {
                new VKOpenAuthDialog().show(this, bundle2, VKServiceType.Authorization.getOuterCode(), null);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.finish();
    }

    public static final class VKServiceType
    extends Enum<VKServiceType> {
        private static final VKServiceType[] $VALUES;
        public static final /* enum */ VKServiceType Authorization;
        public static final /* enum */ VKServiceType Captcha;
        public static final /* enum */ VKServiceType Validation;
        private int outerCode;

        static {
            VKServiceType vKServiceType;
            VKServiceType vKServiceType2;
            VKServiceType vKServiceType3;
            Authorization = vKServiceType3 = new VKServiceType(10485);
            Captcha = vKServiceType2 = new VKServiceType(14079);
            Validation = vKServiceType = new VKServiceType(11477);
            $VALUES = new VKServiceType[]{vKServiceType3, vKServiceType2, vKServiceType};
        }

        private VKServiceType(int n3) {
            this.outerCode = n3;
        }

        public static VKServiceType valueOf(String string2) {
            return (VKServiceType)Enum.valueOf(VKServiceType.class, (String)string2);
        }

        public static VKServiceType[] values() {
            return (VKServiceType[])$VALUES.clone();
        }

        public int getOuterCode() {
            return this.outerCode;
        }
    }
}

