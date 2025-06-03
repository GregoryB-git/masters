/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.database.ContentObserver
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.opengl.Matrix
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.provider.Settings
 *  android.provider.Settings$Global
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.LocaleSpan
 *  android.text.style.TtsSpan
 *  android.text.style.TtsSpan$Builder
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.CharBuffer
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package io.flutter.view;

import D5.a;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.AccessibilityViewEmbedder;
import io.flutter.view.a;
import io.flutter.view.b;
import io.flutter.view.c;
import io.flutter.view.d;
import io.flutter.view.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class i
extends AccessibilityNodeProvider {
    public static final int A;
    public static int B;
    public static int C;
    public static final int z;
    public final View a;
    public final D5.a b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final io.flutter.plugin.platform.o e;
    public final ContentResolver f;
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public l i;
    public Integer j;
    public Integer k;
    public int l = 0;
    public l m;
    public l n;
    public l o;
    public final List p = new ArrayList();
    public int q = 0;
    public Integer r = 0;
    public k s;
    public boolean t = false;
    public boolean u = false;
    public final a.b v;
    public final AccessibilityManager.AccessibilityStateChangeListener w;
    public final AccessibilityManager.TouchExplorationStateChangeListener x;
    public final ContentObserver y;

    static {
        z = g.s.o | g.r.o | g.t.o | g.u.o;
        A = i.p.o | i.q.o | i.r.o | i.t.o | i.u.o | i.v.o | i.w.o | i.x.o | i.F.o | i.G.o | i.K.o | i.M.o;
        B = 267386881;
        C = g.E.o & g.F.o & g.x.o;
    }

    public i(View view, D5.a a8, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o o8) {
        this(view, a8, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), o8);
    }

    public i(View object, D5.a a8, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o o8) {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        ContentObserver contentObserver;
        this.v = new a.b(){

            @Override
            public void a(String string2) {
                i.this.a.announceForAccessibility((CharSequence)string2);
            }

            @Override
            public void b(ByteBuffer byteBuffer, String[] arrstring, ByteBuffer[] arrbyteBuffer) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int n8 = arrbyteBuffer.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    arrbyteBuffer[i8].order(ByteOrder.LITTLE_ENDIAN);
                }
                i.this.c0(byteBuffer, arrstring, arrbyteBuffer);
            }

            @Override
            public void c(ByteBuffer byteBuffer, String[] arrstring) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                i.this.b0(byteBuffer, arrstring);
            }

            @Override
            public void d(String string2) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AccessibilityEvent accessibilityEvent = i.this.H(0, 32);
                accessibilityEvent.getText().add((Object)string2);
                i.this.T(accessibilityEvent);
            }

            @Override
            public void e(int n8) {
                i.this.S(n8, 8);
            }

            @Override
            public void f(int n8) {
                i.this.S(n8, 2);
            }

            @Override
            public void g(int n8) {
                i.this.S(n8, 1);
            }
        };
        this.w = accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener(){

            public void onAccessibilityStateChanged(boolean bl) {
                if (i.this.u) {
                    return;
                }
                i i8 = i.this;
                if (bl) {
                    i8.b.g(i.this.v);
                    i.this.b.e();
                } else {
                    i8.X(false);
                    i.this.b.g(null);
                    i.this.b.d();
                }
                if (i.this.s != null) {
                    i.this.s.a(bl, i.this.c.isTouchExplorationEnabled());
                }
            }
        };
        this.y = contentObserver = new ContentObserver(new Handler()){

            public void onChange(boolean bl) {
                this.onChange(bl, null);
            }

            public void onChange(boolean bl, Uri object) {
                if (i.this.u) {
                    return;
                }
                object = Settings.Global.getString((ContentResolver)i.this.f, (String)"transition_animation_scale");
                if (object != null && object.equals((Object)"0")) {
                    i.f(i.this, f.r.o);
                } else {
                    i.e(i.this, f.r.o);
                }
                i.this.U();
            }
        };
        this.a = object;
        this.b = a8;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.d = accessibilityViewEmbedder;
        this.e = o8;
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        this.x = object = new AccessibilityManager.TouchExplorationStateChangeListener(){

            public void onTouchExplorationStateChanged(boolean bl) {
                if (i.this.u) {
                    return;
                }
                if (!bl) {
                    i.this.X(false);
                    i.this.M();
                }
                if (i.this.s != null) {
                    i.this.s.a(accessibilityManager.isEnabled(), bl);
                }
            }
        };
        object.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)object);
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor((String)"transition_animation_scale"), false, contentObserver);
        if (Build.VERSION.SDK_INT >= 31) {
            this.Y();
        }
        o8.a(this);
    }

    public static /* synthetic */ boolean E(l l8, l l9) {
        if (l9 == l8) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean a(l l8, l l9) {
        return i.E(l8, l9);
    }

    public static /* synthetic */ boolean b(l l8) {
        return l8.x0(i.H);
    }

    public static /* synthetic */ int e(i i8, int n8) {
        i8.l = n8 &= i8.l;
        return n8;
    }

    public static /* synthetic */ int f(i i8, int n8) {
        i8.l = n8 |= i8.l;
        return n8;
    }

    public final void A(float f8, float f9, boolean bl) {
        if (this.g.isEmpty()) {
            return;
        }
        l l8 = this.z().y0(new float[]{f8, f9, 0.0f, 1.0f}, bl);
        if (l8 != this.o) {
            l l9;
            if (l8 != null) {
                this.S(l8.b, 128);
            }
            if ((l9 = this.o) != null) {
                this.S(l9.b, 256);
            }
            this.o = l8;
        }
    }

    public boolean B() {
        return this.c.isEnabled();
    }

    public final boolean C(l l8) {
        boolean bl = l8.x0(i.A);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (l8.t0() != null) {
            return true;
        }
        if ((l8.d & C) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean D() {
        return this.c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent G(int n8) {
        return AccessibilityEvent.obtain((int)n8);
    }

    public final AccessibilityEvent H(int n8, int n9) {
        AccessibilityEvent accessibilityEvent = this.G(n9);
        accessibilityEvent.setPackageName((CharSequence)this.a.getContext().getPackageName());
        accessibilityEvent.setSource(this.a, n8);
        return accessibilityEvent;
    }

    public AccessibilityNodeInfo I(View view) {
        return AccessibilityNodeInfo.obtain((View)view);
    }

    public AccessibilityNodeInfo J(View view, int n8) {
        return AccessibilityNodeInfo.obtain((View)view, (int)n8);
    }

    public boolean K(MotionEvent motionEvent) {
        return this.L(motionEvent, false);
    }

    public boolean L(MotionEvent motionEvent, boolean bl) {
        if (!this.c.isTouchExplorationEnabled()) {
            return false;
        }
        if (this.g.isEmpty()) {
            return false;
        }
        l l8 = this.z().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, bl);
        if (l8 != null && l8.i != -1) {
            if (bl) {
                return false;
            }
            return this.d.onAccessibilityHoverEvent(l8.b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                this.M();
                return true;
            }
            l8 = new StringBuilder();
            l8.append("unexpected accessibility hover event: ");
            l8.append((Object)motionEvent);
            t5.b.a("flutter", l8.toString());
            return false;
        }
        this.A(motionEvent.getX(), motionEvent.getY(), bl);
        return true;
    }

    public final void M() {
        l l8 = this.o;
        if (l8 != null) {
            this.S(l8.b, 256);
            this.o = null;
        }
    }

    public final void N(l l8) {
        String string2;
        String string3 = string2 = l8.p0();
        if (string2 == null) {
            string3 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.W(string3);
            return;
        }
        l8 = this.H(l8.b, 32);
        l8.getText().add((Object)string3);
        this.T((AccessibilityEvent)l8);
    }

    public final boolean O(l l8, int n8, Bundle object, boolean bl) {
        int n9 = object.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean bl2 = object.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int n10 = l8.g;
        int n11 = l8.h;
        this.Q(l8, n9, bl, bl2);
        if (n10 != l8.g || n11 != l8.h) {
            object = l8.r != null ? l8.r : "";
            AccessibilityEvent accessibilityEvent = this.H(l8.b, 8192);
            accessibilityEvent.getText().add(object);
            accessibilityEvent.setFromIndex(l8.g);
            accessibilityEvent.setToIndex(l8.h);
            accessibilityEvent.setItemCount(object.length());
            this.T(accessibilityEvent);
        }
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 == 4 || n9 == 8 || n9 == 16) {
                    return true;
                }
            } else {
                if (bl && l8.w0((g)((Object)(object = g.I)))) {
                    this.b.c(n8, (g)((Object)object), bl2);
                    return true;
                }
                if (!bl && l8.w0((g)((Object)(object = g.J)))) {
                    this.b.c(n8, (g)((Object)object), bl2);
                    return true;
                }
            }
        } else {
            if (bl && l8.w0((g)((Object)(object = g.y)))) {
                this.b.c(n8, (g)((Object)object), bl2);
                return true;
            }
            if (!bl && l8.w0((g)((Object)(object = g.z)))) {
                this.b.c(n8, (g)((Object)object), bl2);
                return true;
            }
        }
        return false;
    }

    public final boolean P(l l8, int n8, Bundle object) {
        object = object != null && object.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") ? object.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : "";
        this.b.c(n8, g.K, object);
        l8.r = (String)object;
        l8.s = null;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Q(l l8, int n8, boolean bl, boolean bl2) {
        block7 : {
            block11 : {
                block8 : {
                    block18 : {
                        Matcher matcher;
                        block16 : {
                            block17 : {
                                Matcher matcher2;
                                block15 : {
                                    block13 : {
                                        block9 : {
                                            block12 : {
                                                block14 : {
                                                    block10 : {
                                                        if (l8.h < 0) break block7;
                                                        if (l8.g < 0) {
                                                            return;
                                                        }
                                                        if (n8 == 1) break block8;
                                                        if (n8 == 2) break block9;
                                                        if (n8 == 4) break block10;
                                                        if (n8 != 8 && n8 != 16) break block11;
                                                        if (!bl) break block12;
                                                        break block13;
                                                    }
                                                    if (!bl || l8.h >= l8.r.length()) break block14;
                                                    matcher2 = Pattern.compile((String)"(?!^)(\\n)").matcher((CharSequence)l8.r.substring(l8.h));
                                                    if (!matcher2.find()) break block13;
                                                    break block15;
                                                }
                                                if (bl || l8.h <= 0) break block11;
                                                matcher = Pattern.compile((String)"(?s:.*)(\\n)").matcher((CharSequence)l8.r.substring(0, l8.h));
                                                if (matcher.find()) break block16;
                                            }
                                            l8.h = 0;
                                            break block11;
                                        }
                                        if (!bl || l8.h >= l8.r.length()) break block17;
                                        matcher2 = Pattern.compile((String)"\\p{L}(\\b)").matcher((CharSequence)l8.r.substring(l8.h));
                                        matcher2.find();
                                        if (matcher2.find()) break block15;
                                    }
                                    n8 = l8.r.length();
                                    break block18;
                                }
                                l.n(l8, matcher2.start(1));
                                break block11;
                            }
                            if (bl || l8.h <= 0 || !(matcher = Pattern.compile((String)"(?s:.*)(\\b)\\p{L}").matcher((CharSequence)l8.r.substring(0, l8.h))).find()) break block11;
                        }
                        n8 = matcher.start(1);
                    }
                    l8.h = n8;
                    break block11;
                }
                if (bl && l8.h < l8.r.length()) {
                    l.n(l8, 1);
                } else if (!bl && l8.h > 0) {
                    l.o(l8, 1);
                }
            }
            if (!bl2) {
                l8.g = l8.h;
            }
        }
    }

    public void R() {
        this.u = true;
        this.e.d();
        this.Z(null);
        this.c.removeAccessibilityStateChangeListener(this.w);
        this.c.removeTouchExplorationStateChangeListener(this.x);
        this.f.unregisterContentObserver(this.y);
        this.b.g(null);
    }

    public void S(int n8, int n9) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.T(this.H(n8, n9));
    }

    public final void T(AccessibilityEvent accessibilityEvent) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
    }

    public final void U() {
        this.b.f(this.l);
    }

    public final void V(int n8) {
        AccessibilityEvent accessibilityEvent = this.H(n8, 2048);
        accessibilityEvent.setContentChangeTypes(1);
        this.T(accessibilityEvent);
    }

    public final void W(String string2) {
        io.flutter.view.f.a(this.a, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void X(boolean bl) {
        if (this.t == bl) {
            return;
        }
        this.t = bl;
        int n8 = bl ? this.l | f.p.o : this.l & f.p.o;
        this.l = n8;
        this.U();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Y() {
        View view = this.a;
        if (view != null) {
            if (view.getResources() == null) {
                return;
            }
            int n8 = e.a(this.a.getResources().getConfiguration());
            n8 = n8 != Integer.MAX_VALUE && n8 >= 300 ? this.l | f.s.o : this.l & f.s.o;
            this.l = n8;
            this.U();
        }
    }

    public void Z(k k8) {
        this.s = k8;
    }

    public final boolean a0(l l8) {
        if (l8.j > 0 && (l.C0(this.i, new io.flutter.view.g(l8)) || !l.C0(this.i, new io.flutter.view.h()))) {
            return true;
        }
        return false;
    }

    public void b0(ByteBuffer byteBuffer, String[] arrstring) {
        while (byteBuffer.hasRemaining()) {
            h h8 = this.x(byteBuffer.getInt());
            h8.c = byteBuffer.getInt();
            int n8 = byteBuffer.getInt();
            Object var5_5 = null;
            String string2 = n8 == -1 ? null : arrstring[n8];
            h8.d = string2;
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? var5_5 : arrstring[n8];
            h8.e = string2;
        }
    }

    public void c0(ByteBuffer object, String[] object2, ByteBuffer[] hashSet) {
        Iterator iterator;
        l l8;
        Object object3 = new ArrayList();
        while (object.hasRemaining()) {
            l8 = this.y(object.getInt());
            l8.F0((ByteBuffer)object, (String[])object2, (ByteBuffer[])hashSet);
            if (l8.x0(i.C)) continue;
            if (l8.x0(i.u)) {
                this.m = l8;
            }
            if (l8.C) {
                object3.add((Object)l8);
            }
            if (l8.i == -1 || this.e.b(l8.i) || (l8 = this.e.c(l8.i)) == null) continue;
            l8.setImportantForAccessibility(0);
        }
        hashSet = new HashSet();
        object = this.z();
        l8 = new ArrayList();
        if (object != null) {
            object2 = new float[16];
            Matrix.setIdentityM((float[])object2, (int)0);
            if ((Build.VERSION.SDK_INT < 28 || this.v()) && (iterator = this.a.getRootWindowInsets()) != null) {
                if (!this.r.equals((Object)iterator.getSystemWindowInsetLeft())) {
                    ((l)object).Z = true;
                    ((l)object).X = true;
                }
                iterator = Integer.valueOf((int)iterator.getSystemWindowInsetLeft());
                this.r = iterator;
                Matrix.translateM((float[])object2, (int)0, (float)iterator.intValue(), (float)0.0f, (float)0.0f);
            }
            ((l)object).E0((float[])object2, (Set)hashSet, false);
            ((l)object).g0((List)l8);
        }
        iterator = l8.iterator();
        object = null;
        while (iterator.hasNext()) {
            object2 = (l)iterator.next();
            if (this.p.contains((Object)((l)object2).b)) continue;
            object = object2;
        }
        object2 = object;
        if (object == null) {
            object2 = object;
            if (l8.size() > 0) {
                object2 = (l)l8.get(l8.size() - 1);
            }
        }
        if (object2 != null && (((l)object2).b != this.q || l8.size() != this.p.size())) {
            this.q = ((l)object2).b;
            this.N((l)object2);
        }
        this.p.clear();
        object = l8.iterator();
        while (object.hasNext()) {
            object2 = (l)object.next();
            this.p.add((Object)((l)object2).b);
        }
        object = this.g.entrySet().iterator();
        while (object.hasNext()) {
            object2 = (l)((Map.Entry)object.next()).getValue();
            if (hashSet.contains(object2)) continue;
            this.d0((l)object2);
            object.remove();
        }
        this.V(0);
        hashSet = object3.iterator();
        while (hashSet.hasNext()) {
            object3 = (l)hashSet.next();
            if (((l)object3).j0()) {
                object = this.H(((l)object3).b, 4096);
                float f8 = ((l)object3).l;
                float f9 = ((l)object3).m;
                float f10 = f8;
                if (Float.isInfinite((float)((l)object3).m)) {
                    f10 = f8;
                    if (f8 > 70000.0f) {
                        f10 = 70000.0f;
                    }
                    f9 = 100000.0f;
                }
                if (Float.isInfinite((float)((l)object3).n)) {
                    f9 += 100000.0f;
                    f8 = f10;
                    if (f10 < -70000.0f) {
                        f8 = -70000.0f;
                    }
                    f10 = f8 + 100000.0f;
                    f8 = f9;
                } else {
                    f8 = f9 - ((l)object3).n;
                    f10 -= ((l)object3).n;
                }
                if (!((l)object3).u0(g.t) && !((l)object3).u0(g.u)) {
                    if (((l)object3).u0(g.r) || ((l)object3).u0(g.s)) {
                        object.setScrollX((int)f10);
                        object.setMaxScrollX((int)f8);
                    }
                } else {
                    object.setScrollY((int)f10);
                    object.setMaxScrollY((int)f8);
                }
                if (((l)object3).j > 0) {
                    object.setItemCount(((l)object3).j);
                    object.setFromIndex(((l)object3).k);
                    object2 = ((l)object3).T.iterator();
                    int n8 = 0;
                    while (object2.hasNext()) {
                        if (((l)object2.next()).x0(i.C)) continue;
                        ++n8;
                    }
                    object.setToIndex(((l)object3).k + n8 - 1);
                }
                this.T((AccessibilityEvent)object);
            }
            if (((l)object3).x0(i.E) && ((l)object3).i0()) {
                this.V(((l)object3).b);
            }
            if ((object = this.i) != null && ((l)object).b == ((l)object3).b && !((l)object3).v0((i)((Object)(object = i.r))) && ((l)object3).x0((i)((Object)object))) {
                object = this.H(((l)object3).b, 4);
                object.getText().add((Object)((l)object3).p);
                this.T((AccessibilityEvent)object);
            }
            if ((object = this.m) != null && ((l)object).b == ((l)object3).b && ((object = this.n) == null || ((l)object).b != this.m.b)) {
                this.n = this.m;
                this.T(this.H(((l)object3).b, 8));
            } else if (this.m == null) {
                this.n = null;
            }
            if ((object = this.m) == null || ((l)object).b != ((l)object3).b || !((l)object3).v0((i)((Object)(object = i.t))) || !((l)object3).x0((i)((Object)object)) || (object = this.i) != null && ((l)object).b != this.m.b) continue;
            object = ((l)object3).K;
            object2 = "";
            object = object != null ? ((l)object3).K : "";
            if (((l)object3).r != null) {
                object2 = ((l)object3).r;
            }
            if ((object = this.u(((l)object3).b, (String)object, (String)object2)) != null) {
                this.T((AccessibilityEvent)object);
            }
            if (((l)object3).F == ((l)object3).g && ((l)object3).G == ((l)object3).h) continue;
            object = this.H(((l)object3).b, 8192);
            object.getText().add(object2);
            object.setFromIndex(((l)object3).g);
            object.setToIndex(((l)object3).h);
            object.setItemCount(object2.length());
            this.T((AccessibilityEvent)object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int var1_1) {
        block73 : {
            block72 : {
                block71 : {
                    block67 : {
                        block68 : {
                            block69 : {
                                block70 : {
                                    var6_2 = true;
                                    this.X(true);
                                    if (var1_1 >= 65536) {
                                        return this.d.createAccessibilityNodeInfo(var1_1);
                                    }
                                    if (var1_1 == -1) {
                                        var9_3 = this.I(this.a);
                                        this.a.onInitializeAccessibilityNodeInfo(var9_3);
                                        if (this.g.containsKey((Object)0)) {
                                            var9_3.addChild(this.a, 0);
                                        }
                                        if (Build.VERSION.SDK_INT < 24) return var9_3;
                                        a.a(var9_3, false);
                                        return var9_3;
                                    }
                                    var13_6 = (l)this.g.get((Object)var1_1);
                                    if (var13_6 == null) {
                                        return null;
                                    }
                                    if (l.e(var13_6) != -1 && this.e.b(l.e(var13_6))) {
                                        var9_4 = this.e.c(l.e(var13_6));
                                        if (var9_4 == null) {
                                            return null;
                                        }
                                        var10_7 = l.f(var13_6);
                                        return this.d.getRootNode(var9_4, l.a(var13_6), var10_7);
                                    }
                                    var12_9 = this.J(this.a, var1_1);
                                    var4_10 = Build.VERSION.SDK_INT;
                                    if (var4_10 >= 24) {
                                        a.a(var12_9, this.C(var13_6));
                                    }
                                    var11_11 = "";
                                    var12_9.setViewIdResourceName("");
                                    if (l.g(var13_6) != null) {
                                        var12_9.setViewIdResourceName(l.g(var13_6));
                                    }
                                    var12_9.setPackageName((CharSequence)this.a.getContext().getPackageName());
                                    var12_9.setClassName((CharSequence)"android.view.View");
                                    var12_9.setSource(this.a, var1_1);
                                    var12_9.setFocusable(l.h(var13_6));
                                    var9_5 = this.m;
                                    if (var9_5 != null) {
                                        var5_12 = l.a((l)var9_5) == var1_1;
                                        var12_9.setFocused(var5_12);
                                    }
                                    if ((var9_5 = this.i) != null) {
                                        var5_12 = l.a((l)var9_5) == var1_1;
                                        var12_9.setAccessibilityFocused(var5_12);
                                    }
                                    if (l.i(var13_6, (i)(var10_8 = i.t))) {
                                        var12_9.setPassword(l.i(var13_6, i.z));
                                        var9_5 = i.J;
                                        if (!l.i(var13_6, (i)var9_5)) {
                                            var12_9.setClassName((CharSequence)"android.widget.EditText");
                                        }
                                        var12_9.setEditable(l.i(var13_6, (i)var9_5) ^ true);
                                        if (l.j(var13_6) != -1 && l.l(var13_6) != -1) {
                                            var12_9.setTextSelection(l.j(var13_6), l.l(var13_6));
                                        }
                                        if ((var9_5 = this.i) != null && l.a((l)var9_5) == var1_1) {
                                            var12_9.setLiveRegion(1);
                                        }
                                        if (l.p(var13_6, g.y)) {
                                            var12_9.addAction(256);
                                            var3_13 = 1;
                                        } else {
                                            var3_13 = 0;
                                        }
                                        if (l.p(var13_6, g.z)) {
                                            var12_9.addAction(512);
                                            var3_13 = 1;
                                        }
                                        var2_14 = var3_13;
                                        if (l.p(var13_6, g.I)) {
                                            var12_9.addAction(256);
                                            var2_14 = var3_13 | 2;
                                        }
                                        var3_13 = var2_14;
                                        if (l.p(var13_6, g.J)) {
                                            var12_9.addAction(512);
                                            var3_13 = var2_14 | 2;
                                        }
                                        var12_9.setMovementGranularities(var3_13);
                                        if (l.q(var13_6) >= 0) {
                                            var2_14 = l.r(var13_6) == null ? 0 : l.r(var13_6).length();
                                            l.t(var13_6);
                                            l.q(var13_6);
                                            var12_9.setMaxTextLength(var2_14 - l.t(var13_6) + l.q(var13_6));
                                        }
                                    }
                                    if (l.p(var13_6, g.A)) {
                                        var12_9.addAction(131072);
                                    }
                                    if (l.p(var13_6, g.B)) {
                                        var12_9.addAction(16384);
                                    }
                                    if (l.p(var13_6, g.C)) {
                                        var12_9.addAction(65536);
                                    }
                                    if (l.p(var13_6, g.D)) {
                                        var12_9.addAction(32768);
                                    }
                                    if (l.p(var13_6, g.K)) {
                                        var12_9.addAction(2097152);
                                    }
                                    if (l.i(var13_6, i.s) || l.i(var13_6, i.L)) {
                                        var12_9.setClassName((CharSequence)"android.widget.Button");
                                    }
                                    if (l.i(var13_6, i.D)) {
                                        var12_9.setClassName((CharSequence)"android.widget.ImageView");
                                    }
                                    if (l.p(var13_6, g.H)) {
                                        var12_9.setDismissable(true);
                                        var12_9.addAction(1048576);
                                    }
                                    if (l.u(var13_6) != null) {
                                        var12_9.setParent(this.a, l.a(l.u(var13_6)));
                                    } else {
                                        var12_9.setParent(this.a);
                                    }
                                    if (l.w(var13_6) != -1) {
                                        var12_9.setTraversalAfter(this.a, l.w(var13_6));
                                    }
                                    var9_5 = l.f(var13_6);
                                    if (l.u(var13_6) != null) {
                                        var14_15 = l.f(l.u(var13_6));
                                        var15_16 = new Rect((Rect)var9_5);
                                        var15_16.offset(- var14_15.left, - var14_15.top);
                                        var12_9.setBoundsInParent(var15_16);
                                    } else {
                                        var12_9.setBoundsInParent((Rect)var9_5);
                                    }
                                    var12_9.setBoundsInScreen(this.w((Rect)var9_5));
                                    var12_9.setVisibleToUser(true);
                                    var5_12 = !l.i(var13_6, i.v) || l.i(var13_6, i.w);
                                    var12_9.setEnabled(var5_12);
                                    if (l.p(var13_6, g.p)) {
                                        if (l.x(var13_6) != null) {
                                            var12_9.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, (CharSequence)h.a(l.x(var13_6))));
                                        } else {
                                            var12_9.addAction(16);
                                        }
                                        var12_9.setClickable(true);
                                    }
                                    if (l.p(var13_6, g.q)) {
                                        if (l.y(var13_6) != null) {
                                            var12_9.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, (CharSequence)h.a(l.y(var13_6))));
                                        } else {
                                            var12_9.addAction(32);
                                        }
                                        var12_9.setLongClickable(true);
                                    }
                                    if (!l.p(var13_6, (g)(var14_15 = g.r)) && !l.p(var13_6, g.t) && !l.p(var13_6, g.s) && !l.p(var13_6, g.u)) break block67;
                                    var12_9.setScrollable(true);
                                    if (!l.i(var13_6, i.H)) break block68;
                                    if (l.p(var13_6, (g)var14_15) || l.p(var13_6, g.s)) break block69;
                                    if (!this.a0(var13_6)) break block70;
                                    var9_5 = AccessibilityNodeInfo.CollectionInfo.obtain((int)l.c(var13_6), (int)0, (boolean)false);
                                    ** GOTO lbl133
                                }
                                var9_5 = "android.widget.ScrollView";
                                ** GOTO lbl136
                            }
                            if (this.a0(var13_6)) {
                                var9_5 = AccessibilityNodeInfo.CollectionInfo.obtain((int)0, (int)l.c(var13_6), (boolean)false);
lbl133: // 2 sources:
                                var12_9.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)var9_5);
                            } else {
                                var9_5 = "android.widget.HorizontalScrollView";
lbl136: // 2 sources:
                                var12_9.setClassName((CharSequence)var9_5);
                            }
                        }
                        if (l.p(var13_6, (g)var14_15) || l.p(var13_6, g.t)) {
                            var12_9.addAction(4096);
                        }
                        if (l.p(var13_6, g.s) || l.p(var13_6, g.u)) {
                            var12_9.addAction(8192);
                        }
                    }
                    if (l.p(var13_6, (g)(var9_5 = g.v)) || l.p(var13_6, g.w)) {
                        var12_9.setClassName((CharSequence)"android.widget.SeekBar");
                        if (l.p(var13_6, (g)var9_5)) {
                            var12_9.addAction(4096);
                        }
                        if (l.p(var13_6, g.w)) {
                            var12_9.addAction(8192);
                        }
                    }
                    if (l.i(var13_6, i.E)) {
                        var12_9.setLiveRegion(1);
                    }
                    if (l.i(var13_6, (i)var10_8)) {
                        var12_9.setText(l.z(var13_6));
                        if (var4_10 >= 28) {
                            b.a(var12_9, l.A(var13_6));
                        }
                    } else if (!l.i(var13_6, i.A)) {
                        var10_8 = var9_5 = l.B(var13_6);
                        if (var4_10 < 28) {
                            var10_8 = var9_5;
                            if (l.C(var13_6) != null) {
                                var10_8 = var11_11;
                                if (var9_5 != null) {
                                    var10_8 = var9_5;
                                }
                                var9_5 = new StringBuilder();
                                var9_5.append(var10_8);
                                var9_5.append("\n");
                                var9_5.append(l.C(var13_6));
                                var10_8 = var9_5.toString();
                            }
                        }
                        if (var10_8 != null) {
                            var12_9.setContentDescription((CharSequence)var10_8);
                        }
                    }
                    if (var4_10 >= 28 && l.C(var13_6) != null) {
                        c.a(var12_9, l.C(var13_6));
                    }
                    var7_17 = l.i(var13_6, i.p);
                    var8_18 = l.i(var13_6, i.F);
                    var5_12 = var6_2;
                    if (!var7_17) {
                        var5_12 = var8_18 != false ? var6_2 : false;
                    }
                    var12_9.setCheckable(var5_12);
                    if (!var7_17) break block71;
                    var12_9.setChecked(l.i(var13_6, i.q));
                    var9_5 = l.i(var13_6, i.x) ? "android.widget.RadioButton" : "android.widget.CheckBox";
                    break block72;
                }
                if (!var8_18) break block73;
                var12_9.setChecked(l.i(var13_6, i.G));
                var9_5 = "android.widget.Switch";
            }
            var12_9.setClassName((CharSequence)var9_5);
        }
        var12_9.setSelected(l.i(var13_6, i.r));
        if (var4_10 >= 28) {
            J.d.a(var12_9, l.i(var13_6, i.y));
        }
        var1_1 = (var9_5 = this.i) != null && l.a((l)var9_5) == var1_1 ? 128 : 64;
        var12_9.addAction(var1_1);
        if (l.D(var13_6) != null) {
            for (Object var10_8 : l.D(var13_6)) {
                var12_9.addAction(new AccessibilityNodeInfo.AccessibilityAction(h.c((h)var10_8), (CharSequence)h.e((h)var10_8)));
            }
        }
        var9_5 = l.E(var13_6).iterator();
        while (var9_5.hasNext() != false) {
            var10_8 = (l)var9_5.next();
            if (l.i((l)var10_8, i.C)) continue;
            if (l.e((l)var10_8) != -1) {
                var11_11 = this.e.c(l.e((l)var10_8));
                if (!this.e.b(l.e((l)var10_8))) {
                    var12_9.addChild((View)var11_11);
                    continue;
                }
            }
            var12_9.addChild(this.a, l.a((l)var10_8));
        }
        return var12_9;
    }

    public final void d0(l l8) {
        Object object;
        l8.R = null;
        if (l8.i != -1 && (object = this.j) != null && this.d.platformViewOfNode(object.intValue()) == this.e.c(l8.i)) {
            this.S(this.j, 65536);
            this.j = null;
        }
        if (l8.i != -1 && (object = this.e.c(l8.i)) != null) {
            object.setImportantForAccessibility(4);
        }
        if ((object = this.i) == l8) {
            this.S(((l)object).b, 65536);
            this.i = null;
        }
        if (this.m == l8) {
            this.m = null;
        }
        if (this.o == l8) {
            this.o = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public AccessibilityNodeInfo findFocus(int n8) {
        l l8;
        block8 : {
            block9 : {
                block7 : {
                    block6 : {
                        block5 : {
                            if (n8 == 1) break block5;
                            if (n8 != 2) {
                                return null;
                            }
                            break block6;
                        }
                        l8 = this.m;
                        if (l8 != null) break block7;
                        l8 = this.k;
                        if (l8 != null) break block8;
                    }
                    if ((l8 = this.i) == null) break block9;
                }
                n8 = l8.b;
                return this.createAccessibilityNodeInfo(n8);
            }
            l8 = this.j;
            if (l8 == null) return null;
        }
        n8 = l8.intValue();
        return this.createAccessibilityNodeInfo(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean performAction(int n8, int n9, Bundle object) {
        if (n8 >= 65536) {
            boolean bl = this.d.performAction(n8, n9, (Bundle)object);
            if (bl && n9 == 128) {
                this.j = null;
            }
            return bl;
        }
        l l8 = (l)this.g.get((Object)n8);
        if (l8 == null) {
            return false;
        }
        switch (n9) {
            default: {
                int n10 = B;
                object = (h)this.h.get((Object)(n9 - n10));
                if (object != null) {
                    this.b.c(n8, g.G, ((h)object).b);
                    return true;
                }
                return false;
            }
            case 16908342: {
                this.b.b(n8, g.x);
                return true;
            }
            case 2097152: {
                return this.P(l8, n8, (Bundle)object);
            }
            case 1048576: {
                this.b.b(n8, g.H);
                return true;
            }
            case 131072: {
                HashMap hashMap = new HashMap();
                if (object != null && object.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && object.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap.put((Object)"base", (Object)object.getInt("ACTION_ARGUMENT_SELECTION_START_INT"));
                    n9 = object.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put((Object)"base", (Object)l8.h);
                    n9 = l8.h;
                }
                hashMap.put((Object)"extent", (Object)n9);
                this.b.c(n8, g.A, (Object)hashMap);
                object = (l)this.g.get((Object)n8);
                ((l)object).g = (Integer)hashMap.get((Object)"base");
                ((l)object).h = (Integer)hashMap.get((Object)"extent");
                return true;
            }
            case 65536: {
                this.b.b(n8, g.C);
                return true;
            }
            case 32768: {
                this.b.b(n8, g.D);
                return true;
            }
            case 16384: {
                this.b.b(n8, g.B);
                return true;
            }
            case 8192: {
                object = g.u;
                if (!l8.w0((g)((Object)object)) && !l8.w0((g)((Object)(object = g.s)))) {
                    object = g.w;
                    if (!l8.w0((g)((Object)object))) {
                        return false;
                    }
                    l8.r = l8.v;
                    l8.s = l8.w;
                    this.S(n8, 4);
                }
                this.b.b(n8, (g)((Object)object));
                return true;
            }
            case 4096: {
                object = g.t;
                if (!l8.w0((g)((Object)object)) && !l8.w0((g)((Object)(object = g.r)))) {
                    object = g.v;
                    if (!l8.w0((g)((Object)object))) {
                        return false;
                    }
                    l8.r = l8.t;
                    l8.s = l8.u;
                    this.S(n8, 4);
                }
                this.b.b(n8, (g)((Object)object));
                return true;
            }
            case 512: {
                return this.O(l8, n8, (Bundle)object, false);
            }
            case 256: {
                return this.O(l8, n8, (Bundle)object, true);
            }
            case 128: {
                object = this.i;
                if (object != null && ((l)object).b == n8) {
                    this.i = null;
                }
                if ((object = this.j) != null && object.intValue() == n8) {
                    this.j = null;
                }
                this.b.b(n8, g.F);
                this.S(n8, 65536);
                return true;
            }
            case 64: {
                if (this.i == null) {
                    this.a.invalidate();
                }
                this.i = l8;
                this.b.b(n8, g.E);
                object = new HashMap();
                object.put((Object)"type", (Object)"didGainFocus");
                object.put((Object)"nodeId", (Object)l8.b);
                this.b.a.c(object);
                this.S(n8, 32768);
                if (l8.w0(g.v) || l8.w0(g.w)) {
                    this.S(n8, 4);
                }
                return true;
            }
            case 32: {
                this.b.b(n8, g.q);
                return true;
            }
            case 16: 
        }
        this.b.b(n8, g.p);
        return true;
    }

    public final AccessibilityEvent u(int n8, String string2, String string3) {
        int n9;
        AccessibilityEvent accessibilityEvent = this.H(n8, 16);
        accessibilityEvent.setBeforeText((CharSequence)string2);
        accessibilityEvent.getText().add((Object)string3);
        for (n8 = 0; n8 < string2.length() && n8 < string3.length() && string2.charAt(n8) == string3.charAt(n8); ++n8) {
        }
        if (n8 >= string2.length() && n8 >= string3.length()) {
            return null;
        }
        accessibilityEvent.setFromIndex(n8);
        int n10 = string2.length() - 1;
        for (n9 = string3.length() - 1; n10 >= n8 && n9 >= n8 && string2.charAt(n10) == string3.charAt(n9); --n10, --n9) {
        }
        accessibilityEvent.setRemovedCount(n10 - n8 + 1);
        accessibilityEvent.setAddedCount(n9 - n8 + 1);
        return accessibilityEvent;
    }

    public final boolean v() {
        boolean bl;
        block4 : {
            block5 : {
                boolean bl2;
                Activity activity = T5.g.b(this.a.getContext());
                bl = bl2 = false;
                if (activity == null) break block4;
                if (activity.getWindow() == null) {
                    return false;
                }
                int n8 = d.a(activity.getWindow().getAttributes());
                if (n8 == 2) break block5;
                bl = bl2;
                if (n8 != 0) break block4;
            }
            bl = true;
        }
        return bl;
    }

    public final Rect w(Rect rect) {
        rect = new Rect(rect);
        int[] arrn = new int[2];
        this.a.getLocationOnScreen(arrn);
        rect.offset(arrn[0], arrn[1]);
        return rect;
    }

    public final h x(int n8) {
        h h8;
        h h9 = h8 = (h)this.h.get((Object)n8);
        if (h8 == null) {
            h9 = new h();
            h9.b = n8;
            h9.a = B + n8;
            this.h.put((Object)n8, (Object)h9);
        }
        return h9;
    }

    public final l y(int n8) {
        l l8;
        l l9 = l8 = (l)this.g.get((Object)n8);
        if (l8 == null) {
            l9 = new l(this);
            l9.b = n8;
            this.g.put((Object)n8, (Object)l9);
        }
        return l9;
    }

    public final l z() {
        return (l)this.g.get((Object)0);
    }

    public static final class f
    extends Enum {
        public static final /* enum */ f p = new f(1);
        public static final /* enum */ f q = new f(2);
        public static final /* enum */ f r = new f(4);
        public static final /* enum */ f s = new f(8);
        public static final /* enum */ f t = new f(16);
        public static final /* enum */ f u = new f(32);
        public static final /* enum */ f v = new f(64);
        public static final /* synthetic */ f[] w;
        public final int o;

        static {
            w = f.c();
        }

        public f(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ f[] c() {
            return new f[]{p, q, r, s, t, u, v};
        }

        public static f valueOf(String string2) {
            return (f)Enum.valueOf(f.class, (String)string2);
        }

        public static f[] values() {
            return (f[])w.clone();
        }
    }

    public static final class g
    extends Enum {
        public static final /* enum */ g A;
        public static final /* enum */ g B;
        public static final /* enum */ g C;
        public static final /* enum */ g D;
        public static final /* enum */ g E;
        public static final /* enum */ g F;
        public static final /* enum */ g G;
        public static final /* enum */ g H;
        public static final /* enum */ g I;
        public static final /* enum */ g J;
        public static final /* enum */ g K;
        public static final /* synthetic */ g[] L;
        public static final /* enum */ g p;
        public static final /* enum */ g q;
        public static final /* enum */ g r;
        public static final /* enum */ g s;
        public static final /* enum */ g t;
        public static final /* enum */ g u;
        public static final /* enum */ g v;
        public static final /* enum */ g w;
        public static final /* enum */ g x;
        public static final /* enum */ g y;
        public static final /* enum */ g z;
        public final int o;

        static {
            p = new g(1);
            q = new g(2);
            r = new g(4);
            s = new g(8);
            t = new g(16);
            u = new g(32);
            v = new g(64);
            w = new g(128);
            x = new g(256);
            y = new g(512);
            z = new g(1024);
            A = new g(2048);
            B = new g(4096);
            C = new g(8192);
            D = new g(16384);
            E = new g(32768);
            F = new g(65536);
            G = new g(131072);
            H = new g(262144);
            I = new g(524288);
            J = new g(1048576);
            K = new g(2097152);
            L = g.c();
        }

        public g(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ g[] c() {
            return new g[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K};
        }

        public static g valueOf(String string2) {
            return (g)Enum.valueOf(g.class, (String)string2);
        }

        public static g[] values() {
            return (g[])L.clone();
        }
    }

    public static class h {
        public int a = -1;
        public int b = -1;
        public int c = -1;
        public String d;
        public String e;

        public static /* synthetic */ String a(h h8) {
            return h8.e;
        }

        public static /* synthetic */ int c(h h8) {
            return h8.a;
        }

        public static /* synthetic */ String e(h h8) {
            return h8.d;
        }
    }

    public static final class i
    extends Enum {
        public static final /* enum */ i A;
        public static final /* enum */ i B;
        public static final /* enum */ i C;
        public static final /* enum */ i D;
        public static final /* enum */ i E;
        public static final /* enum */ i F;
        public static final /* enum */ i G;
        public static final /* enum */ i H;
        public static final /* enum */ i I;
        public static final /* enum */ i J;
        public static final /* enum */ i K;
        public static final /* enum */ i L;
        public static final /* enum */ i M;
        public static final /* enum */ i N;
        public static final /* enum */ i O;
        public static final /* enum */ i P;
        public static final /* enum */ i Q;
        public static final /* synthetic */ i[] R;
        public static final /* enum */ i p;
        public static final /* enum */ i q;
        public static final /* enum */ i r;
        public static final /* enum */ i s;
        public static final /* enum */ i t;
        public static final /* enum */ i u;
        public static final /* enum */ i v;
        public static final /* enum */ i w;
        public static final /* enum */ i x;
        public static final /* enum */ i y;
        public static final /* enum */ i z;
        public final int o;

        static {
            p = new i(1);
            q = new i(2);
            r = new i(4);
            s = new i(8);
            t = new i(16);
            u = new i(32);
            v = new i(64);
            w = new i(128);
            x = new i(256);
            y = new i(512);
            z = new i(1024);
            A = new i(2048);
            B = new i(4096);
            C = new i(8192);
            D = new i(16384);
            E = new i(32768);
            F = new i(65536);
            G = new i(131072);
            H = new i(262144);
            I = new i(524288);
            J = new i(1048576);
            K = new i(2097152);
            L = new i(4194304);
            M = new i(8388608);
            N = new i(16777216);
            O = new i(33554432);
            P = new i(67108864);
            Q = new i(134217728);
            R = i.c();
        }

        public i(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ i[] c() {
            return new i[]{p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q};
        }

        public static i valueOf(String string2) {
            return (i)Enum.valueOf(i.class, (String)string2);
        }

        public static i[] values() {
            return (i[])R.clone();
        }
    }

    public static class j
    extends n {
        public String d;

        public j() {
            super(null);
        }

        public /* synthetic */ j( a8) {
            this();
        }
    }

    public static interface k {
        public void a(boolean var1, boolean var2);
    }

    public static class l {
        public int A = -1;
        public p B;
        public boolean C = false;
        public int D;
        public int E;
        public int F;
        public int G;
        public float H;
        public float I;
        public float J;
        public String K;
        public String L;
        public float M;
        public float N;
        public float O;
        public float P;
        public float[] Q;
        public l R;
        public List S = new ArrayList();
        public List T = new ArrayList();
        public List U;
        public h V;
        public h W;
        public boolean X = true;
        public float[] Y;
        public boolean Z = true;
        public final i a;
        public float[] a0;
        public int b = -1;
        public Rect b0;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public float l;
        public float m;
        public float n;
        public String o;
        public String p;
        public List q;
        public String r;
        public List s;
        public String t;
        public List u;
        public String v;
        public List w;
        public String x;
        public List y;
        public String z;

        public l(i i8) {
            this.a = i8;
        }

        public static /* synthetic */ CharSequence A(l l8) {
            return l8.r0();
        }

        public static /* synthetic */ String C(l l8) {
            return l8.z;
        }

        public static boolean C0(l l8, T5.e e8) {
            if (l8 != null && l8.l0(e8) != null) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ List D(l l8) {
            return l8.U;
        }

        public static /* synthetic */ List E(l l8) {
            return l8.S;
        }

        public static /* synthetic */ Rect f(l l8) {
            return l8.m0();
        }

        public static /* synthetic */ String g(l l8) {
            return l8.o;
        }

        public static /* synthetic */ boolean h(l l8) {
            return l8.z0();
        }

        public static /* synthetic */ int n(l l8, int n8) {
            l8.h = n8 = l8.h + n8;
            return n8;
        }

        public static /* synthetic */ int o(l l8, int n8) {
            l8.h = n8 = l8.h - n8;
            return n8;
        }

        public static /* synthetic */ int q(l l8) {
            return l8.e;
        }

        public static /* synthetic */ int t(l l8) {
            return l8.f;
        }

        public static /* synthetic */ l u(l l8) {
            return l8.R;
        }

        public static /* synthetic */ int w(l l8) {
            return l8.A;
        }

        public static /* synthetic */ h x(l l8) {
            return l8.V;
        }

        public static /* synthetic */ h y(l l8) {
            return l8.W;
        }

        public static /* synthetic */ CharSequence z(l l8) {
            return l8.s0();
        }

        public final float A0(float f8, float f9, float f10, float f11) {
            return Math.max((float)f8, (float)Math.max((float)f9, (float)Math.max((float)f10, (float)f11)));
        }

        public final float B0(float f8, float f9, float f10, float f11) {
            return Math.min((float)f8, (float)Math.min((float)f9, (float)Math.min((float)f10, (float)f11)));
        }

        public final void D0(float[] arrf, float[] arrf2, float[] arrf3) {
            Matrix.multiplyMV((float[])arrf, (int)0, (float[])arrf2, (int)0, (float[])arrf3, (int)0);
            float f8 = arrf[3];
            arrf[0] = arrf[0] / f8;
            arrf[1] = arrf[1] / f8;
            arrf[2] = arrf[2] / f8;
            arrf[3] = 0.0f;
        }

        public final void E0(float[] arrf, Set set, boolean bl) {
            float[] arrf2;
            set.add((Object)this);
            if (this.Z) {
                bl = true;
            }
            if (bl) {
                if (this.a0 == null) {
                    this.a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM((float[])this.a0, (int)0, (float[])arrf, (int)0, (float[])this.Q, (int)0);
                arrf = new float[4];
                arrf2 = new float[4];
                float[] arrf3 = new float[4];
                float[] arrf4 = new float[4];
                float f8 = this.M;
                float f9 = this.N;
                float[] arrf5 = new float[]{f8, f9, 0.0f, 1.0f};
                this.D0(arrf, this.a0, arrf5);
                arrf5[0] = this.O;
                arrf5[1] = this.N;
                this.D0(arrf2, this.a0, arrf5);
                arrf5[0] = this.O;
                arrf5[1] = this.P;
                this.D0(arrf3, this.a0, arrf5);
                arrf5[0] = this.M;
                arrf5[1] = this.P;
                this.D0(arrf4, this.a0, arrf5);
                if (this.b0 == null) {
                    this.b0 = new Rect();
                }
                this.b0.set(Math.round((float)this.B0(arrf[0], arrf2[0], arrf3[0], arrf4[0])), Math.round((float)this.B0(arrf[1], arrf2[1], arrf3[1], arrf4[1])), Math.round((float)this.A0(arrf[0], arrf2[0], arrf3[0], arrf4[0])), Math.round((float)this.A0(arrf[1], arrf2[1], arrf3[1], arrf4[1])));
                this.Z = false;
            }
            arrf = this.S.iterator();
            int n8 = -1;
            while (arrf.hasNext()) {
                arrf2 = (float[])arrf.next();
                arrf2.A = n8;
                n8 = arrf2.b;
                arrf2.E0(this.a0, set, bl);
            }
        }

        public final void F0(ByteBuffer byteBuffer, String[] object, ByteBuffer[] arrbyteBuffer) {
            this.C = true;
            this.K = this.r;
            this.L = this.p;
            this.D = this.c;
            this.E = this.d;
            this.F = this.g;
            this.G = this.h;
            this.H = this.l;
            this.I = this.m;
            this.J = this.n;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int n8 = byteBuffer.getInt();
            String string2 = n8 == -1 ? null : object[n8];
            this.o = string2;
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? null : object[n8];
            this.p = string2;
            this.q = this.q0(byteBuffer, arrbyteBuffer);
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? null : object[n8];
            this.r = string2;
            this.s = this.q0(byteBuffer, arrbyteBuffer);
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? null : object[n8];
            this.t = string2;
            this.u = this.q0(byteBuffer, arrbyteBuffer);
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? null : object[n8];
            this.v = string2;
            this.w = this.q0(byteBuffer, arrbyteBuffer);
            n8 = byteBuffer.getInt();
            string2 = n8 == -1 ? null : object[n8];
            this.x = string2;
            this.y = this.q0(byteBuffer, arrbyteBuffer);
            n8 = byteBuffer.getInt();
            object = n8 == -1 ? null : object[n8];
            this.z = object;
            this.B = p.e(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            int n9 = 0;
            for (n8 = 0; n8 < 16; ++n8) {
                this.Q[n8] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            int n10 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (n8 = 0; n8 < n10; ++n8) {
                object = this.a.y(byteBuffer.getInt());
                object.R = this;
                this.S.add(object);
            }
            for (n8 = 0; n8 < n10; ++n8) {
                object = this.a.y(byteBuffer.getInt());
                object.R = this;
                this.T.add(object);
            }
            n10 = byteBuffer.getInt();
            if (n10 == 0) {
                this.U = null;
                return;
            }
            object = this.U;
            if (object == null) {
                this.U = new ArrayList(n10);
                n8 = n9;
            } else {
                object.clear();
                n8 = n9;
            }
            while (n8 < n10) {
                object = this.a.x(byteBuffer.getInt());
                if (((h)object).c == g.p.o) {
                    this.V = object;
                } else if (((h)object).c == g.q.o) {
                    this.W = object;
                } else {
                    this.U.add(object);
                }
                this.U.add(object);
                ++n8;
            }
        }

        public final void g0(List list) {
            if (this.x0(i.A)) {
                list.add((Object)this);
            }
            Iterator iterator = this.S.iterator();
            while (iterator.hasNext()) {
                ((l)iterator.next()).g0(list);
            }
        }

        public final SpannableString h0(String string2, List list) {
            if (string2 == null) {
                return null;
            }
            string2 = new SpannableString((CharSequence)string2);
            if (list != null) {
                for (n n8 : list) {
                    int n9 = .a[n8.c.ordinal()];
                    if (n9 != 1) {
                        if (n9 != 2) continue;
                        string2.setSpan((Object)new LocaleSpan(Locale.forLanguageTag((String)((j)n8).d)), n8.a, n8.b, 0);
                        continue;
                    }
                    string2.setSpan((Object)new TtsSpan.Builder("android.type.verbatim").build(), n8.a, n8.b, 0);
                }
            }
            return string2;
        }

        public final boolean i0() {
            String string2;
            String string3 = this.p;
            boolean bl = false;
            if (string3 == null && this.L == null) {
                return false;
            }
            if (string3 == null || (string2 = this.L) == null || !string3.equals((Object)string2)) {
                bl = true;
            }
            return bl;
        }

        public final boolean j0() {
            if (!Float.isNaN((float)this.l) && !Float.isNaN((float)this.H) && this.H != this.l) {
                return true;
            }
            return false;
        }

        public final void k0() {
            if (!this.X) {
                return;
            }
            this.X = false;
            if (this.Y == null) {
                this.Y = new float[16];
            }
            if (!Matrix.invertM((float[])this.Y, (int)0, (float[])this.Q, (int)0)) {
                Arrays.fill((float[])this.Y, (float)0.0f);
            }
        }

        public final l l0(T5.e e8) {
            l l8 = this.R;
            while (l8 != null) {
                if (e8.test(l8)) {
                    return l8;
                }
                l8 = l8.R;
            }
            return null;
        }

        public final Rect m0() {
            return this.b0;
        }

        public final CharSequence n0() {
            return this.h0(this.x, this.y);
        }

        public final CharSequence o0() {
            return this.h0(this.p, this.q);
        }

        public final String p0() {
            String string2;
            if (this.x0(i.B) && (string2 = this.p) != null && !string2.isEmpty()) {
                return this.p;
            }
            string2 = this.S.iterator();
            while (string2.hasNext()) {
                String string3 = ((l)string2.next()).p0();
                if (string3 == null || string3.isEmpty()) continue;
                return string3;
            }
            return null;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] arrbyteBuffer) {
            int n8 = byteBuffer.getInt();
            if (n8 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object;
                int n9 = byteBuffer.getInt();
                int n10 = byteBuffer.getInt();
                o o8 = o.values()[byteBuffer.getInt()];
                int n11 = .a[o8.ordinal()];
                if (n11 != 1) {
                    if (n11 != 2) continue;
                    object = arrbyteBuffer[byteBuffer.getInt()];
                    j j8 = new j(null);
                    j8.a = n9;
                    j8.b = n10;
                    j8.c = o8;
                    j8.d = Charset.forName((String)"UTF-8").decode((ByteBuffer)object).toString();
                    arrayList.add((Object)j8);
                    continue;
                }
                byteBuffer.getInt();
                object = new m(null);
                object.a = n9;
                object.b = n10;
                object.c = o8;
                arrayList.add(object);
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence charSequence = this.o0();
            CharSequence charSequence2 = this.n0();
            CharSequence charSequence3 = null;
            for (int i8 = 0; i8 < 2; ++i8) {
                CharSequence charSequence4 = new CharSequence[]{charSequence, charSequence2}[i8];
                CharSequence charSequence5 = charSequence3;
                if (charSequence4 != null) {
                    charSequence5 = charSequence3;
                    if (charSequence4.length() > 0) {
                        charSequence5 = charSequence3 != null && charSequence3.length() != 0 ? TextUtils.concat((CharSequence[])new CharSequence[]{charSequence3, ", ", charSequence4}) : charSequence4;
                    }
                }
                charSequence3 = charSequence5;
            }
            return charSequence3;
        }

        public final CharSequence s0() {
            return this.h0(this.r, this.s);
        }

        public final CharSequence t0() {
            CharSequence charSequence = this.s0();
            CharSequence charSequence2 = this.o0();
            CharSequence charSequence3 = this.n0();
            CharSequence charSequence4 = null;
            for (int i8 = 0; i8 < 3; ++i8) {
                CharSequence charSequence5 = new CharSequence[]{charSequence, charSequence2, charSequence3}[i8];
                CharSequence charSequence6 = charSequence4;
                if (charSequence5 != null) {
                    charSequence6 = charSequence4;
                    if (charSequence5.length() > 0) {
                        charSequence6 = charSequence4 != null && charSequence4.length() != 0 ? TextUtils.concat((CharSequence[])new CharSequence[]{charSequence4, ", ", charSequence5}) : charSequence5;
                    }
                }
                charSequence4 = charSequence6;
            }
            return charSequence4;
        }

        public final boolean u0(g g8) {
            int n8 = this.E;
            if ((g8.o & n8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean v0(i i8) {
            int n8 = this.D;
            if ((i8.o & n8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean w0(g g8) {
            int n8 = this.d;
            if ((g8.o & n8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean x0(i i8) {
            int n8 = this.c;
            if ((i8.o & n8) != 0) {
                return true;
            }
            return false;
        }

        public final l y0(float[] arrf, boolean bl) {
            Object object;
            block7 : {
                block8 : {
                    float f8 = arrf[3];
                    boolean bl2 = false;
                    float f9 = arrf[0] / f8;
                    f8 = arrf[1] / f8;
                    float f10 = this.M;
                    float[] arrf2 = null;
                    object = arrf2;
                    if (f9 < f10) break block7;
                    object = arrf2;
                    if (f9 >= this.O) break block7;
                    object = arrf2;
                    if (f8 < this.N) break block7;
                    if (f8 >= this.P) {
                        return null;
                    }
                    object = new float[4];
                    for (l l8 : this.T) {
                        if (l8.x0(i.C)) continue;
                        l8.k0();
                        Matrix.multiplyMV((float[])object, (int)0, (float[])l8.Y, (int)0, (float[])arrf, (int)0);
                        if ((l8 = l8.y0((float[])object, bl)) == null) continue;
                        return l8;
                    }
                    boolean bl3 = bl2;
                    if (bl) {
                        bl3 = bl2;
                        if (this.i != -1) {
                            bl3 = true;
                        }
                    }
                    if (this.z0()) break block8;
                    object = arrf2;
                    if (!bl3) break block7;
                }
                object = this;
            }
            return object;
        }

        public final boolean z0() {
            boolean bl;
            block6 : {
                block5 : {
                    String string2;
                    bl = this.x0(i.A);
                    boolean bl2 = false;
                    if (bl) {
                        return false;
                    }
                    if (this.x0(i.K)) {
                        return true;
                    }
                    if ((this.d & z) != 0 || (this.c & A) != 0 || (string2 = this.p) != null && !string2.isEmpty() || (string2 = this.r) != null && !string2.isEmpty()) break block5;
                    string2 = this.x;
                    bl = bl2;
                    if (string2 == null) break block6;
                    bl = bl2;
                    if (string2.isEmpty()) break block6;
                }
                bl = true;
            }
            return bl;
        }
    }

    public static class m
    extends n {
        public m() {
            super(null);
        }

        public /* synthetic */ m( a8) {
            this();
        }
    }

    public static abstract class n {
        public int a;
        public int b;
        public o c;

        public n() {
        }

        public /* synthetic */ n( a8) {
            this();
        }
    }

    public static final class o
    extends Enum {
        public static final /* enum */ o o = new o();
        public static final /* enum */ o p = new o();
        public static final /* synthetic */ o[] q;

        static {
            q = o.c();
        }

        public static /* synthetic */ o[] c() {
            return new o[]{o, p};
        }

        public static o valueOf(String string2) {
            return (o)Enum.valueOf(o.class, (String)string2);
        }

        public static o[] values() {
            return (o[])q.clone();
        }
    }

    public static final class p
    extends Enum {
        public static final /* enum */ p o = new p();
        public static final /* enum */ p p = new p();
        public static final /* enum */ p q = new p();
        public static final /* synthetic */ p[] r;

        static {
            r = p.c();
        }

        public static /* synthetic */ p[] c() {
            return new p[]{o, p, q};
        }

        public static p e(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return o;
                }
                return p;
            }
            return q;
        }

        public static p valueOf(String string2) {
            return (p)Enum.valueOf(p.class, (String)string2);
        }

        public static p[] values() {
            return (p[])r.clone();
        }
    }

}

