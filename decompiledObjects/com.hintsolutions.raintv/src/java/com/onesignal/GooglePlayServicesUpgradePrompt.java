/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.PendingIntent$CanceledException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.pm.PackageManager
 *  com.google.android.gms.common.GoogleApiAvailability
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.PackageInfoHelper
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.onesignal.GetPackageInfoResult;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.PackageInfoHelper;

class GooglePlayServicesUpgradePrompt {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    private static void OpenPlayStoreToApp(Activity activity) {
        block3: {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            activity = googleApiAvailability.getErrorResolutionPendingIntent((Context)activity, googleApiAvailability.isGooglePlayServicesAvailable(OneSignal.appContext), 9000);
            if (activity == null) break block3;
            try {
                activity.send();
            }
            catch (PendingIntent.CanceledException canceledException) {
                canceledException.printStackTrace();
            }
        }
    }

    private static boolean isGooglePlayStoreInstalled() {
        GetPackageInfoResult getPackageInfoResult = PackageInfoHelper.Companion.getInfo(OneSignal.appContext, "com.google.android.gms", 128);
        if (!getPackageInfoResult.getSuccessful()) {
            return false;
        }
        if (getPackageInfoResult.getPackageInfo() == null) {
            return false;
        }
        PackageManager packageManager = OneSignal.appContext.getPackageManager();
        return ((String)getPackageInfoResult.getPackageInfo().applicationInfo.loadLabel(packageManager)).equals((Object)"Market") ^ true;
    }

    public static void showUpdateGPSDialog() {
        if (!OSUtils.isAndroidDeviceType()) {
            return;
        }
        if (GooglePlayServicesUpgradePrompt.isGooglePlayStoreInstalled() && !OneSignal.getDisableGMSMissingPrompt()) {
            if (OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_DO_NOT_SHOW_MISSING_GPS", (boolean)false)) {
                return;
            }
            OSUtils.runOnMainUIThread(new Runnable(){

                public void run() {
                    Activity activity = OneSignal.getCurrentActivity();
                    if (activity == null) {
                        return;
                    }
                    String string2 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                    String string3 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_update", "Update");
                    String string4 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_skip", "Skip");
                    String string5 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_close", "Close");
                    new AlertDialog.Builder((Context)activity).setMessage((CharSequence)string2).setPositiveButton((CharSequence)string3, new DialogInterface.OnClickListener(this, activity){
                        public final 1 this$0;
                        public final Activity val$activity;
                        {
                            this.this$0 = var1_1;
                            this.val$activity = activity;
                        }

                        public void onClick(DialogInterface dialogInterface, int n) {
                            GooglePlayServicesUpgradePrompt.OpenPlayStoreToApp(this.val$activity);
                        }
                    }).setNegativeButton((CharSequence)string4, new DialogInterface.OnClickListener(this){
                        public final 1 this$0;
                        {
                            this.this$0 = var1_1;
                        }

                        public void onClick(DialogInterface dialogInterface, int n) {
                            OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"GT_DO_NOT_SHOW_MISSING_GPS", (boolean)true);
                        }
                    }).setNeutralButton((CharSequence)string5, null).create().show();
                }
            });
        }
    }
}

