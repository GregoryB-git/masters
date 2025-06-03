package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@AnyThread
@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiProcessor
{
  private static final int ACTION_ADVANCE_BOTH = 1;
  private static final int ACTION_ADVANCE_END = 2;
  private static final int ACTION_FLUSH = 3;
  @Nullable
  private final int[] mEmojiAsDefaultStyleExceptions;
  @NonNull
  private EmojiCompat.GlyphChecker mGlyphChecker;
  @NonNull
  private final MetadataRepo mMetadataRepo;
  @NonNull
  private final EmojiCompat.SpanFactory mSpanFactory;
  private final boolean mUseEmojiAsDefaultStyle;
  
  public EmojiProcessor(@NonNull MetadataRepo paramMetadataRepo, @NonNull EmojiCompat.SpanFactory paramSpanFactory, @NonNull EmojiCompat.GlyphChecker paramGlyphChecker, boolean paramBoolean, @Nullable int[] paramArrayOfInt)
  {
    mSpanFactory = paramSpanFactory;
    mMetadataRepo = paramMetadataRepo;
    mGlyphChecker = paramGlyphChecker;
    mUseEmojiAsDefaultStyle = paramBoolean;
    mEmojiAsDefaultStyleExceptions = paramArrayOfInt;
  }
  
  private void addEmoji(@NonNull Spannable paramSpannable, EmojiMetadata paramEmojiMetadata, int paramInt1, int paramInt2)
  {
    paramSpannable.setSpan(mSpanFactory.createSpan(paramEmojiMetadata), paramInt1, paramInt2, 33);
  }
  
  private static boolean delete(@NonNull Editable paramEditable, @NonNull KeyEvent paramKeyEvent, boolean paramBoolean)
  {
    if (hasModifiers(paramKeyEvent)) {
      return false;
    }
    int i = Selection.getSelectionStart(paramEditable);
    int j = Selection.getSelectionEnd(paramEditable);
    if (hasInvalidSelection(i, j)) {
      return false;
    }
    paramKeyEvent = (EmojiSpan[])paramEditable.getSpans(i, j, EmojiSpan.class);
    if ((paramKeyEvent != null) && (paramKeyEvent.length > 0))
    {
      int k = paramKeyEvent.length;
      for (j = 0; j < k; j++)
      {
        Object localObject = paramKeyEvent[j];
        int m = paramEditable.getSpanStart(localObject);
        int n = paramEditable.getSpanEnd(localObject);
        if (((paramBoolean) && (m == i)) || ((!paramBoolean) && (n == i)) || ((i > m) && (i < n)))
        {
          paramEditable.delete(m, n);
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean handleDeleteSurroundingText(@NonNull InputConnection paramInputConnection, @NonNull Editable paramEditable, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, boolean paramBoolean)
  {
    if ((paramEditable != null) && (paramInputConnection != null) && (paramInt1 >= 0) && (paramInt2 >= 0))
    {
      int i = Selection.getSelectionStart(paramEditable);
      int j = Selection.getSelectionEnd(paramEditable);
      if (hasInvalidSelection(i, j)) {
        return false;
      }
      if (paramBoolean)
      {
        paramInt1 = CodepointIndexFinder.findIndexBackward(paramEditable, i, Math.max(paramInt1, 0));
        i = CodepointIndexFinder.findIndexForward(paramEditable, j, Math.max(paramInt2, 0));
        if (paramInt1 != -1)
        {
          paramInt2 = paramInt1;
          paramInt1 = i;
          if (i != -1) {}
        }
        else
        {
          return false;
        }
      }
      else
      {
        i = Math.max(i - paramInt1, 0);
        paramInt1 = Math.min(j + paramInt2, paramEditable.length());
        paramInt2 = i;
      }
      EmojiSpan[] arrayOfEmojiSpan = (EmojiSpan[])paramEditable.getSpans(paramInt2, paramInt1, EmojiSpan.class);
      if ((arrayOfEmojiSpan != null) && (arrayOfEmojiSpan.length > 0))
      {
        int k = arrayOfEmojiSpan.length;
        j = 0;
        i = paramInt2;
        for (paramInt2 = j; paramInt2 < k; paramInt2++)
        {
          EmojiSpan localEmojiSpan = arrayOfEmojiSpan[paramInt2];
          int m = paramEditable.getSpanStart(localEmojiSpan);
          j = paramEditable.getSpanEnd(localEmojiSpan);
          i = Math.min(m, i);
          paramInt1 = Math.max(j, paramInt1);
        }
        paramInt2 = Math.max(i, 0);
        paramInt1 = Math.min(paramInt1, paramEditable.length());
        paramInputConnection.beginBatchEdit();
        paramEditable.delete(paramInt2, paramInt1);
        paramInputConnection.endBatchEdit();
        return true;
      }
    }
    return false;
  }
  
  public static boolean handleOnKeyDown(@NonNull Editable paramEditable, int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (paramInt != 67)
    {
      if (paramInt != 112) {
        bool = false;
      } else {
        bool = delete(paramEditable, paramKeyEvent, true);
      }
    }
    else {
      bool = delete(paramEditable, paramKeyEvent, false);
    }
    if (bool)
    {
      MetaKeyKeyListener.adjustMetaAfterKeypress(paramEditable);
      return true;
    }
    return false;
  }
  
  private boolean hasGlyph(CharSequence paramCharSequence, int paramInt1, int paramInt2, EmojiMetadata paramEmojiMetadata)
  {
    if (paramEmojiMetadata.getHasGlyph() == 0) {
      paramEmojiMetadata.setHasGlyph(mGlyphChecker.hasGlyph(paramCharSequence, paramInt1, paramInt2, paramEmojiMetadata.getSdkAdded()));
    }
    boolean bool;
    if (paramEmojiMetadata.getHasGlyph() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean hasInvalidSelection(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 != -1) && (paramInt2 != -1) && (paramInt1 == paramInt2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean hasModifiers(@NonNull KeyEvent paramKeyEvent)
  {
    return KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) ^ true;
  }
  
  public int getEmojiMatch(@NonNull CharSequence paramCharSequence)
  {
    return getEmojiMatch(paramCharSequence, mMetadataRepo.getMetadataVersion());
  }
  
  public int getEmojiMatch(@NonNull CharSequence paramCharSequence, int paramInt)
  {
    ProcessorSm localProcessorSm = new ProcessorSm(mMetadataRepo.getRootNode(), mUseEmojiAsDefaultStyle, mEmojiAsDefaultStyleExceptions);
    int i = paramCharSequence.length();
    int j = 0;
    int k = j;
    int m = k;
    int n = k;
    while (j < i)
    {
      int i1 = Character.codePointAt(paramCharSequence, j);
      k = localProcessorSm.check(i1);
      Object localObject = localProcessorSm.getCurrentMetadata();
      int i2;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            k = j;
            i1 = n;
            i2 = m;
          }
          else
          {
            EmojiMetadata localEmojiMetadata = localProcessorSm.getFlushMetadata();
            k = j;
            i1 = n;
            i2 = m;
            localObject = localEmojiMetadata;
            if (localEmojiMetadata.getCompatAdded() <= paramInt)
            {
              i1 = n + 1;
              k = j;
              i2 = m;
              localObject = localEmojiMetadata;
            }
          }
        }
        else
        {
          k = j + Character.charCount(i1);
          i1 = n;
          i2 = m;
        }
      }
      else
      {
        k = j + Character.charCount(i1);
        i2 = 0;
        i1 = n;
      }
      j = k;
      n = i1;
      m = i2;
      if (localObject != null)
      {
        j = k;
        n = i1;
        m = i2;
        if (((EmojiMetadata)localObject).getCompatAdded() <= paramInt)
        {
          m = i2 + 1;
          j = k;
          n = i1;
        }
      }
    }
    if (n != 0) {
      return 2;
    }
    if ((localProcessorSm.isInFlushableState()) && (localProcessorSm.getCurrentMetadata().getCompatAdded() <= paramInt)) {
      return 1;
    }
    if (m == 0) {
      return 0;
    }
    return 2;
  }
  
  public CharSequence process(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3, boolean paramBoolean)
  {
    boolean bool = paramCharSequence instanceof SpannableBuilder;
    if (bool) {
      ((SpannableBuilder)paramCharSequence).beginBatchEdit();
    }
    Object localObject1 = null;
    if (!bool) {}
    try
    {
      Object localObject2;
      if (!(paramCharSequence instanceof Spannable))
      {
        localObject2 = localObject1;
        if ((paramCharSequence instanceof Spanned))
        {
          localObject2 = localObject1;
          if (((Spanned)paramCharSequence).nextSpanTransition(paramInt1 - 1, paramInt2 + 1, EmojiSpan.class) <= paramInt2) {
            localObject2 = new UnprecomputeTextOnModificationSpannable(paramCharSequence);
          }
        }
      }
      else
      {
        localObject2 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
        ((UnprecomputeTextOnModificationSpannable)localObject2).<init>((Spannable)paramCharSequence);
      }
      int i = paramInt1;
      int j = paramInt2;
      int k;
      int m;
      Object localObject4;
      if (localObject2 != null)
      {
        localObject1 = (EmojiSpan[])((UnprecomputeTextOnModificationSpannable)localObject2).getSpans(paramInt1, paramInt2, EmojiSpan.class);
        i = paramInt1;
        j = paramInt2;
        if (localObject1 != null)
        {
          i = paramInt1;
          j = paramInt2;
          if (localObject1.length > 0)
          {
            k = localObject1.length;
            for (m = 0;; m++)
            {
              i = paramInt1;
              j = paramInt2;
              if (m >= k) {
                break;
              }
              localObject4 = localObject1[m];
              j = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpanStart(localObject4);
              i = ((UnprecomputeTextOnModificationSpannable)localObject2).getSpanEnd(localObject4);
              if (j != paramInt2) {
                ((UnprecomputeTextOnModificationSpannable)localObject2).removeSpan(localObject4);
              }
              paramInt1 = Math.min(j, paramInt1);
              paramInt2 = Math.max(i, paramInt2);
            }
          }
        }
      }
      if ((i != j) && (i < paramCharSequence.length()))
      {
        m = paramInt3;
        if (paramInt3 != Integer.MAX_VALUE)
        {
          m = paramInt3;
          if (localObject2 != null) {
            m = paramInt3 - ((EmojiSpan[])((UnprecomputeTextOnModificationSpannable)localObject2).getSpans(0, ((UnprecomputeTextOnModificationSpannable)localObject2).length(), EmojiSpan.class)).length;
          }
        }
        localObject4 = new androidx/emoji2/text/EmojiProcessor$ProcessorSm;
        ((ProcessorSm)localObject4).<init>(mMetadataRepo.getRootNode(), mUseEmojiAsDefaultStyle, mEmojiAsDefaultStyleExceptions);
        int n = Character.codePointAt(paramCharSequence, i);
        paramInt3 = 0;
        k = i;
        paramInt2 = i;
        paramInt1 = n;
        for (;;)
        {
          if ((paramInt2 >= j) || (paramInt3 >= m)) {
            break label531;
          }
          i = ((ProcessorSm)localObject4).check(paramInt1);
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3) {
                continue;
              }
              if (!paramBoolean)
              {
                n = paramInt1;
                i = paramInt2;
                if (hasGlyph(paramCharSequence, k, paramInt2, ((ProcessorSm)localObject4).getFlushMetadata())) {
                  break;
                }
              }
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
                localObject2 = new android/text/SpannableString;
                ((SpannableString)localObject2).<init>(paramCharSequence);
                ((UnprecomputeTextOnModificationSpannable)localObject1).<init>((Spannable)localObject2);
              }
              addEmoji((Spannable)localObject1, ((ProcessorSm)localObject4).getFlushMetadata(), k, paramInt2);
              paramInt3++;
              localObject2 = localObject1;
              n = paramInt1;
              i = paramInt2;
              break;
            }
            i = paramInt2 + Character.charCount(paramInt1);
            paramInt2 = i;
            if (i >= j) {
              continue;
            }
            paramInt1 = Character.codePointAt(paramCharSequence, i);
            paramInt2 = i;
            continue;
          }
          k += Character.charCount(Character.codePointAt(paramCharSequence, k));
          if (k < j) {
            paramInt1 = Character.codePointAt(paramCharSequence, k);
          }
          paramInt2 = k;
        }
        label531:
        localObject1 = localObject2;
        if (((ProcessorSm)localObject4).isInFlushableState())
        {
          localObject1 = localObject2;
          if (paramInt3 < m) {
            if (!paramBoolean)
            {
              localObject1 = localObject2;
              if (hasGlyph(paramCharSequence, k, paramInt2, ((ProcessorSm)localObject4).getCurrentMetadata())) {}
            }
            else
            {
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable;
                ((UnprecomputeTextOnModificationSpannable)localObject1).<init>(paramCharSequence);
              }
              addEmoji((Spannable)localObject1, ((ProcessorSm)localObject4).getCurrentMetadata(), k, paramInt2);
            }
          }
        }
        if (localObject1 != null)
        {
          localObject2 = ((UnprecomputeTextOnModificationSpannable)localObject1).getUnwrappedSpannable();
          return (CharSequence)localObject2;
        }
        return paramCharSequence;
      }
      return paramCharSequence;
    }
    finally
    {
      if (bool) {
        ((SpannableBuilder)paramCharSequence).endBatchEdit();
      }
    }
  }
  
  @RequiresApi(19)
  public static final class CodepointIndexFinder
  {
    private static final int INVALID_INDEX = -1;
    
    public static int findIndexBackward(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = paramCharSequence.length();
      if ((paramInt1 >= 0) && (i >= paramInt1))
      {
        if (paramInt2 < 0) {
          return -1;
        }
        i = 0;
        for (;;)
        {
          if (paramInt2 == 0) {
            return paramInt1;
          }
          paramInt1--;
          if (paramInt1 < 0)
          {
            if (i != 0) {
              return -1;
            }
            return 0;
          }
          char c = paramCharSequence.charAt(paramInt1);
          if (i != 0)
          {
            if (!Character.isHighSurrogate(c)) {
              return -1;
            }
            paramInt2--;
            break;
          }
          if (!Character.isSurrogate(c))
          {
            paramInt2--;
          }
          else
          {
            if (Character.isHighSurrogate(c)) {
              return -1;
            }
            i = 1;
          }
        }
      }
      return -1;
    }
    
    public static int findIndexForward(CharSequence paramCharSequence, int paramInt1, int paramInt2)
    {
      int i = paramCharSequence.length();
      if ((paramInt1 >= 0) && (i >= paramInt1))
      {
        if (paramInt2 < 0) {
          return -1;
        }
        int j = 0;
        for (;;)
        {
          if (paramInt2 == 0) {
            return paramInt1;
          }
          if (paramInt1 >= i)
          {
            if (j != 0) {
              return -1;
            }
            return i;
          }
          char c = paramCharSequence.charAt(paramInt1);
          if (j != 0)
          {
            if (!Character.isLowSurrogate(c)) {
              return -1;
            }
            paramInt2--;
            paramInt1++;
            break;
          }
          if (!Character.isSurrogate(c))
          {
            paramInt2--;
            paramInt1++;
          }
          else
          {
            if (Character.isLowSurrogate(c)) {
              return -1;
            }
            paramInt1++;
            j = 1;
          }
        }
      }
      return -1;
    }
  }
  
  public static final class ProcessorSm
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
    
    public ProcessorSm(MetadataRepo.Node paramNode, boolean paramBoolean, int[] paramArrayOfInt)
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */