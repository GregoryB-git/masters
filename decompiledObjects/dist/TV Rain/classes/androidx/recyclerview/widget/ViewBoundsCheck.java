package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ViewBoundsCheck
{
  public static final int CVE_PVE_POS = 12;
  public static final int CVE_PVS_POS = 8;
  public static final int CVS_PVE_POS = 4;
  public static final int CVS_PVS_POS = 0;
  public static final int EQ = 2;
  public static final int FLAG_CVE_EQ_PVE = 8192;
  public static final int FLAG_CVE_EQ_PVS = 512;
  public static final int FLAG_CVE_GT_PVE = 4096;
  public static final int FLAG_CVE_GT_PVS = 256;
  public static final int FLAG_CVE_LT_PVE = 16384;
  public static final int FLAG_CVE_LT_PVS = 1024;
  public static final int FLAG_CVS_EQ_PVE = 32;
  public static final int FLAG_CVS_EQ_PVS = 2;
  public static final int FLAG_CVS_GT_PVE = 16;
  public static final int FLAG_CVS_GT_PVS = 1;
  public static final int FLAG_CVS_LT_PVE = 64;
  public static final int FLAG_CVS_LT_PVS = 4;
  public static final int GT = 1;
  public static final int LT = 4;
  public static final int MASK = 7;
  public BoundFlags mBoundFlags;
  public final Callback mCallback;
  
  public ViewBoundsCheck(Callback paramCallback)
  {
    mCallback = paramCallback;
    mBoundFlags = new BoundFlags();
  }
  
  public View findOneViewWithinBoundFlags(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = mCallback.getParentStart();
    int j = mCallback.getParentEnd();
    int k;
    if (paramInt2 > paramInt1) {
      k = 1;
    } else {
      k = -1;
    }
    Object localObject2;
    for (Object localObject1 = null; paramInt1 != paramInt2; localObject1 = localObject2)
    {
      View localView = mCallback.getChildAt(paramInt1);
      int m = mCallback.getChildStart(localView);
      int n = mCallback.getChildEnd(localView);
      mBoundFlags.setBounds(i, j, m, n);
      if (paramInt3 != 0)
      {
        mBoundFlags.resetFlags();
        mBoundFlags.addFlags(paramInt3);
        if (mBoundFlags.boundsMatch()) {
          return localView;
        }
      }
      localObject2 = localObject1;
      if (paramInt4 != 0)
      {
        mBoundFlags.resetFlags();
        mBoundFlags.addFlags(paramInt4);
        localObject2 = localObject1;
        if (mBoundFlags.boundsMatch()) {
          localObject2 = localView;
        }
      }
      paramInt1 += k;
    }
    return (View)localObject1;
  }
  
  public boolean isViewWithinBoundFlags(View paramView, int paramInt)
  {
    mBoundFlags.setBounds(mCallback.getParentStart(), mCallback.getParentEnd(), mCallback.getChildStart(paramView), mCallback.getChildEnd(paramView));
    if (paramInt != 0)
    {
      mBoundFlags.resetFlags();
      mBoundFlags.addFlags(paramInt);
      return mBoundFlags.boundsMatch();
    }
    return false;
  }
  
  public static class BoundFlags
  {
    public int mBoundFlags = 0;
    public int mChildEnd;
    public int mChildStart;
    public int mRvEnd;
    public int mRvStart;
    
    public void addFlags(int paramInt)
    {
      mBoundFlags = (paramInt | mBoundFlags);
    }
    
    public boolean boundsMatch()
    {
      int i = mBoundFlags;
      if (((i & 0x7) != 0) && ((i & compare(mChildStart, mRvStart) << 0) == 0)) {
        return false;
      }
      i = mBoundFlags;
      if (((i & 0x70) != 0) && ((i & compare(mChildStart, mRvEnd) << 4) == 0)) {
        return false;
      }
      i = mBoundFlags;
      if (((i & 0x700) != 0) && ((i & compare(mChildEnd, mRvStart) << 8) == 0)) {
        return false;
      }
      i = mBoundFlags;
      return ((i & 0x7000) == 0) || ((i & compare(mChildEnd, mRvEnd) << 12) != 0);
    }
    
    public int compare(int paramInt1, int paramInt2)
    {
      if (paramInt1 > paramInt2) {
        return 1;
      }
      if (paramInt1 == paramInt2) {
        return 2;
      }
      return 4;
    }
    
    public void resetFlags()
    {
      mBoundFlags = 0;
    }
    
    public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      mRvStart = paramInt1;
      mRvEnd = paramInt2;
      mChildStart = paramInt3;
      mChildEnd = paramInt4;
    }
  }
  
  public static abstract interface Callback
  {
    public abstract View getChildAt(int paramInt);
    
    public abstract int getChildEnd(View paramView);
    
    public abstract int getChildStart(View paramView);
    
    public abstract int getParentEnd();
    
    public abstract int getParentStart();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ViewBounds {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewBoundsCheck
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */