package androidx.media2.session;

import b2.c;

/* loaded from: classes.dex */
public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(c cVar) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.f1097a = cVar.h(1, mediaLibraryService$LibraryParams.f1097a);
        mediaLibraryService$LibraryParams.f1098b = cVar.o(mediaLibraryService$LibraryParams.f1098b, 2);
        mediaLibraryService$LibraryParams.f1099c = cVar.o(mediaLibraryService$LibraryParams.f1099c, 3);
        mediaLibraryService$LibraryParams.f1100d = cVar.o(mediaLibraryService$LibraryParams.f1100d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, c cVar) {
        cVar.getClass();
        cVar.B(1, mediaLibraryService$LibraryParams.f1097a);
        cVar.I(mediaLibraryService$LibraryParams.f1098b, 2);
        cVar.I(mediaLibraryService$LibraryParams.f1099c, 3);
        cVar.I(mediaLibraryService$LibraryParams.f1100d, 4);
    }
}
