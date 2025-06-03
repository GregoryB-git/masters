/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.onesignal.OneSignalStateSynchronizer$1
 *  com.onesignal.UserStateEmailSynchronizer
 *  com.onesignal.UserStatePushSynchronizer
 *  com.onesignal.UserStateSMSSynchronizer
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateEmailSynchronizer;
import com.onesignal.UserStatePushSynchronizer;
import com.onesignal.UserStateSMSSynchronizer;
import com.onesignal.UserStateSynchronizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class OneSignalStateSynchronizer {
    private static final Object LOCK = new Object();
    private static HashMap<UserStateSynchronizerType, UserStateSynchronizer> userStateSynchronizers = new HashMap();

    public static /* synthetic */ HashMap access$000() {
        return userStateSynchronizers;
    }

    public static void clearLocation() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().clearLocation();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().clearLocation();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().clearLocation();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static UserStateEmailSynchronizer getEmailStateSynchronizer() {
        Object object = userStateSynchronizers;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.EMAIL;
        if (!object.containsKey((Object)userStateSynchronizerType) || userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
            Object object2 = object = LOCK;
            synchronized (object2) {
                if (userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
                    HashMap<UserStateSynchronizerType, UserStateSynchronizer> hashMap = userStateSynchronizers;
                    UserStateEmailSynchronizer userStateEmailSynchronizer = new UserStateEmailSynchronizer();
                    hashMap.put((Object)userStateSynchronizerType, (Object)userStateEmailSynchronizer);
                }
            }
        }
        return (UserStateEmailSynchronizer)userStateSynchronizers.get((Object)userStateSynchronizerType);
    }

    public static String getLanguage() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getLanguage();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static UserStatePushSynchronizer getPushStateSynchronizer() {
        Object object = userStateSynchronizers;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.PUSH;
        if (!object.containsKey((Object)userStateSynchronizerType) || userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
            Object object2 = object = LOCK;
            synchronized (object2) {
                if (userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
                    HashMap<UserStateSynchronizerType, UserStateSynchronizer> hashMap = userStateSynchronizers;
                    UserStatePushSynchronizer userStatePushSynchronizer = new UserStatePushSynchronizer();
                    hashMap.put((Object)userStateSynchronizerType, (Object)userStatePushSynchronizer);
                }
            }
        }
        return (UserStatePushSynchronizer)userStateSynchronizers.get((Object)userStateSynchronizerType);
    }

    public static String getRegistrationId() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getRegistrationId();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static UserStateSMSSynchronizer getSMSStateSynchronizer() {
        Object object = userStateSynchronizers;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.SMS;
        if (!object.containsKey((Object)userStateSynchronizerType) || userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
            Object object2 = object = LOCK;
            synchronized (object2) {
                if (userStateSynchronizers.get((Object)userStateSynchronizerType) == null) {
                    HashMap<UserStateSynchronizerType, UserStateSynchronizer> hashMap = userStateSynchronizers;
                    UserStateSMSSynchronizer userStateSMSSynchronizer = new UserStateSMSSynchronizer();
                    hashMap.put((Object)userStateSynchronizerType, (Object)userStateSMSSynchronizer);
                }
            }
        }
        return (UserStateSMSSynchronizer)userStateSynchronizers.get((Object)userStateSynchronizerType);
    }

    public static boolean getSubscribed() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getSubscribed();
    }

    public static boolean getSyncAsNewSession() {
        boolean bl = OneSignalStateSynchronizer.getPushStateSynchronizer().getSyncAsNewSession() || OneSignalStateSynchronizer.getEmailStateSynchronizer().getSyncAsNewSession() || OneSignalStateSynchronizer.getSMSStateSynchronizer().getSyncAsNewSession();
        return bl;
    }

    public static UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getTags(bl);
    }

    public static List<UserStateSynchronizer> getUserStateSynchronizers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)OneSignalStateSynchronizer.getPushStateSynchronizer());
        if (OneSignal.hasEmailId()) {
            arrayList.add((Object)OneSignalStateSynchronizer.getEmailStateSynchronizer());
        }
        if (OneSignal.hasSMSlId()) {
            arrayList.add((Object)OneSignalStateSynchronizer.getSMSStateSynchronizer());
        }
        return arrayList;
    }

    public static boolean getUserSubscribePreference() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getUserSubscribePreference();
    }

    public static void initUserState() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().initUserState();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().initUserState();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().initUserState();
    }

    public static void logoutEmail() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().logoutEmail();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().logoutChannel();
    }

    public static void logoutSMS() {
        OneSignalStateSynchronizer.getSMSStateSynchronizer().logoutChannel();
        OneSignalStateSynchronizer.getPushStateSynchronizer().logoutSMS();
    }

    public static boolean persist() {
        boolean bl = OneSignalStateSynchronizer.getPushStateSynchronizer().persist();
        boolean bl2 = OneSignalStateSynchronizer.getEmailStateSynchronizer().persist();
        boolean bl3 = OneSignalStateSynchronizer.getSMSStateSynchronizer().persist();
        boolean bl4 = true;
        boolean bl5 = bl2;
        if (bl2) {
            bl5 = OneSignalStateSynchronizer.getEmailStateSynchronizer().getRegistrationId() != null;
        }
        bl2 = bl3;
        if (bl3) {
            bl2 = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId() != null;
        }
        bl3 = bl4;
        if (!bl) {
            bl3 = bl4;
            if (!bl5) {
                bl3 = bl2 ? bl4 : false;
            }
        }
        return bl3;
    }

    public static void readyToUpdate(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().readyToUpdate(bl);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().readyToUpdate(bl);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().readyToUpdate(bl);
    }

    public static void refreshSecondaryChannelState() {
        OneSignalStateSynchronizer.getEmailStateSynchronizer().refresh();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().refresh();
    }

    public static void resetCurrentState() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getPushStateSynchronizer().saveChannelId(null);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().saveChannelId(null);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().saveChannelId(null);
        OneSignal.setLastSessionTime(-3660L);
    }

    public static void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        Iterator iterator = OneSignalStateSynchronizer.getUserStateSynchronizers().iterator();
        while (iterator.hasNext()) {
            ((UserStateSynchronizer)iterator.next()).sendPurchases(jSONObject, responseHandler);
        }
    }

    public static void sendTags(JSONObject jSONObject, @Nullable OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject = jSONObject2.put("tags", (Object)jSONObject);
            OneSignalStateSynchronizer.getPushStateSynchronizer().sendTags(jSONObject, changeTagsUpdateHandler);
            OneSignalStateSynchronizer.getEmailStateSynchronizer().sendTags(jSONObject, changeTagsUpdateHandler);
            OneSignalStateSynchronizer.getSMSStateSynchronizer().sendTags(jSONObject, changeTagsUpdateHandler);
        }
        catch (JSONException jSONException) {
            if (changeTagsUpdateHandler != null) {
                jSONObject = z2.t("Encountered an error attempting to serialize your tags into JSON: ");
                jSONObject.append(jSONException.getMessage());
                jSONObject.append("\n");
                jSONObject.append((Object)jSONException.getStackTrace());
                changeTagsUpdateHandler.onFailure(new OneSignal.SendTagsError(-1, jSONObject.toString()));
            }
            jSONException.printStackTrace();
        }
    }

    public static void setEmail(String string2, String string3) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setEmail(string2, string3);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setChannelId(string2, string3);
    }

    public static void setExternalUserId(String string2, String string3, OneSignal.OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) throws JSONException {
        1 var3_3 = new 1(new JSONObject(), oSExternalUserIdUpdateCompletionHandler);
        oSExternalUserIdUpdateCompletionHandler = OneSignalStateSynchronizer.getUserStateSynchronizers().iterator();
        while (oSExternalUserIdUpdateCompletionHandler.hasNext()) {
            ((UserStateSynchronizer)oSExternalUserIdUpdateCompletionHandler.next()).setExternalUserId(string2, string3, (OneSignal.OSInternalExternalUserIdUpdateCompletionHandler)var3_3);
        }
    }

    public static void setNewSession() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setNewSession();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setNewSession();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().setNewSession();
    }

    public static void setNewSessionForEmail() {
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setNewSession();
    }

    public static void setPermission(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setPermission(bl);
    }

    public static void setSMSNumber(String string2, String string3) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setSMSNumber(string2, string3);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().setChannelId(string2, string3);
    }

    public static void setSubscription(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setSubscription(bl);
    }

    public static void syncUserState(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().syncUserState(bl);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().syncUserState(bl);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().syncUserState(bl);
    }

    public static void updateDeviceInfo(JSONObject jSONObject, OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
    }

    public static void updateLocation(LocationController.LocationPoint locationPoint) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateLocation(locationPoint);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().updateLocation(locationPoint);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().updateLocation(locationPoint);
    }

    public static void updatePushState(JSONObject jSONObject) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateState(jSONObject);
    }

    public static interface OSDeviceInfoCompletionHandler {
        public void onFailure(OSDeviceInfoError var1);

        public void onSuccess(String var1);
    }

    public static class OSDeviceInfoError {
        public int errorCode;
        public String message;

        public OSDeviceInfoError(int n, String string2) {
            this.errorCode = n;
            this.message = string2;
        }

        public int getCode() {
            return this.errorCode;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static final class UserStateSynchronizerType
    extends Enum<UserStateSynchronizerType> {
        private static final UserStateSynchronizerType[] $VALUES;
        public static final /* enum */ UserStateSynchronizerType EMAIL;
        public static final /* enum */ UserStateSynchronizerType PUSH;
        public static final /* enum */ UserStateSynchronizerType SMS;

        static {
            UserStateSynchronizerType userStateSynchronizerType;
            UserStateSynchronizerType userStateSynchronizerType2;
            UserStateSynchronizerType userStateSynchronizerType3;
            PUSH = userStateSynchronizerType3 = new UserStateSynchronizerType();
            EMAIL = userStateSynchronizerType2 = new UserStateSynchronizerType();
            SMS = userStateSynchronizerType = new UserStateSynchronizerType();
            $VALUES = new UserStateSynchronizerType[]{userStateSynchronizerType3, userStateSynchronizerType2, userStateSynchronizerType};
        }

        public static UserStateSynchronizerType valueOf(String string2) {
            return (UserStateSynchronizerType)Enum.valueOf(UserStateSynchronizerType.class, (String)string2);
        }

        public static UserStateSynchronizerType[] values() {
            return (UserStateSynchronizerType[])$VALUES.clone();
        }

        public boolean isEmail() {
            return this.equals((Object)EMAIL);
        }

        public boolean isPush() {
            return this.equals((Object)PUSH);
        }

        public boolean isSMS() {
            return this.equals((Object)SMS);
        }
    }
}

