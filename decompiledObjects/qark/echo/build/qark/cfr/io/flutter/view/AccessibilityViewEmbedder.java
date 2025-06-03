/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.util.SparseArray
 *  android.view.MotionEvent
 *  android.view.MotionEvent$PointerCoords
 *  android.view.MotionEvent$PointerProperties
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.view.accessibility.AccessibilityNodeInfo$RangeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.accessibility.AccessibilityRecord
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.view.a;
import io.flutter.view.j;
import io.flutter.view.k;
import io.flutter.view.l;
import io.flutter.view.m;
import io.flutter.view.n;
import io.flutter.view.o;
import io.flutter.view.p;
import io.flutter.view.q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<c> flutterIdToOrigin = new SparseArray();
    private int nextFlutterId;
    private final Map<c, Integer> originToFlutterId;
    private final b reflectionAccessors = new b(null);
    private final View rootAccessibilityView;

    public AccessibilityViewEmbedder(@NonNull View view, int n8) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = n8;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        for (int i8 = 0; i8 < accessibilityNodeInfo.getChildCount(); ++i8) {
            int n8;
            Object object = this.reflectionAccessors.f(accessibilityNodeInfo, i8);
            if (object == null) continue;
            int n9 = b.j(object.longValue());
            object = new c(view, n9, null);
            if (this.originToFlutterId.containsKey(object)) {
                n8 = (Integer)this.originToFlutterId.get(object);
            } else {
                n8 = this.nextFlutterId;
                this.nextFlutterId = n8 + 1;
                this.cacheVirtualIdMappings(view, n9, n8);
            }
            accessibilityNodeInfo2.addChild(this.rootAccessibilityView, n8);
        }
    }

    private void cacheVirtualIdMappings(@NonNull View object, int n8, int n9) {
        object = new c((View)object, n8, null);
        this.originToFlutterId.put(object, (Object)n9);
        this.flutterIdToOrigin.put(n9, object);
    }

    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int n8, @NonNull View view) {
        AccessibilityNodeInfo accessibilityNodeInfo2 = AccessibilityNodeInfo.obtain((View)this.rootAccessibilityView, (int)n8);
        accessibilityNodeInfo2.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfo2.setSource(this.rootAccessibilityView, n8);
        accessibilityNodeInfo2.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)view);
        this.copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfo2);
        this.setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfo2);
        this.addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfo2);
        this.setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfo2);
        return accessibilityNodeInfo2;
    }

    private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int n8 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (n8 >= 24) {
            k.a(accessibilityNodeInfo2, j.a(accessibilityNodeInfo));
            a.a(accessibilityNodeInfo2, l.a(accessibilityNodeInfo));
        }
        if (n8 >= 26) {
            n.a(accessibilityNodeInfo2, m.a(accessibilityNodeInfo));
            io.flutter.view.b.a(accessibilityNodeInfo2, o.a(accessibilityNodeInfo));
            q.a(accessibilityNodeInfo2, p.a(accessibilityNodeInfo));
        }
    }

    private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        if ((accessibilityNodeInfo = this.reflectionAccessors.g(accessibilityNodeInfo)) == null) {
            return;
        }
        int n8 = b.j(accessibilityNodeInfo.longValue());
        accessibilityNodeInfo = (Integer)this.originToFlutterId.get((Object)new c(view, n8, null));
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, accessibilityNodeInfo.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull Rect rect, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect2);
        rect2.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect2);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int n8) {
        c c8 = (c)this.flutterIdToOrigin.get(n8);
        if (c8 == null) {
            return null;
        }
        if (!this.embeddedViewToDisplayBounds.containsKey((Object)c8.a)) {
            return null;
        }
        if (c8.a.getAccessibilityNodeProvider() == null) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = c8.a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c8.b);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return this.convertToFlutterNode(accessibilityNodeInfo, n8, c8.a);
    }

    public Integer getRecordFlutterId(@NonNull View view, @NonNull AccessibilityRecord accessibilityRecord) {
        if ((accessibilityRecord = this.reflectionAccessors.h(accessibilityRecord)) == null) {
            return null;
        }
        int n8 = b.j(accessibilityRecord.longValue());
        return (Integer)this.originToFlutterId.get((Object)new c(view, n8, null));
    }

    public AccessibilityNodeInfo getRootNode(@NonNull View view, int n8, @NonNull Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long l8 = this.reflectionAccessors.i(accessibilityNodeInfo);
        if (l8 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put((Object)view, (Object)rect);
        this.cacheVirtualIdMappings(view, b.j(l8), n8);
        return this.convertToFlutterNode(accessibilityNodeInfo, n8, view);
    }

    public boolean onAccessibilityHoverEvent(int n8, @NonNull MotionEvent motionEvent) {
        c c8 = (c)this.flutterIdToOrigin.get(n8);
        if (c8 == null) {
            return false;
        }
        Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)c8.a);
        int n9 = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] arrpointerProperties = new MotionEvent.PointerProperties[n9];
        MotionEvent.PointerCoords[] arrpointerCoords = new MotionEvent.PointerCoords[n9];
        for (n8 = 0; n8 < motionEvent.getPointerCount(); ++n8) {
            MotionEvent.PointerProperties pointerProperties;
            arrpointerProperties[n8] = pointerProperties = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(n8, pointerProperties);
            pointerProperties = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(n8, (MotionEvent.PointerCoords)pointerProperties);
            pointerProperties = new MotionEvent.PointerCoords((MotionEvent.PointerCoords)pointerProperties);
            arrpointerCoords[n8] = pointerProperties;
            pointerProperties.x -= (float)rect.left;
            pointerProperties.y -= (float)rect.top;
        }
        motionEvent = MotionEvent.obtain((long)motionEvent.getDownTime(), (long)motionEvent.getEventTime(), (int)motionEvent.getAction(), (int)motionEvent.getPointerCount(), (MotionEvent.PointerProperties[])arrpointerProperties, (MotionEvent.PointerCoords[])arrpointerCoords, (int)motionEvent.getMetaState(), (int)motionEvent.getButtonState(), (float)motionEvent.getXPrecision(), (float)motionEvent.getYPrecision(), (int)motionEvent.getDeviceId(), (int)motionEvent.getEdgeFlags(), (int)motionEvent.getSource(), (int)motionEvent.getFlags());
        return c8.a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean performAction(int n8, int n9, Bundle bundle) {
        c c8 = (c)this.flutterIdToOrigin.get(n8);
        if (c8 == null) {
            return false;
        }
        AccessibilityNodeProvider accessibilityNodeProvider = c8.a.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(c8.b, n9, bundle);
    }

    public View platformViewOfNode(int n8) {
        c c8 = (c)this.flutterIdToOrigin.get(n8);
        if (c8 == null) {
            return null;
        }
        return c8.a;
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        int n8;
        AccessibilityEvent accessibilityEvent2 = AccessibilityEvent.obtain((AccessibilityEvent)accessibilityEvent);
        Object object = this.reflectionAccessors.h((AccessibilityRecord)accessibilityEvent);
        if (object == null) {
            return false;
        }
        int n9 = b.j(object.longValue());
        Integer n10 = (Integer)this.originToFlutterId.get((Object)new c(view, n9, null));
        object = n10;
        if (n10 == null) {
            n8 = this.nextFlutterId;
            this.nextFlutterId = n8 + 1;
            this.cacheVirtualIdMappings(view, n9, n8);
            object = n8;
        }
        accessibilityEvent2.setSource(this.rootAccessibilityView, object.intValue());
        accessibilityEvent2.setClassName(accessibilityEvent.getClassName());
        accessibilityEvent2.setPackageName(accessibilityEvent.getPackageName());
        for (n9 = 0; n9 < accessibilityEvent2.getRecordCount(); ++n9) {
            accessibilityEvent = accessibilityEvent2.getRecord(n9);
            object = this.reflectionAccessors.h((AccessibilityRecord)accessibilityEvent);
            if (object == null) {
                return false;
            }
            if (!this.originToFlutterId.containsKey(object = new c(view, b.j(object.longValue()), null))) {
                return false;
            }
            n8 = (Integer)this.originToFlutterId.get(object);
            accessibilityEvent.setSource(this.rootAccessibilityView, n8);
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEvent2);
    }

    public static class b {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;
        public final Field e;
        public final Method f;

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public b() {
            Field field;
            Method method2;
            Method method3;
            Method method;
            Method method4;
            Field field2;
            block14 : {
                block15 : {
                    block13 : {
                        block12 : {
                            block11 : {
                                method2 = null;
                                try {
                                    method3 = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
                                    break block11;
                                }
                                catch (NoSuchMethodException noSuchMethodException) {}
                                t5.b.g("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                                method3 = null;
                            }
                            try {
                                method4 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
                                break block12;
                            }
                            catch (NoSuchMethodException noSuchMethodException) {}
                            t5.b.g("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                            method4 = null;
                        }
                        if (Build.VERSION.SDK_INT <= 26) {
                            method = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                            break block13;
                        }
                        field = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                        field.setAccessible(true);
                        field2 = Class.forName((String)"android.util.LongArray").getMethod("get", new Class[]{Integer.TYPE});
                        method = null;
                        break block14;
                        catch (NoSuchMethodException noSuchMethodException) {}
                        t5.b.g("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                        method = null;
                    }
                    try {
                        field = AccessibilityNodeInfo.class.getMethod("getChildId", new Class[]{Integer.TYPE});
                        break block15;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {}
                    t5.b.g("AccessibilityBridge", "can't invoke getChildId with reflection");
                    field = null;
                }
                Object var7_11 = null;
                field2 = null;
                method2 = method;
                method = field;
                field = var7_11;
                break block14;
                catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException noSuchMethodException) {}
                t5.b.g("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method = null;
                field2 = field = method;
            }
            this.a = method3;
            this.b = method2;
            this.c = method4;
            this.d = method;
            this.e = field;
            this.f = field2;
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public static int j(long l8) {
            return (int)(l8 >> 32);
        }

        public static boolean k(long l8, int n8) {
            if ((l8 & 1L << n8) != 0L) {
                return true;
            }
            return false;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            int n8 = Build.VERSION.SDK_INT;
            Object var4_2 = null;
            if (n8 < 26) {
                t5.b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            accessibilityNodeInfo = AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)accessibilityNodeInfo);
            Parcel parcel = Parcel.obtain();
            parcel.setDataPosition(0);
            accessibilityNodeInfo.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            long l8 = parcel.readLong();
            if (b.k(l8, 0)) {
                parcel.readInt();
            }
            if (b.k(l8, 1)) {
                parcel.readLong();
            }
            if (b.k(l8, 2)) {
                parcel.readInt();
            }
            accessibilityNodeInfo = var4_2;
            if (b.k(l8, 3)) {
                accessibilityNodeInfo = Long.valueOf((long)parcel.readLong());
            }
            parcel.recycle();
            return accessibilityNodeInfo;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int n8) {
            void var1_4;
            Object object;
            block12 : {
                block10 : {
                    block11 : {
                        block9 : {
                            object = this.d;
                            if (object == null) {
                                if (this.e == null) return null;
                                if (this.f == null) {
                                    return null;
                                }
                            }
                            if (object == null) break block11;
                            try {
                                return (Long)object.invoke((Object)accessibilityNodeInfo, new Object[]{n8});
                            }
                            catch (InvocationTargetException invocationTargetException) {
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                break block9;
                            }
                            object = "The getChildId method threw an exception when invoked.";
                            break block12;
                        }
                        object = "Failed to access getChildId method.";
                        break block12;
                    }
                    try {
                        accessibilityNodeInfo = (Long)this.f.invoke(this.e.get((Object)accessibilityNodeInfo), new Object[]{n8});
                        accessibilityNodeInfo.longValue();
                        return accessibilityNodeInfo;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block10;
                    }
                    object = "The longArrayGetIndex method threw an exception when invoked.";
                    break block12;
                }
                object = "Failed to access longArrayGetIndex method or the childNodeId field.";
            }
            t5.b.h("AccessibilityBridge", (String)object, (Throwable)var1_4);
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            void var2_5;
            String string2;
            block4 : {
                block3 : {
                    Method method = this.b;
                    if (method == null) return b.l(accessibilityNodeInfo);
                    try {
                        method = (Long)method.invoke((Object)accessibilityNodeInfo, new Object[0]);
                        method.longValue();
                        return method;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block3;
                    }
                    string2 = "The getParentNodeId method threw an exception when invoked.";
                    break block4;
                }
                string2 = "Failed to access getParentNodeId method.";
            }
            t5.b.h("AccessibilityBridge", string2, (Throwable)var2_5);
            return b.l(accessibilityNodeInfo);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Long h(AccessibilityRecord object) {
            void var2_5;
            block5 : {
                block4 : {
                    Method method = this.c;
                    if (method == null) {
                        return null;
                    }
                    try {
                        return (Long)method.invoke(object, new Object[0]);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block4;
                    }
                    object = "The getRecordSourceNodeId method threw an exception when invoked.";
                    break block5;
                }
                object = "Failed to access the getRecordSourceNodeId method.";
            }
            t5.b.h("AccessibilityBridge", (String)object, (Throwable)var2_5);
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Long i(AccessibilityNodeInfo object) {
            void var2_5;
            block5 : {
                block4 : {
                    Method method = this.a;
                    if (method == null) {
                        return null;
                    }
                    try {
                        return (Long)method.invoke(object, new Object[0]);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block4;
                    }
                    object = "The getSourceNodeId method threw an exception when invoked.";
                    break block5;
                }
                object = "Failed to access getSourceNodeId method.";
            }
            t5.b.h("AccessibilityBridge", (String)object, (Throwable)var2_5);
            return null;
        }
    }

    public static class c {
        public final View a;
        public final int b;

        public c(View view, int n8) {
            this.a = view;
            this.b = n8;
        }

        public /* synthetic */ c(View view, int n8,  a8) {
            this(view, n8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            if (this.b == object.b && this.a.equals((Object)object.a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() + 31) * 31 + this.b;
        }
    }

}

