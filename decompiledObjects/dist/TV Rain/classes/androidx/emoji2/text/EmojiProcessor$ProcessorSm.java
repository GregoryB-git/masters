package androidx.emoji2.text;

import java.util.Arrays;

final class EmojiProcessor$ProcessorSm
{
  private static final int STATE_DEFAULT = 1;
  private static final int STATE_WALKING = 2;
  private int mCurrentDepth;
  private MetadataRepo.Node mCurrentNode;
  private final int[] mEmojiAsDefaultStyleExceptions;
  private MetadataRepo.Node mFlushNode;
  private int mLastCodepoint;
  private final MetadataRepo.Node mRootNode;
  private int mState = 1;
  private final boolean mUseEmojiAsDefaultStyle;
  
  public EmojiProcessor$ProcessorSm(MetadataRepo.Node paramNode, boolean paramBoolean, int[] paramArrayOfInt)
  {
    mRootNode = paramNode;
    mCurrentNode = paramNode;
    mUseEmojiAsDefaultStyle = paramBoolean;
    mEmojiAsDefaultStyleExceptions = paramArrayOfInt;
  }
  
  private static boolean isEmojiStyle(int paramInt)
  {
    boolean bool;
    if (paramInt == 65039) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isTextStyle(int paramInt)
  {
    boolean bool;
    if (paramInt == 65038) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private int reset()
  {
    mState = 1;
    mCurrentNode = mRootNode;
    mCurrentDepth = 0;
    return 1;
  }
  
  private boolean shouldUseEmojiPresentationStyleForSingleCodepoint()
  {
    if (mCurrentNode.getData().isDefaultEmoji()) {
      return true;
    }
    if (isEmojiStyle(mLastCodepoint)) {
      return true;
    }
    if (mUseEmojiAsDefaultStyle)
    {
      if (mEmojiAsDefaultStyleExceptions == null) {
        return true;
      }
      int i = mCurrentNode.getData().getCodepointAt(0);
      if (Arrays.binarySearch(mEmojiAsDefaultStyleExceptions, i) < 0) {
        return true;
      }
    }
    return false;
  }
  
  public int check(int paramInt)
  {
    MetadataRepo.Node localNode = mCurrentNode.get(paramInt);
    int i = mState;
    int j = 3;
    if (i != 2)
    {
      if (localNode == null)
      {
        j = reset();
      }
      else
      {
        mState = 2;
        mCurrentNode = localNode;
        mCurrentDepth = 1;
      }
    }
    else
    {
      do
      {
        for (;;)
        {
          j = 2;
          break label176;
          if (localNode == null) {
            break;
          }
          mCurrentNode = localNode;
          mCurrentDepth += 1;
        }
        if (isTextStyle(paramInt))
        {
          j = reset();
          break;
        }
      } while (isEmojiStyle(paramInt));
      if (mCurrentNode.getData() != null)
      {
        if (mCurrentDepth == 1)
        {
          if (shouldUseEmojiPresentationStyleForSingleCodepoint())
          {
            mFlushNode = mCurrentNode;
            reset();
          }
          else
          {
            j = reset();
          }
        }
        else
        {
          mFlushNode = mCurrentNode;
          reset();
        }
      }
      else {
        j = reset();
      }
    }
    label176:
    mLastCodepoint = paramInt;
    return j;
  }
  
  public EmojiMetadata getCurrentMetadata()
  {
    return mCurrentNode.getData();
  }
  
  public EmojiMetadata getFlushMetadata()
  {
    return mFlushNode.getData();
  }
  
  public boolean isInFlushableState()
  {
    int i = mState;
    boolean bool1 = true;
    if ((i == 2) && (mCurrentNode.getData() != null))
    {
      bool2 = bool1;
      if (mCurrentDepth > 1) {
        return bool2;
      }
      if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
        return bool1;
      }
    }
    boolean bool2 = false;
    return bool2;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor.ProcessorSm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */