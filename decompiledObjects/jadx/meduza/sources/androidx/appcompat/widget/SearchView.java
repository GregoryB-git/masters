package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import b.a0;
import e0.d0;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.meduza.meduza.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.b1;
import l.f1;
import l.t0;
import l.z0;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements j.b {

    /* renamed from: r0, reason: collision with root package name */
    public static final o f803r0;
    public final View A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public q G;
    public Rect H;
    public Rect I;
    public int[] J;
    public int[] K;
    public final ImageView L;
    public final Drawable M;
    public final int N;
    public final int O;
    public final Intent P;
    public final Intent Q;
    public final CharSequence R;
    public View.OnFocusChangeListener S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public m0.a W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f804a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f805b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f806c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f807d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f808e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f809f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f810g0;

    /* renamed from: h0, reason: collision with root package name */
    public CharSequence f811h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f812i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f813j0;

    /* renamed from: k0, reason: collision with root package name */
    public SearchableInfo f814k0;

    /* renamed from: l0, reason: collision with root package name */
    public Bundle f815l0;

    /* renamed from: m0, reason: collision with root package name */
    public final b f816m0;

    /* renamed from: n0, reason: collision with root package name */
    public c f817n0;

    /* renamed from: o0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f818o0;

    /* renamed from: p0, reason: collision with root package name */
    public g f819p0;

    /* renamed from: q0, reason: collision with root package name */
    public a f820q0;

    /* renamed from: x, reason: collision with root package name */
    public final SearchAutoComplete f821x;

    /* renamed from: y, reason: collision with root package name */
    public final View f822y;

    /* renamed from: z, reason: collision with root package name */
    public final View f823z;

    public static class SearchAutoComplete extends l.c {

        /* renamed from: e, reason: collision with root package name */
        public int f824e;
        public SearchView f;

        /* renamed from: o, reason: collision with root package name */
        public boolean f825o;

        /* renamed from: p, reason: collision with root package name */
        public final a f826p;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f825o) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f825o = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f826p = new a();
            this.f824e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f803r0;
            oVar.getClass();
            o.a();
            Method method = oVar.f840c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f824e <= 0 || super.enoughToFilter();
        }

        @Override // l.c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f825o) {
                removeCallbacks(this.f826p);
                post(this.f826p);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.V);
            searchView.post(searchView.f816m0);
            if (searchView.f821x.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
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
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f.hasFocus() && getVisibility() == 0) {
                this.f825o = true;
                Context context = getContext();
                o oVar = SearchView.f803r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f825o = false;
                removeCallbacks(this.f826p);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f825o = true;
                    return;
                }
                this.f825o = false;
                removeCallbacks(this.f826p);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f824e = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f821x.getText();
            searchView.f811h0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.u(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f809f0 && !searchView.V && z11) {
                searchView.C.setVisibility(8);
                i13 = 0;
            }
            searchView.E.setVisibility(i13);
            searchView.q();
            searchView.t();
            searchView.getClass();
            searchView.f810g0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.r();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m0.a aVar = SearchView.this.W;
            if (aVar instanceof t0) {
                aVar.c(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView searchView = SearchView.this;
            if (searchView.F.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f823z.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = f1.a(searchView);
                int dimensionPixelSize = searchView.U ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f821x.getDropDownBackground().getPadding(rect);
                searchView.f821x.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f821x.setDropDownWidth((((searchView.F.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.B) {
                searchView.v(false);
                searchView.f821x.requestFocus();
                searchView.f821x.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.T;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.D) {
                searchView.l();
                return;
            }
            if (view == searchView.C) {
                searchView.p();
                return;
            }
            if (view != searchView.E) {
                if (view == searchView.f821x) {
                    searchView.k();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f814k0;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.j(searchView.Q, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.P);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f814k0 == null) {
                return false;
            }
            if (!searchView.f821x.isPopupShowing() || SearchView.this.f821x.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f821x.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.getContext().startActivity(searchView2.i("android.intent.action.SEARCH", null, null, searchView2.f821x.getText().toString()));
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f814k0 == null || searchView3.W == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView3.m(searchView3.f821x.getListSelection());
            }
            if (i10 != 21 && i10 != 22) {
                if (i10 != 19) {
                    return false;
                }
                searchView3.f821x.getListSelection();
                return false;
            }
            searchView3.f821x.setSelection(i10 == 21 ? 0 : searchView3.f821x.length());
            searchView3.f821x.setListSelection(0);
            searchView3.f821x.clearListSelection();
            searchView3.f821x.a();
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.p();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.n(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean a();

        boolean b();
    }

    public interface n {
        boolean a();

        boolean b();
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public Method f838a;

        /* renamed from: b, reason: collision with root package name */
        public Method f839b;

        /* renamed from: c, reason: collision with root package name */
        public Method f840c;

        public o() {
            this.f838a = null;
            this.f839b = null;
            this.f840c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f838a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f839b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f840c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends n0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f841c;

        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new p[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f841c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("SearchView.SavedState{");
            l10.append(Integer.toHexString(System.identityHashCode(this)));
            l10.append(" isIconified=");
            l10.append(this.f841c);
            l10.append("}");
            return l10.toString();
        }

        @Override // n0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11178a, i10);
            parcel.writeValue(Boolean.valueOf(this.f841c));
        }
    }

    public static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f842a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f843b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f844c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f845d;

        /* renamed from: e, reason: collision with root package name */
        public final int f846e;
        public boolean f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f846e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f843b = rect3;
            Rect rect4 = new Rect();
            this.f845d = rect4;
            Rect rect5 = new Rect();
            this.f844c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f842a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f;
                    if (z11 && !this.f845d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f;
                        this.f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f843b.contains(x10, y10)) {
                    this.f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f844c.contains(x10, y10)) {
                Rect rect = this.f844c;
                f = x10 - rect.left;
                i10 = y10 - rect.top;
            } else {
                f = this.f842a.getWidth() / 2;
                i10 = this.f842a.getHeight() / 2;
            }
            motionEvent.setLocation(f, i10);
            return this.f842a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f803r0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.H = new Rect();
        this.I = new Rect();
        this.J = new int[2];
        this.K = new int[2];
        this.f816m0 = new b();
        this.f817n0 = new c();
        this.f818o0 = new WeakHashMap<>();
        f fVar = new f();
        this.f819p0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f820q0 = new a();
        int[] iArr = a0.H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        z0 z0Var = new z0(context, obtainStyledAttributes);
        d0.g(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(z0Var.i(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f821x = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f822y = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f823z = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.A = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.B = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.C = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.D = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.E = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.L = imageView5;
        findViewById.setBackground(z0Var.e(10));
        findViewById2.setBackground(z0Var.e(14));
        imageView.setImageDrawable(z0Var.e(13));
        imageView2.setImageDrawable(z0Var.e(7));
        imageView3.setImageDrawable(z0Var.e(4));
        imageView4.setImageDrawable(z0Var.e(16));
        imageView5.setImageDrawable(z0Var.e(13));
        this.M = z0Var.e(12);
        b1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.N = z0Var.i(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.O = z0Var.i(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f820q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f819p0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(z0Var.a(8, true));
        int d10 = z0Var.d(1, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.R = z0Var.k(6);
        this.f805b0 = z0Var.k(11);
        int h10 = z0Var.h(3, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = z0Var.h(2, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(z0Var.a(0, true));
        z0Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.P = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.F = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        v(this.U);
        s();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f821x.setText(charSequence);
        this.f821x.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f807d0 = true;
        super.clearFocus();
        this.f821x.clearFocus();
        this.f821x.setImeVisibility(false);
        this.f807d0 = false;
    }

    public int getImeOptions() {
        return this.f821x.getImeOptions();
    }

    public int getInputType() {
        return this.f821x.getInputType();
    }

    public int getMaxWidth() {
        return this.f808e0;
    }

    public CharSequence getQuery() {
        return this.f821x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f805b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f814k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.R : getContext().getText(this.f814k0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.O;
    }

    public int getSuggestionRowLayout() {
        return this.N;
    }

    public m0.a getSuggestionsAdapter() {
        return this.W;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f811h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f815l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f814k0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f815l0;
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

    public final void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f821x);
            return;
        }
        o oVar = f803r0;
        SearchAutoComplete searchAutoComplete = this.f821x;
        oVar.getClass();
        o.a();
        Method method = oVar.f838a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f803r0;
        SearchAutoComplete searchAutoComplete2 = this.f821x;
        oVar2.getClass();
        o.a();
        Method method2 = oVar2.f839b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        if (!TextUtils.isEmpty(this.f821x.getText())) {
            this.f821x.setText("");
            this.f821x.requestFocus();
            this.f821x.setImeVisibility(true);
        } else if (this.U) {
            clearFocus();
            v(true);
        }
    }

    public final boolean m(int i10) {
        int i11;
        String i12;
        Cursor cursor = this.W.f9860c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i13 = t0.F;
                String i14 = t0.i(cursor.getColumnIndex("suggest_intent_action"), cursor);
                if (i14 == null) {
                    i14 = this.f814k0.getSuggestIntentAction();
                }
                if (i14 == null) {
                    i14 = "android.intent.action.SEARCH";
                }
                String i15 = t0.i(cursor.getColumnIndex("suggest_intent_data"), cursor);
                if (i15 == null) {
                    i15 = this.f814k0.getSuggestIntentData();
                }
                if (i15 != null && (i12 = t0.i(cursor.getColumnIndex("suggest_intent_data_id"), cursor)) != null) {
                    i15 = i15 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + Uri.encode(i12);
                }
                intent = i(i14, i15 == null ? null : Uri.parse(i15), t0.i(cursor.getColumnIndex("suggest_intent_extra_data"), cursor), t0.i(cursor.getColumnIndex("suggest_intent_query"), cursor));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        this.f821x.setImeVisibility(false);
        this.f821x.dismissDropDown();
        return true;
    }

    public final void n(int i10) {
        String d10;
        Editable text = this.f821x.getText();
        Cursor cursor = this.W.f9860c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10) || (d10 = this.W.d(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(d10);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // j.b
    public final void onActionViewCollapsed() {
        this.f821x.setText("");
        SearchAutoComplete searchAutoComplete = this.f821x;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f811h0 = "";
        clearFocus();
        v(true);
        this.f821x.setImeOptions(this.f813j0);
        this.f812i0 = false;
    }

    @Override // j.b
    public final void onActionViewExpanded() {
        if (this.f812i0) {
            return;
        }
        this.f812i0 = true;
        int imeOptions = this.f821x.getImeOptions();
        this.f813j0 = imeOptions;
        this.f821x.setImeOptions(imeOptions | 33554432);
        this.f821x.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f816m0);
        post(this.f817n0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f821x;
            Rect rect = this.H;
            searchAutoComplete.getLocationInWindow(this.J);
            getLocationInWindow(this.K);
            int[] iArr = this.J;
            int i14 = iArr[1];
            int[] iArr2 = this.K;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.I;
            Rect rect3 = this.H;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            q qVar = this.G;
            if (qVar == null) {
                q qVar2 = new q(this.I, this.H, this.f821x);
                this.G = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            Rect rect4 = this.I;
            Rect rect5 = this.H;
            qVar.f843b.set(rect4);
            qVar.f845d.set(rect4);
            Rect rect6 = qVar.f845d;
            int i17 = -qVar.f846e;
            rect6.inset(i17, i17);
            qVar.f844c.set(rect5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // androidx.appcompat.widget.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.V
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f808e0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f808e0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f808e0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f11178a);
        v(pVar.f841c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f841c = this.V;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f816m0);
    }

    public final void p() {
        Editable text = this.f821x.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f814k0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        this.f821x.setImeVisibility(false);
        this.f821x.dismissDropDown();
    }

    public final void q() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f821x.getText());
        if (!z11 && (!this.U || this.f812i0)) {
            z10 = false;
        }
        this.D.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.D.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.f821x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f823z.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f807d0 || !isFocusable()) {
            return false;
        }
        if (this.V) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f821x.requestFocus(i10, rect);
        if (requestFocus) {
            v(false);
        }
        return requestFocus;
    }

    public final void s() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f821x;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.U && this.M != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.M.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.M), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f815l0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            l();
            return;
        }
        v(false);
        this.f821x.requestFocus();
        this.f821x.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        v(z10);
        s();
    }

    public void setImeOptions(int i10) {
        this.f821x.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f821x.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f808e0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f805b0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f806c0 = z10;
        m0.a aVar = this.W;
        if (aVar instanceof t0) {
            ((t0) aVar).f9470x = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f814k0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f821x
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f821x
            android.app.SearchableInfo r3 = r6.f814k0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f814k0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f814k0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f821x
            r3.setInputType(r7)
            m0.a r7 = r6.W
            if (r7 == 0) goto L42
            r7.c(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f814k0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            l.t0 r7 = new l.t0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f814k0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f818o0
            r7.<init>(r3, r6, r4, r5)
            r6.W = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f821x
            r3.setAdapter(r7)
            m0.a r7 = r6.W
            l.t0 r7 = (l.t0) r7
            boolean r3 = r6.f806c0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = r0
        L69:
            r7.f9470x = r3
        L6b:
            r6.s()
        L6e:
            android.app.SearchableInfo r7 = r6.f814k0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f814k0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.P
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f814k0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.Q
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = r3
        La0:
            r6.f809f0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f821x
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.V
            r6.v(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f804a0 = z10;
        v(this.V);
    }

    public void setSuggestionsAdapter(m0.a aVar) {
        this.W = aVar;
        this.f821x.setAdapter(aVar);
    }

    public final void t() {
        int i10 = 0;
        if (!((this.f804a0 || this.f809f0) && !this.V) || (this.C.getVisibility() != 0 && this.E.getVisibility() != 0)) {
            i10 = 8;
        }
        this.A.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r2.f809f0 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f804a0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f809f0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.V
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f809f0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.C
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.u(boolean):void");
    }

    public final void v(boolean z10) {
        this.V = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f821x.getText());
        this.B.setVisibility(i11);
        u(z11);
        this.f822y.setVisibility(z10 ? 8 : 0);
        this.L.setVisibility((this.L.getDrawable() == null || this.U) ? 8 : 0);
        q();
        boolean z12 = !z11;
        if (this.f809f0 && !this.V && z12) {
            this.C.setVisibility(8);
            i10 = 0;
        }
        this.E.setVisibility(i10);
        t();
    }
}
