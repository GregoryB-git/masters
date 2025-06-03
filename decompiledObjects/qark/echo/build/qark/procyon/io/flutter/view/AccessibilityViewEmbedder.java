// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.view;

import java.lang.reflect.InvocationTargetException;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.view.MotionEvent$PointerCoords;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityRecord;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import androidx.annotation.NonNull;
import android.util.SparseArray;
import android.graphics.Rect;
import android.view.View;
import java.util.Map;
import androidx.annotation.Keep;

@Keep
class AccessibilityViewEmbedder
{
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<c> flutterIdToOrigin;
    private int nextFlutterId;
    private final Map<c, Integer> originToFlutterId;
    private final b reflectionAccessors;
    private final View rootAccessibilityView;
    
    public AccessibilityViewEmbedder(@NonNull final View rootAccessibilityView, final int nextFlutterId) {
        this.reflectionAccessors = new b(null);
        this.flutterIdToOrigin = (SparseArray<c>)new SparseArray();
        this.rootAccessibilityView = rootAccessibilityView;
        this.nextFlutterId = nextFlutterId;
        this.originToFlutterId = new HashMap<c, Integer>();
        this.embeddedViewToDisplayBounds = new HashMap<View, Rect>();
    }
    
    private void addChildrenToFlutterNode(@NonNull final AccessibilityNodeInfo accessibilityNodeInfo, @NonNull final View view, @NonNull final AccessibilityNodeInfo accessibilityNodeInfo2) {
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
            final Long d = this.reflectionAccessors.f(accessibilityNodeInfo, i);
            if (d != null) {
                final int b = j(d);
                final c c = new c(view, b, null);
                int intValue;
                if (this.originToFlutterId.containsKey(c)) {
                    intValue = this.originToFlutterId.get(c);
                }
                else {
                    intValue = this.nextFlutterId++;
                    this.cacheVirtualIdMappings(view, b, intValue);
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, intValue);
            }
        }
    }
    
    private void cacheVirtualIdMappings(@NonNull final View view, final int n, final int i) {
        final c c = new c(view, n, null);
        this.originToFlutterId.put(c, i);
        this.flutterIdToOrigin.put(i, (Object)c);
    }
    
    @NonNull
    private AccessibilityNodeInfo convertToFlutterNode(@NonNull final AccessibilityNodeInfo accessibilityNodeInfo, final int n, @NonNull final View view) {
        final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, n);
        obtain.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, n);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        final Rect rect = this.embeddedViewToDisplayBounds.get(view);
        this.copyAccessibilityFields(accessibilityNodeInfo, obtain);
        this.setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        this.addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        this.setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }
    
    private void copyAccessibilityFields(@NonNull final AccessibilityNodeInfo accessibilityNodeInfo, @NonNull final AccessibilityNodeInfo accessibilityNodeInfo2) {
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
        final int sdk_INT = Build$VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (sdk_INT >= 24) {
            k.a(accessibilityNodeInfo2, j.a(accessibilityNodeInfo));
            a.a(accessibilityNodeInfo2, l.a(accessibilityNodeInfo));
        }
        if (sdk_INT >= 26) {
            n.a(accessibilityNodeInfo2, m.a(accessibilityNodeInfo));
            io.flutter.view.b.a(accessibilityNodeInfo2, o.a(accessibilityNodeInfo));
            q.a(accessibilityNodeInfo2, p.a(accessibilityNodeInfo));
        }
    }
    
    private void setFlutterNodeParent(@NonNull final AccessibilityNodeInfo accessibilityNodeInfo, @NonNull final View view, @NonNull final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Long c = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (c == null) {
            return;
        }
        final Integer n = this.originToFlutterId.get(new c(view, j(c), null));
        if (n != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, (int)n);
        }
    }
    
    private void setFlutterNodesTranslateBounds(@NonNull final AccessibilityNodeInfo accessibilityNodeInfo, @NonNull final Rect rect, @NonNull final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Rect boundsInParent = new Rect();
        accessibilityNodeInfo.getBoundsInParent(boundsInParent);
        accessibilityNodeInfo2.setBoundsInParent(boundsInParent);
        final Rect boundsInScreen = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(boundsInScreen);
        boundsInScreen.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(boundsInScreen);
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return null;
        }
        if (!this.embeddedViewToDisplayBounds.containsKey(c.a)) {
            return null;
        }
        if (c.a.getAccessibilityNodeProvider() == null) {
            return null;
        }
        final AccessibilityNodeInfo accessibilityNodeInfo = c.a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c.b);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return this.convertToFlutterNode(accessibilityNodeInfo, n, c.a);
    }
    
    public Integer getRecordFlutterId(@NonNull final View view, @NonNull final AccessibilityRecord accessibilityRecord) {
        final Long e = this.reflectionAccessors.h(accessibilityRecord);
        if (e == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, j(e), null));
    }
    
    public AccessibilityNodeInfo getRootNode(@NonNull final View view, final int n, @NonNull final Rect rect) {
        final AccessibilityNodeInfo accessibilityNodeInfo = view.createAccessibilityNodeInfo();
        final Long a = this.reflectionAccessors.i(accessibilityNodeInfo);
        if (a == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        this.cacheVirtualIdMappings(view, j(a), n);
        return this.convertToFlutterNode(accessibilityNodeInfo, n, view);
    }
    
    public boolean onAccessibilityHoverEvent(int i, @NonNull MotionEvent obtain) {
        final c c = (c)this.flutterIdToOrigin.get(i);
        i = 0;
        if (c == null) {
            return false;
        }
        final Rect rect = this.embeddedViewToDisplayBounds.get(c.a);
        final int pointerCount = obtain.getPointerCount();
        final MotionEvent$PointerProperties[] array = new MotionEvent$PointerProperties[pointerCount];
        final MotionEvent$PointerCoords[] array2 = new MotionEvent$PointerCoords[pointerCount];
        while (i < obtain.getPointerCount()) {
            obtain.getPointerProperties(i, array[i] = new MotionEvent$PointerProperties());
            final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
            obtain.getPointerCoords(i, motionEvent$PointerCoords);
            final MotionEvent$PointerCoords motionEvent$PointerCoords2 = new MotionEvent$PointerCoords(motionEvent$PointerCoords);
            array2[i] = motionEvent$PointerCoords2;
            motionEvent$PointerCoords2.x -= rect.left;
            motionEvent$PointerCoords2.y -= rect.top;
            ++i;
        }
        obtain = MotionEvent.obtain(obtain.getDownTime(), obtain.getEventTime(), obtain.getAction(), obtain.getPointerCount(), array, array2, obtain.getMetaState(), obtain.getButtonState(), obtain.getXPrecision(), obtain.getYPrecision(), obtain.getDeviceId(), obtain.getEdgeFlags(), obtain.getSource(), obtain.getFlags());
        return c.a.dispatchGenericMotionEvent(obtain);
    }
    
    public boolean performAction(final int n, final int n2, final Bundle bundle) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return false;
        }
        final AccessibilityNodeProvider accessibilityNodeProvider = c.a.getAccessibilityNodeProvider();
        return accessibilityNodeProvider != null && accessibilityNodeProvider.performAction(c.b, n2, bundle);
    }
    
    public View platformViewOfNode(final int n) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return null;
        }
        return c.a;
    }
    
    public boolean requestSendAccessibilityEvent(@NonNull final View view, @NonNull final View view2, @NonNull final AccessibilityEvent accessibilityEvent) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        final Long e = this.reflectionAccessors.h((AccessibilityRecord)accessibilityEvent);
        if (e == null) {
            return false;
        }
        final int b = j(e);
        Integer value;
        if ((value = this.originToFlutterId.get(new c(view, b, null))) == null) {
            final int i = this.nextFlutterId++;
            this.cacheVirtualIdMappings(view, b, i);
            value = i;
        }
        ((AccessibilityRecord)obtain).setSource(this.rootAccessibilityView, (int)value);
        ((AccessibilityRecord)obtain).setClassName(((AccessibilityRecord)accessibilityEvent).getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int j = 0; j < obtain.getRecordCount(); ++j) {
            final AccessibilityRecord record = obtain.getRecord(j);
            final Long e2 = this.reflectionAccessors.h(record);
            if (e2 == null) {
                return false;
            }
            final c c = new c(view, j(e2), null);
            if (!this.originToFlutterId.containsKey(c)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, (int)this.originToFlutterId.get(c));
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
    
    public static class b
    {
        public final Method a;
        public final Method b;
        public final Method c;
        public final Method d;
        public final Field e;
        public final Method f;
        
        public b() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aconst_null    
            //     5: astore          6
            //     7: ldc             Landroid/view/accessibility/AccessibilityNodeInfo;.class
            //     9: ldc             "getSourceNodeId"
            //    11: iconst_0       
            //    12: anewarray       Ljava/lang/Class;
            //    15: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    18: astore          4
            //    20: goto            33
            //    23: ldc             "AccessibilityBridge"
            //    25: ldc             "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
            //    27: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
            //    30: aconst_null    
            //    31: astore          4
            //    33: ldc             Landroid/view/accessibility/AccessibilityRecord;.class
            //    35: ldc             "getSourceNodeId"
            //    37: iconst_0       
            //    38: anewarray       Ljava/lang/Class;
            //    41: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    44: astore          5
            //    46: goto            59
            //    49: ldc             "AccessibilityBridge"
            //    51: ldc             "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
            //    53: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
            //    56: aconst_null    
            //    57: astore          5
            //    59: getstatic       android/os/Build$VERSION.SDK_INT:I
            //    62: bipush          26
            //    64: if_icmpgt       137
            //    67: ldc             Landroid/view/accessibility/AccessibilityNodeInfo;.class
            //    69: ldc             "getParentNodeId"
            //    71: iconst_0       
            //    72: anewarray       Ljava/lang/Class;
            //    75: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    78: astore_1       
            //    79: goto            91
            //    82: ldc             "AccessibilityBridge"
            //    84: ldc             "can't invoke getParentNodeId with reflection"
            //    86: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
            //    89: aconst_null    
            //    90: astore_1       
            //    91: ldc             Landroid/view/accessibility/AccessibilityNodeInfo;.class
            //    93: ldc             "getChildId"
            //    95: iconst_1       
            //    96: anewarray       Ljava/lang/Class;
            //    99: dup            
            //   100: iconst_0       
            //   101: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   104: aastore        
            //   105: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //   108: astore_2       
            //   109: aconst_null    
            //   110: astore          7
            //   112: aconst_null    
            //   113: astore_3       
            //   114: aload_1        
            //   115: astore          6
            //   117: aload_2        
            //   118: astore_1       
            //   119: aload           7
            //   121: astore_2       
            //   122: goto            189
            //   125: ldc             "AccessibilityBridge"
            //   127: ldc             "can't invoke getChildId with reflection"
            //   129: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
            //   132: aconst_null    
            //   133: astore_2       
            //   134: goto            109
            //   137: ldc             Landroid/view/accessibility/AccessibilityNodeInfo;.class
            //   139: ldc             "mChildNodeIds"
            //   141: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
            //   144: astore_2       
            //   145: aload_2        
            //   146: iconst_1       
            //   147: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //   150: ldc             "android.util.LongArray"
            //   152: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
            //   155: ldc             "get"
            //   157: iconst_1       
            //   158: anewarray       Ljava/lang/Class;
            //   161: dup            
            //   162: iconst_0       
            //   163: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   166: aastore        
            //   167: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //   170: astore_3       
            //   171: aconst_null    
            //   172: astore_1       
            //   173: goto            189
            //   176: ldc             "AccessibilityBridge"
            //   178: ldc             "can't access childNodeIdsField with reflection"
            //   180: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
            //   183: aconst_null    
            //   184: astore_1       
            //   185: aload_1        
            //   186: astore_2       
            //   187: aload_2        
            //   188: astore_3       
            //   189: aload_0        
            //   190: aload           4
            //   192: putfield        io/flutter/view/AccessibilityViewEmbedder$b.a:Ljava/lang/reflect/Method;
            //   195: aload_0        
            //   196: aload           6
            //   198: putfield        io/flutter/view/AccessibilityViewEmbedder$b.b:Ljava/lang/reflect/Method;
            //   201: aload_0        
            //   202: aload           5
            //   204: putfield        io/flutter/view/AccessibilityViewEmbedder$b.c:Ljava/lang/reflect/Method;
            //   207: aload_0        
            //   208: aload_1        
            //   209: putfield        io/flutter/view/AccessibilityViewEmbedder$b.d:Ljava/lang/reflect/Method;
            //   212: aload_0        
            //   213: aload_2        
            //   214: putfield        io/flutter/view/AccessibilityViewEmbedder$b.e:Ljava/lang/reflect/Field;
            //   217: aload_0        
            //   218: aload_3        
            //   219: putfield        io/flutter/view/AccessibilityViewEmbedder$b.f:Ljava/lang/reflect/Method;
            //   222: return         
            //   223: astore_1       
            //   224: goto            23
            //   227: astore_1       
            //   228: goto            49
            //   231: astore_1       
            //   232: goto            82
            //   235: astore_2       
            //   236: goto            125
            //   239: astore_1       
            //   240: goto            176
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                              
            //  -----  -----  -----  -----  ----------------------------------
            //  7      20     223    33     Ljava/lang/NoSuchMethodException;
            //  33     46     227    59     Ljava/lang/NoSuchMethodException;
            //  67     79     231    91     Ljava/lang/NoSuchMethodException;
            //  91     109    235    137    Ljava/lang/NoSuchMethodException;
            //  137    171    239    189    Ljava/lang/NoSuchFieldException;
            //  137    171    239    189    Ljava/lang/ClassNotFoundException;
            //  137    171    239    189    Ljava/lang/NoSuchMethodException;
            //  137    171    239    189    Ljava/lang/NullPointerException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 129 out of bounds for length 129
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
            //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public static int j(final long n) {
            return (int)(n >> 32);
        }
        
        public static boolean k(final long n, final int n2) {
            return (n & 1L << n2) != 0x0L;
        }
        
        public static Long l(AccessibilityNodeInfo obtain) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final Long n = null;
            if (sdk_INT < 26) {
                t5.b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            obtain = AccessibilityNodeInfo.obtain(obtain);
            final Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            final long long1 = obtain2.readLong();
            if (k(long1, 0)) {
                obtain2.readInt();
            }
            if (k(long1, 1)) {
                obtain2.readLong();
            }
            if (k(long1, 2)) {
                obtain2.readInt();
            }
            Long value = n;
            if (k(long1, 3)) {
                value = obtain2.readLong();
            }
            obtain2.recycle();
            return value;
        }
        
        public final Long f(final AccessibilityNodeInfo accessibilityNodeInfo, final int n) {
            final Method d = this.d;
            if (d == null && (this.e == null || this.f == null)) {
                return null;
            }
            String s = null;
            Label_0062: {
                if (d != null) {
                    Label_0071: {
                        try {
                            return (Long)d.invoke(accessibilityNodeInfo, n);
                        }
                        catch (InvocationTargetException ex) {}
                        catch (IllegalAccessException ex) {
                            break Label_0071;
                        }
                        s = "The getChildId method threw an exception when invoked.";
                        break Label_0062;
                    }
                    s = "Failed to access getChildId method.";
                }
                else {
                    Label_0132: {
                        try {
                            final Long n2 = (Long)this.f.invoke(this.e.get(accessibilityNodeInfo), n);
                            n2;
                            return n2;
                        }
                        catch (ArrayIndexOutOfBoundsException ex) {}
                        catch (InvocationTargetException ex) {}
                        catch (IllegalAccessException ex) {
                            break Label_0132;
                        }
                        s = "The longArrayGetIndex method threw an exception when invoked.";
                        break Label_0062;
                    }
                    s = "Failed to access longArrayGetIndex method or the childNodeId field.";
                }
            }
            final InvocationTargetException ex;
            t5.b.h("AccessibilityBridge", s, ex);
            return null;
        }
        
        public final Long g(final AccessibilityNodeInfo obj) {
            final Method b = this.b;
            if (b != null) {
                while (true) {
                    Label_0050: {
                        try {
                            final Long n = (Long)b.invoke(obj, new Object[0]);
                            n;
                            return n;
                        }
                        catch (InvocationTargetException ex) {}
                        catch (IllegalAccessException ex) {
                            break Label_0050;
                        }
                        final String s = "The getParentNodeId method threw an exception when invoked.";
                        final InvocationTargetException ex;
                        t5.b.h("AccessibilityBridge", s, ex);
                        return l(obj);
                    }
                    final String s = "Failed to access getParentNodeId method.";
                    continue;
                }
            }
            return l(obj);
        }
        
        public final Long h(final AccessibilityRecord obj) {
            final Method c = this.c;
            if (c == null) {
                return null;
            }
            while (true) {
                Label_0046: {
                    try {
                        return (Long)c.invoke(obj, new Object[0]);
                    }
                    catch (InvocationTargetException ex) {}
                    catch (IllegalAccessException ex) {
                        break Label_0046;
                    }
                    final String s = "The getRecordSourceNodeId method threw an exception when invoked.";
                    final InvocationTargetException ex;
                    t5.b.h("AccessibilityBridge", s, ex);
                    return null;
                }
                final String s = "Failed to access the getRecordSourceNodeId method.";
                continue;
            }
        }
        
        public final Long i(final AccessibilityNodeInfo obj) {
            final Method a = this.a;
            if (a == null) {
                return null;
            }
            while (true) {
                Label_0046: {
                    try {
                        return (Long)a.invoke(obj, new Object[0]);
                    }
                    catch (InvocationTargetException ex) {}
                    catch (IllegalAccessException ex) {
                        break Label_0046;
                    }
                    final String s = "The getSourceNodeId method threw an exception when invoked.";
                    final InvocationTargetException ex;
                    t5.b.h("AccessibilityBridge", s, ex);
                    return null;
                }
                final String s = "Failed to access getSourceNodeId method.";
                continue;
            }
        }
    }
    
    public static class c
    {
        public final View a;
        public final int b;
        
        public c(final View a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.b == c.b && this.a.equals(c.a);
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() + 31) * 31 + this.b;
        }
    }
}
