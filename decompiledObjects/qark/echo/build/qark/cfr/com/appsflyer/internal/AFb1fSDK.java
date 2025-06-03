/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ApplicationInfo
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.hardware.SensorManager
 *  android.media.AudioTrack
 *  android.os.Process
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1nSDK;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1fSDK
extends HashMap<String, Object> {
    private static long AFInAppEventParameterName = 0L;
    private static int AFInAppEventType = 0;
    private static char[] AFLogger;
    private static int afDebugLog = 0;
    private static int afErrorLog = 0;
    private static int afErrorLogForExcManagerOnly = 1;
    private static boolean afInfoLog;
    private static boolean afRDLog;
    private static char valueOf;
    private final Map<String, Object> AFKeystoreWrapper;
    private final Context values;

    static {
        AFb1fSDK.valueOf();
        Color.argb((int)0, (int)0, (int)0, (int)0);
        TextUtils.lastIndexOf((CharSequence)"", (char)'0', (int)0);
        TextUtils.indexOf((CharSequence)"", (char)'0', (int)0, (int)0);
        View.getDefaultSize((int)0, (int)0);
        Drawable.resolveOpacity((int)0, (int)0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf((CharSequence)"", (char)'0');
        ExpandableListView.getPackedPositionForChild((int)0, (int)0);
        ViewConfiguration.getJumpTapTimeout();
        KeyEvent.getDeadChar((int)0, (int)0);
        ExpandableListView.getPackedPositionGroup((long)0L);
        TextUtils.getOffsetAfter((CharSequence)"", (int)0);
        afErrorLogForExcManagerOnly = (afErrorLog + 99) % 128;
    }

    public AFb1fSDK(Map<String, Object> map, Context context) {
        this.AFKeystoreWrapper = map;
        this.values = context;
        this.put((Object)this.AFInAppEventType(), (Object)this.AFKeystoreWrapper());
    }

    /*
     * Exception decompiling
     */
    @NonNull
    private String AFInAppEventType() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[FORLOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private static void AFInAppEventType(String var0, String var1_1, int var2_3, String var3_4, char var4_5, Object[] var5_6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[WHILELOOP]], but top level block is 3[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private String AFKeystoreWrapper() {
        block14 : {
            try {
                var8_1 = this.AFKeystoreWrapper;
                var2_6 = Color.rgb((int)0, (int)0, (int)0);
                var1_7 = (char)(ViewConfiguration.getTapTimeout() >> 16);
                var9_8 = new Object[1];
                AFb1fSDK.AFInAppEventType("\ud753\u9f0b\u5c56\uafe3", "\u516b\u9b35\u1cd1\u89a8\u3456\u6297\uf965\u101c\ud5ed\ua3ad\uc8a0\u56e1", var2_6 + 16777216, "\u0000\u0000\u0000\u0000", var1_7, var9_8);
                var8_1 = var8_1.get((Object)((String)var9_8[0]).intern()).toString();
                var9_8 = this.AFKeystoreWrapper;
                var2_6 = Gravity.getAbsoluteGravity((int)0, (int)0);
                var1_7 = (char)((AudioTrack.getMinVolume() FCMPL 0.0f) + 15150);
                var10_9 = new Object[1];
                AFb1fSDK.AFInAppEventType("\u0bae\u35eb\u2e8e\u7e3b", "\u0667\ude21\u9b89\ud33d\u363a\u22e2\ucbfd\u1e19\u5053\u7b15\u1f09\u0d5e\u7029\u76d3\u74ba", -1909069045 + var2_6, "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
                var9_8 = var9_8.get((Object)((String)var10_9[0]).intern()).toString();
                var2_6 = TextUtils.getOffsetBefore((CharSequence)"", (int)0);
                var10_9 = new Object[1];
                AFb1fSDK.values(null, null, "\u00a0\u009e\u00a0\u009f\u009e\u009d", var2_6 + 127, (Object[])var10_9);
                var10_9 = ((String)var10_9[0]).intern();
                var2_6 = ViewConfiguration.getTouchSlop();
                var11_10 = new Object[1];
                AFb1fSDK.values(null, null, "\u00a2\u009e\u0098\u0092\u00a1", (var2_6 >> 8) + 127, (Object[])var11_10);
                var10_9 = var10_9.replaceAll(((String)var11_10[0]).intern(), "");
                var11_10 = new StringBuilder();
                var11_10.append((String)var8_1);
                var11_10.append((String)var9_8);
                var11_10.append((String)var10_9);
                var8_1 = AFc1nSDK.AFInAppEventType(var11_10.toString());
                var9_8 = new StringBuilder();
                var9_8.append("");
                var9_8.append(var8_1.substring(0, 16));
                var9_8 = var9_8.toString();
            }
            catch (Exception var8_2) {
                var2_6 = View.resolveSize((int)0, (int)0);
                var9_8 = new Object[1];
                AFb1fSDK.values(null, null, "\u0089\u00a4\u008d\u008b\u00a5\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a\u008f\u0089\u00a4\u008d\u008b\u00a3\u00a0\u00a3\u0093\u0089\u0090", 127 - var2_6, var9_8);
                AFLogger.afErrorLogForExcManagerOnly(((String)var9_8[0]).intern(), (Throwable)var8_2);
                var9_8 = new Map<String, Object>();
                var2_6 = MotionEvent.axisFromString((String)"");
                var1_7 = (char)((ViewConfiguration.getScrollFriction() FCMPL 0.0f) + 18240);
                var10_9 = new Object[1];
                AFb1fSDK.AFInAppEventType("\ue1cc\ude77\u4157\ue847", "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950", -1 - var2_6, "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
                var9_8.append(((String)var10_9[0]).intern());
                var9_8.append((Object)var8_2);
                AFLogger.afRDLog(var9_8.toString());
                var8_1 = new StringBuilder();
                var8_1.append("");
                var2_6 = View.MeasureSpec.getMode((int)0);
                var1_7 = (char)(ExpandableListView.getPackedPositionGroup((long)0L) + 3830);
                var9_8 = new Object[1];
                AFb1fSDK.AFInAppEventType("\u9d51\ufdad\uf69c\u140e", "\u7f39\uf0fc\u167d\uf174\uda3b\u2c53\u8e97\uab5c\u3ba5\u1796\u3153\ufa48\ue2d5\u3597\uff63\uf546\ude81\u7b57", var2_6, "\u0000\u0000\u0000\u0000", var1_7, var9_8);
                var8_1.append(((String)var9_8[0]).intern());
                var9_8 = var8_1.toString();
            }
            var8_1 = this.values;
            var2_6 = Process.getThreadPriority((int)0);
            var1_7 = (char)(true - (ViewConfiguration.getGlobalActionKeyTimeout() LCMP 0L));
            var10_9 = new Object[1];
            AFb1fSDK.AFInAppEventType("\ua1fb\u05d9\ua489\u5107", "\u8b58\u0ad0\u8c66\u1ce3\u3432\ufb03\uce8a\uea42\u31ed\u7b47\u7565\u630f\ud7f9\ua503\u3084\u36cb\uf3f0\uaa91\ufc4a\u2b53\u6802\u0944\ubc1d\u14d5\u980f\ua86f\ub8cd\ub94d\ub309\ud8a1\u4cdf\ue429\ub405\ud834\u8ba3\u86e3\ue6e0", -1996105311 + (var2_6 + 20 >> 6), "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
            var8_1 = var8_1.registerReceiver(null, new IntentFilter(((String)var10_9[0]).intern()));
            var2_6 = -2700;
            if (var8_1 == null) ** GOTO lbl75
            var2_6 = AFb1fSDK.afErrorLog + 79;
            AFb1fSDK.afErrorLogForExcManagerOnly = var2_6 % 128;
            if (var2_6 % 2 != 0) ** GOTO lbl71
            var2_6 = 110 / Color.argb((int)0, (int)1, (int)0, (int)0);
            var10_9 = new Object[1];
            AFb1fSDK.values(null, null, "\u0089\u0092\u00a4\u0093\u008b\u0092\u0089\u0099\u00a6\u0089\u0093", var2_6, (Object[])var10_9);
            var2_6 = var8_1.getIntExtra(((String)var10_9[0]).intern(), 10427);
            break block14;
lbl71: // 1 sources:
            var2_6 = Color.argb((int)0, (int)0, (int)0, (int)0);
            var10_9 = new Object[1];
            AFb1fSDK.values(null, null, "\u0089\u0092\u00a4\u0093\u008b\u0092\u0089\u0099\u00a6\u0089\u0093", var2_6 + 127, (Object[])var10_9);
            var2_6 = var8_1.getIntExtra(((String)var10_9[0]).intern(), -2700);
        }
        if ((var8_1 = this.values.getApplicationInfo().nativeLibraryDir) == null) ** GOTO lbl-1000
        var3_11 = TextUtils.getOffsetAfter((CharSequence)"", (int)0);
        var10_9 = new Object[1];
        AFb1fSDK.values(null, null, "\u009d\u00a7\u0097", var3_11 + 127, (Object[])var10_9);
        if (var8_1.contains((CharSequence)((String)var10_9[0]).intern())) {
            var3_11 = 1;
        } else lbl-1000: // 2 sources:
        {
            var3_11 = 0;
        }
        var8_1 = this.values;
        var4_12 = ViewConfiguration.getJumpTapTimeout();
        var10_9 = new Object[1];
        AFb1fSDK.values(null, null, "\u0092\u009a\u00a8\u0091\u0089\u00a8", 127 - (var4_12 >> 16), (Object[])var10_9);
        var4_12 = ((SensorManager)var8_1.getSystemService(((String)var10_9[0]).intern())).getSensorList(-1).size();
        var8_1 = new StringBuilder();
        var5_13 = TextUtils.indexOf((CharSequence)"", (char)'0');
        var1_7 = (char)((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39337);
        var10_9 = new Object[1];
        AFb1fSDK.AFInAppEventType("\u5e95\uc2d4\ua952\ue399", "\uc23f", var5_13 + 1388500063, "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
        var8_1.append(((String)var10_9[0]).intern());
        var8_1.append(var2_6);
        var6_14 = Process.getElapsedCpuTime();
        var1_7 = (char)(View.resolveSize((int)0, (int)0) + 1740);
        var10_9 = new Object[1];
        AFb1fSDK.AFInAppEventType("\ua816\ud564\ucc7b\u5306", "\ubcd2\u6a49", true - (var6_14 LCMP 0L), "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
        var8_1.append(((String)var10_9[0]).intern());
        var8_1.append(var3_11);
        var2_6 = TextUtils.lastIndexOf((CharSequence)"", (char)'0', (int)0);
        var1_7 = (char)(17251 - (ViewConfiguration.getZoomControlsTimeout() LCMP 0L));
        var10_9 = new Object[1];
        AFb1fSDK.AFInAppEventType("\uf003\u86a8\u6293\uce43", "\u5cfe\ud153", -1 - var2_6, "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
        var8_1.append(((String)var10_9[0]).intern());
        var8_1.append(var4_12);
        var6_14 = SystemClock.currentThreadTimeMillis();
        var1_7 = (char)(Drawable.resolveOpacity((int)0, (int)0) + 43206);
        var10_9 = new Object[1];
        AFb1fSDK.AFInAppEventType("\u5b03\uae0c\uc6c7\u44a8", "\ud15c\uf6e1", (int)((var6_14 LCMP -1L) - true), "\u0000\u0000\u0000\u0000", var1_7, (Object[])var10_9);
        var8_1.append(((String)var10_9[0]).intern());
        var8_1.append(this.AFKeystoreWrapper.size());
        var8_1 = var8_1.toString();
        var11_10 = new StringBuilder();
        var11_10.append((String)var9_8);
        var12_15 = AFa1ySDK.AFInAppEventParameterName(AFa1ySDK.valueOf((String)var8_1));
        var13_16 = new StringBuilder();
        var3_11 = var12_15.length;
        for (var2_6 = 0; var2_6 < var3_11; ++var2_6) {
            block15 : {
                AFb1fSDK.afErrorLogForExcManagerOnly = (AFb1fSDK.afErrorLog + 65) % 128;
                var10_9 = Integer.toHexString((int)var12_15[var2_6]);
                var4_12 = var10_9.length();
                var8_1 = var10_9;
                if (var4_12 != 1) ** GOTO lbl140
                var4_12 = AFb1fSDK.afErrorLogForExcManagerOnly + 35;
                AFb1fSDK.afErrorLog = var4_12 % 128;
                if (var4_12 % 2 == 0) break block15;
                var8_1 = "0".concat((String)var10_9);
                var4_12 = 6 / 0;
                ** GOTO lbl140
            }
            var8_1 = "0".concat((String)var10_9);
lbl140: // 3 sources:
            var13_16.append((String)var8_1);
            continue;
        }
        try {
            var11_10.append(var13_16.toString());
            return var11_10.toString();
        }
        catch (Exception var8_4) {}
        var2_6 = ViewConfiguration.getKeyRepeatTimeout();
        var10_9 = new Object[1];
        AFb1fSDK.values(null, null, "\u0092\u009a\u0092\u0092\u0089\u008f\u0089\u00a4\u008d\u008b\u00a3\u00a0\u00a3\u0093\u0089\u0090", 127 - (var2_6 >> 16), (Object[])var10_9);
        AFLogger.afErrorLogForExcManagerOnly(((String)var10_9[0]).intern(), (Throwable)var8_4);
        var10_9 = new Object[]();
        var2_6 = Color.argb((int)0, (int)0, (int)0, (int)0);
        var1_7 = (char)(18241 - Color.argb((int)0, (int)0, (int)0, (int)0));
        var11_10 = new Object[1];
        AFb1fSDK.AFInAppEventType("\ue1cc\ude77\u4157\ue847", "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950", var2_6, "\u0000\u0000\u0000\u0000", var1_7, (Object[])var11_10);
        var10_9.append(((String)var11_10[0]).intern());
        var10_9.append((Object)var8_4);
        AFLogger.afRDLog(var10_9.toString());
        var8_5 = new StringBuilder();
        var8_5.append((String)var9_8);
        var6_14 = ViewConfiguration.getGlobalActionKeyTimeout();
        var1_7 = (char)((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60931);
        var9_8 = new Object[1];
        AFb1fSDK.AFInAppEventType("\u7fdf\u1385\u03a0\u71ee", "\u47fc\u7ed7\u1953\u9351\u9ad8\u8f15\uf839\u5022\u6b2c\u171b\ue47e\u8563\ueccb\u585f\u8f03\uf4be", (int)((var6_14 LCMP 0L) - true), "\u0000\u0000\u0000\u0000", var1_7, var9_8);
        var8_5.append(((String)var9_8[0]).intern());
        return var8_5.toString();
    }

    private static /* varargs */ StringBuilder AFKeystoreWrapper(@NonNull String ... arrstring) {
        int n8;
        ArrayList arrayList = new ArrayList();
        int n9 = arrstring.length;
        n9 = 0;
        while (n9 < 3) {
            n8 = afErrorLog + 93;
            afErrorLogForExcManagerOnly = n8 % 128;
            if (n8 % 2 == 0) {
                arrayList.add((Object)arrstring[n9].length());
                n9 += 34;
                continue;
            }
            arrayList.add((Object)arrstring[n9].length());
            ++n9;
        }
        Collections.sort((List)arrayList);
        int n10 = (Integer)arrayList.get(0);
        StringBuilder stringBuilder = new StringBuilder();
        for (n8 = 0; n8 < n10; ++n8) {
            arrayList = null;
            for (int i8 = 0; i8 < 3; ++i8) {
                block9 : {
                    int n11;
                    block8 : {
                        block7 : {
                            n9 = afErrorLog + 115;
                            afErrorLogForExcManagerOnly = n9 % 128;
                            if (n9 % 2 != 0) break block7;
                            n9 = arrstring[i8].charAt(n8);
                            n11 = 46 / 0;
                            n11 = n9;
                            if (arrayList != null) break block8;
                            break block9;
                        }
                        n11 = n9 = (int)arrstring[i8].charAt(n8);
                        if (arrayList == null) break block9;
                    }
                    n9 = n11 ^ arrayList.intValue();
                }
                arrayList = Integer.valueOf((int)n9);
            }
            stringBuilder.append(Integer.toHexString((int)arrayList.intValue()));
        }
        return stringBuilder;
    }

    public static void valueOf() {
        AFInAppEventType = 0;
        valueOf = (char)35907;
        AFInAppEventParameterName = 0L;
        afRDLog = true;
        AFLogger = new char[]{'\u00af', '\u00b0', '\u00c0', '\u00a3', '\u00b3', '\u00a2', '\u00a5', '\u00cc', '\u00c6', '\u00c7', '\u00c2', '\u00ca', '\u00cd', '\u00c5', '\u0081', '\u00c8', '\u00cf', '\u00d3', '\u00d5', '\u00da', '\u00d8', '\u00c9', '\u00d9', '\u00c4', '\u00d1', '\u00d0', '\u009b', '\u009a', '\u0097', '\u008f', '\u0092', '\u0093', '\u008e', '\u008b', '\u00b7', '\u00d6', '\u00d7', '\u00ce', '\u0099', '\u00d4'};
        afInfoLog = true;
        afDebugLog = 97;
    }

    /*
     * Exception decompiling
     */
    private static void values(int[] var0, String var1_2, String var2_3, int var3_4, Object[] var4_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[WHILELOOP]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final class AFa1ySDK {
        public final int AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final int AFKeystoreWrapper;
        public final long valueOf;

        public AFa1ySDK() {
        }

        public AFa1ySDK(String string2, int n8, int n9, long l8) {
            this.AFInAppEventType = string2;
            this.AFInAppEventParameterName = n8;
            this.AFKeystoreWrapper = n9;
            this.valueOf = l8;
        }

        public static byte[] AFInAppEventParameterName(@NonNull byte[] arrby) {
            for (int i8 = 0; i8 < arrby.length; ++i8) {
                arrby[i8] = (byte)(arrby[i8] ^ i8 % 2 + 42);
            }
            return arrby;
        }

        @NonNull
        public static byte[] valueOf(@NonNull String string2) {
            return string2.getBytes(Charset.defaultCharset());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final String AFInAppEventType() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdk_ver", (Object)this.AFInAppEventType);
                jSONObject.put("min", this.AFInAppEventParameterName);
                jSONObject.put("expire", this.AFKeystoreWrapper);
                jSONObject.put("ttl", this.valueOf);
            }
            catch (JSONException jSONException) {
                return jSONObject.toString();
            }
            do {
                return jSONObject.toString();
                break;
            } while (true);
        }

        public final boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                String string2;
                if (AFa1ySDK.class != object.getClass()) {
                    return false;
                }
                object = (AFa1ySDK)object;
                if (this.AFInAppEventParameterName == object.AFInAppEventParameterName && this.AFKeystoreWrapper == object.AFKeystoreWrapper && this.valueOf == object.valueOf && (string2 = this.AFInAppEventType) != null && string2.equals((Object)object.AFInAppEventType)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String string2 = this.AFInAppEventType;
            int n8 = string2 != null ? string2.hashCode() : 0;
            return ((n8 * 31 + this.AFInAppEventParameterName) * 31 + this.AFKeystoreWrapper) * 31 + (int)this.valueOf;
        }
    }

}

