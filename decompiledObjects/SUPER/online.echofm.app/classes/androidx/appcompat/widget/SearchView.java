package androidx.appcompat.widget;

import I.s;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.NonNull;
import e.e;
import e.f;
import e.g;
import e.i;
import java.lang.reflect.AccessibleObject;
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
  implements j.b
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
  public final Runnable s0 = new b();
  public Runnable t0 = new c();
  public final WeakHashMap u0 = new WeakHashMap();
  public final View.OnClickListener v0;
  public View.OnKeyListener w0;
  public final TextView.OnEditorActionListener x0;
  public final AdapterView.OnItemClickListener y0;
  public final AdapterView.OnItemSelectedListener z0;
  
  static
  {
    n localn;
    if (Build.VERSION.SDK_INT < 29) {
      localn = new n();
    } else {
      localn = null;
    }
    B0 = localn;
  }
  
  public SearchView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, e.a.p);
  }
  
  public SearchView(@NonNull Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f localf = new f();
    v0 = localf;
    w0 = new g();
    h localh = new h();
    x0 = localh;
    i locali = new i();
    y0 = locali;
    j localj = new j();
    z0 = localj;
    A0 = new a();
    paramAttributeSet = X.s(paramContext, paramAttributeSet, i.D1, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(paramAttributeSet.l(i.N1, f.l), this, true);
    paramContext = (SearchAutoComplete)findViewById(e.t);
    D = paramContext;
    paramContext.setSearchView(this);
    E = findViewById(e.p);
    View localView1 = findViewById(e.s);
    F = localView1;
    View localView2 = findViewById(e.z);
    G = localView2;
    ImageView localImageView1 = (ImageView)findViewById(e.n);
    H = localImageView1;
    ImageView localImageView2 = (ImageView)findViewById(e.q);
    I = localImageView2;
    ImageView localImageView3 = (ImageView)findViewById(e.o);
    J = localImageView3;
    ImageView localImageView4 = (ImageView)findViewById(e.u);
    K = localImageView4;
    ImageView localImageView5 = (ImageView)findViewById(e.r);
    R = localImageView5;
    s.E(localView1, paramAttributeSet.f(i.O1));
    s.E(localView2, paramAttributeSet.f(i.S1));
    localImageView1.setImageDrawable(paramAttributeSet.f(i.R1));
    localImageView2.setImageDrawable(paramAttributeSet.f(i.L1));
    localImageView3.setImageDrawable(paramAttributeSet.f(i.I1));
    localImageView4.setImageDrawable(paramAttributeSet.f(i.U1));
    localImageView5.setImageDrawable(paramAttributeSet.f(i.R1));
    S = paramAttributeSet.f(i.Q1);
    Z.a(localImageView1, getResources().getString(g.l));
    T = paramAttributeSet.l(i.T1, f.k);
    U = paramAttributeSet.l(i.J1, 0);
    localImageView1.setOnClickListener(localf);
    localImageView3.setOnClickListener(localf);
    localImageView2.setOnClickListener(localf);
    localImageView4.setOnClickListener(localf);
    paramContext.setOnClickListener(localf);
    paramContext.addTextChangedListener(A0);
    paramContext.setOnEditorActionListener(localh);
    paramContext.setOnItemClickListener(locali);
    paramContext.setOnItemSelectedListener(localj);
    paramContext.setOnKeyListener(w0);
    paramContext.setOnFocusChangeListener(new d());
    setIconifiedByDefault(paramAttributeSet.a(i.M1, true));
    paramInt = paramAttributeSet.e(i.F1, -1);
    if (paramInt != -1) {
      setMaxWidth(paramInt);
    }
    a0 = paramAttributeSet.n(i.K1);
    h0 = paramAttributeSet.n(i.P1);
    paramInt = paramAttributeSet.i(i.H1, -1);
    if (paramInt != -1) {
      setImeOptions(paramInt);
    }
    paramInt = paramAttributeSet.i(i.G1, -1);
    if (paramInt != -1) {
      setInputType(paramInt);
    }
    setFocusable(paramAttributeSet.a(i.E1, true));
    paramAttributeSet.t();
    paramAttributeSet = new Intent("android.speech.action.WEB_SEARCH");
    V = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramAttributeSet.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    paramAttributeSet = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    W = paramAttributeSet;
    paramAttributeSet.addFlags(268435456);
    paramContext = findViewById(paramContext.getDropDownAnchor());
    L = paramContext;
    if (paramContext != null) {
      paramContext.addOnLayoutChangeListener(new e());
    }
    h0(d0);
    d0();
  }
  
  public static boolean J(Context paramContext)
  {
    boolean bool;
    if (getResourcesgetConfigurationorientation == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(e.c.e);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(e.c.f);
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    D.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = D;
    int i;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    localSearchAutoComplete.setSelection(i);
  }
  
  public final Intent A(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      localObject1 = S.o(paramCursor, "suggest_intent_action");
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = q0.getSuggestIntentAction();
      }
    }
    catch (RuntimeException paramString)
    {
      break label196;
    }
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "android.intent.action.SEARCH";
    }
    Object localObject3 = S.o(paramCursor, "suggest_intent_data");
    Object localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = q0.getSuggestIntentData();
    }
    localObject3 = localObject2;
    if (localObject2 != null)
    {
      String str = S.o(paramCursor, "suggest_intent_data_id");
      localObject3 = localObject2;
      if (str != null)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append((String)localObject2);
        ((StringBuilder)localObject3).append("/");
        ((StringBuilder)localObject3).append(Uri.encode(str));
        localObject3 = ((StringBuilder)localObject3).toString();
      }
    }
    if (localObject3 == null) {
      localObject2 = null;
    } else {
      localObject2 = Uri.parse((String)localObject3);
    }
    localObject3 = S.o(paramCursor, "suggest_intent_query");
    paramString = z((String)localObject1, (Uri)localObject2, S.o(paramCursor, "suggest_intent_extra_data"), (String)localObject3, paramInt, paramString);
    return paramString;
    try
    {
      label196:
      paramInt = paramCursor.getPosition();
    }
    catch (RuntimeException paramCursor)
    {
      paramInt = -1;
    }
    paramCursor = new StringBuilder();
    paramCursor.append("Search suggestions cursor at row ");
    paramCursor.append(paramInt);
    paramCursor.append(" returned exception.");
    Log.w("SearchView", paramCursor.toString(), paramString);
    return null;
  }
  
  public final Intent B(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new Intent("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(getContext(), 0, (Intent)localObject1, 1073741824);
    Bundle localBundle = new Bundle();
    localObject1 = r0;
    if (localObject1 != null) {
      localBundle.putParcelable("app_data", (Parcelable)localObject1);
    }
    Intent localIntent = new Intent(paramIntent);
    Object localObject2 = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      paramIntent = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      paramIntent = "free_form";
    }
    int i = paramSearchableInfo.getVoicePromptTextId();
    Object localObject3 = null;
    if (i != 0) {
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
    } else {
      i = 1;
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
  
  public final Intent C(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    paramIntent = paramSearchableInfo.getSearchActivity();
    if (paramIntent == null) {
      paramIntent = null;
    } else {
      paramIntent = paramIntent.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    return localIntent;
  }
  
  public final void D()
  {
    D.dismissDropDown();
  }
  
  public void E()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      P.a(D);
    }
    else
    {
      n localn = B0;
      localn.b(D);
      localn.a(D);
    }
  }
  
  public final void F(View paramView, Rect paramRect)
  {
    paramView.getLocationInWindow(P);
    getLocationInWindow(Q);
    int[] arrayOfInt1 = P;
    int i = arrayOfInt1[1];
    int[] arrayOfInt2 = Q;
    int j = i - arrayOfInt2[1];
    i = arrayOfInt1[0] - arrayOfInt2[0];
    paramRect.set(i, j, paramView.getWidth() + i, paramView.getHeight() + j);
  }
  
  public final CharSequence G(CharSequence paramCharSequence)
  {
    if ((d0) && (S != null))
    {
      int i = (int)(D.getTextSize() * 1.25D);
      S.setBounds(0, 0, i, i);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
      localSpannableStringBuilder.setSpan(new ImageSpan(S), 1, 2, 33);
      localSpannableStringBuilder.append(paramCharSequence);
      return localSpannableStringBuilder;
    }
    return paramCharSequence;
  }
  
  public final boolean H()
  {
    Object localObject = q0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((SearchableInfo)localObject).getVoiceSearchEnabled())
      {
        if (q0.getVoiceSearchLaunchWebSearch()) {
          localObject = V;
        } else if (q0.getVoiceSearchLaunchRecognizer()) {
          localObject = W;
        } else {
          localObject = null;
        }
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (getContext().getPackageManager().resolveActivity((Intent)localObject, 65536) != null) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public boolean I()
  {
    return e0;
  }
  
  public final boolean K()
  {
    boolean bool;
    if (((g0) || (l0)) && (!I())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void L(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      getContext().startActivity(paramIntent);
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed launch activity: ");
      localStringBuilder.append(paramIntent);
      Log.e("SearchView", localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  public void M(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = z("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(paramString1);
  }
  
  public final boolean N(int paramInt1, int paramInt2, String paramString)
  {
    Cursor localCursor = f0.b();
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt1)))
    {
      L(A(localCursor, paramInt2, paramString));
      return true;
    }
    return false;
  }
  
  public void O()
  {
    if (TextUtils.isEmpty(D.getText()))
    {
      if (d0)
      {
        clearFocus();
        h0(true);
      }
    }
    else
    {
      D.setText("");
      D.requestFocus();
      D.setImeVisibility(true);
    }
  }
  
  public boolean P(int paramInt1, int paramInt2, String paramString)
  {
    N(paramInt1, 0, null);
    D.setImeVisibility(false);
    D();
    return true;
  }
  
  public boolean Q(int paramInt)
  {
    Z(paramInt);
    return true;
  }
  
  public void R(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public void S()
  {
    h0(false);
    D.requestFocus();
    D.setImeVisibility(true);
    View.OnClickListener localOnClickListener = c0;
    if (localOnClickListener != null) {
      localOnClickListener.onClick(this);
    }
  }
  
  public void T()
  {
    Editable localEditable = D.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0))
    {
      if (q0 != null) {
        M(0, null, localEditable.toString());
      }
      D.setImeVisibility(false);
      D();
    }
  }
  
  public boolean U(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (q0 == null) {
      return false;
    }
    if (f0 == null) {
      return false;
    }
    if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.hasNoModifiers())) {
      if ((paramInt != 66) && (paramInt != 84) && (paramInt != 61))
      {
        if ((paramInt != 21) && (paramInt != 22))
        {
          if (paramInt == 19)
          {
            D.getListSelection();
            return false;
          }
        }
        else
        {
          if (paramInt == 21) {
            paramInt = 0;
          } else {
            paramInt = D.length();
          }
          D.setSelection(paramInt);
          D.setListSelection(0);
          D.clearListSelection();
          D.a();
          return true;
        }
      }
      else {
        return P(D.getListSelection(), 0, null);
      }
    }
    return false;
  }
  
  public void V(CharSequence paramCharSequence)
  {
    Editable localEditable = D.getText();
    n0 = localEditable;
    boolean bool = TextUtils.isEmpty(localEditable);
    g0(bool ^ true);
    i0(bool);
    b0();
    f0();
    m0 = paramCharSequence.toString();
  }
  
  public void W()
  {
    h0(I());
    Y();
    if (D.hasFocus()) {
      E();
    }
  }
  
  public void X()
  {
    Object localObject = q0;
    if (localObject == null) {
      return;
    }
    try
    {
      if (((SearchableInfo)localObject).getVoiceSearchLaunchWebSearch()) {}
      for (localObject = C(V, (SearchableInfo)localObject);; localObject = B(W, (SearchableInfo)localObject))
      {
        getContext().startActivity((Intent)localObject);
        break;
        if (!((SearchableInfo)localObject).getVoiceSearchLaunchRecognizer()) {
          break;
        }
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("SearchView", "Could not find voice search activity");
    }
  }
  
  public final void Y()
  {
    post(s0);
  }
  
  public final void Z(int paramInt)
  {
    Editable localEditable = D.getText();
    Object localObject = f0.b();
    if (localObject == null) {
      return;
    }
    if (((Cursor)localObject).moveToPosition(paramInt))
    {
      localObject = f0.c((Cursor)localObject);
      if (localObject != null)
      {
        setQuery((CharSequence)localObject);
        return;
      }
    }
    setQuery(localEditable);
  }
  
  public void a0(CharSequence paramCharSequence, boolean paramBoolean)
  {
    D.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      SearchAutoComplete localSearchAutoComplete = D;
      localSearchAutoComplete.setSelection(localSearchAutoComplete.length());
      n0 = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      T();
    }
  }
  
  public void b()
  {
    if (o0) {
      return;
    }
    o0 = true;
    int i = D.getImeOptions();
    p0 = i;
    D.setImeOptions(i | 0x2000000);
    D.setText("");
    setIconified(false);
  }
  
  public final void b0()
  {
    boolean bool = TextUtils.isEmpty(D.getText());
    int i = 1;
    int j = bool ^ true;
    int k = 0;
    int m = i;
    if (j == 0) {
      if ((d0) && (!o0)) {
        m = i;
      } else {
        m = 0;
      }
    }
    Object localObject = J;
    if (m != 0) {
      m = k;
    } else {
      m = 8;
    }
    ((ImageView)localObject).setVisibility(m);
    Drawable localDrawable = J.getDrawable();
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
  
  public void c()
  {
    a0("", false);
    clearFocus();
    h0(true);
    D.setImeOptions(p0);
    o0 = false;
  }
  
  public void c0()
  {
    int[] arrayOfInt;
    if (D.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    }
    Drawable localDrawable = F.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    localDrawable = G.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public void clearFocus()
  {
    j0 = true;
    super.clearFocus();
    D.clearFocus();
    D.setImeVisibility(false);
    j0 = false;
  }
  
  public final void d0()
  {
    CharSequence localCharSequence = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = D;
    Object localObject = localCharSequence;
    if (localCharSequence == null) {
      localObject = "";
    }
    localSearchAutoComplete.setHint(G((CharSequence)localObject));
  }
  
  public final void e0()
  {
    D.setThreshold(q0.getSuggestThreshold());
    D.setImeOptions(q0.getImeOptions());
    int i = q0.getInputType();
    int j = 1;
    int k = i;
    if ((i & 0xF) == 1)
    {
      i &= 0xFFFEFFFF;
      k = i;
      if (q0.getSuggestAuthority() != null) {
        k = i | 0x90000;
      }
    }
    D.setInputType(k);
    Object localObject = f0;
    if (localObject != null) {
      ((M.a)localObject).a(null);
    }
    if (q0.getSuggestAuthority() != null)
    {
      localObject = new S(getContext(), this, q0, u0);
      f0 = ((M.a)localObject);
      D.setAdapter((ListAdapter)localObject);
      localObject = (S)f0;
      k = j;
      if (i0) {
        k = 2;
      }
      ((S)localObject).x(k);
    }
  }
  
  public final void f0()
  {
    int i;
    if ((K()) && ((I.getVisibility() == 0) || (K.getVisibility() == 0))) {
      i = 0;
    } else {
      i = 8;
    }
    G.setVisibility(i);
  }
  
  public final void g0(boolean paramBoolean)
  {
    int i;
    if ((g0) && (K()) && (hasFocus()) && ((paramBoolean) || (!l0))) {
      i = 0;
    } else {
      i = 8;
    }
    I.setVisibility(i);
  }
  
  public int getImeOptions()
  {
    return D.getImeOptions();
  }
  
  public int getInputType()
  {
    return D.getInputType();
  }
  
  public int getMaxWidth()
  {
    return k0;
  }
  
  public CharSequence getQuery()
  {
    return D.getText();
  }
  
  public CharSequence getQueryHint()
  {
    Object localObject = h0;
    if (localObject == null)
    {
      localObject = q0;
      if ((localObject != null) && (((SearchableInfo)localObject).getHintId() != 0)) {
        localObject = getContext().getText(q0.getHintId());
      } else {
        localObject = a0;
      }
    }
    return (CharSequence)localObject;
  }
  
  public int getSuggestionCommitIconResId()
  {
    return U;
  }
  
  public int getSuggestionRowLayout()
  {
    return T;
  }
  
  public M.a getSuggestionsAdapter()
  {
    return f0;
  }
  
  public final void h0(boolean paramBoolean)
  {
    e0 = paramBoolean;
    int i = 8;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 8;
    }
    boolean bool = TextUtils.isEmpty(D.getText());
    H.setVisibility(j);
    g0(bool ^ true);
    View localView = E;
    if (paramBoolean) {
      j = 8;
    } else {
      j = 0;
    }
    localView.setVisibility(j);
    int j = i;
    if (R.getDrawable() != null) {
      if (d0) {
        j = i;
      } else {
        j = 0;
      }
    }
    R.setVisibility(j);
    b0();
    i0(bool);
    f0();
  }
  
  public final void i0(boolean paramBoolean)
  {
    boolean bool = l0;
    int i = 8;
    int j = i;
    if (bool)
    {
      j = i;
      if (!I())
      {
        j = i;
        if (paramBoolean)
        {
          I.setVisibility(8);
          j = 0;
        }
      }
    }
    K.setVisibility(j);
  }
  
  public void onDetachedFromWindow()
  {
    removeCallbacks(s0);
    post(t0);
    super.onDetachedFromWindow();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      F(D, N);
      Rect localRect = O;
      Object localObject = N;
      localRect.set(left, 0, right, paramInt4 - paramInt2);
      localObject = M;
      if (localObject == null)
      {
        localObject = new p(O, N, D);
        M = ((p)localObject);
        setTouchDelegate((TouchDelegate)localObject);
      }
      else
      {
        ((p)localObject).a(O, N);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (I())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE) {
      if (i != 0)
      {
        if (i != 1073741824)
        {
          paramInt1 = j;
          break label113;
        }
        i = k0;
        paramInt1 = j;
        if (i <= 0) {
          break label113;
        }
        paramInt1 = i;
      }
    }
    for (;;)
    {
      paramInt1 = Math.min(paramInt1, j);
      break;
      paramInt1 = k0;
      if (paramInt1 > 0) {
        break;
      }
      paramInt1 = getPreferredWidth();
      break;
      paramInt1 = k0;
      if (paramInt1 <= 0) {
        paramInt1 = getPreferredWidth();
      }
    }
    label113:
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
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof o))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (o)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.a());
    h0(q);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    o localo = new o(super.onSaveInstanceState());
    q = I();
    return localo;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    Y();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (j0) {
      return false;
    }
    if (!isFocusable()) {
      return false;
    }
    if (!I())
    {
      boolean bool = D.requestFocus(paramInt, paramRect);
      if (bool) {
        h0(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    r0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      O();
    } else {
      S();
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (d0 == paramBoolean) {
      return;
    }
    d0 = paramBoolean;
    h0(paramBoolean);
    d0();
  }
  
  public void setImeOptions(int paramInt)
  {
    D.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    D.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    k0 = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(k paramk) {}
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    b0 = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(l paraml) {}
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    c0 = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(m paramm) {}
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    h0 = paramCharSequence;
    d0();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    i0 = paramBoolean;
    Object localObject = f0;
    if ((localObject instanceof S))
    {
      localObject = (S)localObject;
      int i;
      if (paramBoolean) {
        i = 2;
      } else {
        i = 1;
      }
      ((S)localObject).x(i);
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    q0 = paramSearchableInfo;
    if (paramSearchableInfo != null)
    {
      e0();
      d0();
    }
    boolean bool = H();
    l0 = bool;
    if (bool) {
      D.setPrivateImeOptions("nm");
    }
    h0(I());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    g0 = paramBoolean;
    h0(I());
  }
  
  public void setSuggestionsAdapter(M.a parama)
  {
    f0 = parama;
    D.setAdapter(parama);
  }
  
  public void y()
  {
    if (L.getWidth() > 1)
    {
      Resources localResources = getContext().getResources();
      int i = F.getPaddingLeft();
      Rect localRect = new Rect();
      boolean bool = d0.a(this);
      int j;
      if (d0) {
        j = localResources.getDimensionPixelSize(e.c.c) + localResources.getDimensionPixelSize(e.c.d);
      } else {
        j = 0;
      }
      D.getDropDownBackground().getPadding(localRect);
      int k = left;
      if (bool) {
        k = -k;
      } else {
        k = i - (k + j);
      }
      D.setDropDownHorizontalOffset(k);
      int m = L.getWidth();
      k = left;
      int n = right;
      D.setDropDownWidth(m + k + n + j - i);
    }
  }
  
  public final Intent z(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", n0);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    paramUri = r0;
    if (paramUri != null) {
      paramString1.putExtra("app_data", paramUri);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    paramString1.setComponent(q0.getSearchActivity());
    return paramString1;
  }
  
  public static class SearchAutoComplete
    extends l.c
  {
    public int r = getThreshold();
    public SearchView s;
    public boolean t;
    public final Runnable u = new a();
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, e.a.g);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
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
    
    public void a()
    {
      if (Build.VERSION.SDK_INT >= 29)
      {
        Q.a(this, 1);
        if (enoughToFilter()) {
          showDropDown();
        }
      }
      else
      {
        SearchView.B0.c(this);
      }
    }
    
    public boolean b()
    {
      boolean bool;
      if (TextUtils.getTrimmedLength(getText()) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void c()
    {
      if (t)
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        t = false;
      }
    }
    
    public boolean enoughToFilter()
    {
      boolean bool;
      if ((r > 0) && (!super.enoughToFilter())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
    {
      paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
      if (t)
      {
        removeCallbacks(u);
        post(u);
      }
      return paramEditorInfo;
    }
    
    public void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      s.W();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
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
            s.clearFocus();
            setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (s.hasFocus()) && (getVisibility() == 0))
      {
        t = true;
        if (SearchView.J(getContext())) {
          a();
        }
      }
    }
    
    public void performCompletion() {}
    
    public void replaceText(CharSequence paramCharSequence) {}
    
    public void setImeVisibility(boolean paramBoolean)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!paramBoolean)
      {
        t = false;
        removeCallbacks(u);
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      }
      if (localInputMethodManager.isActive(this))
      {
        t = false;
        removeCallbacks(u);
        localInputMethodManager.showSoftInput(this, 0);
        return;
      }
      t = true;
    }
    
    public void setSearchView(SearchView paramSearchView)
    {
      s = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      r = paramInt;
    }
    
    public class a
      implements Runnable
    {
      public a() {}
      
      public void run()
      {
        c();
      }
    }
  }
  
  public class a
    implements TextWatcher
  {
    public a() {}
    
    public void afterTextChanged(Editable paramEditable) {}
    
    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      V(paramCharSequence);
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      c0();
    }
  }
  
  public class c
    implements Runnable
  {
    public c() {}
    
    public void run()
    {
      M.a locala = f0;
      if ((locala instanceof S)) {
        locala.a(null);
      }
    }
  }
  
  public class d
    implements View.OnFocusChangeListener
  {
    public d() {}
    
    public void onFocusChange(View paramView, boolean paramBoolean)
    {
      paramView = SearchView.this;
      View.OnFocusChangeListener localOnFocusChangeListener = b0;
      if (localOnFocusChangeListener != null) {
        localOnFocusChangeListener.onFocusChange(paramView, paramBoolean);
      }
    }
  }
  
  public class e
    implements View.OnLayoutChangeListener
  {
    public e() {}
    
    public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
    {
      y();
    }
  }
  
  public class f
    implements View.OnClickListener
  {
    public f() {}
    
    public void onClick(View paramView)
    {
      SearchView localSearchView = SearchView.this;
      if (paramView == H) {
        localSearchView.S();
      } else if (paramView == J) {
        localSearchView.O();
      } else if (paramView == I) {
        localSearchView.T();
      } else if (paramView == K) {
        localSearchView.X();
      } else if (paramView == D) {
        localSearchView.E();
      }
    }
  }
  
  public class g
    implements View.OnKeyListener
  {
    public g() {}
    
    public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
    {
      SearchView localSearchView = SearchView.this;
      if (q0 == null) {
        return false;
      }
      if ((D.isPopupShowing()) && (D.getListSelection() != -1)) {
        return U(paramView, paramInt, paramKeyEvent);
      }
      if ((!D.b()) && (paramKeyEvent.hasNoModifiers()) && (paramKeyEvent.getAction() == 1) && (paramInt == 66))
      {
        paramView.cancelLongPress();
        paramView = SearchView.this;
        paramView.M(0, null, D.getText().toString());
        return true;
      }
      return false;
    }
  }
  
  public class h
    implements TextView.OnEditorActionListener
  {
    public h() {}
    
    public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
    {
      T();
      return true;
    }
  }
  
  public class i
    implements AdapterView.OnItemClickListener
  {
    public i() {}
    
    public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      P(paramInt, 0, null);
    }
  }
  
  public class j
    implements AdapterView.OnItemSelectedListener
  {
    public j() {}
    
    public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      Q(paramInt);
    }
    
    public void onNothingSelected(AdapterView paramAdapterView) {}
  }
  
  public static abstract interface k {}
  
  public static abstract interface l {}
  
  public static abstract interface m {}
  
  public static class n
  {
    public Method a = null;
    public Method b = null;
    public Method c = null;
    
    public n()
    {
      d();
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
    
    public static void d()
    {
      if (Build.VERSION.SDK_INT < 29) {
        return;
      }
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
    
    public void a(AutoCompleteTextView paramAutoCompleteTextView)
    {
      d();
      Method localMethod = b;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    public void b(AutoCompleteTextView paramAutoCompleteTextView)
    {
      d();
      Method localMethod = a;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    public void c(AutoCompleteTextView paramAutoCompleteTextView)
    {
      d();
      Method localMethod = c;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[] { Boolean.TRUE });
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
  }
  
  public static class o
    extends N.a
  {
    public static final Parcelable.Creator<o> CREATOR = new a();
    public boolean q;
    
    public o(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      q = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    public o(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SearchView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" isIconified=");
      localStringBuilder.append(q);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(q));
    }
    
    public class a
      implements Parcelable.ClassLoaderCreator
    {
      public SearchView.o a(Parcel paramParcel)
      {
        return new SearchView.o(paramParcel, null);
      }
      
      public SearchView.o b(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new SearchView.o(paramParcel, paramClassLoader);
      }
      
      public SearchView.o[] c(int paramInt)
      {
        return new SearchView.o[paramInt];
      }
    }
  }
  
  public static class p
    extends TouchDelegate
  {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;
    
    public p(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      e = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      b = new Rect();
      d = new Rect();
      c = new Rect();
      a(paramRect1, paramRect2);
      a = paramView;
    }
    
    public void a(Rect paramRect1, Rect paramRect2)
    {
      b.set(paramRect1);
      d.set(paramRect1);
      paramRect1 = d;
      int i = e;
      paramRect1.inset(-i, -i);
      c.set(paramRect2);
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k = paramMotionEvent.getAction();
      boolean bool1 = false;
      boolean bool2 = true;
      if (k != 0)
      {
        if ((k != 1) && (k != 2))
        {
          if (k == 3)
          {
            bool2 = f;
            f = false;
          }
        }
        else
        {
          do
          {
            do
            {
              k = 1;
              break;
              bool3 = f;
              bool2 = bool3;
            } while (!bool3);
            bool2 = bool3;
          } while (d.contains(i, j));
          bool2 = bool3;
          k = 0;
          break label137;
        }
      }
      else if (b.contains(i, j))
      {
        f = true;
        k = 1;
        break label137;
      }
      k = 1;
      bool2 = false;
      label137:
      boolean bool3 = bool1;
      if (bool2)
      {
        float f1;
        if ((k != 0) && (!c.contains(i, j))) {
          f1 = a.getWidth() / 2;
        }
        Rect localRect;
        for (k = a.getHeight() / 2;; k = j - top)
        {
          paramMotionEvent.setLocation(f1, k);
          break;
          localRect = c;
          f1 = i - left;
        }
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