package com.google.android.exoplayer2.text.cea;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class Cea608Decoder
  extends CeaDecoder
{
  private static final int[] BASIC_CHARACTER_SET = { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
  private static final int CC_FIELD_FLAG = 1;
  private static final byte CC_IMPLICIT_DATA_HEADER = -4;
  private static final int CC_MODE_PAINT_ON = 3;
  private static final int CC_MODE_POP_ON = 2;
  private static final int CC_MODE_ROLL_UP = 1;
  private static final int CC_MODE_UNKNOWN = 0;
  private static final int CC_TYPE_FLAG = 2;
  private static final int CC_VALID_608_ID = 4;
  private static final int CC_VALID_FLAG = 4;
  private static final int[] COLUMN_INDICES;
  private static final byte CTRL_BACKSPACE = 33;
  private static final byte CTRL_CARRIAGE_RETURN = 45;
  private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
  private static final byte CTRL_END_OF_CAPTION = 47;
  private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
  private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
  private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
  private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
  private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
  private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
  private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
  private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
  private static final int NTSC_CC_FIELD_1 = 0;
  private static final int NTSC_CC_FIELD_2 = 1;
  private static final int[] ROW_INDICES = { 11, 1, 3, 12, 14, 5, 7, 9 };
  private static final int[] SPECIAL_CHARACTER_SET = { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
  private static final int[] SPECIAL_ES_FR_CHARACTER_SET = { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
  private static final int[] SPECIAL_PT_DE_CHARACTER_SET = { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
  private static final int[] STYLE_COLORS;
  private static final int STYLE_ITALICS = 7;
  private static final int STYLE_UNCHANGED = 8;
  private int captionMode;
  private int captionRowCount;
  private final ParsableByteArray ccData = new ParsableByteArray();
  private final ArrayList<CueBuilder> cueBuilders = new ArrayList();
  private List<Cue> cues;
  private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
  private List<Cue> lastCues;
  private final int packetLength;
  private byte repeatableControlCc1;
  private byte repeatableControlCc2;
  private boolean repeatableControlSet;
  private final int selectedField;
  
  static
  {
    COLUMN_INDICES = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
    STYLE_COLORS = new int[] { -1, -16711936, -16776961, -16711681, -65536, 65280, -65281 };
  }
  
  public Cea608Decoder(String paramString, int paramInt)
  {
    int i;
    if ("application/x-mp4-cea-608".equals(paramString)) {
      i = 2;
    } else {
      i = 3;
    }
    packetLength = i;
    if ((paramInt != 3) && (paramInt != 4)) {
      selectedField = 1;
    } else {
      selectedField = 2;
    }
    setCaptionMode(0);
    resetCueBuilders();
  }
  
  private static char getChar(byte paramByte)
  {
    return (char)BASIC_CHARACTER_SET[((paramByte & 0x7F) - 32)];
  }
  
  private List<Cue> getDisplayCues()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < cueBuilders.size(); i++)
    {
      Cue localCue = ((CueBuilder)cueBuilders.get(i)).build();
      if (localCue != null) {
        localArrayList.add(localCue);
      }
    }
    return localArrayList;
  }
  
  private static char getExtendedEsFrChar(byte paramByte)
  {
    return (char)SPECIAL_ES_FR_CHARACTER_SET[(paramByte & 0x1F)];
  }
  
  private static char getExtendedPtDeChar(byte paramByte)
  {
    return (char)SPECIAL_PT_DE_CHARACTER_SET[(paramByte & 0x1F)];
  }
  
  private static char getSpecialChar(byte paramByte)
  {
    return (char)SPECIAL_CHARACTER_SET[(paramByte & 0xF)];
  }
  
  private boolean handleCtrl(byte paramByte1, byte paramByte2)
  {
    boolean bool = isRepeatable(paramByte1);
    if (bool)
    {
      if ((repeatableControlSet) && (repeatableControlCc1 == paramByte1) && (repeatableControlCc2 == paramByte2))
      {
        repeatableControlSet = false;
        return true;
      }
      repeatableControlSet = true;
      repeatableControlCc1 = paramByte1;
      repeatableControlCc2 = paramByte2;
    }
    if (isMidrowCtrlCode(paramByte1, paramByte2)) {
      handleMidrowCtrl(paramByte2);
    } else if (isPreambleAddressCode(paramByte1, paramByte2)) {
      handlePreambleAddressCode(paramByte1, paramByte2);
    } else if (isTabCtrlCode(paramByte1, paramByte2)) {
      currentCueBuilder.setTab(paramByte2 - 32);
    } else if (isMiscCode(paramByte1, paramByte2)) {
      handleMiscCode(paramByte2);
    }
    return bool;
  }
  
  private void handleMidrowCtrl(byte paramByte)
  {
    currentCueBuilder.append(' ');
    boolean bool;
    if ((paramByte & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    currentCueBuilder.setStyle(paramByte >> 1 & 0x7, bool);
  }
  
  private void handleMiscCode(byte paramByte)
  {
    if (paramByte != 32)
    {
      if (paramByte != 41)
      {
        switch (paramByte)
        {
        default: 
          int i = captionMode;
          if (i == 0) {
            return;
          }
          if (paramByte != 33) {
            switch (paramByte)
            {
            default: 
              break;
            case 47: 
              cues = getDisplayCues();
              resetCueBuilders();
              break;
            case 46: 
              resetCueBuilders();
              break;
            case 45: 
              if ((i != 1) || (currentCueBuilder.isEmpty())) {
                break;
              }
              currentCueBuilder.rollUp();
              break;
            case 44: 
              cues = null;
              if ((i != 1) && (i != 3)) {
                break;
              }
              resetCueBuilders();
              break;
            }
          } else {
            currentCueBuilder.backspace();
          }
          return;
        case 39: 
          setCaptionMode(1);
          setCaptionRowCount(4);
          return;
        case 38: 
          setCaptionMode(1);
          setCaptionRowCount(3);
          return;
        }
        setCaptionMode(1);
        setCaptionRowCount(2);
        return;
      }
      setCaptionMode(3);
      return;
    }
    setCaptionMode(2);
  }
  
  private void handlePreambleAddressCode(byte paramByte1, byte paramByte2)
  {
    byte b1 = ROW_INDICES[(paramByte1 & 0x7)];
    boolean bool = false;
    if ((paramByte2 & 0x20) != 0) {
      paramByte1 = 1;
    } else {
      paramByte1 = 0;
    }
    byte b2 = b1;
    if (paramByte1 != 0) {
      b2 = b1 + 1;
    }
    if (b2 != currentCueBuilder.getRow())
    {
      if ((captionMode != 1) && (!currentCueBuilder.isEmpty()))
      {
        localCueBuilder = new CueBuilder(captionMode, captionRowCount);
        currentCueBuilder = localCueBuilder;
        cueBuilders.add(localCueBuilder);
      }
      currentCueBuilder.setRow(b2);
    }
    if ((paramByte2 & 0x10) == 16) {
      paramByte1 = 1;
    } else {
      paramByte1 = 0;
    }
    if ((paramByte2 & 0x1) == 1) {
      bool = true;
    }
    b2 = paramByte2 >> 1 & 0x7;
    CueBuilder localCueBuilder = currentCueBuilder;
    if (paramByte1 != 0) {
      paramByte2 = 8;
    } else {
      paramByte2 = b2;
    }
    localCueBuilder.setStyle(paramByte2, bool);
    if (paramByte1 != 0) {
      currentCueBuilder.setIndent(COLUMN_INDICES[b2]);
    }
  }
  
  private static boolean isMidrowCtrlCode(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 17) && ((paramByte2 & 0xF0) == 32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isMiscCode(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 20) && ((paramByte2 & 0xF0) == 32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isPreambleAddressCode(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF0) == 16) && ((paramByte2 & 0xC0) == 64)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isRepeatable(byte paramByte)
  {
    boolean bool;
    if ((paramByte & 0xF0) == 16) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isTabCtrlCode(byte paramByte1, byte paramByte2)
  {
    boolean bool;
    if (((paramByte1 & 0xF7) == 23) && (paramByte2 >= 33) && (paramByte2 <= 35)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void resetCueBuilders()
  {
    currentCueBuilder.reset(captionMode);
    cueBuilders.clear();
    cueBuilders.add(currentCueBuilder);
  }
  
  private void setCaptionMode(int paramInt)
  {
    int i = captionMode;
    if (i == paramInt) {
      return;
    }
    captionMode = paramInt;
    resetCueBuilders();
    if ((i == 3) || (paramInt == 1) || (paramInt == 0)) {
      cues = null;
    }
  }
  
  private void setCaptionRowCount(int paramInt)
  {
    captionRowCount = paramInt;
    currentCueBuilder.setCaptionRowCount(paramInt);
  }
  
  public Subtitle createSubtitle()
  {
    List localList = cues;
    lastCues = localList;
    return new CeaSubtitle(localList);
  }
  
  public void decode(SubtitleInputBuffer paramSubtitleInputBuffer)
  {
    ccData.reset(data.array(), data.limit());
    boolean bool1 = false;
    boolean bool2 = bool1;
    int i;
    for (;;)
    {
      i = ccData.bytesLeft();
      int j = packetLength;
      if (i < j) {
        break;
      }
      if (j == 2) {
        i = -4;
      } else {
        i = (byte)ccData.readUnsignedByte();
      }
      int k = (byte)(ccData.readUnsignedByte() & 0x7F);
      int m = (byte)(ccData.readUnsignedByte() & 0x7F);
      if ((i & 0x6) == 4)
      {
        j = selectedField;
        if (((j != 1) || ((i & 0x1) == 0)) && ((j != 2) || ((i & 0x1) == 1)) && ((k != 0) || (m != 0)))
        {
          boolean bool3;
          if (((k & 0xF7) == 17) && ((m & 0xF0) == 48))
          {
            currentCueBuilder.append(getSpecialChar(m));
            bool3 = bool2;
          }
          else if (((k & 0xF6) == 18) && ((m & 0xE0) == 32))
          {
            currentCueBuilder.backspace();
            if ((k & 0x1) == 0)
            {
              currentCueBuilder.append(getExtendedEsFrChar(m));
              bool3 = bool2;
            }
            else
            {
              currentCueBuilder.append(getExtendedPtDeChar(m));
              bool3 = bool2;
            }
          }
          else if ((k & 0xE0) == 0)
          {
            bool3 = handleCtrl(k, m);
          }
          else
          {
            currentCueBuilder.append(getChar(k));
            bool3 = bool2;
            if ((m & 0xE0) != 0)
            {
              currentCueBuilder.append(getChar(m));
              bool3 = bool2;
            }
          }
          bool1 = true;
          bool2 = bool3;
        }
      }
    }
    if (bool1)
    {
      if (!bool2) {
        repeatableControlSet = false;
      }
      i = captionMode;
      if ((i == 1) || (i == 3)) {
        cues = getDisplayCues();
      }
    }
  }
  
  public void flush()
  {
    super.flush();
    cues = null;
    lastCues = null;
    setCaptionMode(0);
    setCaptionRowCount(4);
    resetCueBuilders();
    repeatableControlSet = false;
    repeatableControlCc1 = ((byte)0);
    repeatableControlCc2 = ((byte)0);
  }
  
  public String getName()
  {
    return "Cea608Decoder";
  }
  
  public boolean isNewSubtitleDataAvailable()
  {
    boolean bool;
    if (cues != lastCues) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void release() {}
  
  public static class CueBuilder
  {
    private static final int BASE_ROW = 15;
    private static final int SCREEN_CHARWIDTH = 32;
    private int captionMode;
    private int captionRowCount;
    private final StringBuilder captionStringBuilder = new StringBuilder();
    private final List<CueStyle> cueStyles = new ArrayList();
    private int indent;
    private final List<SpannableString> rolledUpCaptions = new ArrayList();
    private int row;
    private int tabOffset;
    
    public CueBuilder(int paramInt1, int paramInt2)
    {
      reset(paramInt1);
      setCaptionRowCount(paramInt2);
    }
    
    private static void setColorSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3)
    {
      if (paramInt3 == -1) {
        return;
      }
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt3), paramInt1, paramInt2, 33);
    }
    
    private static void setItalicSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
    {
      paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt1, paramInt2, 33);
    }
    
    private static void setUnderlineSpan(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
    {
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    
    public void append(char paramChar)
    {
      captionStringBuilder.append(paramChar);
    }
    
    public void backspace()
    {
      int i = captionStringBuilder.length();
      if (i > 0)
      {
        captionStringBuilder.delete(i - 1, i);
        for (int j = cueStyles.size() - 1; j >= 0; j--)
        {
          CueStyle localCueStyle = (CueStyle)cueStyles.get(j);
          int k = start;
          if (k != i) {
            break;
          }
          start = (k - 1);
        }
      }
    }
    
    public Cue build()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      for (int i = 0; i < rolledUpCaptions.size(); i++)
      {
        localSpannableStringBuilder.append((CharSequence)rolledUpCaptions.get(i));
        localSpannableStringBuilder.append('\n');
      }
      localSpannableStringBuilder.append(buildSpannableString());
      if (localSpannableStringBuilder.length() == 0) {
        return null;
      }
      int j = indent + tabOffset;
      int k = 32 - j - localSpannableStringBuilder.length();
      i = j - k;
      float f;
      if ((captionMode == 2) && ((Math.abs(i) < 3) || (k < 0)))
      {
        f = 0.5F;
        i = 1;
      }
      else if ((captionMode == 2) && (i > 0))
      {
        f = (32 - k) / 32.0F * 0.8F + 0.1F;
        i = 2;
      }
      else
      {
        f = j / 32.0F;
        i = 0;
        f = f * 0.8F + 0.1F;
      }
      if (captionMode != 1)
      {
        k = row;
        if (k <= 7)
        {
          j = 0;
          break label223;
        }
      }
      k = row - 15 - 2;
      j = 2;
      label223:
      return new Cue(localSpannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, k, 1, j, f, i, Float.MIN_VALUE);
    }
    
    public SpannableString buildSpannableString()
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(captionStringBuilder);
      int i = localSpannableStringBuilder.length();
      int j = 0;
      int k = j;
      int m = k;
      int n = -1;
      int i1 = n;
      int i2 = i1;
      int i3 = i2;
      int i4 = i2;
      int i5 = k;
      int i6 = i1;
      while (j < cueStyles.size())
      {
        CueStyle localCueStyle = (CueStyle)cueStyles.get(j);
        boolean bool = underline;
        k = style;
        i1 = i3;
        int i7 = m;
        if (k != 8)
        {
          if (k == 7) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (k != 7) {
            i3 = Cea608Decoder.access$000()[k];
          }
          i7 = i1;
          i1 = i3;
        }
        k = start;
        int i8 = j + 1;
        if (i8 < cueStyles.size()) {
          i3 = cueStyles.get(i8)).start;
        } else {
          i3 = i;
        }
        if (k == i3)
        {
          j = i8;
          i3 = i1;
          m = i7;
        }
        else
        {
          if ((n != -1) && (!bool))
          {
            setUnderlineSpan(localSpannableStringBuilder, n, k);
            i2 = -1;
          }
          else
          {
            i2 = n;
            if (n == -1)
            {
              i2 = n;
              if (bool) {
                i2 = k;
              }
            }
          }
          int i9;
          if ((i6 != -1) && (i7 == 0))
          {
            setItalicSpan(localSpannableStringBuilder, i6, k);
            i9 = -1;
          }
          else
          {
            i9 = i6;
            if (i6 == -1)
            {
              i9 = i6;
              if (i7 != 0) {
                i9 = k;
              }
            }
          }
          j = i8;
          n = i2;
          i6 = i9;
          i3 = i1;
          m = i7;
          if (i1 != i4)
          {
            setColorSpan(localSpannableStringBuilder, i5, k, i4);
            i4 = i1;
            j = i8;
            n = i2;
            i6 = i9;
            i5 = k;
            i3 = i1;
            m = i7;
          }
        }
      }
      if ((n != -1) && (n != i)) {
        setUnderlineSpan(localSpannableStringBuilder, n, i);
      }
      if ((i6 != -1) && (i6 != i)) {
        setItalicSpan(localSpannableStringBuilder, i6, i);
      }
      if (i5 != i) {
        setColorSpan(localSpannableStringBuilder, i5, i, i4);
      }
      return new SpannableString(localSpannableStringBuilder);
    }
    
    public int getRow()
    {
      return row;
    }
    
    public boolean isEmpty()
    {
      boolean bool;
      if ((cueStyles.isEmpty()) && (rolledUpCaptions.isEmpty()) && (captionStringBuilder.length() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void reset(int paramInt)
    {
      captionMode = paramInt;
      cueStyles.clear();
      rolledUpCaptions.clear();
      captionStringBuilder.setLength(0);
      row = 15;
      indent = 0;
      tabOffset = 0;
    }
    
    public void rollUp()
    {
      rolledUpCaptions.add(buildSpannableString());
      captionStringBuilder.setLength(0);
      cueStyles.clear();
      int i = Math.min(captionRowCount, row);
      while (rolledUpCaptions.size() >= i) {
        rolledUpCaptions.remove(0);
      }
    }
    
    public void setCaptionRowCount(int paramInt)
    {
      captionRowCount = paramInt;
    }
    
    public void setIndent(int paramInt)
    {
      indent = paramInt;
    }
    
    public void setRow(int paramInt)
    {
      row = paramInt;
    }
    
    public void setStyle(int paramInt, boolean paramBoolean)
    {
      cueStyles.add(new CueStyle(paramInt, paramBoolean, captionStringBuilder.length()));
    }
    
    public void setTab(int paramInt)
    {
      tabOffset = paramInt;
    }
    
    public String toString()
    {
      return captionStringBuilder.toString();
    }
    
    public static class CueStyle
    {
      public int start;
      public final int style;
      public final boolean underline;
      
      public CueStyle(int paramInt1, boolean paramBoolean, int paramInt2)
      {
        style = paramInt1;
        underline = paramBoolean;
        start = paramInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.Cea608Decoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */