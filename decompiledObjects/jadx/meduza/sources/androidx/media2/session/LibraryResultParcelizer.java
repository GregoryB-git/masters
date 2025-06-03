package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import b2.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class LibraryResultParcelizer {
    public static LibraryResult read(c cVar) {
        ArrayList arrayList;
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f1086a = cVar.o(libraryResult.f1086a, 1);
        libraryResult.f1087b = cVar.q(2, libraryResult.f1087b);
        libraryResult.f1089d = (MediaItem) cVar.x(libraryResult.f1089d, 3);
        libraryResult.f1090e = (MediaLibraryService$LibraryParams) cVar.x(libraryResult.f1090e, 4);
        ParcelImplListSlice parcelImplListSlice = (ParcelImplListSlice) cVar.s(libraryResult.f1091g, 5);
        libraryResult.f1091g = parcelImplListSlice;
        libraryResult.f1088c = libraryResult.f1089d;
        HashMap hashMap = a.f1133a;
        if (parcelImplListSlice == null) {
            arrayList = null;
        } else {
            List<ParcelImpl> list = parcelImplListSlice.f1037a;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                ParcelImpl parcelImpl = list.get(i10);
                if (parcelImpl != null) {
                    arrayList2.add((MediaItem) b2.a.a(parcelImpl));
                }
            }
            arrayList = arrayList2;
        }
        libraryResult.f = arrayList;
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, c cVar) {
        ParcelImplListSlice parcelImplListSlice;
        cVar.getClass();
        MediaItem mediaItem = libraryResult.f1088c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (libraryResult.f1089d == null) {
                    libraryResult.f1089d = a.a(libraryResult.f1088c);
                }
            }
        }
        ArrayList arrayList = libraryResult.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                if (libraryResult.f1091g == null) {
                    ArrayList arrayList2 = libraryResult.f;
                    HashMap hashMap = a.f1133a;
                    if (arrayList2 == null) {
                        parcelImplListSlice = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            MediaItem mediaItem2 = (MediaItem) arrayList2.get(i10);
                            if (mediaItem2 != null) {
                                arrayList3.add(MediaParcelUtils.a(mediaItem2));
                            }
                        }
                        parcelImplListSlice = new ParcelImplListSlice(arrayList3);
                    }
                    libraryResult.f1091g = parcelImplListSlice;
                }
            }
        }
        cVar.I(libraryResult.f1086a, 1);
        cVar.J(2, libraryResult.f1087b);
        cVar.R(libraryResult.f1089d, 3);
        cVar.R(libraryResult.f1090e, 4);
        cVar.M(libraryResult.f1091g, 5);
    }
}
