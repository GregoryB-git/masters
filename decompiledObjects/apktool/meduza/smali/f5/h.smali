.class public final Lf5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/f0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/h$b;,
        Lf5/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt5/f0$a<",
        "Lf5/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final A:Ljava/util/regex/Pattern;

.field public static final B:Ljava/util/regex/Pattern;

.field public static final C:Ljava/util/regex/Pattern;

.field public static final D:Ljava/util/regex/Pattern;

.field public static final E:Ljava/util/regex/Pattern;

.field public static final F:Ljava/util/regex/Pattern;

.field public static final G:Ljava/util/regex/Pattern;

.field public static final H:Ljava/util/regex/Pattern;

.field public static final I:Ljava/util/regex/Pattern;

.field public static final J:Ljava/util/regex/Pattern;

.field public static final K:Ljava/util/regex/Pattern;

.field public static final L:Ljava/util/regex/Pattern;

.field public static final M:Ljava/util/regex/Pattern;

.field public static final N:Ljava/util/regex/Pattern;

.field public static final O:Ljava/util/regex/Pattern;

.field public static final P:Ljava/util/regex/Pattern;

.field public static final Q:Ljava/util/regex/Pattern;

.field public static final R:Ljava/util/regex/Pattern;

.field public static final S:Ljava/util/regex/Pattern;

.field public static final T:Ljava/util/regex/Pattern;

.field public static final U:Ljava/util/regex/Pattern;

.field public static final V:Ljava/util/regex/Pattern;

.field public static final W:Ljava/util/regex/Pattern;

.field public static final X:Ljava/util/regex/Pattern;

.field public static final Y:Ljava/util/regex/Pattern;

.field public static final Z:Ljava/util/regex/Pattern;

.field public static final a0:Ljava/util/regex/Pattern;

.field public static final b0:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;

.field public static final s:Ljava/util/regex/Pattern;

.field public static final t:Ljava/util/regex/Pattern;

.field public static final u:Ljava/util/regex/Pattern;

.field public static final v:Ljava/util/regex/Pattern;

.field public static final w:Ljava/util/regex/Pattern;

.field public static final x:Ljava/util/regex/Pattern;

.field public static final y:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lf5/f;

.field public final b:Lf5/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->c:Ljava/util/regex/Pattern;

    const-string v0, "VIDEO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->d:Ljava/util/regex/Pattern;

    const-string v0, "AUDIO=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->e:Ljava/util/regex/Pattern;

    const-string v0, "SUBTITLES=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->f:Ljava/util/regex/Pattern;

    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->g:Ljava/util/regex/Pattern;

    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->h:Ljava/util/regex/Pattern;

    const-string v0, "CHANNELS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->i:Ljava/util/regex/Pattern;

    const-string v0, "CODECS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->j:Ljava/util/regex/Pattern;

    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->k:Ljava/util/regex/Pattern;

    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->l:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->m:Ljava/util/regex/Pattern;

    const-string v0, "DURATION=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->n:Ljava/util/regex/Pattern;

    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->o:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->p:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->q:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->r:Ljava/util/regex/Pattern;

    const-string v0, "CAN-SKIP-DATERANGES"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->s:Ljava/util/regex/Pattern;

    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->t:Ljava/util/regex/Pattern;

    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->u:Ljava/util/regex/Pattern;

    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->v:Ljava/util/regex/Pattern;

    const-string v0, "CAN-BLOCK-RELOAD"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->w:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->x:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->y:Ljava/util/regex/Pattern;

    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->z:Ljava/util/regex/Pattern;

    const-string v0, "LAST-MSN=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->A:Ljava/util/regex/Pattern;

    const-string v0, "LAST-PART=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->B:Ljava/util/regex/Pattern;

    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->C:Ljava/util/regex/Pattern;

    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->D:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->E:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->F:Ljava/util/regex/Pattern;

    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->G:Ljava/util/regex/Pattern;

    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->H:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMAT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->I:Ljava/util/regex/Pattern;

    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->J:Ljava/util/regex/Pattern;

    const-string v0, "URI=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->K:Ljava/util/regex/Pattern;

    const-string v0, "IV=([^,.*]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->L:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->M:Ljava/util/regex/Pattern;

    const-string v0, "TYPE=(PART|MAP)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->N:Ljava/util/regex/Pattern;

    const-string v0, "LANGUAGE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->O:Ljava/util/regex/Pattern;

    const-string v0, "NAME=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->P:Ljava/util/regex/Pattern;

    const-string v0, "GROUP-ID=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->Q:Ljava/util/regex/Pattern;

    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->R:Ljava/util/regex/Pattern;

    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->S:Ljava/util/regex/Pattern;

    const-string v0, "AUTOSELECT"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->T:Ljava/util/regex/Pattern;

    const-string v0, "DEFAULT"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->U:Ljava/util/regex/Pattern;

    const-string v0, "FORCED"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->V:Ljava/util/regex/Pattern;

    const-string v0, "INDEPENDENT"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->W:Ljava/util/regex/Pattern;

    const-string v0, "GAP"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->X:Ljava/util/regex/Pattern;

    const-string v0, "PRECISE"

    invoke-static {v0}, Lf5/h;->b(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->Y:Ljava/util/regex/Pattern;

    const-string v0, "VALUE=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->Z:Ljava/util/regex/Pattern;

    const-string v0, "IMPORT=\"(.+?)\""

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->a0:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lf5/h;->b0:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lf5/f;Lf5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/h;->a:Lf5/f;

    iput-object p2, p0, Lf5/h;->b:Lf5/e;

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "=("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "NO"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "|"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "YES"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;[La4/d$b;)La4/d;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [La4/d$b;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    new-instance v4, La4/d$b;

    .line 12
    .line 13
    iget-object v5, v2, La4/d$b;->b:Ljava/util/UUID;

    .line 14
    .line 15
    iget-object v6, v2, La4/d$b;->c:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, v2, La4/d$b;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v4, v5, v6, v2, v3}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 20
    .line 21
    .line 22
    aput-object v4, v0, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, La4/d;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p1, p0, v1, v0}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    .line 31
    .line 32
    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)La4/d$b;
    .locals 7

    .line 1
    sget-object v0, Lf5/h;->J:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-static {p0, v0, v1, p2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x2c

    .line 17
    .line 18
    const-string v5, "video/mp4"

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object p1, Lf5/h;->K:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    invoke-static {p0, p1, p2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, La4/d$b;

    .line 30
    .line 31
    sget-object p2, Lv3/h;->d:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p2, v6, v5, p0}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const-string v2, "com.widevine"

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    new-instance p1, La4/d$b;

    .line 58
    .line 59
    sget-object p2, Lv3/h;->d:Ljava/util/UUID;

    .line 60
    .line 61
    invoke-static {p0}, Lv5/e0;->B(Ljava/lang/String;)[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v0, "hls"

    .line 66
    .line 67
    invoke-direct {p1, p2, v6, v0, p0}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 72
    .line 73
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    sget-object p1, Lf5/h;->K:Ljava/util/regex/Pattern;

    .line 86
    .line 87
    invoke-static {p0, p1, p2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object p1, Lv3/h;->e:Ljava/util/UUID;

    .line 104
    .line 105
    invoke-static {p1, v6, p0}, Lk4/h;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance p2, La4/d$b;

    .line 110
    .line 111
    invoke-direct {p2, p1, v6, v5, p0}, La4/d$b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 112
    .line 113
    .line 114
    return-object p2

    .line 115
    :cond_2
    return-object v6
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public static e(Ljava/lang/String;Ljava/util/regex/Pattern;)I
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static f(Lf5/f;Lf5/e;Lf5/h$b;Ljava/lang/String;)Lf5/e;
    .locals 92

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lf5/g;->c:Z

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Lf5/e$e;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v19, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v24, 0x0

    move-object/from16 v16, v6

    invoke-direct/range {v16 .. v24}, Lf5/e$e;-><init>(JZJJZ)V

    new-instance v8, Ljava/util/TreeMap;

    invoke-direct {v8}, Ljava/util/TreeMap;-><init>()V

    const/4 v13, 0x0

    const-string v10, ""

    const-wide/16 v18, 0x0

    move-object/from16 v79, p1

    move-object/from16 v78, v0

    move/from16 v34, v1

    move-object/from16 v55, v6

    move-object/from16 v40, v10

    move-object/from16 v36, v13

    move-object/from16 v39, v36

    move-object/from16 v74, v39

    move-object/from16 v75, v74

    move-object/from16 v80, v75

    move-object/from16 v85, v80

    move-wide/from16 v23, v18

    move-wide/from16 v27, v23

    move-wide/from16 v37, v27

    move-wide/from16 v49, v37

    move-wide/from16 v51, v49

    move-wide/from16 v82, v51

    move-wide/from16 v86, v82

    move-wide/from16 v88, v86

    const/4 v1, 0x0

    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x1

    const-wide v30, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v32, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v35, 0x0

    const/16 v53, 0x0

    const-wide/16 v76, -0x1

    const/16 v81, 0x0

    const/16 v84, 0x0

    move-object v6, v4

    move-object/from16 v4, v85

    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lf5/h$b;->a()Z

    move-result v41

    const/4 v11, -0x1

    if-eqz v41, :cond_4f

    invoke-virtual/range {p2 .. p2}, Lf5/h$b;->b()Ljava/lang/String;

    move-result-object v12

    const-string v9, "#EXT"

    invoke-virtual {v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v9, "#EXT-X-PLAYLIST-TYPE"

    invoke-virtual {v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v9, Lf5/h;->q:Ljava/util/regex/Pattern;

    invoke-static {v12, v9, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "VOD"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const-string v11, "EVENT"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :cond_3
    const-string v9, "#EXT-X-I-FRAMES-ONLY"

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v84, 0x1

    goto :goto_0

    :cond_4
    const-string v9, "#EXT-X-START"

    invoke-virtual {v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    const-wide v41, 0x412e848000000000L    # 1000000.0

    if-eqz v9, :cond_5

    sget-object v9, Lf5/h;->C:Ljava/util/regex/Pattern;

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v11

    invoke-static {v12, v9, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v20

    move-object/from16 v90, v15

    mul-double v14, v20, v41

    double-to-long v14, v14

    .line 2
    sget-object v11, Lf5/h;->Y:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v22

    move-wide/from16 v20, v14

    move-object/from16 v15, v90

    goto :goto_0

    :cond_5
    move-object/from16 v90, v15

    const-string v14, "#EXT-X-SERVER-CONTROL"

    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    .line 3
    sget-object v11, Lf5/h;->r:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v14

    const-wide/high16 v43, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v11, v14, v43

    if-nez v11, :cond_6

    const-wide v55, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_1

    :cond_6
    mul-double v14, v14, v41

    double-to-long v14, v14

    move-wide/from16 v55, v14

    :goto_1
    sget-object v11, Lf5/h;->s:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v57

    sget-object v11, Lf5/h;->u:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v14

    cmpl-double v11, v14, v43

    if-nez v11, :cond_7

    const-wide v58, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :cond_7
    mul-double v14, v14, v41

    double-to-long v14, v14

    move-wide/from16 v58, v14

    :goto_2
    sget-object v11, Lf5/h;->v:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->i(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    move-result-wide v14

    cmpl-double v11, v14, v43

    if-nez v11, :cond_8

    const-wide v60, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_3

    :cond_8
    mul-double v14, v14, v41

    double-to-long v14, v14

    move-wide/from16 v60, v14

    :goto_3
    sget-object v11, Lf5/h;->w:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v62

    new-instance v11, Lf5/e$e;

    move-object/from16 v54, v11

    invoke-direct/range {v54 .. v62}, Lf5/e$e;-><init>(JZJJZ)V

    move-object/from16 v54, v6

    move-object/from16 v91, v10

    move-object/from16 v55, v11

    goto :goto_4

    :cond_9
    const-string v14, "#EXT-X-PART-INF"

    .line 4
    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_a

    sget-object v11, Lf5/h;->o:Ljava/util/regex/Pattern;

    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v14

    invoke-static {v12, v11, v14}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    mul-double v11, v11, v41

    double-to-long v11, v11

    move-object/from16 v54, v6

    move-object/from16 v91, v10

    move-wide/from16 v32, v11

    :goto_4
    move-object/from16 v14, v78

    move-object/from16 v0, v90

    move-object v11, v7

    goto/16 :goto_e

    :cond_a
    const-string v14, "#EXT-X-MAP"

    .line 6
    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    const-string v15, "@"

    if-eqz v14, :cond_10

    sget-object v14, Lf5/h;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v14, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v46

    sget-object v14, Lf5/h;->E:Ljava/util/regex/Pattern;

    .line 7
    invoke-static {v12, v14, v13, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_b

    .line 8
    sget v14, Lv5/e0;->a:I

    .line 9
    invoke-virtual {v12, v15, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    const/4 v9, 0x0

    .line 10
    aget-object v12, v11, v9

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v76

    array-length v12, v11

    const/4 v14, 0x1

    if-le v12, v14, :cond_b

    aget-object v11, v11, v14

    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v37

    :cond_b
    const-wide/16 v11, -0x1

    cmp-long v14, v76, v11

    if-nez v14, :cond_c

    move-wide/from16 v37, v18

    :cond_c
    if-eqz v74, :cond_e

    if-eqz v75, :cond_d

    goto :goto_5

    :cond_d
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    invoke-static {v0, v13}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    move-result-object v0

    throw v0

    :cond_e
    :goto_5
    new-instance v85, Lf5/e$c;

    move-object/from16 v41, v85

    move-wide/from16 v42, v37

    move-wide/from16 v44, v76

    move-object/from16 v47, v74

    move-object/from16 v48, v75

    invoke-direct/range {v41 .. v48}, Lf5/e$c;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v14, :cond_f

    add-long v37, v37, v76

    :cond_f
    move-object/from16 v15, v90

    const-wide/16 v76, -0x1

    goto/16 :goto_0

    :cond_10
    const-string v14, "#EXT-X-TARGETDURATION"

    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    move-object/from16 v91, v10

    const-wide/32 v9, 0xf4240

    if-eqz v14, :cond_11

    sget-object v11, Lf5/h;->m:Ljava/util/regex/Pattern;

    invoke-static {v12, v11}, Lf5/h;->e(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v11

    int-to-long v11, v11

    mul-long v30, v11, v9

    :goto_6
    move-object/from16 v14, v78

    move-object/from16 v10, v91

    goto/16 :goto_9

    :cond_11
    const-string v14, "#EXT-X-MEDIA-SEQUENCE"

    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_12

    sget-object v9, Lf5/h;->x:Ljava/util/regex/Pattern;

    .line 11
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v10

    invoke-static {v12, v9, v10}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v27

    move-object/from16 v54, v6

    move-object v11, v7

    move-wide/from16 v49, v27

    move-object/from16 v14, v78

    :goto_7
    move-object/from16 v0, v90

    goto/16 :goto_e

    :cond_12
    const-string v14, "#EXT-X-VERSION"

    .line 12
    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_13

    sget-object v9, Lf5/h;->p:Ljava/util/regex/Pattern;

    invoke-static {v12, v9}, Lf5/h;->e(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v29

    goto :goto_6

    :cond_13
    const-string v14, "#EXT-X-DEFINE"

    invoke-virtual {v12, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_16

    sget-object v9, Lf5/h;->a0:Ljava/util/regex/Pattern;

    .line 13
    invoke-static {v12, v9, v13, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_14

    move-object/from16 v14, v78

    .line 14
    iget-object v10, v14, Lf5/f;->l:Ljava/util/Map;

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_15

    goto :goto_8

    :cond_14
    sget-object v9, Lf5/h;->P:Ljava/util/regex/Pattern;

    invoke-static {v12, v9, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lf5/h;->Z:Ljava/util/regex/Pattern;

    invoke-static {v12, v10, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    :goto_8
    invoke-virtual {v2, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    move-object/from16 v14, p3

    move-object/from16 v54, v6

    move-object v11, v7

    move-object/from16 v13, v80

    move-object/from16 v0, v90

    goto/16 :goto_16

    :cond_16
    move-object/from16 v14, v78

    const-string v11, "#EXTINF"

    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    sget-object v11, Lf5/h;->y:Ljava/util/regex/Pattern;

    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v15

    invoke-static {v12, v11, v15}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v11

    new-instance v15, Ljava/math/BigDecimal;

    invoke-direct {v15, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    new-instance v11, Ljava/math/BigDecimal;

    invoke-direct {v11, v9, v10}, Ljava/math/BigDecimal;-><init>(J)V

    invoke-virtual {v15, v11}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v9

    invoke-virtual {v9}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v86

    .line 16
    sget-object v9, Lf5/h;->z:Ljava/util/regex/Pattern;

    move-object/from16 v10, v91

    invoke-static {v12, v9, v10, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v40

    :goto_9
    move-object/from16 v54, v6

    move-object v11, v7

    move-object/from16 v91, v10

    goto :goto_7

    :cond_17
    move-object/from16 v10, v91

    const-string v9, "#EXT-X-SKIP"

    invoke-virtual {v12, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    const-wide/16 v45, 0x1

    if-eqz v9, :cond_20

    sget-object v9, Lf5/h;->t:Ljava/util/regex/Pattern;

    invoke-static {v12, v9}, Lf5/h;->e(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    move-result v9

    move-object/from16 v11, v79

    if-eqz v11, :cond_18

    invoke-virtual/range {v90 .. v90}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_18

    const/4 v12, 0x1

    goto :goto_a

    :cond_18
    const/4 v12, 0x0

    :goto_a
    invoke-static {v12}, Lx6/b;->H(Z)V

    sget v12, Lv5/e0;->a:I

    iget-wide v14, v11, Lf5/e;->k:J

    sub-long v14, v27, v14

    long-to-int v12, v14

    add-int/2addr v9, v12

    if-ltz v12, :cond_1f

    iget-object v14, v11, Lf5/e;->r:Lo7/t;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-gt v9, v14, :cond_1f

    :goto_b
    if-ge v12, v9, :cond_1e

    iget-object v14, v11, Lf5/e;->r:Lo7/t;

    invoke-interface {v14, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lf5/e$c;

    move-object v15, v14

    iget-wide v13, v11, Lf5/e;->k:J

    cmp-long v13, v27, v13

    if-eqz v13, :cond_1a

    iget v11, v11, Lf5/e;->j:I

    sub-int v11, v11, v26

    move-object v14, v15

    iget v13, v14, Lf5/e$d;->d:I

    add-int/2addr v11, v13

    .line 17
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v41, v82

    const/4 v15, 0x0

    :goto_c
    iget-object v0, v14, Lf5/e$c;->u:Lo7/t;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_19

    iget-object v0, v14, Lf5/e$c;->u:Lo7/t;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf5/e$a;

    move/from16 v44, v9

    .line 18
    new-instance v9, Lf5/e$a;

    move-object/from16 v56, v9

    move-object/from16 v91, v10

    .line 19
    iget-object v10, v0, Lf5/e$d;->a:Ljava/lang/String;

    move-object/from16 v57, v10

    .line 20
    iget-object v10, v0, Lf5/e$d;->b:Lf5/e$c;

    move-object/from16 v58, v10

    move-object/from16 v54, v6

    move-object v10, v7

    iget-wide v6, v0, Lf5/e$d;->c:J

    move-wide/from16 v59, v6

    iget-object v6, v0, Lf5/e$d;->f:La4/d;

    move-object/from16 v64, v6

    iget-object v6, v0, Lf5/e$d;->o:Ljava/lang/String;

    move-object/from16 v65, v6

    iget-object v6, v0, Lf5/e$d;->p:Ljava/lang/String;

    move-object/from16 v66, v6

    iget-wide v6, v0, Lf5/e$d;->q:J

    move-wide/from16 v67, v6

    iget-wide v6, v0, Lf5/e$d;->r:J

    move-wide/from16 v69, v6

    iget-boolean v6, v0, Lf5/e$d;->s:Z

    move/from16 v71, v6

    iget-boolean v6, v0, Lf5/e$a;->t:Z

    move/from16 v72, v6

    iget-boolean v6, v0, Lf5/e$a;->u:Z

    move/from16 v73, v6

    move/from16 v61, v11

    move-wide/from16 v62, v41

    invoke-direct/range {v56 .. v73}, Lf5/e$a;-><init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 21
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v6, v0, Lf5/e$d;->c:J

    add-long v41, v41, v6

    add-int/lit8 v15, v15, 0x1

    move-object v7, v10

    move/from16 v9, v44

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    goto :goto_c

    :cond_19
    move-object/from16 v54, v6

    move/from16 v44, v9

    move-object/from16 v91, v10

    move-object v10, v7

    new-instance v0, Lf5/e$c;

    move-object/from16 v56, v0

    iget-object v6, v14, Lf5/e$d;->a:Ljava/lang/String;

    move-object/from16 v57, v6

    iget-object v6, v14, Lf5/e$d;->b:Lf5/e$c;

    move-object/from16 v58, v6

    iget-object v6, v14, Lf5/e$c;->t:Ljava/lang/String;

    move-object/from16 v59, v6

    iget-wide v6, v14, Lf5/e$d;->c:J

    move-wide/from16 v60, v6

    iget-object v6, v14, Lf5/e$d;->f:La4/d;

    move-object/from16 v65, v6

    iget-object v6, v14, Lf5/e$d;->o:Ljava/lang/String;

    move-object/from16 v66, v6

    iget-object v6, v14, Lf5/e$d;->p:Ljava/lang/String;

    move-object/from16 v67, v6

    iget-wide v6, v14, Lf5/e$d;->q:J

    move-wide/from16 v68, v6

    iget-wide v6, v14, Lf5/e$d;->r:J

    move-wide/from16 v70, v6

    iget-boolean v6, v14, Lf5/e$d;->s:Z

    move/from16 v72, v6

    move/from16 v62, v11

    move-wide/from16 v63, v82

    move-object/from16 v73, v13

    invoke-direct/range {v56 .. v73}, Lf5/e$c;-><init>(Ljava/lang/String;Lf5/e$c;Ljava/lang/String;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    move-object v14, v0

    goto :goto_d

    :cond_1a
    move-object/from16 v54, v6

    move/from16 v44, v9

    move-object/from16 v91, v10

    move-object v14, v15

    move-object v10, v7

    :goto_d
    move-object/from16 v0, v90

    .line 22
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v6, v14, Lf5/e$d;->c:J

    add-long v82, v82, v6

    iget-wide v6, v14, Lf5/e$d;->r:J

    const-wide/16 v41, -0x1

    cmp-long v9, v6, v41

    move-object v11, v10

    if-eqz v9, :cond_1b

    iget-wide v9, v14, Lf5/e$d;->q:J

    add-long v37, v9, v6

    :cond_1b
    iget v6, v14, Lf5/e$d;->d:I

    iget-object v7, v14, Lf5/e$d;->b:Lf5/e$c;

    iget-object v9, v14, Lf5/e$d;->f:La4/d;

    iget-object v10, v14, Lf5/e$d;->o:Ljava/lang/String;

    iget-object v13, v14, Lf5/e$d;->p:Ljava/lang/String;

    if-eqz v13, :cond_1c

    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1d

    :cond_1c
    iget-object v13, v14, Lf5/e$d;->p:Ljava/lang/String;

    move-object/from16 v75, v13

    :cond_1d
    add-long v49, v49, v45

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v90, v0

    move/from16 v81, v6

    move-object/from16 v85, v7

    move-object/from16 v39, v9

    move-object/from16 v74, v10

    move-object v7, v11

    move/from16 v9, v44

    move-object/from16 v6, v54

    move-wide/from16 v51, v82

    move-object/from16 v10, v91

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    goto/16 :goto_b

    :cond_1e
    move-object/from16 v54, v6

    move-object v11, v7

    move-object/from16 v91, v10

    move-object/from16 v0, v90

    move-object/from16 v14, p0

    move-object/from16 v79, p1

    :goto_e
    move-object v15, v0

    move-object v7, v11

    move-object/from16 v78, v14

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    const/4 v13, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_1f
    new-instance v0, Lf5/h$a;

    invoke-direct {v0}, Lf5/h$a;-><init>()V

    throw v0

    :cond_20
    move-object/from16 v54, v6

    move-object v11, v7

    move-object/from16 v91, v10

    move-object/from16 v0, v90

    const-string v6, "#EXT-X-KEY"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_27

    sget-object v6, Lf5/h;->H:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lf5/h;->I:Ljava/util/regex/Pattern;

    const-string v9, "identity"

    invoke-static {v12, v7, v9, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "NONE"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_21

    invoke-virtual {v8}, Ljava/util/TreeMap;->clear()V

    const/16 v39, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    goto/16 :goto_14

    :cond_21
    sget-object v10, Lf5/h;->L:Ljava/util/regex/Pattern;

    const/4 v13, 0x0

    .line 23
    invoke-static {v12, v10, v13, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    .line 24
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    const-string v7, "AES-128"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_26

    sget-object v6, Lf5/h;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v74, v6

    move-object/from16 v75, v10

    goto/16 :goto_14

    :cond_22
    move-object/from16 v13, v80

    if-nez v13, :cond_25

    const-string v9, "SAMPLE-AES-CENC"

    .line 25
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_24

    const-string v9, "SAMPLE-AES-CTR"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    goto :goto_f

    :cond_23
    const-string v6, "cbcs"

    goto :goto_10

    :cond_24
    :goto_f
    const-string v6, "cenc"

    :goto_10
    move-object/from16 v80, v6

    goto :goto_11

    :cond_25
    move-object/from16 v80, v13

    .line 26
    :goto_11
    invoke-static {v12, v7, v2}, Lf5/h;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)La4/d$b;

    move-result-object v6

    if-eqz v6, :cond_26

    invoke-virtual {v8, v7, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v39, 0x0

    :cond_26
    move-object/from16 v75, v10

    const/16 v74, 0x0

    goto/16 :goto_14

    :cond_27
    move-object/from16 v13, v80

    const-string v6, "#EXT-X-BYTERANGE"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_28

    sget-object v6, Lf5/h;->D:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    sget v7, Lv5/e0;->a:I

    const/4 v7, -0x1

    .line 27
    invoke-virtual {v6, v15, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    .line 28
    aget-object v10, v6, v7

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v76

    array-length v7, v6

    const/4 v10, 0x1

    if-le v7, v10, :cond_2b

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v37

    goto :goto_13

    :cond_28
    const/4 v10, 0x1

    const-string v6, "#EXT-X-DISCONTINUITY-SEQUENCE"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const/16 v7, 0x3a

    if-eqz v6, :cond_29

    invoke-virtual {v12, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    add-int/2addr v6, v10

    invoke-virtual {v12, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v26

    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v80, v13

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    const/4 v13, 0x0

    const/16 v25, 0x1

    :goto_12
    move-object/from16 v0, v78

    goto/16 :goto_0

    :cond_29
    const-string v6, "#EXT-X-DISCONTINUITY"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2a

    add-int/lit8 v81, v81, 0x1

    goto :goto_13

    :cond_2a
    const-string v6, "#EXT-X-PROGRAM-DATE-TIME"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2d

    cmp-long v6, v23, v18

    if-nez v6, :cond_2c

    invoke-virtual {v12, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/4 v7, 0x1

    add-int/2addr v6, v7

    invoke-virtual {v12, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lv5/e0;->L(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lv5/e0;->I(J)J

    move-result-wide v6

    sub-long v23, v6, v82

    :cond_2b
    :goto_13
    move-object/from16 v80, v13

    :goto_14
    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v6, v54

    goto/16 :goto_22

    :cond_2c
    move-object/from16 v14, p3

    goto/16 :goto_16

    :cond_2d
    const-string v6, "#EXT-X-GAP"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v80, v13

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    const/4 v13, 0x0

    const/16 v53, 0x1

    goto :goto_12

    :cond_2e
    const-string v6, "#EXT-X-INDEPENDENT-SEGMENTS"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2f

    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v80, v13

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    const/4 v13, 0x0

    const/16 v34, 0x1

    goto :goto_12

    :cond_2f
    const-string v6, "#EXT-X-ENDLIST"

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v80, v13

    move-object/from16 v6, v54

    move-object/from16 v10, v91

    const/4 v13, 0x0

    const/16 v35, 0x1

    goto/16 :goto_12

    :cond_30
    const-string v6, "#EXT-X-RENDITION-REPORT"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_32

    sget-object v6, Lf5/h;->A:Ljava/util/regex/Pattern;

    invoke-static {v12, v6}, Lf5/h;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v6

    sget-object v10, Lf5/h;->B:Ljava/util/regex/Pattern;

    .line 29
    invoke-virtual {v10, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v14

    if-eqz v14, :cond_31

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    .line 30
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    goto :goto_15

    :cond_31
    const/4 v10, -0x1

    .line 32
    :goto_15
    sget-object v14, Lf5/h;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v14, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, p3

    invoke-static {v14, v12}, Lv5/d0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    new-instance v15, Lf5/e$b;

    invoke-direct {v15, v12, v6, v7, v10}, Lf5/e$b;-><init>(Landroid/net/Uri;JI)V

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_32
    move-object/from16 v14, p3

    const-string v6, "#EXT-X-PRELOAD-HINT"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3c

    if-eqz v4, :cond_33

    goto :goto_16

    :cond_33
    sget-object v6, Lf5/h;->N:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "PART"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_34

    :goto_16
    move-object/from16 v60, v2

    move-object/from16 v61, v3

    move-object/from16 v10, v54

    goto/16 :goto_20

    :cond_34
    sget-object v6, Lf5/h;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v57

    sget-object v6, Lf5/h;->F:Ljava/util/regex/Pattern;

    invoke-static {v12, v6}, Lf5/h;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v6

    sget-object v10, Lf5/h;->G:Ljava/util/regex/Pattern;

    invoke-static {v12, v10}, Lf5/h;->j(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    move-result-wide v69

    if-nez v74, :cond_35

    const/16 v66, 0x0

    goto :goto_17

    :cond_35
    if-eqz v75, :cond_36

    move-object/from16 v66, v75

    goto :goto_17

    .line 33
    :cond_36
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v66, v10

    :goto_17
    if-nez v39, :cond_38

    .line 34
    invoke-virtual {v8}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_38

    invoke-virtual {v8}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v10

    const/4 v9, 0x0

    new-array v12, v9, [La4/d$b;

    invoke-interface {v10, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [La4/d$b;

    new-instance v12, La4/d;

    const/4 v15, 0x1

    .line 35
    invoke-direct {v12, v13, v15, v10}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    if-nez v36, :cond_37

    .line 36
    invoke-static {v13, v10}, Lf5/h;->c(Ljava/lang/String;[La4/d$b;)La4/d;

    move-result-object v10

    move-object/from16 v36, v10

    :cond_37
    move-object/from16 v39, v12

    :cond_38
    const-wide/16 v41, -0x1

    cmp-long v10, v6, v41

    if-eqz v10, :cond_39

    cmp-long v12, v69, v41

    if-eqz v12, :cond_3b

    :cond_39
    new-instance v4, Lf5/e$a;

    const-wide/16 v59, 0x0

    if-eqz v10, :cond_3a

    move-wide/from16 v67, v6

    goto :goto_18

    :cond_3a
    move-wide/from16 v67, v18

    :goto_18
    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x1

    move-object/from16 v56, v4

    move-object/from16 v58, v85

    move/from16 v61, v81

    move-wide/from16 v62, v51

    move-object/from16 v64, v39

    move-object/from16 v65, v74

    invoke-direct/range {v56 .. v73}, Lf5/e$a;-><init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    :cond_3b
    move-object/from16 v60, v2

    move-object/from16 v61, v3

    move-object/from16 v6, v54

    goto/16 :goto_21

    :cond_3c
    const-string v6, "#EXT-X-PART"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_46

    if-nez v74, :cond_3d

    const/16 v66, 0x0

    goto :goto_19

    :cond_3d
    if-eqz v75, :cond_3e

    move-object/from16 v66, v75

    goto :goto_19

    .line 37
    :cond_3e
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v66, v6

    .line 38
    :goto_19
    sget-object v6, Lf5/h;->K:Ljava/util/regex/Pattern;

    invoke-static {v12, v6, v2}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v57

    sget-object v6, Lf5/h;->n:Ljava/util/regex/Pattern;

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v7

    invoke-static {v12, v6, v7}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    mul-double v6, v6, v41

    double-to-long v6, v6

    .line 40
    sget-object v10, Lf5/h;->W:Ljava/util/regex/Pattern;

    invoke-static {v12, v10}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v10

    if-eqz v34, :cond_3f

    invoke-interface/range {v54 .. v54}, Ljava/util/List;->isEmpty()Z

    move-result v41

    if-eqz v41, :cond_3f

    const/16 v41, 0x1

    goto :goto_1a

    :cond_3f
    const/16 v41, 0x0

    :goto_1a
    or-int v72, v10, v41

    sget-object v10, Lf5/h;->X:Ljava/util/regex/Pattern;

    invoke-static {v12, v10}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    move-result v71

    sget-object v10, Lf5/h;->E:Ljava/util/regex/Pattern;

    const/4 v9, 0x0

    .line 41
    invoke-static {v12, v10, v9, v2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_41

    .line 42
    sget v12, Lv5/e0;->a:I

    const/4 v12, -0x1

    .line 43
    invoke-virtual {v10, v15, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    .line 44
    aget-object v15, v10, v12

    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v41

    array-length v15, v10

    const/4 v9, 0x1

    if-le v15, v9, :cond_40

    aget-object v10, v10, v9

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v88

    :cond_40
    const-wide/16 v9, -0x1

    goto :goto_1b

    :cond_41
    const-wide/16 v9, -0x1

    const-wide/16 v41, -0x1

    :goto_1b
    cmp-long v15, v41, v9

    if-nez v15, :cond_42

    move-wide/from16 v88, v18

    :cond_42
    if-nez v39, :cond_44

    invoke-virtual {v8}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_44

    invoke-virtual {v8}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v9

    const/4 v10, 0x0

    new-array v12, v10, [La4/d$b;

    invoke-interface {v9, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [La4/d$b;

    new-instance v12, La4/d;

    const/4 v10, 0x1

    .line 45
    invoke-direct {v12, v13, v10, v9}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    if-nez v36, :cond_43

    .line 46
    invoke-static {v13, v9}, Lf5/h;->c(Ljava/lang/String;[La4/d$b;)La4/d;

    move-result-object v36

    :cond_43
    move-object/from16 v39, v12

    :cond_44
    new-instance v9, Lf5/e$a;

    move-object/from16 v56, v9

    const/16 v73, 0x0

    move-object/from16 v58, v85

    move-wide/from16 v59, v6

    move/from16 v61, v81

    move-wide/from16 v62, v51

    move-object/from16 v64, v39

    move-object/from16 v65, v74

    move-wide/from16 v67, v88

    move-wide/from16 v69, v41

    invoke-direct/range {v56 .. v73}, Lf5/e$a;-><init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    move-object/from16 v10, v54

    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-long v51, v51, v6

    if-eqz v15, :cond_45

    add-long v88, v88, v41

    :cond_45
    move-object/from16 v60, v2

    move-object/from16 v61, v3

    goto/16 :goto_20

    :cond_46
    move-object/from16 v10, v54

    const-string v6, "#"

    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_45

    if-nez v74, :cond_47

    const/4 v6, 0x0

    goto :goto_1c

    :cond_47
    if-eqz v75, :cond_48

    move-object/from16 v6, v75

    goto :goto_1c

    .line 47
    :cond_48
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v6

    :goto_1c
    add-long v56, v49, v45

    .line 48
    invoke-static {v12, v2}, Lf5/h;->m(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf5/e$c;

    const-wide/16 v41, -0x1

    cmp-long v12, v76, v41

    if-nez v12, :cond_49

    move-wide/from16 v58, v18

    goto :goto_1d

    :cond_49
    if-eqz v84, :cond_4a

    if-nez v85, :cond_4a

    if-nez v9, :cond_4a

    new-instance v9, Lf5/e$c;

    const-wide/16 v42, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 v41, v9

    move-wide/from16 v44, v37

    move-object/from16 v46, v7

    invoke-direct/range {v41 .. v48}, Lf5/e$c;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4a
    move-wide/from16 v58, v37

    :goto_1d
    if-nez v39, :cond_4b

    invoke-virtual {v8}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_4b

    invoke-virtual {v8}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v15

    move-object/from16 v60, v2

    move-object/from16 v61, v3

    const/4 v2, 0x0

    new-array v3, v2, [La4/d$b;

    invoke-interface {v15, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [La4/d$b;

    new-instance v15, La4/d;

    const/4 v2, 0x1

    .line 49
    invoke-direct {v15, v13, v2, v3}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    if-nez v36, :cond_4c

    .line 50
    invoke-static {v13, v3}, Lf5/h;->c(Ljava/lang/String;[La4/d$b;)La4/d;

    move-result-object v36

    goto :goto_1e

    :cond_4b
    move-object/from16 v60, v2

    move-object/from16 v61, v3

    move-object/from16 v15, v39

    :cond_4c
    :goto_1e
    new-instance v2, Lf5/e$c;

    if-eqz v85, :cond_4d

    move-object/from16 v39, v85

    goto :goto_1f

    :cond_4d
    move-object/from16 v39, v9

    :goto_1f
    move-object/from16 v37, v2

    move-object/from16 v38, v7

    move-wide/from16 v41, v86

    move/from16 v43, v81

    move-wide/from16 v44, v82

    move-object/from16 v46, v15

    move-object/from16 v47, v74

    move-object/from16 v48, v6

    move-wide/from16 v49, v58

    move-wide/from16 v51, v76

    move-object/from16 v54, v10

    invoke-direct/range {v37 .. v54}, Lf5/e$c;-><init>(Ljava/lang/String;Lf5/e$c;Ljava/lang/String;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-long v82, v82, v86

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-eqz v12, :cond_4e

    add-long v58, v58, v76

    :cond_4e
    move-object/from16 v39, v15

    move-wide/from16 v86, v18

    move-wide/from16 v49, v56

    move-wide/from16 v37, v58

    move-wide/from16 v51, v82

    move-object/from16 v40, v91

    const/16 v53, 0x0

    const-wide/16 v76, -0x1

    goto :goto_21

    :goto_20
    move-object v6, v10

    :goto_21
    move-object/from16 v78, p0

    move-object/from16 v79, p1

    move-object v15, v0

    move-object v7, v11

    move-object/from16 v80, v13

    move-object/from16 v2, v60

    move-object/from16 v3, v61

    :goto_22
    move-object/from16 v10, v91

    const/4 v13, 0x0

    goto/16 :goto_12

    :cond_4f
    move-object/from16 v14, p3

    move-object v10, v6

    move-object v11, v7

    move-object v0, v15

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v9, 0x0

    :goto_23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v9, v3, :cond_54

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf5/e$b;

    iget-wide v6, v3, Lf5/e$b;->b:J

    const-wide/16 v12, -0x1

    cmp-long v8, v6, v12

    if-nez v8, :cond_50

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    int-to-long v6, v6

    add-long v6, v27, v6

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v8

    int-to-long v12, v8

    sub-long/2addr v6, v12

    :cond_50
    iget v8, v3, Lf5/e$b;->c:I

    const/4 v12, -0x1

    if-ne v8, v12, :cond_53

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v13, v32, v15

    if-eqz v13, :cond_52

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_51

    invoke-static {v0}, Lp2/m0;->K(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf5/e$c;

    iget-object v8, v8, Lf5/e$c;->u:Lo7/t;

    goto :goto_24

    :cond_51
    move-object v8, v10

    :goto_24
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const/4 v13, 0x1

    sub-int/2addr v8, v13

    goto :goto_25

    :cond_52
    const/4 v13, 0x1

    goto :goto_25

    :cond_53
    const/4 v13, 0x1

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    :goto_25
    iget-object v3, v3, Lf5/e$b;->a:Landroid/net/Uri;

    new-instance v12, Lf5/e$b;

    invoke-direct {v12, v3, v6, v7, v8}, Lf5/e$b;-><init>(Landroid/net/Uri;JI)V

    invoke-virtual {v2, v3, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_23

    :cond_54
    const/4 v13, 0x1

    if-eqz v4, :cond_55

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_55
    new-instance v3, Lf5/e;

    cmp-long v4, v23, v18

    if-eqz v4, :cond_56

    move/from16 v79, v13

    goto :goto_26

    :cond_56
    const/16 v79, 0x0

    :goto_26
    move-object v4, v3

    move v5, v1

    move-object/from16 v54, v10

    move-object/from16 v6, p3

    move-object v7, v11

    move-wide/from16 v8, v20

    move/from16 v10, v22

    move-wide/from16 v11, v23

    move/from16 v13, v25

    move/from16 v14, v26

    move-wide/from16 v15, v27

    move/from16 v17, v29

    move-wide/from16 v18, v30

    move-wide/from16 v20, v32

    move/from16 v22, v34

    move/from16 v23, v35

    move/from16 v24, v79

    move-object/from16 v25, v36

    move-object/from16 v26, v0

    move-object/from16 v27, v54

    move-object/from16 v28, v55

    move-object/from16 v29, v2

    invoke-direct/range {v4 .. v29}, Lf5/e;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLa4/d;Ljava/util/List;Ljava/util/List;Lf5/e$e;Ljava/util/Map;)V

    return-object v3
.end method

.method public static g(Lf5/h$b;Ljava/lang/String;)Lf5/f;
    .locals 36

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v11, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v4, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v5, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v7, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v12, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v8, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    move/from16 v35, v10

    .line 56
    .line 57
    move v10, v9

    .line 58
    move/from16 v9, v35

    .line 59
    .line 60
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lf5/h$b;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    const-string v14, "application/x-mpegURL"

    .line 65
    .line 66
    if-eqz v13, :cond_13

    .line 67
    .line 68
    invoke-virtual/range {p0 .. p0}, Lf5/h$b;->b()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    const-string v15, "#EXT"

    .line 73
    .line 74
    invoke-virtual {v13, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    if-eqz v15, :cond_0

    .line 79
    .line 80
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_0
    const-string v15, "#EXT-X-I-FRAME-STREAM-INF"

    .line 84
    .line 85
    invoke-virtual {v13, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    move/from16 v16, v10

    .line 90
    .line 91
    const-string v10, "#EXT-X-DEFINE"

    .line 92
    .line 93
    invoke-virtual {v13, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_2

    .line 98
    .line 99
    sget-object v10, Lf5/h;->P:Ljava/util/regex/Pattern;

    .line 100
    .line 101
    invoke-static {v13, v10, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    sget-object v14, Lf5/h;->Z:Ljava/util/regex/Pattern;

    .line 106
    .line 107
    invoke-static {v13, v14, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    invoke-virtual {v11, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_1
    :goto_1
    move-object/from16 v17, v7

    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_2
    const-string v10, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 119
    .line 120
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_3

    .line 125
    .line 126
    const/4 v10, 0x1

    .line 127
    move-object/from16 v17, v7

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_3
    const-string v10, "#EXT-X-MEDIA"

    .line 131
    .line 132
    invoke-virtual {v13, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-eqz v10, :cond_4

    .line 137
    .line 138
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    const-string v10, "#EXT-X-SESSION-KEY"

    .line 143
    .line 144
    invoke-virtual {v13, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_7

    .line 149
    .line 150
    sget-object v10, Lf5/h;->I:Ljava/util/regex/Pattern;

    .line 151
    .line 152
    const-string v14, "identity"

    .line 153
    .line 154
    invoke-static {v13, v10, v14, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    invoke-static {v13, v10, v11}, Lf5/h;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)La4/d$b;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    if-eqz v10, :cond_1

    .line 163
    .line 164
    sget-object v14, Lf5/h;->H:Ljava/util/regex/Pattern;

    .line 165
    .line 166
    invoke-static {v13, v14, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    const-string v14, "SAMPLE-AES-CENC"

    .line 171
    .line 172
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    if-nez v14, :cond_6

    .line 177
    .line 178
    const-string v14, "SAMPLE-AES-CTR"

    .line 179
    .line 180
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    if-eqz v13, :cond_5

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    const-string v13, "cbcs"

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    :goto_2
    const-string v13, "cenc"

    .line 191
    .line 192
    :goto_3
    new-instance v14, La4/d;

    .line 193
    .line 194
    const/4 v15, 0x1

    .line 195
    move-object/from16 v17, v7

    .line 196
    .line 197
    new-array v7, v15, [La4/d$b;

    .line 198
    .line 199
    const/16 v18, 0x0

    .line 200
    .line 201
    aput-object v10, v7, v18

    .line 202
    .line 203
    invoke-direct {v14, v13, v15, v7}, La4/d;-><init>(Ljava/lang/String;Z[La4/d$b;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_7
    move-object/from16 v17, v7

    .line 211
    .line 212
    const-string v7, "#EXT-X-STREAM-INF"

    .line 213
    .line 214
    invoke-virtual {v13, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-nez v7, :cond_9

    .line 219
    .line 220
    if-eqz v15, :cond_8

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_8
    :goto_4
    move/from16 v10, v16

    .line 224
    .line 225
    :goto_5
    move-object/from16 v31, v3

    .line 226
    .line 227
    move-object/from16 v30, v4

    .line 228
    .line 229
    move-object/from16 v29, v5

    .line 230
    .line 231
    move-object/from16 v28, v6

    .line 232
    .line 233
    move-object/from16 v27, v8

    .line 234
    .line 235
    move-object/from16 v26, v12

    .line 236
    .line 237
    move-object v5, v0

    .line 238
    goto/16 :goto_c

    .line 239
    .line 240
    :cond_9
    :goto_6
    const-string v7, "CLOSED-CAPTIONS=NONE"

    .line 241
    .line 242
    invoke-virtual {v13, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    or-int/2addr v7, v9

    .line 247
    if-eqz v15, :cond_a

    .line 248
    .line 249
    const/16 v9, 0x4000

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_a
    const/4 v9, 0x0

    .line 253
    :goto_7
    sget-object v10, Lf5/h;->h:Ljava/util/regex/Pattern;

    .line 254
    .line 255
    invoke-static {v13, v10}, Lf5/h;->e(Ljava/lang/String;Ljava/util/regex/Pattern;)I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    move/from16 v25, v7

    .line 260
    .line 261
    sget-object v7, Lf5/h;->c:Ljava/util/regex/Pattern;

    .line 262
    .line 263
    invoke-virtual {v7, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    move-object/from16 v26, v12

    .line 272
    .line 273
    if-eqz v18, :cond_b

    .line 274
    .line 275
    const/4 v12, 0x1

    .line 276
    invoke-virtual {v7, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    goto :goto_8

    .line 288
    :cond_b
    const/4 v7, -0x1

    .line 289
    :goto_8
    sget-object v12, Lf5/h;->j:Ljava/util/regex/Pattern;

    .line 290
    .line 291
    move-object/from16 v27, v8

    .line 292
    .line 293
    const/4 v8, 0x0

    .line 294
    invoke-static {v13, v12, v8, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    move-object/from16 v28, v6

    .line 299
    .line 300
    sget-object v6, Lf5/h;->k:Ljava/util/regex/Pattern;

    .line 301
    .line 302
    invoke-static {v13, v6, v8, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    if-eqz v6, :cond_d

    .line 307
    .line 308
    sget v8, Lv5/e0;->a:I

    .line 309
    .line 310
    const-string v8, "x"

    .line 311
    .line 312
    move-object/from16 v29, v5

    .line 313
    .line 314
    const/4 v5, -0x1

    .line 315
    invoke-virtual {v6, v8, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    const/4 v6, 0x0

    .line 320
    aget-object v6, v5, v6

    .line 321
    .line 322
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    const/4 v8, 0x1

    .line 327
    aget-object v5, v5, v8

    .line 328
    .line 329
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-lez v6, :cond_c

    .line 334
    .line 335
    if-gtz v5, :cond_e

    .line 336
    .line 337
    :cond_c
    const/4 v5, -0x1

    .line 338
    const/4 v6, -0x1

    .line 339
    goto :goto_9

    .line 340
    :cond_d
    move-object/from16 v29, v5

    .line 341
    .line 342
    const/4 v6, -0x1

    .line 343
    const/4 v5, -0x1

    .line 344
    :cond_e
    :goto_9
    sget-object v8, Lf5/h;->l:Ljava/util/regex/Pattern;

    .line 345
    .line 346
    move-object/from16 v30, v4

    .line 347
    .line 348
    const/4 v4, 0x0

    .line 349
    invoke-static {v13, v8, v4, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    if-eqz v8, :cond_f

    .line 354
    .line 355
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    goto :goto_a

    .line 360
    :cond_f
    const/high16 v8, -0x40800000    # -1.0f

    .line 361
    .line 362
    :goto_a
    move-object/from16 v31, v3

    .line 363
    .line 364
    sget-object v3, Lf5/h;->d:Ljava/util/regex/Pattern;

    .line 365
    .line 366
    invoke-static {v13, v3, v4, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    move-object/from16 v32, v0

    .line 371
    .line 372
    sget-object v0, Lf5/h;->e:Ljava/util/regex/Pattern;

    .line 373
    .line 374
    invoke-static {v13, v0, v4, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    move-object/from16 v33, v0

    .line 379
    .line 380
    sget-object v0, Lf5/h;->f:Ljava/util/regex/Pattern;

    .line 381
    .line 382
    invoke-static {v13, v0, v4, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    move-object/from16 v34, v0

    .line 387
    .line 388
    sget-object v0, Lf5/h;->g:Ljava/util/regex/Pattern;

    .line 389
    .line 390
    invoke-static {v13, v0, v4, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v15, :cond_10

    .line 395
    .line 396
    sget-object v4, Lf5/h;->K:Ljava/util/regex/Pattern;

    .line 397
    .line 398
    invoke-static {v13, v4, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    goto :goto_b

    .line 403
    :cond_10
    invoke-virtual/range {p0 .. p0}, Lf5/h$b;->a()Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-eqz v4, :cond_12

    .line 408
    .line 409
    invoke-virtual/range {p0 .. p0}, Lf5/h$b;->b()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-static {v4, v11}, Lf5/h;->m(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    :goto_b
    invoke-static {v1, v4}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    new-instance v13, Lv3/i0$a;

    .line 422
    .line 423
    invoke-direct {v13}, Lv3/i0$a;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 427
    .line 428
    .line 429
    move-result v15

    .line 430
    invoke-virtual {v13, v15}, Lv3/i0$a;->b(I)V

    .line 431
    .line 432
    .line 433
    iput-object v14, v13, Lv3/i0$a;->j:Ljava/lang/String;

    .line 434
    .line 435
    iput-object v12, v13, Lv3/i0$a;->h:Ljava/lang/String;

    .line 436
    .line 437
    iput v7, v13, Lv3/i0$a;->f:I

    .line 438
    .line 439
    iput v10, v13, Lv3/i0$a;->g:I

    .line 440
    .line 441
    iput v6, v13, Lv3/i0$a;->p:I

    .line 442
    .line 443
    iput v5, v13, Lv3/i0$a;->q:I

    .line 444
    .line 445
    iput v8, v13, Lv3/i0$a;->r:F

    .line 446
    .line 447
    iput v9, v13, Lv3/i0$a;->e:I

    .line 448
    .line 449
    new-instance v5, Lv3/i0;

    .line 450
    .line 451
    invoke-direct {v5, v13}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 452
    .line 453
    .line 454
    new-instance v6, Lf5/f$b;

    .line 455
    .line 456
    move-object/from16 v18, v6

    .line 457
    .line 458
    move-object/from16 v19, v4

    .line 459
    .line 460
    move-object/from16 v20, v5

    .line 461
    .line 462
    move-object/from16 v21, v3

    .line 463
    .line 464
    move-object/from16 v22, v33

    .line 465
    .line 466
    move-object/from16 v23, v34

    .line 467
    .line 468
    move-object/from16 v24, v0

    .line 469
    .line 470
    invoke-direct/range {v18 .. v24}, Lf5/f$b;-><init>(Landroid/net/Uri;Lv3/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-object/from16 v5, v32

    .line 477
    .line 478
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    check-cast v6, Ljava/util/ArrayList;

    .line 483
    .line 484
    if-nez v6, :cond_11

    .line 485
    .line 486
    new-instance v6, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    :cond_11
    new-instance v4, Le5/o$b;

    .line 495
    .line 496
    move-object/from16 v18, v4

    .line 497
    .line 498
    move/from16 v19, v7

    .line 499
    .line 500
    move/from16 v20, v10

    .line 501
    .line 502
    move-object/from16 v21, v3

    .line 503
    .line 504
    move-object/from16 v22, v33

    .line 505
    .line 506
    move-object/from16 v23, v34

    .line 507
    .line 508
    move-object/from16 v24, v0

    .line 509
    .line 510
    invoke-direct/range {v18 .. v24}, Le5/o$b;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move/from16 v10, v16

    .line 517
    .line 518
    move/from16 v9, v25

    .line 519
    .line 520
    :goto_c
    move-object v0, v5

    .line 521
    move-object/from16 v7, v17

    .line 522
    .line 523
    move-object/from16 v12, v26

    .line 524
    .line 525
    move-object/from16 v8, v27

    .line 526
    .line 527
    move-object/from16 v6, v28

    .line 528
    .line 529
    move-object/from16 v5, v29

    .line 530
    .line 531
    move-object/from16 v4, v30

    .line 532
    .line 533
    move-object/from16 v3, v31

    .line 534
    .line 535
    goto/16 :goto_0

    .line 536
    .line 537
    :cond_12
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 538
    .line 539
    const/4 v1, 0x0

    .line 540
    invoke-static {v0, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    throw v0

    .line 545
    :cond_13
    move-object/from16 v31, v3

    .line 546
    .line 547
    move-object/from16 v30, v4

    .line 548
    .line 549
    move-object/from16 v29, v5

    .line 550
    .line 551
    move-object/from16 v28, v6

    .line 552
    .line 553
    move-object/from16 v17, v7

    .line 554
    .line 555
    move-object/from16 v27, v8

    .line 556
    .line 557
    move/from16 v16, v10

    .line 558
    .line 559
    move-object/from16 v26, v12

    .line 560
    .line 561
    move-object v5, v0

    .line 562
    new-instance v3, Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 565
    .line 566
    .line 567
    new-instance v0, Ljava/util/HashSet;

    .line 568
    .line 569
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 570
    .line 571
    .line 572
    const/4 v4, 0x0

    .line 573
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    if-ge v4, v6, :cond_16

    .line 578
    .line 579
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    check-cast v6, Lf5/f$b;

    .line 584
    .line 585
    iget-object v7, v6, Lf5/f$b;->a:Landroid/net/Uri;

    .line 586
    .line 587
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    if-eqz v7, :cond_15

    .line 592
    .line 593
    iget-object v7, v6, Lf5/f$b;->b:Lv3/i0;

    .line 594
    .line 595
    iget-object v7, v7, Lv3/i0;->r:Lp4/a;

    .line 596
    .line 597
    if-nez v7, :cond_14

    .line 598
    .line 599
    const/4 v7, 0x1

    .line 600
    goto :goto_e

    .line 601
    :cond_14
    const/4 v7, 0x0

    .line 602
    :goto_e
    invoke-static {v7}, Lx6/b;->H(Z)V

    .line 603
    .line 604
    .line 605
    new-instance v7, Le5/o;

    .line 606
    .line 607
    iget-object v8, v6, Lf5/f$b;->a:Landroid/net/Uri;

    .line 608
    .line 609
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v8

    .line 613
    check-cast v8, Ljava/util/ArrayList;

    .line 614
    .line 615
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    const/4 v10, 0x0

    .line 619
    invoke-direct {v7, v10, v10, v8}, Le5/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 620
    .line 621
    .line 622
    new-instance v8, Lp4/a;

    .line 623
    .line 624
    const/4 v10, 0x1

    .line 625
    new-array v10, v10, [Lp4/a$b;

    .line 626
    .line 627
    const/4 v12, 0x0

    .line 628
    aput-object v7, v10, v12

    .line 629
    .line 630
    invoke-direct {v8, v10}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 631
    .line 632
    .line 633
    iget-object v7, v6, Lf5/f$b;->b:Lv3/i0;

    .line 634
    .line 635
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    new-instance v10, Lv3/i0$a;

    .line 639
    .line 640
    invoke-direct {v10, v7}, Lv3/i0$a;-><init>(Lv3/i0;)V

    .line 641
    .line 642
    .line 643
    iput-object v8, v10, Lv3/i0$a;->i:Lp4/a;

    .line 644
    .line 645
    new-instance v7, Lv3/i0;

    .line 646
    .line 647
    invoke-direct {v7, v10}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 648
    .line 649
    .line 650
    new-instance v8, Lf5/f$b;

    .line 651
    .line 652
    iget-object v10, v6, Lf5/f$b;->a:Landroid/net/Uri;

    .line 653
    .line 654
    iget-object v12, v6, Lf5/f$b;->c:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v13, v6, Lf5/f$b;->d:Ljava/lang/String;

    .line 657
    .line 658
    iget-object v15, v6, Lf5/f$b;->e:Ljava/lang/String;

    .line 659
    .line 660
    iget-object v6, v6, Lf5/f$b;->f:Ljava/lang/String;

    .line 661
    .line 662
    move-object/from16 v18, v8

    .line 663
    .line 664
    move-object/from16 v19, v10

    .line 665
    .line 666
    move-object/from16 v20, v7

    .line 667
    .line 668
    move-object/from16 v21, v12

    .line 669
    .line 670
    move-object/from16 v22, v13

    .line 671
    .line 672
    move-object/from16 v23, v15

    .line 673
    .line 674
    move-object/from16 v24, v6

    .line 675
    .line 676
    invoke-direct/range {v18 .. v24}, Lf5/f$b;-><init>(Landroid/net/Uri;Lv3/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 683
    .line 684
    goto :goto_d

    .line 685
    :cond_16
    const/4 v0, 0x0

    .line 686
    const/4 v4, 0x0

    .line 687
    const/4 v5, 0x0

    .line 688
    move-object v8, v5

    .line 689
    :goto_f
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayList;->size()I

    .line 690
    .line 691
    .line 692
    move-result v5

    .line 693
    if-ge v4, v5, :cond_38

    .line 694
    .line 695
    move-object/from16 v5, v31

    .line 696
    .line 697
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    check-cast v6, Ljava/lang/String;

    .line 702
    .line 703
    sget-object v7, Lf5/h;->Q:Ljava/util/regex/Pattern;

    .line 704
    .line 705
    invoke-static {v6, v7, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v7

    .line 709
    sget-object v10, Lf5/h;->P:Ljava/util/regex/Pattern;

    .line 710
    .line 711
    invoke-static {v6, v10, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v10

    .line 715
    new-instance v12, Lv3/i0$a;

    .line 716
    .line 717
    invoke-direct {v12}, Lv3/i0$a;-><init>()V

    .line 718
    .line 719
    .line 720
    const-string v13, ":"

    .line 721
    .line 722
    invoke-static {v7, v13, v10}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v13

    .line 726
    iput-object v13, v12, Lv3/i0$a;->a:Ljava/lang/String;

    .line 727
    .line 728
    iput-object v10, v12, Lv3/i0$a;->b:Ljava/lang/String;

    .line 729
    .line 730
    iput-object v14, v12, Lv3/i0$a;->j:Ljava/lang/String;

    .line 731
    .line 732
    sget-object v13, Lf5/h;->U:Ljava/util/regex/Pattern;

    .line 733
    .line 734
    invoke-static {v6, v13}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 735
    .line 736
    .line 737
    move-result v13

    .line 738
    sget-object v15, Lf5/h;->V:Ljava/util/regex/Pattern;

    .line 739
    .line 740
    invoke-static {v6, v15}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 741
    .line 742
    .line 743
    move-result v15

    .line 744
    if-eqz v15, :cond_17

    .line 745
    .line 746
    or-int/lit8 v13, v13, 0x2

    .line 747
    .line 748
    :cond_17
    sget-object v15, Lf5/h;->T:Ljava/util/regex/Pattern;

    .line 749
    .line 750
    invoke-static {v6, v15}, Lf5/h;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 751
    .line 752
    .line 753
    move-result v15

    .line 754
    if-eqz v15, :cond_18

    .line 755
    .line 756
    or-int/lit8 v13, v13, 0x4

    .line 757
    .line 758
    :cond_18
    iput v13, v12, Lv3/i0$a;->d:I

    .line 759
    .line 760
    sget-object v13, Lf5/h;->R:Ljava/util/regex/Pattern;

    .line 761
    .line 762
    const/4 v15, 0x0

    .line 763
    invoke-static {v6, v13, v15, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v13

    .line 767
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 768
    .line 769
    .line 770
    move-result v15

    .line 771
    if-eqz v15, :cond_19

    .line 772
    .line 773
    const/4 v13, 0x0

    .line 774
    move-object/from16 v31, v5

    .line 775
    .line 776
    goto :goto_11

    .line 777
    :cond_19
    sget v15, Lv5/e0;->a:I

    .line 778
    .line 779
    const-string v15, ","

    .line 780
    .line 781
    move-object/from16 v31, v5

    .line 782
    .line 783
    const/4 v5, -0x1

    .line 784
    invoke-virtual {v13, v15, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v5

    .line 788
    const-string v13, "public.accessibility.describes-video"

    .line 789
    .line 790
    invoke-static {v13, v5}, Lv5/e0;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v13

    .line 794
    if-eqz v13, :cond_1a

    .line 795
    .line 796
    const/16 v13, 0x200

    .line 797
    .line 798
    goto :goto_10

    .line 799
    :cond_1a
    const/4 v13, 0x0

    .line 800
    :goto_10
    const-string v15, "public.accessibility.transcribes-spoken-dialog"

    .line 801
    .line 802
    invoke-static {v15, v5}, Lv5/e0;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v15

    .line 806
    if-eqz v15, :cond_1b

    .line 807
    .line 808
    or-int/lit16 v13, v13, 0x1000

    .line 809
    .line 810
    :cond_1b
    const-string v15, "public.accessibility.describes-music-and-sound"

    .line 811
    .line 812
    invoke-static {v15, v5}, Lv5/e0;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v15

    .line 816
    if-eqz v15, :cond_1c

    .line 817
    .line 818
    or-int/lit16 v13, v13, 0x400

    .line 819
    .line 820
    :cond_1c
    const-string v15, "public.easy-to-read"

    .line 821
    .line 822
    invoke-static {v15, v5}, Lv5/e0;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    if-eqz v5, :cond_1d

    .line 827
    .line 828
    or-int/lit16 v13, v13, 0x2000

    .line 829
    .line 830
    :cond_1d
    :goto_11
    iput v13, v12, Lv3/i0$a;->e:I

    .line 831
    .line 832
    sget-object v5, Lf5/h;->O:Ljava/util/regex/Pattern;

    .line 833
    .line 834
    const/4 v13, 0x0

    .line 835
    invoke-static {v6, v5, v13, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    iput-object v5, v12, Lv3/i0$a;->c:Ljava/lang/String;

    .line 840
    .line 841
    sget-object v5, Lf5/h;->K:Ljava/util/regex/Pattern;

    .line 842
    .line 843
    invoke-static {v6, v5, v13, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v5

    .line 847
    if-nez v5, :cond_1e

    .line 848
    .line 849
    const/4 v5, 0x0

    .line 850
    goto :goto_12

    .line 851
    :cond_1e
    invoke-static {v1, v5}, Lv5/d0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    :goto_12
    new-instance v13, Lp4/a;

    .line 856
    .line 857
    const/4 v15, 0x1

    .line 858
    new-array v15, v15, [Lp4/a$b;

    .line 859
    .line 860
    new-instance v1, Le5/o;

    .line 861
    .line 862
    move-object/from16 v18, v14

    .line 863
    .line 864
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object v14

    .line 868
    invoke-direct {v1, v7, v10, v14}, Le5/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 869
    .line 870
    .line 871
    const/4 v14, 0x0

    .line 872
    aput-object v1, v15, v14

    .line 873
    .line 874
    invoke-direct {v13, v15}, Lp4/a;-><init>([Lp4/a$b;)V

    .line 875
    .line 876
    .line 877
    sget-object v1, Lf5/h;->M:Ljava/util/regex/Pattern;

    .line 878
    .line 879
    invoke-static {v6, v1, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v1

    .line 883
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 884
    .line 885
    .line 886
    move-result v14

    .line 887
    const/4 v15, 0x2

    .line 888
    sparse-switch v14, :sswitch_data_0

    .line 889
    .line 890
    .line 891
    goto :goto_13

    .line 892
    :sswitch_0
    const-string v14, "VIDEO"

    .line 893
    .line 894
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    if-nez v1, :cond_1f

    .line 899
    .line 900
    goto :goto_13

    .line 901
    :cond_1f
    const/4 v1, 0x3

    .line 902
    goto :goto_14

    .line 903
    :sswitch_1
    const-string v14, "AUDIO"

    .line 904
    .line 905
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-nez v1, :cond_20

    .line 910
    .line 911
    goto :goto_13

    .line 912
    :cond_20
    move v1, v15

    .line 913
    goto :goto_14

    .line 914
    :sswitch_2
    const-string v14, "CLOSED-CAPTIONS"

    .line 915
    .line 916
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v1

    .line 920
    if-nez v1, :cond_21

    .line 921
    .line 922
    goto :goto_13

    .line 923
    :cond_21
    const/4 v1, 0x1

    .line 924
    goto :goto_14

    .line 925
    :sswitch_3
    const-string v14, "SUBTITLES"

    .line 926
    .line 927
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-result v1

    .line 931
    if-nez v1, :cond_22

    .line 932
    .line 933
    goto :goto_13

    .line 934
    :cond_22
    const/4 v1, 0x0

    .line 935
    goto :goto_14

    .line 936
    :goto_13
    const/4 v1, -0x1

    .line 937
    :goto_14
    if-eqz v1, :cond_32

    .line 938
    .line 939
    const/4 v14, 0x1

    .line 940
    if-eq v1, v14, :cond_2f

    .line 941
    .line 942
    if-eq v1, v15, :cond_28

    .line 943
    .line 944
    const/4 v6, 0x3

    .line 945
    if-eq v1, v6, :cond_23

    .line 946
    .line 947
    goto :goto_17

    .line 948
    :cond_23
    const/4 v1, 0x0

    .line 949
    :goto_15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 950
    .line 951
    .line 952
    move-result v6

    .line 953
    if-ge v1, v6, :cond_25

    .line 954
    .line 955
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v6

    .line 959
    check-cast v6, Lf5/f$b;

    .line 960
    .line 961
    iget-object v14, v6, Lf5/f$b;->c:Ljava/lang/String;

    .line 962
    .line 963
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v14

    .line 967
    if-eqz v14, :cond_24

    .line 968
    .line 969
    goto :goto_16

    .line 970
    :cond_24
    add-int/lit8 v1, v1, 0x1

    .line 971
    .line 972
    goto :goto_15

    .line 973
    :cond_25
    const/4 v6, 0x0

    .line 974
    :goto_16
    if-eqz v6, :cond_26

    .line 975
    .line 976
    iget-object v1, v6, Lf5/f$b;->b:Lv3/i0;

    .line 977
    .line 978
    iget-object v6, v1, Lv3/i0;->q:Ljava/lang/String;

    .line 979
    .line 980
    invoke-static {v15, v6}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v6

    .line 984
    iput-object v6, v12, Lv3/i0$a;->h:Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v6}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v6

    .line 990
    iput-object v6, v12, Lv3/i0$a;->k:Ljava/lang/String;

    .line 991
    .line 992
    iget v6, v1, Lv3/i0;->y:I

    .line 993
    .line 994
    iput v6, v12, Lv3/i0$a;->p:I

    .line 995
    .line 996
    iget v6, v1, Lv3/i0;->z:I

    .line 997
    .line 998
    iput v6, v12, Lv3/i0$a;->q:I

    .line 999
    .line 1000
    iget v1, v1, Lv3/i0;->A:F

    .line 1001
    .line 1002
    iput v1, v12, Lv3/i0$a;->r:F

    .line 1003
    .line 1004
    :cond_26
    if-nez v5, :cond_27

    .line 1005
    .line 1006
    :goto_17
    move-object/from16 v14, v30

    .line 1007
    .line 1008
    goto :goto_18

    .line 1009
    :cond_27
    iput-object v13, v12, Lv3/i0$a;->i:Lp4/a;

    .line 1010
    .line 1011
    new-instance v1, Lf5/f$a;

    .line 1012
    .line 1013
    new-instance v6, Lv3/i0;

    .line 1014
    .line 1015
    invoke-direct {v6, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-direct {v1, v5, v6, v10}, Lf5/f$a;-><init>(Landroid/net/Uri;Lv3/i0;Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    move-object/from16 v14, v30

    .line 1022
    .line 1023
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    :goto_18
    move-object/from16 p0, v8

    .line 1027
    .line 1028
    move-object/from16 v6, v28

    .line 1029
    .line 1030
    move-object/from16 v8, v29

    .line 1031
    .line 1032
    goto/16 :goto_22

    .line 1033
    .line 1034
    :cond_28
    move-object/from16 v14, v30

    .line 1035
    .line 1036
    const/4 v1, 0x0

    .line 1037
    :goto_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1038
    .line 1039
    .line 1040
    move-result v15

    .line 1041
    if-ge v1, v15, :cond_2a

    .line 1042
    .line 1043
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v15

    .line 1047
    check-cast v15, Lf5/f$b;

    .line 1048
    .line 1049
    move-object/from16 p0, v8

    .line 1050
    .line 1051
    iget-object v8, v15, Lf5/f$b;->d:Ljava/lang/String;

    .line 1052
    .line 1053
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v8

    .line 1057
    if-eqz v8, :cond_29

    .line 1058
    .line 1059
    goto :goto_1a

    .line 1060
    :cond_29
    add-int/lit8 v1, v1, 0x1

    .line 1061
    .line 1062
    move-object/from16 v8, p0

    .line 1063
    .line 1064
    goto :goto_19

    .line 1065
    :cond_2a
    move-object/from16 p0, v8

    .line 1066
    .line 1067
    const/4 v15, 0x0

    .line 1068
    :goto_1a
    if-eqz v15, :cond_2b

    .line 1069
    .line 1070
    iget-object v1, v15, Lf5/f$b;->b:Lv3/i0;

    .line 1071
    .line 1072
    iget-object v1, v1, Lv3/i0;->q:Ljava/lang/String;

    .line 1073
    .line 1074
    const/4 v7, 0x1

    .line 1075
    invoke-static {v7, v1}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    iput-object v1, v12, Lv3/i0$a;->h:Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-static {v1}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    goto :goto_1b

    .line 1086
    :cond_2b
    const/4 v1, 0x0

    .line 1087
    :goto_1b
    sget-object v7, Lf5/h;->i:Ljava/util/regex/Pattern;

    .line 1088
    .line 1089
    const/4 v8, 0x0

    .line 1090
    invoke-static {v6, v7, v8, v11}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v6

    .line 1094
    if-eqz v6, :cond_2c

    .line 1095
    .line 1096
    sget v7, Lv5/e0;->a:I

    .line 1097
    .line 1098
    const-string v7, "/"

    .line 1099
    .line 1100
    const/4 v8, 0x2

    .line 1101
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v7

    .line 1105
    const/4 v8, 0x0

    .line 1106
    aget-object v7, v7, v8

    .line 1107
    .line 1108
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1109
    .line 1110
    .line 1111
    move-result v7

    .line 1112
    iput v7, v12, Lv3/i0$a;->x:I

    .line 1113
    .line 1114
    const-string v7, "audio/eac3"

    .line 1115
    .line 1116
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v7

    .line 1120
    if-eqz v7, :cond_2c

    .line 1121
    .line 1122
    const-string v7, "/JOC"

    .line 1123
    .line 1124
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v6

    .line 1128
    if-eqz v6, :cond_2c

    .line 1129
    .line 1130
    const-string v1, "ec+3"

    .line 1131
    .line 1132
    iput-object v1, v12, Lv3/i0$a;->h:Ljava/lang/String;

    .line 1133
    .line 1134
    const-string v1, "audio/eac3-joc"

    .line 1135
    .line 1136
    :cond_2c
    iput-object v1, v12, Lv3/i0$a;->k:Ljava/lang/String;

    .line 1137
    .line 1138
    if-eqz v5, :cond_2d

    .line 1139
    .line 1140
    iput-object v13, v12, Lv3/i0$a;->i:Lp4/a;

    .line 1141
    .line 1142
    new-instance v1, Lf5/f$a;

    .line 1143
    .line 1144
    new-instance v6, Lv3/i0;

    .line 1145
    .line 1146
    invoke-direct {v6, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-direct {v1, v5, v6, v10}, Lf5/f$a;-><init>(Landroid/net/Uri;Lv3/i0;Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    move-object/from16 v8, v29

    .line 1153
    .line 1154
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1155
    .line 1156
    .line 1157
    goto :goto_1c

    .line 1158
    :cond_2d
    move-object/from16 v8, v29

    .line 1159
    .line 1160
    if-eqz v15, :cond_2e

    .line 1161
    .line 1162
    new-instance v1, Lv3/i0;

    .line 1163
    .line 1164
    invoke-direct {v1, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_1e

    .line 1168
    :cond_2e
    :goto_1c
    move-object/from16 v6, v28

    .line 1169
    .line 1170
    goto/16 :goto_22

    .line 1171
    .line 1172
    :cond_2f
    move-object/from16 p0, v8

    .line 1173
    .line 1174
    move-object/from16 v8, v29

    .line 1175
    .line 1176
    move-object/from16 v14, v30

    .line 1177
    .line 1178
    sget-object v1, Lf5/h;->S:Ljava/util/regex/Pattern;

    .line 1179
    .line 1180
    invoke-static {v6, v1, v11}, Lf5/h;->l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    const-string v5, "CC"

    .line 1185
    .line 1186
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v5

    .line 1190
    if-eqz v5, :cond_30

    .line 1191
    .line 1192
    const/4 v5, 0x2

    .line 1193
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    const-string v5, "application/cea-608"

    .line 1202
    .line 1203
    goto :goto_1d

    .line 1204
    :cond_30
    const/4 v5, 0x7

    .line 1205
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v1

    .line 1209
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1210
    .line 1211
    .line 1212
    move-result v1

    .line 1213
    const-string v5, "application/cea-708"

    .line 1214
    .line 1215
    :goto_1d
    if-nez v0, :cond_31

    .line 1216
    .line 1217
    new-instance v0, Ljava/util/ArrayList;

    .line 1218
    .line 1219
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1220
    .line 1221
    .line 1222
    :cond_31
    iput-object v5, v12, Lv3/i0$a;->k:Ljava/lang/String;

    .line 1223
    .line 1224
    iput v1, v12, Lv3/i0$a;->C:I

    .line 1225
    .line 1226
    new-instance v1, Lv3/i0;

    .line 1227
    .line 1228
    invoke-direct {v1, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    move-object/from16 v1, p0

    .line 1235
    .line 1236
    :goto_1e
    move-object/from16 v6, v28

    .line 1237
    .line 1238
    goto :goto_23

    .line 1239
    :cond_32
    move-object/from16 p0, v8

    .line 1240
    .line 1241
    move-object/from16 v8, v29

    .line 1242
    .line 1243
    move-object/from16 v14, v30

    .line 1244
    .line 1245
    const/4 v1, 0x0

    .line 1246
    :goto_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1247
    .line 1248
    .line 1249
    move-result v6

    .line 1250
    if-ge v1, v6, :cond_34

    .line 1251
    .line 1252
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v6

    .line 1256
    check-cast v6, Lf5/f$b;

    .line 1257
    .line 1258
    iget-object v15, v6, Lf5/f$b;->e:Ljava/lang/String;

    .line 1259
    .line 1260
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v15

    .line 1264
    if-eqz v15, :cond_33

    .line 1265
    .line 1266
    goto :goto_20

    .line 1267
    :cond_33
    add-int/lit8 v1, v1, 0x1

    .line 1268
    .line 1269
    goto :goto_1f

    .line 1270
    :cond_34
    const/4 v6, 0x0

    .line 1271
    :goto_20
    if-eqz v6, :cond_35

    .line 1272
    .line 1273
    iget-object v1, v6, Lf5/f$b;->b:Lv3/i0;

    .line 1274
    .line 1275
    iget-object v1, v1, Lv3/i0;->q:Ljava/lang/String;

    .line 1276
    .line 1277
    const/4 v6, 0x3

    .line 1278
    invoke-static {v6, v1}, Lv5/e0;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    iput-object v1, v12, Lv3/i0$a;->h:Ljava/lang/String;

    .line 1283
    .line 1284
    invoke-static {v1}, Lv5/p;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v1

    .line 1288
    goto :goto_21

    .line 1289
    :cond_35
    const/4 v1, 0x0

    .line 1290
    :goto_21
    if-nez v1, :cond_36

    .line 1291
    .line 1292
    const-string v1, "text/vtt"

    .line 1293
    .line 1294
    :cond_36
    iput-object v1, v12, Lv3/i0$a;->k:Ljava/lang/String;

    .line 1295
    .line 1296
    iput-object v13, v12, Lv3/i0$a;->i:Lp4/a;

    .line 1297
    .line 1298
    if-eqz v5, :cond_37

    .line 1299
    .line 1300
    new-instance v1, Lf5/f$a;

    .line 1301
    .line 1302
    new-instance v6, Lv3/i0;

    .line 1303
    .line 1304
    invoke-direct {v6, v12}, Lv3/i0;-><init>(Lv3/i0$a;)V

    .line 1305
    .line 1306
    .line 1307
    invoke-direct {v1, v5, v6, v10}, Lf5/f$a;-><init>(Landroid/net/Uri;Lv3/i0;Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    move-object/from16 v6, v28

    .line 1311
    .line 1312
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    goto :goto_22

    .line 1316
    :cond_37
    move-object/from16 v6, v28

    .line 1317
    .line 1318
    const-string v1, "HlsPlaylistParser"

    .line 1319
    .line 1320
    const-string v5, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 1321
    .line 1322
    invoke-static {v1, v5}, Lv5/m;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    :goto_22
    move-object/from16 v1, p0

    .line 1326
    .line 1327
    :goto_23
    add-int/lit8 v4, v4, 0x1

    .line 1328
    .line 1329
    move-object/from16 v28, v6

    .line 1330
    .line 1331
    move-object/from16 v29, v8

    .line 1332
    .line 1333
    move-object/from16 v30, v14

    .line 1334
    .line 1335
    move-object/from16 v14, v18

    .line 1336
    .line 1337
    move-object v8, v1

    .line 1338
    move-object/from16 v1, p1

    .line 1339
    .line 1340
    goto/16 :goto_f

    .line 1341
    .line 1342
    :cond_38
    move-object/from16 p0, v8

    .line 1343
    .line 1344
    move-object/from16 v6, v28

    .line 1345
    .line 1346
    move-object/from16 v8, v29

    .line 1347
    .line 1348
    move-object/from16 v14, v30

    .line 1349
    .line 1350
    if-eqz v9, :cond_39

    .line 1351
    .line 1352
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    :cond_39
    move-object v9, v0

    .line 1357
    new-instance v13, Lf5/f;

    .line 1358
    .line 1359
    move-object v0, v13

    .line 1360
    move-object/from16 v1, p1

    .line 1361
    .line 1362
    move-object/from16 v2, v27

    .line 1363
    .line 1364
    move-object v4, v14

    .line 1365
    move-object v5, v8

    .line 1366
    move-object/from16 v7, v17

    .line 1367
    .line 1368
    move-object/from16 v8, p0

    .line 1369
    .line 1370
    move/from16 v10, v16

    .line 1371
    .line 1372
    move-object/from16 v12, v26

    .line 1373
    .line 1374
    invoke-direct/range {v0 .. v12}, Lf5/f;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lv3/i0;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 1375
    .line 1376
    .line 1377
    return-object v13

    .line 1378
    nop

    .line 1379
    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public static h(Ljava/lang/String;Ljava/util/regex/Pattern;)Z
    .locals 0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "YES"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static i(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    const-wide/high16 p0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 25
    .line 26
    return-wide p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static j(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    const-wide/16 p0, -0x1

    .line 25
    .line 26
    return-wide p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {p2, p3}, Lf5/h;->m(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :cond_2
    :goto_0
    return-object p2
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public static l(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, p2}, Lf5/h;->k(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p2

    .line 9
    :cond_0
    const-string p2, "Couldn\'t match "

    .line 10
    .line 11
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " in "

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v0}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    throw p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public static m(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Lf5/h;->b0:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/net/Uri;Lt5/m;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/16 v3, 0xef

    .line 22
    .line 23
    if-ne v1, v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v3, 0xbb

    .line 30
    .line 31
    if-ne v1, v3, :cond_6

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v3, 0xbf

    .line 38
    .line 39
    if-eq v1, v3, :cond_0

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :cond_1
    :goto_0
    const/4 v3, -0x1

    .line 47
    if-eq v1, v3, :cond_2

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/4 v4, 0x7

    .line 61
    move v5, v2

    .line 62
    :goto_1
    if-ge v5, v4, :cond_4

    .line 63
    .line 64
    const-string v6, "#EXTM3U"

    .line 65
    .line 66
    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eq v1, v6, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    :goto_2
    if-eq v1, v3, :cond_5

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-static {v1}, Lv5/e0;->G(I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-static {v1}, Lv5/e0;->G(I)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    :cond_6
    :goto_3
    const/4 v1, 0x0

    .line 104
    if-eqz v2, :cond_c

    .line 105
    .line 106
    :goto_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_b

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    const-string v3, "#EXT-X-STREAM-INF"

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    new-instance v1, Lf5/h$b;

    .line 135
    .line 136
    invoke-direct {v1, p2, v0}, Lf5/h$b;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v1, p1}, Lf5/h;->g(Lf5/h$b;Ljava/lang/String;)Lf5/f;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_6

    .line 148
    :cond_8
    const-string v3, "#EXT-X-TARGETDURATION"

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_a

    .line 155
    .line 156
    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-nez v3, :cond_a

    .line 163
    .line 164
    const-string v3, "#EXTINF"

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_a

    .line 171
    .line 172
    const-string v3, "#EXT-X-KEY"

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_a

    .line 179
    .line 180
    const-string v3, "#EXT-X-BYTERANGE"

    .line 181
    .line 182
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_a

    .line 187
    .line 188
    const-string v3, "#EXT-X-DISCONTINUITY"

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-nez v3, :cond_a

    .line 195
    .line 196
    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-nez v3, :cond_a

    .line 203
    .line 204
    const-string v3, "#EXT-X-ENDLIST"

    .line 205
    .line 206
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-eqz v3, :cond_9

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_9
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_a
    :goto_5
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    iget-object v1, p0, Lf5/h;->a:Lf5/f;

    .line 221
    .line 222
    iget-object v2, p0, Lf5/h;->b:Lf5/e;

    .line 223
    .line 224
    new-instance v3, Lf5/h$b;

    .line 225
    .line 226
    invoke-direct {v3, p2, v0}, Lf5/h$b;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {v1, v2, v3, p1}, Lf5/h;->f(Lf5/f;Lf5/e;Lf5/h$b;Ljava/lang/String;)Lf5/e;

    .line 234
    .line 235
    .line 236
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    :goto_6
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 238
    .line 239
    .line 240
    return-object p1

    .line 241
    :cond_b
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 242
    .line 243
    .line 244
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    .line 245
    .line 246
    invoke-static {p1, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    throw p1

    .line 251
    :cond_c
    :try_start_1
    const-string p1, "Input does not start with the #EXTM3U header."

    .line 252
    .line 253
    invoke-static {p1, v1}, Lv3/a1;->b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    :catchall_0
    move-exception p1

    .line 259
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 260
    .line 261
    .line 262
    throw p1
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method
