/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1fSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1eSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1aSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1sSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.i;
import org.json.JSONObject;

public class AFd1hSDK
extends AFd1oSDK<String> {
    private static final AFd1vSDK[] AppsFlyer2dXConversionCallback = new AFd1vSDK[]{AFd1vSDK.afRDLog, AFd1vSDK.valueOf, AFd1vSDK.onInstallConversionFailureNative, AFd1vSDK.afErrorLog};
    private final AFc1dSDK AFLogger$LogLevel;
    private final AFb1wSDK AFVersionDeclaration;
    protected final AFb1dSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFb1bSDK afWarnLog;
    @NonNull
    private final AFb1gSDK getLevel;

    public AFd1hSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK) {
        this(aFa1qSDK, aFc1xSDK, null);
    }

    public AFd1hSDK(@NonNull AFa1qSDK object, @NonNull AFc1xSDK object22, String string2) {
        block5 : {
            void var3_6;
            AFd1vSDK aFd1vSDK = object.AFInAppEventType();
            AFd1vSDK aFd1vSDK2 = AFd1vSDK.values;
            super(aFd1vSDK, new AFd1vSDK[]{aFd1vSDK2}, (AFc1xSDK)object22, (String)var3_6);
            this.afInfoLog = object;
            this.AFLogger$LogLevel = object22.onInstallConversionFailureNative();
            this.afErrorLogForExcManagerOnly = object22.values();
            this.AFVersionDeclaration = object22.afRDLog();
            this.afWarnLog = object22.init();
            this.getLevel = object22.AFInAppEventParameterName();
            for (AFd1vSDK aFd1vSDK3 : AppsFlyer2dXConversionCallback) {
                if (this.values != aFd1vSDK3) {
                    continue;
                }
                break block5;
            }
            int n8 = this.afInfoLog.AFLogger;
            object = this.values;
            if (n8 <= 0) {
                AFd1vSDK aFd1vSDK4 = AFd1vSDK.AFInAppEventParameterName;
                if (object != aFd1vSDK4) {
                    this.AFInAppEventParameterName.add((Object)aFd1vSDK4);
                    return;
                }
            } else {
                object = AFd1vSDK.AFInAppEventParameterName;
                this.AFKeystoreWrapper.add(object);
            }
        }
    }

    @NonNull
    private static Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        Map map;
        Map map2 = map = (Map)aFa1qSDK.valueOf().get((Object)"meta");
        if (map == null) {
            map2 = new HashMap();
            aFa1qSDK.valueOf().put((Object)"meta", (Object)map2);
        }
        return map2;
    }

    @Override
    public boolean afInfoLog() {
        return true;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return this.afInfoLog.AFInAppEventParameterName;
    }

    public void valueOf(AFa1qSDK aFa1qSDK) {
        Object object;
        if (aFa1qSDK.afErrorLog()) {
            object = this.afDebugLog;
            aFa1qSDK.values(new AFb1fSDK(aFa1qSDK.valueOf(), object.AFKeystoreWrapper.AFInAppEventType));
            aFa1qSDK.values(this.afDebugLog.AFInAppEventParameterName(aFa1qSDK.valueOf()));
        }
        if (aFa1qSDK.afDebugLog()) {
            aFa1qSDK.values(this.afDebugLog.valueOf());
        }
        boolean bl = (object = this.AFInAppEventParameterName).contains((Object)AFd1vSDK.afWarnLog) || object.contains((Object)AFd1vSDK.AFInAppEventParameterName);
        if (this.AFLogger() && bl) {
            aFa1qSDK.AFInAppEventParameterName(this.afErrorLogForExcManagerOnly.values("appsFlyerCount", 0));
        }
        if (aFa1qSDK.afRDLog()) {
            Map<String, Object> map = AFd1hSDK.AFKeystoreWrapper(aFa1qSDK);
            object = this.AFLogger$LogLevel;
            String string2 = object.AFInAppEventParameterName();
            Object object2 = object.valueOf();
            object = AFc1dSDK.AFInAppEventType() ? AFc1aSDK.AFKeystoreWrapper : AFc1aSDK.AFInAppEventType;
            object = new AFc1eSDK(string2, (String)object2, (AFc1aSDK)((Object)object));
            string2 = new JSONObject();
            string2.put("name", (Object)object.AFInAppEventType);
            object2 = object.valueOf;
            if (object2 != AFc1aSDK.AFKeystoreWrapper) {
                string2.put("method", (Object)object2.valueOf);
            }
            if ((object2 = object.values) != null && !i.F((CharSequence)object2)) {
                string2.put("prefix", (Object)object.values);
            }
            map.put((Object)"host", (Object)string2);
        }
        if (this.getLevel.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
            AFd1hSDK.AFKeystoreWrapper(aFa1qSDK).put((Object)"preinstall_disabled", (Object)Boolean.TRUE);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final AFc1qSDK<String> values(@NonNull String var1_1) {
        block27 : {
            block26 : {
                var7_2 = "";
                this.valueOf(this.afInfoLog);
                if (this.afInfoLog.valueOf().containsKey((Object)"meta")) {
                    block25 : {
                        try {
                            var2_3 = this.AFVersionDeclaration.AFInAppEventType.AFInAppEventParameterName.AFInAppEventParameterName.AFInAppEventParameterName.AFInAppEventType;
                            break block25;
                        }
                        catch (NullPointerException var4_4) {}
                        var2_3 = 1.0;
                    }
                    if (AFa1qSDK.AFInAppEventType(var2_3)) {
                        this.afInfoLog.valueOf().remove((Object)"meta");
                    }
                }
                var4_5 = this.afInfoLog;
                var8_6 = var4_5.afRDLog;
                var9_7 = var4_5.valueOf();
                var4_5 = null;
                var5_8 = new JSONObject(var9_7).toString();
                if (var5_8 == null) throw new NullPointerException("JSON toString of eventParams map returns null");
                var4_5 = var5_8.replaceAll("\\p{C}", "*Non-printing character*");
                ** GOTO lbl62
                catch (Throwable var5_9) {
                    break block26;
                }
                catch (NullPointerException var6_14) {
                    var4_5 = null;
                    break block27;
                }
                catch (Throwable var6_15) {
                    var4_5 = var5_8;
                    var5_8 = var6_15;
                }
            }
            AFLogger.afErrorLog("Unexpected error", (Throwable)var5_8, true);
            var6_16 = "";
            var5_8 = var4_5;
            var4_5 = var6_16;
            ** GOTO lbl62
            catch (NullPointerException var6_18) {
                var4_5 = var5_8;
            }
        }
        AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", var6_17, true);
        var5_8 = (String)((Class)AFa1vSDK.AFInAppEventParameterName((char)(12254 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() LCMP 0L), ExpandableListView.getPackedPositionType((long)0L) + 74)).getMethod("AFInAppEventType", new Class[]{Map.class}).invoke((Object)null, new Object[]{var9_7});
        if (var5_8 == null) throw new NullPointerException("JSON toString of eventParams map returns null");
        var4_5 = var5_8.replaceAll("\\p{C}", "*Non-printing character*");
        ** GOTO lbl62
        catch (Throwable var5_10) {
            block28 : {
                var6_17 = var5_10.getCause();
                if (var6_17 == null) throw var5_10;
                throw var6_17;
                catch (Throwable var6_19) {
                    var4_5 = var5_8;
                    var5_8 = var6_19;
                    break block28;
                }
                catch (Exception var6_20) {
                    var4_5 = var5_8;
                    var5_8 = var6_20;
                }
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", (Throwable)var5_8);
                var5_8 = var4_5;
lbl60: // 3 sources:
                do {
                    var4_5 = "";
lbl62: // 4 sources:
                    if (var5_8 == null) {
                        var5_8 = var7_2;
                    }
                    if (!var4_5.equals(var5_8)) {
                        AFLogger.afWarnLog("Payload contains non-printing characters");
                    } else {
                        var4_5 = var5_8;
                    }
                    var5_8 = new StringBuilder();
                    var5_8.append((Object)this);
                    var5_8.append(": preparing data: ");
                    var5_8.append((String)var4_5);
                    AFa1aSDK.values(var5_8.toString());
                    this.afRDLog.valueOf(var8_6, (String)var4_5);
                    return this.AFLogger.AFKeystoreWrapper(this.afInfoLog, var1_1, this.afWarnLog);
                    break;
                } while (true);
                catch (NullPointerException var6_21) {
                    var4_5 = var5_8;
                    var5_8 = var6_21;
                }
                AFLogger.afErrorLog("AFJsonObject return null String object.", (Throwable)var5_8, true);
                var5_8 = var4_5;
                ** GOTO lbl60
                catch (Exception var5_12) {}
                catch (NullPointerException var5_13) {}
                ** finally { 
            }
            AFLogger.afErrorLog("Unexpected error", (Throwable)var5_8, true);
            var5_8 = var4_5;
            ** continue;
        }
    }
}

