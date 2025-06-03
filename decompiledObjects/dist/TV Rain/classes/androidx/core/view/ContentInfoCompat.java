package androidx.core.view;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p0;
import z2;

public final class ContentInfoCompat
{
  public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
  public static final int SOURCE_APP = 0;
  public static final int SOURCE_AUTOFILL = 4;
  public static final int SOURCE_CLIPBOARD = 1;
  public static final int SOURCE_DRAG_AND_DROP = 3;
  public static final int SOURCE_INPUT_METHOD = 2;
  public static final int SOURCE_PROCESS_TEXT = 5;
  @NonNull
  private final Compat mCompat;
  
  public ContentInfoCompat(@NonNull Compat paramCompat)
  {
    mCompat = paramCompat;
  }
  
  @NonNull
  public static ClipData buildClipData(@NonNull ClipDescription paramClipDescription, @NonNull List<ClipData.Item> paramList)
  {
    paramClipDescription = new ClipData(new ClipDescription(paramClipDescription), (ClipData.Item)paramList.get(0));
    for (int i = 1; i < paramList.size(); i++) {
      paramClipDescription.addItem((ClipData.Item)paramList.get(i));
    }
    return paramClipDescription;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static String flagsToString(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      return "FLAG_CONVERT_TO_PLAIN_TEXT";
    }
    return String.valueOf(paramInt);
  }
  
  @NonNull
  public static Pair<ClipData, ClipData> partition(@NonNull ClipData paramClipData, @NonNull androidx.core.util.Predicate<ClipData.Item> paramPredicate)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    while (i < paramClipData.getItemCount())
    {
      ClipData.Item localItem = paramClipData.getItemAt(i);
      Object localObject3;
      if (paramPredicate.test(localItem))
      {
        localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new ArrayList();
        }
        ((ArrayList)localObject3).add(localItem);
        localObject1 = localObject3;
      }
      else
      {
        localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = new ArrayList();
        }
        ((ArrayList)localObject3).add(localItem);
        localObject2 = localObject3;
      }
      i++;
    }
    if (localObject1 == null) {
      return Pair.create(null, paramClipData);
    }
    if (localObject2 == null) {
      return Pair.create(paramClipData, null);
    }
    return Pair.create(buildClipData(paramClipData.getDescription(), (List)localObject1), buildClipData(paramClipData.getDescription(), (List)localObject2));
  }
  
  @NonNull
  @RequiresApi(31)
  public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo paramContentInfo, @NonNull java.util.function.Predicate<ClipData.Item> paramPredicate)
  {
    return Api31Impl.partition(paramContentInfo, paramPredicate);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static String sourceToString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5) {
                return String.valueOf(paramInt);
              }
              return "SOURCE_PROCESS_TEXT";
            }
            return "SOURCE_AUTOFILL";
          }
          return "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
      }
      return "SOURCE_CLIPBOARD";
    }
    return "SOURCE_APP";
  }
  
  @NonNull
  @RequiresApi(31)
  public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo paramContentInfo)
  {
    return new ContentInfoCompat(new Compat31Impl(paramContentInfo));
  }
  
  @NonNull
  public ClipData getClip()
  {
    return mCompat.getClip();
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mCompat.getExtras();
  }
  
  public int getFlags()
  {
    return mCompat.getFlags();
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mCompat.getLinkUri();
  }
  
  public int getSource()
  {
    return mCompat.getSource();
  }
  
  @NonNull
  public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull androidx.core.util.Predicate<ClipData.Item> paramPredicate)
  {
    ClipData localClipData = mCompat.getClip();
    int i = localClipData.getItemCount();
    ContentInfoCompat localContentInfoCompat = null;
    if (i == 1)
    {
      boolean bool = paramPredicate.test(localClipData.getItemAt(0));
      if (bool) {
        paramPredicate = this;
      } else {
        paramPredicate = null;
      }
      if (!bool) {
        localContentInfoCompat = this;
      }
      return Pair.create(paramPredicate, localContentInfoCompat);
    }
    paramPredicate = partition(localClipData, paramPredicate);
    if (first == null) {
      return Pair.create(null, this);
    }
    if (second == null) {
      return Pair.create(this, null);
    }
    return Pair.create(new Builder(this).setClip((ClipData)first).build(), new Builder(this).setClip((ClipData)second).build());
  }
  
  @NonNull
  @RequiresApi(31)
  public ContentInfo toContentInfo()
  {
    ContentInfo localContentInfo1 = mCompat.getWrapped();
    Objects.requireNonNull(localContentInfo1);
    ContentInfo localContentInfo2 = (ContentInfo)localContentInfo1;
    return localContentInfo1;
  }
  
  @NonNull
  public String toString()
  {
    return mCompat.toString();
  }
  
  @RequiresApi(31)
  public static final class Api31Impl
  {
    @DoNotInline
    @NonNull
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo paramContentInfo, @NonNull java.util.function.Predicate<ClipData.Item> paramPredicate)
    {
      ClipData localClipData = paramContentInfo.getClip();
      if (localClipData.getItemCount() == 1)
      {
        boolean bool = paramPredicate.test(localClipData.getItemAt(0));
        if (bool) {
          paramPredicate = paramContentInfo;
        } else {
          paramPredicate = null;
        }
        if (bool) {
          paramContentInfo = null;
        }
        return Pair.create(paramPredicate, paramContentInfo);
      }
      Objects.requireNonNull(paramPredicate);
      paramPredicate = ContentInfoCompat.partition(localClipData, new p0(paramPredicate));
      if (first == null) {
        return Pair.create(null, paramContentInfo);
      }
      if (second == null) {
        return Pair.create(paramContentInfo, null);
      }
      return Pair.create(new ContentInfo.Builder(paramContentInfo).setClip((ClipData)first).build(), new ContentInfo.Builder(paramContentInfo).setClip((ClipData)second).build());
    }
  }
  
  public static final class Builder
  {
    @NonNull
    private final ContentInfoCompat.BuilderCompat mBuilderCompat;
    
    public Builder(@NonNull ClipData paramClipData, int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 31) {
        mBuilderCompat = new ContentInfoCompat.BuilderCompat31Impl(paramClipData, paramInt);
      } else {
        mBuilderCompat = new ContentInfoCompat.BuilderCompatImpl(paramClipData, paramInt);
      }
    }
    
    public Builder(@NonNull ContentInfoCompat paramContentInfoCompat)
    {
      if (Build.VERSION.SDK_INT >= 31) {
        mBuilderCompat = new ContentInfoCompat.BuilderCompat31Impl(paramContentInfoCompat);
      } else {
        mBuilderCompat = new ContentInfoCompat.BuilderCompatImpl(paramContentInfoCompat);
      }
    }
    
    @NonNull
    public ContentInfoCompat build()
    {
      return mBuilderCompat.build();
    }
    
    @NonNull
    public Builder setClip(@NonNull ClipData paramClipData)
    {
      mBuilderCompat.setClip(paramClipData);
      return this;
    }
    
    @NonNull
    public Builder setExtras(@Nullable Bundle paramBundle)
    {
      mBuilderCompat.setExtras(paramBundle);
      return this;
    }
    
    @NonNull
    public Builder setFlags(int paramInt)
    {
      mBuilderCompat.setFlags(paramInt);
      return this;
    }
    
    @NonNull
    public Builder setLinkUri(@Nullable Uri paramUri)
    {
      mBuilderCompat.setLinkUri(paramUri);
      return this;
    }
    
    @NonNull
    public Builder setSource(int paramInt)
    {
      mBuilderCompat.setSource(paramInt);
      return this;
    }
  }
  
  public static abstract interface BuilderCompat
  {
    @NonNull
    public abstract ContentInfoCompat build();
    
    public abstract void setClip(@NonNull ClipData paramClipData);
    
    public abstract void setExtras(@Nullable Bundle paramBundle);
    
    public abstract void setFlags(int paramInt);
    
    public abstract void setLinkUri(@Nullable Uri paramUri);
    
    public abstract void setSource(int paramInt);
  }
  
  @RequiresApi(31)
  public static final class BuilderCompat31Impl
    implements ContentInfoCompat.BuilderCompat
  {
    @NonNull
    private final ContentInfo.Builder mPlatformBuilder;
    
    public BuilderCompat31Impl(@NonNull ClipData paramClipData, int paramInt)
    {
      mPlatformBuilder = new ContentInfo.Builder(paramClipData, paramInt);
    }
    
    public BuilderCompat31Impl(@NonNull ContentInfoCompat paramContentInfoCompat)
    {
      mPlatformBuilder = new ContentInfo.Builder(paramContentInfoCompat.toContentInfo());
    }
    
    @NonNull
    public ContentInfoCompat build()
    {
      return new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(mPlatformBuilder.build()));
    }
    
    public void setClip(@NonNull ClipData paramClipData)
    {
      mPlatformBuilder.setClip(paramClipData);
    }
    
    public void setExtras(@Nullable Bundle paramBundle)
    {
      mPlatformBuilder.setExtras(paramBundle);
    }
    
    public void setFlags(int paramInt)
    {
      mPlatformBuilder.setFlags(paramInt);
    }
    
    public void setLinkUri(@Nullable Uri paramUri)
    {
      mPlatformBuilder.setLinkUri(paramUri);
    }
    
    public void setSource(int paramInt)
    {
      mPlatformBuilder.setSource(paramInt);
    }
  }
  
  public static final class BuilderCompatImpl
    implements ContentInfoCompat.BuilderCompat
  {
    @NonNull
    public ClipData mClip;
    @Nullable
    public Bundle mExtras;
    public int mFlags;
    @Nullable
    public Uri mLinkUri;
    public int mSource;
    
    public BuilderCompatImpl(@NonNull ClipData paramClipData, int paramInt)
    {
      mClip = paramClipData;
      mSource = paramInt;
    }
    
    public BuilderCompatImpl(@NonNull ContentInfoCompat paramContentInfoCompat)
    {
      mClip = paramContentInfoCompat.getClip();
      mSource = paramContentInfoCompat.getSource();
      mFlags = paramContentInfoCompat.getFlags();
      mLinkUri = paramContentInfoCompat.getLinkUri();
      mExtras = paramContentInfoCompat.getExtras();
    }
    
    @NonNull
    public ContentInfoCompat build()
    {
      return new ContentInfoCompat(new ContentInfoCompat.CompatImpl(this));
    }
    
    public void setClip(@NonNull ClipData paramClipData)
    {
      mClip = paramClipData;
    }
    
    public void setExtras(@Nullable Bundle paramBundle)
    {
      mExtras = paramBundle;
    }
    
    public void setFlags(int paramInt)
    {
      mFlags = paramInt;
    }
    
    public void setLinkUri(@Nullable Uri paramUri)
    {
      mLinkUri = paramUri;
    }
    
    public void setSource(int paramInt)
    {
      mSource = paramInt;
    }
  }
  
  public static abstract interface Compat
  {
    @NonNull
    public abstract ClipData getClip();
    
    @Nullable
    public abstract Bundle getExtras();
    
    public abstract int getFlags();
    
    @Nullable
    public abstract Uri getLinkUri();
    
    public abstract int getSource();
    
    @Nullable
    public abstract ContentInfo getWrapped();
  }
  
  @RequiresApi(31)
  public static final class Compat31Impl
    implements ContentInfoCompat.Compat
  {
    @NonNull
    private final ContentInfo mWrapped;
    
    public Compat31Impl(@NonNull ContentInfo paramContentInfo)
    {
      mWrapped = ((ContentInfo)Preconditions.checkNotNull(paramContentInfo));
    }
    
    @NonNull
    public ClipData getClip()
    {
      return mWrapped.getClip();
    }
    
    @Nullable
    public Bundle getExtras()
    {
      return mWrapped.getExtras();
    }
    
    public int getFlags()
    {
      return mWrapped.getFlags();
    }
    
    @Nullable
    public Uri getLinkUri()
    {
      return mWrapped.getLinkUri();
    }
    
    public int getSource()
    {
      return mWrapped.getSource();
    }
    
    @NonNull
    public ContentInfo getWrapped()
    {
      return mWrapped;
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("ContentInfoCompat{");
      localStringBuilder.append(mWrapped);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
  
  public static final class CompatImpl
    implements ContentInfoCompat.Compat
  {
    @NonNull
    private final ClipData mClip;
    @Nullable
    private final Bundle mExtras;
    private final int mFlags;
    @Nullable
    private final Uri mLinkUri;
    private final int mSource;
    
    public CompatImpl(ContentInfoCompat.BuilderCompatImpl paramBuilderCompatImpl)
    {
      mClip = ((ClipData)Preconditions.checkNotNull(mClip));
      mSource = Preconditions.checkArgumentInRange(mSource, 0, 5, "source");
      mFlags = Preconditions.checkFlagsArgument(mFlags, 1);
      mLinkUri = mLinkUri;
      mExtras = mExtras;
    }
    
    @NonNull
    public ClipData getClip()
    {
      return mClip;
    }
    
    @Nullable
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    public int getFlags()
    {
      return mFlags;
    }
    
    @Nullable
    public Uri getLinkUri()
    {
      return mLinkUri;
    }
    
    public int getSource()
    {
      return mSource;
    }
    
    @Nullable
    public ContentInfo getWrapped()
    {
      return null;
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("ContentInfoCompat{clip=");
      localStringBuilder.append(mClip.getDescription());
      localStringBuilder.append(", source=");
      localStringBuilder.append(ContentInfoCompat.sourceToString(mSource));
      localStringBuilder.append(", flags=");
      localStringBuilder.append(ContentInfoCompat.flagsToString(mFlags));
      Object localObject = mLinkUri;
      String str = "";
      if (localObject == null)
      {
        localObject = "";
      }
      else
      {
        localObject = z2.t(", hasLinkUri(");
        ((StringBuilder)localObject).append(mLinkUri.toString().length());
        ((StringBuilder)localObject).append(")");
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append((String)localObject);
      if (mExtras == null) {
        localObject = str;
      } else {
        localObject = ", hasExtras";
      }
      return z2.s(localStringBuilder, (String)localObject, "}");
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Flags {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Source {}
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */