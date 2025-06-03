package androidx.media2.session;

import b2.c;

public final class LibraryParamsParcelizer
{
  public static MediaLibraryService.LibraryParams read(c paramc)
  {
    MediaLibraryService.LibraryParams localLibraryParams = new MediaLibraryService.LibraryParams();
    a = paramc.h(1, a);
    b = paramc.o(b, 2);
    c = paramc.o(c, 3);
    d = paramc.o(d, 4);
    return localLibraryParams;
  }
  
  public static void write(MediaLibraryService.LibraryParams paramLibraryParams, c paramc)
  {
    paramc.getClass();
    paramc.B(1, a);
    paramc.I(b, 2);
    paramc.I(c, 3);
    paramc.I(d, 4);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.LibraryParamsParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */