package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.AbstractC1995b;

@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Method f15156a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f15157b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f15158c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f15159d;

        /* renamed from: e, reason: collision with root package name */
        public final Field f15160e;

        /* renamed from: f, reason: collision with root package name */
        public final Method f15161f;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                } catch (NoSuchMethodException unused3) {
                    AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method3 = null;
                }
                try {
                    method4 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    field = null;
                } catch (NoSuchMethodException unused4) {
                    AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method4 = null;
                    field = null;
                }
                method5 = field;
                method6 = method3;
            } else {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    field = declaredField;
                    method4 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = 0;
                }
            }
            this.f15156a = method;
            this.f15157b = method6;
            this.f15158c = method2;
            this.f15159d = method4;
            this.f15160e = field;
            this.f15161f = method5;
        }

        public static int j(long j7) {
            return (int) (j7 >> 32);
        }

        public static boolean k(long j7, int i7) {
            return (j7 & (1 << i7)) != 0;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                AbstractC1995b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
            String str;
            Method method = this.f15159d;
            if (method == null && (this.f15160e == null || this.f15161f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i7));
                } catch (IllegalAccessException e7) {
                    e = e7;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e8) {
                    e = e8;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    Long l7 = (Long) this.f15161f.invoke(this.f15160e.get(accessibilityNodeInfo), Integer.valueOf(i7));
                    l7.longValue();
                    return l7;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    e = e9;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e10) {
                    e = e10;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e11) {
                    e = e11;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f15157b;
            if (method != null) {
                try {
                    Long l7 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l7.longValue();
                    return l7;
                } catch (IllegalAccessException e7) {
                    e = e7;
                    str = "Failed to access getParentNodeId method.";
                    AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e8) {
                    e = e8;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f15158c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "Failed to access the getRecordSourceNodeId method.";
                AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e8) {
                e = e8;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f15156a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "Failed to access getSourceNodeId method.";
                AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e8) {
                e = e8;
                str = "The getSourceNodeId method threw an exception when invoked.";
                AbstractC1995b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final View f15162a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15163b;

        public c(View view, int i7) {
            this.f15162a = view;
            this.f15163b = i7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15163b == cVar.f15163b && this.f15162a.equals(cVar.f15162a);
        }

        public int hashCode() {
            return ((this.f15162a.hashCode() + 31) * 31) + this.f15163b;
        }
    }

    public AccessibilityViewEmbedder(@NonNull View view, int i7) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i7;
    }

    private void addChildrenToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i7;
        for (int i8 = 0; i8 < accessibilityNodeInfo.getChildCount(); i8++) {
            Long f7 = this.reflectionAccessors.f(accessibilityNodeInfo, i8);
            if (f7 != null) {
                int j7 = b.j(f7.longValue());
                c cVar = new c(view, j7);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i7 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i9 = this.nextFlutterId;
                    this.nextFlutterId = i9 + 1;
                    cacheVirtualIdMappings(view, j7, i9);
                    i7 = i9;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i7);
            }
        }
    }

    private void cacheVirtualIdMappings(@NonNull View view, int i7, int i8) {
        c cVar = new c(view, i7);
        this.originToFlutterId.put(cVar, Integer.valueOf(i8));
        this.flutterIdToOrigin.put(i8, cVar);
    }

    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, int i7, @NonNull View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i7);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i7);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        int drawingOrder;
        boolean isImportantForAccessibility;
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
        int i7 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i7 >= 24) {
            drawingOrder = accessibilityNodeInfo.getDrawingOrder();
            accessibilityNodeInfo2.setDrawingOrder(drawingOrder);
            isImportantForAccessibility = accessibilityNodeInfo.isImportantForAccessibility();
            accessibilityNodeInfo2.setImportantForAccessibility(isImportantForAccessibility);
        }
        if (i7 >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    private void setFlutterNodeParent(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull View view, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g7 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g7 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(g7.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(@NonNull AccessibilityNodeInfo accessibilityNodeInfo, @NonNull Rect rect, @NonNull AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f15162a) || cVar.f15162a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f15162a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f15163b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, cVar.f15162a);
    }

    public Integer getRecordFlutterId(@NonNull View view, @NonNull AccessibilityRecord accessibilityRecord) {
        Long h7 = this.reflectionAccessors.h(accessibilityRecord);
        if (h7 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h7.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(@NonNull View view, int i7, @NonNull Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i8 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i8 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i8.longValue()), i7);
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, view);
    }

    public boolean onAccessibilityHoverEvent(int i7, @NonNull MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f15162a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i8] = pointerProperties;
            motionEvent.getPointerProperties(i8, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i8, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i8] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f15162a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null || (accessibilityNodeProvider = cVar.f15162a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f15163b, i8, bundle);
    }

    public View platformViewOfNode(int i7) {
        c cVar = this.flutterIdToOrigin.get(i7);
        if (cVar == null) {
            return null;
        }
        return cVar.f15162a;
    }

    public boolean requestSendAccessibilityEvent(@NonNull View view, @NonNull View view2, @NonNull AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long h7 = this.reflectionAccessors.h(accessibilityEvent);
        if (h7 == null) {
            return false;
        }
        int j7 = b.j(h7.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j7));
        if (num == null) {
            int i7 = this.nextFlutterId;
            this.nextFlutterId = i7 + 1;
            Integer valueOf = Integer.valueOf(i7);
            cacheVirtualIdMappings(view, j7, i7);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i8 = 0; i8 < obtain.getRecordCount(); i8++) {
            AccessibilityRecord record = obtain.getRecord(i8);
            Long h8 = this.reflectionAccessors.h(record);
            if (h8 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h8.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
