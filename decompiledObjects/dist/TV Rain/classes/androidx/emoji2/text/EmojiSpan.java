package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(19)
public abstract class EmojiSpan
  extends ReplacementSpan
{
  private short mHeight = (short)-1;
  @NonNull
  private final EmojiMetadata mMetadata;
  private float mRatio = 1.0F;
  private final Paint.FontMetricsInt mTmpFontMetrics = new Paint.FontMetricsInt();
  private short mWidth = (short)-1;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public EmojiSpan(@NonNull EmojiMetadata paramEmojiMetadata)
  {
    Preconditions.checkNotNull(paramEmojiMetadata, "metadata cannot be null");
    mMetadata = paramEmojiMetadata;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public final int getHeight()
  {
    return mHeight;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public final int getId()
  {
    return getMetadata().getId();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final EmojiMetadata getMetadata()
  {
    return mMetadata;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public final float getRatio()
  {
    return mRatio;
  }
  
  public int getSize(@NonNull Paint paramPaint, @SuppressLint({"UnknownNullness"}) CharSequence paramCharSequence, int paramInt1, int paramInt2, @Nullable Paint.FontMetricsInt paramFontMetricsInt)
  {
    paramPaint.getFontMetricsInt(mTmpFontMetrics);
    paramPaint = mTmpFontMetrics;
    mRatio = (Math.abs(descent - ascent) * 1.0F / mMetadata.getHeight());
    mHeight = ((short)(short)(int)(mMetadata.getHeight() * mRatio));
    paramInt1 = (short)(int)(mMetadata.getWidth() * mRatio);
    mWidth = ((short)paramInt1);
    if (paramFontMetricsInt != null)
    {
      paramPaint = mTmpFontMetrics;
      ascent = ascent;
      descent = descent;
      top = top;
      bottom = bottom;
    }
    return paramInt1;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public final int getWidth()
  {
    return mWidth;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiSpan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */