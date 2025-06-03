package androidx.emoji2.text;

import android.os.BaseBundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.flatbuffer.MetadataList;

@RequiresApi(19)
final class EmojiCompat$CompatInternal19
  extends EmojiCompat.CompatInternal
{
  private volatile MetadataRepo mMetadataRepo;
  private volatile EmojiProcessor mProcessor;
  
  public EmojiCompat$CompatInternal19(EmojiCompat paramEmojiCompat)
  {
    super(paramEmojiCompat);
  }
  
  public String getAssetSignature()
  {
    String str1 = mMetadataRepo.getMetadataList().sourceSha();
    String str2 = str1;
    if (str1 == null) {
      str2 = "";
    }
    return str2;
  }
  
  public int getEmojiMatch(CharSequence paramCharSequence, int paramInt)
  {
    return mProcessor.getEmojiMatch(paramCharSequence, paramInt);
  }
  
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence)
  {
    int i = mProcessor.getEmojiMatch(paramCharSequence);
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence, int paramInt)
  {
    paramInt = mProcessor.getEmojiMatch(paramCharSequence, paramInt);
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public void loadMetadata()
  {
    // Byte code:
    //   0: new 9	androidx/emoji2/text/EmojiCompat$CompatInternal19$1
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 59	androidx/emoji2/text/EmojiCompat$CompatInternal19$1:<init>	(Landroidx/emoji2/text/EmojiCompat$CompatInternal19;)V
    //   9: aload_0
    //   10: getfield 63	androidx/emoji2/text/EmojiCompat$CompatInternal:mEmojiCompat	Landroidx/emoji2/text/EmojiCompat;
    //   13: getfield 67	androidx/emoji2/text/EmojiCompat:mMetadataLoader	Landroidx/emoji2/text/EmojiCompat$MetadataRepoLoader;
    //   16: aload_1
    //   17: invokeinterface 73 2 0
    //   22: goto +12 -> 34
    //   25: astore_1
    //   26: aload_0
    //   27: getfield 63	androidx/emoji2/text/EmojiCompat$CompatInternal:mEmojiCompat	Landroidx/emoji2/text/EmojiCompat;
    //   30: aload_1
    //   31: invokevirtual 77	androidx/emoji2/text/EmojiCompat:onMetadataLoadFailed	(Ljava/lang/Throwable;)V
    //   34: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	CompatInternal19
    //   3	14	1	local1	1
    //   25	6	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	22	25	finally
  }
  
  public void onMetadataLoadSuccess(@NonNull MetadataRepo paramMetadataRepo)
  {
    if (paramMetadataRepo == null)
    {
      mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
      return;
    }
    mMetadataRepo = paramMetadataRepo;
    MetadataRepo localMetadataRepo = mMetadataRepo;
    paramMetadataRepo = new EmojiCompat.SpanFactory();
    EmojiCompat.GlyphChecker localGlyphChecker = EmojiCompat.access$000(mEmojiCompat);
    EmojiCompat localEmojiCompat = mEmojiCompat;
    mProcessor = new EmojiProcessor(localMetadataRepo, paramMetadataRepo, localGlyphChecker, mUseEmojiAsDefaultStyle, mEmojiAsDefaultStyleExceptions);
    mEmojiCompat.onMetadataLoadSuccess();
  }
  
  public CharSequence process(@NonNull CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return mProcessor.process(paramCharSequence, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void updateEditorInfoAttrs(@NonNull EditorInfo paramEditorInfo)
  {
    extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", mMetadataRepo.getMetadataVersion());
    extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", mEmojiCompat.mReplaceAll);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.CompatInternal19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */