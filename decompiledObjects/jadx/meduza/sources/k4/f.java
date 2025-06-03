package k4;

import o7.t;
import v5.u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f9004a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static u4.e a(int i10, u uVar) {
        int f = uVar.f();
        if (uVar.f() == 1684108385) {
            uVar.H(8);
            String q10 = uVar.q(f - 16);
            return new u4.e("und", q10, q10);
        }
        StringBuilder l10 = defpackage.f.l("Failed to parse comment attribute: ");
        l10.append(a.a(i10));
        v5.m.f("MetadataUtil", l10.toString());
        return null;
    }

    public static u4.a b(u uVar) {
        String str;
        int f = uVar.f();
        if (uVar.f() == 1684108385) {
            int f10 = uVar.f() & 16777215;
            String str2 = f10 == 13 ? "image/jpeg" : f10 == 14 ? "image/png" : null;
            if (str2 != null) {
                uVar.H(4);
                int i10 = f - 16;
                byte[] bArr = new byte[i10];
                uVar.d(bArr, 0, i10);
                return new u4.a(3, str2, null, bArr);
            }
            str = defpackage.f.h("Unrecognized cover art flags: ", f10);
        } else {
            str = "Failed to parse cover art attribute";
        }
        v5.m.f("MetadataUtil", str);
        return null;
    }

    public static u4.l c(int i10, u uVar, String str) {
        int f = uVar.f();
        if (uVar.f() == 1684108385) {
            uVar.H(8);
            return new u4.l(str, null, t.t(uVar.q(f - 16)));
        }
        StringBuilder l10 = defpackage.f.l("Failed to parse text attribute: ");
        l10.append(a.a(i10));
        v5.m.f("MetadataUtil", l10.toString());
        return null;
    }

    public static u4.h d(int i10, String str, u uVar, boolean z10, boolean z11) {
        int e10 = e(uVar);
        if (z11) {
            e10 = Math.min(1, e10);
        }
        if (e10 >= 0) {
            return z10 ? new u4.l(str, null, t.t(Integer.toString(e10))) : new u4.e("und", str, Integer.toString(e10));
        }
        StringBuilder l10 = defpackage.f.l("Failed to parse uint8 attribute: ");
        l10.append(a.a(i10));
        v5.m.f("MetadataUtil", l10.toString());
        return null;
    }

    public static int e(u uVar) {
        uVar.H(4);
        if (uVar.f() == 1684108385) {
            uVar.H(8);
            return uVar.v();
        }
        v5.m.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
