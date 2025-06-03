package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.List;
import z2;

public final class FontRequest
{
  private final List<List<byte[]>> mCertificates;
  private final int mCertificatesArray;
  private final String mIdentifier;
  private final String mProviderAuthority;
  private final String mProviderPackage;
  private final String mQuery;
  
  public FontRequest(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @ArrayRes int paramInt)
  {
    mProviderAuthority = ((String)Preconditions.checkNotNull(paramString1));
    mProviderPackage = ((String)Preconditions.checkNotNull(paramString2));
    mQuery = ((String)Preconditions.checkNotNull(paramString3));
    mCertificates = null;
    boolean bool;
    if (paramInt != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mCertificatesArray = paramInt;
    mIdentifier = createIdentifier(paramString1, paramString2, paramString3);
  }
  
  public FontRequest(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @NonNull List<List<byte[]>> paramList)
  {
    mProviderAuthority = ((String)Preconditions.checkNotNull(paramString1));
    mProviderPackage = ((String)Preconditions.checkNotNull(paramString2));
    mQuery = ((String)Preconditions.checkNotNull(paramString3));
    mCertificates = ((List)Preconditions.checkNotNull(paramList));
    mCertificatesArray = 0;
    mIdentifier = createIdentifier(paramString1, paramString2, paramString3);
  }
  
  private String createIdentifier(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3)
  {
    paramString1 = new StringBuilder(paramString1);
    paramString1.append("-");
    paramString1.append(paramString2);
    paramString1.append("-");
    paramString1.append(paramString3);
    return paramString1.toString();
  }
  
  @Nullable
  public List<List<byte[]>> getCertificates()
  {
    return mCertificates;
  }
  
  @ArrayRes
  public int getCertificatesArrayResId()
  {
    return mCertificatesArray;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public String getId()
  {
    return mIdentifier;
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public String getIdentifier()
  {
    return mIdentifier;
  }
  
  @NonNull
  public String getProviderAuthority()
  {
    return mProviderAuthority;
  }
  
  @NonNull
  public String getProviderPackage()
  {
    return mProviderPackage;
  }
  
  @NonNull
  public String getQuery()
  {
    return mQuery;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = z2.t("FontRequest {mProviderAuthority: ");
    ((StringBuilder)localObject).append(mProviderAuthority);
    ((StringBuilder)localObject).append(", mProviderPackage: ");
    ((StringBuilder)localObject).append(mProviderPackage);
    ((StringBuilder)localObject).append(", mQuery: ");
    ((StringBuilder)localObject).append(mQuery);
    ((StringBuilder)localObject).append(", mCertificates:");
    localStringBuilder.append(((StringBuilder)localObject).toString());
    for (int i = 0; i < mCertificates.size(); i++)
    {
      localStringBuilder.append(" [");
      localObject = (List)mCertificates.get(i);
      for (int j = 0; j < ((List)localObject).size(); j++)
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])((List)localObject).get(j), 0));
        localStringBuilder.append("\"");
      }
      localStringBuilder.append(" ]");
    }
    localStringBuilder.append("}");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mCertificatesArray: ");
    ((StringBuilder)localObject).append(mCertificatesArray);
    localStringBuilder.append(((StringBuilder)localObject).toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.FontRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */