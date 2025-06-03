// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.widget.EditText;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.reflect.Method;
import android.view.KeyEvent$DispatcherState;
import android.util.TypedValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import l.Q;
import android.content.res.Configuration;
import l.d0;
import android.view.View$MeasureSpec;
import android.view.TouchDelegate;
import android.widget.ListAdapter;
import android.content.ActivityNotFoundException;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.widget.AutoCompleteTextView;
import l.P;
import android.content.res.Resources;
import android.content.ComponentName;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.util.Log;
import android.net.Uri;
import android.text.TextUtils;
import e.c;
import android.view.View$OnLayoutChangeListener;
import l.Z;
import e.g;
import I.s;
import e.e;
import android.view.ViewGroup;
import e.f;
import android.view.LayoutInflater;
import l.X;
import e.i;
import android.text.Editable;
import android.widget.AdapterView;
import android.widget.TextView;
import android.view.KeyEvent;
import android.database.Cursor;
import l.S;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.os.Build$VERSION;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnKeyListener;
import java.util.WeakHashMap;
import android.os.Bundle;
import android.app.SearchableInfo;
import M.a;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import android.text.TextWatcher;

public class SearchView extends b implements j.b
{
    public static final n B0;
    public TextWatcher A0;
    public final SearchAutoComplete D;
    public final View E;
    public final View F;
    public final View G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final View L;
    public p M;
    public Rect N;
    public Rect O;
    public int[] P;
    public int[] Q;
    public final ImageView R;
    public final Drawable S;
    public final int T;
    public final int U;
    public final Intent V;
    public final Intent W;
    public final CharSequence a0;
    public View$OnFocusChangeListener b0;
    public View$OnClickListener c0;
    public boolean d0;
    public boolean e0;
    public M.a f0;
    public boolean g0;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public CharSequence m0;
    public CharSequence n0;
    public boolean o0;
    public int p0;
    public SearchableInfo q0;
    public Bundle r0;
    public final Runnable s0;
    public Runnable t0;
    public final WeakHashMap u0;
    public final View$OnClickListener v0;
    public View$OnKeyListener w0;
    public final TextView$OnEditorActionListener x0;
    public final AdapterView$OnItemClickListener y0;
    public final AdapterView$OnItemSelectedListener z0;
    
    static {
        n b0;
        if (Build$VERSION.SDK_INT < 29) {
            b0 = new n();
        }
        else {
            b0 = null;
        }
        B0 = b0;
    }
    
    public SearchView(@NonNull final Context context) {
        this(context, null);
    }
    
    public SearchView(@NonNull final Context context, final AttributeSet set) {
        this(context, set, e.a.p);
    }
    
    public SearchView(@NonNull final Context context, final AttributeSet set, int inputType) {
        super(context, set, inputType);
        this.N = new Rect();
        this.O = new Rect();
        this.P = new int[2];
        this.Q = new int[2];
        this.s0 = new Runnable() {
            @Override
            public void run() {
                SearchView.this.c0();
            }
        };
        this.t0 = new Runnable() {
            @Override
            public void run() {
                final M.a f0 = SearchView.this.f0;
                if (f0 instanceof S) {
                    f0.a(null);
                }
            }
        };
        this.u0 = new WeakHashMap();
        final View$OnClickListener view$OnClickListener = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final SearchView o = SearchView.this;
                if (view == o.H) {
                    o.S();
                    return;
                }
                if (view == o.J) {
                    o.O();
                    return;
                }
                if (view == o.I) {
                    o.T();
                    return;
                }
                if (view == o.K) {
                    o.X();
                    return;
                }
                if (view == o.D) {
                    o.E();
                }
            }
        };
        this.v0 = (View$OnClickListener)view$OnClickListener;
        this.w0 = (View$OnKeyListener)new View$OnKeyListener() {
            public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
                final SearchView o = SearchView.this;
                if (o.q0 == null) {
                    return false;
                }
                if (o.D.isPopupShowing() && SearchView.this.D.getListSelection() != -1) {
                    return SearchView.this.U(view, n, keyEvent);
                }
                if (!SearchView.this.D.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && n == 66) {
                    view.cancelLongPress();
                    final SearchView o2 = SearchView.this;
                    o2.M(0, null, ((EditText)o2.D).getText().toString());
                    return true;
                }
                return false;
            }
        };
        final TextView$OnEditorActionListener textView$OnEditorActionListener = (TextView$OnEditorActionListener)new TextView$OnEditorActionListener() {
            public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
                SearchView.this.T();
                return true;
            }
        };
        this.x0 = (TextView$OnEditorActionListener)textView$OnEditorActionListener;
        final AdapterView$OnItemClickListener adapterView$OnItemClickListener = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
                SearchView.this.P(n, 0, null);
            }
        };
        this.y0 = (AdapterView$OnItemClickListener)adapterView$OnItemClickListener;
        final AdapterView$OnItemSelectedListener adapterView$OnItemSelectedListener = (AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
                SearchView.this.Q(n);
            }
            
            public void onNothingSelected(final AdapterView adapterView) {
            }
        };
        this.z0 = (AdapterView$OnItemSelectedListener)adapterView$OnItemSelectedListener;
        this.A0 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                SearchView.this.V(charSequence);
            }
        };
        final X s = X.s(context, set, i.D1, inputType, 0);
        LayoutInflater.from(context).inflate(s.l(i.N1, f.l), (ViewGroup)this, true);
        final SearchAutoComplete d = (SearchAutoComplete)((View)this).findViewById(e.t);
        (this.D = d).setSearchView(this);
        this.E = ((View)this).findViewById(e.p);
        final View viewById = ((View)this).findViewById(e.s);
        this.F = viewById;
        final View viewById2 = ((View)this).findViewById(e.z);
        this.G = viewById2;
        final ImageView h = (ImageView)((View)this).findViewById(e.n);
        this.H = h;
        final ImageView i = (ImageView)((View)this).findViewById(e.q);
        this.I = i;
        final ImageView j = (ImageView)((View)this).findViewById(e.o);
        this.J = j;
        final ImageView k = (ImageView)((View)this).findViewById(e.u);
        this.K = k;
        final ImageView r = (ImageView)((View)this).findViewById(e.r);
        this.R = r;
        I.s.E(viewById, s.f(e.i.O1));
        I.s.E(viewById2, s.f(e.i.S1));
        h.setImageDrawable(s.f(e.i.R1));
        i.setImageDrawable(s.f(e.i.L1));
        j.setImageDrawable(s.f(e.i.I1));
        k.setImageDrawable(s.f(e.i.U1));
        r.setImageDrawable(s.f(e.i.R1));
        this.S = s.f(e.i.Q1);
        Z.a((View)h, ((View)this).getResources().getString(g.l));
        this.T = s.l(e.i.T1, f.k);
        this.U = s.l(e.i.J1, 0);
        ((View)h).setOnClickListener((View$OnClickListener)view$OnClickListener);
        ((View)j).setOnClickListener((View$OnClickListener)view$OnClickListener);
        ((View)i).setOnClickListener((View$OnClickListener)view$OnClickListener);
        ((View)k).setOnClickListener((View$OnClickListener)view$OnClickListener);
        ((View)d).setOnClickListener((View$OnClickListener)view$OnClickListener);
        ((TextView)d).addTextChangedListener(this.A0);
        ((TextView)d).setOnEditorActionListener((TextView$OnEditorActionListener)textView$OnEditorActionListener);
        d.setOnItemClickListener((AdapterView$OnItemClickListener)adapterView$OnItemClickListener);
        d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)adapterView$OnItemSelectedListener);
        ((View)d).setOnKeyListener(this.w0);
        ((View)d).setOnFocusChangeListener((View$OnFocusChangeListener)new View$OnFocusChangeListener() {
            public void onFocusChange(final View view, final boolean b) {
                final SearchView a = SearchView.this;
                final View$OnFocusChangeListener b2 = a.b0;
                if (b2 != null) {
                    b2.onFocusChange((View)a, b);
                }
            }
        });
        this.setIconifiedByDefault(s.a(e.i.M1, true));
        inputType = s.e(e.i.F1, -1);
        if (inputType != -1) {
            this.setMaxWidth(inputType);
        }
        this.a0 = s.n(e.i.K1);
        this.h0 = s.n(e.i.P1);
        inputType = s.i(e.i.H1, -1);
        if (inputType != -1) {
            this.setImeOptions(inputType);
        }
        inputType = s.i(e.i.G1, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        ((View)this).setFocusable(s.a(e.i.E1, true));
        s.t();
        final Intent v = new Intent("android.speech.action.WEB_SEARCH");
        (this.V = v).addFlags(268435456);
        v.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.W = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        final View viewById3 = ((View)this).findViewById(d.getDropDownAnchor());
        if ((this.L = viewById3) != null) {
            viewById3.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    SearchView.this.y();
                }
            });
        }
        this.h0(this.d0);
        this.d0();
    }
    
    public static boolean J(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
    
    private int getPreferredHeight() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(c.e);
    }
    
    private int getPreferredWidth() {
        return ((View)this).getContext().getResources().getDimensionPixelSize(c.f);
    }
    
    private void setQuery(final CharSequence text) {
        ((TextView)this.D).setText(text);
        final SearchAutoComplete d = this.D;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        ((EditText)d).setSelection(length);
    }
    
    public final Intent A(Cursor cursor, int position, final String ex) {
        String s = null;
        String o;
        String str;
        String string = null;
        StringBuilder sb;
        String s2;
        Uri parse;
        StringBuilder sb2;
        final Cursor cursor2;
        Label_0030_Outer:Label_0138_Outer:Label_0131_Outer:
        while (true) {
            while (true) {
                while (true) {
                Label_0250:
                    while (true) {
                        Label_0233: {
                            while (true) {
                                try {
                                    if ((s = l.S.o(cursor, "suggest_intent_action")) == null) {
                                        s = this.q0.getSuggestIntentAction();
                                    }
                                    break Label_0233;
                                Label_0179_Outer:
                                    while (true) {
                                        o = l.S.o(cursor, "suggest_intent_data_id");
                                        string = str;
                                        Block_5: {
                                            Block_7: {
                                                break Block_7;
                                                break Block_5;
                                            }
                                            sb = new StringBuilder();
                                            sb.append(str);
                                            sb.append("/");
                                            sb.append(Uri.encode(o));
                                            string = sb.toString();
                                            break Label_0250;
                                            return this.z(s2, parse, l.S.o(cursor, "suggest_intent_extra_data"), l.S.o(cursor, "suggest_intent_query"), position, (String)ex);
                                            while (true) {
                                                try {
                                                    position = cursor.getPosition();
                                                    while (true) {
                                                        sb2 = new StringBuilder();
                                                        sb2.append("Search suggestions cursor at row ");
                                                        sb2.append(position);
                                                        sb2.append(" returned exception.");
                                                        Log.w("SearchView", sb2.toString(), (Throwable)ex);
                                                        return null;
                                                        position = -1;
                                                        continue Label_0179_Outer;
                                                    }
                                                }
                                                catch (RuntimeException cursor2) {}
                                                cursor = cursor2;
                                                continue Label_0131_Outer;
                                            }
                                            parse = Uri.parse(string);
                                            return this.z(s2, parse, l.S.o(cursor, "suggest_intent_extra_data"), l.S.o(cursor, "suggest_intent_query"), position, (String)ex);
                                        }
                                        str = this.q0.getSuggestIntentData();
                                        Label_0057: {
                                            continue Label_0030_Outer;
                                        }
                                    }
                                }
                                // iftrue(Label_0250:, o == null)
                                // iftrue(Label_0057:, str = S.o(cursor, "suggest_intent_data") != null)
                                // iftrue(Label_0250:, string = str == null)
                                catch (RuntimeException ex) {
                                    continue Label_0131_Outer;
                                }
                                break;
                            }
                        }
                        if ((s2 = s) == null) {
                            s2 = "android.intent.action.SEARCH";
                            continue Label_0138_Outer;
                        }
                        continue Label_0138_Outer;
                    }
                    if (string == null) {
                        parse = null;
                        continue Label_0131_Outer;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    public final Intent B(final Intent intent, final SearchableInfo searchableInfo) {
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        final Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        final PendingIntent activity = PendingIntent.getActivity(((View)this).getContext(), 0, intent2, 1073741824);
        final Bundle bundle = new Bundle();
        final Bundle r0 = this.r0;
        if (r0 != null) {
            bundle.putParcelable("app_data", (Parcelable)r0);
        }
        final Intent intent3 = new Intent(intent);
        final Resources resources = ((View)this).getResources();
        String string;
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        else {
            string = "free_form";
        }
        final int voicePromptTextId = searchableInfo.getVoicePromptTextId();
        final String s = null;
        String string2;
        if (voicePromptTextId != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        }
        else {
            string2 = null;
        }
        String string3;
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        }
        else {
            string3 = null;
        }
        int voiceMaxResults;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        }
        else {
            voiceMaxResults = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = s;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", flattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }
    
    public final Intent C(final Intent intent, final SearchableInfo searchableInfo) {
        final Intent intent2 = new Intent(intent);
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = null;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }
    
    public final void D() {
        this.D.dismissDropDown();
    }
    
    public void E() {
        if (Build$VERSION.SDK_INT >= 29) {
            l.P.a(this.D);
            return;
        }
        final n b0 = SearchView.B0;
        b0.b(this.D);
        b0.a(this.D);
    }
    
    public final void F(final View view, final Rect rect) {
        view.getLocationInWindow(this.P);
        ((View)this).getLocationInWindow(this.Q);
        final int[] p2 = this.P;
        final int n = p2[1];
        final int[] q = this.Q;
        final int n2 = n - q[1];
        final int n3 = p2[0] - q[0];
        rect.set(n3, n2, view.getWidth() + n3, view.getHeight() + n2);
    }
    
    public final CharSequence G(final CharSequence charSequence) {
        if (!this.d0) {
            return charSequence;
        }
        if (this.S == null) {
            return charSequence;
        }
        final int n = (int)(((TextView)this.D).getTextSize() * 1.25);
        this.S.setBounds(0, 0, n, n);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
        spannableStringBuilder.setSpan((Object)new ImageSpan(this.S), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return (CharSequence)spannableStringBuilder;
    }
    
    public final boolean H() {
        final SearchableInfo q0 = this.q0;
        boolean b2;
        final boolean b = b2 = false;
        if (q0 != null) {
            b2 = b;
            if (q0.getVoiceSearchEnabled()) {
                Intent intent;
                if (this.q0.getVoiceSearchLaunchWebSearch()) {
                    intent = this.V;
                }
                else if (this.q0.getVoiceSearchLaunchRecognizer()) {
                    intent = this.W;
                }
                else {
                    intent = null;
                }
                b2 = b;
                if (intent != null) {
                    b2 = b;
                    if (((View)this).getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public boolean I() {
        return this.e0;
    }
    
    public final boolean K() {
        return (this.g0 || this.l0) && !this.I();
    }
    
    public final void L(final Intent obj) {
        if (obj == null) {
            return;
        }
        try {
            ((View)this).getContext().startActivity(obj);
        }
        catch (RuntimeException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(obj);
            Log.e("SearchView", sb.toString(), (Throwable)ex);
        }
    }
    
    public void M(final int n, final String s, final String s2) {
        ((View)this).getContext().startActivity(this.z("android.intent.action.SEARCH", null, null, s2, n, s));
    }
    
    public final boolean N(final int n, final int n2, final String s) {
        final Cursor b = this.f0.b();
        if (b != null && b.moveToPosition(n)) {
            this.L(this.A(b, n2, s));
            return true;
        }
        return false;
    }
    
    public void O() {
        if (TextUtils.isEmpty((CharSequence)((EditText)this.D).getText())) {
            if (this.d0) {
                this.clearFocus();
                this.h0(true);
            }
        }
        else {
            ((TextView)this.D).setText((CharSequence)"");
            ((View)this.D).requestFocus();
            this.D.setImeVisibility(true);
        }
    }
    
    public boolean P(final int n, final int n2, final String s) {
        this.N(n, 0, null);
        this.D.setImeVisibility(false);
        this.D();
        return true;
    }
    
    public boolean Q(final int n) {
        this.Z(n);
        return true;
    }
    
    public void R(final CharSequence query) {
        this.setQuery(query);
    }
    
    public void S() {
        this.h0(false);
        ((View)this.D).requestFocus();
        this.D.setImeVisibility(true);
        final View$OnClickListener c0 = this.c0;
        if (c0 != null) {
            c0.onClick((View)this);
        }
    }
    
    public void T() {
        final Editable text = ((EditText)this.D).getText();
        if (text != null && TextUtils.getTrimmedLength((CharSequence)text) > 0) {
            if (this.q0 != null) {
                this.M(0, null, ((CharSequence)text).toString());
            }
            this.D.setImeVisibility(false);
            this.D();
        }
    }
    
    public boolean U(final View view, int length, final KeyEvent keyEvent) {
        if (this.q0 == null) {
            return false;
        }
        if (this.f0 == null) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (length == 66 || length == 84 || length == 61) {
                return this.P(this.D.getListSelection(), 0, null);
            }
            if (length == 21 || length == 22) {
                if (length == 21) {
                    length = 0;
                }
                else {
                    length = ((TextView)this.D).length();
                }
                ((EditText)this.D).setSelection(length);
                this.D.setListSelection(0);
                this.D.clearListSelection();
                this.D.a();
                return true;
            }
            if (length == 19) {
                this.D.getListSelection();
                return false;
            }
        }
        return false;
    }
    
    public void V(final CharSequence charSequence) {
        final Editable text = ((EditText)this.D).getText();
        this.n0 = (CharSequence)text;
        final boolean empty = TextUtils.isEmpty((CharSequence)text);
        this.g0(empty ^ true);
        this.i0(empty);
        this.b0();
        this.f0();
        this.m0 = charSequence.toString();
    }
    
    public void W() {
        this.h0(this.I());
        this.Y();
        if (((View)this.D).hasFocus()) {
            this.E();
        }
    }
    
    public void X() {
        final SearchableInfo q0 = this.q0;
        if (q0 == null) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    Intent intent = null;
                    Label_0027: {
                        if (!q0.getVoiceSearchLaunchWebSearch()) {
                            if (q0.getVoiceSearchLaunchRecognizer()) {
                                intent = this.B(this.W, q0);
                                break Label_0027;
                            }
                            return;
                        }
                        intent = this.C(this.V, q0);
                    }
                    ((View)this).getContext().startActivity(intent);
                    return;
                    Log.w("SearchView", "Could not find voice search activity");
                    return;
                }
                catch (ActivityNotFoundException ex) {}
                continue;
            }
        }
    }
    
    public final void Y() {
        ((View)this).post(this.s0);
    }
    
    public final void Z(final int n) {
        final Editable text = ((EditText)this.D).getText();
        final Cursor b = this.f0.b();
        if (b == null) {
            return;
        }
        if (b.moveToPosition(n)) {
            final CharSequence c = this.f0.c(b);
            if (c != null) {
                this.setQuery(c);
                return;
            }
        }
        this.setQuery((CharSequence)text);
    }
    
    public void a0(final CharSequence charSequence, final boolean b) {
        ((TextView)this.D).setText(charSequence);
        if (charSequence != null) {
            final SearchAutoComplete d = this.D;
            ((EditText)d).setSelection(((TextView)d).length());
            this.n0 = charSequence;
        }
        if (b && !TextUtils.isEmpty(charSequence)) {
            this.T();
        }
    }
    
    @Override
    public void b() {
        if (this.o0) {
            return;
        }
        this.o0 = true;
        final int imeOptions = ((TextView)this.D).getImeOptions();
        this.p0 = imeOptions;
        ((TextView)this.D).setImeOptions(imeOptions | 0x2000000);
        ((TextView)this.D).setText((CharSequence)"");
        this.setIconified(false);
    }
    
    public final void b0() {
        final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)this.D).getText());
        final boolean b = true;
        final boolean b2 = empty ^ true;
        final boolean b3 = false;
        boolean b4 = b;
        if (!b2) {
            b4 = (this.d0 && !this.o0 && b);
        }
        final ImageView j = this.J;
        int visibility;
        if (b4) {
            visibility = (b3 ? 1 : 0);
        }
        else {
            visibility = 8;
        }
        j.setVisibility(visibility);
        final Drawable drawable = this.J.getDrawable();
        if (drawable != null) {
            int[] state;
            if (b2) {
                state = ViewGroup.ENABLED_STATE_SET;
            }
            else {
                state = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(state);
        }
    }
    
    @Override
    public void c() {
        this.a0("", false);
        this.clearFocus();
        this.h0(true);
        ((TextView)this.D).setImeOptions(this.p0);
        this.o0 = false;
    }
    
    public void c0() {
        int[] array;
        if (((View)this.D).hasFocus()) {
            array = ViewGroup.FOCUSED_STATE_SET;
        }
        else {
            array = ViewGroup.EMPTY_STATE_SET;
        }
        final Drawable background = this.F.getBackground();
        if (background != null) {
            background.setState(array);
        }
        final Drawable background2 = this.G.getBackground();
        if (background2 != null) {
            background2.setState(array);
        }
        ((View)this).invalidate();
    }
    
    public void clearFocus() {
        this.j0 = true;
        super.clearFocus();
        ((View)this.D).clearFocus();
        this.D.setImeVisibility(false);
        this.j0 = false;
    }
    
    public final void d0() {
        final CharSequence queryHint = this.getQueryHint();
        final SearchAutoComplete d = this.D;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        ((TextView)d).setHint(this.G(charSequence));
    }
    
    public final void e0() {
        this.D.setThreshold(this.q0.getSuggestThreshold());
        ((TextView)this.D).setImeOptions(this.q0.getImeOptions());
        final int inputType = this.q0.getInputType();
        final boolean b = true;
        int inputType2 = inputType;
        if ((inputType & 0xF) == 0x1) {
            inputType2 = (inputType & 0xFFFEFFFF);
            if (this.q0.getSuggestAuthority() != null) {
                inputType2 |= 0x90000;
            }
        }
        ((TextView)this.D).setInputType(inputType2);
        final M.a f0 = this.f0;
        if (f0 != null) {
            f0.a(null);
        }
        if (this.q0.getSuggestAuthority() != null) {
            final S s = new S(((View)this).getContext(), this, this.q0, this.u0);
            this.f0 = s;
            this.D.setAdapter((ListAdapter)s);
            final S s2 = (S)this.f0;
            int n = b ? 1 : 0;
            if (this.i0) {
                n = 2;
            }
            s2.x(n);
        }
    }
    
    public final void f0() {
        int visibility;
        if (this.K() && (((View)this.I).getVisibility() == 0 || ((View)this.K).getVisibility() == 0)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.G.setVisibility(visibility);
    }
    
    public final void g0(final boolean b) {
        int visibility;
        if (this.g0 && this.K() && ((View)this).hasFocus() && (b || !this.l0)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.I.setVisibility(visibility);
    }
    
    public int getImeOptions() {
        return ((TextView)this.D).getImeOptions();
    }
    
    public int getInputType() {
        return ((TextView)this.D).getInputType();
    }
    
    public int getMaxWidth() {
        return this.k0;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)((EditText)this.D).getText();
    }
    
    public CharSequence getQueryHint() {
        final CharSequence h0 = this.h0;
        if (h0 != null) {
            return h0;
        }
        final SearchableInfo q0 = this.q0;
        if (q0 != null && q0.getHintId() != 0) {
            return ((View)this).getContext().getText(this.q0.getHintId());
        }
        return this.a0;
    }
    
    public int getSuggestionCommitIconResId() {
        return this.U;
    }
    
    public int getSuggestionRowLayout() {
        return this.T;
    }
    
    public M.a getSuggestionsAdapter() {
        return this.f0;
    }
    
    public final void h0(final boolean e0) {
        this.e0 = e0;
        final int n = 8;
        int visibility;
        if (e0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)this.D).getText());
        this.H.setVisibility(visibility);
        this.g0(empty ^ true);
        final View e2 = this.E;
        int visibility2;
        if (e0) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        e2.setVisibility(visibility2);
        int visibility3 = n;
        if (this.R.getDrawable() != null) {
            if (this.d0) {
                visibility3 = n;
            }
            else {
                visibility3 = 0;
            }
        }
        this.R.setVisibility(visibility3);
        this.b0();
        this.i0(empty);
        this.f0();
    }
    
    public final void i0(final boolean b) {
        final boolean l0 = this.l0;
        int visibility;
        final int n = visibility = 8;
        if (l0) {
            visibility = n;
            if (!this.I()) {
                visibility = n;
                if (b) {
                    this.I.setVisibility(8);
                    visibility = 0;
                }
            }
        }
        this.K.setVisibility(visibility);
    }
    
    public void onDetachedFromWindow() {
        ((View)this).removeCallbacks(this.s0);
        ((View)this).post(this.t0);
        super.onDetachedFromWindow();
    }
    
    @Override
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.F((View)this.D, this.N);
            final Rect o = this.O;
            final Rect n5 = this.N;
            o.set(n5.left, 0, n5.right, n4 - n2);
            final p m = this.M;
            if (m == null) {
                ((View)this).setTouchDelegate((TouchDelegate)(this.M = new p(this.O, this.N, (View)this.D)));
                return;
            }
            m.a(this.O, this.N);
        }
    }
    
    @Override
    public void onMeasure(int a, int b) {
        if (this.I()) {
            super.onMeasure(a, b);
            return;
        }
        final int mode = View$MeasureSpec.getMode(a);
        final int size = View$MeasureSpec.getSize(a);
        Label_0116: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        a = size;
                        break Label_0116;
                    }
                    final int k0 = this.k0;
                    a = size;
                    if (k0 <= 0) {
                        break Label_0116;
                    }
                    a = k0;
                }
                else {
                    a = this.k0;
                    if (a > 0) {
                        break Label_0116;
                    }
                    a = this.getPreferredWidth();
                    break Label_0116;
                }
            }
            else {
                a = this.k0;
                if (a <= 0) {
                    a = this.getPreferredWidth();
                }
            }
            a = Math.min(a, size);
        }
        final int mode2 = View$MeasureSpec.getMode(b);
        b = View$MeasureSpec.getSize(b);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                b = this.getPreferredHeight();
            }
        }
        else {
            b = Math.min(this.getPreferredHeight(), b);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(a, 1073741824), View$MeasureSpec.makeMeasureSpec(b, 1073741824));
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final o o = (o)parcelable;
        super.onRestoreInstanceState(o.a());
        this.h0(o.q);
        ((View)this).requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final o o = new o(super.onSaveInstanceState());
        o.q = this.I();
        return (Parcelable)o;
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.Y();
    }
    
    public boolean requestFocus(final int n, final Rect rect) {
        if (this.j0) {
            return false;
        }
        if (!((View)this).isFocusable()) {
            return false;
        }
        if (!this.I()) {
            final boolean requestFocus = ((View)this.D).requestFocus(n, rect);
            if (requestFocus) {
                this.h0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(n, rect);
    }
    
    public void setAppSearchData(final Bundle r0) {
        this.r0 = r0;
    }
    
    public void setIconified(final boolean b) {
        if (b) {
            this.O();
            return;
        }
        this.S();
    }
    
    public void setIconifiedByDefault(final boolean d0) {
        if (this.d0 == d0) {
            return;
        }
        this.h0(this.d0 = d0);
        this.d0();
    }
    
    public void setImeOptions(final int imeOptions) {
        ((TextView)this.D).setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        ((TextView)this.D).setInputType(inputType);
    }
    
    public void setMaxWidth(final int k0) {
        this.k0 = k0;
        ((View)this).requestLayout();
    }
    
    public void setOnCloseListener(final k k) {
    }
    
    public void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener b0) {
        this.b0 = b0;
    }
    
    public void setOnQueryTextListener(final l l) {
    }
    
    public void setOnSearchClickListener(final View$OnClickListener c0) {
        this.c0 = c0;
    }
    
    public void setOnSuggestionListener(final m m) {
    }
    
    public void setQueryHint(final CharSequence h0) {
        this.h0 = h0;
        this.d0();
    }
    
    public void setQueryRefinementEnabled(final boolean i0) {
        this.i0 = i0;
        final M.a f0 = this.f0;
        if (f0 instanceof S) {
            final S s = (S)f0;
            int n;
            if (i0) {
                n = 2;
            }
            else {
                n = 1;
            }
            s.x(n);
        }
    }
    
    public void setSearchableInfo(final SearchableInfo q0) {
        this.q0 = q0;
        if (q0 != null) {
            this.e0();
            this.d0();
        }
        final boolean h = this.H();
        this.l0 = h;
        if (h) {
            ((TextView)this.D).setPrivateImeOptions("nm");
        }
        this.h0(this.I());
    }
    
    public void setSubmitButtonEnabled(final boolean g0) {
        this.g0 = g0;
        this.h0(this.I());
    }
    
    public void setSuggestionsAdapter(final M.a a) {
        this.f0 = a;
        this.D.setAdapter((ListAdapter)a);
    }
    
    public void y() {
        if (this.L.getWidth() > 1) {
            final Resources resources = ((View)this).getContext().getResources();
            final int paddingLeft = this.F.getPaddingLeft();
            final Rect rect = new Rect();
            final boolean a = l.d0.a((View)this);
            int n;
            if (this.d0) {
                n = resources.getDimensionPixelSize(c.c) + resources.getDimensionPixelSize(c.d);
            }
            else {
                n = 0;
            }
            this.D.getDropDownBackground().getPadding(rect);
            final int left = rect.left;
            int dropDownHorizontalOffset;
            if (a) {
                dropDownHorizontalOffset = -left;
            }
            else {
                dropDownHorizontalOffset = paddingLeft - (left + n);
            }
            this.D.setDropDownHorizontalOffset(dropDownHorizontalOffset);
            this.D.setDropDownWidth(this.L.getWidth() + rect.left + rect.right + n - paddingLeft);
        }
    }
    
    public final Intent z(final String s, final Uri data, final String s2, final String s3, final int n, final String s4) {
        final Intent intent = new Intent(s);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.n0);
        if (s3 != null) {
            intent.putExtra("query", s3);
        }
        if (s2 != null) {
            intent.putExtra("intent_extra_data_key", s2);
        }
        final Bundle r0 = this.r0;
        if (r0 != null) {
            intent.putExtra("app_data", r0);
        }
        if (n != 0) {
            intent.putExtra("action_key", n);
            intent.putExtra("action_msg", s4);
        }
        intent.setComponent(this.q0.getSearchActivity());
        return intent;
    }
    
    public static class SearchAutoComplete extends c
    {
        public int r;
        public SearchView s;
        public boolean t;
        public final Runnable u;
        
        public SearchAutoComplete(final Context context, final AttributeSet set) {
            this(context, set, e.a.g);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
            super(context, set, n);
            this.u = new Runnable() {
                @Override
                public void run() {
                    SearchAutoComplete.this.c();
                }
            };
            this.r = this.getThreshold();
        }
        
        private int getSearchViewTextMinWidthDp() {
            final Configuration configuration = ((View)this).getResources().getConfiguration();
            final int screenWidthDp = configuration.screenWidthDp;
            final int screenHeightDp = configuration.screenHeightDp;
            if (screenWidthDp >= 960 && screenHeightDp >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (screenWidthDp < 600 && (screenWidthDp < 640 || screenHeightDp < 480)) {
                return 160;
            }
            return 192;
        }
        
        public void a() {
            if (Build$VERSION.SDK_INT >= 29) {
                l.Q.a(this, 1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.B0.c(this);
            }
        }
        
        public boolean b() {
            return TextUtils.getTrimmedLength((CharSequence)((EditText)this).getText()) == 0;
        }
        
        public void c() {
            if (this.t) {
                ((InputMethodManager)((View)this).getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
                this.t = false;
            }
        }
        
        public boolean enoughToFilter() {
            return this.r <= 0 || super.enoughToFilter();
        }
        
        @Override
        public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
            final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.t) {
                ((View)this).removeCallbacks(this.u);
                ((View)this).post(this.u);
            }
            return onCreateInputConnection;
        }
        
        public void onFinishInflate() {
            super.onFinishInflate();
            ((TextView)this).setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), ((View)this).getResources().getDisplayMetrics()));
        }
        
        public void onFocusChanged(final boolean b, final int n, final Rect rect) {
            super.onFocusChanged(b, n, rect);
            this.s.W();
        }
        
        public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
            if (n == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    final KeyEvent$DispatcherState keyDispatcherState = ((View)this).getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, (Object)this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    final KeyEvent$DispatcherState keyDispatcherState2 = ((View)this).getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.s.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(n, keyEvent);
        }
        
        public void onWindowFocusChanged(final boolean b) {
            super.onWindowFocusChanged(b);
            if (b && ((View)this.s).hasFocus() && ((View)this).getVisibility() == 0) {
                this.t = true;
                if (SearchView.J(((View)this).getContext())) {
                    this.a();
                }
            }
        }
        
        public void performCompletion() {
        }
        
        public void replaceText(final CharSequence charSequence) {
        }
        
        public void setImeVisibility(final boolean b) {
            final InputMethodManager inputMethodManager = (InputMethodManager)((View)this).getContext().getSystemService("input_method");
            if (!b) {
                this.t = false;
                ((View)this).removeCallbacks(this.u);
                inputMethodManager.hideSoftInputFromWindow(((View)this).getWindowToken(), 0);
                return;
            }
            if (inputMethodManager.isActive((View)this)) {
                this.t = false;
                ((View)this).removeCallbacks(this.u);
                inputMethodManager.showSoftInput((View)this, 0);
                return;
            }
            this.t = true;
        }
        
        public void setSearchView(final SearchView s) {
            this.s = s;
        }
        
        public void setThreshold(final int n) {
            super.setThreshold(n);
            this.r = n;
        }
    }
    
    public interface k
    {
    }
    
    public interface l
    {
    }
    
    public interface m
    {
    }
    
    public static class n
    {
        public Method a;
        public Method b;
        public Method c;
        
        public n() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: aconst_null    
            //     6: putfield        androidx/appcompat/widget/SearchView$n.a:Ljava/lang/reflect/Method;
            //     9: aload_0        
            //    10: aconst_null    
            //    11: putfield        androidx/appcompat/widget/SearchView$n.b:Ljava/lang/reflect/Method;
            //    14: aload_0        
            //    15: aconst_null    
            //    16: putfield        androidx/appcompat/widget/SearchView$n.c:Ljava/lang/reflect/Method;
            //    19: invokestatic    androidx/appcompat/widget/SearchView$n.d:()V
            //    22: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    24: ldc             "doBeforeTextChanged"
            //    26: iconst_0       
            //    27: anewarray       Ljava/lang/Class;
            //    30: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    33: astore_1       
            //    34: aload_0        
            //    35: aload_1        
            //    36: putfield        androidx/appcompat/widget/SearchView$n.a:Ljava/lang/reflect/Method;
            //    39: aload_1        
            //    40: iconst_1       
            //    41: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    44: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    46: ldc             "doAfterTextChanged"
            //    48: iconst_0       
            //    49: anewarray       Ljava/lang/Class;
            //    52: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    55: astore_1       
            //    56: aload_0        
            //    57: aload_1        
            //    58: putfield        androidx/appcompat/widget/SearchView$n.b:Ljava/lang/reflect/Method;
            //    61: aload_1        
            //    62: iconst_1       
            //    63: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    66: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    68: ldc             "ensureImeVisible"
            //    70: iconst_1       
            //    71: anewarray       Ljava/lang/Class;
            //    74: dup            
            //    75: iconst_0       
            //    76: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //    79: aastore        
            //    80: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    83: astore_1       
            //    84: aload_0        
            //    85: aload_1        
            //    86: putfield        androidx/appcompat/widget/SearchView$n.c:Ljava/lang/reflect/Method;
            //    89: aload_1        
            //    90: iconst_1       
            //    91: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
            //    94: return         
            //    95: astore_1       
            //    96: goto            44
            //    99: astore_1       
            //   100: goto            66
            //   103: astore_1       
            //   104: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  22     44     95     99     Ljava/lang/NoSuchMethodException;
            //  44     66     99     103    Ljava/lang/NoSuchMethodException;
            //  66     94     103    105    Ljava/lang/NoSuchMethodException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 59 out of bounds for length 59
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
        
        public static void d() {
            if (Build$VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
        
        public void a(final AutoCompleteTextView obj) {
            d();
            final Method b = this.b;
            if (b == null) {
                return;
            }
            try {
                b.invoke(obj, new Object[0]);
            }
            catch (Exception ex) {}
        }
        
        public void b(final AutoCompleteTextView obj) {
            d();
            final Method a = this.a;
            if (a == null) {
                return;
            }
            try {
                a.invoke(obj, new Object[0]);
            }
            catch (Exception ex) {}
        }
        
        public void c(final AutoCompleteTextView obj) {
            d();
            final Method c = this.c;
            if (c == null) {
                return;
            }
            try {
                c.invoke(obj, Boolean.TRUE);
            }
            catch (Exception ex) {}
        }
    }
    
    public static class o extends N.a
    {
        public static final Parcelable$Creator<o> CREATOR;
        public boolean q;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator() {
                public o a(final Parcel parcel) {
                    return new o(parcel, null);
                }
                
                public o b(final Parcel parcel, final ClassLoader classLoader) {
                    return new o(parcel, classLoader);
                }
                
                public o[] c(final int n) {
                    return new o[n];
                }
            };
        }
        
        public o(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = (boolean)parcel.readValue((ClassLoader)null);
        }
        
        public o(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.q);
            sb.append("}");
            return sb.toString();
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeValue((Object)this.q);
        }
    }
    
    public static class p extends TouchDelegate
    {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;
        
        public p(final Rect rect, final Rect rect2, final View a) {
            super(rect, a);
            this.e = ViewConfiguration.get(a.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect, rect2);
            this.a = a;
        }
        
        public void a(Rect d, final Rect rect) {
            this.b.set(d);
            this.d.set(d);
            d = this.d;
            final int e = this.e;
            d.inset(-e, -e);
            this.c.set(rect);
        }
        
        public boolean onTouchEvent(final MotionEvent motionEvent) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            final int action = motionEvent.getAction();
            final boolean b = false;
            int f = 1;
            boolean b2 = false;
            Label_0134: {
                Label_0129: {
                    if (action != 0) {
                        if (action != 1 && action != 2) {
                            if (action != 3) {
                                break Label_0129;
                            }
                            f = (this.f ? 1 : 0);
                            this.f = false;
                        }
                        else {
                            final boolean f2 = this.f;
                            if ((f = (f2 ? 1 : 0)) != 0) {
                                f = (f2 ? 1 : 0);
                                if (!this.d.contains(n, n2)) {
                                    f = (f2 ? 1 : 0);
                                    b2 = false;
                                    break Label_0134;
                                }
                            }
                        }
                        b2 = true;
                        break Label_0134;
                    }
                    if (this.b.contains(n, n2)) {
                        this.f = true;
                        b2 = true;
                        break Label_0134;
                    }
                }
                b2 = true;
                f = 0;
            }
            boolean dispatchTouchEvent = b;
            if (f != 0) {
                float n3;
                int n4;
                if (b2 && !this.c.contains(n, n2)) {
                    n3 = (float)(this.a.getWidth() / 2);
                    n4 = this.a.getHeight() / 2;
                }
                else {
                    final Rect c = this.c;
                    n3 = (float)(n - c.left);
                    n4 = n2 - c.top;
                }
                motionEvent.setLocation(n3, (float)n4);
                dispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
            }
            return dispatchTouchEvent;
        }
    }
}
