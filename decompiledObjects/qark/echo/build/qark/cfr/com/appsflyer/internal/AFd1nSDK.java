/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.UUID
 */
package com.appsflyer.internal;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1oSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

public final class AFd1nSDK
extends AFd1oSDK<Map<String, String>> {
    private final boolean AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private final AFc1oSDK afErrorLogForExcManagerOnly;
    public AFa1xSDK afInfoLog;
    private String afWarnLog;
    private String getLevel;
    private final UUID onAppOpenAttributionNative;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public AFd1nSDK(@NonNull AFc1xSDK arrstring, @NonNull UUID uUID, @NonNull Uri uri) {
        boolean bl;
        block17 : {
            AFd1vSDK aFd1vSDK = AFd1vSDK.valueOf;
            AFd1vSDK aFd1vSDK2 = AFd1vSDK.values;
            boolean bl2 = false;
            boolean bl3 = false;
            String string2 = uUID.toString();
            super(aFd1vSDK, new AFd1vSDK[]{aFd1vSDK2}, (AFc1xSDK)arrstring, string2);
            this.afErrorLogForExcManagerOnly = arrstring.AFKeystoreWrapper();
            this.onAppOpenAttributionNative = uUID;
            bl = bl3;
            boolean bl4 = bl2;
            try {
                if (AFb1uSDK.values(uri.getHost())) break block17;
                bl = bl3;
                bl4 = bl2;
                if (AFb1uSDK.values(uri.getPath())) break block17;
                bl4 = bl2;
                arrstring = arrstring.AppsFlyer2dXConversionCallback();
            }
            catch (Exception exception) {}
            arrstring = ((Class)AFb1oSDK.values(37 - View.getDefaultSize((int)0, (int)0), true - (SystemClock.elapsedRealtime() LCMP 0L), (char)(ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(new Class[]{Uri.class, AFb1sSDK.class}).newInstance(new Object[]{uri, arrstring});
            {
                catch (Throwable throwable) {
                    bl4 = bl2;
                    uUID = throwable.getCause();
                    if (uUID != null) {
                        bl4 = bl2;
                        throw uUID;
                    }
                    bl4 = bl2;
                    throw throwable;
                }
            }
            arrstring = ((Class)AFb1oSDK.values(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (char)View.getDefaultSize((int)0, (int)0))).getMethod("AFInAppEventType", null).invoke((Object)arrstring, null);
            {
                catch (Throwable throwable) {
                    bl4 = bl2;
                    uUID = throwable.getCause();
                    if (uUID != null) {
                        bl4 = bl2;
                        throw uUID;
                    }
                    bl4 = bl2;
                    throw throwable;
                }
            }
            boolean bl5 = (Boolean)((Class)AFb1oSDK.values(View.MeasureSpec.getSize((int)0) + 50, 37 - TextUtils.getOffsetBefore((CharSequence)"", (int)0), (char)(62865 - KeyEvent.getDeadChar((int)0, (int)0)))).getMethod("AFInAppEventParameterName", null).invoke((Object)arrstring, null);
            {
                catch (Throwable throwable) {
                    bl4 = bl2;
                    uUID = throwable.getCause();
                    if (uUID != null) {
                        bl4 = bl2;
                        throw uUID;
                    }
                    bl4 = bl2;
                    throw throwable;
                }
            }
            bl4 = bl3 = ((Boolean)((Class)AFb1oSDK.values(View.combineMeasuredStates((int)0, (int)0) + 50, 37 - TextUtils.getCapsMode((CharSequence)"", (int)0, (int)0), (char)(62865 - TextUtils.getTrimmedLength((CharSequence)"")))).getMethod("valueOf", null).invoke((Object)arrstring, null)).booleanValue();
            {
                catch (Throwable throwable) {
                    bl4 = bl2;
                    uUID = throwable.getCause();
                    if (uUID != null) {
                        bl4 = bl2;
                        throw uUID;
                    }
                    bl4 = bl2;
                    throw throwable;
                }
            }
            arrstring = uri.getPath().split("/");
            bl = bl3;
            if (bl5) {
                bl = bl3;
                bl4 = bl3;
                if (arrstring.length == 3) {
                    bl4 = bl3;
                    this.afWarnLog = arrstring[1];
                    bl4 = bl3;
                    this.AFVersionDeclaration = arrstring[2];
                    bl4 = bl3;
                    this.getLevel = uri.toString();
                    bl = bl3;
                }
            }
            break block17;
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", (Throwable)exception);
            bl = bl4;
        }
        this.AFLogger$LogLevel = bl;
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final long AFInAppEventType() {
        return 3000L;
    }

    public final boolean AFVersionDeclaration() {
        if (!(TextUtils.isEmpty((CharSequence)this.afWarnLog) || TextUtils.isEmpty((CharSequence)this.AFVersionDeclaration) || this.afWarnLog.equals((Object)"app"))) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    public final boolean afWarnLog() {
        return this.AFLogger$LogLevel;
    }

    @Override
    public final boolean getLevel() {
        return false;
    }

    @Override
    public final AFc1qSDK<Map<String, String>> values(@NonNull String string2) {
        return this.afErrorLogForExcManagerOnly.AFInAppEventType(this.afWarnLog, this.AFVersionDeclaration, this.onAppOpenAttributionNative, string2);
    }

    @Override
    public final void values() {
        super.values();
        AFa1xSDK aFa1xSDK = this.afInfoLog;
        if (aFa1xSDK != null) {
            Object object;
            if (this.valueOf == AFd1ySDK.AFInAppEventParameterName && (object = this.afErrorLog) != null) {
                aFa1xSDK.values((Map)object.getBody());
                return;
            }
            Object object2 = this.afDebugLog();
            boolean bl = object2 instanceof ParsingException;
            object = "Can't get OneLink data";
            if (bl) {
                if (((ParsingException)((Object)object2)).getRawResponse().isSuccessful()) {
                    aFa1xSDK.AFKeystoreWrapper("Can't parse one link data");
                    return;
                }
                object2 = this.getLevel;
                if (object2 != null) {
                    object = object2;
                }
                aFa1xSDK.AFKeystoreWrapper((String)object);
                return;
            }
            object2 = this.getLevel;
            if (object2 != null) {
                object = object2;
            }
            aFa1xSDK.AFKeystoreWrapper((String)object);
        }
    }

    public static interface AFa1xSDK {
        public void AFKeystoreWrapper(String var1);

        public void values(Map<String, String> var1);
    }

}

