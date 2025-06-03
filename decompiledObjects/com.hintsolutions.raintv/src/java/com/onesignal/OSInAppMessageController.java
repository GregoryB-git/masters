/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.BackgroundRunnable;
import com.onesignal.CallbackThreadManager;
import com.onesignal.OSBackgroundManager;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSInAppMessageContent;
import com.onesignal.OSInAppMessageInternal;
import com.onesignal.OSInAppMessageLifecycleHandler;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSInAppMessagePage;
import com.onesignal.OSInAppMessagePrompt;
import com.onesignal.OSInAppMessageRepository;
import com.onesignal.OSInAppMessageTag;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSTaskController;
import com.onesignal.OSTriggerController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalChromeTab;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.R;
import com.onesignal.WebViewManager;
import com.onesignal.language.LanguageContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageController
extends OSBackgroundManager
implements OSDynamicTriggerController.OSDynamicTriggerControllerObserver,
OSSystemConditionController.OSSystemConditionObserver {
    public static final String IN_APP_MESSAGES_JSON_KEY = "in_app_messages";
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private static final Object LOCK = new Object();
    private static final String OS_IAM_DB_ACCESS = "OS_IAM_DB_ACCESS";
    private static ArrayList<String> PREFERRED_VARIANT_ORDER = new ArrayList<String>(){
        {
            this.add("android");
            this.add("app");
            this.add("all");
        }
    };
    @NonNull
    private final Set<String> clickedClickIds;
    private OSInAppMessagePrompt currentPrompt = null;
    @NonNull
    private final Set<String> dismissedMessages;
    @NonNull
    private final Set<String> impressionedMessages;
    private OSInAppMessageLifecycleHandler inAppMessageLifecycleHandler;
    private OSInAppMessageRepository inAppMessageRepository;
    private boolean inAppMessageShowing = false;
    private boolean inAppMessagingEnabled = true;
    private final LanguageContext languageContext;
    @Nullable
    public Date lastTimeInAppDismissed = null;
    private final OSLogger logger;
    @NonNull
    private final ArrayList<OSInAppMessageInternal> messageDisplayQueue;
    @NonNull
    private ArrayList<OSInAppMessageInternal> messages;
    @Nullable
    private OSInAppMessageContent pendingMessageContent = null;
    @Nullable
    private List<OSInAppMessageInternal> redisplayedInAppMessages = null;
    private OSSystemConditionController systemConditionController;
    private final OSTaskController taskController;
    public OSTriggerController triggerController;
    @Nullable
    private String userTagsString = "";
    @NonNull
    private final Set<String> viewedPageIds;
    private boolean waitForTags = false;

    public OSInAppMessageController(OneSignalDbHelper date, OSTaskController set, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        this.taskController = set;
        this.messages = new ArrayList();
        Set set2 = OSUtils.newConcurrentSet();
        this.dismissedMessages = set2;
        this.messageDisplayQueue = new ArrayList();
        Set set3 = OSUtils.newConcurrentSet();
        this.impressionedMessages = set3;
        Set set4 = OSUtils.newConcurrentSet();
        this.viewedPageIds = set4;
        set = OSUtils.newConcurrentSet();
        this.clickedClickIds = set;
        this.triggerController = new OSTriggerController(this);
        this.systemConditionController = new OSSystemConditionController(this);
        this.languageContext = languageContext;
        this.logger = oSLogger;
        date = this.getInAppMessageRepository((OneSignalDbHelper)date, oSLogger, oSSharedPreferences);
        this.inAppMessageRepository = date;
        date = date.getDismissedMessagesId();
        if (date != null) {
            set2.addAll(date);
        }
        if ((date = this.inAppMessageRepository.getImpressionesMessagesId()) != null) {
            set3.addAll(date);
        }
        if ((date = this.inAppMessageRepository.getViewPageImpressionedIds()) != null) {
            set4.addAll(date);
        }
        if ((date = this.inAppMessageRepository.getClickedMessagesId()) != null) {
            set.addAll(date);
        }
        if ((date = this.inAppMessageRepository.getLastTimeInAppDismissed()) != null) {
            this.lastTimeInAppDismissed = date;
        }
        this.initRedisplayData();
    }

    public static /* synthetic */ List access$102(OSInAppMessageController oSInAppMessageController, List list) {
        oSInAppMessageController.redisplayedInAppMessages = list;
        return list;
    }

    public static /* synthetic */ boolean access$1302(OSInAppMessageController oSInAppMessageController, boolean bl) {
        oSInAppMessageController.waitForTags = bl;
        return bl;
    }

    public static /* synthetic */ String access$1402(OSInAppMessageController oSInAppMessageController, String string2) {
        oSInAppMessageController.userTagsString = string2;
        return string2;
    }

    public static /* synthetic */ OSInAppMessageContent access$1502(OSInAppMessageController oSInAppMessageController, OSInAppMessageContent oSInAppMessageContent) {
        oSInAppMessageController.pendingMessageContent = oSInAppMessageContent;
        return oSInAppMessageContent;
    }

    public static /* synthetic */ boolean access$1702(OSInAppMessageController oSInAppMessageController, boolean bl) {
        oSInAppMessageController.inAppMessageShowing = bl;
        return bl;
    }

    public static /* synthetic */ void access$2000(OSInAppMessageController oSInAppMessageController, Collection collection) {
        oSInAppMessageController.checkRedisplayMessagesAndEvaluate((Collection<String>)collection);
    }

    public static /* synthetic */ void access$400(OSInAppMessageController oSInAppMessageController) {
        oSInAppMessageController.resetRedisplayMessagesBySession();
    }

    public static /* synthetic */ void access$500(OSInAppMessageController oSInAppMessageController, JSONArray jSONArray) throws JSONException {
        oSInAppMessageController.processInAppMessageJson(jSONArray);
    }

    public static /* synthetic */ void access$600(OSInAppMessageController oSInAppMessageController) {
        oSInAppMessageController.evaluateInAppMessages();
    }

    public static /* synthetic */ OSInAppMessagePrompt access$802(OSInAppMessageController oSInAppMessageController, OSInAppMessagePrompt oSInAppMessagePrompt) {
        oSInAppMessageController.currentPrompt = oSInAppMessagePrompt;
        return oSInAppMessagePrompt;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void attemptToShowInAppMessage() {
        ArrayList<OSInAppMessageInternal> arrayList;
        ArrayList<OSInAppMessageInternal> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            if (!this.systemConditionController.systemConditionsAvailable()) {
                this.logger.warning("In app message not showing due to system condition not correct");
                return;
            }
            OSLogger oSLogger = this.logger;
            Object object = new StringBuilder();
            object.append("displayFirstIAMOnQueue: ");
            object.append(this.messageDisplayQueue);
            oSLogger.debug(object.toString());
            if (this.messageDisplayQueue.size() > 0 && !this.isInAppMessageShowing()) {
                this.logger.debug("No IAM showing currently, showing first item in the queue!");
                this.displayMessage((OSInAppMessageInternal)this.messageDisplayQueue.get(0));
                return;
            }
            object = this.logger;
            oSLogger = new StringBuilder();
            oSLogger.append("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: ");
            oSLogger.append(this.isInAppMessageShowing());
            object.debug(oSLogger.toString());
            return;
        }
    }

    private void beginProcessingPrompts(OSInAppMessageInternal oSInAppMessageInternal, List<OSInAppMessagePrompt> list) {
        if (list.size() > 0) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = z2.t("IAM showing prompts from IAM: ");
            stringBuilder.append(oSInAppMessageInternal.toString());
            oSLogger.debug(stringBuilder.toString());
            WebViewManager.dismissCurrentInAppMessage();
            this.showMultiplePrompts(oSInAppMessageInternal, list);
        }
    }

    private void checkRedisplayMessagesAndEvaluate(Collection<String> collection) {
        this.makeRedisplayMessagesAvailableWithTriggers(collection);
        this.evaluateInAppMessages();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void dismissCurrentMessage(@Nullable OSInAppMessageInternal object) {
        ArrayList<OSInAppMessageInternal> arrayList;
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClickFinished();
        if (this.shouldWaitForPromptsBeforeDismiss()) {
            this.logger.debug("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.inAppMessageShowing = false;
        ArrayList<OSInAppMessageInternal> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            Object object2;
            if (object != null && !((OSInAppMessageInternal)object).isPreview && this.messageDisplayQueue.size() > 0) {
                if (!this.messageDisplayQueue.contains(object)) {
                    this.logger.debug("Message already removed from the queue!");
                    return;
                }
                String string2 = ((OSInAppMessageInternal)this.messageDisplayQueue.remove((int)0)).messageId;
                object2 = this.logger;
                object = new StringBuilder();
                object.append("In app message with id: ");
                object.append(string2);
                object.append(", dismissed (removed) from the queue!");
                object2.debug(object.toString());
            }
            if (this.messageDisplayQueue.size() > 0) {
                object = this.logger;
                object2 = new StringBuilder();
                object2.append("In app message on queue available: ");
                object2.append(((OSInAppMessageInternal)this.messageDisplayQueue.get((int)0)).messageId);
                object.debug(object2.toString());
                this.displayMessage((OSInAppMessageInternal)this.messageDisplayQueue.get(0));
            } else {
                this.logger.debug("In app message dismissed evaluating messages");
                this.evaluateInAppMessages();
            }
            return;
        }
    }

    private void displayMessage(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        if (!this.inAppMessagingEnabled) {
            this.logger.verbose("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.inAppMessageShowing = true;
        this.getTagsForLiquidTemplating(oSInAppMessageInternal, false);
        this.inAppMessageRepository.getIAMData(OneSignal.appId, oSInAppMessageInternal.messageId, this.variantIdForMessage(oSInAppMessageInternal), new OSInAppMessageRepository.OSInAppMessageRequestResponse(this, oSInAppMessageInternal){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageInternal val$message;
            {
                this.this$0 = oSInAppMessageController;
                this.val$message = oSInAppMessageInternal;
            }

            @Override
            public void onFailure(String string2) {
                OSInAppMessageController.access$1702(this.this$0, false);
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.getBoolean("retry")) {
                        this.this$0.queueMessageForDisplay(this.val$message);
                    } else {
                        this.this$0.messageWasDismissed(this.val$message, true);
                    }
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }

            @Override
            public void onSuccess(String object) {
                try {
                    JSONObject jSONObject = new JSONObject((String)object);
                    object = this.this$0.parseMessageContentData(jSONObject, this.val$message);
                    if (((OSInAppMessageContent)object).getContentHtml() == null) {
                        this.this$0.logger.debug("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                        return;
                    }
                    if (this.this$0.waitForTags) {
                        OSInAppMessageController.access$1502(this.this$0, (OSInAppMessageContent)object);
                        return;
                    }
                    OneSignal.getSessionManager().onInAppMessageReceived(this.val$message.messageId);
                    this.this$0.onMessageWillDisplay(this.val$message);
                    ((OSInAppMessageContent)object).setContentHtml(this.this$0.taggedHTMLString(((OSInAppMessageContent)object).getContentHtml()));
                    WebViewManager.showMessageContent(this.val$message, (OSInAppMessageContent)object);
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        });
    }

    private void evaluateInAppMessages() {
        this.logger.debug("Starting evaluateInAppMessages");
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue(new Runnable(this){
                public final OSInAppMessageController this$0;
                {
                    this.this$0 = oSInAppMessageController;
                }

                public void run() {
                    OSInAppMessageController.access$300(this.this$0).debug("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
                    OSInAppMessageController.access$600(this.this$0);
                }
            });
            return;
        }
        for (OSInAppMessageInternal oSInAppMessageInternal : this.messages) {
            if (!this.triggerController.evaluateMessageTriggers(oSInAppMessageInternal)) continue;
            this.setDataForRedisplay(oSInAppMessageInternal);
            if (this.dismissedMessages.contains((Object)oSInAppMessageInternal.messageId) || oSInAppMessageInternal.isFinished()) continue;
            this.queueMessageForDisplay(oSInAppMessageInternal);
        }
    }

    private void fireClickAction(@NonNull OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getClickUrl() != null && !oSInAppMessageAction.getClickUrl().isEmpty()) {
            if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
                OSUtils.openURLInBrowser(oSInAppMessageAction.getClickUrl());
            } else if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
                OneSignalChromeTab.open(oSInAppMessageAction.getClickUrl(), true);
            }
        }
    }

    private void fireOutcomesForClick(String string2, @NonNull List<OSInAppMessageOutcome> list) {
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(string2);
        OneSignal.sendClickActionOutcomes(list);
    }

    private void firePublicClickHandler(@NonNull String string2, @NonNull OSInAppMessageAction oSInAppMessageAction) {
        if (OneSignal.inAppMessageClickHandler == null) {
            return;
        }
        CallbackThreadManager.Companion.runOnPreferred(new Runnable(this, string2, oSInAppMessageAction){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageAction val$action;
            public final String val$messageId;
            {
                this.this$0 = oSInAppMessageController;
                this.val$messageId = string2;
                this.val$action = oSInAppMessageAction;
            }

            public void run() {
                OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(this.val$messageId);
                OneSignal.inAppMessageClickHandler.inAppMessageClicked(this.val$action);
            }
        });
    }

    private void fireRESTCallForClick(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull OSInAppMessageAction oSInAppMessageAction) {
        String string2 = this.variantIdForMessage(oSInAppMessageInternal);
        if (string2 == null) {
            return;
        }
        String string3 = oSInAppMessageAction.getClickId();
        boolean bl = oSInAppMessageInternal.getRedisplayStats().isRedisplayEnabled() && oSInAppMessageInternal.isClickAvailable(string3);
        if (!bl && this.clickedClickIds.contains((Object)string3)) {
            return;
        }
        this.clickedClickIds.add((Object)string3);
        oSInAppMessageInternal.addClickId(string3);
        this.inAppMessageRepository.sendIAMClick(OneSignal.appId, OneSignal.getUserId(), string2, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, string3, oSInAppMessageAction.isFirstClick(), this.clickedClickIds, new OSInAppMessageRepository.OSInAppMessageRequestResponse(this, string3, oSInAppMessageInternal){
            public final OSInAppMessageController this$0;
            public final String val$clickId;
            public final OSInAppMessageInternal val$message;
            {
                this.this$0 = oSInAppMessageController;
                this.val$clickId = string2;
                this.val$message = oSInAppMessageInternal;
            }

            @Override
            public void onFailure(String string2) {
                this.this$0.clickedClickIds.remove((Object)this.val$clickId);
                this.val$message.removeClickId(this.val$clickId);
            }

            @Override
            public void onSuccess(String string2) {
            }
        });
    }

    private void fireRESTCallForPageChange(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull OSInAppMessagePage object) {
        Object object2 = this.variantIdForMessage(oSInAppMessageInternal);
        if (object2 == null) {
            return;
        }
        String string2 = z2.s(new StringBuilder(), oSInAppMessageInternal.messageId, (String)(object = ((OSInAppMessagePage)object).getPageId()));
        if (this.viewedPageIds.contains((Object)string2)) {
            object2 = this.logger;
            oSInAppMessageInternal = new StringBuilder();
            oSInAppMessageInternal.append("Already sent page impression for id: ");
            oSInAppMessageInternal.append((String)object);
            object2.verbose(oSInAppMessageInternal.toString());
            return;
        }
        this.viewedPageIds.add((Object)string2);
        this.inAppMessageRepository.sendIAMPageImpression(OneSignal.appId, OneSignal.getUserId(), (String)object2, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, (String)object, this.viewedPageIds, new OSInAppMessageRepository.OSInAppMessageRequestResponse(this, string2){
            public final OSInAppMessageController this$0;
            public final String val$messagePrefixedPageId;
            {
                this.this$0 = oSInAppMessageController;
                this.val$messagePrefixedPageId = string2;
            }

            @Override
            public void onFailure(String string2) {
                this.this$0.viewedPageIds.remove((Object)this.val$messagePrefixedPageId);
            }

            @Override
            public void onSuccess(String string2) {
            }
        });
    }

    private void fireTagCallForClick(@NonNull OSInAppMessageAction object) {
        if (((OSInAppMessageAction)object).getTags() != null) {
            if (((OSInAppMessageTag)(object = ((OSInAppMessageAction)object).getTags())).getTagsToAdd() != null) {
                OneSignal.sendTags(((OSInAppMessageTag)object).getTagsToAdd());
            }
            if (((OSInAppMessageTag)object).getTagsToRemove() != null) {
                OneSignal.deleteTags(((OSInAppMessageTag)object).getTagsToRemove(), null);
            }
        }
    }

    private void getTagsForLiquidTemplating(@NonNull OSInAppMessageInternal oSInAppMessageInternal, boolean bl) {
        this.waitForTags = false;
        if (bl || oSInAppMessageInternal.getHasLiquid()) {
            this.waitForTags = true;
            OneSignal.getTags(new OneSignal.OSGetTagsHandler(this, bl, oSInAppMessageInternal){
                public final OSInAppMessageController this$0;
                public final boolean val$isPreview;
                public final OSInAppMessageInternal val$message;
                {
                    this.this$0 = oSInAppMessageController;
                    this.val$isPreview = bl;
                    this.val$message = oSInAppMessageInternal;
                }

                @Override
                public void tagsAvailable(JSONObject object) {
                    OSInAppMessageController.access$1302(this.this$0, false);
                    if (object != null) {
                        OSInAppMessageController.access$1402(this.this$0, object.toString());
                    }
                    if (this.this$0.pendingMessageContent != null) {
                        if (!this.val$isPreview) {
                            OneSignal.getSessionManager().onInAppMessageReceived(this.val$message.messageId);
                        }
                        object = this.this$0.pendingMessageContent;
                        OSInAppMessageController oSInAppMessageController = this.this$0;
                        ((OSInAppMessageContent)object).setContentHtml(oSInAppMessageController.taggedHTMLString(oSInAppMessageController.pendingMessageContent.getContentHtml()));
                        WebViewManager.showMessageContent(this.val$message, this.this$0.pendingMessageContent);
                        OSInAppMessageController.access$1502(this.this$0, null);
                    }
                }
            });
        }
    }

    private boolean hasMessageTriggerChanged(OSInAppMessageInternal oSInAppMessageInternal) {
        boolean bl = this.triggerController.messageHasOnlyDynamicTriggers(oSInAppMessageInternal);
        boolean bl2 = true;
        if (bl) {
            return oSInAppMessageInternal.isDisplayedInSession() ^ true;
        }
        boolean bl3 = !oSInAppMessageInternal.isDisplayedInSession() && oSInAppMessageInternal.triggers.isEmpty();
        bl = bl2;
        if (!oSInAppMessageInternal.isTriggerChanged()) {
            bl = bl3 ? bl2 : false;
        }
        return bl;
    }

    private void logInAppMessagePreviewActions(OSInAppMessageAction oSInAppMessageAction) {
        StringBuilder stringBuilder;
        OSLogger oSLogger;
        if (oSInAppMessageAction.getTags() != null) {
            oSLogger = this.logger;
            stringBuilder = z2.t("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ");
            stringBuilder.append(oSInAppMessageAction.getTags().toString());
            oSLogger.debug(stringBuilder.toString());
        }
        if (oSInAppMessageAction.getOutcomes().size() > 0) {
            oSLogger = this.logger;
            stringBuilder = z2.t("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ");
            stringBuilder.append(oSInAppMessageAction.getOutcomes().toString());
            oSLogger.debug(stringBuilder.toString());
        }
    }

    private void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection) {
        for (OSInAppMessageInternal oSInAppMessageInternal : this.messages) {
            if (oSInAppMessageInternal.isTriggerChanged() || !this.redisplayedInAppMessages.contains((Object)oSInAppMessageInternal) || !this.triggerController.isTriggerOnMessage(oSInAppMessageInternal, collection)) continue;
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = z2.t("Trigger changed for message: ");
            stringBuilder.append(oSInAppMessageInternal.toString());
            oSLogger.debug(stringBuilder.toString());
            oSInAppMessageInternal.setTriggerChanged(true);
        }
    }

    private OSInAppMessageContent parseMessageContentData(JSONObject object, OSInAppMessageInternal oSInAppMessageInternal) {
        object = new OSInAppMessageContent((JSONObject)object);
        oSInAppMessageInternal.setDisplayDuration(((OSInAppMessageContent)object).getDisplayDuration());
        return object;
    }

    private void persistInAppMessage(OSInAppMessageInternal oSInAppMessageInternal) {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        oSInAppMessageInternal.getRedisplayStats().setLastDisplayTime(l);
        oSInAppMessageInternal.getRedisplayStats().incrementDisplayQuantity();
        oSInAppMessageInternal.setTriggerChanged(false);
        oSInAppMessageInternal.setDisplayedInSession(true);
        this.runRunnableOnThread(new BackgroundRunnable(this, oSInAppMessageInternal){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageInternal val$message;
            {
                this.this$0 = oSInAppMessageController;
                this.val$message = oSInAppMessageInternal;
            }

            @Override
            public void run() {
                super.run();
                this.this$0.inAppMessageRepository.saveInAppMessage(this.val$message);
                this.this$0.inAppMessageRepository.saveLastTimeInAppDismissed(this.this$0.lastTimeInAppDismissed);
            }
        }, OS_IAM_DB_ACCESS);
        int n = this.redisplayedInAppMessages.indexOf((Object)oSInAppMessageInternal);
        if (n != -1) {
            this.redisplayedInAppMessages.set(n, (Object)oSInAppMessageInternal);
        } else {
            this.redisplayedInAppMessages.add((Object)oSInAppMessageInternal);
        }
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = z2.t("persistInAppMessageForRedisplay: ");
        stringBuilder.append(oSInAppMessageInternal.toString());
        stringBuilder.append(" with msg array data: ");
        stringBuilder.append(this.redisplayedInAppMessages.toString());
        oSLogger.debug(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void processInAppMessageJson(@NonNull JSONArray jSONArray) throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            ArrayList arrayList = new ArrayList();
            int n = 0;
            while (true) {
                if (n >= jSONArray.length()) {
                    this.messages = arrayList;
                    // MONITOREXIT @DISABLED, blocks:[3, 4, 6] lbl8 : w: MONITOREXIT : var7_3
                    this.evaluateInAppMessages();
                    return;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(n);
                OSInAppMessageInternal oSInAppMessageInternal = new OSInAppMessageInternal(jSONObject);
                if (oSInAppMessageInternal.messageId != null) {
                    arrayList.add((Object)oSInAppMessageInternal);
                }
                ++n;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void queueMessageForDisplay(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        ArrayList<OSInAppMessageInternal> arrayList;
        ArrayList<OSInAppMessageInternal> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            if (!this.messageDisplayQueue.contains((Object)oSInAppMessageInternal)) {
                this.messageDisplayQueue.add((Object)oSInAppMessageInternal);
                OSLogger oSLogger = this.logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("In app message with id: ");
                stringBuilder.append(oSInAppMessageInternal.messageId);
                stringBuilder.append(", added to the queue");
                oSLogger.debug(stringBuilder.toString());
            }
            this.attemptToShowInAppMessage();
            return;
        }
    }

    private void resetRedisplayMessagesBySession() {
        Iterator iterator = this.redisplayedInAppMessages.iterator();
        while (iterator.hasNext()) {
            ((OSInAppMessageInternal)iterator.next()).setDisplayedInSession(false);
        }
    }

    private void setDataForRedisplay(OSInAppMessageInternal oSInAppMessageInternal) {
        boolean bl = this.dismissedMessages.contains((Object)oSInAppMessageInternal.messageId);
        int n = this.redisplayedInAppMessages.indexOf((Object)oSInAppMessageInternal);
        if (bl && n != -1) {
            Object object = (OSInAppMessageInternal)this.redisplayedInAppMessages.get(n);
            oSInAppMessageInternal.getRedisplayStats().setDisplayStats(((OSInAppMessageInternal)object).getRedisplayStats());
            oSInAppMessageInternal.setDisplayedInSession(((OSInAppMessageInternal)object).isDisplayedInSession());
            bl = this.hasMessageTriggerChanged(oSInAppMessageInternal);
            object = this.logger;
            Object object2 = z2.t("setDataForRedisplay: ");
            object2.append(oSInAppMessageInternal.toString());
            object2.append(" triggerHasChanged: ");
            object2.append(bl);
            object.debug(object2.toString());
            if (bl && oSInAppMessageInternal.getRedisplayStats().isDelayTimeSatisfied() && oSInAppMessageInternal.getRedisplayStats().shouldDisplayAgain()) {
                object2 = this.logger;
                object = z2.t("setDataForRedisplay message available for redisplay: ");
                object.append(oSInAppMessageInternal.messageId);
                object2.debug(object.toString());
                this.dismissedMessages.remove((Object)oSInAppMessageInternal.messageId);
                this.impressionedMessages.remove((Object)oSInAppMessageInternal.messageId);
                this.viewedPageIds.clear();
                this.inAppMessageRepository.saveViewPageImpressionedIds(this.viewedPageIds);
                oSInAppMessageInternal.clearClickIds();
            }
        }
    }

    private boolean shouldWaitForPromptsBeforeDismiss() {
        boolean bl = this.currentPrompt != null;
        return bl;
    }

    private void showAlertDialogMessage(OSInAppMessageInternal oSInAppMessageInternal, List<OSInAppMessagePrompt> list) {
        String string2 = OneSignal.appContext.getString(R.string.location_permission_missing_title);
        String string3 = OneSignal.appContext.getString(R.string.location_permission_missing_message);
        new AlertDialog.Builder((Context)OneSignal.getCurrentActivity()).setTitle((CharSequence)string2).setMessage((CharSequence)string3).setPositiveButton(17039370, new DialogInterface.OnClickListener(this, oSInAppMessageInternal, list){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageInternal val$inAppMessage;
            public final List val$prompts;
            {
                this.this$0 = oSInAppMessageController;
                this.val$inAppMessage = oSInAppMessageInternal;
                this.val$prompts = list;
            }

            public void onClick(DialogInterface dialogInterface, int n) {
                OSInAppMessageController.access$1000(this.this$0, this.val$inAppMessage, this.val$prompts);
            }
        }).show();
    }

    private void showMultiplePrompts(OSInAppMessageInternal oSInAppMessageInternal, List<OSInAppMessagePrompt> object) {
        Object object2;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object2 = (OSInAppMessagePrompt)iterator.next();
            if (((OSInAppMessagePrompt)object2).hasPrompted()) continue;
            this.currentPrompt = object2;
            break;
        }
        if (this.currentPrompt != null) {
            object2 = this.logger;
            iterator = z2.t("IAM prompt to handle: ");
            iterator.append(this.currentPrompt.toString());
            object2.debug(iterator.toString());
            this.currentPrompt.setPrompted(true);
            this.currentPrompt.handlePrompt(new OneSignal.OSPromptActionCompletionCallback(this, oSInAppMessageInternal, (List)object){
                public final OSInAppMessageController this$0;
                public final OSInAppMessageInternal val$inAppMessage;
                public final List val$prompts;
                {
                    this.this$0 = oSInAppMessageController;
                    this.val$inAppMessage = oSInAppMessageInternal;
                    this.val$prompts = list;
                }

                @Override
                public void onCompleted(OneSignal.PromptActionResult promptActionResult) {
                    OSInAppMessageController.access$802(this.this$0, null);
                    Object object = this.this$0.logger;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("IAM prompt to handle finished with result: ");
                    stringBuilder.append((Object)promptActionResult);
                    object.debug(stringBuilder.toString());
                    object = this.val$inAppMessage;
                    if (((OSInAppMessageInternal)object).isPreview && promptActionResult == OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        this.this$0.showAlertDialogMessage((OSInAppMessageInternal)object, (List<OSInAppMessagePrompt>)this.val$prompts);
                    } else {
                        this.this$0.showMultiplePrompts((OSInAppMessageInternal)object, (List<OSInAppMessagePrompt>)this.val$prompts);
                    }
                }
            });
        } else {
            object = this.logger;
            object2 = z2.t("No IAM prompt to handle, dismiss message: ");
            object2.append(oSInAppMessageInternal.messageId);
            object.debug(object2.toString());
            this.messageWasDismissed(oSInAppMessageInternal);
        }
    }

    @Nullable
    private String variantIdForMessage(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        String string2 = this.languageContext.getLanguage();
        for (String string3 : PREFERRED_VARIANT_ORDER) {
            if (!oSInAppMessageInternal.variants.containsKey((Object)string3)) continue;
            oSInAppMessageInternal = (HashMap)oSInAppMessageInternal.variants.get((Object)string3);
            if (oSInAppMessageInternal.containsKey(string2)) {
                return (String)oSInAppMessageInternal.get(string2);
            }
            return (String)oSInAppMessageInternal.get("default");
        }
        return null;
    }

    public void addTriggers(@NonNull Map<String, Object> map) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = z2.t("Triggers added: ");
        stringBuilder.append(map.toString());
        oSLogger.debug(stringBuilder.toString());
        this.triggerController.addTriggers(map);
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue(new Runnable(this, map){
                public final OSInAppMessageController this$0;
                public final Map val$newTriggers;
                {
                    this.this$0 = oSInAppMessageController;
                    this.val$newTriggers = map;
                }

                public void run() {
                    OSInAppMessageController.access$300(this.this$0).debug("Delaying addTriggers due to redisplay data not retrieved yet");
                    OSInAppMessageController.access$2000(this.this$0, (Collection)this.val$newTriggers.keySet());
                }
            });
        } else {
            this.checkRedisplayMessagesAndEvaluate((Collection<String>)map.keySet());
        }
    }

    public void cleanCachedInAppMessages() {
        this.runRunnableOnThread(new BackgroundRunnable(this){
            public final OSInAppMessageController this$0;
            {
                this.this$0 = oSInAppMessageController;
            }

            @Override
            public void run() {
                super.run();
                this.this$0.inAppMessageRepository.cleanCachedInAppMessages();
            }
        }, OS_IAM_DB_ACCESS);
    }

    public void displayPreviewMessage(@NonNull String string2) {
        this.inAppMessageShowing = true;
        OSInAppMessageInternal oSInAppMessageInternal = new OSInAppMessageInternal(true);
        this.getTagsForLiquidTemplating(oSInAppMessageInternal, true);
        this.inAppMessageRepository.getIAMPreviewData(OneSignal.appId, string2, new OSInAppMessageRepository.OSInAppMessageRequestResponse(this, oSInAppMessageInternal){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageInternal val$message;
            {
                this.this$0 = oSInAppMessageController;
                this.val$message = oSInAppMessageInternal;
            }

            @Override
            public void onFailure(String string2) {
                this.this$0.dismissCurrentMessage(null);
            }

            @Override
            public void onSuccess(String object) {
                try {
                    JSONObject jSONObject = new JSONObject((String)object);
                    object = this.this$0.parseMessageContentData(jSONObject, this.val$message);
                    if (((OSInAppMessageContent)object).getContentHtml() == null) {
                        this.this$0.logger.debug("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                        return;
                    }
                    if (this.this$0.waitForTags) {
                        OSInAppMessageController.access$1502(this.this$0, (OSInAppMessageContent)object);
                        return;
                    }
                    this.this$0.onMessageWillDisplay(this.val$message);
                    ((OSInAppMessageContent)object).setContentHtml(this.this$0.taggedHTMLString(((OSInAppMessageContent)object).getContentHtml()));
                    WebViewManager.showMessageContent(this.val$message, (OSInAppMessageContent)object);
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void executeRedisplayIAMDataDependantTask(Runnable runnable) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.shouldRunTaskThroughQueue()) {
                this.logger.debug("Delaying task due to redisplay data not retrieved yet");
                this.taskController.addTaskToQueue(runnable);
            } else {
                runnable.run();
            }
            return;
        }
    }

    @Nullable
    public OSInAppMessageInternal getCurrentDisplayedInAppMessage() {
        OSInAppMessageInternal oSInAppMessageInternal = this.inAppMessageShowing ? (OSInAppMessageInternal)this.messageDisplayQueue.get(0) : null;
        return oSInAppMessageInternal;
    }

    @NonNull
    public ArrayList<OSInAppMessageInternal> getInAppMessageDisplayQueue() {
        return this.messageDisplayQueue;
    }

    public OSInAppMessageRepository getInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences) {
        if (this.inAppMessageRepository == null) {
            this.inAppMessageRepository = new OSInAppMessageRepository(oneSignalDbHelper, oSLogger, oSSharedPreferences);
        }
        return this.inAppMessageRepository;
    }

    @NonNull
    public List<OSInAppMessageInternal> getRedisplayedInAppMessages() {
        return this.redisplayedInAppMessages;
    }

    @Nullable
    public Object getTriggerValue(String string2) {
        return this.triggerController.getTriggerValue(string2);
    }

    public Map<String, Object> getTriggers() {
        return new HashMap(this.triggerController.getTriggers());
    }

    public boolean inAppMessagingEnabled() {
        return this.inAppMessagingEnabled;
    }

    public void initRedisplayData() {
        BackgroundRunnable backgroundRunnable = new BackgroundRunnable(this){
            public final OSInAppMessageController this$0;
            {
                this.this$0 = oSInAppMessageController;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Object object;
                super.run();
                Object object2 = object = LOCK;
                synchronized (object2) {
                    OSInAppMessageController oSInAppMessageController = this.this$0;
                    OSInAppMessageController.access$102(oSInAppMessageController, oSInAppMessageController.inAppMessageRepository.getCachedInAppMessages());
                    OSLogger oSLogger = this.this$0.logger;
                    oSInAppMessageController = new StringBuilder();
                    oSInAppMessageController.append("Retrieved IAMs from DB redisplayedInAppMessages: ");
                    oSInAppMessageController.append(this.this$0.redisplayedInAppMessages.toString());
                    oSLogger.debug(oSInAppMessageController.toString());
                    return;
                }
            }
        };
        this.taskController.addTaskToQueue(backgroundRunnable);
        this.taskController.startPendingTasks();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void initWithCachedInAppMessages() {
        if (!this.messages.isEmpty()) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = z2.t("initWithCachedInAppMessages with already in memory messages: ");
            stringBuilder.append(this.messages);
            oSLogger.debug(stringBuilder.toString());
            return;
        }
        String string2 = this.inAppMessageRepository.getSavedIAMs();
        Object object = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initWithCachedInAppMessages: ");
        stringBuilder.append(string2);
        object.debug(stringBuilder.toString());
        if (string2 == null) return;
        if (string2.isEmpty()) {
            return;
        }
        Object object2 = object = LOCK;
        synchronized (object2) {
            try {
                block8: {
                    boolean bl = this.messages.isEmpty();
                    if (bl) break block8;
                    return;
                }
                try {
                    stringBuilder = new JSONArray(string2);
                    this.processInAppMessageJson((JSONArray)stringBuilder);
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public boolean isInAppMessageShowing() {
        return this.inAppMessageShowing;
    }

    @Override
    public void messageDynamicTriggerCompleted(String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("messageDynamicTriggerCompleted called with triggerId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        oSLogger = new HashSet();
        oSLogger.add(string2);
        this.makeRedisplayMessagesAvailableWithTriggers((Collection<String>)oSLogger);
    }

    @Override
    public void messageTriggerConditionChanged() {
        this.logger.debug("messageTriggerConditionChanged called");
        this.evaluateInAppMessages();
    }

    public void messageWasDismissed(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        this.messageWasDismissed(oSInAppMessageInternal, false);
    }

    public void messageWasDismissed(@NonNull OSInAppMessageInternal oSInAppMessageInternal, boolean bl) {
        if (!oSInAppMessageInternal.isPreview) {
            this.dismissedMessages.add((Object)oSInAppMessageInternal.messageId);
            if (!bl) {
                this.inAppMessageRepository.saveDismissedMessagesId(this.dismissedMessages);
                this.lastTimeInAppDismissed = new Date();
                this.persistInAppMessage(oSInAppMessageInternal);
            }
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = z2.t("OSInAppMessageController messageWasDismissed dismissedMessages: ");
            stringBuilder.append(this.dismissedMessages.toString());
            oSLogger.debug(stringBuilder.toString());
        }
        if (!this.shouldWaitForPromptsBeforeDismiss()) {
            this.onMessageDidDismiss(oSInAppMessageInternal);
        }
        this.dismissCurrentMessage(oSInAppMessageInternal);
    }

    public void onMessageActionOccurredOnMessage(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull JSONObject object) throws JSONException {
        object = new OSInAppMessageAction((JSONObject)object);
        ((OSInAppMessageAction)object).setFirstClick(oSInAppMessageInternal.takeActionAsUnique());
        this.firePublicClickHandler(oSInAppMessageInternal.messageId, (OSInAppMessageAction)object);
        this.beginProcessingPrompts(oSInAppMessageInternal, ((OSInAppMessageAction)object).getPrompts());
        this.fireClickAction((OSInAppMessageAction)object);
        this.fireRESTCallForClick(oSInAppMessageInternal, (OSInAppMessageAction)object);
        this.fireTagCallForClick((OSInAppMessageAction)object);
        this.fireOutcomesForClick(oSInAppMessageInternal.messageId, ((OSInAppMessageAction)object).getOutcomes());
    }

    public void onMessageActionOccurredOnPreview(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull JSONObject object) throws JSONException {
        object = new OSInAppMessageAction((JSONObject)object);
        ((OSInAppMessageAction)object).setFirstClick(oSInAppMessageInternal.takeActionAsUnique());
        this.firePublicClickHandler(oSInAppMessageInternal.messageId, (OSInAppMessageAction)object);
        this.beginProcessingPrompts(oSInAppMessageInternal, ((OSInAppMessageAction)object).getPrompts());
        this.fireClickAction((OSInAppMessageAction)object);
        this.logInAppMessagePreviewActions((OSInAppMessageAction)object);
    }

    public void onMessageDidDismiss(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
            return;
        }
        oSInAppMessageLifecycleHandler.onDidDismissInAppMessage(oSInAppMessageInternal);
    }

    public void onMessageDidDisplay(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
            return;
        }
        oSInAppMessageLifecycleHandler.onDidDisplayInAppMessage(oSInAppMessageInternal);
    }

    public void onMessageWasShown(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        this.onMessageDidDisplay(oSInAppMessageInternal);
        if (oSInAppMessageInternal.isPreview) {
            return;
        }
        if (this.impressionedMessages.contains((Object)oSInAppMessageInternal.messageId)) {
            return;
        }
        this.impressionedMessages.add((Object)oSInAppMessageInternal.messageId);
        String string2 = this.variantIdForMessage(oSInAppMessageInternal);
        if (string2 == null) {
            return;
        }
        this.inAppMessageRepository.sendIAMImpression(OneSignal.appId, OneSignal.getUserId(), string2, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, this.impressionedMessages, new OSInAppMessageRepository.OSInAppMessageRequestResponse(this, oSInAppMessageInternal){
            public final OSInAppMessageController this$0;
            public final OSInAppMessageInternal val$message;
            {
                this.this$0 = oSInAppMessageController;
                this.val$message = oSInAppMessageInternal;
            }

            @Override
            public void onFailure(String string2) {
                this.this$0.impressionedMessages.remove((Object)this.val$message.messageId);
            }

            @Override
            public void onSuccess(String string2) {
            }
        });
    }

    public void onMessageWillDismiss(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
            return;
        }
        oSInAppMessageLifecycleHandler.onWillDismissInAppMessage(oSInAppMessageInternal);
    }

    public void onMessageWillDisplay(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
            return;
        }
        oSInAppMessageLifecycleHandler.onWillDisplayInAppMessage(oSInAppMessageInternal);
    }

    public void onPageChanged(@NonNull OSInAppMessageInternal oSInAppMessageInternal, @NonNull JSONObject object) {
        object = new OSInAppMessagePage((JSONObject)object);
        if (oSInAppMessageInternal.isPreview) {
            return;
        }
        this.fireRESTCallForPageChange(oSInAppMessageInternal, (OSInAppMessagePage)object);
    }

    public void receivedInAppMessageJson(@NonNull JSONArray jSONArray) throws JSONException {
        this.inAppMessageRepository.saveIAMs(jSONArray.toString());
        this.executeRedisplayIAMDataDependantTask(new Runnable(this, jSONArray){
            public final OSInAppMessageController this$0;
            public final JSONArray val$json;
            {
                this.this$0 = oSInAppMessageController;
                this.val$json = jSONArray;
            }

            public void run() {
                OSInAppMessageController.access$400(this.this$0);
                try {
                    OSInAppMessageController.access$500(this.this$0, this.val$json);
                }
                catch (JSONException jSONException) {
                    OSInAppMessageController.access$300(this.this$0).error("ERROR processing InAppMessageJson JSON Response.", jSONException);
                }
            }
        });
    }

    public void removeTriggersForKeys(Collection<String> collection) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = z2.t("Triggers key to remove: ");
        stringBuilder.append(collection.toString());
        oSLogger.debug(stringBuilder.toString());
        this.triggerController.removeTriggersForKeys(collection);
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue(new Runnable(this, collection){
                public final OSInAppMessageController this$0;
                public final Collection val$keys;
                {
                    this.this$0 = oSInAppMessageController;
                    this.val$keys = collection;
                }

                public void run() {
                    OSInAppMessageController.access$300(this.this$0).debug("Delaying removeTriggersForKeys due to redisplay data not retrieved yet");
                    OSInAppMessageController.access$2000(this.this$0, this.val$keys);
                }
            });
        } else {
            this.checkRedisplayMessagesAndEvaluate(collection);
        }
    }

    public void resetSessionLaunchTime() {
        OSDynamicTriggerController.resetSessionLaunchTime();
    }

    public void setInAppMessageLifecycleHandler(@Nullable OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler) {
        this.inAppMessageLifecycleHandler = oSInAppMessageLifecycleHandler;
    }

    public void setInAppMessagingEnabled(boolean bl) {
        this.inAppMessagingEnabled = bl;
        if (bl) {
            this.evaluateInAppMessages();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean shouldRunTaskThroughQueue() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.redisplayedInAppMessages != null) return false;
            if (!this.taskController.shouldRunTaskThroughQueue()) return false;
            return true;
        }
    }

    @Override
    public void systemConditionChanged() {
        this.attemptToShowInAppMessage();
    }

    @NonNull
    public String taggedHTMLString(@NonNull String string2) {
        String string3 = this.userTagsString;
        string2 = z2.t(string2);
        string2.append(String.format((String)LIQUID_TAG_SCRIPT, (Object[])new Object[]{string3}));
        return string2.toString();
    }
}

