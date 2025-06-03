package androidx.recyclerview.widget;

import java.util.Arrays;

class StaggeredGridLayoutManager$AnchorInfo
{
  public boolean mInvalidateOffsets;
  public boolean mLayoutFromEnd;
  public int mOffset;
  public int mPosition;
  public int[] mSpanReferenceLines;
  public boolean mValid;
  
  public StaggeredGridLayoutManager$AnchorInfo(StaggeredGridLayoutManager paramStaggeredGridLayoutManager)
  {
    reset();
  }
  
  public void assignCoordinateFromPadding()
  {
    int i;
    if (mLayoutFromEnd) {
      i = this$0.mPrimaryOrientation.getEndAfterPadding();
    } else {
      i = this$0.mPrimaryOrientation.getStartAfterPadding();
    }
    mOffset = i;
  }
  
  public void assignCoordinateFromPadding(int paramInt)
  {
    if (mLayoutFromEnd) {
      mOffset = (this$0.mPrimaryOrientation.getEndAfterPadding() - paramInt);
    } else {
      mOffset = (this$0.mPrimaryOrientation.getStartAfterPadding() + paramInt);
    }
  }
  
  public void reset()
  {
    mPosition = -1;
    mOffset = Integer.MIN_VALUE;
    mLayoutFromEnd = false;
    mInvalidateOffsets = false;
    mValid = false;
    int[] arrayOfInt = mSpanReferenceLines;
    if (arrayOfInt != null) {
      Arrays.fill(arrayOfInt, -1);
    }
  }
  
  public void saveSpanReferenceLines(StaggeredGridLayoutManager.Span[] paramArrayOfSpan)
  {
    int i = paramArrayOfSpan.length;
    int[] arrayOfInt = mSpanReferenceLines;
    if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
      mSpanReferenceLines = new int[this$0.mSpans.length];
    }
    for (int j = 0; j < i; j++) {
      mSpanReferenceLines[j] = paramArrayOfSpan[j].getStartLine(Integer.MIN_VALUE);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.AnchorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */