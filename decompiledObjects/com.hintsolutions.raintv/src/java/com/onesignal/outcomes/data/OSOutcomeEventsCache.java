/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  androidx.annotation.WorkerThread
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.onesignal.outcomes.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.WorkerThread;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalDb;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.domain.OSCachedUniqueOutcome;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(d1={"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0007J4\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010&H\u0002J$\u0010-\u001a\b\u0012\u0004\u0012\u00020.0$2\u0006\u0010/\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020.0$H\u0007J*\u00101\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007J\u0018\u00106\u001a\u00020\u00122\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rJ\u0010\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00069"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "", "logger", "Lcom/onesignal/OSLogger;", "dbHelper", "Lcom/onesignal/OneSignalDb;", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/OneSignalDb;Lcom/onesignal/OSSharedPreferences;)V", "isOutcomesV2ServiceEnabled", "", "()Z", "unattributedUniqueOutcomeEventsSentByChannel", "", "", "getUnattributedUniqueOutcomeEventsSentByChannel", "()Ljava/util/Set;", "addIdToListFromChannel", "", "cachedUniqueOutcomes", "", "Lcom/onesignal/outcomes/domain/OSCachedUniqueOutcome;", "channelIds", "Lorg/json/JSONArray;", "channel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "addIdsToListFromSource", "sourceBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "cleanCachedUniqueOutcomeEventNotifications", "notificationTableName", "notificationIdColumnName", "deleteOldOutcomeEvent", "event", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getAllEventsToSend", "", "getIAMInfluenceSource", "Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "iamInfluenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "directSourceBody", "indirectSourceBody", "iamIds", "source", "getNotCachedUniqueInfluencesForOutcome", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getNotificationInfluenceSource", "notificationInfluenceType", "notificationIds", "saveOutcomeEvent", "eventParams", "saveUnattributedUniqueOutcomeEventsSentByChannel", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeEventParams", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeEventsCache {
    @NotNull
    private final OneSignalDb dbHelper;
    @NotNull
    private final OSLogger logger;
    @NotNull
    private final OSSharedPreferences preferences;

    public OSOutcomeEventsCache(@NotNull OSLogger oSLogger, @NotNull OneSignalDb oneSignalDb, @NotNull OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oneSignalDb, (String)"dbHelper");
        Intrinsics.checkNotNullParameter((Object)oSSharedPreferences, (String)"preferences");
        this.logger = oSLogger;
        this.dbHelper = oneSignalDb;
        this.preferences = oSSharedPreferences;
    }

    private final void addIdToListFromChannel(List<OSCachedUniqueOutcome> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        if (jSONArray != null) {
            int n = 0;
            int n2 = jSONArray.length();
            if (n2 > 0) {
                while (true) {
                    int n3 = n + 1;
                    try {
                        String string2 = jSONArray.getString(n);
                        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"influenceId");
                        OSCachedUniqueOutcome oSCachedUniqueOutcome = new OSCachedUniqueOutcome(string2, oSInfluenceChannel);
                        list.add((Object)oSCachedUniqueOutcome);
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                    }
                    if (n3 >= n2) break;
                    n = n3;
                }
            }
        }
    }

    private final void addIdsToListFromSource(List<OSCachedUniqueOutcome> list, OSOutcomeSourceBody oSOutcomeSourceBody) {
        if (oSOutcomeSourceBody != null) {
            JSONArray jSONArray = oSOutcomeSourceBody.getInAppMessagesIds();
            oSOutcomeSourceBody = oSOutcomeSourceBody.getNotificationIds();
            this.addIdToListFromChannel(list, jSONArray, OSInfluenceChannel.IAM);
            this.addIdToListFromChannel(list, (JSONArray)oSOutcomeSourceBody, OSInfluenceChannel.NOTIFICATION);
        }
    }

    private final OSOutcomeSource getIAMInfluenceSource(OSInfluenceType object, OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2, String string2, OSOutcomeSource object2) {
        int n = WhenMappings.$EnumSwitchMapping$0[object.ordinal()];
        if (n != 1) {
            if (n == 2) {
                oSOutcomeSourceBody2.setInAppMessagesIds(new JSONArray(string2));
                object = object2 == null ? null : object2.setIndirectBody(oSOutcomeSourceBody2);
                object2 = object;
                if (object == null) {
                    object2 = new OSOutcomeSource(null, oSOutcomeSourceBody2);
                }
            }
        } else {
            oSOutcomeSourceBody.setInAppMessagesIds(new JSONArray(string2));
            object = object2 == null ? null : object2.setDirectBody(oSOutcomeSourceBody);
            object2 = object;
            if (object == null) {
                object2 = new OSOutcomeSource(oSOutcomeSourceBody, null);
            }
        }
        return object2;
    }

    private final OSOutcomeSource getNotificationInfluenceSource(OSInfluenceType object, OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2, String string2) {
        int n = WhenMappings.$EnumSwitchMapping$0[object.ordinal()];
        object = null;
        if (n != 1) {
            if (n == 2) {
                oSOutcomeSourceBody2.setNotificationIds(new JSONArray(string2));
                object = new OSOutcomeSource(null, oSOutcomeSourceBody2);
            }
        } else {
            oSOutcomeSourceBody.setNotificationIds(new JSONArray(string2));
            object = new OSOutcomeSource(oSOutcomeSourceBody, null);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public final void cleanCachedUniqueOutcomeEventNotifications(@NotNull String object, @NotNull String string2) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            String string3;
            Intrinsics.checkNotNullParameter((Object)object, (String)"notificationTableName");
            Intrinsics.checkNotNullParameter((Object)string3, (String)"notificationIdColumnName");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NOT EXISTS(SELECT NULL FROM ");
            stringBuilder.append(object);
            stringBuilder.append(" n WHERE n.");
            stringBuilder.append(string3);
            stringBuilder.append(" = channel_influence_id AND channel_type = \"");
            string3 = OSInfluenceChannel.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue((Object)locale, (String)"ROOT");
            if (string3 != null) {
                String string4 = string3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"(this as java.lang.String).toLowerCase(locale)");
                stringBuilder.append(string4);
                stringBuilder.append("\")");
                String string5 = stringBuilder.toString();
                this.dbHelper.delete("cached_unique_outcome", string5, null);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw nullPointerException;
        }
    }

    @WorkerThread
    public final void deleteOldOutcomeEvent(@NotNull OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Intrinsics.checkNotNullParameter((Object)oSOutcomeEventParams, (String)"event");
            this.dbHelper.delete("outcome", "timestamp = ?", new String[]{String.valueOf((long)oSOutcomeEventParams.getTimestamp())});
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @NotNull
    public final List<OSOutcomeEventParams> getAllEventsToSend() {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Throwable throwable;
            Object object;
            block15: {
                Cursor cursor;
                ArrayList arrayList;
                block16: {
                    arrayList = new ArrayList();
                    object = null;
                    try {
                        cursor = this.dbHelper.query("outcome", null, null, null, null, null, null);
                    }
                    catch (Throwable throwable2) {
                        // empty catch block
                        break block15;
                    }
                    try {
                        boolean bl;
                        if (!cursor.moveToFirst()) break block16;
                        do {
                            Object object2;
                            Object object3 = cursor.getString(cursor.getColumnIndex("notification_influence_type"));
                            object = OSInfluenceType.Companion;
                            OSInfluenceType oSInfluenceType = ((OSInfluenceType.Companion)object).fromString((String)object3);
                            OSInfluenceType oSInfluenceType2 = ((OSInfluenceType.Companion)object).fromString(cursor.getString(cursor.getColumnIndex("iam_influence_type")));
                            object = object3 = cursor.getString(cursor.getColumnIndex("notification_ids"));
                            if (object3 == null) {
                                object = "[]";
                            }
                            object3 = object2 = cursor.getString(cursor.getColumnIndex("iam_ids"));
                            if (object2 == null) {
                                object3 = "[]";
                            }
                            String string2 = cursor.getString(cursor.getColumnIndex("name"));
                            float f = cursor.getFloat(cursor.getColumnIndex("weight"));
                            long l = cursor.getLong(cursor.getColumnIndex("timestamp"));
                            try {
                                OSOutcomeSourceBody oSOutcomeSourceBody = new OSOutcomeSourceBody(null, null, 3, null);
                                OSOutcomeSourceBody oSOutcomeSourceBody2 = new OSOutcomeSourceBody(null, null, 3, null);
                                object2 = this.getNotificationInfluenceSource(oSInfluenceType, oSOutcomeSourceBody, oSOutcomeSourceBody2, (String)object);
                                this.getIAMInfluenceSource(oSInfluenceType2, oSOutcomeSourceBody, oSOutcomeSourceBody2, (String)object3, (OSOutcomeSource)object2);
                                object = object2;
                                if (object2 == null) {
                                    object = new OSOutcomeSource(null, null);
                                }
                                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"name");
                                object3 = new OSOutcomeEventParams(string2, (OSOutcomeSource)object, f, l);
                                arrayList.add(object3);
                            }
                            catch (JSONException jSONException) {
                                this.logger.error("Generating JSONArray from notifications ids outcome:JSON Failed.", jSONException);
                            }
                        } while (bl = cursor.moveToNext());
                    }
                    catch (Throwable throwable3) {
                        throwable = throwable3;
                        object = cursor;
                        break block15;
                    }
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
                return arrayList;
            }
            if (object != null && !object.isClosed()) {
                object.close();
            }
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @NotNull
    public final List<OSInfluence> getNotCachedUniqueInfluencesForOutcome(@NotNull String string2, @NotNull List<OSInfluence> object) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Throwable throwable222;
            Object object2;
            block20: {
                ArrayList arrayList;
                block19: {
                    block21: {
                        block18: {
                            Intrinsics.checkNotNullParameter((Object)string2, (String)"name");
                            Intrinsics.checkNotNullParameter(object, (String)"influences");
                            arrayList = new ArrayList();
                            object2 = null;
                            Object object3 = null;
                            Object object4 = null;
                            Iterator iterator = object.iterator();
                            object = object4;
                            while (true) {
                                object2 = object;
                                object3 = object;
                                if (!iterator.hasNext()) break;
                                object2 = object;
                                object3 = object;
                                OSInfluence oSInfluence = (OSInfluence)iterator.next();
                                object2 = object;
                                object3 = object;
                                object2 = object;
                                object3 = object;
                                JSONArray jSONArray = new JSONArray();
                                object2 = object;
                                object3 = object;
                                JSONArray jSONArray2 = oSInfluence.getIds();
                                if (jSONArray2 == null) continue;
                                object2 = object;
                                object3 = object;
                                int n = jSONArray2.length();
                                object4 = object;
                                if (n > 0) {
                                    int n2 = 0;
                                    while (true) {
                                        int n3 = n2 + 1;
                                        object2 = object;
                                        object3 = object;
                                        object4 = jSONArray2.getString(n2);
                                        object2 = object;
                                        object3 = object;
                                        String string3 = oSInfluence.getInfluenceChannel().toString();
                                        object2 = object;
                                        object3 = object;
                                        object = this.dbHelper.query("cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{object4, string3, string2}, null, null, null, "1");
                                        object2 = object;
                                        object3 = object;
                                        if (object.getCount() == 0) {
                                            object2 = object;
                                            object3 = object;
                                            jSONArray.put(object4);
                                        }
                                        if (n3 >= n) {
                                            object4 = object;
                                            break;
                                        }
                                        n2 = n3;
                                    }
                                }
                                object = object4;
                                object2 = object4;
                                object3 = object4;
                                if (jSONArray.length() <= 0) continue;
                                object2 = object4;
                                object3 = object4;
                                object = oSInfluence.copy();
                                object2 = object4;
                                object3 = object4;
                                ((OSInfluence)object).setIds(jSONArray);
                                object2 = object4;
                                object3 = object4;
                                arrayList.add(object);
                                object = object4;
                            }
                            if (object != null) break block18;
                            break block19;
                            {
                                boolean bl;
                                catch (Throwable throwable222) {
                                    break block20;
                                }
                                catch (JSONException jSONException) {}
                                object2 = object3;
                                {
                                    jSONException.printStackTrace();
                                }
                                if (object3 == null || (bl = object3.isClosed())) break block19;
                                object = object3;
                                break block21;
                            }
                        }
                        if (object.isClosed()) break block19;
                    }
                    object.close();
                }
                return arrayList;
            }
            if (object2 != null && !object2.isClosed()) {
                object2.close();
            }
            throw throwable222;
        }
    }

    @Nullable
    public final Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getStringSet(oSSharedPreferences.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    public final boolean isOutcomesV2ServiceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), this.preferences.getOutcomesV2KeyName(), false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public final void saveOutcomeEvent(@NotNull OSOutcomeEventParams object) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            void var4_38;
            void var5_20;
            void var6_50;
            void var2_25;
            void var5_14;
            void var3_5;
            OSOutcomeSourceBody oSOutcomeSourceBody;
            Intrinsics.checkNotNullParameter((Object)object, (String)"eventParams");
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            OSInfluenceType oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
            OSOutcomeSource oSOutcomeSource = ((OSOutcomeEventParams)object).getOutcomeSource();
            if (oSOutcomeSource == null || (oSOutcomeSourceBody = oSOutcomeSource.getDirectBody()) == null) {
                OSInfluenceType oSInfluenceType2 = oSInfluenceType;
            } else {
                void var2_23;
                void var4_34;
                JSONArray jSONArray3 = oSOutcomeSourceBody.getNotificationIds();
                if (jSONArray3 != null && jSONArray3.length() > 0) {
                    OSInfluenceType oSInfluenceType3 = OSInfluenceType.DIRECT;
                    JSONArray jSONArray4 = jSONArray3;
                    OSInfluenceType oSInfluenceType4 = oSInfluenceType3;
                } else {
                    OSInfluenceType oSInfluenceType5 = oSInfluenceType;
                }
                JSONArray jSONArray5 = oSOutcomeSourceBody.getInAppMessagesIds();
                if (jSONArray5 != null && jSONArray5.length() > 0) {
                    OSInfluenceType oSInfluenceType6 = OSInfluenceType.DIRECT;
                    JSONArray jSONArray6 = jSONArray5;
                }
                void var6_42 = var4_34;
                void var4_35 = var2_23;
                void var2_24 = var6_42;
            }
            OSOutcomeSource oSOutcomeSource2 = ((OSOutcomeEventParams)object).getOutcomeSource();
            if (oSOutcomeSource2 == null) {
                void var6_44 = var3_5;
                oSOutcomeSourceBody = var5_14;
                void var5_15 = var2_25;
            } else {
                oSOutcomeSourceBody = oSOutcomeSource2.getIndirectBody();
                if (oSOutcomeSourceBody == null) {
                    void var6_45 = var3_5;
                    oSOutcomeSourceBody = var5_14;
                    void var5_16 = var2_25;
                } else {
                    void var2_27;
                    void var3_7;
                    JSONArray jSONArray7;
                    JSONArray jSONArray8 = oSOutcomeSourceBody.getNotificationIds();
                    if (jSONArray8 != null && jSONArray8.length() > 0) {
                        OSInfluenceType oSInfluenceType7 = OSInfluenceType.INDIRECT;
                        JSONArray jSONArray9 = jSONArray8;
                    }
                    if ((jSONArray7 = oSOutcomeSourceBody.getInAppMessagesIds()) == null) {
                        void var6_47 = var3_7;
                        oSOutcomeSourceBody = var5_14;
                        void var5_17 = var2_27;
                    } else {
                        void var6_48 = var3_7;
                        oSOutcomeSourceBody = var5_14;
                        void var5_18 = var2_27;
                        if (jSONArray7.length() > 0) {
                            OSInfluenceType oSInfluenceType8 = OSInfluenceType.INDIRECT;
                            oSOutcomeSourceBody = jSONArray7;
                            void var5_19 = var2_27;
                            void var6_49 = var3_7;
                        }
                    }
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("notification_ids", var6_50.toString());
            contentValues.put("iam_ids", oSOutcomeSourceBody.toString());
            String string2 = var5_20.toString();
            if (string2 == null) {
                object = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw object;
            }
            String string3 = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", string3);
            String string4 = var4_38.toString();
            if (string4 != null) {
                String string5 = string4.toLowerCase();
                Intrinsics.checkNotNullExpressionValue((Object)string5, (String)"(this as java.lang.String).toLowerCase()");
                contentValues.put("iam_influence_type", string5);
                contentValues.put("name", ((OSOutcomeEventParams)object).getOutcomeId());
                contentValues.put("weight", Float.valueOf((float)((OSOutcomeEventParams)object).getWeight()));
                contentValues.put("timestamp", Long.valueOf((long)((OSOutcomeEventParams)object).getTimestamp()));
                this.dbHelper.insert("outcome", null, contentValues);
                return;
            }
            object = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw object;
        }
    }

    public final void saveUnattributedUniqueOutcomeEventsSentByChannel(@Nullable Set<String> set) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        String string2 = oSSharedPreferences.getPreferencesName();
        Intrinsics.checkNotNull(set);
        oSSharedPreferences.saveStringSet(string2, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    public final void saveUniqueOutcomeEventParams(@NotNull OSOutcomeEventParams object) {
        OSOutcomeEventsCache oSOutcomeEventsCache = this;
        synchronized (oSOutcomeEventsCache) {
            Intrinsics.checkNotNullParameter((Object)object, (String)"eventParams");
            this.logger.debug(Intrinsics.stringPlus((String)"OneSignal saveUniqueOutcomeEventParams: ", (Object)object));
            String string2 = ((OSOutcomeEventParams)object).getOutcomeId();
            Object object2 = new ArrayList();
            Object object3 = ((OSOutcomeEventParams)object).getOutcomeSource();
            object3 = object3 == null ? null : ((OSOutcomeSource)object3).getDirectBody();
            object = ((OSOutcomeEventParams)object).getOutcomeSource();
            object = object == null ? null : ((OSOutcomeSource)object).getIndirectBody();
            this.addIdsToListFromSource((List<OSCachedUniqueOutcome>)object2, (OSOutcomeSourceBody)object3);
            this.addIdsToListFromSource((List<OSCachedUniqueOutcome>)object2, (OSOutcomeSourceBody)object);
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = (OSCachedUniqueOutcome)object.next();
                object3 = new ContentValues();
                object3.put("channel_influence_id", ((OSCachedUniqueOutcome)object2).getInfluenceId());
                object3.put("channel_type", ((OSCachedUniqueOutcome)object2).getChannel().toString());
                object3.put("name", string2);
                this.dbHelper.insert("cached_unique_outcome", null, (ContentValues)object3);
            }
            return;
        }
    }

    @Metadata(k=3, mv={1, 5, 1}, xi=48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[OSInfluenceType.values().length];
            nArray[OSInfluenceType.DIRECT.ordinal()] = 1;
            nArray[OSInfluenceType.INDIRECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

