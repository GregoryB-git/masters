package androidx.appcompat.widget;

import aa.v;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
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
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import b.a0;
import e0.d0;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.b1;
import l.c;
import l.f1;
import l.t0;
import l.z0;

public class SearchView
  extends b
  implements j.b
{
  public static final o r0;
  public final View A;
  public final ImageView B;
  public final ImageView C;
  public final ImageView D;
  public final ImageView E;
  public final View F;
  public q G;
  public Rect H = new Rect();
  public Rect I = new Rect();
  public int[] J = new int[2];
  public int[] K = new int[2];
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
  public boolean a0;
  public CharSequence b0;
  public boolean c0;
  public boolean d0;
  public int e0;
  public boolean f0;
  public String g0;
  public CharSequence h0;
  public boolean i0;
  public int j0;
  public SearchableInfo k0;
  public Bundle l0;
  public final b m0 = new b();
  public c n0 = new c();
  public final WeakHashMap<String, Drawable.ConstantState> o0 = new WeakHashMap();
  public g p0;
  public a q0;
  public final SearchAutoComplete x;
  public final View y;
  public final View z;
  
  static
  {
    o localo;
    if (Build.VERSION.SDK_INT < 29) {
      localo = new o();
    } else {
      localo = null;
    }
    r0 = localo;
  }
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130968831);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f localf = new f();
    p0 = new g();
    h localh = new h();
    i locali = new i();
    j localj = new j();
    q0 = new a();
    Object localObject1 = a0.H;
    Object localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
    z0 localz0 = new z0(paramContext, (TypedArray)localObject2);
    d0.g(this, paramContext, (int[])localObject1, paramAttributeSet, (TypedArray)localObject2, paramInt);
    LayoutInflater.from(paramContext).inflate(localz0.i(9, 2131558425), this, true);
    paramContext = (SearchAutoComplete)findViewById(2131362012);
    x = paramContext;
    paramContext.setSearchView(this);
    y = findViewById(2131362008);
    View localView1 = findViewById(2131362011);
    z = localView1;
    View localView2 = findViewById(2131362029);
    A = localView2;
    localObject1 = (ImageView)findViewById(2131362006);
    B = ((ImageView)localObject1);
    localObject2 = (ImageView)findViewById(2131362009);
    C = ((ImageView)localObject2);
    ImageView localImageView1 = (ImageView)findViewById(2131362007);
    D = localImageView1;
    paramAttributeSet = (ImageView)findViewById(2131362013);
    E = paramAttributeSet;
    ImageView localImageView2 = (ImageView)findViewById(2131362010);
    L = localImageView2;
    localView1.setBackground(localz0.e(10));
    localView2.setBackground(localz0.e(14));
    ((ImageView)localObject1).setImageDrawable(localz0.e(13));
    ((ImageView)localObject2).setImageDrawable(localz0.e(7));
    localImageView1.setImageDrawable(localz0.e(4));
    paramAttributeSet.setImageDrawable(localz0.e(16));
    localImageView2.setImageDrawable(localz0.e(13));
    M = localz0.e(12);
    b1.a((View)localObject1, getResources().getString(2131886101));
    N = localz0.i(15, 2131558424);
    O = localz0.i(5, 0);
    ((View)localObject1).setOnClickListener(localf);
    localImageView1.setOnClickListener(localf);
    ((View)localObject2).setOnClickListener(localf);
    paramAttributeSet.setOnClickListener(localf);
    paramContext.setOnClickListener(localf);
    paramContext.addTextChangedListener(q0);
    paramContext.setOnEditorActionListener(localh);
    paramContext.setOnItemClickListener(locali);
    paramContext.setOnItemSelectedListener(localj);
    paramContext.setOnKeyListener(p0);
    paramContext.setOnFocusChangeListener(new d());
    setIconifiedByDefault(localz0.a(8, true));
    paramInt = localz0.d(1, -1);
    if (paramInt != -1) {
      setMaxWidth(paramInt);
    }
    R = localz0.k(6);
    b0 = localz0.k(11);
    paramInt = localz0.h(3, -1);
    if (paramInt != -1) {
      setImeOptions(paramInt);
    }
    paramInt = localz0.h(2, -1);
    if (paramInt != -1) {
      setInputType(paramInt);
    }
    setFocusable(localz0.a(0, true));
    localz0.n();
    paramAttributeSet = new Intent("android.speech.action.WEB_SEARCH");
    P = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramAttributeSet.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    paramAttributeSet = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    Q = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramContext = findViewById(paramContext.getDropDownAnchor());
    F = paramContext;
    if (paramContext != null) {
      paramContext.addOnLayoutChangeListener(new e());
    }
    v(U);
    s();
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(2131165238);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(2131165239);
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    x.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = x;
    int i;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    localSearchAutoComplete.setSelection(i);
  }
  
  public final void clearFocus()
  {
    d0 = true;
    super.clearFocus();
    x.clearFocus();
    x.setImeVisibility(false);
    d0 = false;
  }
  
  public int getImeOptions()
  {
    return x.getImeOptions();
  }
  
  public int getInputType()
  {
    return x.getInputType();
  }
  
  public int getMaxWidth()
  {
    return e0;
  }
  
  public CharSequence getQuery()
  {
    return x.getText();
  }
  
  public CharSequence getQueryHint()
  {
    Object localObject = b0;
    if (localObject == null)
    {
      localObject = k0;
      if ((localObject != null) && (((SearchableInfo)localObject).getHintId() != 0)) {
        localObject = getContext().getText(k0.getHintId());
      } else {
        localObject = R;
      }
    }
    return (CharSequence)localObject;
  }
  
  public int getSuggestionCommitIconResId()
  {
    return O;
  }
  
  public int getSuggestionRowLayout()
  {
    return N;
  }
  
  public m0.a getSuggestionsAdapter()
  {
    return W;
  }
  
  public final Intent i(String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", h0);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    paramUri = l0;
    if (paramUri != null) {
      paramString1.putExtra("app_data", paramUri);
    }
    paramString1.setComponent(k0.getSearchActivity());
    return paramString1;
  }
  
  public final Intent j(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new Intent("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(getContext(), 0, (Intent)localObject1, 1107296256);
    Bundle localBundle = new Bundle();
    localObject1 = l0;
    if (localObject1 != null) {
      localBundle.putParcelable("app_data", (Parcelable)localObject1);
    }
    Intent localIntent = new Intent(paramIntent);
    int i = 1;
    Object localObject2 = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      paramIntent = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      paramIntent = "free_form";
    }
    int j = paramSearchableInfo.getVoicePromptTextId();
    Object localObject3 = null;
    if (j != 0) {
      localObject1 = ((Resources)localObject2).getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      localObject1 = null;
    }
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      localObject2 = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      localObject2 = null;
    }
    if (paramSearchableInfo.getVoiceMaxResults() != 0) {
      i = paramSearchableInfo.getVoiceMaxResults();
    }
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", paramIntent);
    localIntent.putExtra("android.speech.extra.PROMPT", (String)localObject1);
    localIntent.putExtra("android.speech.extra.LANGUAGE", (String)localObject2);
    localIntent.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (localComponentName == null) {
      paramIntent = (Intent)localObject3;
    } else {
      paramIntent = localComponentName.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
    return localIntent;
  }
  
  public final void k()
  {
    Object localObject;
    SearchAutoComplete localSearchAutoComplete;
    if (Build.VERSION.SDK_INT >= 29)
    {
      k.a(x);
    }
    else
    {
      localObject = r0;
      localSearchAutoComplete = x;
      localObject.getClass();
      o.a();
      localObject = a;
      if (localObject == null) {}
    }
    try
    {
      ((Method)localObject).invoke(localSearchAutoComplete, new Object[0]);
      localObject = r0;
      localSearchAutoComplete = x;
      localObject.getClass();
      o.a();
      localObject = b;
      if (localObject == null) {}
    }
    catch (Exception localException1)
    {
      try
      {
        ((Method)localObject).invoke(localSearchAutoComplete, new Object[0]);
        return;
        localException1 = localException1;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  public final void l()
  {
    if (TextUtils.isEmpty(x.getText()))
    {
      if (U)
      {
        clearFocus();
        v(true);
      }
    }
    else
    {
      x.setText("");
      x.requestFocus();
      x.setImeVisibility(true);
    }
  }
  
  public final boolean m(int paramInt)
  {
    Cursor localCursor = W.c;
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt)))
    {
      Object localObject1 = null;
      StringBuilder localStringBuilder;
      Object localObject4;
      try
      {
        paramInt = t0.F;
        Object localObject2 = t0.i(localCursor.getColumnIndex("suggest_intent_action"), localCursor);
        Object localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = k0.getSuggestIntentAction();
        }
        localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = "android.intent.action.SEARCH";
        }
        Object localObject5 = t0.i(localCursor.getColumnIndex("suggest_intent_data"), localCursor);
        localObject3 = localObject5;
        if (localObject5 == null) {
          localObject3 = k0.getSuggestIntentData();
        }
        localObject5 = localObject3;
        if (localObject3 != null)
        {
          String str = t0.i(localCursor.getColumnIndex("suggest_intent_data_id"), localCursor);
          localObject5 = localObject3;
          if (str != null)
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            ((StringBuilder)localObject5).append((String)localObject3);
            ((StringBuilder)localObject5).append("/");
            ((StringBuilder)localObject5).append(Uri.encode(str));
            localObject5 = ((StringBuilder)localObject5).toString();
          }
        }
        if (localObject5 == null) {
          localObject3 = null;
        } else {
          localObject3 = Uri.parse((String)localObject5);
        }
        localObject5 = t0.i(localCursor.getColumnIndex("suggest_intent_query"), localCursor);
        localObject3 = i((String)localObject2, (Uri)localObject3, t0.i(localCursor.getColumnIndex("suggest_intent_extra_data"), localCursor), (String)localObject5);
      }
      catch (RuntimeException localRuntimeException2)
      {
        try
        {
          paramInt = localCursor.getPosition();
        }
        catch (RuntimeException localRuntimeException1)
        {
          paramInt = -1;
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Search suggestions cursor at row ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(" returned exception.");
        Log.w("SearchView", localStringBuilder.toString(), localRuntimeException2);
        localObject4 = localObject1;
      }
      if (localObject4 != null) {
        try
        {
          getContext().startActivity((Intent)localObject4);
        }
        catch (RuntimeException localRuntimeException3)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed launch activity: ");
          localStringBuilder.append(localObject4);
          Log.e("SearchView", localStringBuilder.toString(), localRuntimeException3);
        }
      }
    }
    x.setImeVisibility(false);
    x.dismissDropDown();
    return true;
  }
  
  public final void n(int paramInt)
  {
    Editable localEditable = x.getText();
    Object localObject = W.c;
    if (localObject != null)
    {
      if (((Cursor)localObject).moveToPosition(paramInt))
      {
        localObject = W.d((Cursor)localObject);
        if (localObject != null)
        {
          setQuery((CharSequence)localObject);
          return;
        }
      }
      setQuery(localEditable);
    }
  }
  
  public final void o(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public final void onActionViewCollapsed()
  {
    x.setText("");
    SearchAutoComplete localSearchAutoComplete = x;
    localSearchAutoComplete.setSelection(localSearchAutoComplete.length());
    h0 = "";
    clearFocus();
    v(true);
    x.setImeOptions(j0);
    i0 = false;
  }
  
  public final void onActionViewExpanded()
  {
    if (i0) {
      return;
    }
    i0 = true;
    int i = x.getImeOptions();
    j0 = i;
    x.setImeOptions(i | 0x2000000);
    x.setText("");
    setIconified(false);
  }
  
  public final void onDetachedFromWindow()
  {
    removeCallbacks(m0);
    post(n0);
    super.onDetachedFromWindow();
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      SearchAutoComplete localSearchAutoComplete = x;
      Rect localRect = H;
      localSearchAutoComplete.getLocationInWindow(J);
      getLocationInWindow(K);
      Object localObject1 = J;
      paramInt1 = localObject1[1];
      Object localObject2 = K;
      paramInt3 = paramInt1 - localObject2[1];
      paramInt1 = localObject1[0] - localObject2[0];
      localRect.set(paramInt1, paramInt3, localSearchAutoComplete.getWidth() + paramInt1, localSearchAutoComplete.getHeight() + paramInt3);
      localObject1 = I;
      localObject2 = H;
      ((Rect)localObject1).set(left, 0, right, paramInt4 - paramInt2);
      localObject2 = G;
      if (localObject2 == null)
      {
        localObject2 = new q(I, H, x);
        G = ((q)localObject2);
        setTouchDelegate((TouchDelegate)localObject2);
      }
      else
      {
        localRect = I;
        localObject1 = H;
        b.set(localRect);
        d.set(localRect);
        localRect = d;
        paramInt1 = -e;
        localRect.inset(paramInt1, paramInt1);
        c.set((Rect)localObject1);
      }
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    if (V)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE)
    {
      if (i != 0)
      {
        if (i != 1073741824)
        {
          paramInt1 = j;
          break label110;
        }
        i = e0;
        paramInt1 = j;
        if (i <= 0) {
          break label110;
        }
        paramInt1 = i;
      }
      else
      {
        paramInt1 = e0;
        if (paramInt1 > 0) {
          break label110;
        }
        paramInt1 = getPreferredWidth();
        break label110;
      }
    }
    else
    {
      paramInt1 = e0;
      if (paramInt1 > 0) {
        break label103;
      }
    }
    paramInt1 = getPreferredWidth();
    label103:
    paramInt1 = Math.min(paramInt1, j);
    label110:
    j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (j != Integer.MIN_VALUE)
    {
      if (j == 0) {
        paramInt2 = getPreferredHeight();
      }
    }
    else {
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof p))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (p)paramParcelable;
    super.onRestoreInstanceState(a);
    v(c);
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState()
  {
    p localp = new p(super.onSaveInstanceState());
    c = V;
    return localp;
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    post(m0);
  }
  
  public final void p()
  {
    Object localObject = x.getText();
    if ((localObject != null) && (TextUtils.getTrimmedLength((CharSequence)localObject) > 0))
    {
      if (k0 != null)
      {
        localObject = i("android.intent.action.SEARCH", null, null, ((CharSequence)localObject).toString());
        getContext().startActivity((Intent)localObject);
      }
      x.setImeVisibility(false);
      x.dismissDropDown();
    }
  }
  
  public final void q()
  {
    boolean bool = TextUtils.isEmpty(x.getText());
    int i = 1;
    int j = bool ^ true;
    int k = 0;
    int m = i;
    if (j == 0) {
      if ((U) && (!i0)) {
        m = i;
      } else {
        m = 0;
      }
    }
    Object localObject = D;
    if (m != 0) {
      m = k;
    } else {
      m = 8;
    }
    ((ImageView)localObject).setVisibility(m);
    Drawable localDrawable = D.getDrawable();
    if (localDrawable != null)
    {
      if (j != 0) {
        localObject = ViewGroup.ENABLED_STATE_SET;
      } else {
        localObject = ViewGroup.EMPTY_STATE_SET;
      }
      localDrawable.setState((int[])localObject);
    }
  }
  
  public final void r()
  {
    int[] arrayOfInt;
    if (x.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    }
    Drawable localDrawable = z.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    localDrawable = A.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public final boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (d0) {
      return false;
    }
    if (!isFocusable()) {
      return false;
    }
    if (!V)
    {
      boolean bool = x.requestFocus(paramInt, paramRect);
      if (bool) {
        v(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public final void s()
  {
    Object localObject1 = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = x;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "";
    }
    localObject1 = localObject2;
    if (U) {
      if (M == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        int i = (int)(localSearchAutoComplete.getTextSize() * 1.25D);
        M.setBounds(0, 0, i, i);
        localObject1 = new SpannableStringBuilder("   ");
        ((SpannableStringBuilder)localObject1).setSpan(new ImageSpan(M), 1, 2, 33);
        ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
      }
    }
    localSearchAutoComplete.setHint((CharSequence)localObject1);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    l0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      l();
    }
    else
    {
      v(false);
      x.requestFocus();
      x.setImeVisibility(true);
      View.OnClickListener localOnClickListener = T;
      if (localOnClickListener != null) {
        localOnClickListener.onClick(this);
      }
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (U == paramBoolean) {
      return;
    }
    U = paramBoolean;
    v(paramBoolean);
    s();
  }
  
  public void setImeOptions(int paramInt)
  {
    x.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    x.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    e0 = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(l paraml) {}
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    S = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(m paramm) {}
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    T = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(n paramn) {}
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    b0 = paramCharSequence;
    s();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    c0 = paramBoolean;
    Object localObject = W;
    if ((localObject instanceof t0))
    {
      localObject = (t0)localObject;
      int i;
      if (paramBoolean) {
        i = 2;
      } else {
        i = 1;
      }
      x = i;
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    k0 = paramSearchableInfo;
    boolean bool = true;
    Object localObject = null;
    if (paramSearchableInfo != null)
    {
      x.setThreshold(paramSearchableInfo.getSuggestThreshold());
      x.setImeOptions(k0.getImeOptions());
      int i = k0.getInputType();
      int j = i;
      if ((i & 0xF) == 1)
      {
        i &= 0xFFFEFFFF;
        j = i;
        if (k0.getSuggestAuthority() != null) {
          j = i | 0x10000 | 0x80000;
        }
      }
      x.setInputType(j);
      paramSearchableInfo = W;
      if (paramSearchableInfo != null) {
        paramSearchableInfo.c(null);
      }
      if (k0.getSuggestAuthority() != null)
      {
        paramSearchableInfo = new t0(getContext(), this, k0, o0);
        W = paramSearchableInfo;
        x.setAdapter(paramSearchableInfo);
        paramSearchableInfo = (t0)W;
        if (c0) {
          j = 2;
        } else {
          j = 1;
        }
        x = j;
      }
      s();
    }
    paramSearchableInfo = k0;
    if ((paramSearchableInfo != null) && (paramSearchableInfo.getVoiceSearchEnabled()))
    {
      if (k0.getVoiceSearchLaunchWebSearch())
      {
        paramSearchableInfo = P;
      }
      else
      {
        paramSearchableInfo = (SearchableInfo)localObject;
        if (k0.getVoiceSearchLaunchRecognizer()) {
          paramSearchableInfo = Q;
        }
      }
      if ((paramSearchableInfo != null) && (getContext().getPackageManager().resolveActivity(paramSearchableInfo, 65536) != null)) {}
    }
    else
    {
      bool = false;
    }
    f0 = bool;
    if (bool) {
      x.setPrivateImeOptions("nm");
    }
    v(V);
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    a0 = paramBoolean;
    v(V);
  }
  
  public void setSuggestionsAdapter(m0.a parama)
  {
    W = parama;
    x.setAdapter(parama);
  }
  
  public final void t()
  {
    boolean bool = a0;
    int i = 0;
    if (((bool) || (f0)) && (!V)) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      j = i;
      if (C.getVisibility() == 0) {
        break label66;
      }
      if (E.getVisibility() == 0)
      {
        j = i;
        break label66;
      }
    }
    int j = 8;
    label66:
    A.setVisibility(j);
  }
  
  public final void u(boolean paramBoolean)
  {
    boolean bool = a0;
    int i = 0;
    if (bool)
    {
      if (((bool) || (f0)) && (!V)) {
        j = 1;
      } else {
        j = 0;
      }
      if ((j != 0) && (hasFocus()))
      {
        j = i;
        if (paramBoolean) {
          break label74;
        }
        if (!f0)
        {
          j = i;
          break label74;
        }
      }
    }
    int j = 8;
    label74:
    C.setVisibility(j);
  }
  
  public final void v(boolean paramBoolean)
  {
    V = paramBoolean;
    int i = 8;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 8;
    }
    boolean bool = TextUtils.isEmpty(x.getText()) ^ true;
    B.setVisibility(j);
    u(bool);
    View localView = y;
    if (paramBoolean) {
      j = 8;
    } else {
      j = 0;
    }
    localView.setVisibility(j);
    if ((L.getDrawable() != null) && (!U)) {
      j = 0;
    } else {
      j = 8;
    }
    L.setVisibility(j);
    q();
    int j = i;
    if (f0)
    {
      j = i;
      if (!V)
      {
        j = i;
        if ((bool ^ true))
        {
          C.setVisibility(8);
          j = 0;
        }
      }
    }
    E.setVisibility(j);
    t();
  }
  
  public static class SearchAutoComplete
    extends c
  {
    public int e = getThreshold();
    public SearchView f;
    public boolean o;
    public final a p = new a();
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet, 0);
    }
    
    private int getSearchViewTextMinWidthDp()
    {
      Configuration localConfiguration = getResources().getConfiguration();
      int i = screenWidthDp;
      int j = screenHeightDp;
      if ((i >= 960) && (j >= 720) && (orientation == 2)) {
        return 256;
      }
      if ((i < 600) && ((i < 640) || (j < 480))) {
        return 160;
      }
      return 192;
    }
    
    public final void a()
    {
      Object localObject;
      if (Build.VERSION.SDK_INT >= 29)
      {
        SearchView.k.b(this, 1);
        if (enoughToFilter()) {
          showDropDown();
        }
      }
      else
      {
        localObject = SearchView.r0;
        localObject.getClass();
        SearchView.o.a();
        localObject = c;
        if (localObject == null) {}
      }
      try
      {
        ((Method)localObject).invoke(this, new Object[] { Boolean.TRUE });
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
    
    public final boolean enoughToFilter()
    {
      boolean bool;
      if ((e > 0) && (!super.enoughToFilter())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
    {
      paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
      if (o)
      {
        removeCallbacks(p);
        post(p);
      }
      return paramEditorInfo;
    }
    
    public final void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      paramRect = f;
      paramRect.v(V);
      paramRect.post(m0);
      if (x.hasFocus()) {
        paramRect.k();
      }
    }
    
    public final boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            f.clearFocus();
            setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public final void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (f.hasFocus()) && (getVisibility() == 0))
      {
        int i = 1;
        o = true;
        Context localContext = getContext();
        SearchView.o localo = SearchView.r0;
        if (getResourcesgetConfigurationorientation != 2) {
          i = 0;
        }
        if (i != 0) {
          a();
        }
      }
    }
    
    public final void performCompletion() {}
    
    public final void replaceText(CharSequence paramCharSequence) {}
    
    public void setImeVisibility(boolean paramBoolean)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!paramBoolean)
      {
        o = false;
        removeCallbacks(p);
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      }
      if (localInputMethodManager.isActive(this))
      {
        o = false;
        removeCallbacks(p);
        localInputMethodManager.showSoftInput(this, 0);
        return;
      }
      o = true;
    }
    
    public void setSearchView(SearchView paramSearchView)
    {
      f = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      e = paramInt;
    }
    
    public final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        SearchView.SearchAutoComplete localSearchAutoComplete = SearchView.SearchAutoComplete.this;
        if (o)
        {
          ((InputMethodManager)localSearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(localSearchAutoComplete, 0);
          o = false;
        }
      }
    }
  }
  
  public final class a
    implements TextWatcher
  {
    public a() {}
    
    public final void afterTextChanged(Editable paramEditable) {}
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      SearchView localSearchView = SearchView.this;
      Editable localEditable = x.getText();
      h0 = localEditable;
      boolean bool1 = TextUtils.isEmpty(localEditable) ^ true;
      localSearchView.u(bool1);
      boolean bool2 = f0;
      paramInt2 = 8;
      paramInt1 = paramInt2;
      if (bool2)
      {
        paramInt1 = paramInt2;
        if (!V)
        {
          paramInt1 = paramInt2;
          if ((bool1 ^ true))
          {
            C.setVisibility(8);
            paramInt1 = 0;
          }
        }
      }
      E.setVisibility(paramInt1);
      localSearchView.q();
      localSearchView.t();
      localSearchView.getClass();
      g0 = paramCharSequence.toString();
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      r();
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      m0.a locala = W;
      if ((locala instanceof t0)) {
        locala.c(null);
      }
    }
  }
  
  public final class d
    implements View.OnFocusChangeListener
  {
    public d() {}
    
    public final void onFocusChange(View paramView, boolean paramBoolean)
    {
      SearchView localSearchView = SearchView.this;
      paramView = S;
      if (paramView != null) {
        paramView.onFocusChange(localSearchView, paramBoolean);
      }
    }
  }
  
  public final class e
    implements View.OnLayoutChangeListener
  {
    public e() {}
    
    public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
    {
      SearchView localSearchView = SearchView.this;
      if (F.getWidth() > 1)
      {
        paramView = localSearchView.getContext().getResources();
        paramInt3 = z.getPaddingLeft();
        Rect localRect = new Rect();
        boolean bool = f1.a(localSearchView);
        if (U)
        {
          paramInt1 = paramView.getDimensionPixelSize(2131165225);
          paramInt1 = paramView.getDimensionPixelSize(2131165226) + paramInt1;
        }
        else
        {
          paramInt1 = 0;
        }
        x.getDropDownBackground().getPadding(localRect);
        if (bool) {
          paramInt2 = -left;
        } else {
          paramInt2 = paramInt3 - (left + paramInt1);
        }
        x.setDropDownHorizontalOffset(paramInt2);
        paramInt5 = F.getWidth();
        paramInt4 = left;
        paramInt2 = right;
        x.setDropDownWidth(paramInt5 + paramInt4 + paramInt2 + paramInt1 - paramInt3);
      }
    }
  }
  
  public final class f
    implements View.OnClickListener
  {
    public f() {}
    
    public final void onClick(View paramView)
    {
      SearchView localSearchView = SearchView.this;
      if (paramView == B)
      {
        localSearchView.v(false);
        x.requestFocus();
        x.setImeVisibility(true);
        paramView = T;
        if (paramView != null) {
          paramView.onClick(localSearchView);
        }
      }
      else if (paramView == D)
      {
        localSearchView.l();
      }
      else if (paramView == C)
      {
        localSearchView.p();
      }
      else if (paramView == E)
      {
        SearchableInfo localSearchableInfo = k0;
        if (localSearchableInfo != null) {
          try
          {
            if (localSearchableInfo.getVoiceSearchLaunchWebSearch())
            {
              paramView = P;
              Intent localIntent = new android/content/Intent;
              localIntent.<init>(paramView);
              paramView = localSearchableInfo.getSearchActivity();
              if (paramView == null) {
                paramView = null;
              } else {
                paramView = paramView.flattenToShortString();
              }
              localIntent.putExtra("calling_package", paramView);
              localSearchView.getContext().startActivity(localIntent);
            }
            else if (localSearchableInfo.getVoiceSearchLaunchRecognizer())
            {
              paramView = localSearchView.j(Q, localSearchableInfo);
              localSearchView.getContext().startActivity(paramView);
            }
          }
          catch (ActivityNotFoundException paramView)
          {
            Log.w("SearchView", "Could not find voice search activity");
          }
        }
      }
      else if (paramView == x)
      {
        localSearchView.k();
      }
    }
  }
  
  public final class g
    implements View.OnKeyListener
  {
    public g() {}
    
    public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
    {
      SearchView localSearchView = SearchView.this;
      SearchableInfo localSearchableInfo = k0;
      boolean bool1 = false;
      if (localSearchableInfo == null) {
        return false;
      }
      if ((x.isPopupShowing()) && (x.getListSelection() != -1))
      {
        paramView = SearchView.this;
        boolean bool2;
        if (k0 == null)
        {
          bool2 = bool1;
        }
        else if (W == null)
        {
          bool2 = bool1;
        }
        else
        {
          bool2 = bool1;
          if (paramKeyEvent.getAction() == 0)
          {
            bool2 = bool1;
            if (paramKeyEvent.hasNoModifiers()) {
              if ((paramInt != 66) && (paramInt != 84) && (paramInt != 61))
              {
                if ((paramInt != 21) && (paramInt != 22))
                {
                  bool2 = bool1;
                  if (paramInt == 19)
                  {
                    x.getListSelection();
                    bool2 = bool1;
                  }
                }
                else
                {
                  if (paramInt == 21) {
                    paramInt = 0;
                  } else {
                    paramInt = x.length();
                  }
                  x.setSelection(paramInt);
                  x.setListSelection(0);
                  x.clearListSelection();
                  x.a();
                  bool2 = true;
                }
              }
              else {
                bool2 = paramView.m(x.getListSelection());
              }
            }
          }
        }
        return bool2;
      }
      int i;
      if (TextUtils.getTrimmedLength(x.getText()) == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i == 0) && (paramKeyEvent.hasNoModifiers()) && (paramKeyEvent.getAction() == 1) && (paramInt == 66))
      {
        paramView.cancelLongPress();
        paramView = SearchView.this;
        paramKeyEvent = paramView.i("android.intent.action.SEARCH", null, null, x.getText().toString());
        paramView.getContext().startActivity(paramKeyEvent);
        return true;
      }
      return false;
    }
  }
  
  public final class h
    implements TextView.OnEditorActionListener
  {
    public h() {}
    
    public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
    {
      p();
      return true;
    }
  }
  
  public final class i
    implements AdapterView.OnItemClickListener
  {
    public i() {}
    
    public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      m(paramInt);
    }
  }
  
  public final class j
    implements AdapterView.OnItemSelectedListener
  {
    public j() {}
    
    public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      n(paramInt);
    }
    
    public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  }
  
  public static final class k
  {
    public static void a(AutoCompleteTextView paramAutoCompleteTextView)
    {
      v.o(paramAutoCompleteTextView);
    }
    
    public static void b(SearchView.SearchAutoComplete paramSearchAutoComplete, int paramInt)
    {
      paramSearchAutoComplete.setInputMethodMode(paramInt);
    }
  }
  
  public static abstract interface l
  {
    public abstract boolean onClose();
  }
  
  public static abstract interface m
  {
    public abstract boolean a();
    
    public abstract boolean b();
  }
  
  public static abstract interface n
  {
    public abstract boolean a();
    
    public abstract boolean b();
  }
  
  public static final class o
  {
    public Method a = null;
    public Method b = null;
    public Method c = null;
    
    public o()
    {
      a();
      try
      {
        localMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        a = localMethod;
        localMethod.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          localMethod = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          b = localMethod;
          localMethod.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          try
          {
            for (;;)
            {
              Method localMethod = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
              c = localMethod;
              localMethod.setAccessible(true);
              return;
              localNoSuchMethodException1 = localNoSuchMethodException1;
              continue;
              localNoSuchMethodException2 = localNoSuchMethodException2;
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            for (;;) {}
          }
        }
      }
    }
    
    public static void a()
    {
      if (Build.VERSION.SDK_INT < 29) {
        return;
      }
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
  }
  
  public static final class p
    extends n0.a
  {
    public static final Parcelable.Creator<p> CREATOR = new a();
    public boolean c;
    
    public p(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      c = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    public p(Parcelable paramParcelable)
    {
      super();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("SearchView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" isIconified=");
      localStringBuilder.append(c);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable(a, paramInt);
      paramParcel.writeValue(Boolean.valueOf(c));
    }
    
    public final class a
      implements Parcelable.ClassLoaderCreator<SearchView.p>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new SearchView.p(paramParcel, null);
      }
      
      public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new SearchView.p(paramParcel, paramClassLoader);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new SearchView.p[paramInt];
      }
    }
  }
  
  public static final class q
    extends TouchDelegate
  {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;
    
    public q(Rect paramRect1, Rect paramRect2, SearchView.SearchAutoComplete paramSearchAutoComplete)
    {
      super(paramSearchAutoComplete);
      int i = ViewConfiguration.get(paramSearchAutoComplete.getContext()).getScaledTouchSlop();
      e = i;
      Rect localRect1 = new Rect();
      b = localRect1;
      Rect localRect2 = new Rect();
      d = localRect2;
      Rect localRect3 = new Rect();
      c = localRect3;
      localRect1.set(paramRect1);
      localRect2.set(paramRect1);
      i = -i;
      localRect2.inset(i, i);
      localRect3.set(paramRect2);
      a = paramSearchAutoComplete;
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k = paramMotionEvent.getAction();
      boolean bool1 = true;
      boolean bool2 = false;
      if (k != 0)
      {
        if ((k != 1) && (k != 2))
        {
          if (k != 3) {
            break label134;
          }
          bool1 = f;
          f = false;
        }
        else
        {
          bool3 = f;
          bool1 = bool3;
          if (bool3)
          {
            bool1 = bool3;
            if (!d.contains(i, j))
            {
              bool1 = bool3;
              k = 0;
              break label140;
            }
          }
        }
        k = 1;
        break label140;
      }
      else if (b.contains(i, j))
      {
        f = true;
        k = 1;
        break label140;
      }
      label134:
      k = 1;
      bool1 = false;
      label140:
      boolean bool3 = bool2;
      if (bool1)
      {
        float f1;
        if ((k != 0) && (!c.contains(i, j)))
        {
          f1 = a.getWidth() / 2;
          k = a.getHeight() / 2;
        }
        else
        {
          Rect localRect = c;
          f1 = i - left;
          k = j - top;
        }
        paramMotionEvent.setLocation(f1, k);
        bool3 = a.dispatchTouchEvent(paramMotionEvent);
      }
      return bool3;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */