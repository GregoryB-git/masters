// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.os.Build$VERSION;
import android.content.Context;
import org.json.JSONException;
import com.appsflyer.AFLogger;
import org.json.JSONObject;
import androidx.annotation.NonNull;

public final class AFe1qSDK
{
    public final AFd1aSDK AFInAppEventParameterName;
    @NonNull
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    @NonNull
    public final String valueOf;
    @NonNull
    public final AFe1aSDK values;
    
    public AFe1qSDK() {
    }
    
    public AFe1qSDK(final String afInAppEventType) {
        Label_0114: {
            if (afInAppEventType == null) {
                break Label_0114;
            }
            while (true) {
                while (true) {
                    Label_0128: {
                        while (true) {
                            try {
                                final JSONObject jsonObject = new JSONObject(afInAppEventType);
                                final String string = jsonObject.getString("ver");
                                this.valueOf = string;
                                this.AFKeystoreWrapper = jsonObject.optBoolean("test_mode");
                                this.AFInAppEventType = afInAppEventType;
                                AFe1aSDK values;
                                if (string.startsWith("default")) {
                                    values = AFe1aSDK.AFInAppEventType;
                                }
                                else {
                                    values = AFe1aSDK.AFKeystoreWrapper;
                                }
                                this.values = values;
                                final JSONObject optJSONObject = jsonObject.optJSONObject("features");
                                if (optJSONObject != null) {
                                    final AFd1aSDK afInAppEventParameterName = new AFd1aSDK(optJSONObject);
                                    this.AFInAppEventParameterName = afInAppEventParameterName;
                                    return;
                                }
                                break Label_0128;
                                final Throwable t;
                                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", t);
                                throw new JSONException("Failed to parse remote configuration JSON");
                                throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
                            }
                            catch (JSONException ex) {}
                            final JSONException ex;
                            final Throwable t = (Throwable)ex;
                            continue;
                        }
                    }
                    final AFd1aSDK afInAppEventParameterName = null;
                    continue;
                }
            }
        }
    }
    
    public static boolean AFKeystoreWrapper(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return t.a(context.getPackageManager());
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        }
        catch (ClassNotFoundException ex) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", ex, true);
            return false;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (AFe1qSDK.class != o.getClass()) {
            return false;
        }
        final AFe1qSDK aFe1qSDK = (AFe1qSDK)o;
        return this.AFKeystoreWrapper == aFe1qSDK.AFKeystoreWrapper && this.valueOf.equals(aFe1qSDK.valueOf) && this.AFInAppEventType.equals(aFe1qSDK.AFInAppEventType);
    }
    
    @Override
    public final int hashCode() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
