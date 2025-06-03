package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.method.ReplacementTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
public class PagerTitleStrip
  extends ViewGroup
{
  private static final int[] ATTRS = { 16842804, 16842901, 16842904, 16842927 };
  private static final float SIDE_ALPHA = 0.6F;
  private static final int[] TEXT_ATTRS = { 16843660 };
  private static final int TEXT_SPACING = 16;
  public TextView mCurrText;
  private int mGravity;
  private int mLastKnownCurrentPage = -1;
  public float mLastKnownPositionOffset = -1.0F;
  public TextView mNextText;
  private int mNonPrimaryAlpha;
  private final PageListener mPageListener = new PageListener();
  public ViewPager mPager;
  public TextView mPrevText;
  private int mScaledTextSpacing;
  public int mTextColor;
  private boolean mUpdatingPositions;
  private boolean mUpdatingText;
  private WeakReference<PagerAdapter> mWatchingAdapter;
  
  public PagerTitleStrip(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PagerTitleStrip(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView = new TextView(paramContext);
    mPrevText = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    mCurrText = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    mNextText = localTextView;
    addView(localTextView);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, ATTRS);
    boolean bool = false;
    int i = paramAttributeSet.getResourceId(0, 0);
    if (i != 0)
    {
      TextViewCompat.setTextAppearance(mPrevText, i);
      TextViewCompat.setTextAppearance(mCurrText, i);
      TextViewCompat.setTextAppearance(mNextText, i);
    }
    int j = paramAttributeSet.getDimensionPixelSize(1, 0);
    if (j != 0) {
      setTextSize(0, j);
    }
    if (paramAttributeSet.hasValue(2))
    {
      j = paramAttributeSet.getColor(2, 0);
      mPrevText.setTextColor(j);
      mCurrText.setTextColor(j);
      mNextText.setTextColor(j);
    }
    mGravity = paramAttributeSet.getInteger(3, 80);
    paramAttributeSet.recycle();
    mTextColor = mCurrText.getTextColors().getDefaultColor();
    setNonPrimaryAlpha(0.6F);
    mPrevText.setEllipsize(TextUtils.TruncateAt.END);
    mCurrText.setEllipsize(TextUtils.TruncateAt.END);
    mNextText.setEllipsize(TextUtils.TruncateAt.END);
    if (i != 0)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(i, TEXT_ATTRS);
      bool = paramAttributeSet.getBoolean(0, false);
      paramAttributeSet.recycle();
    }
    if (bool)
    {
      setSingleLineAllCaps(mPrevText);
      setSingleLineAllCaps(mCurrText);
      setSingleLineAllCaps(mNextText);
    }
    else
    {
      mPrevText.setSingleLine();
      mCurrText.setSingleLine();
      mNextText.setSingleLine();
    }
    mScaledTextSpacing = ((int)(getResourcesgetDisplayMetricsdensity * 16.0F));
  }
  
  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    paramTextView.setTransformationMethod(new SingleLineAllCapsTransform(paramTextView.getContext()));
  }
  
  public int getMinHeight()
  {
    Drawable localDrawable = getBackground();
    int i;
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicHeight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getTextSpacing()
  {
    return mScaledTextSpacing;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    if ((localObject instanceof ViewPager))
    {
      localObject = (ViewPager)localObject;
      PagerAdapter localPagerAdapter = ((ViewPager)localObject).getAdapter();
      ((ViewPager)localObject).setInternalPageChangeListener(mPageListener);
      ((ViewPager)localObject).addOnAdapterChangeListener(mPageListener);
      mPager = ((ViewPager)localObject);
      localObject = mWatchingAdapter;
      if (localObject != null) {
        localObject = (PagerAdapter)((Reference)localObject).get();
      } else {
        localObject = null;
      }
      updateAdapter((PagerAdapter)localObject, localPagerAdapter);
      return;
    }
    throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ViewPager localViewPager = mPager;
    if (localViewPager != null)
    {
      updateAdapter(localViewPager.getAdapter(), null);
      mPager.setInternalPageChangeListener(null);
      mPager.removeOnAdapterChangeListener(mPageListener);
      mPager = null;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (mPager != null)
    {
      float f = mLastKnownPositionOffset;
      if (f < 0.0F) {
        f = 0.0F;
      }
      updateTextPositions(mLastKnownCurrentPage, f, true);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824)
    {
      int i = getPaddingTop();
      int j = getPaddingBottom() + i;
      int k = ViewGroup.getChildMeasureSpec(paramInt2, j, -2);
      i = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, (int)(i * 0.2F), -2);
      mPrevText.measure(paramInt1, k);
      mCurrText.measure(paramInt1, k);
      mNextText.measure(paramInt1, k);
      if (View.MeasureSpec.getMode(paramInt2) == 1073741824)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt2);
      }
      else
      {
        paramInt1 = mCurrText.getMeasuredHeight();
        paramInt1 = Math.max(getMinHeight(), paramInt1 + j);
      }
      setMeasuredDimension(i, View.resolveSizeAndState(paramInt1, paramInt2, mCurrText.getMeasuredState() << 16));
      return;
    }
    throw new IllegalStateException("Must measure with an exact width");
  }
  
  public void requestLayout()
  {
    if (!mUpdatingText) {
      super.requestLayout();
    }
  }
  
  public void setGravity(int paramInt)
  {
    mGravity = paramInt;
    requestLayout();
  }
  
  public void setNonPrimaryAlpha(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    int i = (int)(paramFloat * 255.0F) & 0xFF;
    mNonPrimaryAlpha = i;
    i = i << 24 | mTextColor & 0xFFFFFF;
    mPrevText.setTextColor(i);
    mNextText.setTextColor(i);
  }
  
  public void setTextColor(@ColorInt int paramInt)
  {
    mTextColor = paramInt;
    mCurrText.setTextColor(paramInt);
    paramInt = mNonPrimaryAlpha << 24 | mTextColor & 0xFFFFFF;
    mPrevText.setTextColor(paramInt);
    mNextText.setTextColor(paramInt);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    mPrevText.setTextSize(paramInt, paramFloat);
    mCurrText.setTextSize(paramInt, paramFloat);
    mNextText.setTextSize(paramInt, paramFloat);
  }
  
  public void setTextSpacing(int paramInt)
  {
    mScaledTextSpacing = paramInt;
    requestLayout();
  }
  
  public void updateAdapter(PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
  {
    if (paramPagerAdapter1 != null)
    {
      paramPagerAdapter1.unregisterDataSetObserver(mPageListener);
      mWatchingAdapter = null;
    }
    if (paramPagerAdapter2 != null)
    {
      paramPagerAdapter2.registerDataSetObserver(mPageListener);
      mWatchingAdapter = new WeakReference(paramPagerAdapter2);
    }
    paramPagerAdapter1 = mPager;
    if (paramPagerAdapter1 != null)
    {
      mLastKnownCurrentPage = -1;
      mLastKnownPositionOffset = -1.0F;
      updateText(paramPagerAdapter1.getCurrentItem(), paramPagerAdapter2);
      requestLayout();
    }
  }
  
  public void updateText(int paramInt, PagerAdapter paramPagerAdapter)
  {
    if (paramPagerAdapter != null) {
      i = paramPagerAdapter.getCount();
    } else {
      i = 0;
    }
    mUpdatingText = true;
    Object localObject1 = null;
    if ((paramInt >= 1) && (paramPagerAdapter != null)) {
      localObject2 = paramPagerAdapter.getPageTitle(paramInt - 1);
    } else {
      localObject2 = null;
    }
    mPrevText.setText((CharSequence)localObject2);
    TextView localTextView = mCurrText;
    if ((paramPagerAdapter != null) && (paramInt < i)) {
      localObject2 = paramPagerAdapter.getPageTitle(paramInt);
    } else {
      localObject2 = null;
    }
    localTextView.setText((CharSequence)localObject2);
    int j = paramInt + 1;
    Object localObject2 = localObject1;
    if (j < i)
    {
      localObject2 = localObject1;
      if (paramPagerAdapter != null) {
        localObject2 = paramPagerAdapter.getPageTitle(j);
      }
    }
    mNextText.setText((CharSequence)localObject2);
    int i = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), Integer.MIN_VALUE);
    j = View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), Integer.MIN_VALUE);
    mPrevText.measure(i, j);
    mCurrText.measure(i, j);
    mNextText.measure(i, j);
    mLastKnownCurrentPage = paramInt;
    if (!mUpdatingPositions) {
      updateTextPositions(paramInt, mLastKnownPositionOffset, false);
    }
    mUpdatingText = false;
  }
  
  public void updateTextPositions(int paramInt, float paramFloat, boolean paramBoolean)
  {
    if (paramInt != mLastKnownCurrentPage) {
      updateText(paramInt, mPager.getAdapter());
    } else if ((!paramBoolean) && (paramFloat == mLastKnownPositionOffset)) {
      return;
    }
    mUpdatingPositions = true;
    int i = mPrevText.getMeasuredWidth();
    int j = mCurrText.getMeasuredWidth();
    int k = mNextText.getMeasuredWidth();
    int m = j / 2;
    int n = getWidth();
    int i1 = getHeight();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    paramInt = getPaddingTop();
    int i4 = getPaddingBottom();
    int i5 = i3 + m;
    float f1 = 0.5F + paramFloat;
    float f2 = f1;
    if (f1 > 1.0F) {
      f2 = f1 - 1.0F;
    }
    i5 = n - i5 - (int)((n - (i2 + m) - i5) * f2) - m;
    j += i5;
    int i6 = mPrevText.getBaseline();
    m = mCurrText.getBaseline();
    int i7 = mNextText.getBaseline();
    int i8 = Math.max(Math.max(i6, m), i7);
    i6 = i8 - i6;
    m = i8 - m;
    i8 -= i7;
    i7 = mPrevText.getMeasuredHeight();
    int i9 = mCurrText.getMeasuredHeight();
    int i10 = mNextText.getMeasuredHeight();
    i7 = Math.max(Math.max(i7 + i6, i9 + m), i10 + i8);
    i9 = mGravity & 0x70;
    if (i9 != 16)
    {
      if (i9 != 80)
      {
        i1 = i6 + paramInt;
        i4 = m + paramInt;
        paramInt += i8;
        break label372;
      }
      paramInt = i1 - i4 - i7;
    }
    else
    {
      paramInt = (i1 - paramInt - i4 - i7) / 2;
    }
    i1 = i6 + paramInt;
    i4 = m + paramInt;
    paramInt += i8;
    label372:
    TextView localTextView = mCurrText;
    localTextView.layout(i5, i4, j, localTextView.getMeasuredHeight() + i4);
    i4 = Math.min(i2, i5 - mScaledTextSpacing - i);
    localTextView = mPrevText;
    localTextView.layout(i4, i1, i + i4, localTextView.getMeasuredHeight() + i1);
    i1 = Math.max(n - i3 - k, j + mScaledTextSpacing);
    localTextView = mNextText;
    localTextView.layout(i1, paramInt, i1 + k, localTextView.getMeasuredHeight() + paramInt);
    mLastKnownPositionOffset = paramFloat;
    mUpdatingPositions = false;
  }
  
  public class PageListener
    extends DataSetObserver
    implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
  {
    private int mScrollState;
    
    public PageListener() {}
    
    public void onAdapterChanged(ViewPager paramViewPager, PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
    {
      updateAdapter(paramPagerAdapter1, paramPagerAdapter2);
    }
    
    public void onChanged()
    {
      PagerTitleStrip localPagerTitleStrip = PagerTitleStrip.this;
      localPagerTitleStrip.updateText(mPager.getCurrentItem(), mPager.getAdapter());
      localPagerTitleStrip = PagerTitleStrip.this;
      float f = mLastKnownPositionOffset;
      if (f < 0.0F) {
        f = 0.0F;
      }
      localPagerTitleStrip.updateTextPositions(mPager.getCurrentItem(), f, true);
    }
    
    public void onPageScrollStateChanged(int paramInt)
    {
      mScrollState = paramInt;
    }
    
    public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
    {
      paramInt2 = paramInt1;
      if (paramFloat > 0.5F) {
        paramInt2 = paramInt1 + 1;
      }
      updateTextPositions(paramInt2, paramFloat, false);
    }
    
    public void onPageSelected(int paramInt)
    {
      if (mScrollState == 0)
      {
        PagerTitleStrip localPagerTitleStrip = PagerTitleStrip.this;
        localPagerTitleStrip.updateText(mPager.getCurrentItem(), mPager.getAdapter());
        localPagerTitleStrip = PagerTitleStrip.this;
        float f = mLastKnownPositionOffset;
        if (f < 0.0F) {
          f = 0.0F;
        }
        localPagerTitleStrip.updateTextPositions(mPager.getCurrentItem(), f, true);
      }
    }
  }
  
  public static class SingleLineAllCapsTransform
    extends SingleLineTransformationMethod
  {
    private Locale mLocale;
    
    public SingleLineAllCapsTransform(Context paramContext)
    {
      mLocale = getResourcesgetConfigurationlocale;
    }
    
    public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
    {
      paramCharSequence = super.getTransformation(paramCharSequence, paramView);
      if (paramCharSequence != null) {
        paramCharSequence = paramCharSequence.toString().toUpperCase(mLocale);
      } else {
        paramCharSequence = null;
      }
      return paramCharSequence;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerTitleStrip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */