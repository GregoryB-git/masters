package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import e.AbstractC1230a;
import e.AbstractC1232c;
import e.AbstractC1234e;
import e.AbstractC1235f;
import e.AbstractC1236g;
import e.AbstractC1238i;
import j.InterfaceC1366b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC1504c;
import l.S;
import l.X;
import l.Z;
import l.d0;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements InterfaceC1366b {

    /* renamed from: B0, reason: collision with root package name */
    public static final n f8624B0;

    /* renamed from: A0, reason: collision with root package name */
    public TextWatcher f8625A0;

    /* renamed from: D, reason: collision with root package name */
    public final SearchAutoComplete f8626D;

    /* renamed from: E, reason: collision with root package name */
    public final View f8627E;

    /* renamed from: F, reason: collision with root package name */
    public final View f8628F;

    /* renamed from: G, reason: collision with root package name */
    public final View f8629G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f8630H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f8631I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageView f8632J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f8633K;

    /* renamed from: L, reason: collision with root package name */
    public final View f8634L;

    /* renamed from: M, reason: collision with root package name */
    public p f8635M;

    /* renamed from: N, reason: collision with root package name */
    public Rect f8636N;

    /* renamed from: O, reason: collision with root package name */
    public Rect f8637O;

    /* renamed from: P, reason: collision with root package name */
    public int[] f8638P;

    /* renamed from: Q, reason: collision with root package name */
    public int[] f8639Q;

    /* renamed from: R, reason: collision with root package name */
    public final ImageView f8640R;

    /* renamed from: S, reason: collision with root package name */
    public final Drawable f8641S;

    /* renamed from: T, reason: collision with root package name */
    public final int f8642T;

    /* renamed from: U, reason: collision with root package name */
    public final int f8643U;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f8644V;

    /* renamed from: W, reason: collision with root package name */
    public final Intent f8645W;

    /* renamed from: a0, reason: collision with root package name */
    public final CharSequence f8646a0;

    /* renamed from: b0, reason: collision with root package name */
    public View.OnFocusChangeListener f8647b0;

    /* renamed from: c0, reason: collision with root package name */
    public View.OnClickListener f8648c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f8649d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f8650e0;

    /* renamed from: f0, reason: collision with root package name */
    public M.a f8651f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f8652g0;

    /* renamed from: h0, reason: collision with root package name */
    public CharSequence f8653h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f8654i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f8655j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f8656k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f8657l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f8658m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f8659n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f8660o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f8661p0;

    /* renamed from: q0, reason: collision with root package name */
    public SearchableInfo f8662q0;

    /* renamed from: r0, reason: collision with root package name */
    public Bundle f8663r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Runnable f8664s0;

    /* renamed from: t0, reason: collision with root package name */
    public Runnable f8665t0;

    /* renamed from: u0, reason: collision with root package name */
    public final WeakHashMap f8666u0;

    /* renamed from: v0, reason: collision with root package name */
    public final View.OnClickListener f8667v0;

    /* renamed from: w0, reason: collision with root package name */
    public View.OnKeyListener f8668w0;

    /* renamed from: x0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f8669x0;

    /* renamed from: y0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f8670y0;

    /* renamed from: z0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f8671z0;

    public static class SearchAutoComplete extends AbstractC1504c {

        /* renamed from: r, reason: collision with root package name */
        public int f8672r;

        /* renamed from: s, reason: collision with root package name */
        public SearchView f8673s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f8674t;

        /* renamed from: u, reason: collision with root package name */
        public final Runnable f8675u;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC1230a.f13336g);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f8624B0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.f8674t) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f8674t = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f8672r <= 0 || super.enoughToFilter();
        }

        @Override // l.AbstractC1504c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8674t) {
                removeCallbacks(this.f8675u);
                post(this.f8675u);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z7, int i7, Rect rect) {
            super.onFocusChanged(z7, i7, rect);
            this.f8673s.W();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8673s.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f8673s.hasFocus() && getVisibility() == 0) {
                this.f8674t = true;
                if (SearchView.J(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z7) {
                this.f8674t = false;
                removeCallbacks(this.f8675u);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8674t = true;
                    return;
                }
                this.f8674t = false;
                removeCallbacks(this.f8675u);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f8673s = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f8672r = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f8675u = new a();
            this.f8672r = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.V(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.c0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            M.a aVar = SearchView.this.f8651f0;
            if (aVar instanceof S) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z7) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f8647b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z7);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.y();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f8630H) {
                searchView.S();
                return;
            }
            if (view == searchView.f8632J) {
                searchView.O();
                return;
            }
            if (view == searchView.f8631I) {
                searchView.T();
            } else if (view == searchView.f8633K) {
                searchView.X();
            } else if (view == searchView.f8626D) {
                searchView.E();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f8662q0 == null) {
                return false;
            }
            if (searchView.f8626D.isPopupShowing() && SearchView.this.f8626D.getListSelection() != -1) {
                return SearchView.this.U(view, i7, keyEvent);
            }
            if (SearchView.this.f8626D.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.M(0, null, searchView2.f8626D.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.T();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.P(i7, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.Q(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public Method f8687a;

        /* renamed from: b, reason: collision with root package name */
        public Method f8688b;

        /* renamed from: c, reason: collision with root package name */
        public Method f8689c;

        public n() {
            this.f8687a = null;
            this.f8688b = null;
            this.f8689c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f8687a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f8688b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f8689c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8688b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8687a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8689c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class o extends N.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        public boolean f8690q;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i7) {
                return new o[i7];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8690q = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8690q + "}";
        }

        @Override // N.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f8690q));
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f8691a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f8692b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f8693c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f8694d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8695e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8696f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f8695e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f8692b = new Rect();
            this.f8694d = new Rect();
            this.f8693c = new Rect();
            a(rect, rect2);
            this.f8691a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f8692b.set(rect);
            this.f8694d.set(rect);
            Rect rect3 = this.f8694d;
            int i7 = this.f8695e;
            rect3.inset(-i7, -i7);
            this.f8693c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z7;
            float f7;
            int i7;
            boolean z8;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z9 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z8 = this.f8696f;
                    if (z8 && !this.f8694d.contains(x7, y7)) {
                        z9 = z8;
                        z7 = false;
                    }
                } else {
                    if (action == 3) {
                        z8 = this.f8696f;
                        this.f8696f = false;
                    }
                    z7 = true;
                    z9 = false;
                }
                z9 = z8;
                z7 = true;
            } else {
                if (this.f8692b.contains(x7, y7)) {
                    this.f8696f = true;
                    z7 = true;
                }
                z7 = true;
                z9 = false;
            }
            if (!z9) {
                return false;
            }
            if (!z7 || this.f8693c.contains(x7, y7)) {
                Rect rect = this.f8693c;
                f7 = x7 - rect.left;
                i7 = y7 - rect.top;
            } else {
                f7 = this.f8691a.getWidth() / 2;
                i7 = this.f8691a.getHeight() / 2;
            }
            motionEvent.setLocation(f7, i7);
            return this.f8691a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f8624B0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean J(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1232c.f13359e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1232c.f13360f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f8626D.setText(charSequence);
        this.f8626D.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(Cursor cursor, int i7, String str) {
        int i8;
        String o7;
        try {
            String o8 = S.o(cursor, "suggest_intent_action");
            if (o8 == null) {
                o8 = this.f8662q0.getSuggestIntentAction();
            }
            if (o8 == null) {
                o8 = "android.intent.action.SEARCH";
            }
            String str2 = o8;
            String o9 = S.o(cursor, "suggest_intent_data");
            if (o9 == null) {
                o9 = this.f8662q0.getSuggestIntentData();
            }
            if (o9 != null && (o7 = S.o(cursor, "suggest_intent_data_id")) != null) {
                o9 = o9 + "/" + Uri.encode(o7);
            }
            return z(str2, o9 == null ? null : Uri.parse(o9), S.o(cursor, "suggest_intent_extra_data"), S.o(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e7) {
            try {
                i8 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i8 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e7);
            return null;
        }
    }

    public final Intent B(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8663r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void D() {
        this.f8626D.dismissDropDown();
    }

    public void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8626D.refreshAutoCompleteResults();
            return;
        }
        n nVar = f8624B0;
        nVar.b(this.f8626D);
        nVar.a(this.f8626D);
    }

    public final void F(View view, Rect rect) {
        view.getLocationInWindow(this.f8638P);
        getLocationInWindow(this.f8639Q);
        int[] iArr = this.f8638P;
        int i7 = iArr[1];
        int[] iArr2 = this.f8639Q;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    public final CharSequence G(CharSequence charSequence) {
        if (!this.f8649d0 || this.f8641S == null) {
            return charSequence;
        }
        int textSize = (int) (this.f8626D.getTextSize() * 1.25d);
        this.f8641S.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f8641S), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean H() {
        SearchableInfo searchableInfo = this.f8662q0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f8662q0.getVoiceSearchLaunchWebSearch() ? this.f8644V : this.f8662q0.getVoiceSearchLaunchRecognizer() ? this.f8645W : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean I() {
        return this.f8650e0;
    }

    public final boolean K() {
        return (this.f8652g0 || this.f8657l0) && !I();
    }

    public final void L(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e7) {
            Log.e("SearchView", "Failed launch activity: " + intent, e7);
        }
    }

    public void M(int i7, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    public final boolean N(int i7, int i8, String str) {
        Cursor b7 = this.f8651f0.b();
        if (b7 == null || !b7.moveToPosition(i7)) {
            return false;
        }
        L(A(b7, i8, str));
        return true;
    }

    public void O() {
        if (!TextUtils.isEmpty(this.f8626D.getText())) {
            this.f8626D.setText("");
            this.f8626D.requestFocus();
            this.f8626D.setImeVisibility(true);
        } else if (this.f8649d0) {
            clearFocus();
            h0(true);
        }
    }

    public boolean P(int i7, int i8, String str) {
        N(i7, 0, null);
        this.f8626D.setImeVisibility(false);
        D();
        return true;
    }

    public boolean Q(int i7) {
        Z(i7);
        return true;
    }

    public void R(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void S() {
        h0(false);
        this.f8626D.requestFocus();
        this.f8626D.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f8648c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void T() {
        Editable text = this.f8626D.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f8662q0 != null) {
            M(0, null, text.toString());
        }
        this.f8626D.setImeVisibility(false);
        D();
    }

    public boolean U(View view, int i7, KeyEvent keyEvent) {
        if (this.f8662q0 != null && this.f8651f0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return P(this.f8626D.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.f8626D.setSelection(i7 == 21 ? 0 : this.f8626D.length());
                this.f8626D.setListSelection(0);
                this.f8626D.clearListSelection();
                this.f8626D.a();
                return true;
            }
            if (i7 == 19) {
                this.f8626D.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void V(CharSequence charSequence) {
        Editable text = this.f8626D.getText();
        this.f8659n0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        g0(!isEmpty);
        i0(isEmpty);
        b0();
        f0();
        this.f8658m0 = charSequence.toString();
    }

    public void W() {
        h0(I());
        Y();
        if (this.f8626D.hasFocus()) {
            E();
        }
    }

    public void X() {
        Intent B7;
        SearchableInfo searchableInfo = this.f8662q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                B7 = C(this.f8644V, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                B7 = B(this.f8645W, searchableInfo);
            }
            getContext().startActivity(B7);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Y() {
        post(this.f8664s0);
    }

    public final void Z(int i7) {
        CharSequence c7;
        Editable text = this.f8626D.getText();
        Cursor b7 = this.f8651f0.b();
        if (b7 == null) {
            return;
        }
        if (!b7.moveToPosition(i7) || (c7 = this.f8651f0.c(b7)) == null) {
            setQuery(text);
        } else {
            setQuery(c7);
        }
    }

    public void a0(CharSequence charSequence, boolean z7) {
        this.f8626D.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f8626D;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f8659n0 = charSequence;
        }
        if (!z7 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        T();
    }

    @Override // j.InterfaceC1366b
    public void b() {
        if (this.f8660o0) {
            return;
        }
        this.f8660o0 = true;
        int imeOptions = this.f8626D.getImeOptions();
        this.f8661p0 = imeOptions;
        this.f8626D.setImeOptions(imeOptions | 33554432);
        this.f8626D.setText("");
        setIconified(false);
    }

    public final void b0() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f8626D.getText());
        if (!z8 && (!this.f8649d0 || this.f8660o0)) {
            z7 = false;
        }
        this.f8632J.setVisibility(z7 ? 0 : 8);
        Drawable drawable = this.f8632J.getDrawable();
        if (drawable != null) {
            drawable.setState(z8 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // j.InterfaceC1366b
    public void c() {
        a0("", false);
        clearFocus();
        h0(true);
        this.f8626D.setImeOptions(this.f8661p0);
        this.f8660o0 = false;
    }

    public void c0() {
        int[] iArr = this.f8626D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f8628F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f8629G.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f8655j0 = true;
        super.clearFocus();
        this.f8626D.clearFocus();
        this.f8626D.setImeVisibility(false);
        this.f8655j0 = false;
    }

    public final void d0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f8626D;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(G(queryHint));
    }

    public final void e0() {
        this.f8626D.setThreshold(this.f8662q0.getSuggestThreshold());
        this.f8626D.setImeOptions(this.f8662q0.getImeOptions());
        int inputType = this.f8662q0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f8662q0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f8626D.setInputType(inputType);
        M.a aVar = this.f8651f0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f8662q0.getSuggestAuthority() != null) {
            S s7 = new S(getContext(), this, this.f8662q0, this.f8666u0);
            this.f8651f0 = s7;
            this.f8626D.setAdapter(s7);
            ((S) this.f8651f0).x(this.f8654i0 ? 2 : 1);
        }
    }

    public final void f0() {
        this.f8629G.setVisibility((K() && (this.f8631I.getVisibility() == 0 || this.f8633K.getVisibility() == 0)) ? 0 : 8);
    }

    public final void g0(boolean z7) {
        this.f8631I.setVisibility((this.f8652g0 && K() && hasFocus() && (z7 || !this.f8657l0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f8626D.getImeOptions();
    }

    public int getInputType() {
        return this.f8626D.getInputType();
    }

    public int getMaxWidth() {
        return this.f8656k0;
    }

    public CharSequence getQuery() {
        return this.f8626D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8653h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8662q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f8646a0 : getContext().getText(this.f8662q0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f8643U;
    }

    public int getSuggestionRowLayout() {
        return this.f8642T;
    }

    public M.a getSuggestionsAdapter() {
        return this.f8651f0;
    }

    public final void h0(boolean z7) {
        this.f8650e0 = z7;
        int i7 = 8;
        int i8 = z7 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f8626D.getText());
        this.f8630H.setVisibility(i8);
        g0(!isEmpty);
        this.f8627E.setVisibility(z7 ? 8 : 0);
        if (this.f8640R.getDrawable() != null && !this.f8649d0) {
            i7 = 0;
        }
        this.f8640R.setVisibility(i7);
        b0();
        i0(isEmpty);
        f0();
    }

    public final void i0(boolean z7) {
        int i7 = 8;
        if (this.f8657l0 && !I() && z7) {
            this.f8631I.setVisibility(8);
            i7 = 0;
        }
        this.f8633K.setVisibility(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f8664s0);
        post(this.f8665t0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            F(this.f8626D, this.f8636N);
            Rect rect = this.f8637O;
            Rect rect2 = this.f8636N;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            p pVar = this.f8635M;
            if (pVar != null) {
                pVar.a(this.f8637O, this.f8636N);
                return;
            }
            p pVar2 = new p(this.f8637O, this.f8636N, this.f8626D);
            this.f8635M = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // androidx.appcompat.widget.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.I()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L30
            if (r0 == 0) goto L26
            if (r0 == r2) goto L1d
            goto L3a
        L1d:
            int r0 = r3.f8656k0
            if (r0 <= 0) goto L3a
        L21:
            int r4 = java.lang.Math.min(r0, r4)
            goto L3a
        L26:
            int r4 = r3.f8656k0
            if (r4 <= 0) goto L2b
            goto L3a
        L2b:
            int r4 = r3.getPreferredWidth()
            goto L3a
        L30:
            int r0 = r3.f8656k0
            if (r0 <= 0) goto L35
            goto L21
        L35:
            int r0 = r3.getPreferredWidth()
            goto L21
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4c
            if (r0 == 0) goto L47
            goto L54
        L47:
            int r5 = r3.getPreferredHeight()
            goto L54
        L4c:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L54:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        h0(oVar.f8690q);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f8690q = I();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        if (this.f8655j0 || !isFocusable()) {
            return false;
        }
        if (I()) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.f8626D.requestFocus(i7, rect);
        if (requestFocus) {
            h0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f8663r0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            O();
        } else {
            S();
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f8649d0 == z7) {
            return;
        }
        this.f8649d0 = z7;
        h0(z7);
        d0();
    }

    public void setImeOptions(int i7) {
        this.f8626D.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f8626D.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f8656k0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f8647b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f8648c0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8653h0 = charSequence;
        d0();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.f8654i0 = z7;
        M.a aVar = this.f8651f0;
        if (aVar instanceof S) {
            ((S) aVar).x(z7 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8662q0 = searchableInfo;
        if (searchableInfo != null) {
            e0();
            d0();
        }
        boolean H6 = H();
        this.f8657l0 = H6;
        if (H6) {
            this.f8626D.setPrivateImeOptions("nm");
        }
        h0(I());
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f8652g0 = z7;
        h0(I());
    }

    public void setSuggestionsAdapter(M.a aVar) {
        this.f8651f0 = aVar;
        this.f8626D.setAdapter(aVar);
    }

    public void y() {
        if (this.f8634L.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f8628F.getPaddingLeft();
            Rect rect = new Rect();
            boolean a7 = d0.a(this);
            int dimensionPixelSize = this.f8649d0 ? resources.getDimensionPixelSize(AbstractC1232c.f13357c) + resources.getDimensionPixelSize(AbstractC1232c.f13358d) : 0;
            this.f8626D.getDropDownBackground().getPadding(rect);
            int i7 = rect.left;
            this.f8626D.setDropDownHorizontalOffset(a7 ? -i7 : paddingLeft - (i7 + dimensionPixelSize));
            this.f8626D.setDropDownWidth((((this.f8634L.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent z(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8659n0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f8663r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f8662q0.getSearchActivity());
        return intent;
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1230a.f13345p);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8636N = new Rect();
        this.f8637O = new Rect();
        this.f8638P = new int[2];
        this.f8639Q = new int[2];
        this.f8664s0 = new b();
        this.f8665t0 = new c();
        this.f8666u0 = new WeakHashMap();
        f fVar = new f();
        this.f8667v0 = fVar;
        this.f8668w0 = new g();
        h hVar = new h();
        this.f8669x0 = hVar;
        i iVar = new i();
        this.f8670y0 = iVar;
        j jVar = new j();
        this.f8671z0 = jVar;
        this.f8625A0 = new a();
        X s7 = X.s(context, attributeSet, AbstractC1238i.f13479D1, i7, 0);
        LayoutInflater.from(context).inflate(s7.l(AbstractC1238i.f13519N1, AbstractC1235f.f13450l), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC1234e.f13432t);
        this.f8626D = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f8627E = findViewById(AbstractC1234e.f13428p);
        View findViewById = findViewById(AbstractC1234e.f13431s);
        this.f8628F = findViewById;
        View findViewById2 = findViewById(AbstractC1234e.f13438z);
        this.f8629G = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC1234e.f13426n);
        this.f8630H = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC1234e.f13429q);
        this.f8631I = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC1234e.f13427o);
        this.f8632J = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC1234e.f13433u);
        this.f8633K = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC1234e.f13430r);
        this.f8640R = imageView5;
        AbstractC0421s.E(findViewById, s7.f(AbstractC1238i.f13523O1));
        AbstractC0421s.E(findViewById2, s7.f(AbstractC1238i.f13539S1));
        imageView.setImageDrawable(s7.f(AbstractC1238i.f13535R1));
        imageView2.setImageDrawable(s7.f(AbstractC1238i.f13511L1));
        imageView3.setImageDrawable(s7.f(AbstractC1238i.f13499I1));
        imageView4.setImageDrawable(s7.f(AbstractC1238i.f13547U1));
        imageView5.setImageDrawable(s7.f(AbstractC1238i.f13535R1));
        this.f8641S = s7.f(AbstractC1238i.f13531Q1);
        Z.a(imageView, getResources().getString(AbstractC1236g.f13463l));
        this.f8642T = s7.l(AbstractC1238i.f13543T1, AbstractC1235f.f13449k);
        this.f8643U = s7.l(AbstractC1238i.f13503J1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f8625A0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f8668w0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(s7.a(AbstractC1238i.f13515M1, true));
        int e7 = s7.e(AbstractC1238i.f13487F1, -1);
        if (e7 != -1) {
            setMaxWidth(e7);
        }
        this.f8646a0 = s7.n(AbstractC1238i.f13507K1);
        this.f8653h0 = s7.n(AbstractC1238i.f13527P1);
        int i8 = s7.i(AbstractC1238i.f13495H1, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = s7.i(AbstractC1238i.f13491G1, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(s7.a(AbstractC1238i.f13483E1, true));
        s7.t();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f8644V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f8645W = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f8634L = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        h0(this.f8649d0);
        d0();
    }
}
