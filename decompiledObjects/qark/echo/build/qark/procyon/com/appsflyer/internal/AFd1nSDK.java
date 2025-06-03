// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.AFLogger;
import android.view.KeyEvent;
import android.text.TextUtils;
import android.view.View$MeasureSpec;
import android.view.ViewConfiguration;
import android.os.SystemClock;
import android.view.View;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.UUID;
import java.util.Map;

public final class AFd1nSDK extends AFd1oSDK<Map<String, String>>
{
    private final boolean AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private final AFc1oSDK afErrorLogForExcManagerOnly;
    public AFa1xSDK afInfoLog;
    private String afWarnLog;
    private String getLevel;
    private final UUID onAppOpenAttributionNative;
    
    public AFd1nSDK(@NonNull final AFc1xSDK aFc1xSDK, @NonNull final UUID onAppOpenAttributionNative, @NonNull final Uri uri) {
        final AFd1vSDK valueOf = AFd1vSDK.valueOf;
        final AFd1vSDK values = AFd1vSDK.values;
        final boolean b = false;
        final boolean b2 = false;
        super(valueOf, new AFd1vSDK[] { values }, aFc1xSDK, onAppOpenAttributionNative.toString());
        this.afErrorLogForExcManagerOnly = aFc1xSDK.AFKeystoreWrapper();
        this.onAppOpenAttributionNative = onAppOpenAttributionNative;
        boolean afLogger$LogLevel = b2;
        boolean booleanValue = b;
        while (true) {
            try {
                Label_0496: {
                    if (!AFb1uSDK.values(uri.getHost())) {
                        afLogger$LogLevel = b2;
                        booleanValue = b;
                        if (!AFb1uSDK.values(uri.getPath())) {
                            booleanValue = b;
                            final AFb1sSDK appsFlyer2dXConversionCallback = aFc1xSDK.AppsFlyer2dXConversionCallback();
                            try {
                                final Object instance = ((Class)AFb1oSDK.values(37 - View.getDefaultSize(0, 0), 1 - lcmp(SystemClock.elapsedRealtime(), 0L), (char)(ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(Uri.class, AFb1sSDK.class).newInstance(uri, appsFlyer2dXConversionCallback);
                                try {
                                    final Object invoke = ((Class)AFb1oSDK.values(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (char)View.getDefaultSize(0, 0))).getMethod("AFInAppEventType", (Class[])null).invoke(instance, (Object[])null);
                                    try {
                                        final boolean booleanValue2 = (boolean)((Class)AFb1oSDK.values(View$MeasureSpec.getSize(0) + 50, 37 - TextUtils.getOffsetBefore((CharSequence)"", 0), (char)(62865 - KeyEvent.getDeadChar(0, 0)))).getMethod("AFInAppEventParameterName", (Class[])null).invoke(invoke, (Object[])null);
                                        try {
                                            final boolean b3 = booleanValue = (boolean)((Class)AFb1oSDK.values(View.combineMeasuredStates(0, 0) + 50, 37 - TextUtils.getCapsMode((CharSequence)"", 0, 0), (char)(62865 - TextUtils.getTrimmedLength((CharSequence)"")))).getMethod("valueOf", (Class[])null).invoke(invoke, (Object[])null);
                                            final String[] split = uri.getPath().split("/");
                                            afLogger$LogLevel = b3;
                                            if (!booleanValue2) {
                                                break Label_0496;
                                            }
                                            afLogger$LogLevel = b3;
                                            booleanValue = b3;
                                            if (split.length == 3) {
                                                booleanValue = b3;
                                                this.afWarnLog = split[1];
                                                booleanValue = b3;
                                                this.AFVersionDeclaration = split[2];
                                                booleanValue = b3;
                                                this.getLevel = uri.toString();
                                                afLogger$LogLevel = b3;
                                            }
                                            break Label_0496;
                                        }
                                        finally {
                                            booleanValue = b;
                                            final Throwable t;
                                            final Throwable cause = t.getCause();
                                            if (cause != null) {
                                                booleanValue = b;
                                                throw cause;
                                            }
                                            booleanValue = b;
                                        }
                                    }
                                    finally {
                                        booleanValue = b;
                                        final Throwable t2;
                                        final Throwable cause2 = t2.getCause();
                                        if (cause2 != null) {
                                            booleanValue = b;
                                            throw cause2;
                                        }
                                        booleanValue = b;
                                    }
                                }
                                finally {
                                    booleanValue = b;
                                    final Throwable t3;
                                    final Throwable cause3 = t3.getCause();
                                    if (cause3 != null) {
                                        booleanValue = b;
                                        throw cause3;
                                    }
                                    booleanValue = b;
                                }
                            }
                            finally {
                                booleanValue = b;
                                final Throwable t4;
                                final Throwable cause4 = t4.getCause();
                                if (cause4 != null) {
                                    booleanValue = b;
                                    throw cause4;
                                }
                                booleanValue = b;
                            }
                            final Exception ex;
                            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", ex);
                            afLogger$LogLevel = booleanValue;
                        }
                    }
                }
                this.AFLogger$LogLevel = afLogger$LogLevel;
                return;
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
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
        return !TextUtils.isEmpty((CharSequence)this.afWarnLog) && !TextUtils.isEmpty((CharSequence)this.AFVersionDeclaration) && !this.afWarnLog.equals("app");
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
    public final AFc1qSDK<Map<String, String>> values(@NonNull final String s) {
        return this.afErrorLogForExcManagerOnly.AFInAppEventType(this.afWarnLog, this.AFVersionDeclaration, this.onAppOpenAttributionNative, s);
    }
    
    @Override
    public final void values() {
        super.values();
        final AFa1xSDK afInfoLog = this.afInfoLog;
        if (afInfoLog != null) {
            if (super.valueOf == AFd1ySDK.AFInAppEventParameterName) {
                final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
                if (afErrorLog != null) {
                    afInfoLog.values((Map<String, String>)afErrorLog.getBody());
                    return;
                }
            }
            final Throwable afDebugLog = this.afDebugLog();
            final boolean b = afDebugLog instanceof ParsingException;
            String s = "Can't get OneLink data";
            if (b) {
                if (((ParsingException)afDebugLog).getRawResponse().isSuccessful()) {
                    afInfoLog.AFKeystoreWrapper("Can't parse one link data");
                    return;
                }
                final String getLevel = this.getLevel;
                if (getLevel != null) {
                    s = getLevel;
                }
                afInfoLog.AFKeystoreWrapper(s);
            }
            else {
                final String getLevel2 = this.getLevel;
                if (getLevel2 != null) {
                    s = getLevel2;
                }
                afInfoLog.AFKeystoreWrapper(s);
            }
        }
    }
    
    public interface AFa1xSDK
    {
        void AFKeystoreWrapper(final String p0);
        
        void values(final Map<String, String> p0);
    }
}
