package androidx.emoji2.text;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class MetadataRepo$Node
{
  private final SparseArray<Node> mChildren;
  private EmojiMetadata mData;
  
  private MetadataRepo$Node()
  {
    this(1);
  }
  
  public MetadataRepo$Node(int paramInt)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataRepo.Node
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */