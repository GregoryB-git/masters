// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.AbstractMap;
import org.json.JSONException;
import org.json.JSONObject;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Intent;
import android.os.SystemClock;
import android.hardware.SensorManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.media.AudioTrack;
import android.view.Gravity;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import android.os.Process;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import android.view.ViewConfiguration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.text.TextUtils;
import android.graphics.Color;
import android.content.Context;
import java.util.Map;
import java.util.HashMap;

public final class AFb1fSDK extends HashMap<String, Object>
{
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
        valueOf();
        Color.argb(0, 0, 0, 0);
        TextUtils.lastIndexOf((CharSequence)"", '0', 0);
        TextUtils.indexOf((CharSequence)"", '0', 0, 0);
        View.getDefaultSize(0, 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf((CharSequence)"", '0');
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        KeyEvent.getDeadChar(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getOffsetAfter((CharSequence)"", 0);
        AFb1fSDK.afErrorLogForExcManagerOnly = (AFb1fSDK.afErrorLog + 99) % 128;
    }
    
    public AFb1fSDK(final Map<String, Object> afKeystoreWrapper, final Context values) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.values = values;
        ((AbstractMap<String, String>)this).put(this.AFInAppEventType(), this.AFKeystoreWrapper());
    }
    
    @NonNull
    private String AFInAppEventType() {
        AFb1fSDK.afErrorLogForExcManagerOnly = (AFb1fSDK.afErrorLog + 47) % 128;
        while (true) {
            try {
                final String string = Integer.toString(Build$VERSION.SDK_INT);
                final Map<String, Object> afKeystoreWrapper = this.AFKeystoreWrapper;
                final int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                final char c = (char)(-1 - TextUtils.lastIndexOf((CharSequence)"", '0'));
                final Object[] array = { null };
                AFInAppEventType("\ud753\u9f0b\u5c56\uafe3", "\u516b\u9b35\u1cd1\u89a8\u3456\u6297\uf965\u101c\ud5ed\ua3ad\uc8a0\u56e1", resolveSizeAndState, "\u0000\u0000\u0000\u0000", c, array);
                final String string2 = afKeystoreWrapper.get(((String)array[0]).intern()).toString();
                final Map<String, Object> afKeystoreWrapper2 = this.AFKeystoreWrapper;
                final int red = Color.red(0);
                final char c2 = (char)(View$MeasureSpec.getSize(0) + 19168);
                final Object[] array2 = { null };
                AFInAppEventType("\u118e\u4421\ue09a\ud54a", "\uff1b\u323d\u3390\u5618\u3c8d", -1706811119 - red, "\u0000\u0000\u0000\u0000", c2, array2);
                String s;
                if ((s = afKeystoreWrapper2.get(((String)array2[0]).intern()).toString()) == null) {
                    final int myTid = Process.myTid();
                    final Object[] array3 = { null };
                    values(null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", 127 - (myTid >> 22), array3);
                    s = ((String)array3[0]).intern();
                }
                final StringBuilder sb = new StringBuilder(string2);
                sb.reverse();
                final StringBuilder afKeystoreWrapper3 = AFKeystoreWrapper(string, s, sb.toString());
                final int length = afKeystoreWrapper3.length();
                int i;
                if ((i = length) > 4) {
                    afKeystoreWrapper3.delete(4, length);
                    AFb1fSDK.afErrorLogForExcManagerOnly = (AFb1fSDK.afErrorLog + 21) % 128;
                }
                else {
                    while (i < 4) {
                        ++i;
                        afKeystoreWrapper3.append('1');
                    }
                }
                final int windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
                final Object[] array4 = { null };
                values(null, null, "\u008a\u0089\u0088", (windowTouchSlop >> 8) + 127, array4);
                afKeystoreWrapper3.insert(0, ((String)array4[0]).intern());
                return afKeystoreWrapper3.toString();
                final int keyCodeFromString = KeyEvent.keyCodeFromString("");
                final char c3 = (char)((Process.getThreadPriority(0) + 20 >> 6) + 27895);
                final Object[] array5 = { null };
                AFInAppEventType("\u54e5\u040a\uf7a0\ud56c", "\ua419\u2eb8\ub678\ua252\u8642\u468d\u5495\u1169\u5b7d\u2ec0\uf654\uc7e3\ud7cf\ub2a6\ua774\u7460\u022b\u4158\u116b\u1eb5\u4c77\ud0b7\u8234\u128e\ue91e\u2a92\u7168\uf905\u1d06\ub405\u13ca\ue797\u53e4\u5783\ub079\u85d8\ub167\uc490\u87c9\u4e56", keyCodeFromString, "\u0000\u0000\u0000\u0000", c3, array5);
                final Exception obj;
                com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(((String)array5[0]).intern(), obj);
                final StringBuilder sb2 = new StringBuilder();
                final int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength();
                final Object[] array6 = { null };
                values(null, null, "\u008f\u009b\u0091\u009a\u008c\u0093\u0099\u0089\u0098\u0097\u0089\u008f\u0096\u0093\u008c\u0095\u008f\u0094\u0089\u0088\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a", 127 - (fadingEdgeLength >> 16), array6);
                sb2.append(((String)array6[0]).intern());
                sb2.append(obj);
                com.appsflyer.AFLogger.afRDLog(sb2.toString());
                final int lastIndex = TextUtils.lastIndexOf((CharSequence)"", '0', 0, 0);
                final Object[] array7 = { null };
                values(null, null, "\u009c\u009c\u009c\u009c\u008a\u0089\u0088", lastIndex + 128, array7);
                return ((String)array7[0]).intern();
            }
            catch (Exception obj) {
                continue;
            }
            break;
        }
    }
    
    private static void AFInAppEventType(String valueOf, String charArray, int length, String charArray2, final char c, final Object[] array) {
        Object charArray3 = charArray2;
        if (charArray2 != null) {
            charArray3 = ((String)charArray2).toCharArray();
        }
        final char[] array2 = (char[])charArray3;
        if ((charArray2 = charArray) != null) {
            charArray2 = ((String)charArray).toCharArray();
        }
        final char[] array3 = (char[])charArray2;
        if ((charArray = valueOf) != null) {
            charArray = valueOf.toCharArray();
        }
        final char[] array4 = (char[])charArray;
        valueOf = (String)AFg1vSDK.valueOf;
        // monitorenter(valueOf)
        while (true) {
            try {
                final char[] array5 = array4.clone();
                final char[] array6 = array2.clone();
                array5[0] ^= c;
                array6[2] += (char)length;
                length = array3.length;
                final char[] value = new char[length];
                AFg1vSDK.values = 0;
                while (true) {
                    final int values = AFg1vSDK.values;
                    if (values >= length) {
                        break;
                    }
                    final int n = (values + 3) % 4;
                    final char c2 = array5[values % 4];
                    final char c3 = array6[(values + 2) % 4];
                    final char c4 = AFg1vSDK.AFInAppEventParameterName = (char)((c2 * '\u7fce' + c3) % 65535);
                    array6[n] = (char)((array5[n] * '\u7fce' + c3) / 65535);
                    array5[n] = c4;
                    final int values2 = AFg1vSDK.values;
                    value[values2] = (char)((long)(c4 ^ array3[values2]) ^ AFb1fSDK.AFInAppEventParameterName ^ (long)AFb1fSDK.AFInAppEventType ^ (long)AFb1fSDK.valueOf);
                    AFg1vSDK.values = values2 + 1;
                }
                final String s = new String(value);
                // monitorexit(valueOf)
                array[0] = s;
                return;
                // monitorexit(valueOf)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    private String AFKeystoreWrapper() {
        Object o;
        try {
            final Map<String, Object> afKeystoreWrapper = this.AFKeystoreWrapper;
            final int rgb = Color.rgb(0, 0, 0);
            final char c = (char)(ViewConfiguration.getTapTimeout() >> 16);
            final Object[] array = { null };
            AFInAppEventType("\ud753\u9f0b\u5c56\uafe3", "\u516b\u9b35\u1cd1\u89a8\u3456\u6297\uf965\u101c\ud5ed\ua3ad\uc8a0\u56e1", rgb + 16777216, "\u0000\u0000\u0000\u0000", c, array);
            final String string = afKeystoreWrapper.get(((String)array[0]).intern()).toString();
            final Map<String, Object> afKeystoreWrapper2 = this.AFKeystoreWrapper;
            final int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
            final char c2 = (char)(fcmpl(AudioTrack.getMinVolume(), 0.0f) + 15150);
            final Object[] array2 = { null };
            AFInAppEventType("\u0bae\u35eb\u2e8e\u7e3b", "\u0667\ude21\u9b89\ud33d\u363a\u22e2\ucbfd\u1e19\u5053\u7b15\u1f09\u0d5e\u7029\u76d3\u74ba", -1909069045 + absoluteGravity, "\u0000\u0000\u0000\u0000", c2, array2);
            final String string2 = afKeystoreWrapper2.get(((String)array2[0]).intern()).toString();
            final int offsetBefore = TextUtils.getOffsetBefore((CharSequence)"", 0);
            final Object[] array3 = { null };
            values(null, null, " \u009e \u009f\u009e\u009d", offsetBefore + 127, array3);
            final String intern = ((String)array3[0]).intern();
            final int touchSlop = ViewConfiguration.getTouchSlop();
            final Object[] array4 = { null };
            values(null, null, "¢\u009e\u0098\u0092¡", (touchSlop >> 8) + 127, array4);
            final String replaceAll = intern.replaceAll(((String)array4[0]).intern(), "");
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(string2);
            sb.append(replaceAll);
            final String afInAppEventType = AFc1nSDK.AFInAppEventType(sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(afInAppEventType.substring(0, 16));
            o = sb2.toString();
        }
        catch (Exception obj) {
            final int resolveSize = View.resolveSize(0, 0);
            final Object[] array5 = { null };
            values(null, null, "\u0089¤\u008d\u008b¥\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a\u008f\u0089¤\u008d\u008b£ £\u0093\u0089\u0090", 127 - resolveSize, array5);
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(((String)array5[0]).intern(), obj);
            final StringBuilder sb3 = new StringBuilder();
            final int axisFromString = MotionEvent.axisFromString("");
            final char c3 = (char)(fcmpl(ViewConfiguration.getScrollFriction(), 0.0f) + 18240);
            final Object[] array6 = { null };
            AFInAppEventType("\ue1cc\ude77\u4157\ue847", "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950", -1 - axisFromString, "\u0000\u0000\u0000\u0000", c3, array6);
            sb3.append(((String)array6[0]).intern());
            sb3.append(obj);
            com.appsflyer.AFLogger.afRDLog(sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("");
            final int mode = View$MeasureSpec.getMode(0);
            final char c4 = (char)(ExpandableListView.getPackedPositionGroup(0L) + 3830);
            final Object[] array7 = { null };
            AFInAppEventType("\u9d51\ufdad\uf69c\u140e", "\u7f39\uf0fc\u167d\uf174\uda3b\u2c53\u8e97\uab5c\u3ba5\u1796\u3153\ufa48\ue2d5\u3597\uff63\uf546\ude81\u7b57", mode, "\u0000\u0000\u0000\u0000", c4, array7);
            sb4.append(((String)array7[0]).intern());
            o = sb4.toString();
        }
        while (true) {
            while (true) {
                Label_1533: {
                    while (true) {
                        try {
                            final Context values = this.values;
                            final int threadPriority = Process.getThreadPriority(0);
                            final char c5 = (char)(1 - lcmp(ViewConfiguration.getGlobalActionKeyTimeout(), 0L));
                            final Object[] array8 = { null };
                            AFInAppEventType("\ua1fb\u05d9\ua489\u5107", "\u8b58\u0ad0\u8c66\u1ce3\u3432\ufb03\uce8a\uea42\u31ed\u7b47\u7565\u630f\ud7f9\ua503\u3084\u36cb\uf3f0\uaa91\ufc4a\u2b53\u6802\u0944\ubc1d\u14d5\u980f\ua86f\ub8cd\ub94d\ub309\ud8a1\u4cdf\ue429\ub405\ud834\u8ba3\u86e3\ue6e0", -1996105311 + (threadPriority + 20 >> 6), "\u0000\u0000\u0000\u0000", c5, array8);
                            final Intent registerReceiver = values.registerReceiver((BroadcastReceiver)null, new IntentFilter(((String)array8[0]).intern()));
                            int i = -2700;
                            if (registerReceiver != null) {
                                final int n = AFb1fSDK.afErrorLog + 79;
                                AFb1fSDK.afErrorLogForExcManagerOnly = n % 128;
                                if (n % 2 == 0) {
                                    final int n2 = 110 / Color.argb(0, 1, 0, 0);
                                    final Object[] array9 = { null };
                                    values(null, null, "\u0089\u0092¤\u0093\u008b\u0092\u0089\u0099¦\u0089\u0093", n2, array9);
                                    i = registerReceiver.getIntExtra(((String)array9[0]).intern(), 10427);
                                }
                                else {
                                    final int argb = Color.argb(0, 0, 0, 0);
                                    final Object[] array10 = { null };
                                    values(null, null, "\u0089\u0092¤\u0093\u008b\u0092\u0089\u0099¦\u0089\u0093", argb + 127, array10);
                                    i = registerReceiver.getIntExtra(((String)array10[0]).intern(), -2700);
                                }
                            }
                            final String nativeLibraryDir = this.values.getApplicationInfo().nativeLibraryDir;
                            if (nativeLibraryDir == null) {
                                break Label_1533;
                            }
                            final int offsetAfter = TextUtils.getOffsetAfter((CharSequence)"", 0);
                            final Object[] array11 = { null };
                            values(null, null, "\u009d§\u0097", offsetAfter + 127, array11);
                            if (nativeLibraryDir.contains(((String)array11[0]).intern())) {
                                final int j = 1;
                                final Context values2 = this.values;
                                final int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                final Object[] array12 = { null };
                                values(null, null, "\u0092\u009a¨\u0091\u0089¨", 127 - (jumpTapTimeout >> 16), array12);
                                final int size = ((SensorManager)values2.getSystemService(((String)array12[0]).intern())).getSensorList(-1).size();
                                final StringBuilder sb5 = new StringBuilder();
                                final int index = TextUtils.indexOf((CharSequence)"", '0');
                                final char c6 = (char)((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39337);
                                final Object[] array13 = { null };
                                AFInAppEventType("\u5e95\uc2d4\ua952\ue399", "\uc23f", index + 1388500063, "\u0000\u0000\u0000\u0000", c6, array13);
                                sb5.append(((String)array13[0]).intern());
                                sb5.append(i);
                                final long elapsedCpuTime = Process.getElapsedCpuTime();
                                final char c7 = (char)(View.resolveSize(0, 0) + 1740);
                                final Object[] array14 = { null };
                                AFInAppEventType("\ua816\ud564\ucc7b\u5306", "\ubcd2\u6a49", 1 - lcmp(elapsedCpuTime, 0L), "\u0000\u0000\u0000\u0000", c7, array14);
                                sb5.append(((String)array14[0]).intern());
                                sb5.append(j);
                                final int lastIndex = TextUtils.lastIndexOf((CharSequence)"", '0', 0);
                                final char c8 = (char)(17251 - lcmp(ViewConfiguration.getZoomControlsTimeout(), 0L));
                                final Object[] array15 = { null };
                                AFInAppEventType("\uf003\u86a8\u6293\uce43", "\u5cfe\ud153", -1 - lastIndex, "\u0000\u0000\u0000\u0000", c8, array15);
                                sb5.append(((String)array15[0]).intern());
                                sb5.append(size);
                                final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                final char c9 = (char)(Drawable.resolveOpacity(0, 0) + 43206);
                                final Object[] array16 = { null };
                                AFInAppEventType("\u5b03\uae0c\uc6c7\u44a8", "\ud15c\uf6e1", lcmp(currentThreadTimeMillis, -1L) - 1, "\u0000\u0000\u0000\u0000", c9, array16);
                                sb5.append(((String)array16[0]).intern());
                                sb5.append(this.AFKeystoreWrapper.size());
                                final String string3 = sb5.toString();
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append((String)o);
                                final byte[] afInAppEventParameterName = AFa1ySDK.AFInAppEventParameterName(AFa1ySDK.valueOf(string3));
                                final StringBuilder sb7 = new StringBuilder();
                                for (int length = afInAppEventParameterName.length, k = 0; k < length; ++k) {
                                    AFb1fSDK.afErrorLogForExcManagerOnly = (AFb1fSDK.afErrorLog + 65) % 128;
                                    final String hexString = Integer.toHexString(afInAppEventParameterName[k]);
                                    final int length2 = hexString.length();
                                    String concat = hexString;
                                    Label_1282: {
                                        if (length2 == 1) {
                                            final int n3 = AFb1fSDK.afErrorLogForExcManagerOnly + 35;
                                            AFb1fSDK.afErrorLog = n3 % 128;
                                            if (n3 % 2 != 0) {
                                                "0".concat(hexString);
                                                try {
                                                    break Label_1282;
                                                }
                                                finally {}
                                            }
                                            concat = "0".concat(hexString);
                                        }
                                    }
                                    sb7.append(concat);
                                }
                                sb6.append(sb7.toString());
                                return sb6.toString();
                            }
                            break Label_1533;
                            final int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                            final Object[] array17 = { null };
                            values(null, null, "\u0092\u009a\u0092\u0092\u0089\u008f\u0089¤\u008d\u008b£ £\u0093\u0089\u0090", 127 - (keyRepeatTimeout >> 16), array17);
                            final Exception obj2;
                            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(((String)array17[0]).intern(), obj2);
                            final StringBuilder sb8 = new StringBuilder();
                            final int argb2 = Color.argb(0, 0, 0, 0);
                            final char c10 = (char)(18241 - Color.argb(0, 0, 0, 0));
                            final Object[] array18 = { null };
                            AFInAppEventType("\ue1cc\ude77\u4157\ue847", "\uc7b9\u63ea\ubced\u5c78\u4f62\ubb1c\u22d9\udaaa\ub636\u144e\ud32b\u9129\ubfd6\ub7d1\u27c0\uaf91\uf5a5\u506c\ub92e\udb6c\u88e3\u7796\u00c8\ua20d\u7fac\ub36d\u838c\u3c3c\udadd\ufe1a\u0917\u3598\ucfcc\ue1bc\u5cfa\u2032\ua77f\uc863\u7d2d\u0a50\uac4f\ufac3\uad10\u3950", argb2, "\u0000\u0000\u0000\u0000", c10, array18);
                            sb8.append(((String)array18[0]).intern());
                            sb8.append(obj2);
                            com.appsflyer.AFLogger.afRDLog(sb8.toString());
                            final StringBuilder sb9 = new StringBuilder();
                            sb9.append((String)o);
                            final long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
                            final char c11 = (char)((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60931);
                            o = new Object[] { null };
                            AFInAppEventType("\u7fdf\u1385\u03a0\u71ee", "\u47fc\u7ed7\u1953\u9351\u9ad8\u8f15\uf839\u5022\u6b2c\u171b\ue47e\u8563\ueccb\u585f\u8f03\uf4be", lcmp(globalActionKeyTimeout, 0L) - 1, "\u0000\u0000\u0000\u0000", c11, (Object[])o);
                            sb9.append(((String)o[0]).intern());
                            return sb9.toString();
                        }
                        catch (Exception ex) {}
                        final Exception ex;
                        final Exception obj2 = ex;
                        continue;
                    }
                }
                final int j = 0;
                continue;
            }
        }
    }
    
    private static StringBuilder AFKeystoreWrapper(@NonNull final String... array) {
        final ArrayList<Integer> list = (ArrayList<Integer>)new ArrayList<Comparable>();
        final int length = array.length;
        int i = 0;
        while (i < 3) {
            final int n = AFb1fSDK.afErrorLog + 93;
            AFb1fSDK.afErrorLogForExcManagerOnly = n % 128;
            if (n % 2 == 0) {
                list.add(array[i].length());
                i += 34;
            }
            else {
                list.add(array[i].length());
                ++i;
            }
        }
        Collections.sort((List<Comparable>)list);
        final int intValue = list.get(0).intValue();
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < intValue; ++j) {
            Number value = null;
            for (int k = 0; k < 3; ++k) {
                final int n2 = AFb1fSDK.afErrorLog + 115;
                AFb1fSDK.afErrorLogForExcManagerOnly = n2 % 128;
                int l = 0;
                Label_0211: {
                    char c;
                    if (n2 % 2 == 0) {
                        l = (c = array[k].charAt(j));
                        if (value == null) {
                            break Label_0211;
                        }
                    }
                    else {
                        l = (c = array[k].charAt(j));
                        if (value == null) {
                            break Label_0211;
                        }
                    }
                    l = (c ^ value.intValue());
                }
                value = l;
            }
            sb.append(Integer.toHexString(value.intValue()));
        }
        return sb;
    }
    
    public static void valueOf() {
        AFb1fSDK.AFInAppEventType = 0;
        AFb1fSDK.valueOf = '\u8c43';
        AFb1fSDK.AFInAppEventParameterName = 0L;
        AFb1fSDK.afRDLog = true;
        AFb1fSDK.AFLogger = new char[] { '¯', '°', '\u00c0', '£', '³', '¢', '¥', '\u00cc', '\u00c6', '\u00c7', '\u00c2', '\u00ca', '\u00cd', '\u00c5', '\u0081', '\u00c8', '\u00cf', '\u00d3', '\u00d5', '\u00da', '\u00d8', '\u00c9', '\u00d9', '\u00c4', '\u00d1', '\u00d0', '\u009b', '\u009a', '\u0097', '\u008f', '\u0092', '\u0093', '\u008e', '\u008b', '·', '\u00d6', '\u00d7', '\u00ce', '\u0099', '\u00d4' };
        AFb1fSDK.afInfoLog = true;
        AFb1fSDK.afDebugLog = 97;
    }
    
    private static void values(final int[] array, String afKeystoreWrapper, String charArray, final int n, final Object[] array2) {
        Object bytes = charArray;
        if (charArray != null) {
            bytes = ((String)charArray).getBytes("ISO-8859-1");
        }
        final byte[] array3 = (byte[])bytes;
        if ((charArray = afKeystoreWrapper) != null) {
            charArray = afKeystoreWrapper.toCharArray();
        }
        final char[] array4 = (char[])charArray;
        afKeystoreWrapper = (String)AFg1tSDK.AFKeystoreWrapper;
        // monitorenter(afKeystoreWrapper)
        while (true) {
            try {
                final char[] afLogger = AFb1fSDK.AFLogger;
                final int afDebugLog = AFb1fSDK.afDebugLog;
                if (AFb1fSDK.afInfoLog) {
                    final char[] value = new char[AFg1tSDK.values = array3.length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        final int valueOf = AFg1tSDK.valueOf;
                        final int values = AFg1tSDK.values;
                        final int valueOf2 = AFg1tSDK.valueOf;
                        value[valueOf] = (char)(afLogger[array3[values - 1 - valueOf2] + n] - afDebugLog);
                        AFg1tSDK.valueOf = valueOf2 + 1;
                    }
                    final String s = new String(value);
                    // monitorexit(afKeystoreWrapper)
                    array2[0] = s;
                    return;
                }
                if (AFb1fSDK.afRDLog) {
                    final char[] value2 = new char[AFg1tSDK.values = array4.length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        final int valueOf3 = AFg1tSDK.valueOf;
                        final int values2 = AFg1tSDK.values;
                        final int valueOf4 = AFg1tSDK.valueOf;
                        value2[valueOf3] = (char)(afLogger[array4[values2 - 1 - valueOf4] - n] - afDebugLog);
                        AFg1tSDK.valueOf = valueOf4 + 1;
                    }
                    final String s2 = new String(value2);
                    // monitorexit(afKeystoreWrapper)
                    array2[0] = s2;
                    return;
                }
                final char[] value3 = new char[AFg1tSDK.values = array.length];
                AFg1tSDK.valueOf = 0;
                while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                    final int valueOf5 = AFg1tSDK.valueOf;
                    final int values3 = AFg1tSDK.values;
                    final int valueOf6 = AFg1tSDK.valueOf;
                    value3[valueOf5] = (char)(afLogger[array[values3 - 1 - valueOf6] - n] - afDebugLog);
                    AFg1tSDK.valueOf = valueOf6 + 1;
                }
                final String s3 = new String(value3);
                // monitorexit(afKeystoreWrapper)
                array2[0] = s3;
                return;
                // monitorexit(afKeystoreWrapper)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class AFa1ySDK
    {
        public final int AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final int AFKeystoreWrapper;
        public final long valueOf;
        
        public AFa1ySDK() {
        }
        
        public AFa1ySDK(final String afInAppEventType, final int afInAppEventParameterName, final int afKeystoreWrapper, final long valueOf) {
            this.AFInAppEventType = afInAppEventType;
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.AFKeystoreWrapper = afKeystoreWrapper;
            this.valueOf = valueOf;
        }
        
        public static byte[] AFInAppEventParameterName(@NonNull final byte[] array) {
            for (int i = 0; i < array.length; ++i) {
                array[i] ^= (byte)(i % 2 + 42);
            }
            return array;
        }
        
        @NonNull
        public static byte[] valueOf(@NonNull final String s) {
            return s.getBytes(Charset.defaultCharset());
        }
        
        public final String AFInAppEventType() {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("sdk_ver", (Object)this.AFInAppEventType);
                jsonObject.put("min", this.AFInAppEventParameterName);
                jsonObject.put("expire", this.AFKeystoreWrapper);
                jsonObject.put("ttl", this.valueOf);
                return jsonObject.toString();
            }
            catch (JSONException ex) {
                return jsonObject.toString();
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null) {
                if (AFa1ySDK.class != o.getClass()) {
                    return false;
                }
                final AFa1ySDK aFa1ySDK = (AFa1ySDK)o;
                if (this.AFInAppEventParameterName == aFa1ySDK.AFInAppEventParameterName && this.AFKeystoreWrapper == aFa1ySDK.AFKeystoreWrapper && this.valueOf == aFa1ySDK.valueOf) {
                    final String afInAppEventType = this.AFInAppEventType;
                    if (afInAppEventType != null && afInAppEventType.equals(aFa1ySDK.AFInAppEventType)) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final String afInAppEventType = this.AFInAppEventType;
            int hashCode;
            if (afInAppEventType != null) {
                hashCode = afInAppEventType.hashCode();
            }
            else {
                hashCode = 0;
            }
            return ((hashCode * 31 + this.AFInAppEventParameterName) * 31 + this.AFKeystoreWrapper) * 31 + (int)this.valueOf;
        }
    }
}
