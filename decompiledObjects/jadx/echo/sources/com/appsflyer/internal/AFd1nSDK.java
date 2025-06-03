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
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFd1nSDK extends AFd1oSDK<Map<String, String>> {
    private final boolean AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private final AFc1oSDK afErrorLogForExcManagerOnly;
    public AFa1xSDK afInfoLog;
    private String afWarnLog;
    private String getLevel;
    private final UUID onAppOpenAttributionNative;

    public interface AFa1xSDK {
        void AFKeystoreWrapper(String str);

        void values(Map<String, String> map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1nSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFd1vSDK.ONELINK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        boolean z7 = false;
        this.afErrorLogForExcManagerOnly = aFc1xSDK.AFKeystoreWrapper();
        this.onAppOpenAttributionNative = uuid;
        try {
            if (!AFb1uSDK.values(uri.getHost()) && !AFb1uSDK.values(uri.getPath())) {
                try {
                    try {
                        Object invoke = ((Class) AFb1oSDK.values(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (char) View.getDefaultSize(0, 0))).getMethod("AFInAppEventType", null).invoke(((Class) AFb1oSDK.values(37 - View.getDefaultSize(0, 0), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(Uri.class, AFb1sSDK.class).newInstance(uri, aFc1xSDK.AppsFlyer2dXConversionCallback()), null);
                        try {
                            boolean booleanValue = ((Boolean) ((Class) AFb1oSDK.values(View.MeasureSpec.getSize(0) + 50, 37 - TextUtils.getOffsetBefore("", 0), (char) (62865 - KeyEvent.getDeadChar(0, 0)))).getMethod("AFInAppEventParameterName", null).invoke(invoke, null)).booleanValue();
                            try {
                                z7 = ((Boolean) ((Class) AFb1oSDK.values(View.combineMeasuredStates(0, 0) + 50, 37 - TextUtils.getCapsMode("", 0, 0), (char) (62865 - TextUtils.getTrimmedLength("")))).getMethod("valueOf", null).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.afWarnLog = split[1];
                                    this.AFVersionDeclaration = split[2];
                                    this.getLevel = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e7);
        }
        this.AFLogger$LogLevel = z7;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    public final boolean AFVersionDeclaration() {
        return (TextUtils.isEmpty(this.afWarnLog) || TextUtils.isEmpty(this.AFVersionDeclaration) || this.afWarnLog.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    public final boolean afWarnLog() {
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean getLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<Map<String, String>> values(@NonNull String str) {
        return this.afErrorLogForExcManagerOnly.AFInAppEventType(this.afWarnLog, this.AFVersionDeclaration, this.onAppOpenAttributionNative, str);
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        ResponseNetwork responseNetwork;
        super.values();
        AFa1xSDK aFa1xSDK = this.afInfoLog;
        if (aFa1xSDK != null) {
            if (this.valueOf == AFd1ySDK.SUCCESS && (responseNetwork = ((AFd1oSDK) this).afErrorLog) != null) {
                aFa1xSDK.values((Map) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            if (!(afDebugLog instanceof ParsingException)) {
                String str = this.getLevel;
                aFa1xSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                aFa1xSDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.getLevel;
                aFa1xSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }
}
