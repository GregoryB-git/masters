package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnyThread
@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class EmojiMetadata
{
  public static final int HAS_GLYPH_ABSENT = 1;
  public static final int HAS_GLYPH_EXISTS = 2;
  public static final int HAS_GLYPH_UNKNOWN = 0;
  private static final ThreadLocal<MetadataItem> sMetadataItem = new ThreadLocal();
  private volatile int mHasGlyph = 0;
  private final int mIndex;
  @NonNull
  private final MetadataRepo mMetadataRepo;
  
  public EmojiMetadata(@NonNull MetadataRepo paramMetadataRepo, @IntRange(from=0L) int paramInt)
  {
    mMetadataRepo = paramMetadataRepo;
    mIndex = paramInt;
  }
  
  private MetadataItem getMetadataItem()
  {
    ThreadLocal localThreadLocal = sMetadataItem;
    MetadataItem localMetadataItem1 = (MetadataItem)localThreadLocal.get();
    MetadataItem localMetadataItem2 = localMetadataItem1;
    if (localMetadataItem1 == null)
    {
      localMetadataItem2 = new MetadataItem();
      localThreadLocal.set(localMetadataItem2);
    }
    mMetadataRepo.getMetadataList().list(localMetadataItem2, mIndex);
    return localMetadataItem2;
  }
  
  public void draw(@NonNull Canvas paramCanvas, float paramFloat1, float paramFloat2, @NonNull Paint paramPaint)
  {
    Typeface localTypeface1 = mMetadataRepo.getTypeface();
    Typeface localTypeface2 = paramPaint.getTypeface();
    paramPaint.setTypeface(localTypeface1);
    int i = mIndex;
    paramCanvas.drawText(mMetadataRepo.getEmojiCharArray(), i * 2, 2, paramFloat1, paramFloat2, paramPaint);
    paramPaint.setTypeface(localTypeface2);
  }
  
  public int getCodepointAt(int paramInt)
  {
    return getMetadataItem().codepoints(paramInt);
  }
  
  public int getCodepointsLength()
  {
    return getMetadataItem().codepointsLength();
  }
  
  public short getCompatAdded()
  {
    return getMetadataItem().compatAdded();
  }
  
  @SuppressLint({"KotlinPropertyAccess"})
  public int getHasGlyph()
  {
    return mHasGlyph;
  }
  
  public short getHeight()
  {
    return getMetadataItem().height();
  }
  
  public int getId()
  {
    return getMetadataItem().id();
  }
  
  public short getSdkAdded()
  {
    return getMetadataItem().sdkAdded();
  }
  
  @NonNull
  public Typeface getTypeface()
  {
    return mMetadataRepo.getTypeface();
  }
  
  public short getWidth()
  {
    return getMetadataItem().width();
  }
  
  public boolean isDefaultEmoji()
  {
    return getMetadataItem().emojiStyle();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public void resetHasGlyphCache()
  {
    mHasGlyph = 0;
  }
  
  @SuppressLint({"KotlinPropertyAccess"})
  public void setHasGlyph(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 2;
    } else {
      i = 1;
    }
    mHasGlyph = i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", id:");
    localStringBuilder.append(Integer.toHexString(getId()));
    localStringBuilder.append(", codepoints:");
    int i = getCodepointsLength();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append(Integer.toHexString(getCodepointAt(j)));
      localStringBuilder.append(" ");
    }
    return localStringBuilder.toString();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface HasGlyph {}
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */