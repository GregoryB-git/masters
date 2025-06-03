package k4;

import o7.t;
import u4.e;
import u4.h;
import u4.l;
import v5.m;
import v5.u;

public final class f
{
  public static final String[] a = { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient" };
  
  public static e a(int paramInt, u paramu)
  {
    int i = paramu.f();
    if (paramu.f() == 1684108385)
    {
      paramu.H(8);
      paramu = paramu.q(i - 16);
      return new e("und", paramu, paramu);
    }
    paramu = f.l("Failed to parse comment attribute: ");
    paramu.append(a.a(paramInt));
    m.f("MetadataUtil", paramu.toString());
    return null;
  }
  
  public static u4.a b(u paramu)
  {
    int i = paramu.f();
    if (paramu.f() == 1684108385)
    {
      int j = paramu.f() & 0xFFFFFF;
      String str;
      if (j == 13) {
        str = "image/jpeg";
      } else if (j == 14) {
        str = "image/png";
      } else {
        str = null;
      }
      if (str == null)
      {
        paramu = f.h("Unrecognized cover art flags: ", j);
      }
      else
      {
        paramu.H(4);
        i -= 16;
        byte[] arrayOfByte = new byte[i];
        paramu.d(arrayOfByte, 0, i);
        return new u4.a(3, str, null, arrayOfByte);
      }
    }
    else
    {
      paramu = "Failed to parse cover art attribute";
    }
    m.f("MetadataUtil", paramu);
    return null;
  }
  
  public static l c(int paramInt, u paramu, String paramString)
  {
    int i = paramu.f();
    if (paramu.f() == 1684108385)
    {
      paramu.H(8);
      return new l(paramString, null, t.t(paramu.q(i - 16)));
    }
    paramu = f.l("Failed to parse text attribute: ");
    paramu.append(a.a(paramInt));
    m.f("MetadataUtil", paramu.toString());
    return null;
  }
  
  public static h d(int paramInt, String paramString, u paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = e(paramu);
    int j = i;
    if (paramBoolean2) {
      j = Math.min(1, i);
    }
    if (j >= 0)
    {
      if (paramBoolean1) {
        paramString = new l(paramString, null, t.t(Integer.toString(j)));
      } else {
        paramString = new e("und", paramString, Integer.toString(j));
      }
      return paramString;
    }
    paramString = f.l("Failed to parse uint8 attribute: ");
    paramString.append(a.a(paramInt));
    m.f("MetadataUtil", paramString.toString());
    return null;
  }
  
  public static int e(u paramu)
  {
    paramu.H(4);
    if (paramu.f() == 1684108385)
    {
      paramu.H(8);
      return paramu.v();
    }
    m.f("MetadataUtil", "Failed to parse uint8 attribute value");
    return -1;
  }
}

/* Location:
 * Qualified Name:     k4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */