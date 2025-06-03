package androidx.appcompat.widget;

import android.annotation.SuppressLint;
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
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;

public class AppCompatSpinner
  extends Spinner
  implements TintableBackgroundView
{
  @SuppressLint({"ResourceType"})
  @StyleableRes
  private static final int[] ATTRS_ANDROID_SPINNERMODE = { 16843505 };
  private static final int MAX_ITEMS_MEASURED = 15;
  private static final int MODE_DIALOG = 0;
  private static final int MODE_DROPDOWN = 1;
  private static final int MODE_THEME = -1;
  private static final String TAG = "AppCompatSpinner";
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  public int mDropDownWidth;
  private ForwardingListener mForwardingListener;
  private SpinnerPopup mPopup;
  private final Context mPopupContext;
  private final boolean mPopupSet;
  private SpinnerAdapter mTempAdapter;
  public final Rect mTempRect;
  
  public AppCompatSpinner(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatSpinner(@NonNull Context paramContext, int paramInt)
  {
    this(paramContext, null, R.attr.spinnerStyle, paramInt);
  }
  
  public AppCompatSpinner(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.spinnerStyle);
  }
  
  public AppCompatSpinner(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public AppCompatSpinner(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public AppCompatSpinner(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2, final Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 108	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 110	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 112	android/graphics/Rect:<init>	()V
    //   15: putfield 114	androidx/appcompat/widget/AppCompatSpinner:mTempRect	Landroid/graphics/Rect;
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual 120	android/view/View:getContext	()Landroid/content/Context;
    //   23: invokestatic 126	androidx/appcompat/widget/ThemeUtils:checkAppCompatTheme	(Landroid/view/View;Landroid/content/Context;)V
    //   26: aload_1
    //   27: aload_2
    //   28: getstatic 131	androidx/appcompat/R$styleable:Spinner	[I
    //   31: iload_3
    //   32: iconst_0
    //   33: invokestatic 137	androidx/appcompat/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;
    //   36: astore 6
    //   38: aload_0
    //   39: new 139	androidx/appcompat/widget/AppCompatBackgroundHelper
    //   42: dup
    //   43: aload_0
    //   44: invokespecial 142	androidx/appcompat/widget/AppCompatBackgroundHelper:<init>	(Landroid/view/View;)V
    //   47: putfield 144	androidx/appcompat/widget/AppCompatSpinner:mBackgroundTintHelper	Landroidx/appcompat/widget/AppCompatBackgroundHelper;
    //   50: aload 5
    //   52: ifnull +20 -> 72
    //   55: aload_0
    //   56: new 146	androidx/appcompat/view/ContextThemeWrapper
    //   59: dup
    //   60: aload_1
    //   61: aload 5
    //   63: invokespecial 149	androidx/appcompat/view/ContextThemeWrapper:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   66: putfield 151	androidx/appcompat/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   69: goto +41 -> 110
    //   72: aload 6
    //   74: getstatic 154	androidx/appcompat/R$styleable:Spinner_popupTheme	I
    //   77: iconst_0
    //   78: invokevirtual 158	androidx/appcompat/widget/TintTypedArray:getResourceId	(II)I
    //   81: istore 7
    //   83: iload 7
    //   85: ifeq +20 -> 105
    //   88: aload_0
    //   89: new 146	androidx/appcompat/view/ContextThemeWrapper
    //   92: dup
    //   93: aload_1
    //   94: iload 7
    //   96: invokespecial 160	androidx/appcompat/view/ContextThemeWrapper:<init>	(Landroid/content/Context;I)V
    //   99: putfield 151	androidx/appcompat/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   102: goto +8 -> 110
    //   105: aload_0
    //   106: aload_1
    //   107: putfield 151	androidx/appcompat/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   110: aconst_null
    //   111: astore 8
    //   113: iload 4
    //   115: istore 7
    //   117: iload 4
    //   119: iconst_m1
    //   120: if_icmpne +128 -> 248
    //   123: aload_1
    //   124: aload_2
    //   125: getstatic 81	androidx/appcompat/widget/AppCompatSpinner:ATTRS_ANDROID_SPINNERMODE	[I
    //   128: iload_3
    //   129: iconst_0
    //   130: invokevirtual 165	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   133: astore 5
    //   135: iload 4
    //   137: istore 7
    //   139: aload 5
    //   141: astore 9
    //   143: aload 5
    //   145: astore 8
    //   147: aload 5
    //   149: iconst_0
    //   150: invokevirtual 171	android/content/res/TypedArray:hasValue	(I)Z
    //   153: ifeq +20 -> 173
    //   156: aload 5
    //   158: astore 8
    //   160: aload 5
    //   162: iconst_0
    //   163: iconst_0
    //   164: invokevirtual 174	android/content/res/TypedArray:getInt	(II)I
    //   167: istore 7
    //   169: aload 5
    //   171: astore 9
    //   173: aload 9
    //   175: invokevirtual 177	android/content/res/TypedArray:recycle	()V
    //   178: goto +70 -> 248
    //   181: astore 9
    //   183: goto +15 -> 198
    //   186: astore_2
    //   187: aload 8
    //   189: astore_1
    //   190: goto +48 -> 238
    //   193: astore 9
    //   195: aconst_null
    //   196: astore 5
    //   198: aload 5
    //   200: astore 8
    //   202: ldc 61
    //   204: ldc -77
    //   206: aload 9
    //   208: invokestatic 185	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: iload 4
    //   214: istore 7
    //   216: aload 5
    //   218: ifnull +30 -> 248
    //   221: iload 4
    //   223: istore 7
    //   225: aload 5
    //   227: astore 9
    //   229: goto -56 -> 173
    //   232: astore_1
    //   233: aload_1
    //   234: astore_2
    //   235: aload 8
    //   237: astore_1
    //   238: aload_1
    //   239: ifnull +7 -> 246
    //   242: aload_1
    //   243: invokevirtual 177	android/content/res/TypedArray:recycle	()V
    //   246: aload_2
    //   247: athrow
    //   248: iload 7
    //   250: ifeq +112 -> 362
    //   253: iload 7
    //   255: iconst_1
    //   256: if_icmpeq +6 -> 262
    //   259: goto +134 -> 393
    //   262: new 27	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup
    //   265: dup
    //   266: aload_0
    //   267: aload_0
    //   268: getfield 151	androidx/appcompat/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   271: aload_2
    //   272: iload_3
    //   273: invokespecial 188	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   276: astore 5
    //   278: aload_0
    //   279: getfield 151	androidx/appcompat/widget/AppCompatSpinner:mPopupContext	Landroid/content/Context;
    //   282: aload_2
    //   283: getstatic 131	androidx/appcompat/R$styleable:Spinner	[I
    //   286: iload_3
    //   287: iconst_0
    //   288: invokestatic 137	androidx/appcompat/widget/TintTypedArray:obtainStyledAttributes	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;
    //   291: astore 8
    //   293: aload_0
    //   294: aload 8
    //   296: getstatic 191	androidx/appcompat/R$styleable:Spinner_android_dropDownWidth	I
    //   299: bipush -2
    //   301: invokevirtual 194	androidx/appcompat/widget/TintTypedArray:getLayoutDimension	(II)I
    //   304: putfield 196	androidx/appcompat/widget/AppCompatSpinner:mDropDownWidth	I
    //   307: aload 5
    //   309: aload 8
    //   311: getstatic 199	androidx/appcompat/R$styleable:Spinner_android_popupBackground	I
    //   314: invokevirtual 203	androidx/appcompat/widget/TintTypedArray:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   317: invokevirtual 209	androidx/appcompat/widget/ListPopupWindow:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   320: aload 5
    //   322: aload 6
    //   324: getstatic 212	androidx/appcompat/R$styleable:Spinner_android_prompt	I
    //   327: invokevirtual 216	androidx/appcompat/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   330: invokevirtual 220	androidx/appcompat/widget/AppCompatSpinner$DropdownPopup:setPromptText	(Ljava/lang/CharSequence;)V
    //   333: aload 8
    //   335: invokevirtual 221	androidx/appcompat/widget/TintTypedArray:recycle	()V
    //   338: aload_0
    //   339: aload 5
    //   341: putfield 223	androidx/appcompat/widget/AppCompatSpinner:mPopup	Landroidx/appcompat/widget/AppCompatSpinner$SpinnerPopup;
    //   344: aload_0
    //   345: new 8	androidx/appcompat/widget/AppCompatSpinner$1
    //   348: dup
    //   349: aload_0
    //   350: aload_0
    //   351: aload 5
    //   353: invokespecial 226	androidx/appcompat/widget/AppCompatSpinner$1:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;Landroid/view/View;Landroidx/appcompat/widget/AppCompatSpinner$DropdownPopup;)V
    //   356: putfield 228	androidx/appcompat/widget/AppCompatSpinner:mForwardingListener	Landroidx/appcompat/widget/ForwardingListener;
    //   359: goto +34 -> 393
    //   362: new 21	androidx/appcompat/widget/AppCompatSpinner$DialogPopup
    //   365: dup
    //   366: aload_0
    //   367: invokespecial 231	androidx/appcompat/widget/AppCompatSpinner$DialogPopup:<init>	(Landroidx/appcompat/widget/AppCompatSpinner;)V
    //   370: astore 5
    //   372: aload_0
    //   373: aload 5
    //   375: putfield 223	androidx/appcompat/widget/AppCompatSpinner:mPopup	Landroidx/appcompat/widget/AppCompatSpinner$SpinnerPopup;
    //   378: aload 5
    //   380: aload 6
    //   382: getstatic 212	androidx/appcompat/R$styleable:Spinner_android_prompt	I
    //   385: invokevirtual 216	androidx/appcompat/widget/TintTypedArray:getString	(I)Ljava/lang/String;
    //   388: invokeinterface 232 2 0
    //   393: aload 6
    //   395: getstatic 235	androidx/appcompat/R$styleable:Spinner_android_entries	I
    //   398: invokevirtual 239	androidx/appcompat/widget/TintTypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   401: astore 5
    //   403: aload 5
    //   405: ifnull +28 -> 433
    //   408: new 241	android/widget/ArrayAdapter
    //   411: dup
    //   412: aload_1
    //   413: ldc -14
    //   415: aload 5
    //   417: invokespecial 245	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   420: astore_1
    //   421: aload_1
    //   422: getstatic 250	androidx/appcompat/R$layout:support_simple_spinner_dropdown_item	I
    //   425: invokevirtual 254	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   428: aload_0
    //   429: aload_1
    //   430: invokevirtual 258	androidx/appcompat/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   433: aload 6
    //   435: invokevirtual 221	androidx/appcompat/widget/TintTypedArray:recycle	()V
    //   438: aload_0
    //   439: iconst_1
    //   440: putfield 260	androidx/appcompat/widget/AppCompatSpinner:mPopupSet	Z
    //   443: aload_0
    //   444: getfield 262	androidx/appcompat/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   447: astore_1
    //   448: aload_1
    //   449: ifnull +13 -> 462
    //   452: aload_0
    //   453: aload_1
    //   454: invokevirtual 258	androidx/appcompat/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   457: aload_0
    //   458: aconst_null
    //   459: putfield 262	androidx/appcompat/widget/AppCompatSpinner:mTempAdapter	Landroid/widget/SpinnerAdapter;
    //   462: aload_0
    //   463: getfield 144	androidx/appcompat/widget/AppCompatSpinner:mBackgroundTintHelper	Landroidx/appcompat/widget/AppCompatBackgroundHelper;
    //   466: aload_2
    //   467: iload_3
    //   468: invokevirtual 266	androidx/appcompat/widget/AppCompatBackgroundHelper:loadFromAttributes	(Landroid/util/AttributeSet;I)V
    //   471: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	472	0	this	AppCompatSpinner
    //   0	472	1	paramContext	Context
    //   0	472	2	paramAttributeSet	AttributeSet
    //   0	472	3	paramInt1	int
    //   0	472	4	paramInt2	int
    //   0	472	5	paramTheme	Resources.Theme
    //   36	398	6	localTintTypedArray	TintTypedArray
    //   81	176	7	i	int
    //   111	223	8	localObject	Object
    //   141	33	9	localTheme1	Resources.Theme
    //   181	1	9	localException1	Exception
    //   193	14	9	localException2	Exception
    //   227	1	9	localTheme2	Resources.Theme
    // Exception table:
    //   from	to	target	type
    //   147	156	181	java/lang/Exception
    //   160	169	181	java/lang/Exception
    //   123	135	186	finally
    //   123	135	193	java/lang/Exception
    //   147	156	232	finally
    //   160	169	232	finally
    //   202	212	232	finally
  }
  
  public int compatMeasureContentWidth(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
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
      paramDrawable.getPadding(mTempRect);
      paramSpinnerAdapter = mTempRect;
      i1 = m + (left + right);
    }
    return i1;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.applySupportBackgroundTint();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getHorizontalOffset();
    }
    return super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset()
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getVerticalOffset();
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    if (mPopup != null) {
      return mDropDownWidth;
    }
    return super.getDropDownWidth();
  }
  
  @VisibleForTesting
  public final SpinnerPopup getInternalPopup()
  {
    return mPopup;
  }
  
  public Drawable getPopupBackground()
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getBackground();
    }
    return super.getPopupBackground();
  }
  
  public Context getPopupContext()
  {
    return mPopupContext;
  }
  
  public CharSequence getPrompt()
  {
    Object localObject = mPopup;
    if (localObject != null) {
      localObject = ((SpinnerPopup)localObject).getHintText();
    } else {
      localObject = super.getPrompt();
    }
    return (CharSequence)localObject;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    SpinnerPopup localSpinnerPopup = mPopup;
    if ((localSpinnerPopup != null) && (localSpinnerPopup.isShowing())) {
      mPopup.dismiss();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((mPopup != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (mShowDropdown)
    {
      paramParcelable = getViewTreeObserver();
      if (paramParcelable != null) {
        paramParcelable.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
        {
          public void onGlobalLayout()
          {
            if (!getInternalPopup().isShowing()) {
              showPopup();
            }
            ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
            if (localViewTreeObserver != null) {
              AppCompatSpinner.Api16Impl.removeOnGlobalLayoutListener(localViewTreeObserver, this);
            }
          }
        });
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    SpinnerPopup localSpinnerPopup = mPopup;
    boolean bool;
    if ((localSpinnerPopup != null) && (localSpinnerPopup.isShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    mShowDropdown = bool;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ForwardingListener localForwardingListener = mForwardingListener;
    if ((localForwardingListener != null) && (localForwardingListener.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      if (!localSpinnerPopup.isShowing()) {
        showPopup();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!mPopupSet)
    {
      mTempAdapter = paramSpinnerAdapter;
      return;
    }
    super.setAdapter(paramSpinnerAdapter);
    if (mPopup != null)
    {
      Context localContext1 = mPopupContext;
      Context localContext2 = localContext1;
      if (localContext1 == null) {
        localContext2 = getContext();
      }
      mPopup.setAdapter(new DropDownAdapter(paramSpinnerAdapter, localContext2.getTheme()));
    }
  }
  
  public void setBackgroundDrawable(@Nullable Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.onSetBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(@DrawableRes int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.onSetBackgroundResource(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.setHorizontalOriginalOffset(paramInt);
      mPopup.setHorizontalOffset(paramInt);
    }
    else
    {
      super.setDropDownHorizontalOffset(paramInt);
    }
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setVerticalOffset(paramInt);
    } else {
      super.setDropDownVerticalOffset(paramInt);
    }
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (mPopup != null) {
      mDropDownWidth = paramInt;
    } else {
      super.setDropDownWidth(paramInt);
    }
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setBackgroundDrawable(paramDrawable);
    } else {
      super.setPopupBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setPopupBackgroundResource(@DrawableRes int paramInt)
  {
    setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      localSpinnerPopup.setPromptText(paramCharSequence);
    } else {
      super.setPrompt(paramCharSequence);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportBackgroundTintList(@Nullable ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void showPopup()
  {
    mPopup.show(Api17Impl.getTextDirection(this), Api17Impl.getTextAlignment(this));
  }
  
  @RequiresApi(16)
  public static final class Api16Impl
  {
    @DoNotInline
    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver paramViewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
  }
  
  @RequiresApi(17)
  public static final class Api17Impl
  {
    @DoNotInline
    public static int getTextAlignment(@NonNull View paramView)
    {
      return paramView.getTextAlignment();
    }
    
    @DoNotInline
    public static int getTextDirection(@NonNull View paramView)
    {
      return paramView.getTextDirection();
    }
    
    @DoNotInline
    public static void setTextAlignment(@NonNull View paramView, int paramInt)
    {
      paramView.setTextAlignment(paramInt);
    }
    
    @DoNotInline
    public static void setTextDirection(@NonNull View paramView, int paramInt)
    {
      paramView.setTextDirection(paramInt);
    }
  }
  
  @RequiresApi(23)
  public static final class Api23Impl
  {
    @DoNotInline
    public static void setDropDownViewTheme(@NonNull android.widget.ThemedSpinnerAdapter paramThemedSpinnerAdapter, @Nullable Resources.Theme paramTheme)
    {
      if (paramThemedSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
        paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme);
      }
    }
  }
  
  @VisibleForTesting
  public class DialogPopup
    implements AppCompatSpinner.SpinnerPopup, DialogInterface.OnClickListener
  {
    private ListAdapter mListAdapter;
    @VisibleForTesting
    public AlertDialog mPopup;
    private CharSequence mPrompt;
    
    public DialogPopup() {}
    
    public void dismiss()
    {
      AlertDialog localAlertDialog = mPopup;
      if (localAlertDialog != null)
      {
        localAlertDialog.dismiss();
        mPopup = null;
      }
    }
    
    public Drawable getBackground()
    {
      return null;
    }
    
    public CharSequence getHintText()
    {
      return mPrompt;
    }
    
    public int getHorizontalOffset()
    {
      return 0;
    }
    
    public int getHorizontalOriginalOffset()
    {
      return 0;
    }
    
    public int getVerticalOffset()
    {
      return 0;
    }
    
    public boolean isShowing()
    {
      AlertDialog localAlertDialog = mPopup;
      boolean bool;
      if (localAlertDialog != null) {
        bool = localAlertDialog.isShowing();
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      setSelection(paramInt);
      if (getOnItemClickListener() != null) {
        performItemClick(null, paramInt, mListAdapter.getItemId(paramInt));
      }
      dismiss();
    }
    
    public void setAdapter(ListAdapter paramListAdapter)
    {
      mListAdapter = paramListAdapter;
    }
    
    public void setBackgroundDrawable(Drawable paramDrawable)
    {
      Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public void setHorizontalOffset(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public void setHorizontalOriginalOffset(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
    
    public void setPromptText(CharSequence paramCharSequence)
    {
      mPrompt = paramCharSequence;
    }
    
    public void setVerticalOffset(int paramInt)
    {
      Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public void show(int paramInt1, int paramInt2)
    {
      if (mListAdapter == null) {
        return;
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getPopupContext());
      Object localObject = mPrompt;
      if (localObject != null) {
        localBuilder.setTitle((CharSequence)localObject);
      }
      localObject = localBuilder.setSingleChoiceItems(mListAdapter, getSelectedItemPosition(), this).create();
      mPopup = ((AlertDialog)localObject);
      localObject = ((AlertDialog)localObject).getListView();
      AppCompatSpinner.Api17Impl.setTextDirection((View)localObject, paramInt1);
      AppCompatSpinner.Api17Impl.setTextAlignment((View)localObject, paramInt2);
      mPopup.show();
    }
  }
  
  public static class DropDownAdapter
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter mAdapter;
    private ListAdapter mListAdapter;
    
    public DropDownAdapter(@Nullable SpinnerAdapter paramSpinnerAdapter, @Nullable Resources.Theme paramTheme)
    {
      mAdapter = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        mListAdapter = ((ListAdapter)paramSpinnerAdapter);
      }
      if (paramTheme != null) {
        if ((paramSpinnerAdapter instanceof android.widget.ThemedSpinnerAdapter))
        {
          AppCompatSpinner.Api23Impl.setDropDownViewTheme((android.widget.ThemedSpinnerAdapter)paramSpinnerAdapter, paramTheme);
        }
        else if ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter))
        {
          paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
          if (paramSpinnerAdapter.getDropDownViewTheme() == null) {
            paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
          }
        }
      }
    }
    
    public boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = mListAdapter;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public int getCount()
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      int i;
      if (localSpinnerAdapter == null) {
        i = 0;
      } else {
        i = localSpinnerAdapter.getCount();
      }
      return i;
    }
    
    public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      if (localSpinnerAdapter == null) {
        paramView = null;
      } else {
        paramView = localSpinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
      }
      return paramView;
    }
    
    public Object getItem(int paramInt)
    {
      Object localObject = mAdapter;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((Adapter)localObject).getItem(paramInt);
      }
      return localObject;
    }
    
    public long getItemId(int paramInt)
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      long l;
      if (localSpinnerAdapter == null) {
        l = -1L;
      } else {
        l = localSpinnerAdapter.getItemId(paramInt);
      }
      return l;
    }
    
    public int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public int getViewTypeCount()
    {
      return 1;
    }
    
    public boolean hasStableIds()
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      boolean bool;
      if ((localSpinnerAdapter != null) && (localSpinnerAdapter.hasStableIds())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isEmpty()
    {
      boolean bool;
      if (getCount() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = mListAdapter;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      if (localSpinnerAdapter != null) {
        localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      SpinnerAdapter localSpinnerAdapter = mAdapter;
      if (localSpinnerAdapter != null) {
        localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  @VisibleForTesting
  public class DropdownPopup
    extends ListPopupWindow
    implements AppCompatSpinner.SpinnerPopup
  {
    public ListAdapter mAdapter;
    private CharSequence mHintText;
    private int mOriginalHorizontalOffset;
    private final Rect mVisibleRect = new Rect();
    
    public DropdownPopup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      setAnchorView(AppCompatSpinner.this);
      setModal(true);
      setPromptPosition(0);
      setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          setSelection(paramAnonymousInt);
          if (getOnItemClickListener() != null)
          {
            paramAnonymousAdapterView = AppCompatSpinner.DropdownPopup.this;
            this$0.performItemClick(paramAnonymousView, paramAnonymousInt, mAdapter.getItemId(paramAnonymousInt));
          }
          dismiss();
        }
      });
    }
    
    public void computeContentWidth()
    {
      Object localObject = getBackground();
      int i = 0;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(mTempRect);
        if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
          i = mTempRect.right;
        } else {
          i = -mTempRect.left;
        }
      }
      else
      {
        localObject = mTempRect;
        right = 0;
        left = 0;
      }
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = getWidth();
      localObject = AppCompatSpinner.this;
      int n = mDropDownWidth;
      if (n == -2)
      {
        int i1 = ((AppCompatSpinner)localObject).compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
        n = getContext().getResources().getDisplayMetrics().widthPixels;
        localObject = mTempRect;
        int i2 = n - left - right;
        n = i1;
        if (i1 > i2) {
          n = i2;
        }
        setContentWidth(Math.max(n, m - j - k));
      }
      else if (n == -1)
      {
        setContentWidth(m - j - k);
      }
      else
      {
        setContentWidth(n);
      }
      if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
        i = m - k - getWidth() - getHorizontalOriginalOffset() + i;
      } else {
        i = j + getHorizontalOriginalOffset() + i;
      }
      setHorizontalOffset(i);
    }
    
    public CharSequence getHintText()
    {
      return mHintText;
    }
    
    public int getHorizontalOriginalOffset()
    {
      return mOriginalHorizontalOffset;
    }
    
    public boolean isVisibleToUser(View paramView)
    {
      boolean bool;
      if ((ViewCompat.isAttachedToWindow(paramView)) && (paramView.getGlobalVisibleRect(mVisibleRect))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void setAdapter(ListAdapter paramListAdapter)
    {
      super.setAdapter(paramListAdapter);
      mAdapter = paramListAdapter;
    }
    
    public void setHorizontalOriginalOffset(int paramInt)
    {
      mOriginalHorizontalOffset = paramInt;
    }
    
    public void setPromptText(CharSequence paramCharSequence)
    {
      mHintText = paramCharSequence;
    }
    
    public void show(int paramInt1, int paramInt2)
    {
      boolean bool = isShowing();
      computeContentWidth();
      setInputMethodMode(2);
      super.show();
      Object localObject = getListView();
      ((AbsListView)localObject).setChoiceMode(1);
      AppCompatSpinner.Api17Impl.setTextDirection((View)localObject, paramInt1);
      AppCompatSpinner.Api17Impl.setTextAlignment((View)localObject, paramInt2);
      setSelection(getSelectedItemPosition());
      if (bool) {
        return;
      }
      localObject = getViewTreeObserver();
      if (localObject != null)
      {
        final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
        {
          public void onGlobalLayout()
          {
            AppCompatSpinner.DropdownPopup localDropdownPopup = AppCompatSpinner.DropdownPopup.this;
            if (!localDropdownPopup.isVisibleToUser(this$0))
            {
              dismiss();
            }
            else
            {
              computeContentWidth();
              AppCompatSpinner.DropdownPopup.access$001(AppCompatSpinner.DropdownPopup.this);
            }
          }
        };
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
        setOnDismissListener(new PopupWindow.OnDismissListener()
        {
          public void onDismiss()
          {
            ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
            if (localViewTreeObserver != null) {
              localViewTreeObserver.removeGlobalOnLayoutListener(local2);
            }
          }
        });
      }
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public AppCompatSpinner.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new AppCompatSpinner.SavedState(paramAnonymousParcel);
      }
      
      public AppCompatSpinner.SavedState[] newArray(int paramAnonymousInt)
      {
        return new AppCompatSpinner.SavedState[paramAnonymousInt];
      }
    };
    public boolean mShowDropdown;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      boolean bool;
      if (paramParcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      mShowDropdown = bool;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeByte((byte)mShowDropdown);
    }
  }
  
  @VisibleForTesting
  public static abstract interface SpinnerPopup
  {
    public abstract void dismiss();
    
    public abstract Drawable getBackground();
    
    public abstract CharSequence getHintText();
    
    public abstract int getHorizontalOffset();
    
    public abstract int getHorizontalOriginalOffset();
    
    public abstract int getVerticalOffset();
    
    public abstract boolean isShowing();
    
    public abstract void setAdapter(ListAdapter paramListAdapter);
    
    public abstract void setBackgroundDrawable(Drawable paramDrawable);
    
    public abstract void setHorizontalOffset(int paramInt);
    
    public abstract void setHorizontalOriginalOffset(int paramInt);
    
    public abstract void setPromptText(CharSequence paramCharSequence);
    
    public abstract void setVerticalOffset(int paramInt);
    
    public abstract void show(int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */