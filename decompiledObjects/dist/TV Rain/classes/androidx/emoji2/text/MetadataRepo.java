package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi(19)
public final class MetadataRepo
{
  private static final int DEFAULT_ROOT_SIZE = 1024;
  private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
  @NonNull
  private final char[] mEmojiCharArray;
  @NonNull
  private final MetadataList mMetadataList;
  @NonNull
  private final Node mRootNode;
  @NonNull
  private final Typeface mTypeface;
  
  private MetadataRepo(@NonNull Typeface paramTypeface, @NonNull MetadataList paramMetadataList)
  {
    mTypeface = paramTypeface;
    mMetadataList = paramMetadataList;
    mRootNode = new Node(1024);
    mEmojiCharArray = new char[paramMetadataList.listLength() * 2];
    constructIndex(paramMetadataList);
  }
  
  private void constructIndex(MetadataList paramMetadataList)
  {
    int i = paramMetadataList.listLength();
    for (int j = 0; j < i; j++)
    {
      paramMetadataList = new EmojiMetadata(this, j);
      Character.toChars(paramMetadataList.getId(), mEmojiCharArray, j * 2);
      put(paramMetadataList);
    }
  }
  
  @NonNull
  public static MetadataRepo create(@NonNull AssetManager paramAssetManager, @NonNull String paramString)
    throws IOException
  {
    try
    {
      TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
      paramAssetManager = new MetadataRepo(Typeface.createFromAsset(paramAssetManager, paramString), MetadataListReader.read(paramAssetManager, paramString));
      return paramAssetManager;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public static MetadataRepo create(@NonNull Typeface paramTypeface)
  {
    try
    {
      TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
      MetadataList localMetadataList = new androidx/emoji2/text/flatbuffer/MetadataList;
      localMetadataList.<init>();
      paramTypeface = new MetadataRepo(paramTypeface, localMetadataList);
      return paramTypeface;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  @NonNull
  public static MetadataRepo create(@NonNull Typeface paramTypeface, @NonNull InputStream paramInputStream)
    throws IOException
  {
    try
    {
      TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
      paramTypeface = new MetadataRepo(paramTypeface, MetadataListReader.read(paramInputStream));
      return paramTypeface;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  @NonNull
  public static MetadataRepo create(@NonNull Typeface paramTypeface, @NonNull ByteBuffer paramByteBuffer)
    throws IOException
  {
    try
    {
      TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
      paramTypeface = new MetadataRepo(paramTypeface, MetadataListReader.read(paramByteBuffer));
      return paramTypeface;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public char[] getEmojiCharArray()
  {
    return mEmojiCharArray;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MetadataList getMetadataList()
  {
    return mMetadataList;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int getMetadataVersion()
  {
    return mMetadataList.version();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Node getRootNode()
  {
    return mRootNode;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Typeface getTypeface()
  {
    return mTypeface;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting
  public void put(@NonNull EmojiMetadata paramEmojiMetadata)
  {
    Preconditions.checkNotNull(paramEmojiMetadata, "emoji metadata cannot be null");
    boolean bool;
    if (paramEmojiMetadata.getCodepointsLength() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "invalid metadata codepoint length");
    mRootNode.put(paramEmojiMetadata, 0, paramEmojiMetadata.getCodepointsLength() - 1);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class Node
  {
    private final SparseArray<Node> mChildren;
    private EmojiMetadata mData;
    
    private Node()
    {
      this(1);
    }
    
    public Node(int paramInt)
    {
      mChildren = new SparseArray(paramInt);
    }
    
    public Node get(int paramInt)
    {
      Object localObject = mChildren;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = (Node)((SparseArray)localObject).get(paramInt);
      }
      return (Node)localObject;
    }
    
    public final EmojiMetadata getData()
    {
      return mData;
    }
    
    public void put(@NonNull EmojiMetadata paramEmojiMetadata, int paramInt1, int paramInt2)
    {
      Node localNode1 = get(paramEmojiMetadata.getCodepointAt(paramInt1));
      Node localNode2 = localNode1;
      if (localNode1 == null)
      {
        localNode2 = new Node();
        mChildren.put(paramEmojiMetadata.getCodepointAt(paramInt1), localNode2);
      }
      if (paramInt2 > paramInt1) {
        localNode2.put(paramEmojiMetadata, paramInt1 + 1, paramInt2);
      } else {
        mData = paramEmojiMetadata;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataRepo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */