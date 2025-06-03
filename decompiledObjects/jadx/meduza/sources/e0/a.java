package e0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e0.d0;
import f0.b;
import io.meduza.meduza.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3747c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final C0065a f3749b;

    /* renamed from: e0.a$a, reason: collision with other inner class name */
    public static final class C0065a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final a f3750a;

        public C0065a(a aVar) {
            this.f3750a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3750a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            f0.c b10 = this.f3750a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f5287a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3750a.c(view, accessibilityEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object obj;
            Object obj2;
            Object obj3;
            int i10;
            f0.b bVar = new f0.b(accessibilityNodeInfo);
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            int i11 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(d0.g.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z10 = (bool == null || !bool.booleanValue()) ? 0 : 1;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z10);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z10 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                obj = Boolean.valueOf(d0.g.c(view));
            } else {
                Object tag2 = view.getTag(R.id.tag_accessibility_heading);
                obj = Boolean.class.isInstance(tag2) ? tag2 : null;
            }
            Boolean bool2 = (Boolean) obj;
            boolean z11 = bool2 != null && bool2.booleanValue();
            if (i12 >= 28) {
                accessibilityNodeInfo.setHeading(z11);
            } else {
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z11 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
                }
            }
            if (i12 >= 28) {
                obj2 = d0.g.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                obj2 = CharSequence.class.isInstance(tag3) ? tag3 : null;
            }
            CharSequence charSequence = (CharSequence) obj2;
            if (i12 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            if (i12 >= 30) {
                obj3 = d0.i.b(view);
            } else {
                Object tag4 = view.getTag(R.id.tag_state_description);
                obj3 = CharSequence.class.isInstance(tag4) ? tag4 : null;
            }
            CharSequence charSequence2 = (CharSequence) obj3;
            if (i12 >= 30) {
                b.C0076b.c(accessibilityNodeInfo, charSequence2);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
            }
            this.f3750a.d(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    bVar.f5279a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i15 = 0;
                    while (i15 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = i11;
                        while (true) {
                            if (i16 >= sparseArray2.size()) {
                                i10 = f0.b.f5278b;
                                f0.b.f5278b = i10 + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                    i10 = sparseArray2.keyAt(i16);
                                    break;
                                }
                                i16++;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                        i15++;
                        i11 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                bVar.f5279a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((b.a) list.get(i17)).f5283a);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3750a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3750a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f3750a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f3750a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3750a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this(f3747c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3748a = accessibilityDelegate;
        this.f3749b = new C0065a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3748a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public f0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3748a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new f0.c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3748a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, f0.b bVar) {
        this.f3748a.onInitializeAccessibilityNodeInfo(view, bVar.f5279a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3748a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3748a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        boolean z10;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            b.a aVar = (b.a) list.get(i11);
            if (((AccessibilityNodeInfo.AccessibilityAction) aVar.f5283a).getId() == i10) {
                aVar.getClass();
                break;
            }
            i11++;
        }
        boolean performAccessibilityAction = this.f3748a.performAccessibilityAction(view, i10, bundle);
        if (performAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                    if (clickableSpan.equals(clickableSpanArr[i13])) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                clickableSpan.onClick(view);
                z11 = true;
            }
        }
        return z11;
    }

    public void h(View view, int i10) {
        this.f3748a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3748a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
