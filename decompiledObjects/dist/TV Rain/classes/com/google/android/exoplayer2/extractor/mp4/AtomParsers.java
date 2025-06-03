package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z2;

final class AtomParsers
{
  private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
  private static final String TAG = "AtomParsers";
  private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
  private static final int TYPE_meta = Util.getIntegerCodeForString("meta");
  private static final int TYPE_sbtl;
  private static final int TYPE_soun;
  private static final int TYPE_subt;
  private static final int TYPE_text;
  private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
  
  static
  {
    TYPE_soun = Util.getIntegerCodeForString("soun");
    TYPE_text = Util.getIntegerCodeForString("text");
    TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    TYPE_subt = Util.getIntegerCodeForString("subt");
  }
  
  private static boolean canApplyEditWithGaplessInfo(long[] paramArrayOfLong, long paramLong1, long paramLong2, long paramLong3)
  {
    int i = paramArrayOfLong.length;
    boolean bool = true;
    int j = i - 1;
    i = Util.constrainValue(3, 0, j);
    j = Util.constrainValue(paramArrayOfLong.length - 3, 0, j);
    if ((paramArrayOfLong[0] > paramLong2) || (paramLong2 >= paramArrayOfLong[i]) || (paramArrayOfLong[j] >= paramLong3) || (paramLong3 > paramLong1)) {
      bool = false;
    }
    return bool;
  }
  
  private static int findEsdsPosition(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2)
  {
    int i = paramParsableByteArray.getPosition();
    while (i - paramInt1 < paramInt2)
    {
      paramParsableByteArray.setPosition(i);
      int j = paramParsableByteArray.readInt();
      boolean bool;
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool, "childAtomSize should be positive");
      if (paramParsableByteArray.readInt() == Atom.TYPE_esds) {
        return i;
      }
      i += j;
    }
    return -1;
  }
  
  private static void parseAudioSampleEntry(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, DrmInitData paramDrmInitData, StsdData paramStsdData, int paramInt5)
    throws ParserException
  {
    int i = paramInt2;
    paramParsableByteArray.setPosition(i + 8 + 8);
    int j = 0;
    int k;
    if (paramBoolean)
    {
      k = paramParsableByteArray.readUnsignedShort();
      paramParsableByteArray.skipBytes(6);
    }
    else
    {
      paramParsableByteArray.skipBytes(8);
      k = 0;
    }
    int n = 2;
    int i1 = 1;
    int i2;
    if ((k != 0) && (k != 1))
    {
      if (k == 2)
      {
        paramParsableByteArray.skipBytes(16);
        i2 = (int)Math.round(paramParsableByteArray.readDouble());
        k = paramParsableByteArray.readUnsignedIntToInt();
        paramParsableByteArray.skipBytes(20);
      }
    }
    else
    {
      i3 = paramParsableByteArray.readUnsignedShort();
      paramParsableByteArray.skipBytes(6);
      i2 = paramParsableByteArray.readUnsignedFixedPoint1616();
      if (k == 1) {
        paramParsableByteArray.skipBytes(16);
      }
      k = i3;
    }
    int i4 = paramParsableByteArray.getPosition();
    int i5 = Atom.TYPE_enca;
    Object localObject1 = null;
    Object localObject2 = paramDrmInitData;
    int i3 = paramInt1;
    if (paramInt1 == i5)
    {
      localObject3 = parseSampleEntryEncryptionData(paramParsableByteArray, i, paramInt3);
      localObject2 = paramDrmInitData;
      if (localObject3 != null)
      {
        paramInt1 = ((Integer)first).intValue();
        if (paramDrmInitData == null) {
          localObject2 = null;
        } else {
          localObject2 = paramDrmInitData.copyWithSchemeType(second).schemeType);
        }
        trackEncryptionBoxes[paramInt5] = ((TrackEncryptionBox)second);
      }
      paramParsableByteArray.setPosition(i4);
      i3 = paramInt1;
    }
    Object localObject3 = localObject2;
    paramInt1 = Atom.TYPE_ac_3;
    String str1 = "audio/raw";
    if (i3 == paramInt1) {
      paramDrmInitData = "audio/ac3";
    } else if (i3 == Atom.TYPE_ec_3) {
      paramDrmInitData = "audio/eac3";
    } else if (i3 == Atom.TYPE_dtsc) {
      paramDrmInitData = "audio/vnd.dts";
    } else if ((i3 != Atom.TYPE_dtsh) && (i3 != Atom.TYPE_dtsl))
    {
      if (i3 == Atom.TYPE_dtse) {
        paramDrmInitData = "audio/vnd.dts.hd;profile=lbr";
      } else if (i3 == Atom.TYPE_samr) {
        paramDrmInitData = "audio/3gpp";
      } else if (i3 == Atom.TYPE_sawb) {
        paramDrmInitData = "audio/amr-wb";
      } else if ((i3 != Atom.TYPE_lpcm) && (i3 != Atom.TYPE_sowt))
      {
        if (i3 == Atom.TYPE__mp3) {
          paramDrmInitData = "audio/mpeg";
        } else if (i3 == Atom.TYPE_alac) {
          paramDrmInitData = "audio/alac";
        } else if (i3 == Atom.TYPE_alaw) {
          paramDrmInitData = "audio/g711-alaw";
        } else if (i3 == Atom.TYPE_ulaw) {
          paramDrmInitData = "audio/g711-mlaw";
        } else {
          paramDrmInitData = null;
        }
      }
      else {
        paramDrmInitData = "audio/raw";
      }
    }
    else {
      paramDrmInitData = "audio/vnd.dts.hd";
    }
    paramInt1 = i4;
    localObject2 = null;
    i = i2;
    i4 = k;
    i3 = n;
    paramInt5 = i1;
    while (paramInt1 - paramInt2 < paramInt3)
    {
      paramParsableByteArray.setPosition(paramInt1);
      n = paramParsableByteArray.readInt();
      i2 = n;
      if (i2 > 0) {
        k = paramInt5;
      } else {
        k = j;
      }
      Assertions.checkArgument(k, "childAtomSize should be positive");
      i1 = paramParsableByteArray.readInt();
      i5 = Atom.TYPE_esds;
      int m;
      if (i1 != i5)
      {
        if ((paramBoolean) && (i1 == Atom.TYPE_wave))
        {
          m = 1;
          break label739;
        }
        if (i1 == Atom.TYPE_dac3) {
          paramParsableByteArray.setPosition(paramInt1 + 8);
        }
        for (format = Ac3Util.parseAc3AnnexFFormat(paramParsableByteArray, Integer.toString(paramInt4), paramString, (DrmInitData)localObject3);; format = Ac3Util.parseEAc3AnnexFFormat(paramParsableByteArray, Integer.toString(paramInt4), paramString, (DrmInitData)localObject3))
        {
          paramInt5 = 1;
          i2 = paramInt1;
          break label732;
          if (i1 != Atom.TYPE_dec3) {
            break;
          }
          paramParsableByteArray.setPosition(paramInt1 + 8);
        }
        if (i1 == Atom.TYPE_ddts)
        {
          format = Format.createAudioSampleFormat(Integer.toString(paramInt4), paramDrmInitData, null, -1, -1, i4, i, null, (DrmInitData)localObject3, 0, paramString);
        }
        else
        {
          paramInt5 = 1;
          if (i1 == Atom.TYPE_alac)
          {
            localObject2 = new byte[i2];
            paramParsableByteArray.setPosition(paramInt1);
            paramParsableByteArray.readBytes((byte[])localObject2, j, i2);
            i2 = paramInt1;
            break label732;
          }
        }
        paramInt5 = 1;
        i2 = paramInt1;
      }
      for (;;)
      {
        label732:
        break;
        m = paramInt5;
        label739:
        if (i1 == i5) {
          i1 = paramInt1;
        } else {
          i1 = findEsdsPosition(paramParsableByteArray, paramInt1, i2);
        }
        i2 = paramInt1;
        paramInt5 = m;
        if (i1 != -1)
        {
          paramDrmInitData = parseEsdsFromParent(paramParsableByteArray, i1);
          String str2 = (String)first;
          byte[] arrayOfByte = (byte[])second;
          i2 = paramInt1;
          paramDrmInitData = str2;
          localObject2 = arrayOfByte;
          paramInt5 = m;
          if ("audio/mp4a-latm".equals(str2))
          {
            paramDrmInitData = CodecSpecificDataUtil.parseAacAudioSpecificConfig(arrayOfByte);
            i = ((Integer)first).intValue();
            i4 = ((Integer)second).intValue();
            paramInt5 = m;
            localObject2 = arrayOfByte;
            paramDrmInitData = str2;
            i2 = paramInt1;
          }
        }
      }
      paramInt1 = i2 + n;
    }
    if ((format == null) && (paramDrmInitData != null))
    {
      if (!str1.equals(paramDrmInitData)) {
        i3 = -1;
      }
      str1 = Integer.toString(paramInt4);
      if (localObject2 == null) {
        paramParsableByteArray = (ParsableByteArray)localObject1;
      } else {
        paramParsableByteArray = Collections.singletonList(localObject2);
      }
      format = Format.createAudioSampleFormat(str1, paramDrmInitData, null, -1, -1, i4, i, i3, paramParsableByteArray, (DrmInitData)localObject3, 0, paramString);
    }
  }
  
  public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    boolean bool1 = false;
    int j = -1;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    int k = 0;
    while (i - paramInt1 < paramInt2)
    {
      paramParsableByteArray.setPosition(i);
      int m = paramParsableByteArray.readInt();
      int n = paramParsableByteArray.readInt();
      Object localObject3;
      Object localObject4;
      if (n == Atom.TYPE_frma)
      {
        localObject3 = Integer.valueOf(paramParsableByteArray.readInt());
        localObject4 = localObject1;
      }
      else if (n == Atom.TYPE_schm)
      {
        paramParsableByteArray.skipBytes(4);
        localObject4 = paramParsableByteArray.readString(4);
        localObject3 = localObject2;
      }
      else
      {
        localObject4 = localObject1;
        localObject3 = localObject2;
        if (n == Atom.TYPE_schi)
        {
          j = i;
          k = m;
          localObject3 = localObject2;
          localObject4 = localObject1;
        }
      }
      i += m;
      localObject1 = localObject4;
      localObject2 = localObject3;
    }
    if ((!"cenc".equals(localObject1)) && (!"cbc1".equals(localObject1)) && (!"cens".equals(localObject1)) && (!"cbcs".equals(localObject1))) {
      return null;
    }
    if (localObject2 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2, "frma atom is mandatory");
    if (j != -1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2, "schi atom is mandatory");
    paramParsableByteArray = parseSchiFromParent(paramParsableByteArray, j, k, (String)localObject1);
    boolean bool2 = bool1;
    if (paramParsableByteArray != null) {
      bool2 = true;
    }
    Assertions.checkArgument(bool2, "tenc atom is mandatory");
    return Pair.create(localObject2, paramParsableByteArray);
  }
  
  private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom paramContainerAtom)
  {
    if (paramContainerAtom != null)
    {
      paramContainerAtom = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_elst);
      if (paramContainerAtom != null)
      {
        ParsableByteArray localParsableByteArray = data;
        localParsableByteArray.setPosition(8);
        int i = Atom.parseFullAtomVersion(localParsableByteArray.readInt());
        int j = localParsableByteArray.readUnsignedIntToInt();
        paramContainerAtom = new long[j];
        long[] arrayOfLong = new long[j];
        int k = 0;
        while (k < j)
        {
          long l;
          if (i == 1) {
            l = localParsableByteArray.readUnsignedLongToLong();
          } else {
            l = localParsableByteArray.readUnsignedInt();
          }
          paramContainerAtom[k] = l;
          if (i == 1) {
            l = localParsableByteArray.readLong();
          } else {
            l = localParsableByteArray.readInt();
          }
          arrayOfLong[k] = l;
          if (localParsableByteArray.readShort() == 1)
          {
            localParsableByteArray.skipBytes(2);
            k++;
          }
          else
          {
            throw new IllegalArgumentException("Unsupported media rate.");
          }
        }
        return Pair.create(paramContainerAtom, arrayOfLong);
      }
    }
    return Pair.create(null, null);
  }
  
  private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.setPosition(paramInt + 8 + 4);
    paramParsableByteArray.skipBytes(1);
    parseExpandableClassSize(paramParsableByteArray);
    paramParsableByteArray.skipBytes(2);
    paramInt = paramParsableByteArray.readUnsignedByte();
    if ((paramInt & 0x80) != 0) {
      paramParsableByteArray.skipBytes(2);
    }
    if ((paramInt & 0x40) != 0) {
      paramParsableByteArray.skipBytes(paramParsableByteArray.readUnsignedShort());
    }
    if ((paramInt & 0x20) != 0) {
      paramParsableByteArray.skipBytes(2);
    }
    paramParsableByteArray.skipBytes(1);
    parseExpandableClassSize(paramParsableByteArray);
    String str = MimeTypes.getMimeTypeFromMp4ObjectType(paramParsableByteArray.readUnsignedByte());
    if ((!"audio/mpeg".equals(str)) && (!"audio/vnd.dts".equals(str)) && (!"audio/vnd.dts.hd".equals(str)))
    {
      paramParsableByteArray.skipBytes(12);
      paramParsableByteArray.skipBytes(1);
      paramInt = parseExpandableClassSize(paramParsableByteArray);
      byte[] arrayOfByte = new byte[paramInt];
      paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
      return Pair.create(str, arrayOfByte);
    }
    return Pair.create(str, null);
  }
  
  private static int parseExpandableClassSize(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.readUnsignedByte();
    for (int j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F) {
      i = paramParsableByteArray.readUnsignedByte();
    }
    return j;
  }
  
  private static int parseHdlr(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.setPosition(16);
    int i = paramParsableByteArray.readInt();
    if (i == TYPE_soun) {
      return 1;
    }
    if (i == TYPE_vide) {
      return 2;
    }
    if ((i != TYPE_text) && (i != TYPE_sbtl) && (i != TYPE_subt) && (i != TYPE_clcp))
    {
      if (i == TYPE_meta) {
        return 4;
      }
      return -1;
    }
    return 3;
  }
  
  private static Metadata parseIlst(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.skipBytes(8);
    ArrayList localArrayList = new ArrayList();
    while (paramParsableByteArray.getPosition() < paramInt)
    {
      Metadata.Entry localEntry = MetadataUtil.parseIlstElement(paramParsableByteArray);
      if (localEntry != null) {
        localArrayList.add(localEntry);
      }
    }
    if (localArrayList.isEmpty()) {
      paramParsableByteArray = null;
    } else {
      paramParsableByteArray = new Metadata(localArrayList);
    }
    return paramParsableByteArray;
  }
  
  private static Pair<Long, String> parseMdhd(ParsableByteArray paramParsableByteArray)
  {
    int i = 8;
    paramParsableByteArray.setPosition(8);
    int j = Atom.parseFullAtomVersion(paramParsableByteArray.readInt());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    }
    paramParsableByteArray.skipBytes(k);
    long l = paramParsableByteArray.readUnsignedInt();
    int k = i;
    if (j == 0) {
      k = 4;
    }
    paramParsableByteArray.skipBytes(k);
    k = paramParsableByteArray.readUnsignedShort();
    paramParsableByteArray = z2.t("");
    paramParsableByteArray.append((char)((k >> 10 & 0x1F) + 96));
    paramParsableByteArray.append((char)((k >> 5 & 0x1F) + 96));
    paramParsableByteArray.append((char)((k & 0x1F) + 96));
    return Pair.create(Long.valueOf(l), paramParsableByteArray.toString());
  }
  
  private static Metadata parseMetaAtom(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.skipBytes(12);
    while (paramParsableByteArray.getPosition() < paramInt)
    {
      int i = paramParsableByteArray.getPosition();
      int j = paramParsableByteArray.readInt();
      if (paramParsableByteArray.readInt() == Atom.TYPE_ilst)
      {
        paramParsableByteArray.setPosition(i);
        return parseIlst(paramParsableByteArray, i + j);
      }
      paramParsableByteArray.skipBytes(j - 8);
    }
    return null;
  }
  
  private static long parseMvhd(ParsableByteArray paramParsableByteArray)
  {
    int i = 8;
    paramParsableByteArray.setPosition(8);
    if (Atom.parseFullAtomVersion(paramParsableByteArray.readInt()) != 0) {
      i = 16;
    }
    paramParsableByteArray.skipBytes(i);
    return paramParsableByteArray.readUnsignedInt();
  }
  
  private static float parsePaspFromParent(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.setPosition(paramInt + 8);
    int i = paramParsableByteArray.readUnsignedIntToInt();
    paramInt = paramParsableByteArray.readUnsignedIntToInt();
    return i / paramInt;
  }
  
  private static byte[] parseProjFromParent(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    while (i - paramInt1 < paramInt2)
    {
      paramParsableByteArray.setPosition(i);
      int j = paramParsableByteArray.readInt();
      if (paramParsableByteArray.readInt() == Atom.TYPE_proj) {
        return Arrays.copyOfRange(data, i, j + i);
      }
      i += j;
    }
    return null;
  }
  
  private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2)
  {
    int i = paramParsableByteArray.getPosition();
    while (i - paramInt1 < paramInt2)
    {
      paramParsableByteArray.setPosition(i);
      int j = paramParsableByteArray.readInt();
      boolean bool;
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool, "childAtomSize should be positive");
      if (paramParsableByteArray.readInt() == Atom.TYPE_sinf)
      {
        Pair localPair = parseCommonEncryptionSinfFromParent(paramParsableByteArray, i, j);
        if (localPair != null) {
          return localPair;
        }
      }
      i += j;
    }
    return null;
  }
  
  private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, String paramString)
  {
    int i = paramInt1 + 8;
    for (;;)
    {
      Object localObject1 = null;
      if (i - paramInt1 >= paramInt2) {
        break;
      }
      paramParsableByteArray.setPosition(i);
      int j = paramParsableByteArray.readInt();
      if (paramParsableByteArray.readInt() == Atom.TYPE_tenc)
      {
        paramInt1 = Atom.parseFullAtomVersion(paramParsableByteArray.readInt());
        paramParsableByteArray.skipBytes(1);
        if (paramInt1 == 0)
        {
          paramParsableByteArray.skipBytes(1);
          paramInt1 = 0;
          paramInt2 = paramInt1;
        }
        else
        {
          paramInt1 = paramParsableByteArray.readUnsignedByte();
          paramInt2 = paramInt1 & 0xF;
          paramInt1 = (paramInt1 & 0xF0) >> 4;
        }
        boolean bool;
        if (paramParsableByteArray.readUnsignedByte() == 1) {
          bool = true;
        } else {
          bool = false;
        }
        i = paramParsableByteArray.readUnsignedByte();
        byte[] arrayOfByte = new byte[16];
        paramParsableByteArray.readBytes(arrayOfByte, 0, 16);
        Object localObject2 = localObject1;
        if (bool)
        {
          localObject2 = localObject1;
          if (i == 0)
          {
            j = paramParsableByteArray.readUnsignedByte();
            localObject2 = new byte[j];
            paramParsableByteArray.readBytes((byte[])localObject2, 0, j);
          }
        }
        return new TrackEncryptionBox(bool, paramString, i, arrayOfByte, paramInt1, paramInt2, (byte[])localObject2);
      }
      i += j;
    }
    return null;
  }
  
  public static TrackSampleTable parseStbl(Track paramTrack, Atom.ContainerAtom paramContainerAtom, GaplessInfoHolder paramGaplessInfoHolder)
    throws ParserException
  {
    Object localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new StszSampleSizeBox((Atom.LeafAtom)localObject1);
    }
    else
    {
      localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
      if (localObject1 == null) {
        break label2156;
      }
      localObject2 = new Stz2SampleSizeBox((Atom.LeafAtom)localObject1);
    }
    int i = ((SampleSizeBox)localObject2).getSampleCount();
    int j = 0;
    if (i == 0) {
      return new TrackSampleTable(paramTrack, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
    }
    localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_stco);
    int k = 1;
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_co64);
      bool1 = true;
    }
    else
    {
      bool1 = false;
    }
    Object localObject3 = data;
    Object localObject4 = getLeafAtomOfTypeTYPE_stscdata;
    Object localObject5 = getLeafAtomOfTypeTYPE_sttsdata;
    localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_stss);
    Object localObject6 = null;
    if (localObject1 != null) {
      localObject1 = data;
    } else {
      localObject1 = null;
    }
    paramContainerAtom = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
    Object localObject7;
    if (paramContainerAtom != null) {
      localObject7 = data;
    } else {
      localObject7 = null;
    }
    Object localObject8 = new ChunkIterator((ParsableByteArray)localObject4, (ParsableByteArray)localObject3, bool1);
    ((ParsableByteArray)localObject5).setPosition(12);
    int m = ((ParsableByteArray)localObject5).readUnsignedIntToInt() - 1;
    int n = ((ParsableByteArray)localObject5).readUnsignedIntToInt();
    int i1 = ((ParsableByteArray)localObject5).readUnsignedIntToInt();
    int i2;
    if (localObject7 != null)
    {
      ((ParsableByteArray)localObject7).setPosition(12);
      i2 = ((ParsableByteArray)localObject7).readUnsignedIntToInt();
    }
    else
    {
      i2 = 0;
    }
    int i3 = -1;
    int i4 = i3;
    int i5;
    if (localObject1 != null)
    {
      ((ParsableByteArray)localObject1).setPosition(12);
      i5 = ((ParsableByteArray)localObject1).readUnsignedIntToInt();
      j = i5;
      paramContainerAtom = (Atom.ContainerAtom)localObject6;
      i4 = i3;
      if (i5 > 0)
      {
        i4 = ((ParsableByteArray)localObject1).readUnsignedIntToInt() - 1;
        j = i5;
      }
    }
    else
    {
      paramContainerAtom = (Atom.ContainerAtom)localObject1;
    }
    if ((((SampleSizeBox)localObject2).isFixedSampleSize()) && ("audio/raw".equals(format.sampleMimeType)) && (m == 0) && (i2 == 0) && (j == 0)) {
      i5 = k;
    } else {
      i5 = 0;
    }
    long l1;
    if (i5 == 0)
    {
      localObject4 = new long[i];
      localObject3 = new int[i];
      localObject1 = new long[i];
      localObject6 = new int[i];
      int i6 = 0;
      i3 = 0;
      int i7 = i4;
      l1 = 0L;
      l2 = l1;
      k = 0;
      i4 = 0;
      int i8 = 0;
      i5 = n;
      int i9 = j;
      j = i4;
      i4 = i6;
      n = i8;
      while (k < i)
      {
        boolean bool2;
        for (bool1 = true; i3 == 0; bool1 = bool2)
        {
          bool2 = ((ChunkIterator)localObject8).moveNext();
          bool1 = bool2;
          if (!bool2) {
            break;
          }
          l1 = offset;
          i3 = numSamples;
        }
        i10 = i5;
        if (!bool1)
        {
          Log.w("AtomParsers", "Unexpected end of chunk data");
          paramContainerAtom = Arrays.copyOf((long[])localObject4, k);
          localObject2 = Arrays.copyOf((int[])localObject3, k);
          localObject1 = Arrays.copyOf((long[])localObject1, k);
          localObject6 = Arrays.copyOf((int[])localObject6, k);
          i2 = 0;
          i4 = 0;
          i = k;
          break label873;
        }
        i6 = i2;
        i8 = i4;
        i5 = j;
        if (localObject7 != null)
        {
          while ((i4 == 0) && (i2 > 0))
          {
            i4 = ((ParsableByteArray)localObject7).readUnsignedIntToInt();
            j = ((ParsableByteArray)localObject7).readInt();
            i2--;
          }
          i8 = i4 - 1;
          i5 = j;
          i6 = i2;
        }
        localObject4[k] = l1;
        j = ((SampleSizeBox)localObject2).readNextSampleSize();
        localObject3[k] = j;
        int i11 = n;
        if (j > n) {
          i11 = j;
        }
        localObject1[k] = (l2 + i5);
        if (paramContainerAtom == null) {
          j = 1;
        } else {
          j = 0;
        }
        localObject6[k] = j;
        j = i7;
        n = i9;
        if (k == i7)
        {
          localObject6[k] = 1;
          i2 = i9 - 1;
          j = i7;
          n = i2;
          if (i2 > 0)
          {
            j = paramContainerAtom.readUnsignedIntToInt() - 1;
            n = i2;
          }
        }
        l2 += i1;
        i2 = i10 - 1;
        if ((i2 == 0) && (m > 0))
        {
          i2 = ((ParsableByteArray)localObject5).readUnsignedIntToInt();
          i7 = ((ParsableByteArray)localObject5).readInt();
          i4 = m - 1;
          m = i7;
        }
        else
        {
          i4 = m;
          m = i1;
        }
        l1 += localObject3[k];
        i3--;
        k++;
        i10 = i5;
        i1 = m;
        m = i4;
        i7 = j;
        i9 = n;
        n = i11;
        i5 = i2;
        i2 = i6;
        i4 = i8;
        j = i10;
      }
      int i10 = i5;
      localObject2 = localObject3;
      paramContainerAtom = (Atom.ContainerAtom)localObject4;
      label873:
      l1 = l2 + j;
      if (i4 == 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Assertions.checkArgument(bool1);
      while (i2 > 0)
      {
        if (((ParsableByteArray)localObject7).readUnsignedIntToInt() == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        Assertions.checkArgument(bool1);
        ((ParsableByteArray)localObject7).readInt();
        i2--;
      }
      if ((i9 == 0) && (i10 == 0) && (i3 == 0) && (m == 0)) {
        break label1061;
      }
      localObject7 = z2.t("Inconsistent stbl box for track ");
      ((StringBuilder)localObject7).append(id);
      ((StringBuilder)localObject7).append(": remainingSynchronizationSamples ");
      ((StringBuilder)localObject7).append(i9);
      ((StringBuilder)localObject7).append(", remainingSamplesAtTimestampDelta ");
      ((StringBuilder)localObject7).append(i10);
      ((StringBuilder)localObject7).append(", remainingSamplesInChunk ");
      ((StringBuilder)localObject7).append(i3);
      ((StringBuilder)localObject7).append(", remainingTimestampDeltaChanges ");
      ((StringBuilder)localObject7).append(m);
      Log.w("AtomParsers", ((StringBuilder)localObject7).toString());
      label1061:
      i2 = i;
      localObject7 = localObject6;
      j = n;
      localObject6 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject7;
    }
    else
    {
      j = length;
      paramContainerAtom = new long[j];
      localObject1 = new int[j];
      while (((ChunkIterator)localObject8).moveNext())
      {
        j = index;
        paramContainerAtom[j] = offset;
        localObject1[j] = numSamples;
      }
      localObject2 = format;
      localObject7 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(pcmEncoding, channelCount), paramContainerAtom, (int[])localObject1, i1);
      paramContainerAtom = offsets;
      localObject6 = sizes;
      j = maximumSize;
      localObject2 = timestamps;
      localObject1 = flags;
      l1 = duration;
      i2 = i;
    }
    Track localTrack = paramTrack;
    long l2 = Util.scaleLargeTimestamp(l1, 1000000L, timescale);
    if ((editListDurations != null) && (!paramGaplessInfoHolder.hasGaplessInfo()))
    {
      localObject7 = editListDurations;
      if ((localObject7.length == 1) && (type == 1) && (localObject2.length >= 2))
      {
        long l3 = editListMediaTimes[0];
        l2 = l3 + Util.scaleLargeTimestamp(localObject7[0], timescale, movieTimescale);
        if (canApplyEditWithGaplessInfo((long[])localObject2, l1, l3, l2))
        {
          l3 = Util.scaleLargeTimestamp(l3 - localObject2[0], format.sampleRate, timescale);
          l2 = Util.scaleLargeTimestamp(l1 - l2, format.sampleRate, timescale);
          if (((l3 != 0L) || (l2 != 0L)) && (l3 <= 2147483647L) && (l2 <= 2147483647L))
          {
            encoderDelay = ((int)l3);
            encoderPadding = ((int)l2);
            Util.scaleLargeTimestampsInPlace((long[])localObject2, 1000000L, timescale);
            return new TrackSampleTable(paramTrack, paramContainerAtom, (int[])localObject6, j, (long[])localObject2, (int[])localObject1, Util.scaleLargeTimestamp(editListDurations[0], 1000000L, movieTimescale));
          }
        }
      }
      paramGaplessInfoHolder = editListDurations;
      if ((paramGaplessInfoHolder.length == 1) && (paramGaplessInfoHolder[0] == 0L))
      {
        l2 = editListMediaTimes[0];
        for (i2 = 0; i2 < localObject2.length; i2++) {
          localObject2[i2] = Util.scaleLargeTimestamp(localObject2[i2] - l2, 1000000L, timescale);
        }
        return new TrackSampleTable(paramTrack, paramContainerAtom, (int[])localObject6, j, (long[])localObject2, (int[])localObject1, Util.scaleLargeTimestamp(l1 - l2, 1000000L, timescale));
      }
      if (type == 1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      localObject5 = new int[paramGaplessInfoHolder.length];
      localObject8 = new int[paramGaplessInfoHolder.length];
      i = 0;
      i5 = 0;
      i4 = 0;
      i3 = 0;
      for (;;)
      {
        paramGaplessInfoHolder = editListDurations;
        if (i5 >= paramGaplessInfoHolder.length) {
          break;
        }
        l2 = editListMediaTimes[i5];
        if (l2 != -1L)
        {
          l1 = Util.scaleLargeTimestamp(paramGaplessInfoHolder[i5], timescale, movieTimescale);
          k = 1;
          localObject5[i5] = Util.binarySearchCeil((long[])localObject2, l2, true, true);
          localObject8[i5] = Util.binarySearchCeil((long[])localObject2, l2 + l1, bool1, false);
          for (;;)
          {
            n = localObject5[i5];
            m = localObject8[i5];
            if ((n >= m) || ((localObject1[n] & 0x1) != 0)) {
              break;
            }
            localObject5[i5] = (n + 1);
          }
          if (i3 != n) {
            i3 = k;
          } else {
            i3 = 0;
          }
          i = i3 | i;
          i4 = m - n + i4;
          i3 = m;
        }
        i5++;
      }
      i5 = 0;
      i3 = 1;
      if (i4 != i2) {
        i2 = i3;
      } else {
        i2 = 0;
      }
      m = i2 | i;
      if (m != 0) {
        paramGaplessInfoHolder = new long[i4];
      } else {
        paramGaplessInfoHolder = paramContainerAtom;
      }
      if (m != 0) {
        localObject7 = new int[i4];
      } else {
        localObject7 = localObject6;
      }
      if (m != 0) {
        j = 0;
      }
      if (m != 0) {
        localObject4 = new int[i4];
      } else {
        localObject4 = localObject1;
      }
      long[] arrayOfLong = new long[i4];
      i4 = 0;
      l1 = 0L;
      localObject3 = paramContainerAtom;
      i2 = i5;
      while (i2 < editListDurations.length)
      {
        l2 = editListMediaTimes[i2];
        i = localObject5[i2];
        i5 = localObject8[i2];
        if (m != 0)
        {
          i3 = i5 - i;
          System.arraycopy(localObject3, i, paramGaplessInfoHolder, i4, i3);
          System.arraycopy(localObject6, i, localObject7, i4, i3);
          System.arraycopy(localObject1, i, localObject4, i4, i3);
        }
        paramContainerAtom = (Atom.ContainerAtom)localObject6;
        while (i < i5)
        {
          arrayOfLong[i4] = (Util.scaleLargeTimestamp(l1, 1000000L, movieTimescale) + Util.scaleLargeTimestamp(localObject2[i] - l2, 1000000L, timescale));
          i3 = j;
          if (m != 0)
          {
            i3 = j;
            if (localObject7[i4] > j) {
              i3 = paramContainerAtom[i];
            }
          }
          i4++;
          i++;
          j = i3;
        }
        l1 += editListDurations[i2];
        i2++;
        localObject6 = paramContainerAtom;
      }
      return new TrackSampleTable(paramTrack, paramGaplessInfoHolder, (int[])localObject7, j, arrayOfLong, (int[])localObject4, Util.scaleLargeTimestamp(l1, 1000000L, movieTimescale));
    }
    Util.scaleLargeTimestampsInPlace((long[])localObject2, 1000000L, timescale);
    return new TrackSampleTable(paramTrack, paramContainerAtom, (int[])localObject6, j, (long[])localObject2, (int[])localObject1, l2);
    label2156:
    throw new ParserException("Track has no sample table size information");
  }
  
  private static StsdData parseStsd(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, String paramString, DrmInitData paramDrmInitData, boolean paramBoolean)
    throws ParserException
  {
    paramParsableByteArray.setPosition(12);
    int i = paramParsableByteArray.readInt();
    StsdData localStsdData = new StsdData(i);
    for (int j = 0; j < i; j++)
    {
      int k = paramParsableByteArray.getPosition();
      int m = paramParsableByteArray.readInt();
      boolean bool;
      if (m > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool, "childAtomSize should be positive");
      int n = paramParsableByteArray.readInt();
      if ((n != Atom.TYPE_avc1) && (n != Atom.TYPE_avc3) && (n != Atom.TYPE_encv) && (n != Atom.TYPE_mp4v) && (n != Atom.TYPE_hvc1) && (n != Atom.TYPE_hev1) && (n != Atom.TYPE_s263) && (n != Atom.TYPE_vp08) && (n != Atom.TYPE_vp09))
      {
        if ((n != Atom.TYPE_mp4a) && (n != Atom.TYPE_enca) && (n != Atom.TYPE_ac_3) && (n != Atom.TYPE_ec_3) && (n != Atom.TYPE_dtsc) && (n != Atom.TYPE_dtse) && (n != Atom.TYPE_dtsh) && (n != Atom.TYPE_dtsl) && (n != Atom.TYPE_samr) && (n != Atom.TYPE_sawb) && (n != Atom.TYPE_lpcm) && (n != Atom.TYPE_sowt) && (n != Atom.TYPE__mp3) && (n != Atom.TYPE_alac) && (n != Atom.TYPE_alaw) && (n != Atom.TYPE_ulaw))
        {
          if ((n != Atom.TYPE_TTML) && (n != Atom.TYPE_tx3g) && (n != Atom.TYPE_wvtt) && (n != Atom.TYPE_stpp) && (n != Atom.TYPE_c608))
          {
            if (n == Atom.TYPE_camm) {
              format = Format.createSampleFormat(Integer.toString(paramInt1), "application/x-camera-motion", null, -1, null);
            }
          }
          else {
            parseTextSampleEntry(paramParsableByteArray, n, k, m, paramInt1, paramString, localStsdData);
          }
        }
        else {
          parseAudioSampleEntry(paramParsableByteArray, n, k, m, paramInt1, paramString, paramBoolean, paramDrmInitData, localStsdData, j);
        }
      }
      else {
        parseVideoSampleEntry(paramParsableByteArray, n, k, m, paramInt1, paramInt2, paramDrmInitData, localStsdData, j);
      }
      paramParsableByteArray.setPosition(k + m);
    }
    return localStsdData;
  }
  
  private static void parseTextSampleEntry(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, StsdData paramStsdData)
    throws ParserException
  {
    paramParsableByteArray.setPosition(paramInt2 + 8 + 8);
    paramInt2 = Atom.TYPE_TTML;
    String str = "application/ttml+xml";
    Object localObject = null;
    long l = Long.MAX_VALUE;
    if (paramInt1 == paramInt2) {
      paramParsableByteArray = str;
    }
    for (;;)
    {
      break;
      if (paramInt1 == Atom.TYPE_tx3g)
      {
        paramInt1 = paramInt3 - 8 - 8;
        localObject = new byte[paramInt1];
        paramParsableByteArray.readBytes((byte[])localObject, 0, paramInt1);
        localObject = Collections.singletonList(localObject);
        paramParsableByteArray = "application/x-quicktime-tx3g";
      }
      else if (paramInt1 == Atom.TYPE_wvtt)
      {
        paramParsableByteArray = "application/x-mp4-vtt";
      }
      else if (paramInt1 == Atom.TYPE_stpp)
      {
        l = 0L;
        paramParsableByteArray = str;
      }
      else
      {
        if (paramInt1 != Atom.TYPE_c608) {
          break label157;
        }
        requiredSampleTransformation = 1;
        paramParsableByteArray = "application/x-mp4-cea-608";
      }
    }
    format = Format.createTextSampleFormat(Integer.toString(paramInt4), paramParsableByteArray, null, -1, 0, paramString, -1, null, l, (List)localObject);
    return;
    label157:
    throw new IllegalStateException();
  }
  
  private static TkhdData parseTkhd(ParsableByteArray paramParsableByteArray)
  {
    int i = 8;
    paramParsableByteArray.setPosition(8);
    int j = Atom.parseFullAtomVersion(paramParsableByteArray.readInt());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    }
    paramParsableByteArray.skipBytes(k);
    int m = paramParsableByteArray.readInt();
    paramParsableByteArray.skipBytes(4);
    int n = paramParsableByteArray.getPosition();
    int k = i;
    if (j == 0) {
      k = 4;
    }
    int i1 = 0;
    for (i = 0; i < k; i++) {
      if (data[(n + i)] != -1)
      {
        i = 0;
        break label96;
      }
    }
    i = 1;
    label96:
    long l1 = -9223372036854775807L;
    long l2;
    if (i != 0)
    {
      paramParsableByteArray.skipBytes(k);
      l2 = l1;
    }
    else
    {
      if (j == 0) {
        l2 = paramParsableByteArray.readUnsignedInt();
      } else {
        l2 = paramParsableByteArray.readUnsignedLongToLong();
      }
      if (l2 == 0L) {
        l2 = l1;
      }
    }
    paramParsableByteArray.skipBytes(16);
    j = paramParsableByteArray.readInt();
    n = paramParsableByteArray.readInt();
    paramParsableByteArray.skipBytes(4);
    i = paramParsableByteArray.readInt();
    int i2 = paramParsableByteArray.readInt();
    if ((j == 0) && (n == 65536) && (i == -65536) && (i2 == 0))
    {
      k = 90;
    }
    else if ((j == 0) && (n == -65536) && (i == 65536) && (i2 == 0))
    {
      k = 270;
    }
    else
    {
      k = i1;
      if (j == -65536)
      {
        k = i1;
        if (n == 0)
        {
          k = i1;
          if (i == 0)
          {
            k = i1;
            if (i2 == -65536) {
              k = 180;
            }
          }
        }
      }
    }
    return new TkhdData(m, l2, k);
  }
  
  public static Track parseTrak(Atom.ContainerAtom paramContainerAtom, Atom.LeafAtom paramLeafAtom, long paramLong, DrmInitData paramDrmInitData, boolean paramBoolean1, boolean paramBoolean2)
    throws ParserException
  {
    Object localObject1 = paramContainerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
    int i = parseHdlr(getLeafAtomOfTypeTYPE_hdlrdata);
    Object localObject2 = null;
    if (i == -1) {
      return null;
    }
    TkhdData localTkhdData = parseTkhd(getLeafAtomOfTypeTYPE_tkhddata);
    long l1 = -9223372036854775807L;
    if (paramLong == -9223372036854775807L) {
      paramLong = TkhdData.access$000(localTkhdData);
    }
    long l2 = parseMvhd(data);
    if (paramLong == -9223372036854775807L) {
      paramLong = l1;
    } else {
      paramLong = Util.scaleLargeTimestamp(paramLong, 1000000L, l2);
    }
    paramLeafAtom = ((Atom.ContainerAtom)localObject1).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
    localObject1 = parseMdhd(getLeafAtomOfTypeTYPE_mdhddata);
    paramDrmInitData = parseStsd(getLeafAtomOfTypeTYPE_stsddata, TkhdData.access$100(localTkhdData), TkhdData.access$200(localTkhdData), (String)second, paramDrmInitData, paramBoolean2);
    if (!paramBoolean1)
    {
      paramLeafAtom = parseEdts(paramContainerAtom.getContainerAtomOfType(Atom.TYPE_edts));
      paramContainerAtom = (long[])first;
      paramLeafAtom = (long[])second;
    }
    else
    {
      paramContainerAtom = null;
      paramLeafAtom = paramContainerAtom;
    }
    if (format == null) {
      paramContainerAtom = (Atom.ContainerAtom)localObject2;
    } else {
      paramContainerAtom = new Track(TkhdData.access$100(localTkhdData), i, ((Long)first).longValue(), l2, paramLong, format, requiredSampleTransformation, trackEncryptionBoxes, nalUnitLengthFieldLength, paramContainerAtom, paramLeafAtom);
    }
    return paramContainerAtom;
  }
  
  public static Metadata parseUdta(Atom.LeafAtom paramLeafAtom, boolean paramBoolean)
  {
    if (paramBoolean) {
      return null;
    }
    paramLeafAtom = data;
    paramLeafAtom.setPosition(8);
    while (paramLeafAtom.bytesLeft() >= 8)
    {
      int i = paramLeafAtom.getPosition();
      int j = paramLeafAtom.readInt();
      if (paramLeafAtom.readInt() == Atom.TYPE_meta)
      {
        paramLeafAtom.setPosition(i);
        return parseMetaAtom(paramLeafAtom, i + j);
      }
      paramLeafAtom.skipBytes(j - 8);
    }
    return null;
  }
  
  private static void parseVideoSampleEntry(ParsableByteArray paramParsableByteArray, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, DrmInitData paramDrmInitData, StsdData paramStsdData, int paramInt6)
    throws ParserException
  {
    paramParsableByteArray.setPosition(paramInt2 + 8 + 8);
    paramParsableByteArray.skipBytes(16);
    int i = paramParsableByteArray.readUnsignedShort();
    int j = paramParsableByteArray.readUnsignedShort();
    paramParsableByteArray.skipBytes(50);
    int k = paramParsableByteArray.getPosition();
    int m = Atom.TYPE_encv;
    DrmInitData localDrmInitData = null;
    Object localObject1 = paramDrmInitData;
    int n = paramInt1;
    Object localObject2;
    if (paramInt1 == m)
    {
      localObject1 = parseSampleEntryEncryptionData(paramParsableByteArray, paramInt2, paramInt3);
      localObject2 = paramDrmInitData;
      if (localObject1 != null)
      {
        paramInt1 = ((Integer)first).intValue();
        if (paramDrmInitData == null) {
          localObject2 = null;
        } else {
          localObject2 = paramDrmInitData.copyWithSchemeType(second).schemeType);
        }
        trackEncryptionBoxes[paramInt6] = ((TrackEncryptionBox)second);
      }
      paramParsableByteArray.setPosition(k);
      n = paramInt1;
      localObject1 = localObject2;
    }
    m = -1;
    Object localObject3 = null;
    Object localObject4 = localObject3;
    float f1 = 1.0F;
    paramInt1 = 0;
    paramInt6 = k;
    k = paramInt1;
    while (paramInt6 - paramInt2 < paramInt3)
    {
      paramParsableByteArray.setPosition(paramInt6);
      paramInt1 = paramParsableByteArray.getPosition();
      int i1 = paramParsableByteArray.readInt();
      if ((i1 == 0) && (paramParsableByteArray.getPosition() - paramInt2 == paramInt3)) {
        break;
      }
      boolean bool;
      if (i1 > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkArgument(bool, "childAtomSize should be positive");
      int i2 = paramParsableByteArray.readInt();
      float f2;
      int i3;
      Object localObject5;
      if (i2 == Atom.TYPE_avcC)
      {
        if (localDrmInitData == null) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        paramParsableByteArray.setPosition(paramInt1 + 8);
        paramDrmInitData = AvcConfig.parse(paramParsableByteArray);
        localObject2 = initializationData;
        nalUnitLengthFieldLength = nalUnitLengthFieldLength;
        f2 = f1;
        if (k == 0) {
          f2 = pixelWidthAspectRatio;
        }
        paramDrmInitData = "video/avc";
        i3 = k;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_hvcC)
      {
        if (localDrmInitData == null) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        paramParsableByteArray.setPosition(paramInt1 + 8);
        paramDrmInitData = HevcConfig.parse(paramParsableByteArray);
        localObject2 = initializationData;
        nalUnitLengthFieldLength = nalUnitLengthFieldLength;
        paramDrmInitData = "video/hevc";
        i3 = k;
        f2 = f1;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_vpcC)
      {
        if (localDrmInitData == null) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        if (n == Atom.TYPE_vp08) {
          paramDrmInitData = "video/x-vnd.on2.vp8";
        } else {
          paramDrmInitData = "video/x-vnd.on2.vp9";
        }
        i3 = k;
        localObject2 = localObject3;
        f2 = f1;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_d263)
      {
        if (localDrmInitData == null) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        paramDrmInitData = "video/3gpp";
        i3 = k;
        localObject2 = localObject3;
        f2 = f1;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_esds)
      {
        if (localDrmInitData == null) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        localObject2 = parseEsdsFromParent(paramParsableByteArray, paramInt1);
        paramDrmInitData = (String)first;
        localObject2 = Collections.singletonList(second);
        i3 = k;
        f2 = f1;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_pasp)
      {
        f2 = parsePaspFromParent(paramParsableByteArray, paramInt1);
        i3 = 1;
        paramDrmInitData = localDrmInitData;
        localObject2 = localObject3;
        localObject5 = localObject4;
        paramInt1 = m;
      }
      else if (i2 == Atom.TYPE_sv3d)
      {
        localObject5 = parseProjFromParent(paramParsableByteArray, paramInt1, i1);
        i3 = k;
        paramDrmInitData = localDrmInitData;
        localObject2 = localObject3;
        f2 = f1;
        paramInt1 = m;
      }
      else
      {
        i3 = k;
        paramDrmInitData = localDrmInitData;
        localObject2 = localObject3;
        f2 = f1;
        localObject5 = localObject4;
        paramInt1 = m;
        if (i2 == Atom.TYPE_st3d)
        {
          i2 = paramParsableByteArray.readUnsignedByte();
          paramParsableByteArray.skipBytes(3);
          i3 = k;
          paramDrmInitData = localDrmInitData;
          localObject2 = localObject3;
          f2 = f1;
          localObject5 = localObject4;
          paramInt1 = m;
          if (i2 == 0)
          {
            paramInt1 = paramParsableByteArray.readUnsignedByte();
            if (paramInt1 != 0)
            {
              if (paramInt1 != 1)
              {
                if (paramInt1 != 2)
                {
                  if (paramInt1 != 3)
                  {
                    i3 = k;
                    paramDrmInitData = localDrmInitData;
                    localObject2 = localObject3;
                    f2 = f1;
                    localObject5 = localObject4;
                    paramInt1 = m;
                  }
                  else
                  {
                    paramInt1 = 3;
                    i3 = k;
                    paramDrmInitData = localDrmInitData;
                    localObject2 = localObject3;
                    f2 = f1;
                    localObject5 = localObject4;
                  }
                }
                else
                {
                  paramInt1 = 2;
                  i3 = k;
                  paramDrmInitData = localDrmInitData;
                  localObject2 = localObject3;
                  f2 = f1;
                  localObject5 = localObject4;
                }
              }
              else
              {
                paramInt1 = 1;
                i3 = k;
                paramDrmInitData = localDrmInitData;
                localObject2 = localObject3;
                f2 = f1;
                localObject5 = localObject4;
              }
            }
            else
            {
              paramInt1 = 0;
              localObject5 = localObject4;
              f2 = f1;
              localObject2 = localObject3;
              paramDrmInitData = localDrmInitData;
              i3 = k;
            }
          }
        }
      }
      paramInt6 += i1;
      k = i3;
      localDrmInitData = paramDrmInitData;
      localObject3 = localObject2;
      f1 = f2;
      localObject4 = localObject5;
      m = paramInt1;
    }
    if (localDrmInitData == null) {
      return;
    }
    format = Format.createVideoSampleFormat(Integer.toString(paramInt4), localDrmInitData, null, -1, -1, i, j, -1.0F, (List)localObject3, paramInt5, f1, (byte[])localObject4, m, null, (DrmInitData)localObject1);
  }
  
  public static final class ChunkIterator
  {
    private final ParsableByteArray chunkOffsets;
    private final boolean chunkOffsetsAreLongs;
    public int index;
    public final int length;
    private int nextSamplesPerChunkChangeIndex;
    public int numSamples;
    public long offset;
    private int remainingSamplesPerChunkChanges;
    private final ParsableByteArray stsc;
    
    public ChunkIterator(ParsableByteArray paramParsableByteArray1, ParsableByteArray paramParsableByteArray2, boolean paramBoolean)
    {
      stsc = paramParsableByteArray1;
      chunkOffsets = paramParsableByteArray2;
      chunkOffsetsAreLongs = paramBoolean;
      paramParsableByteArray2.setPosition(12);
      length = paramParsableByteArray2.readUnsignedIntToInt();
      paramParsableByteArray1.setPosition(12);
      remainingSamplesPerChunkChanges = paramParsableByteArray1.readUnsignedIntToInt();
      int i = paramParsableByteArray1.readInt();
      paramBoolean = true;
      if (i != 1) {
        paramBoolean = false;
      }
      Assertions.checkState(paramBoolean, "first_chunk must be 1");
      index = -1;
    }
    
    public boolean moveNext()
    {
      int i = index + 1;
      index = i;
      if (i == length) {
        return false;
      }
      long l;
      if (chunkOffsetsAreLongs) {
        l = chunkOffsets.readUnsignedLongToLong();
      } else {
        l = chunkOffsets.readUnsignedInt();
      }
      offset = l;
      if (index == nextSamplesPerChunkChangeIndex)
      {
        numSamples = stsc.readUnsignedIntToInt();
        stsc.skipBytes(4);
        i = remainingSamplesPerChunkChanges - 1;
        remainingSamplesPerChunkChanges = i;
        if (i > 0) {
          i = stsc.readUnsignedIntToInt() - 1;
        } else {
          i = -1;
        }
        nextSamplesPerChunkChangeIndex = i;
      }
      return true;
    }
  }
  
  public static abstract interface SampleSizeBox
  {
    public abstract int getSampleCount();
    
    public abstract boolean isFixedSampleSize();
    
    public abstract int readNextSampleSize();
  }
  
  public static final class StsdData
  {
    public static final int STSD_HEADER_SIZE = 8;
    public Format format;
    public int nalUnitLengthFieldLength;
    public int requiredSampleTransformation;
    public final TrackEncryptionBox[] trackEncryptionBoxes;
    
    public StsdData(int paramInt)
    {
      trackEncryptionBoxes = new TrackEncryptionBox[paramInt];
      requiredSampleTransformation = 0;
    }
  }
  
  public static final class StszSampleSizeBox
    implements AtomParsers.SampleSizeBox
  {
    private final ParsableByteArray data;
    private final int fixedSampleSize;
    private final int sampleCount;
    
    public StszSampleSizeBox(Atom.LeafAtom paramLeafAtom)
    {
      paramLeafAtom = data;
      data = paramLeafAtom;
      paramLeafAtom.setPosition(12);
      fixedSampleSize = paramLeafAtom.readUnsignedIntToInt();
      sampleCount = paramLeafAtom.readUnsignedIntToInt();
    }
    
    public int getSampleCount()
    {
      return sampleCount;
    }
    
    public boolean isFixedSampleSize()
    {
      boolean bool;
      if (fixedSampleSize != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int readNextSampleSize()
    {
      int i = fixedSampleSize;
      int j = i;
      if (i == 0) {
        j = data.readUnsignedIntToInt();
      }
      return j;
    }
  }
  
  public static final class Stz2SampleSizeBox
    implements AtomParsers.SampleSizeBox
  {
    private int currentByte;
    private final ParsableByteArray data;
    private final int fieldSize;
    private final int sampleCount;
    private int sampleIndex;
    
    public Stz2SampleSizeBox(Atom.LeafAtom paramLeafAtom)
    {
      paramLeafAtom = data;
      data = paramLeafAtom;
      paramLeafAtom.setPosition(12);
      fieldSize = (paramLeafAtom.readUnsignedIntToInt() & 0xFF);
      sampleCount = paramLeafAtom.readUnsignedIntToInt();
    }
    
    public int getSampleCount()
    {
      return sampleCount;
    }
    
    public boolean isFixedSampleSize()
    {
      return false;
    }
    
    public int readNextSampleSize()
    {
      int i = fieldSize;
      if (i == 8) {
        return data.readUnsignedByte();
      }
      if (i == 16) {
        return data.readUnsignedShort();
      }
      i = sampleIndex;
      sampleIndex = (i + 1);
      if (i % 2 == 0)
      {
        i = data.readUnsignedByte();
        currentByte = i;
        return (i & 0xF0) >> 4;
      }
      return currentByte & 0xF;
    }
  }
  
  public static final class TkhdData
  {
    private final long duration;
    private final int id;
    private final int rotationDegrees;
    
    public TkhdData(int paramInt1, long paramLong, int paramInt2)
    {
      id = paramInt1;
      duration = paramLong;
      rotationDegrees = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */