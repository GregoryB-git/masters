package l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.AbsSpinner;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController.b;
import androidx.appcompat.app.b.a;
import e0.d0;
import g.n;
import java.util.Objects;
import java.util.WeakHashMap;

public final class z
  extends Spinner
{
  public static final int[] q = { 16843505 };
  public final d a;
  public final Context b;
  public y c;
  public SpinnerAdapter d;
  public final boolean e;
  public i f;
  public int o;
  public final Rect p;
  
  /* Error */
  public z(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 63	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 65	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 67	android/graphics/Rect:<init>	()V
    //   15: putfield 69	l/z:p	Landroid/graphics/Rect;
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual 75	android/view/View:getContext	()Landroid/content/Context;
    //   23: invokestatic 80	l/u0:a	(Landroid/view/View;Landroid/content/Context;)V
    //   26: aload_1
    //   27: aload_2
    //   28: getstatic 84	b/a0:I	[I
    //   31: iload_3
    //   32: iconst_0
    //   33: invokevirtual 90	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   36: astore 4
    //   38: aload_0
    //   39: new 92	l/d
    //   42: dup
    //   43: aload_0
    //   44: invokespecial 95	l/d:<init>	(Landroid/view/View;)V
    //   47: putfield 97	l/z:a	Ll/d;
    //   50: aload 4
    //   52: iconst_4
    //   53: iconst_0
    //   54: invokevirtual 103	android/content/res/TypedArray:getResourceId	(II)I
    //   57: istore 5
    //   59: iload 5
    //   61: ifeq +20 -> 81
    //   64: aload_0
    //   65: new 105	j/c
    //   68: dup
    //   69: aload_1
    //   70: iload 5
    //   72: invokespecial 108	j/c:<init>	(Landroid/content/Context;I)V
    //   75: putfield 110	l/z:b	Landroid/content/Context;
    //   78: goto +8 -> 86
    //   81: aload_0
    //   82: aload_1
    //   83: putfield 110	l/z:b	Landroid/content/Context;
    //   86: aconst_null
    //   87: astore 6
    //   89: iconst_m1
    //   90: istore 7
    //   92: aload_1
    //   93: aload_2
    //   94: getstatic 56	l/z:q	[I
    //   97: iload_3
    //   98: iconst_0
    //   99: invokevirtual 90	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   102: astore 8
    //   104: aload 8
    //   106: astore 6
    //   108: iload 7
    //   110: istore 5
    //   112: aload 8
    //   114: astore 9
    //   116: aload 8
    //   118: iconst_0
    //   119: invokevirtual 114	android/content/res/TypedArray:hasValue	(I)Z
    //   122: ifeq +78 -> 200
    //   125: aload 8
    //   127: astore 6
    //   129: aload 8
    //   131: iconst_0
    //   132: iconst_0
    //   133: invokevirtual 117	android/content/res/TypedArray:getInt	(II)I
    //   136: istore 5
    //   138: aload 8
    //   140: astore 9
    //   142: goto +58 -> 200
    //   145: astore_2
    //   146: aload 6
    //   148: astore_1
    //   149: goto +269 -> 418
    //   152: astore 9
    //   154: goto +15 -> 169
    //   157: astore_2
    //   158: aload 6
    //   160: astore_1
    //   161: goto +257 -> 418
    //   164: astore 9
    //   166: aconst_null
    //   167: astore 8
    //   169: aload 8
    //   171: astore 6
    //   173: ldc 119
    //   175: ldc 121
    //   177: aload 9
    //   179: invokestatic 126	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   182: pop
    //   183: iload 7
    //   185: istore 5
    //   187: aload 8
    //   189: ifnull +16 -> 205
    //   192: aload 8
    //   194: astore 9
    //   196: iload 7
    //   198: istore 5
    //   200: aload 9
    //   202: invokevirtual 129	android/content/res/TypedArray:recycle	()V
    //   205: iload 5
    //   207: ifeq +108 -> 315
    //   210: iload 5
    //   212: iconst_1
    //   213: if_icmpeq +6 -> 219
    //   216: goto +126 -> 342
    //   219: new 23	l/z$g
    //   222: dup
    //   223: aload_0
    //   224: aload_0
    //   225: getfield 110	l/z:b	Landroid/content/Context;
    //   228: aload_2
    //   229: iload_3
    //   230: invokespecial 132	l/z$g:<init>	(Ll/z;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   233: astore 6
    //   235: aload_0
    //   236: getfield 110	l/z:b	Landroid/content/Context;
    //   239: aload_2
    //   240: getstatic 84	b/a0:I	[I
    //   243: iload_3
    //   244: invokestatic 138	l/z0:m	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z0;
    //   247: astore 8
    //   249: aload_0
    //   250: aload 8
    //   252: getfield 141	l/z0:b	Landroid/content/res/TypedArray;
    //   255: iconst_3
    //   256: bipush -2
    //   258: invokevirtual 144	android/content/res/TypedArray:getLayoutDimension	(II)I
    //   261: putfield 146	l/z:o	I
    //   264: aload 6
    //   266: aload 8
    //   268: iconst_1
    //   269: invokevirtual 149	l/z0:e	(I)Landroid/graphics/drawable/Drawable;
    //   272: invokevirtual 155	l/n0:j	(Landroid/graphics/drawable/Drawable;)V
    //   275: aload 6
    //   277: aload 4
    //   279: iconst_2
    //   280: invokevirtual 159	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   283: putfield 163	l/z$g:K	Ljava/lang/CharSequence;
    //   286: aload 8
    //   288: invokevirtual 166	l/z0:n	()V
    //   291: aload_0
    //   292: aload 6
    //   294: putfield 168	l/z:f	Ll/z$i;
    //   297: aload_0
    //   298: new 170	l/y
    //   301: dup
    //   302: aload_0
    //   303: aload_0
    //   304: aload 6
    //   306: invokespecial 173	l/y:<init>	(Ll/z;Landroid/view/View;Ll/z$g;)V
    //   309: putfield 175	l/z:c	Ll/y;
    //   312: goto +30 -> 342
    //   315: new 17	l/z$e
    //   318: dup
    //   319: aload_0
    //   320: invokespecial 178	l/z$e:<init>	(Ll/z;)V
    //   323: astore 8
    //   325: aload_0
    //   326: aload 8
    //   328: putfield 168	l/z:f	Ll/z$i;
    //   331: aload 8
    //   333: aload 4
    //   335: iconst_2
    //   336: invokevirtual 159	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   339: putfield 180	l/z$e:c	Ljava/lang/CharSequence;
    //   342: aload 4
    //   344: iconst_0
    //   345: invokevirtual 184	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   348: astore 8
    //   350: aload 8
    //   352: ifnull +27 -> 379
    //   355: new 186	android/widget/ArrayAdapter
    //   358: dup
    //   359: aload_1
    //   360: ldc -69
    //   362: aload 8
    //   364: invokespecial 190	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   367: astore_1
    //   368: aload_1
    //   369: ldc -65
    //   371: invokevirtual 195	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   374: aload_0
    //   375: aload_1
    //   376: invokevirtual 199	l/z:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   379: aload 4
    //   381: invokevirtual 129	android/content/res/TypedArray:recycle	()V
    //   384: aload_0
    //   385: iconst_1
    //   386: putfield 201	l/z:e	Z
    //   389: aload_0
    //   390: getfield 203	l/z:d	Landroid/widget/SpinnerAdapter;
    //   393: astore_1
    //   394: aload_1
    //   395: ifnull +13 -> 408
    //   398: aload_0
    //   399: aload_1
    //   400: invokevirtual 199	l/z:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   403: aload_0
    //   404: aconst_null
    //   405: putfield 203	l/z:d	Landroid/widget/SpinnerAdapter;
    //   408: aload_0
    //   409: getfield 97	l/z:a	Ll/d;
    //   412: aload_2
    //   413: iload_3
    //   414: invokevirtual 206	l/d:d	(Landroid/util/AttributeSet;I)V
    //   417: return
    //   418: aload_1
    //   419: ifnull +7 -> 426
    //   422: aload_1
    //   423: invokevirtual 129	android/content/res/TypedArray:recycle	()V
    //   426: aload_2
    //   427: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	428	0	this	z
    //   0	428	1	paramContext	Context
    //   0	428	2	paramAttributeSet	AttributeSet
    //   0	428	3	paramInt	int
    //   36	344	4	localTypedArray	android.content.res.TypedArray
    //   57	157	5	i	int
    //   87	218	6	localObject1	Object
    //   90	107	7	j	int
    //   102	261	8	localObject2	Object
    //   114	27	9	localObject3	Object
    //   152	1	9	localException1	Exception
    //   164	14	9	localException2	Exception
    //   194	7	9	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   116	125	145	finally
    //   129	138	145	finally
    //   173	183	145	finally
    //   116	125	152	java/lang/Exception
    //   129	138	152	java/lang/Exception
    //   92	104	157	finally
    //   92	104	164	java/lang/Exception
  }
  
  public final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int i = 0;
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int k = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int n = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int i1 = Math.max(0, m - (15 - (n - m)));
    View localView = null;
    m = 0;
    while (i1 < n)
    {
      int i2 = paramSpinnerAdapter.getItemViewType(i1);
      int i3 = i;
      if (i2 != i)
      {
        localView = null;
        i3 = i2;
      }
      localView = paramSpinnerAdapter.getView(i1, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(j, k);
      m = Math.max(m, localView.getMeasuredWidth());
      i1++;
      i = i3;
    }
    i1 = m;
    if (paramDrawable != null)
    {
      paramDrawable.getPadding(p);
      paramSpinnerAdapter = p;
      i1 = m + (left + right);
    }
    return i1;
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    d locald = a;
    if (locald != null) {
      locald.a();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    i locali = f;
    if (locali != null) {
      return locali.b();
    }
    return super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset()
  {
    i locali = f;
    if (locali != null) {
      return locali.n();
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    if (f != null) {
      return o;
    }
    return super.getDropDownWidth();
  }
  
  public final i getInternalPopup()
  {
    return f;
  }
  
  public Drawable getPopupBackground()
  {
    i locali = f;
    if (locali != null) {
      return locali.g();
    }
    return super.getPopupBackground();
  }
  
  public Context getPopupContext()
  {
    return b;
  }
  
  public CharSequence getPrompt()
  {
    Object localObject = f;
    if (localObject != null) {
      localObject = ((i)localObject).e();
    } else {
      localObject = super.getPrompt();
    }
    return (CharSequence)localObject;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    i locali = f;
    if ((locali != null) && (locali.a())) {
      f.dismiss();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((f != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (h)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (a)
    {
      paramParcelable = getViewTreeObserver();
      if (paramParcelable != null) {
        paramParcelable.addOnGlobalLayoutListener(new a());
      }
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    h localh = new h(super.onSaveInstanceState());
    i locali = f;
    boolean bool;
    if ((locali != null) && (locali.a())) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
    return localh;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    y localy = c;
    if ((localy != null) && (localy.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean performClick()
  {
    i locali = f;
    if (locali != null)
    {
      if (!locali.a()) {
        f.m(c.b(this), c.a(this));
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!e)
    {
      d = paramSpinnerAdapter;
      return;
    }
    super.setAdapter(paramSpinnerAdapter);
    if (f != null)
    {
      Context localContext1 = b;
      Context localContext2 = localContext1;
      if (localContext1 == null) {
        localContext2 = getContext();
      }
      f.o(new f(paramSpinnerAdapter, localContext2.getTheme()));
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = a;
    if (paramDrawable != null) {
      paramDrawable.e();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = a;
    if (locald != null) {
      locald.f(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    i locali = f;
    if (locali != null)
    {
      locali.l(paramInt);
      f.d(paramInt);
    }
    else
    {
      super.setDropDownHorizontalOffset(paramInt);
    }
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    i locali = f;
    if (locali != null) {
      locali.k(paramInt);
    } else {
      super.setDropDownVerticalOffset(paramInt);
    }
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (f != null) {
      o = paramInt;
    } else {
      super.setDropDownWidth(paramInt);
    }
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    i locali = f;
    if (locali != null) {
      locali.j(paramDrawable);
    } else {
      super.setPopupBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(x6.b.X(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    i locali = f;
    if (locali != null) {
      locali.i(paramCharSequence);
    } else {
      super.setPrompt(paramCharSequence);
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = a;
    if (locald != null) {
      locald.h(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = a;
    if (locald != null) {
      locald.i(paramMode);
    }
  }
  
  public final class a
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public a() {}
    
    public final void onGlobalLayout()
    {
      if (!getInternalPopup().a())
      {
        localObject = z.this;
        f.m(z.c.b((View)localObject), z.c.a((View)localObject));
      }
      Object localObject = getViewTreeObserver();
      if (localObject != null) {
        z.b.a((ViewTreeObserver)localObject, this);
      }
    }
  }
  
  public static final class b
  {
    public static void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
  }
  
  public static final class c
  {
    public static int a(View paramView)
    {
      return paramView.getTextAlignment();
    }
    
    public static int b(View paramView)
    {
      return paramView.getTextDirection();
    }
    
    public static void c(View paramView, int paramInt)
    {
      paramView.setTextAlignment(paramInt);
    }
    
    public static void d(View paramView, int paramInt)
    {
      paramView.setTextDirection(paramInt);
    }
  }
  
  public static final class d
  {
    public static void a(ThemedSpinnerAdapter paramThemedSpinnerAdapter, Resources.Theme paramTheme)
    {
      if (!Objects.equals(paramThemedSpinnerAdapter.getDropDownViewTheme(), paramTheme)) {
        paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme);
      }
    }
  }
  
  public final class e
    implements z.i, DialogInterface.OnClickListener
  {
    public androidx.appcompat.app.b a;
    public ListAdapter b;
    public CharSequence c;
    
    public e() {}
    
    public final boolean a()
    {
      androidx.appcompat.app.b localb = a;
      boolean bool;
      if (localb != null) {
        bool = localb.isShowing();
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int b()
    {
      return 0;
    }
    
    public final void d(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public final void dismiss()
    {
      androidx.appcompat.app.b localb = a;
      if (localb != null)
      {
        localb.dismiss();
        a = null;
      }
    }
    
    public final CharSequence e()
    {
      return c;
    }
    
    public final Drawable g()
    {
      return null;
    }
    
    public final void i(CharSequence paramCharSequence)
    {
      c = paramCharSequence;
    }
    
    public final void j(Drawable paramDrawable)
    {
      Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public final void k(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public final void l(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
    
    public final void m(int paramInt1, int paramInt2)
    {
      if (b == null) {
        return;
      }
      Object localObject1 = new b.a(getPopupContext());
      Object localObject2 = c;
      if (localObject2 != null) {
        ((b.a)localObject1).setTitle((CharSequence)localObject2);
      }
      localObject2 = b;
      int i = getSelectedItemPosition();
      AlertController.b localb = a;
      m = ((ListAdapter)localObject2);
      n = this;
      q = i;
      p = true;
      localObject1 = ((b.a)localObject1).create();
      a = ((androidx.appcompat.app.b)localObject1);
      localObject1 = f.g;
      z.c.d((View)localObject1, paramInt1);
      z.c.c((View)localObject1, paramInt2);
      a.show();
    }
    
    public final int n()
    {
      return 0;
    }
    
    public final void o(ListAdapter paramListAdapter)
    {
      b = paramListAdapter;
    }
    
    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      setSelection(paramInt);
      if (getOnItemClickListener() != null) {
        performItemClick(null, paramInt, b.getItemId(paramInt));
      }
      dismiss();
    }
  }
  
  public static final class f
    implements ListAdapter, SpinnerAdapter
  {
    public SpinnerAdapter a;
    public ListAdapter b;
    
    public f(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
    {
      a = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        b = ((ListAdapter)paramSpinnerAdapter);
      }
      if (paramTheme != null) {
        if ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter))
        {
          z.d.a((ThemedSpinnerAdapter)paramSpinnerAdapter, paramTheme);
        }
        else if ((paramSpinnerAdapter instanceof v0))
        {
          paramSpinnerAdapter = (v0)paramSpinnerAdapter;
          if (paramSpinnerAdapter.getDropDownViewTheme() == null) {
            paramSpinnerAdapter.a();
          }
        }
      }
    }
    
    public final boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = b;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public final int getCount()
    {
      SpinnerAdapter localSpinnerAdapter = a;
      int i;
      if (localSpinnerAdapter == null) {
        i = 0;
      } else {
        i = localSpinnerAdapter.getCount();
      }
      return i;
    }
    
    public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      SpinnerAdapter localSpinnerAdapter = a;
      if (localSpinnerAdapter == null) {
        paramView = null;
      } else {
        paramView = localSpinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
      }
      return paramView;
    }
    
    public final Object getItem(int paramInt)
    {
      Object localObject = a;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((Adapter)localObject).getItem(paramInt);
      }
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      SpinnerAdapter localSpinnerAdapter = a;
      long l;
      if (localSpinnerAdapter == null) {
        l = -1L;
      } else {
        l = localSpinnerAdapter.getItemId(paramInt);
      }
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final int getViewTypeCount()
    {
      return 1;
    }
    
    public final boolean hasStableIds()
    {
      SpinnerAdapter localSpinnerAdapter = a;
      boolean bool;
      if ((localSpinnerAdapter != null) && (localSpinnerAdapter.hasStableIds())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean isEmpty()
    {
      boolean bool;
      if (getCount() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = b;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      SpinnerAdapter localSpinnerAdapter = a;
      if (localSpinnerAdapter != null) {
        localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      SpinnerAdapter localSpinnerAdapter = a;
      if (localSpinnerAdapter != null) {
        localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  public final class g
    extends n0
    implements z.i
  {
    public CharSequence K;
    public ListAdapter L;
    public final Rect M = new Rect();
    public int N;
    
    public g(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt, 0);
      w = z.this;
      F = true;
      G.setFocusable(true);
      x = new a();
    }
    
    public final CharSequence e()
    {
      return K;
    }
    
    public final void i(CharSequence paramCharSequence)
    {
      K = paramCharSequence;
    }
    
    public final void l(int paramInt)
    {
      N = paramInt;
    }
    
    public final void m(int paramInt1, int paramInt2)
    {
      boolean bool = a();
      r();
      G.setInputMethodMode(2);
      show();
      Object localObject = c;
      ((AbsListView)localObject).setChoiceMode(1);
      z.c.d((View)localObject, paramInt1);
      z.c.c((View)localObject, paramInt2);
      paramInt1 = getSelectedItemPosition();
      localObject = c;
      if ((a()) && (localObject != null))
      {
        ((j0)localObject).setListSelectionHidden(false);
        ((AdapterView)localObject).setSelection(paramInt1);
        if (((AbsListView)localObject).getChoiceMode() != 0) {
          ((AbsListView)localObject).setItemChecked(paramInt1, true);
        }
      }
      if (bool) {
        return;
      }
      localObject = getViewTreeObserver();
      if (localObject != null)
      {
        final b localb = new b();
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(localb);
        localObject = new c(localb);
        G.setOnDismissListener((PopupWindow.OnDismissListener)localObject);
      }
    }
    
    public final void o(ListAdapter paramListAdapter)
    {
      super.o(paramListAdapter);
      L = paramListAdapter;
    }
    
    public final void r()
    {
      Object localObject = g();
      int i = 0;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(p);
        if (f1.a(z.this)) {
          i = p.right;
        } else {
          i = -p.left;
        }
      }
      else
      {
        localObject = p;
        right = 0;
        left = 0;
      }
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = getWidth();
      localObject = z.this;
      int n = o;
      if (n == -2)
      {
        int i1 = ((z)localObject).a((SpinnerAdapter)L, g());
        n = getContext().getResources().getDisplayMetrics().widthPixels;
        localObject = p;
        int i2 = n - left - right;
        n = i1;
        if (i1 > i2) {
          n = i2;
        }
        n = Math.max(n, m - j - k);
      }
      else
      {
        if (n != -1) {
          break label237;
        }
        n = m - j - k;
      }
      q(n);
      break label243;
      label237:
      q(n);
      label243:
      if (f1.a(z.this)) {
        i = m - k - e - N + i;
      } else {
        i = j + N + i;
      }
      f = i;
    }
    
    public final class a
      implements AdapterView.OnItemClickListener
    {
      public a() {}
      
      public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        setSelection(paramInt);
        if (getOnItemClickListener() != null)
        {
          paramAdapterView = z.g.this;
          O.performItemClick(paramView, paramInt, L.getItemId(paramInt));
        }
        dismiss();
      }
    }
    
    public final class b
      implements ViewTreeObserver.OnGlobalLayoutListener
    {
      public b() {}
      
      public final void onGlobalLayout()
      {
        z.g localg = z.g.this;
        z localz = O;
        localg.getClass();
        WeakHashMap localWeakHashMap = d0.a;
        int i;
        if ((localz.isAttachedToWindow()) && (localz.getGlobalVisibleRect(M))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          dismiss();
        }
        else
        {
          r();
          show();
        }
      }
    }
    
    public final class c
      implements PopupWindow.OnDismissListener
    {
      public c(z.g.b paramb) {}
      
      public final void onDismiss()
      {
        ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
        if (localViewTreeObserver != null) {
          localViewTreeObserver.removeGlobalOnLayoutListener(localb);
        }
      }
    }
  }
  
  public static final class h
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<h> CREATOR = new a();
    public boolean a;
    
    public h(Parcel paramParcel)
    {
      super();
      boolean bool;
      if (paramParcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      a = bool;
    }
    
    public h(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeByte((byte)a);
    }
    
    public final class a
      implements Parcelable.Creator<z.h>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new z.h(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new z.h[paramInt];
      }
    }
  }
  
  public static abstract interface i
  {
    public abstract boolean a();
    
    public abstract int b();
    
    public abstract void d(int paramInt);
    
    public abstract void dismiss();
    
    public abstract CharSequence e();
    
    public abstract Drawable g();
    
    public abstract void i(CharSequence paramCharSequence);
    
    public abstract void j(Drawable paramDrawable);
    
    public abstract void k(int paramInt);
    
    public abstract void l(int paramInt);
    
    public abstract void m(int paramInt1, int paramInt2);
    
    public abstract int n();
    
    public abstract void o(ListAdapter paramListAdapter);
  }
}

/* Location:
 * Qualified Name:     l.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */