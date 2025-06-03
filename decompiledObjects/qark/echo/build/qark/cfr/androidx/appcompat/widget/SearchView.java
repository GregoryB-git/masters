/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.SearchableInfo
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.os.Parcelable$Creator
 *  android.text.Editable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.style.ImageSpan
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.TouchDelegate
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.AutoCompleteTextView
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedClassVersionError
 *  java.lang.reflect.Method
 *  java.util.WeakHashMap
 */
package androidx.appcompat.widget;

import I.s;
import M.a;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
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
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b;
import e.c;
import e.e;
import e.f;
import e.g;
import e.i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.P;
import l.Q;
import l.S;
import l.X;
import l.Z;
import l.d0;

public class SearchView
extends b
implements j.b {
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
    public Rect N = new Rect();
    public Rect O = new Rect();
    public int[] P = new int[2];
    public int[] Q = new int[2];
    public final ImageView R;
    public final Drawable S;
    public final int T;
    public final int U;
    public final Intent V;
    public final Intent W;
    public final CharSequence a0;
    public View.OnFocusChangeListener b0;
    public View.OnClickListener c0;
    public boolean d0;
    public boolean e0;
    public a f0;
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
    public final View.OnClickListener v0;
    public View.OnKeyListener w0;
    public final TextView.OnEditorActionListener x0;
    public final AdapterView.OnItemClickListener y0;
    public final AdapterView.OnItemSelectedListener z0;

    static {
        n n8 = Build.VERSION.SDK_INT < 29 ? new n() : null;
        B0 = n8;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.p);
    }

    public SearchView(@NonNull Context object, AttributeSet object2, int n8) {
        AdapterView.OnItemClickListener onItemClickListener;
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        ImageView imageView;
        TextView.OnEditorActionListener onEditorActionListener;
        View view;
        View.OnClickListener onClickListener;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        View view2;
        super((Context)object, (AttributeSet)object2, n8);
        this.s0 = new Runnable(){

            public void run() {
                SearchView.this.c0();
            }
        };
        this.t0 = new Runnable(){

            public void run() {
                a a8 = SearchView.this.f0;
                if (a8 instanceof S) {
                    a8.a(null);
                }
            }
        };
        this.u0 = new WeakHashMap();
        this.v0 = onClickListener = new View.OnClickListener(){

            public void onClick(View view) {
                SearchView searchView = SearchView.this;
                if (view == searchView.H) {
                    searchView.S();
                    return;
                }
                if (view == searchView.J) {
                    searchView.O();
                    return;
                }
                if (view == searchView.I) {
                    searchView.T();
                    return;
                }
                if (view == searchView.K) {
                    searchView.X();
                    return;
                }
                if (view == searchView.D) {
                    searchView.E();
                }
            }
        };
        this.w0 = new View.OnKeyListener(){

            public boolean onKey(View object, int n8, KeyEvent keyEvent) {
                SearchView searchView = SearchView.this;
                if (searchView.q0 == null) {
                    return false;
                }
                if (searchView.D.isPopupShowing() && SearchView.this.D.getListSelection() != -1) {
                    return SearchView.this.U((View)object, n8, keyEvent);
                }
                if (!SearchView.this.D.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && n8 == 66) {
                    object.cancelLongPress();
                    object = SearchView.this;
                    object.M(0, null, object.D.getText().toString());
                    return true;
                }
                return false;
            }
        };
        this.x0 = onEditorActionListener = new TextView.OnEditorActionListener(){

            public boolean onEditorAction(TextView textView, int n8, KeyEvent keyEvent) {
                SearchView.this.T();
                return true;
            }
        };
        this.y0 = onItemClickListener = new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView adapterView, View view, int n8, long l8) {
                SearchView.this.P(n8, 0, null);
            }
        };
        this.z0 = onItemSelectedListener = new AdapterView.OnItemSelectedListener(){

            public void onItemSelected(AdapterView adapterView, View view, int n8, long l8) {
                SearchView.this.Q(n8);
            }

            public void onNothingSelected(AdapterView adapterView) {
            }
        };
        this.A0 = new TextWatcher(){

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            }

            public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                SearchView.this.V(charSequence);
            }
        };
        object2 = X.s((Context)object, (AttributeSet)object2, i.D1, n8, 0);
        LayoutInflater.from((Context)object).inflate(object2.l(i.N1, f.l), (ViewGroup)this, true);
        this.D = object = (SearchAutoComplete)this.findViewById(e.t);
        object.setSearchView(this);
        this.E = this.findViewById(e.p);
        this.F = view2 = this.findViewById(e.s);
        this.G = view = this.findViewById(e.z);
        this.H = imageView2 = (ImageView)this.findViewById(e.n);
        this.I = imageView5 = (ImageView)this.findViewById(e.q);
        this.J = imageView3 = (ImageView)this.findViewById(e.o);
        this.K = imageView = (ImageView)this.findViewById(e.u);
        this.R = imageView4 = (ImageView)this.findViewById(e.r);
        s.E(view2, object2.f(i.O1));
        s.E(view, object2.f(i.S1));
        imageView2.setImageDrawable(object2.f(i.R1));
        imageView5.setImageDrawable(object2.f(i.L1));
        imageView3.setImageDrawable(object2.f(i.I1));
        imageView.setImageDrawable(object2.f(i.U1));
        imageView4.setImageDrawable(object2.f(i.R1));
        this.S = object2.f(i.Q1);
        Z.a((View)imageView2, this.getResources().getString(g.l));
        this.T = object2.l(i.T1, f.k);
        this.U = object2.l(i.J1, 0);
        imageView2.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView5.setOnClickListener(onClickListener);
        imageView.setOnClickListener(onClickListener);
        object.setOnClickListener(onClickListener);
        object.addTextChangedListener(this.A0);
        object.setOnEditorActionListener(onEditorActionListener);
        object.setOnItemClickListener(onItemClickListener);
        object.setOnItemSelectedListener(onItemSelectedListener);
        object.setOnKeyListener(this.w0);
        object.setOnFocusChangeListener(new View.OnFocusChangeListener(){

            public void onFocusChange(View object, boolean bl) {
                object = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = object.b0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange((View)object, bl);
                }
            }
        });
        this.setIconifiedByDefault(object2.a(i.M1, true));
        n8 = object2.e(i.F1, -1);
        if (n8 != -1) {
            this.setMaxWidth(n8);
        }
        this.a0 = object2.n(i.K1);
        this.h0 = object2.n(i.P1);
        n8 = object2.i(i.H1, -1);
        if (n8 != -1) {
            this.setImeOptions(n8);
        }
        if ((n8 = object2.i(i.G1, -1)) != -1) {
            this.setInputType(n8);
        }
        this.setFocusable(object2.a(i.E1, true));
        object2.t();
        this.V = object2 = new Intent("android.speech.action.WEB_SEARCH");
        object2.addFlags(268435456);
        object2.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.W = object2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        object2.addFlags(268435456);
        this.L = object = this.findViewById(object.getDropDownAnchor());
        if (object != null) {
            object.addOnLayoutChangeListener(new View.OnLayoutChangeListener(){

                public void onLayoutChange(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
                    SearchView.this.y();
                }
            });
        }
        this.h0(this.d0);
        this.d0();
    }

    public static boolean J(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(c.e);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(c.f);
    }

    private void setQuery(CharSequence charSequence) {
        this.D.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.D;
        int n8 = TextUtils.isEmpty((CharSequence)charSequence) ? 0 : charSequence.length();
        searchAutoComplete.setSelection(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent A(Cursor cursor, int n8, String string2) {
        String string3;
        String string4;
        String string5;
        block9 : {
            RuntimeException runtimeException2;
            block10 : {
                try {
                    string5 = string4 = S.o(cursor, "suggest_intent_action");
                    if (string4 == null) {
                        string5 = this.q0.getSuggestIntentAction();
                    }
                    break block9;
                }
                catch (RuntimeException runtimeException2) {}
                try {
                    n8 = cursor.getPosition();
                    break block10;
                }
                catch (RuntimeException runtimeException3) {}
                n8 = -1;
            }
            cursor = new StringBuilder();
            cursor.append("Search suggestions cursor at row ");
            cursor.append(n8);
            cursor.append(" returned exception.");
            Log.w((String)"SearchView", (String)cursor.toString(), (Throwable)runtimeException2);
            return null;
        }
        string4 = string5;
        if (string5 == null) {
            string4 = "android.intent.action.SEARCH";
        }
        string5 = string3 = S.o(cursor, "suggest_intent_data");
        if (string3 == null) {
            string5 = this.q0.getSuggestIntentData();
        }
        string3 = string5;
        if (string5 != null) {
            String string6 = S.o(cursor, "suggest_intent_data_id");
            string3 = string5;
            if (string6 != null) {
                string3 = new StringBuilder();
                string3.append(string5);
                string3.append("/");
                string3.append(Uri.encode((String)string6));
                string3 = string3.toString();
            }
        }
        string5 = string3 == null ? null : Uri.parse((String)string3);
        string3 = S.o(cursor, "suggest_intent_query");
        return this.z(string4, (Uri)string5, S.o(cursor, "suggest_intent_extra_data"), string3, n8, string2);
    }

    public final Intent B(Intent object, SearchableInfo searchableInfo) {
        ComponentName componentName = searchableInfo.getSearchActivity();
        Object object2 = new Intent("android.intent.action.SEARCH");
        object2.setComponent(componentName);
        PendingIntent pendingIntent = PendingIntent.getActivity((Context)this.getContext(), (int)0, (Intent)object2, (int)1073741824);
        Bundle bundle = new Bundle();
        object2 = this.r0;
        if (object2 != null) {
            bundle.putParcelable("app_data", (Parcelable)object2);
        }
        Intent intent = new Intent((Intent)object);
        Object object3 = this.getResources();
        object = searchableInfo.getVoiceLanguageModeId() != 0 ? object3.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        int n8 = searchableInfo.getVoicePromptTextId();
        Object var6_10 = null;
        object2 = n8 != 0 ? object3.getString(searchableInfo.getVoicePromptTextId()) : null;
        object3 = searchableInfo.getVoiceLanguageId() != 0 ? object3.getString(searchableInfo.getVoiceLanguageId()) : null;
        n8 = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", (String)object);
        intent.putExtra("android.speech.extra.PROMPT", (String)object2);
        intent.putExtra("android.speech.extra.LANGUAGE", (String)object3);
        intent.putExtra("android.speech.extra.MAX_RESULTS", n8);
        object = componentName == null ? var6_10 : componentName.flattenToShortString();
        intent.putExtra("calling_package", (String)object);
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pendingIntent);
        intent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent;
    }

    public final Intent C(Intent object, SearchableInfo searchableInfo) {
        Intent intent = new Intent((Intent)object);
        object = searchableInfo.getSearchActivity();
        object = object == null ? null : object.flattenToShortString();
        intent.putExtra("calling_package", (String)object);
        return intent;
    }

    public final void D() {
        this.D.dismissDropDown();
    }

    public void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            P.a(this.D);
            return;
        }
        n n8 = B0;
        n8.b(this.D);
        n8.a(this.D);
    }

    public final void F(View view, Rect rect) {
        view.getLocationInWindow(this.P);
        this.getLocationInWindow(this.Q);
        int[] arrn = this.P;
        int n8 = arrn[1];
        int[] arrn2 = this.Q;
        int n9 = arrn[0] - arrn2[0];
        rect.set(n9, n8, view.getWidth() + n9, view.getHeight() + (n8 -= arrn2[1]));
    }

    public final CharSequence G(CharSequence charSequence) {
        if (this.d0) {
            if (this.S == null) {
                return charSequence;
            }
            int n8 = (int)((double)this.D.getTextSize() * 1.25);
            this.S.setBounds(0, 0, n8, n8);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
            spannableStringBuilder.setSpan((Object)new ImageSpan(this.S), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public final boolean H() {
        boolean bl;
        SearchableInfo searchableInfo = this.q0;
        boolean bl2 = bl = false;
        if (searchableInfo != null) {
            bl2 = bl;
            if (searchableInfo.getVoiceSearchEnabled()) {
                searchableInfo = this.q0.getVoiceSearchLaunchWebSearch() ? this.V : (this.q0.getVoiceSearchLaunchRecognizer() ? this.W : null);
                bl2 = bl;
                if (searchableInfo != null) {
                    bl2 = bl;
                    if (this.getContext().getPackageManager().resolveActivity((Intent)searchableInfo, 65536) != null) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    public boolean I() {
        return this.e0;
    }

    public final boolean K() {
        if ((this.g0 || this.l0) && !this.I()) {
            return true;
        }
        return false;
    }

    public final void L(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent);
            return;
        }
        catch (RuntimeException runtimeException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed launch activity: ");
            stringBuilder.append((Object)intent);
            Log.e((String)"SearchView", (String)stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
    }

    public void M(int n8, String string2, String string3) {
        string2 = this.z("android.intent.action.SEARCH", null, null, string3, n8, string2);
        this.getContext().startActivity((Intent)string2);
    }

    public final boolean N(int n8, int n9, String string2) {
        Cursor cursor = this.f0.b();
        if (cursor != null && cursor.moveToPosition(n8)) {
            this.L(this.A(cursor, n9, string2));
            return true;
        }
        return false;
    }

    public void O() {
        if (TextUtils.isEmpty((CharSequence)this.D.getText())) {
            if (this.d0) {
                this.clearFocus();
                this.h0(true);
                return;
            }
        } else {
            this.D.setText((CharSequence)"");
            this.D.requestFocus();
            this.D.setImeVisibility(true);
        }
    }

    public boolean P(int n8, int n9, String string2) {
        this.N(n8, 0, null);
        this.D.setImeVisibility(false);
        this.D();
        return true;
    }

    public boolean Q(int n8) {
        this.Z(n8);
        return true;
    }

    public void R(CharSequence charSequence) {
        this.setQuery(charSequence);
    }

    public void S() {
        this.h0(false);
        this.D.requestFocus();
        this.D.setImeVisibility(true);
        View.OnClickListener onClickListener = this.c0;
        if (onClickListener != null) {
            onClickListener.onClick((View)this);
        }
    }

    public void T() {
        Editable editable = this.D.getText();
        if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
            if (this.q0 != null) {
                this.M(0, null, editable.toString());
            }
            this.D.setImeVisibility(false);
            this.D();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean U(View view, int n8, KeyEvent keyEvent) {
        if (this.q0 == null) {
            return false;
        }
        if (this.f0 == null) {
            return false;
        }
        if (keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) return false;
        if (n8 == 66 || n8 == 84 || n8 == 61) return this.P(this.D.getListSelection(), 0, null);
        if (n8 != 21 && n8 != 22) {
            if (n8 != 19) return false;
            this.D.getListSelection();
            return false;
        }
        n8 = n8 == 21 ? 0 : this.D.length();
        this.D.setSelection(n8);
        this.D.setListSelection(0);
        this.D.clearListSelection();
        this.D.a();
        return true;
    }

    public void V(CharSequence charSequence) {
        Editable editable = this.D.getText();
        this.n0 = editable;
        boolean bl = TextUtils.isEmpty((CharSequence)editable);
        this.g0(bl ^ true);
        this.i0(bl);
        this.b0();
        this.f0();
        this.m0 = charSequence.toString();
    }

    public void W() {
        this.h0(this.I());
        this.Y();
        if (this.D.hasFocus()) {
            this.E();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void X() {
        SearchableInfo searchableInfo = this.q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                searchableInfo = this.C(this.V, searchableInfo);
            } else {
                if (!searchableInfo.getVoiceSearchLaunchRecognizer()) return;
                searchableInfo = this.B(this.W, searchableInfo);
            }
            this.getContext().startActivity((Intent)searchableInfo);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {}
        Log.w((String)"SearchView", (String)"Could not find voice search activity");
    }

    public final void Y() {
        this.post(this.s0);
    }

    public final void Z(int n8) {
        Editable editable = this.D.getText();
        Cursor cursor = this.f0.b();
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(n8) && (cursor = this.f0.c(cursor)) != null) {
            this.setQuery((CharSequence)cursor);
            return;
        }
        this.setQuery((CharSequence)editable);
    }

    public void a0(CharSequence charSequence, boolean bl) {
        this.D.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.D;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.n0 = charSequence;
        }
        if (bl && !TextUtils.isEmpty((CharSequence)charSequence)) {
            this.T();
        }
    }

    @Override
    public void b() {
        int n8;
        if (this.o0) {
            return;
        }
        this.o0 = true;
        this.p0 = n8 = this.D.getImeOptions();
        this.D.setImeOptions(n8 | 33554432);
        this.D.setText((CharSequence)"");
        this.setIconified(false);
    }

    public final void b0() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.D.getText());
        int n8 = 1;
        boolean bl2 = bl ^ true;
        int n9 = 0;
        int n10 = n8;
        if (!bl2) {
            n10 = this.d0 && !this.o0 ? n8 : 0;
        }
        int[] arrn = this.J;
        n10 = n10 != 0 ? n9 : 8;
        arrn.setVisibility(n10);
        Drawable drawable2 = this.J.getDrawable();
        if (drawable2 != null) {
            arrn = bl2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
            drawable2.setState(arrn);
        }
    }

    @Override
    public void c() {
        this.a0("", false);
        this.clearFocus();
        this.h0(true);
        this.D.setImeOptions(this.p0);
        this.o0 = false;
    }

    public void c0() {
        int[] arrn = this.D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable drawable2 = this.F.getBackground();
        if (drawable2 != null) {
            drawable2.setState(arrn);
        }
        if ((drawable2 = this.G.getBackground()) != null) {
            drawable2.setState(arrn);
        }
        this.invalidate();
    }

    public void clearFocus() {
        this.j0 = true;
        ViewGroup.super.clearFocus();
        this.D.clearFocus();
        this.D.setImeVisibility(false);
        this.j0 = false;
    }

    public final void d0() {
        CharSequence charSequence = this.getQueryHint();
        SearchAutoComplete searchAutoComplete = this.D;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        searchAutoComplete.setHint(this.G(charSequence2));
    }

    public final void e0() {
        this.D.setThreshold(this.q0.getSuggestThreshold());
        this.D.setImeOptions(this.q0.getImeOptions());
        int n8 = this.q0.getInputType();
        int n9 = 1;
        int n10 = n8;
        if ((n8 & 15) == 1) {
            n10 = n8 &= -65537;
            if (this.q0.getSuggestAuthority() != null) {
                n10 = n8 | 589824;
            }
        }
        this.D.setInputType(n10);
        a a8 = this.f0;
        if (a8 != null) {
            a8.a(null);
        }
        if (this.q0.getSuggestAuthority() != null) {
            this.f0 = a8 = new S(this.getContext(), this, this.q0, this.u0);
            this.D.setAdapter((ListAdapter)a8);
            a8 = (S)this.f0;
            n10 = n9;
            if (this.i0) {
                n10 = 2;
            }
            a8.x(n10);
        }
    }

    public final void f0() {
        int n8 = this.K() && (this.I.getVisibility() == 0 || this.K.getVisibility() == 0) ? 0 : 8;
        this.G.setVisibility(n8);
    }

    public final void g0(boolean bl) {
        int n8 = this.g0 && this.K() && this.hasFocus() && (bl || !this.l0) ? 0 : 8;
        this.I.setVisibility(n8);
    }

    public int getImeOptions() {
        return this.D.getImeOptions();
    }

    public int getInputType() {
        return this.D.getInputType();
    }

    public int getMaxWidth() {
        return this.k0;
    }

    public CharSequence getQuery() {
        return this.D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.h0;
        if (charSequence != null) {
            return charSequence;
        }
        charSequence = this.q0;
        if (charSequence != null && charSequence.getHintId() != 0) {
            return this.getContext().getText(this.q0.getHintId());
        }
        return this.a0;
    }

    public int getSuggestionCommitIconResId() {
        return this.U;
    }

    public int getSuggestionRowLayout() {
        return this.T;
    }

    public a getSuggestionsAdapter() {
        return this.f0;
    }

    public final void h0(boolean bl) {
        this.e0 = bl;
        int n8 = 8;
        int n9 = bl ? 0 : 8;
        boolean bl2 = TextUtils.isEmpty((CharSequence)this.D.getText());
        this.H.setVisibility(n9);
        this.g0(bl2 ^ true);
        View view = this.E;
        n9 = bl ? 8 : 0;
        view.setVisibility(n9);
        n9 = n8;
        if (this.R.getDrawable() != null) {
            n9 = this.d0 ? n8 : 0;
        }
        this.R.setVisibility(n9);
        this.b0();
        this.i0(bl2);
        this.f0();
    }

    public final void i0(boolean bl) {
        int n8;
        boolean bl2 = this.l0;
        int n9 = n8 = 8;
        if (bl2) {
            n9 = n8;
            if (!this.I()) {
                n9 = n8;
                if (bl) {
                    this.I.setVisibility(8);
                    n9 = 0;
                }
            }
        }
        this.K.setVisibility(n9);
    }

    public void onDetachedFromWindow() {
        this.removeCallbacks(this.s0);
        this.post(this.t0);
        ViewGroup.super.onDetachedFromWindow();
    }

    @Override
    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (bl) {
            this.F((View)this.D, this.N);
            Object object = this.O;
            Rect rect = this.N;
            object.set(rect.left, 0, rect.right, n11 - n9);
            object = this.M;
            if (object == null) {
                this.M = object = new p(this.O, this.N, (View)this.D);
                this.setTouchDelegate((TouchDelegate)object);
                return;
            }
            object.a(this.O, this.N);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onMeasure(int n8, int n9) {
        int n10;
        block9 : {
            block10 : {
                block6 : {
                    block7 : {
                        int n11;
                        block8 : {
                            if (this.I()) {
                                super.onMeasure(n8, n9);
                                return;
                            }
                            n11 = View.MeasureSpec.getMode((int)n8);
                            n10 = View.MeasureSpec.getSize((int)n8);
                            if (n11 == Integer.MIN_VALUE) break block6;
                            if (n11 == 0) break block7;
                            if (n11 == 1073741824) break block8;
                            n8 = n10;
                            break block9;
                        }
                        n11 = this.k0;
                        n8 = n10;
                        if (n11 <= 0) break block9;
                        n8 = n11;
                        break block10;
                    }
                    n8 = this.k0;
                    if (n8 <= 0) {
                        n8 = this.getPreferredWidth();
                    }
                    break block9;
                }
                n8 = this.k0;
                if (n8 <= 0) {
                    n8 = this.getPreferredWidth();
                }
            }
            n8 = Math.min((int)n8, (int)n10);
        }
        n10 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (n10 != Integer.MIN_VALUE) {
            if (n10 == 0) {
                n9 = this.getPreferredHeight();
            }
        } else {
            n9 = Math.min((int)this.getPreferredHeight(), (int)n9);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)n9, (int)1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            ViewGroup.super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (o)parcelable;
        ViewGroup.super.onRestoreInstanceState(parcelable.a());
        this.h0(parcelable.q);
        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o o8 = new o(ViewGroup.super.onSaveInstanceState());
        o8.q = this.I();
        return o8;
    }

    public void onWindowFocusChanged(boolean bl) {
        ViewGroup.super.onWindowFocusChanged(bl);
        this.Y();
    }

    public boolean requestFocus(int n8, Rect rect) {
        if (this.j0) {
            return false;
        }
        if (!this.isFocusable()) {
            return false;
        }
        if (!this.I()) {
            boolean bl = this.D.requestFocus(n8, rect);
            if (bl) {
                this.h0(false);
            }
            return bl;
        }
        return ViewGroup.super.requestFocus(n8, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.r0 = bundle;
    }

    public void setIconified(boolean bl) {
        if (bl) {
            this.O();
            return;
        }
        this.S();
    }

    public void setIconifiedByDefault(boolean bl) {
        if (this.d0 == bl) {
            return;
        }
        this.d0 = bl;
        this.h0(bl);
        this.d0();
    }

    public void setImeOptions(int n8) {
        this.D.setImeOptions(n8);
    }

    public void setInputType(int n8) {
        this.D.setInputType(n8);
    }

    public void setMaxWidth(int n8) {
        this.k0 = n8;
        this.requestLayout();
    }

    public void setOnCloseListener(k k8) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l l8) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.c0 = onClickListener;
    }

    public void setOnSuggestionListener(m m8) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.h0 = charSequence;
        this.d0();
    }

    public void setQueryRefinementEnabled(boolean bl) {
        this.i0 = bl;
        a a8 = this.f0;
        if (a8 instanceof S) {
            a8 = (S)a8;
            int n8 = bl ? 2 : 1;
            a8.x(n8);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean bl;
        this.q0 = searchableInfo;
        if (searchableInfo != null) {
            this.e0();
            this.d0();
        }
        this.l0 = bl = this.H();
        if (bl) {
            this.D.setPrivateImeOptions("nm");
        }
        this.h0(this.I());
    }

    public void setSubmitButtonEnabled(boolean bl) {
        this.g0 = bl;
        this.h0(this.I());
    }

    public void setSuggestionsAdapter(a a8) {
        this.f0 = a8;
        this.D.setAdapter((ListAdapter)a8);
    }

    public void y() {
        if (this.L.getWidth() > 1) {
            Resources resources = this.getContext().getResources();
            int n8 = this.F.getPaddingLeft();
            Rect rect = new Rect();
            boolean bl = d0.a((View)this);
            int n9 = this.d0 ? resources.getDimensionPixelSize(c.c) + resources.getDimensionPixelSize(c.d) : 0;
            this.D.getDropDownBackground().getPadding(rect);
            int n10 = rect.left;
            n10 = bl ? - n10 : n8 - (n10 + n9);
            this.D.setDropDownHorizontalOffset(n10);
            n10 = this.L.getWidth();
            int n11 = rect.left;
            int n12 = rect.right;
            this.D.setDropDownWidth(n10 + n11 + n12 + n9 - n8);
        }
    }

    public final Intent z(String string2, Uri uri, String string3, String string4, int n8, String string5) {
        string2 = new Intent(string2);
        string2.addFlags(268435456);
        if (uri != null) {
            string2.setData(uri);
        }
        string2.putExtra("user_query", this.n0);
        if (string4 != null) {
            string2.putExtra("query", string4);
        }
        if (string3 != null) {
            string2.putExtra("intent_extra_data_key", string3);
        }
        if ((uri = this.r0) != null) {
            string2.putExtra("app_data", (Bundle)uri);
        }
        if (n8 != 0) {
            string2.putExtra("action_key", n8);
            string2.putExtra("action_msg", string5);
        }
        string2.setComponent(this.q0.getSearchActivity());
        return string2;
    }

    public static class SearchAutoComplete
    extends l.c {
        public int r;
        public SearchView s;
        public boolean t;
        public final Runnable u;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.g);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int n8) {
            super(context, attributeSet, n8);
            this.u = new Runnable(){

                public void run() {
                    SearchAutoComplete.this.c();
                }
            };
            this.r = this.getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = this.getResources().getConfiguration();
            int n8 = configuration.screenWidthDp;
            int n9 = configuration.screenHeightDp;
            if (n8 >= 960 && n9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (n8 < 600 && (n8 < 640 || n9 < 480)) {
                return 160;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                Q.a(this, 1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                    return;
                }
            } else {
                SearchView.B0.c(this);
            }
        }

        public boolean b() {
            if (TextUtils.getTrimmedLength((CharSequence)this.getText()) == 0) {
                return true;
            }
            return false;
        }

        public void c() {
            if (this.t) {
                ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
                this.t = false;
            }
        }

        public boolean enoughToFilter() {
            if (this.r > 0 && !AutoCompleteTextView.super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            editorInfo = super.onCreateInputConnection(editorInfo);
            if (this.t) {
                this.removeCallbacks(this.u);
                this.post(this.u);
            }
            return editorInfo;
        }

        public void onFinishInflate() {
            AutoCompleteTextView.super.onFinishInflate();
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            this.setMinWidth((int)TypedValue.applyDimension((int)1, (float)this.getSearchViewTextMinWidthDp(), (DisplayMetrics)displayMetrics));
        }

        public void onFocusChanged(boolean bl, int n8, Rect rect) {
            AutoCompleteTextView.super.onFocusChanged(bl, n8, rect);
            this.s.W();
        }

        public boolean onKeyPreIme(int n8, KeyEvent keyEvent) {
            if (n8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                    if (dispatcherState != null) {
                        dispatcherState.startTracking(keyEvent, (Object)this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                    if (dispatcherState != null) {
                        dispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.s.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return AutoCompleteTextView.super.onKeyPreIme(n8, keyEvent);
        }

        public void onWindowFocusChanged(boolean bl) {
            AutoCompleteTextView.super.onWindowFocusChanged(bl);
            if (bl && this.s.hasFocus() && this.getVisibility() == 0) {
                this.t = true;
                if (SearchView.J(this.getContext())) {
                    this.a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean bl) {
            InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (!bl) {
                this.t = false;
                this.removeCallbacks(this.u);
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if (inputMethodManager.isActive((View)this)) {
                this.t = false;
                this.removeCallbacks(this.u);
                inputMethodManager.showSoftInput((View)this, 0);
                return;
            }
            this.t = true;
        }

        public void setSearchView(SearchView searchView) {
            this.s = searchView;
        }

        public void setThreshold(int n8) {
            AutoCompleteTextView.super.setThreshold(n8);
            this.r = n8;
        }

    }

    public static interface k {
    }

    public static interface l {
    }

    public static interface m {
    }

    public static class n {
        public Method a;
        public Method b;
        public Method c;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public n() {
            Method method;
            this.a = null;
            this.b = null;
            this.c = null;
            n.d();
            try {
                this.a = method = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                method.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.b = method = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                method.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.c = method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                method.setAccessible(true);
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return;
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            n.d();
            Method method = this.b;
            if (method == null) return;
            try {
                method.invoke((Object)autoCompleteTextView, new Object[0]);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            n.d();
            Method method = this.a;
            if (method == null) return;
            try {
                method.invoke((Object)autoCompleteTextView, new Object[0]);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            n.d();
            Method method = this.c;
            if (method == null) return;
            try {
                method.invoke((Object)autoCompleteTextView, new Object[]{Boolean.TRUE});
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    public static class o
    extends N.a {
        public static final Parcelable.Creator<o> CREATOR = new Parcelable.ClassLoaderCreator(){

            public o a(Parcel parcel) {
                return new o(parcel, null);
            }

            public o b(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            public o[] c(int n8) {
                return new o[n8];
            }
        };
        public boolean q;

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = (Boolean)parcel.readValue(null);
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SearchView.SavedState{");
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            stringBuilder.append(" isIconified=");
            stringBuilder.append(this.q);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeValue((Object)this.q);
        }

    }

    public static class p
    extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            rect = this.d;
            int n8 = this.e;
            rect.inset(- n8, - n8);
            this.c.set(rect2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean onTouchEvent(MotionEvent var1_1) {
            block8 : {
                block6 : {
                    block7 : {
                        var4_2 = (int)var1_1.getX();
                        var5_3 = (int)var1_1.getY();
                        var3_4 = var1_1.getAction();
                        var8_5 = false;
                        var6_6 = true;
                        if (var3_4 == 0) break block6;
                        if (var3_4 == 1 || var3_4 == 2) break block7;
                        if (var3_4 != 3) ** GOTO lbl-1000
                        var6_6 = this.f;
                        this.f = false;
                        ** GOTO lbl-1000
                    }
                    var6_6 = var7_7 = this.f;
                    if (!var7_7) ** GOTO lbl-1000
                    var6_6 = var7_7;
                    if (!this.d.contains(var4_2, var5_3)) {
                        var6_6 = var7_7;
                        var3_4 = 0;
                    } else lbl-1000: // 3 sources:
                    {
                        var3_4 = 1;
                    }
                    break block8;
                }
                if (this.b.contains(var4_2, var5_3)) {
                    this.f = true;
                    var3_4 = 1;
                } else lbl-1000: // 2 sources:
                {
                    var3_4 = 1;
                    var6_6 = false;
                }
            }
            var7_7 = var8_5;
            if (var6_6 == false) return var7_7;
            if (var3_4 != 0 && !this.c.contains(var4_2, var5_3)) {
                var2_8 = this.a.getWidth() / 2;
                var3_4 = this.a.getHeight() / 2;
            } else {
                var9_9 = this.c;
                var2_8 = var4_2 - var9_9.left;
                var3_4 = var5_3 - var9_9.top;
            }
            var1_1.setLocation(var2_8, (float)var3_4);
            return this.a.dispatchTouchEvent(var1_1);
        }
    }

}

