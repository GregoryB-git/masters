.class public LX0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX0/e$b;,
        LX0/e$c;
    }
.end annotation


# static fields
.field public static final e0:LF0/x;

.field public static final f0:[B

.field public static final g0:[B

.field public static final h0:[B

.field public static final i0:[B

.field public static final j0:Ljava/util/UUID;

.field public static final k0:Ljava/util/Map;


# instance fields
.field public A:Z

.field public B:J

.field public C:J

.field public D:J

.field public E:Lg0/p;

.field public F:Lg0/p;

.field public G:Z

.field public H:Z

.field public I:I

.field public J:J

.field public K:J

.field public L:I

.field public M:I

.field public N:[I

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:Z

.field public T:J

.field public U:I

.field public V:I

.field public W:I

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public final a:LX0/c;

.field public a0:I

.field public final b:LX0/g;

.field public b0:B

.field public final c:Landroid/util/SparseArray;

.field public c0:Z

.field public final d:Z

.field public d0:LF0/t;

.field public final e:Z

.field public final f:Lc1/t$a;

.field public final g:Lg0/z;

.field public final h:Lg0/z;

.field public final i:Lg0/z;

.field public final j:Lg0/z;

.field public final k:Lg0/z;

.field public final l:Lg0/z;

.field public final m:Lg0/z;

.field public final n:Lg0/z;

.field public final o:Lg0/z;

.field public final p:Lg0/z;

.field public q:Ljava/nio/ByteBuffer;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:LX0/e$c;

.field public x:Z

.field public y:I

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LX0/d;

    .line 2
    .line 3
    invoke-direct {v0}, LX0/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX0/e;->e0:LF0/x;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    fill-array-data v1, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v1, LX0/e;->f0:[B

    .line 16
    .line 17
    const-string v1, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 18
    .line 19
    invoke-static {v1}, Lg0/M;->r0(Ljava/lang/String;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sput-object v1, LX0/e;->g0:[B

    .line 24
    .line 25
    new-array v0, v0, [B

    .line 26
    .line 27
    fill-array-data v0, :array_1

    .line 28
    .line 29
    .line 30
    sput-object v0, LX0/e;->h0:[B

    .line 31
    .line 32
    const/16 v0, 0x26

    .line 33
    .line 34
    new-array v0, v0, [B

    .line 35
    .line 36
    fill-array-data v0, :array_2

    .line 37
    .line 38
    .line 39
    sput-object v0, LX0/e;->i0:[B

    .line 40
    .line 41
    new-instance v0, Ljava/util/UUID;

    .line 42
    .line 43
    const-wide v1, 0x100000000001000L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 54
    .line 55
    .line 56
    sput-object v0, LX0/e;->j0:Ljava/util/UUID;

    .line 57
    .line 58
    new-instance v0, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "htc_video_rotA-000"

    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x5a

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "htc_video_rotA-090"

    .line 80
    .line 81
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xb4

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "htc_video_rotA-180"

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/16 v1, 0x10e

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "htc_video_rotA-270"

    .line 102
    .line 103
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sput-object v0, LX0/e;->k0:Ljava/util/Map;

    .line 111
    .line 112
    return-void

    .line 113
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

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
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

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
    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(LX0/c;ILc1/t$a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LX0/e;->s:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, LX0/e;->t:J

    iput-wide v2, p0, LX0/e;->u:J

    iput-wide v2, p0, LX0/e;->v:J

    iput-wide v0, p0, LX0/e;->B:J

    iput-wide v0, p0, LX0/e;->C:J

    iput-wide v2, p0, LX0/e;->D:J

    iput-object p1, p0, LX0/e;->a:LX0/c;

    new-instance v0, LX0/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LX0/e$b;-><init>(LX0/e;LX0/e$a;)V

    invoke-interface {p1, v0}, LX0/c;->d(LX0/b;)V

    iput-object p3, p0, LX0/e;->f:Lc1/t$a;

    and-int/lit8 p1, p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    iput-boolean p1, p0, LX0/e;->d:Z

    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    move p3, v0

    :cond_1
    iput-boolean p3, p0, LX0/e;->e:Z

    new-instance p1, LX0/g;

    invoke-direct {p1}, LX0/g;-><init>()V

    iput-object p1, p0, LX0/e;->b:LX0/g;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LX0/e;->c:Landroid/util/SparseArray;

    new-instance p1, Lg0/z;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LX0/e;->i:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    const/4 v1, -0x1

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    invoke-direct {p1, p3}, Lg0/z;-><init>([B)V

    iput-object p1, p0, LX0/e;->j:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LX0/e;->k:Lg0/z;

    new-instance p1, Lg0/z;

    sget-object p3, Lh0/d;->a:[B

    invoke-direct {p1, p3}, Lg0/z;-><init>([B)V

    iput-object p1, p0, LX0/e;->g:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LX0/e;->h:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    iput-object p1, p0, LX0/e;->l:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    iput-object p1, p0, LX0/e;->m:Lg0/z;

    new-instance p1, Lg0/z;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lg0/z;-><init>(I)V

    iput-object p1, p0, LX0/e;->n:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    iput-object p1, p0, LX0/e;->o:Lg0/z;

    new-instance p1, Lg0/z;

    invoke-direct {p1}, Lg0/z;-><init>()V

    iput-object p1, p0, LX0/e;->p:Lg0/z;

    new-array p1, v0, [I

    iput-object p1, p0, LX0/e;->N:[I

    return-void
.end method

.method public constructor <init>(Lc1/t$a;I)V
    .locals 1

    .line 2
    new-instance v0, LX0/a;

    invoke-direct {v0}, LX0/a;-><init>()V

    invoke-direct {p0, v0, p2, p1}, LX0/e;-><init>(LX0/c;ILc1/t$a;)V

    return-void
.end method

.method public static A(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "A_OPUS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x20

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "A_FLAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "A_EAC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "V_MPEG2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "S_TEXT/UTF8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "S_TEXT/WEBVTT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "V_MPEGH/ISO/HEVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "S_TEXT/ASS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "A_PCM/INT/LIT"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "A_PCM/INT/BIG"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "A_PCM/FLOAT/IEEE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "A_DTS/EXPRESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "V_THEORA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "S_HDMV/PGS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "V_VP9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "V_VP8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "V_AV1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "A_DTS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "A_AC3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "A_AAC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "A_DTS/LOSSLESS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "S_VOBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "V_MPEG4/ISO/AVC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "V_MPEG4/ISO/ASP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "S_DVBSUB"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_19
    const-string v0, "V_MS/VFW/FOURCC"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto :goto_0

    :cond_19
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1a
    const-string v0, "A_MPEG/L3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1b
    const-string v0, "A_MPEG/L2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_1c
    const-string v0, "A_VORBIS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1d
    const-string v0, "A_TRUEHD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1e
    const-string v0, "A_MS/ACM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1f
    const-string v0, "V_MPEG4/ISO/SP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto :goto_0

    :cond_1f
    move v3, v1

    goto :goto_0

    :sswitch_20
    const-string v0, "V_MPEG4/ISO/AP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto :goto_0

    :cond_20
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static synthetic C()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, LX0/e;

    .line 2
    .line 3
    sget-object v1, Lc1/t$a;->a:Lc1/t$a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, LX0/e;-><init>(Lc1/t$a;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [LF0/r;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    return-object v1
.end method

.method public static H(Ljava/lang/String;J[B)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v0, "S_TEXT/UTF8"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x2

    .line 24
    goto :goto_0

    .line 25
    :sswitch_1
    const-string v0, "S_TEXT/WEBVTT"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v2, 0x1

    .line 35
    goto :goto_0

    .line 36
    :sswitch_2
    const-string v0, "S_TEXT/ASS"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move v2, v1

    .line 46
    :goto_0
    const-wide/16 v3, 0x3e8

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :pswitch_0
    const-string p0, "%02d:%02d:%02d,%03d"

    .line 58
    .line 59
    invoke-static {p1, p2, p0, v3, v4}, LX0/e;->u(JLjava/lang/String;J)[B

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const/16 p1, 0x13

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_1
    const-string p0, "%02d:%02d:%02d.%03d"

    .line 67
    .line 68
    invoke-static {p1, p2, p0, v3, v4}, LX0/e;->u(JLjava/lang/String;J)[B

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const/16 p1, 0x19

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_2
    const-string p0, "%01d:%02d:%02d:%02d"

    .line 76
    .line 77
    const-wide/16 v2, 0x2710

    .line 78
    .line 79
    invoke-static {p1, p2, p0, v2, v3}, LX0/e;->u(JLjava/lang/String;J)[B

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/16 p1, 0x15

    .line 84
    .line 85
    :goto_1
    array-length p2, p0

    .line 86
    invoke-static {p0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    nop

    .line 91
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, LX0/e;->C()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic f()[B
    .locals 1

    .line 1
    sget-object v0, LX0/e;->g0:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic h()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, LX0/e;->k0:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic j()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, LX0/e;->j0:Ljava/util/UUID;

    .line 2
    .line 3
    return-object v0
.end method

.method private m()V
    .locals 1

    .line 1
    iget-object v0, p0, LX0/e;->d0:LF0/t;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static r([II)[I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-array p0, p1, [I

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    if-lt v0, p1, :cond_1

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_1
    array-length p0, p0

    .line 11
    mul-int/lit8 p0, p0, 0x2

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    new-array p0, p0, [I

    .line 18
    .line 19
    return-object p0
.end method

.method public static u(JLjava/lang/String;J)[B
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, p0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    invoke-static {v2}, Lg0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v2, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v2

    .line 24
    .line 25
    long-to-int v4, v4

    .line 26
    int-to-long v5, v4

    .line 27
    mul-long/2addr v5, v2

    .line 28
    sub-long/2addr p0, v5

    .line 29
    const-wide/32 v2, 0x3938700

    .line 30
    .line 31
    .line 32
    div-long v5, p0, v2

    .line 33
    .line 34
    long-to-int v5, v5

    .line 35
    int-to-long v6, v5

    .line 36
    mul-long/2addr v6, v2

    .line 37
    sub-long/2addr p0, v6

    .line 38
    const-wide/32 v2, 0xf4240

    .line 39
    .line 40
    .line 41
    div-long v6, p0, v2

    .line 42
    .line 43
    long-to-int v6, v6

    .line 44
    int-to-long v7, v6

    .line 45
    mul-long/2addr v7, v2

    .line 46
    sub-long/2addr p0, v7

    .line 47
    div-long/2addr p0, p3

    .line 48
    long-to-int p0, p0

    .line 49
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 v3, 0x4

    .line 68
    new-array v3, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p3, v3, v0

    .line 71
    .line 72
    aput-object p4, v3, v1

    .line 73
    .line 74
    const/4 p3, 0x2

    .line 75
    aput-object v2, v3, p3

    .line 76
    .line 77
    const/4 p3, 0x3

    .line 78
    aput-object p0, v3, p3

    .line 79
    .line 80
    invoke-static {p1, p2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lg0/M;->r0(Ljava/lang/String;)[B

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method


# virtual methods
.method public B(I)Z
    .locals 1

    .line 1
    const v0, 0x1549a966

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x1f43b675

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x1c53bb6b

    .line 12
    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x1654ae6b

    .line 17
    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    :goto_1
    return p1
.end method

.method public final D(LF0/L;J)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LX0/e;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-wide p2, p0, LX0/e;->C:J

    .line 8
    .line 9
    iget-wide p2, p0, LX0/e;->B:J

    .line 10
    .line 11
    iput-wide p2, p1, LF0/L;->a:J

    .line 12
    .line 13
    iput-boolean v2, p0, LX0/e;->A:Z

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-boolean p2, p0, LX0/e;->x:Z

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-wide p2, p0, LX0/e;->C:J

    .line 21
    .line 22
    const-wide/16 v3, -0x1

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-wide p2, p1, LF0/L;->a:J

    .line 29
    .line 30
    iput-wide v3, p0, LX0/e;->C:J

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    return v2
.end method

.method public final E(LF0/s;I)V
    .locals 3

    .line 1
    iget-object v0, p0, LX0/e;->i:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt v0, p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LX0/e;->i:Lg0/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Lg0/z;->b()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge v0, p2, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LX0/e;->i:Lg0/z;

    .line 19
    .line 20
    invoke-virtual {v0}, Lg0/z;->b()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    mul-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lg0/z;->c(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, LX0/e;->i:Lg0/z;

    .line 34
    .line 35
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, LX0/e;->i:Lg0/z;

    .line 40
    .line 41
    invoke-virtual {v1}, Lg0/z;->g()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v2, p0, LX0/e;->i:Lg0/z;

    .line 46
    .line 47
    invoke-virtual {v2}, Lg0/z;->g()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sub-int v2, p2, v2

    .line 52
    .line 53
    invoke-interface {p1, v0, v1, v2}, LF0/s;->readFully([BII)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LX0/e;->i:Lg0/z;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lg0/z;->S(I)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LX0/e;->U:I

    .line 3
    .line 4
    iput v0, p0, LX0/e;->V:I

    .line 5
    .line 6
    iput v0, p0, LX0/e;->W:I

    .line 7
    .line 8
    iput-boolean v0, p0, LX0/e;->X:Z

    .line 9
    .line 10
    iput-boolean v0, p0, LX0/e;->Y:Z

    .line 11
    .line 12
    iput-boolean v0, p0, LX0/e;->Z:Z

    .line 13
    .line 14
    iput v0, p0, LX0/e;->a0:I

    .line 15
    .line 16
    iput-byte v0, p0, LX0/e;->b0:B

    .line 17
    .line 18
    iput-boolean v0, p0, LX0/e;->c0:Z

    .line 19
    .line 20
    iget-object v1, p0, LX0/e;->l:Lg0/z;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lg0/z;->P(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final G(J)J
    .locals 6

    .line 1
    iget-wide v2, p0, LX0/e;->t:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    move-wide v0, p1

    .line 15
    invoke-static/range {v0 .. v5}, Lg0/M;->W0(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p1, p2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    throw p1
.end method

.method public I(IJJ)V
    .locals 5

    .line 1
    invoke-direct {p0}, LX0/e;->m()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq p1, v0, :cond_b

    .line 8
    .line 9
    const/16 v0, 0xae

    .line 10
    .line 11
    if-eq p1, v0, :cond_a

    .line 12
    .line 13
    const/16 v0, 0xbb

    .line 14
    .line 15
    if-eq p1, v0, :cond_9

    .line 16
    .line 17
    const/16 v0, 0x4dbb

    .line 18
    .line 19
    const-wide/16 v1, -0x1

    .line 20
    .line 21
    if-eq p1, v0, :cond_8

    .line 22
    .line 23
    const/16 v0, 0x5035

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq p1, v0, :cond_7

    .line 27
    .line 28
    const/16 v0, 0x55d0

    .line 29
    .line 30
    if-eq p1, v0, :cond_6

    .line 31
    .line 32
    const v0, 0x18538067

    .line 33
    .line 34
    .line 35
    if-eq p1, v0, :cond_3

    .line 36
    .line 37
    const p2, 0x1c53bb6b

    .line 38
    .line 39
    .line 40
    if-eq p1, p2, :cond_2

    .line 41
    .line 42
    const p2, 0x1f43b675

    .line 43
    .line 44
    .line 45
    if-eq p1, p2, :cond_0

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    iget-boolean p1, p0, LX0/e;->x:Z

    .line 50
    .line 51
    if-nez p1, :cond_c

    .line 52
    .line 53
    iget-boolean p1, p0, LX0/e;->d:Z

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-wide p1, p0, LX0/e;->B:J

    .line 58
    .line 59
    cmp-long p1, p1, v1

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iput-boolean v3, p0, LX0/e;->A:Z

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iget-object p1, p0, LX0/e;->d0:LF0/t;

    .line 67
    .line 68
    new-instance p2, LF0/M$b;

    .line 69
    .line 70
    iget-wide p3, p0, LX0/e;->v:J

    .line 71
    .line 72
    invoke-direct {p2, p3, p4}, LF0/M$b;-><init>(J)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, p2}, LF0/t;->e(LF0/M;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v3, p0, LX0/e;->x:Z

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Lg0/p;

    .line 82
    .line 83
    invoke-direct {p1}, Lg0/p;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, LX0/e;->E:Lg0/p;

    .line 87
    .line 88
    new-instance p1, Lg0/p;

    .line 89
    .line 90
    invoke-direct {p1}, Lg0/p;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, LX0/e;->F:Lg0/p;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-wide v3, p0, LX0/e;->s:J

    .line 97
    .line 98
    cmp-long p1, v3, v1

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    cmp-long p1, v3, p2

    .line 103
    .line 104
    if-nez p1, :cond_4

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    const-string p1, "Multiple Segment elements not supported"

    .line 108
    .line 109
    const/4 p2, 0x0

    .line 110
    invoke-static {p1, p2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    throw p1

    .line 115
    :cond_5
    :goto_0
    iput-wide p2, p0, LX0/e;->s:J

    .line 116
    .line 117
    iput-wide p4, p0, LX0/e;->r:J

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-boolean v3, p1, LX0/e$c;->y:Z

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-boolean v3, p1, LX0/e$c;->h:Z

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_8
    const/4 p1, -0x1

    .line 135
    iput p1, p0, LX0/e;->y:I

    .line 136
    .line 137
    iput-wide v1, p0, LX0/e;->z:J

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    iput-boolean v1, p0, LX0/e;->G:Z

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_a
    new-instance p1, LX0/e$c;

    .line 144
    .line 145
    invoke-direct {p1}, LX0/e$c;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_b
    iput-boolean v1, p0, LX0/e;->S:Z

    .line 152
    .line 153
    const-wide/16 p1, 0x0

    .line 154
    .line 155
    iput-wide p1, p0, LX0/e;->T:J

    .line 156
    .line 157
    :cond_c
    :goto_1
    return-void
.end method

.method public J(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x86

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0x4282

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x536e

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const v0, 0x22b59c

    .line 14
    .line 15
    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p2}, LX0/e$c;->d(LX0/e$c;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p2, p1, LX0/e$c;->a:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string p1, "webm"

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_5

    .line 41
    .line 42
    const-string p1, "matroska"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v0, "DocType "

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, " not supported"

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 p2, 0x0

    .line 74
    invoke-static {p1, p2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    throw p1

    .line 79
    :cond_4
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p2, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 84
    .line 85
    :cond_5
    :goto_0
    return-void
.end method

.method public final K(LF0/s;LX0/e$c;IZ)I
    .locals 10

    .line 1
    iget-object v0, p2, LX0/e$c;->b:Ljava/lang/String;

    const-string v1, "S_TEXT/UTF8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, LX0/e;->f0:[B

    invoke-virtual {p0, p1, p2, p3}, LX0/e;->L(LF0/s;[BI)V

    :goto_0
    invoke-virtual {p0}, LX0/e;->s()I

    move-result p1

    return p1

    :cond_0
    const-string v0, "S_TEXT/ASS"

    iget-object v1, p2, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, LX0/e;->h0:[B

    invoke-virtual {p0, p1, p2, p3}, LX0/e;->L(LF0/s;[BI)V

    goto :goto_0

    :cond_1
    const-string v0, "S_TEXT/WEBVTT"

    iget-object v1, p2, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, LX0/e;->i0:[B

    invoke-virtual {p0, p1, p2, p3}, LX0/e;->L(LF0/s;[BI)V

    goto :goto_0

    :cond_2
    iget-object v0, p2, LX0/e$c;->Y:LF0/T;

    iget-boolean v1, p0, LX0/e;->X:Z

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v1, :cond_11

    iget-boolean v1, p2, LX0/e$c;->h:Z

    if-eqz v1, :cond_e

    iget v1, p0, LX0/e;->Q:I

    const v6, -0x40000001    # -1.9999999f

    and-int/2addr v1, v6

    iput v1, p0, LX0/e;->Q:I

    iget-boolean v1, p0, LX0/e;->Y:Z

    const/16 v6, 0x80

    if-nez v1, :cond_4

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, LF0/s;->readFully([BII)V

    iget v1, p0, LX0/e;->U:I

    add-int/2addr v1, v4

    iput v1, p0, LX0/e;->U:I

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    aget-byte v1, v1, v5

    and-int/2addr v1, v6

    if-eq v1, v6, :cond_3

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    aget-byte v1, v1, v5

    iput-byte v1, p0, LX0/e;->b0:B

    iput-boolean v4, p0, LX0/e;->Y:Z

    goto :goto_1

    :cond_3
    const-string p1, "Extension bit is set in signal byte"

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    iget-byte v1, p0, LX0/e;->b0:B

    and-int/lit8 v7, v1, 0x1

    if-ne v7, v4, :cond_f

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    move v1, v4

    goto :goto_2

    :cond_5
    move v1, v5

    :goto_2
    iget v7, p0, LX0/e;->Q:I

    const/high16 v8, 0x40000000    # 2.0f

    or-int/2addr v7, v8

    iput v7, p0, LX0/e;->Q:I

    iget-boolean v7, p0, LX0/e;->c0:Z

    if-nez v7, :cond_7

    iget-object v7, p0, LX0/e;->n:Lg0/z;

    invoke-virtual {v7}, Lg0/z;->e()[B

    move-result-object v7

    const/16 v8, 0x8

    invoke-interface {p1, v7, v5, v8}, LF0/s;->readFully([BII)V

    iget v7, p0, LX0/e;->U:I

    add-int/2addr v7, v8

    iput v7, p0, LX0/e;->U:I

    iput-boolean v4, p0, LX0/e;->c0:Z

    iget-object v7, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v7}, Lg0/z;->e()[B

    move-result-object v7

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move v6, v5

    :goto_3
    or-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, v7, v5

    iget-object v6, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v6, v5}, Lg0/z;->T(I)V

    iget-object v6, p0, LX0/e;->i:Lg0/z;

    invoke-interface {v0, v6, v4, v4}, LF0/T;->a(Lg0/z;II)V

    iget v6, p0, LX0/e;->V:I

    add-int/2addr v6, v4

    iput v6, p0, LX0/e;->V:I

    iget-object v6, p0, LX0/e;->n:Lg0/z;

    invoke-virtual {v6, v5}, Lg0/z;->T(I)V

    iget-object v6, p0, LX0/e;->n:Lg0/z;

    invoke-interface {v0, v6, v8, v4}, LF0/T;->a(Lg0/z;II)V

    iget v6, p0, LX0/e;->V:I

    add-int/2addr v6, v8

    iput v6, p0, LX0/e;->V:I

    :cond_7
    if-eqz v1, :cond_f

    iget-boolean v1, p0, LX0/e;->Z:Z

    if-nez v1, :cond_8

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v5, v4}, LF0/s;->readFully([BII)V

    iget v1, p0, LX0/e;->U:I

    add-int/2addr v1, v4

    iput v1, p0, LX0/e;->U:I

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1, v5}, Lg0/z;->T(I)V

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->G()I

    move-result v1

    iput v1, p0, LX0/e;->a0:I

    iput-boolean v4, p0, LX0/e;->Z:Z

    :cond_8
    iget v1, p0, LX0/e;->a0:I

    mul-int/2addr v1, v2

    iget-object v6, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v6, v1}, Lg0/z;->P(I)V

    iget-object v6, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v6}, Lg0/z;->e()[B

    move-result-object v6

    invoke-interface {p1, v6, v5, v1}, LF0/s;->readFully([BII)V

    iget v6, p0, LX0/e;->U:I

    add-int/2addr v6, v1

    iput v6, p0, LX0/e;->U:I

    iget v1, p0, LX0/e;->a0:I

    div-int/2addr v1, v3

    add-int/2addr v1, v4

    int-to-short v1, v1

    mul-int/lit8 v6, v1, 0x6

    add-int/2addr v6, v3

    iget-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    move-result v7

    if-ge v7, v6, :cond_a

    :cond_9
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    iput-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    :cond_a
    iget-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move v1, v5

    move v7, v1

    :goto_4
    iget v8, p0, LX0/e;->a0:I

    if-ge v1, v8, :cond_c

    iget-object v8, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v8}, Lg0/z;->K()I

    move-result v8

    rem-int/lit8 v9, v1, 0x2

    if-nez v9, :cond_b

    iget-object v9, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    int-to-short v7, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_5

    :cond_b
    iget-object v9, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    sub-int v7, v8, v7

    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_5
    add-int/lit8 v1, v1, 0x1

    move v7, v8

    goto :goto_4

    :cond_c
    iget v1, p0, LX0/e;->U:I

    sub-int v1, p3, v1

    sub-int/2addr v1, v7

    rem-int/2addr v8, v3

    iget-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    if-ne v8, v4, :cond_d

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_6

    :cond_d
    int-to-short v1, v1

    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget-object v1, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_6
    iget-object v1, p0, LX0/e;->o:Lg0/z;

    iget-object v7, p0, LX0/e;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v1, v7, v6}, Lg0/z;->R([BI)V

    iget-object v1, p0, LX0/e;->o:Lg0/z;

    invoke-interface {v0, v1, v6, v4}, LF0/T;->a(Lg0/z;II)V

    iget v1, p0, LX0/e;->V:I

    add-int/2addr v1, v6

    iput v1, p0, LX0/e;->V:I

    goto :goto_7

    :cond_e
    iget-object v1, p2, LX0/e$c;->i:[B

    if-eqz v1, :cond_f

    iget-object v6, p0, LX0/e;->l:Lg0/z;

    array-length v7, v1

    invoke-virtual {v6, v1, v7}, Lg0/z;->R([BI)V

    :cond_f
    :goto_7
    invoke-static {p2, p4}, LX0/e$c;->e(LX0/e$c;Z)Z

    move-result p4

    if-eqz p4, :cond_10

    iget p4, p0, LX0/e;->Q:I

    const/high16 v1, 0x10000000

    or-int/2addr p4, v1

    iput p4, p0, LX0/e;->Q:I

    iget-object p4, p0, LX0/e;->p:Lg0/z;

    invoke-virtual {p4, v5}, Lg0/z;->P(I)V

    iget-object p4, p0, LX0/e;->l:Lg0/z;

    invoke-virtual {p4}, Lg0/z;->g()I

    move-result p4

    add-int/2addr p4, p3

    iget v1, p0, LX0/e;->U:I

    sub-int/2addr p4, v1

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1, v2}, Lg0/z;->P(I)V

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x18

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v5

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x10

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    shr-int/lit8 v6, p4, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    aput-byte v6, v1, v3

    iget-object v1, p0, LX0/e;->i:Lg0/z;

    invoke-virtual {v1}, Lg0/z;->e()[B

    move-result-object v1

    and-int/lit16 p4, p4, 0xff

    int-to-byte p4, p4

    const/4 v6, 0x3

    aput-byte p4, v1, v6

    iget-object p4, p0, LX0/e;->i:Lg0/z;

    invoke-interface {v0, p4, v2, v3}, LF0/T;->a(Lg0/z;II)V

    iget p4, p0, LX0/e;->V:I

    add-int/2addr p4, v2

    iput p4, p0, LX0/e;->V:I

    :cond_10
    iput-boolean v4, p0, LX0/e;->X:Z

    :cond_11
    iget-object p4, p0, LX0/e;->l:Lg0/z;

    invoke-virtual {p4}, Lg0/z;->g()I

    move-result p4

    add-int/2addr p3, p4

    const-string p4, "V_MPEG4/ISO/AVC"

    iget-object v1, p2, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_15

    const-string p4, "V_MPEGH/ISO/HEVC"

    iget-object v1, p2, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_12

    goto :goto_a

    :cond_12
    iget-object p4, p2, LX0/e$c;->U:LF0/U;

    if-eqz p4, :cond_14

    iget-object p4, p0, LX0/e;->l:Lg0/z;

    invoke-virtual {p4}, Lg0/z;->g()I

    move-result p4

    if-nez p4, :cond_13

    goto :goto_8

    :cond_13
    move v4, v5

    :goto_8
    invoke-static {v4}, Lg0/a;->f(Z)V

    iget-object p4, p2, LX0/e$c;->U:LF0/U;

    invoke-virtual {p4, p1}, LF0/U;->d(LF0/s;)V

    :cond_14
    :goto_9
    iget p4, p0, LX0/e;->U:I

    if-ge p4, p3, :cond_17

    sub-int p4, p3, p4

    invoke-virtual {p0, p1, v0, p4}, LX0/e;->M(LF0/s;LF0/T;I)I

    move-result p4

    iget v1, p0, LX0/e;->U:I

    add-int/2addr v1, p4

    iput v1, p0, LX0/e;->U:I

    iget v1, p0, LX0/e;->V:I

    add-int/2addr v1, p4

    iput v1, p0, LX0/e;->V:I

    goto :goto_9

    :cond_15
    :goto_a
    iget-object p4, p0, LX0/e;->h:Lg0/z;

    invoke-virtual {p4}, Lg0/z;->e()[B

    move-result-object p4

    aput-byte v5, p4, v5

    aput-byte v5, p4, v4

    aput-byte v5, p4, v3

    iget v1, p2, LX0/e$c;->Z:I

    rsub-int/lit8 v3, v1, 0x4

    :goto_b
    iget v4, p0, LX0/e;->U:I

    if-ge v4, p3, :cond_17

    iget v4, p0, LX0/e;->W:I

    if-nez v4, :cond_16

    invoke-virtual {p0, p1, p4, v3, v1}, LX0/e;->N(LF0/s;[BII)V

    iget v4, p0, LX0/e;->U:I

    add-int/2addr v4, v1

    iput v4, p0, LX0/e;->U:I

    iget-object v4, p0, LX0/e;->h:Lg0/z;

    invoke-virtual {v4, v5}, Lg0/z;->T(I)V

    iget-object v4, p0, LX0/e;->h:Lg0/z;

    invoke-virtual {v4}, Lg0/z;->K()I

    move-result v4

    iput v4, p0, LX0/e;->W:I

    iget-object v4, p0, LX0/e;->g:Lg0/z;

    invoke-virtual {v4, v5}, Lg0/z;->T(I)V

    iget-object v4, p0, LX0/e;->g:Lg0/z;

    invoke-interface {v0, v4, v2}, LF0/T;->e(Lg0/z;I)V

    iget v4, p0, LX0/e;->V:I

    add-int/2addr v4, v2

    iput v4, p0, LX0/e;->V:I

    goto :goto_b

    :cond_16
    invoke-virtual {p0, p1, v0, v4}, LX0/e;->M(LF0/s;LF0/T;I)I

    move-result v4

    iget v6, p0, LX0/e;->U:I

    add-int/2addr v6, v4

    iput v6, p0, LX0/e;->U:I

    iget v6, p0, LX0/e;->V:I

    add-int/2addr v6, v4

    iput v6, p0, LX0/e;->V:I

    iget v6, p0, LX0/e;->W:I

    sub-int/2addr v6, v4

    iput v6, p0, LX0/e;->W:I

    goto :goto_b

    :cond_17
    const-string p1, "A_VORBIS"

    iget-object p2, p2, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, LX0/e;->j:Lg0/z;

    invoke-virtual {p1, v5}, Lg0/z;->T(I)V

    iget-object p1, p0, LX0/e;->j:Lg0/z;

    invoke-interface {v0, p1, v2}, LF0/T;->e(Lg0/z;I)V

    iget p1, p0, LX0/e;->V:I

    add-int/2addr p1, v2

    iput p1, p0, LX0/e;->V:I

    :cond_18
    invoke-virtual {p0}, LX0/e;->s()I

    move-result p1

    return p1
.end method

.method public final L(LF0/s;[BI)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg0/z;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 13
    .line 14
    add-int v3, v0, p3

    .line 15
    .line 16
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v1, v3}, Lg0/z;->Q([B)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 25
    .line 26
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    array-length v3, p2

    .line 31
    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 35
    .line 36
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    array-length p2, p2

    .line 41
    invoke-interface {p1, v1, p2, p3}, LF0/s;->readFully([BII)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LX0/e;->m:Lg0/z;

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Lg0/z;->T(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, LX0/e;->m:Lg0/z;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lg0/z;->S(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final M(LF0/s;LF0/T;I)I
    .locals 1

    .line 1
    iget-object v0, p0, LX0/e;->l:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p3, p0, LX0/e;->l:Lg0/z;

    .line 14
    .line 15
    invoke-interface {p2, p3, p1}, LF0/T;->e(Lg0/z;I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    invoke-interface {p2, p1, p3, v0}, LF0/T;->f(Ld0/i;IZ)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    :goto_0
    return p1
.end method

.method public final N(LF0/s;[BII)V
    .locals 2

    .line 1
    iget-object v0, p0, LX0/e;->l:Lg0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/z;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int v1, p3, v0

    .line 12
    .line 13
    sub-int/2addr p4, v0

    .line 14
    invoke-interface {p1, p2, v1, p4}, LF0/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, LX0/e;->l:Lg0/z;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3, v0}, Lg0/z;->l([BII)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public a(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LX0/e;->D:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, LX0/e;->I:I

    .line 10
    .line 11
    iget-object p2, p0, LX0/e;->a:LX0/c;

    .line 12
    .line 13
    invoke-interface {p2}, LX0/c;->b()V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, LX0/e;->b:LX0/g;

    .line 17
    .line 18
    invoke-virtual {p2}, LX0/g;->e()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LX0/e;->F()V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p2, p0, LX0/e;->c:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-ge p1, p2, :cond_0

    .line 31
    .line 32
    iget-object p2, p0, LX0/e;->c:Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, LX0/e$c;

    .line 39
    .line 40
    invoke-virtual {p2}, LX0/e$c;->n()V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
.end method

.method public final b(LF0/t;)V
    .locals 2

    .line 1
    iput-object p1, p0, LX0/e;->d0:LF0/t;

    .line 2
    .line 3
    iget-boolean v0, p0, LX0/e;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lc1/v;

    .line 8
    .line 9
    iget-object v1, p0, LX0/e;->f:Lc1/t$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lc1/v;-><init>(LF0/t;Lc1/t$a;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, LX0/e;->d0:LF0/t;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic d()LF0/r;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->b(LF0/r;)LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e(LF0/s;)Z
    .locals 1

    .line 1
    new-instance v0, LX0/f;

    .line 2
    .line 3
    invoke-direct {v0}, LX0/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LX0/f;->b(LF0/s;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public synthetic g()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, LF0/q;->a(LF0/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final i(LF0/s;LF0/L;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LX0/e;->H:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    move v2, v1

    .line 6
    :cond_0
    if-eqz v2, :cond_1

    .line 7
    .line 8
    iget-boolean v3, p0, LX0/e;->H:Z

    .line 9
    .line 10
    if-nez v3, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, LX0/e;->a:LX0/c;

    .line 13
    .line 14
    invoke-interface {v2, p1}, LX0/c;->c(LF0/s;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, LF0/s;->p()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-virtual {p0, p2, v3, v4}, LX0/e;->D(LF0/L;J)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    if-nez v2, :cond_3

    .line 32
    .line 33
    :goto_0
    iget-object p1, p0, LX0/e;->c:Landroid/util/SparseArray;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ge v0, p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, LX0/e;->c:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LX0/e$c;

    .line 48
    .line 49
    invoke-static {p1}, LX0/e$c;->a(LX0/e$c;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LX0/e$c;->j()V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 p1, -0x1

    .line 59
    return p1

    .line 60
    :cond_3
    return v0
.end method

.method public final k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LX0/e;->E:Lg0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LX0/e;->F:Lg0/p;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "Element "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " must be in a Cues"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    throw p1
.end method

.method public final l(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LX0/e;->w:LX0/e$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Element "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " must be in a TrackEntry"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1
.end method

.method public n(IILF0/s;)V
    .locals 21

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move/from16 v1, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    const/16 v2, 0xa1

    .line 10
    .line 11
    const/16 v3, 0xa3

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    if-eq v0, v2, :cond_8

    .line 18
    .line 19
    if-eq v0, v3, :cond_8

    .line 20
    .line 21
    const/16 v2, 0xa5

    .line 22
    .line 23
    if-eq v0, v2, :cond_6

    .line 24
    .line 25
    const/16 v2, 0x41ed

    .line 26
    .line 27
    if-eq v0, v2, :cond_5

    .line 28
    .line 29
    const/16 v2, 0x4255

    .line 30
    .line 31
    if-eq v0, v2, :cond_4

    .line 32
    .line 33
    const/16 v2, 0x47e2

    .line 34
    .line 35
    if-eq v0, v2, :cond_3

    .line 36
    .line 37
    const/16 v2, 0x53ab

    .line 38
    .line 39
    if-eq v0, v2, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x63a2

    .line 42
    .line 43
    if-eq v0, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0x7672

    .line 46
    .line 47
    if-ne v0, v2, :cond_0

    .line 48
    .line 49
    invoke-virtual/range {p0 .. p1}, LX0/e;->l(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v7, LX0/e;->w:LX0/e$c;

    .line 53
    .line 54
    new-array v2, v1, [B

    .line 55
    .line 56
    iput-object v2, v0, LX0/e$c;->w:[B

    .line 57
    .line 58
    invoke-interface {v8, v2, v9, v1}, LF0/s;->readFully([BII)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_f

    .line 62
    .line 63
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Unexpected id: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0, v4}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    throw v0

    .line 85
    :cond_1
    invoke-virtual/range {p0 .. p1}, LX0/e;->l(I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v7, LX0/e;->w:LX0/e$c;

    .line 89
    .line 90
    new-array v2, v1, [B

    .line 91
    .line 92
    iput-object v2, v0, LX0/e$c;->k:[B

    .line 93
    .line 94
    invoke-interface {v8, v2, v9, v1}, LF0/s;->readFully([BII)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_f

    .line 98
    .line 99
    :cond_2
    iget-object v0, v7, LX0/e;->k:Lg0/z;

    .line 100
    .line 101
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0, v9}, Ljava/util/Arrays;->fill([BB)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v7, LX0/e;->k:Lg0/z;

    .line 109
    .line 110
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    rsub-int/lit8 v2, v1, 0x4

    .line 115
    .line 116
    invoke-interface {v8, v0, v2, v1}, LF0/s;->readFully([BII)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v7, LX0/e;->k:Lg0/z;

    .line 120
    .line 121
    invoke-virtual {v0, v9}, Lg0/z;->T(I)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v7, LX0/e;->k:Lg0/z;

    .line 125
    .line 126
    invoke-virtual {v0}, Lg0/z;->I()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    long-to-int v0, v0

    .line 131
    iput v0, v7, LX0/e;->y:I

    .line 132
    .line 133
    goto/16 :goto_f

    .line 134
    .line 135
    :cond_3
    new-array v2, v1, [B

    .line 136
    .line 137
    invoke-interface {v8, v2, v9, v1}, LF0/s;->readFully([BII)V

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {p0 .. p1}, LX0/e;->v(I)LX0/e$c;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, LF0/T$a;

    .line 145
    .line 146
    invoke-direct {v1, v10, v2, v9, v9}, LF0/T$a;-><init>(I[BII)V

    .line 147
    .line 148
    .line 149
    iput-object v1, v0, LX0/e$c;->j:LF0/T$a;

    .line 150
    .line 151
    goto/16 :goto_f

    .line 152
    .line 153
    :cond_4
    invoke-virtual/range {p0 .. p1}, LX0/e;->l(I)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v7, LX0/e;->w:LX0/e$c;

    .line 157
    .line 158
    new-array v2, v1, [B

    .line 159
    .line 160
    iput-object v2, v0, LX0/e$c;->i:[B

    .line 161
    .line 162
    invoke-interface {v8, v2, v9, v1}, LF0/s;->readFully([BII)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_f

    .line 166
    .line 167
    :cond_5
    invoke-virtual/range {p0 .. p1}, LX0/e;->v(I)LX0/e$c;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v7, v0, v8, v1}, LX0/e;->x(LX0/e$c;LF0/s;I)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_f

    .line 175
    .line 176
    :cond_6
    iget v0, v7, LX0/e;->I:I

    .line 177
    .line 178
    if-eq v0, v5, :cond_7

    .line 179
    .line 180
    return-void

    .line 181
    :cond_7
    iget-object v0, v7, LX0/e;->c:Landroid/util/SparseArray;

    .line 182
    .line 183
    iget v2, v7, LX0/e;->O:I

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, LX0/e$c;

    .line 190
    .line 191
    iget v2, v7, LX0/e;->R:I

    .line 192
    .line 193
    invoke-virtual {v7, v0, v2, v8, v1}, LX0/e;->y(LX0/e$c;ILF0/s;I)V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_f

    .line 197
    .line 198
    :cond_8
    iget v2, v7, LX0/e;->I:I

    .line 199
    .line 200
    const/16 v6, 0x8

    .line 201
    .line 202
    if-nez v2, :cond_9

    .line 203
    .line 204
    iget-object v2, v7, LX0/e;->b:LX0/g;

    .line 205
    .line 206
    invoke-virtual {v2, v8, v9, v10, v6}, LX0/g;->d(LF0/s;ZZI)J

    .line 207
    .line 208
    .line 209
    move-result-wide v11

    .line 210
    long-to-int v2, v11

    .line 211
    iput v2, v7, LX0/e;->O:I

    .line 212
    .line 213
    iget-object v2, v7, LX0/e;->b:LX0/g;

    .line 214
    .line 215
    invoke-virtual {v2}, LX0/g;->b()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    iput v2, v7, LX0/e;->P:I

    .line 220
    .line 221
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    iput-wide v11, v7, LX0/e;->K:J

    .line 227
    .line 228
    iput v10, v7, LX0/e;->I:I

    .line 229
    .line 230
    iget-object v2, v7, LX0/e;->i:Lg0/z;

    .line 231
    .line 232
    invoke-virtual {v2, v9}, Lg0/z;->P(I)V

    .line 233
    .line 234
    .line 235
    :cond_9
    iget-object v2, v7, LX0/e;->c:Landroid/util/SparseArray;

    .line 236
    .line 237
    iget v11, v7, LX0/e;->O:I

    .line 238
    .line 239
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    move-object v11, v2

    .line 244
    check-cast v11, LX0/e$c;

    .line 245
    .line 246
    if-nez v11, :cond_a

    .line 247
    .line 248
    iget v0, v7, LX0/e;->P:I

    .line 249
    .line 250
    sub-int v0, v1, v0

    .line 251
    .line 252
    invoke-interface {v8, v0}, LF0/s;->i(I)V

    .line 253
    .line 254
    .line 255
    iput v9, v7, LX0/e;->I:I

    .line 256
    .line 257
    return-void

    .line 258
    :cond_a
    invoke-static {v11}, LX0/e$c;->a(LX0/e$c;)V

    .line 259
    .line 260
    .line 261
    iget v2, v7, LX0/e;->I:I

    .line 262
    .line 263
    if-ne v2, v10, :cond_1b

    .line 264
    .line 265
    const/4 v2, 0x3

    .line 266
    invoke-virtual {v7, v8, v2}, LX0/e;->E(LF0/s;I)V

    .line 267
    .line 268
    .line 269
    iget-object v12, v7, LX0/e;->i:Lg0/z;

    .line 270
    .line 271
    invoke-virtual {v12}, Lg0/z;->e()[B

    .line 272
    .line 273
    .line 274
    move-result-object v12

    .line 275
    aget-byte v12, v12, v5

    .line 276
    .line 277
    and-int/lit8 v12, v12, 0x6

    .line 278
    .line 279
    shr-int/2addr v12, v10

    .line 280
    const/16 v13, 0xff

    .line 281
    .line 282
    if-nez v12, :cond_b

    .line 283
    .line 284
    iput v10, v7, LX0/e;->M:I

    .line 285
    .line 286
    iget-object v4, v7, LX0/e;->N:[I

    .line 287
    .line 288
    invoke-static {v4, v10}, LX0/e;->r([II)[I

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    iput-object v4, v7, LX0/e;->N:[I

    .line 293
    .line 294
    iget v12, v7, LX0/e;->P:I

    .line 295
    .line 296
    sub-int/2addr v1, v12

    .line 297
    sub-int/2addr v1, v2

    .line 298
    aput v1, v4, v9

    .line 299
    .line 300
    :goto_0
    move-object/from16 v18, v11

    .line 301
    .line 302
    goto/16 :goto_9

    .line 303
    .line 304
    :cond_b
    const/4 v14, 0x4

    .line 305
    invoke-virtual {v7, v8, v14}, LX0/e;->E(LF0/s;I)V

    .line 306
    .line 307
    .line 308
    iget-object v15, v7, LX0/e;->i:Lg0/z;

    .line 309
    .line 310
    invoke-virtual {v15}, Lg0/z;->e()[B

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    aget-byte v15, v15, v2

    .line 315
    .line 316
    and-int/2addr v15, v13

    .line 317
    add-int/2addr v15, v10

    .line 318
    iput v15, v7, LX0/e;->M:I

    .line 319
    .line 320
    iget-object v3, v7, LX0/e;->N:[I

    .line 321
    .line 322
    invoke-static {v3, v15}, LX0/e;->r([II)[I

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    iput-object v3, v7, LX0/e;->N:[I

    .line 327
    .line 328
    if-ne v12, v5, :cond_c

    .line 329
    .line 330
    iget v2, v7, LX0/e;->P:I

    .line 331
    .line 332
    sub-int/2addr v1, v2

    .line 333
    sub-int/2addr v1, v14

    .line 334
    iget v2, v7, LX0/e;->M:I

    .line 335
    .line 336
    div-int/2addr v1, v2

    .line 337
    invoke-static {v3, v9, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 338
    .line 339
    .line 340
    goto :goto_0

    .line 341
    :cond_c
    if-ne v12, v10, :cond_f

    .line 342
    .line 343
    move v2, v9

    .line 344
    move v3, v2

    .line 345
    :goto_1
    iget v4, v7, LX0/e;->M:I

    .line 346
    .line 347
    add-int/lit8 v12, v4, -0x1

    .line 348
    .line 349
    if-ge v2, v12, :cond_e

    .line 350
    .line 351
    iget-object v4, v7, LX0/e;->N:[I

    .line 352
    .line 353
    aput v9, v4, v2

    .line 354
    .line 355
    :goto_2
    add-int/lit8 v4, v14, 0x1

    .line 356
    .line 357
    invoke-virtual {v7, v8, v4}, LX0/e;->E(LF0/s;I)V

    .line 358
    .line 359
    .line 360
    iget-object v12, v7, LX0/e;->i:Lg0/z;

    .line 361
    .line 362
    invoke-virtual {v12}, Lg0/z;->e()[B

    .line 363
    .line 364
    .line 365
    move-result-object v12

    .line 366
    aget-byte v12, v12, v14

    .line 367
    .line 368
    and-int/2addr v12, v13

    .line 369
    iget-object v14, v7, LX0/e;->N:[I

    .line 370
    .line 371
    aget v15, v14, v2

    .line 372
    .line 373
    add-int/2addr v15, v12

    .line 374
    aput v15, v14, v2

    .line 375
    .line 376
    if-eq v12, v13, :cond_d

    .line 377
    .line 378
    add-int/2addr v3, v15

    .line 379
    add-int/lit8 v2, v2, 0x1

    .line 380
    .line 381
    move v14, v4

    .line 382
    goto :goto_1

    .line 383
    :cond_d
    move v14, v4

    .line 384
    goto :goto_2

    .line 385
    :cond_e
    iget-object v2, v7, LX0/e;->N:[I

    .line 386
    .line 387
    sub-int/2addr v4, v10

    .line 388
    iget v12, v7, LX0/e;->P:I

    .line 389
    .line 390
    sub-int/2addr v1, v12

    .line 391
    sub-int/2addr v1, v14

    .line 392
    sub-int/2addr v1, v3

    .line 393
    aput v1, v2, v4

    .line 394
    .line 395
    goto :goto_0

    .line 396
    :cond_f
    if-ne v12, v2, :cond_1a

    .line 397
    .line 398
    move v2, v9

    .line 399
    move v3, v2

    .line 400
    :goto_3
    iget v12, v7, LX0/e;->M:I

    .line 401
    .line 402
    add-int/lit8 v15, v12, -0x1

    .line 403
    .line 404
    if-ge v2, v15, :cond_17

    .line 405
    .line 406
    iget-object v12, v7, LX0/e;->N:[I

    .line 407
    .line 408
    aput v9, v12, v2

    .line 409
    .line 410
    add-int/lit8 v12, v14, 0x1

    .line 411
    .line 412
    invoke-virtual {v7, v8, v12}, LX0/e;->E(LF0/s;I)V

    .line 413
    .line 414
    .line 415
    iget-object v15, v7, LX0/e;->i:Lg0/z;

    .line 416
    .line 417
    invoke-virtual {v15}, Lg0/z;->e()[B

    .line 418
    .line 419
    .line 420
    move-result-object v15

    .line 421
    aget-byte v15, v15, v14

    .line 422
    .line 423
    if-eqz v15, :cond_16

    .line 424
    .line 425
    move v15, v9

    .line 426
    :goto_4
    if-ge v15, v6, :cond_13

    .line 427
    .line 428
    rsub-int/lit8 v16, v15, 0x7

    .line 429
    .line 430
    shl-int v5, v10, v16

    .line 431
    .line 432
    iget-object v9, v7, LX0/e;->i:Lg0/z;

    .line 433
    .line 434
    invoke-virtual {v9}, Lg0/z;->e()[B

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    aget-byte v9, v9, v14

    .line 439
    .line 440
    and-int/2addr v9, v5

    .line 441
    if-eqz v9, :cond_12

    .line 442
    .line 443
    add-int/2addr v12, v15

    .line 444
    invoke-virtual {v7, v8, v12}, LX0/e;->E(LF0/s;I)V

    .line 445
    .line 446
    .line 447
    iget-object v9, v7, LX0/e;->i:Lg0/z;

    .line 448
    .line 449
    invoke-virtual {v9}, Lg0/z;->e()[B

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    add-int/lit8 v17, v14, 0x1

    .line 454
    .line 455
    aget-byte v9, v9, v14

    .line 456
    .line 457
    and-int/2addr v9, v13

    .line 458
    not-int v5, v5

    .line 459
    and-int/2addr v5, v9

    .line 460
    move-object/from16 v18, v11

    .line 461
    .line 462
    int-to-long v10, v5

    .line 463
    move/from16 v5, v17

    .line 464
    .line 465
    :goto_5
    if-ge v5, v12, :cond_10

    .line 466
    .line 467
    shl-long/2addr v10, v6

    .line 468
    iget-object v14, v7, LX0/e;->i:Lg0/z;

    .line 469
    .line 470
    invoke-virtual {v14}, Lg0/z;->e()[B

    .line 471
    .line 472
    .line 473
    move-result-object v14

    .line 474
    add-int/lit8 v17, v5, 0x1

    .line 475
    .line 476
    aget-byte v5, v14, v5

    .line 477
    .line 478
    and-int/2addr v5, v13

    .line 479
    int-to-long v13, v5

    .line 480
    or-long/2addr v10, v13

    .line 481
    move/from16 v5, v17

    .line 482
    .line 483
    const/16 v13, 0xff

    .line 484
    .line 485
    goto :goto_5

    .line 486
    :cond_10
    if-lez v2, :cond_11

    .line 487
    .line 488
    mul-int/lit8 v15, v15, 0x7

    .line 489
    .line 490
    add-int/lit8 v15, v15, 0x6

    .line 491
    .line 492
    const-wide/16 v13, 0x1

    .line 493
    .line 494
    shl-long v19, v13, v15

    .line 495
    .line 496
    sub-long v19, v19, v13

    .line 497
    .line 498
    sub-long v10, v10, v19

    .line 499
    .line 500
    :cond_11
    :goto_6
    move v14, v12

    .line 501
    goto :goto_7

    .line 502
    :cond_12
    move-object/from16 v18, v11

    .line 503
    .line 504
    add-int/lit8 v15, v15, 0x1

    .line 505
    .line 506
    const/4 v5, 0x2

    .line 507
    const/4 v9, 0x0

    .line 508
    const/4 v10, 0x1

    .line 509
    const/16 v13, 0xff

    .line 510
    .line 511
    goto :goto_4

    .line 512
    :cond_13
    move-object/from16 v18, v11

    .line 513
    .line 514
    const-wide/16 v10, 0x0

    .line 515
    .line 516
    goto :goto_6

    .line 517
    :goto_7
    const-wide/32 v12, -0x80000000

    .line 518
    .line 519
    .line 520
    cmp-long v5, v10, v12

    .line 521
    .line 522
    if-ltz v5, :cond_15

    .line 523
    .line 524
    const-wide/32 v12, 0x7fffffff

    .line 525
    .line 526
    .line 527
    cmp-long v5, v10, v12

    .line 528
    .line 529
    if-gtz v5, :cond_15

    .line 530
    .line 531
    long-to-int v5, v10

    .line 532
    iget-object v10, v7, LX0/e;->N:[I

    .line 533
    .line 534
    if-nez v2, :cond_14

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_14
    add-int/lit8 v11, v2, -0x1

    .line 538
    .line 539
    aget v11, v10, v11

    .line 540
    .line 541
    add-int/2addr v5, v11

    .line 542
    :goto_8
    aput v5, v10, v2

    .line 543
    .line 544
    add-int/2addr v3, v5

    .line 545
    add-int/lit8 v2, v2, 0x1

    .line 546
    .line 547
    move-object/from16 v11, v18

    .line 548
    .line 549
    const/4 v5, 0x2

    .line 550
    const/4 v9, 0x0

    .line 551
    const/4 v10, 0x1

    .line 552
    const/16 v13, 0xff

    .line 553
    .line 554
    goto/16 :goto_3

    .line 555
    .line 556
    :cond_15
    const-string v0, "EBML lacing sample size out of range."

    .line 557
    .line 558
    invoke-static {v0, v4}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    throw v0

    .line 563
    :cond_16
    const-string v0, "No valid varint length mask found"

    .line 564
    .line 565
    invoke-static {v0, v4}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    throw v0

    .line 570
    :cond_17
    move-object/from16 v18, v11

    .line 571
    .line 572
    iget-object v2, v7, LX0/e;->N:[I

    .line 573
    .line 574
    const/4 v4, 0x1

    .line 575
    sub-int/2addr v12, v4

    .line 576
    iget v4, v7, LX0/e;->P:I

    .line 577
    .line 578
    sub-int/2addr v1, v4

    .line 579
    sub-int/2addr v1, v14

    .line 580
    sub-int/2addr v1, v3

    .line 581
    aput v1, v2, v12

    .line 582
    .line 583
    :goto_9
    iget-object v1, v7, LX0/e;->i:Lg0/z;

    .line 584
    .line 585
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    const/4 v2, 0x0

    .line 590
    aget-byte v1, v1, v2

    .line 591
    .line 592
    shl-int/2addr v1, v6

    .line 593
    iget-object v2, v7, LX0/e;->i:Lg0/z;

    .line 594
    .line 595
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/4 v3, 0x1

    .line 600
    aget-byte v2, v2, v3

    .line 601
    .line 602
    const/16 v3, 0xff

    .line 603
    .line 604
    and-int/2addr v2, v3

    .line 605
    or-int/2addr v1, v2

    .line 606
    iget-wide v2, v7, LX0/e;->D:J

    .line 607
    .line 608
    int-to-long v4, v1

    .line 609
    invoke-virtual {v7, v4, v5}, LX0/e;->G(J)J

    .line 610
    .line 611
    .line 612
    move-result-wide v4

    .line 613
    add-long/2addr v2, v4

    .line 614
    iput-wide v2, v7, LX0/e;->J:J

    .line 615
    .line 616
    move-object/from16 v10, v18

    .line 617
    .line 618
    iget v1, v10, LX0/e$c;->d:I

    .line 619
    .line 620
    const/4 v2, 0x2

    .line 621
    if-eq v1, v2, :cond_19

    .line 622
    .line 623
    const/16 v1, 0xa3

    .line 624
    .line 625
    if-ne v0, v1, :cond_18

    .line 626
    .line 627
    iget-object v1, v7, LX0/e;->i:Lg0/z;

    .line 628
    .line 629
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    aget-byte v1, v1, v2

    .line 634
    .line 635
    const/16 v3, 0x80

    .line 636
    .line 637
    and-int/2addr v1, v3

    .line 638
    if-ne v1, v3, :cond_18

    .line 639
    .line 640
    goto :goto_a

    .line 641
    :cond_18
    const/4 v1, 0x0

    .line 642
    goto :goto_b

    .line 643
    :cond_19
    :goto_a
    const/4 v1, 0x1

    .line 644
    :goto_b
    iput v1, v7, LX0/e;->Q:I

    .line 645
    .line 646
    iput v2, v7, LX0/e;->I:I

    .line 647
    .line 648
    const/4 v1, 0x0

    .line 649
    iput v1, v7, LX0/e;->L:I

    .line 650
    .line 651
    const/16 v1, 0xa3

    .line 652
    .line 653
    goto :goto_c

    .line 654
    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 657
    .line 658
    .line 659
    const-string v1, "Unexpected lacing value: "

    .line 660
    .line 661
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-static {v0, v4}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    throw v0

    .line 676
    :cond_1b
    move-object v10, v11

    .line 677
    move v1, v3

    .line 678
    :goto_c
    if-ne v0, v1, :cond_1d

    .line 679
    .line 680
    :goto_d
    iget v0, v7, LX0/e;->L:I

    .line 681
    .line 682
    iget v1, v7, LX0/e;->M:I

    .line 683
    .line 684
    if-ge v0, v1, :cond_1c

    .line 685
    .line 686
    iget-object v1, v7, LX0/e;->N:[I

    .line 687
    .line 688
    aget v0, v1, v0

    .line 689
    .line 690
    const/4 v1, 0x0

    .line 691
    invoke-virtual {v7, v8, v10, v0, v1}, LX0/e;->K(LF0/s;LX0/e$c;IZ)I

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    iget-wide v0, v7, LX0/e;->J:J

    .line 696
    .line 697
    iget v2, v7, LX0/e;->L:I

    .line 698
    .line 699
    iget v3, v10, LX0/e$c;->e:I

    .line 700
    .line 701
    mul-int/2addr v2, v3

    .line 702
    div-int/lit16 v2, v2, 0x3e8

    .line 703
    .line 704
    int-to-long v2, v2

    .line 705
    add-long/2addr v2, v0

    .line 706
    iget v4, v7, LX0/e;->Q:I

    .line 707
    .line 708
    const/4 v6, 0x0

    .line 709
    move-object/from16 v0, p0

    .line 710
    .line 711
    move-object v1, v10

    .line 712
    invoke-virtual/range {v0 .. v6}, LX0/e;->p(LX0/e$c;JIII)V

    .line 713
    .line 714
    .line 715
    iget v0, v7, LX0/e;->L:I

    .line 716
    .line 717
    const/4 v1, 0x1

    .line 718
    add-int/2addr v0, v1

    .line 719
    iput v0, v7, LX0/e;->L:I

    .line 720
    .line 721
    goto :goto_d

    .line 722
    :cond_1c
    const/4 v0, 0x0

    .line 723
    iput v0, v7, LX0/e;->I:I

    .line 724
    .line 725
    goto :goto_f

    .line 726
    :cond_1d
    const/4 v1, 0x1

    .line 727
    :goto_e
    iget v0, v7, LX0/e;->L:I

    .line 728
    .line 729
    iget v2, v7, LX0/e;->M:I

    .line 730
    .line 731
    if-ge v0, v2, :cond_1e

    .line 732
    .line 733
    iget-object v2, v7, LX0/e;->N:[I

    .line 734
    .line 735
    aget v3, v2, v0

    .line 736
    .line 737
    invoke-virtual {v7, v8, v10, v3, v1}, LX0/e;->K(LF0/s;LX0/e$c;IZ)I

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    aput v3, v2, v0

    .line 742
    .line 743
    iget v0, v7, LX0/e;->L:I

    .line 744
    .line 745
    add-int/2addr v0, v1

    .line 746
    iput v0, v7, LX0/e;->L:I

    .line 747
    .line 748
    goto :goto_e

    .line 749
    :cond_1e
    :goto_f
    return-void
.end method

.method public final o(Lg0/p;Lg0/p;)LF0/M;
    .locals 11

    .line 1
    iget-wide v0, p0, LX0/e;->s:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-wide v0, p0, LX0/e;->v:J

    .line 10
    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    if-eqz p1, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Lg0/p;->c()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    if-eqz p2, :cond_4

    .line 29
    .line 30
    invoke-virtual {p2}, Lg0/p;->c()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Lg0/p;->c()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v0, v1, :cond_0

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1}, Lg0/p;->c()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    new-array v1, v0, [I

    .line 47
    .line 48
    new-array v2, v0, [J

    .line 49
    .line 50
    new-array v3, v0, [J

    .line 51
    .line 52
    new-array v4, v0, [J

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    move v6, v5

    .line 56
    :goto_0
    if-ge v6, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v6}, Lg0/p;->b(I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    aput-wide v7, v4, v6

    .line 63
    .line 64
    iget-wide v7, p0, LX0/e;->s:J

    .line 65
    .line 66
    invoke-virtual {p2, v6}, Lg0/p;->b(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    add-long/2addr v7, v9

    .line 71
    aput-wide v7, v2, v6

    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    :goto_1
    add-int/lit8 p1, v0, -0x1

    .line 77
    .line 78
    if-ge v5, p1, :cond_2

    .line 79
    .line 80
    add-int/lit8 p1, v5, 0x1

    .line 81
    .line 82
    aget-wide v6, v2, p1

    .line 83
    .line 84
    aget-wide v8, v2, v5

    .line 85
    .line 86
    sub-long/2addr v6, v8

    .line 87
    long-to-int p2, v6

    .line 88
    aput p2, v1, v5

    .line 89
    .line 90
    aget-wide v6, v4, p1

    .line 91
    .line 92
    aget-wide v8, v4, v5

    .line 93
    .line 94
    sub-long/2addr v6, v8

    .line 95
    aput-wide v6, v3, v5

    .line 96
    .line 97
    move v5, p1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    iget-wide v5, p0, LX0/e;->s:J

    .line 100
    .line 101
    iget-wide v7, p0, LX0/e;->r:J

    .line 102
    .line 103
    add-long/2addr v5, v7

    .line 104
    aget-wide v7, v2, p1

    .line 105
    .line 106
    sub-long/2addr v5, v7

    .line 107
    long-to-int p2, v5

    .line 108
    aput p2, v1, p1

    .line 109
    .line 110
    iget-wide v5, p0, LX0/e;->v:J

    .line 111
    .line 112
    aget-wide v7, v4, p1

    .line 113
    .line 114
    sub-long/2addr v5, v7

    .line 115
    aput-wide v5, v3, p1

    .line 116
    .line 117
    const-wide/16 v7, 0x0

    .line 118
    .line 119
    cmp-long p2, v5, v7

    .line 120
    .line 121
    if-gtz p2, :cond_3

    .line 122
    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "Discarding last cue point with unexpected duration: "

    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    const-string v0, "MatroskaExtractor"

    .line 141
    .line 142
    invoke-static {v0, p2}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v2, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v3, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v4, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    :cond_3
    new-instance p1, LF0/h;

    .line 162
    .line 163
    invoke-direct {p1, v1, v2, v3, v4}, LF0/h;-><init>([I[J[J[J)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_4
    :goto_2
    new-instance p1, LF0/M$b;

    .line 168
    .line 169
    iget-wide v0, p0, LX0/e;->v:J

    .line 170
    .line 171
    invoke-direct {p1, v0, v1}, LF0/M$b;-><init>(J)V

    .line 172
    .line 173
    .line 174
    return-object p1
.end method

.method public final p(LX0/e$c;JIII)V
    .locals 9

    .line 1
    iget-object v0, p1, LX0/e$c;->U:LF0/U;

    .line 2
    .line 3
    const/4 v8, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p1, LX0/e$c;->Y:LF0/T;

    .line 7
    .line 8
    iget-object v7, p1, LX0/e$c;->j:LF0/T$a;

    .line 9
    .line 10
    move-wide v2, p2

    .line 11
    move v4, p4

    .line 12
    move v5, p5

    .line 13
    move v6, p6

    .line 14
    invoke-virtual/range {v0 .. v7}, LF0/U;->c(LF0/T;JIIILF0/T$a;)V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    const-string v0, "S_TEXT/UTF8"

    .line 20
    .line 21
    iget-object v1, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "S_TEXT/ASS"

    .line 30
    .line 31
    iget-object v1, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    const-string v0, "S_TEXT/WEBVTT"

    .line 40
    .line 41
    iget-object v1, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    :cond_1
    iget v0, p0, LX0/e;->M:I

    .line 50
    .line 51
    const-string v1, "MatroskaExtractor"

    .line 52
    .line 53
    if-le v0, v8, :cond_2

    .line 54
    .line 55
    const-string v0, "Skipping subtitle sample in laced block."

    .line 56
    .line 57
    :goto_0
    invoke-static {v1, v0}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_2
    iget-wide v2, p0, LX0/e;->K:J

    .line 62
    .line 63
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v0, v2, v4

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    const-string v0, "Skipping subtitle sample with no duration."

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object v0, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 78
    .line 79
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v0, v2, v3, v1}, LX0/e;->H(Ljava/lang/String;J[B)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, LX0/e;->m:Lg0/z;

    .line 87
    .line 88
    invoke-virtual {v0}, Lg0/z;->f()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    :goto_1
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 93
    .line 94
    invoke-virtual {v1}, Lg0/z;->g()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-ge v0, v1, :cond_5

    .line 99
    .line 100
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 101
    .line 102
    invoke-virtual {v1}, Lg0/z;->e()[B

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    aget-byte v1, v1, v0

    .line 107
    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Lg0/z;->S(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    :goto_2
    iget-object v0, p1, LX0/e$c;->Y:LF0/T;

    .line 120
    .line 121
    iget-object v1, p0, LX0/e;->m:Lg0/z;

    .line 122
    .line 123
    invoke-virtual {v1}, Lg0/z;->g()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-interface {v0, v1, v2}, LF0/T;->e(Lg0/z;I)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, LX0/e;->m:Lg0/z;

    .line 131
    .line 132
    invoke-virtual {v0}, Lg0/z;->g()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    add-int/2addr p5, v0

    .line 137
    :cond_6
    :goto_3
    const/high16 v0, 0x10000000

    .line 138
    .line 139
    and-int/2addr v0, p4

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    iget v0, p0, LX0/e;->M:I

    .line 143
    .line 144
    if-le v0, v8, :cond_7

    .line 145
    .line 146
    iget-object v0, p0, LX0/e;->p:Lg0/z;

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    invoke-virtual {v0, v1}, Lg0/z;->P(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_7
    iget-object v0, p0, LX0/e;->p:Lg0/z;

    .line 154
    .line 155
    invoke-virtual {v0}, Lg0/z;->g()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    iget-object v1, p1, LX0/e$c;->Y:LF0/T;

    .line 160
    .line 161
    iget-object v2, p0, LX0/e;->p:Lg0/z;

    .line 162
    .line 163
    const/4 v3, 0x2

    .line 164
    invoke-interface {v1, v2, v0, v3}, LF0/T;->a(Lg0/z;II)V

    .line 165
    .line 166
    .line 167
    add-int/2addr p5, v0

    .line 168
    :cond_8
    :goto_4
    move v4, p5

    .line 169
    iget-object v0, p1, LX0/e$c;->Y:LF0/T;

    .line 170
    .line 171
    iget-object v6, p1, LX0/e$c;->j:LF0/T$a;

    .line 172
    .line 173
    move-wide v1, p2

    .line 174
    move v3, p4

    .line 175
    move v5, p6

    .line 176
    invoke-interface/range {v0 .. v6}, LF0/T;->b(JIIILF0/T$a;)V

    .line 177
    .line 178
    .line 179
    :goto_5
    iput-boolean v8, p0, LX0/e;->H:Z

    .line 180
    .line 181
    return-void
.end method

.method public q(I)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, LX0/e;->m()V

    const/16 v2, 0xa0

    if-eq p1, v2, :cond_f

    const/16 v2, 0xae

    const/4 v3, 0x0

    if-eq p1, v2, :cond_c

    const/16 v2, 0x4dbb

    const v4, 0x1c53bb6b

    if-eq p1, v2, :cond_a

    const/16 v2, 0x6240

    if-eq p1, v2, :cond_8

    const/16 v0, 0x6d80

    if-eq p1, v0, :cond_6

    const v0, 0x1549a966

    if-eq p1, v0, :cond_4

    const v0, 0x1654ae6b

    if-eq p1, v0, :cond_2

    if-eq p1, v4, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean p1, p0, LX0/e;->x:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LX0/e;->d0:LF0/t;

    iget-object v0, p0, LX0/e;->E:Lg0/p;

    iget-object v2, p0, LX0/e;->F:Lg0/p;

    invoke-virtual {p0, v0, v2}, LX0/e;->o(Lg0/p;Lg0/p;)LF0/M;

    move-result-object v0

    invoke-interface {p1, v0}, LF0/t;->e(LF0/M;)V

    iput-boolean v1, p0, LX0/e;->x:Z

    :cond_1
    iput-object v3, p0, LX0/e;->E:Lg0/p;

    iput-object v3, p0, LX0/e;->F:Lg0/p;

    goto/16 :goto_2

    :cond_2
    iget-object p1, p0, LX0/e;->c:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LX0/e;->d0:LF0/t;

    invoke-interface {p1}, LF0/t;->j()V

    goto/16 :goto_2

    :cond_3
    const-string p1, "No valid tracks were found"

    invoke-static {p1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_4
    iget-wide v0, p0, LX0/e;->t:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_5

    const-wide/32 v0, 0xf4240

    iput-wide v0, p0, LX0/e;->t:J

    :cond_5
    iget-wide v0, p0, LX0/e;->u:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_15

    invoke-virtual {p0, v0, v1}, LX0/e;->G(J)J

    move-result-wide v0

    iput-wide v0, p0, LX0/e;->v:J

    goto/16 :goto_2

    :cond_6
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    iget-boolean v0, p1, LX0/e$c;->h:Z

    if-eqz v0, :cond_15

    iget-object p1, p1, LX0/e$c;->i:[B

    if-nez p1, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string p1, "Combining encryption and compression is not supported"

    invoke-static {p1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_8
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    iget-boolean v2, p1, LX0/e$c;->h:Z

    if-eqz v2, :cond_15

    iget-object v2, p1, LX0/e$c;->j:LF0/T$a;

    if-eqz v2, :cond_9

    new-instance v2, Ld0/m;

    new-instance v3, Ld0/m$b;

    sget-object v4, Ld0/g;->a:Ljava/util/UUID;

    iget-object v5, p0, LX0/e;->w:LX0/e$c;

    iget-object v5, v5, LX0/e$c;->j:LF0/T$a;

    iget-object v5, v5, LF0/T$a;->b:[B

    const-string v6, "video/webm"

    invoke-direct {v3, v4, v6, v5}, Ld0/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    new-array v1, v1, [Ld0/m$b;

    aput-object v3, v1, v0

    invoke-direct {v2, v1}, Ld0/m;-><init>([Ld0/m$b;)V

    iput-object v2, p1, LX0/e$c;->l:Ld0/m;

    goto/16 :goto_2

    :cond_9
    const-string p1, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-static {p1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_a
    iget p1, p0, LX0/e;->y:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_b

    iget-wide v0, p0, LX0/e;->z:J

    const-wide/16 v5, -0x1

    cmp-long v2, v0, v5

    if-eqz v2, :cond_b

    if-ne p1, v4, :cond_15

    iput-wide v0, p0, LX0/e;->B:J

    goto/16 :goto_2

    :cond_b
    const-string p1, "Mandatory element SeekID or SeekPosition not found"

    invoke-static {p1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_c
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX0/e$c;

    iget-object v0, p1, LX0/e$c;->b:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-static {v0}, LX0/e;->A(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, LX0/e;->d0:LF0/t;

    iget v1, p1, LX0/e$c;->c:I

    invoke-virtual {p1, v0, v1}, LX0/e$c;->i(LF0/t;I)V

    iget-object v0, p0, LX0/e;->c:Landroid/util/SparseArray;

    iget v1, p1, LX0/e$c;->c:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_d
    iput-object v3, p0, LX0/e;->w:LX0/e$c;

    goto/16 :goto_2

    :cond_e
    const-string p1, "CodecId is missing in TrackEntry element"

    invoke-static {p1, v3}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    move-result-object p1

    throw p1

    :cond_f
    iget p1, p0, LX0/e;->I:I

    const/4 v2, 0x2

    if-eq p1, v2, :cond_10

    return-void

    :cond_10
    iget-object p1, p0, LX0/e;->c:Landroid/util/SparseArray;

    iget v2, p0, LX0/e;->O:I

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX0/e$c;

    invoke-static {p1}, LX0/e$c;->a(LX0/e$c;)V

    iget-wide v2, p0, LX0/e;->T:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_11

    const-string v2, "A_OPUS"

    iget-object v3, p1, LX0/e$c;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, p0, LX0/e;->p:Lg0/z;

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v4, p0, LX0/e;->T:J

    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lg0/z;->Q([B)V

    :cond_11
    move v2, v0

    move v3, v2

    :goto_0
    iget v4, p0, LX0/e;->M:I

    if-ge v2, v4, :cond_12

    iget-object v4, p0, LX0/e;->N:[I

    aget v4, v4, v2

    add-int/2addr v3, v4

    add-int/2addr v2, v1

    goto :goto_0

    :cond_12
    move v9, v0

    :goto_1
    iget v2, p0, LX0/e;->M:I

    if-ge v9, v2, :cond_14

    iget-wide v4, p0, LX0/e;->J:J

    iget v2, p1, LX0/e$c;->e:I

    mul-int/2addr v2, v9

    div-int/lit16 v2, v2, 0x3e8

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget v2, p0, LX0/e;->Q:I

    if-nez v9, :cond_13

    iget-boolean v6, p0, LX0/e;->S:Z

    if-nez v6, :cond_13

    or-int/2addr v2, v1

    :cond_13
    move v6, v2

    iget-object v2, p0, LX0/e;->N:[I

    aget v7, v2, v9

    sub-int v10, v3, v7

    move-object v2, p0

    move-object v3, p1

    move v8, v10

    invoke-virtual/range {v2 .. v8}, LX0/e;->p(LX0/e$c;JIII)V

    add-int/2addr v9, v1

    move v3, v10

    goto :goto_1

    :cond_14
    iput v0, p0, LX0/e;->I:I

    :cond_15
    :goto_2
    return-void
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final s()I
    .locals 1

    .line 1
    iget v0, p0, LX0/e;->V:I

    .line 2
    .line 3
    invoke-virtual {p0}, LX0/e;->F()V

    .line 4
    .line 5
    .line 6
    return v0
.end method

.method public t(ID)V
    .locals 1

    .line 1
    const/16 v0, 0xb5

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x4489

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :pswitch_0
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    double-to-float p2, p2

    .line 22
    iput p2, p1, LX0/e$c;->v:F

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :pswitch_1
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    double-to-float p2, p2

    .line 31
    iput p2, p1, LX0/e$c;->u:F

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    double-to-float p2, p2

    .line 39
    iput p2, p1, LX0/e$c;->t:F

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_3
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    double-to-float p2, p2

    .line 47
    iput p2, p1, LX0/e$c;->N:F

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_4
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    double-to-float p2, p2

    .line 55
    iput p2, p1, LX0/e$c;->M:F

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_5
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    double-to-float p2, p2

    .line 63
    iput p2, p1, LX0/e$c;->L:F

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_6
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    double-to-float p2, p2

    .line 71
    iput p2, p1, LX0/e$c;->K:F

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_7
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    double-to-float p2, p2

    .line 79
    iput p2, p1, LX0/e$c;->J:F

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_8
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    double-to-float p2, p2

    .line 87
    iput p2, p1, LX0/e$c;->I:F

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_9
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    double-to-float p2, p2

    .line 95
    iput p2, p1, LX0/e$c;->H:F

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_a
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    double-to-float p2, p2

    .line 103
    iput p2, p1, LX0/e$c;->G:F

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_b
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    double-to-float p2, p2

    .line 111
    iput p2, p1, LX0/e$c;->F:F

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :pswitch_c
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    double-to-float p2, p2

    .line 119
    iput p2, p1, LX0/e$c;->E:F

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    double-to-long p1, p2

    .line 123
    iput-wide p1, p0, LX0/e;->u:J

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    double-to-int p2, p2

    .line 131
    iput p2, p1, LX0/e$c;->R:I

    .line 132
    .line 133
    :goto_0
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public v(I)LX0/e$c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 5
    .line 6
    return-object p1
.end method

.method public w(I)I
    .locals 0

    .line 1
    sparse-switch p1, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :sswitch_0
    const/4 p1, 0x5

    .line 7
    return p1

    .line 8
    :sswitch_1
    const/4 p1, 0x4

    .line 9
    return p1

    .line 10
    :sswitch_2
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :sswitch_3
    const/4 p1, 0x3

    .line 13
    return p1

    .line 14
    :sswitch_4
    const/4 p1, 0x2

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_4
        0x86 -> :sswitch_3
        0x88 -> :sswitch_4
        0x9b -> :sswitch_4
        0x9f -> :sswitch_4
        0xa0 -> :sswitch_2
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_2
        0xae -> :sswitch_2
        0xb0 -> :sswitch_4
        0xb3 -> :sswitch_4
        0xb5 -> :sswitch_0
        0xb7 -> :sswitch_2
        0xba -> :sswitch_4
        0xbb -> :sswitch_2
        0xd7 -> :sswitch_4
        0xe0 -> :sswitch_2
        0xe1 -> :sswitch_2
        0xe7 -> :sswitch_4
        0xee -> :sswitch_4
        0xf1 -> :sswitch_4
        0xfb -> :sswitch_4
        0x41e4 -> :sswitch_2
        0x41e7 -> :sswitch_4
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_4
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_3
        0x4285 -> :sswitch_4
        0x42f7 -> :sswitch_4
        0x4489 -> :sswitch_0
        0x47e1 -> :sswitch_4
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_2
        0x47e8 -> :sswitch_4
        0x4dbb -> :sswitch_2
        0x5031 -> :sswitch_4
        0x5032 -> :sswitch_4
        0x5034 -> :sswitch_2
        0x5035 -> :sswitch_2
        0x536e -> :sswitch_3
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_4
        0x53b8 -> :sswitch_4
        0x54b0 -> :sswitch_4
        0x54b2 -> :sswitch_4
        0x54ba -> :sswitch_4
        0x55aa -> :sswitch_4
        0x55b0 -> :sswitch_2
        0x55b2 -> :sswitch_4
        0x55b9 -> :sswitch_4
        0x55ba -> :sswitch_4
        0x55bb -> :sswitch_4
        0x55bc -> :sswitch_4
        0x55bd -> :sswitch_4
        0x55d0 -> :sswitch_2
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_4
        0x56aa -> :sswitch_4
        0x56bb -> :sswitch_4
        0x6240 -> :sswitch_2
        0x6264 -> :sswitch_4
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_2
        0x75a1 -> :sswitch_2
        0x75a2 -> :sswitch_4
        0x7670 -> :sswitch_2
        0x7671 -> :sswitch_4
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_3
        0x23e383 -> :sswitch_4
        0x2ad7b1 -> :sswitch_4
        0x114d9b74 -> :sswitch_2
        0x1549a966 -> :sswitch_2
        0x1654ae6b -> :sswitch_2
        0x18538067 -> :sswitch_2
        0x1a45dfa3 -> :sswitch_2
        0x1c53bb6b -> :sswitch_2
        0x1f43b675 -> :sswitch_2
    .end sparse-switch
.end method

.method public x(LX0/e$c;LF0/s;I)V
    .locals 2

    .line 1
    invoke-static {p1}, LX0/e$c;->b(LX0/e$c;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x64767643

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, LX0/e$c;->b(LX0/e$c;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, 0x64766343

    .line 15
    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p2, p3}, LF0/s;->i(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    new-array v0, p3, [B

    .line 25
    .line 26
    iput-object v0, p1, LX0/e$c;->O:[B

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {p2, v0, p1, p3}, LF0/s;->readFully([BII)V

    .line 30
    .line 31
    .line 32
    :goto_1
    return-void
.end method

.method public y(LX0/e$c;ILF0/s;I)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    const-string p2, "V_VP9"

    .line 5
    .line 6
    iget-object p1, p1, LX0/e$c;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LX0/e;->p:Lg0/z;

    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lg0/z;->P(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LX0/e;->p:Lg0/z;

    .line 20
    .line 21
    invoke-virtual {p1}, Lg0/z;->e()[B

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-interface {p3, p1, p2, p4}, LF0/s;->readFully([BII)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p3, p4}, LF0/s;->i(I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
.end method

.method public z(IJ)V
    .locals 8

    .line 1
    const/16 v0, 0x5031

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, " not supported"

    .line 5
    .line 6
    if-eq p1, v0, :cond_13

    .line 7
    .line 8
    const/16 v0, 0x5032

    .line 9
    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    if-eq p1, v0, :cond_11

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x2

    .line 17
    const/4 v7, 0x1

    .line 18
    sparse-switch p1, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :pswitch_0
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    long-to-int p2, p2

    .line 32
    iput p2, p1, LX0/e$c;->D:I

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :pswitch_1
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    long-to-int p2, p2

    .line 41
    iput p2, p1, LX0/e$c;->C:I

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :pswitch_2
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 49
    .line 50
    iput-boolean v7, p1, LX0/e$c;->y:Z

    .line 51
    .line 52
    long-to-int p1, p2

    .line 53
    invoke-static {p1}, Ld0/h;->j(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eq p1, v0, :cond_14

    .line 58
    .line 59
    iget-object p2, p0, LX0/e;->w:LX0/e$c;

    .line 60
    .line 61
    iput p1, p2, LX0/e$c;->z:I

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :pswitch_3
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 66
    .line 67
    .line 68
    long-to-int p1, p2

    .line 69
    invoke-static {p1}, Ld0/h;->k(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eq p1, v0, :cond_14

    .line 74
    .line 75
    iget-object p2, p0, LX0/e;->w:LX0/e$c;

    .line 76
    .line 77
    iput p1, p2, LX0/e$c;->A:I

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :pswitch_4
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 82
    .line 83
    .line 84
    long-to-int p1, p2

    .line 85
    if-eq p1, v7, :cond_1

    .line 86
    .line 87
    if-eq p1, v6, :cond_0

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_0
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 92
    .line 93
    iput v7, p1, LX0/e$c;->B:I

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_1
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 98
    .line 99
    iput v6, p1, LX0/e$c;->B:I

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :sswitch_0
    iput-wide p2, p0, LX0/e;->t:J

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :sswitch_1
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    long-to-int p2, p2

    .line 112
    iput p2, p1, LX0/e$c;->e:I

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :sswitch_2
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 117
    .line 118
    .line 119
    long-to-int p1, p2

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    if-eq p1, v7, :cond_4

    .line 123
    .line 124
    if-eq p1, v6, :cond_3

    .line 125
    .line 126
    if-eq p1, v5, :cond_2

    .line 127
    .line 128
    goto/16 :goto_0

    .line 129
    .line 130
    :cond_2
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 131
    .line 132
    iput v5, p1, LX0/e$c;->s:I

    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :cond_3
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 137
    .line 138
    iput v6, p1, LX0/e$c;->s:I

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :cond_4
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 143
    .line 144
    iput v7, p1, LX0/e$c;->s:I

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_5
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 149
    .line 150
    iput v0, p1, LX0/e$c;->s:I

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :sswitch_3
    iput-wide p2, p0, LX0/e;->T:J

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :sswitch_4
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    long-to-int p2, p2

    .line 163
    iput p2, p1, LX0/e$c;->Q:I

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :sswitch_5
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-wide p2, p1, LX0/e$c;->T:J

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :sswitch_6
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iput-wide p2, p1, LX0/e$c;->S:J

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :sswitch_7
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    long-to-int p2, p2

    .line 188
    iput p2, p1, LX0/e$c;->f:I

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :sswitch_8
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 196
    .line 197
    iput-boolean v7, p1, LX0/e$c;->y:Z

    .line 198
    .line 199
    long-to-int p2, p2

    .line 200
    iput p2, p1, LX0/e$c;->o:I

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :sswitch_9
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    cmp-long p2, p2, v3

    .line 209
    .line 210
    if-nez p2, :cond_6

    .line 211
    .line 212
    move v0, v7

    .line 213
    :cond_6
    iput-boolean v0, p1, LX0/e$c;->V:Z

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :sswitch_a
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    long-to-int p2, p2

    .line 222
    iput p2, p1, LX0/e$c;->q:I

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_b
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    long-to-int p2, p2

    .line 231
    iput p2, p1, LX0/e$c;->r:I

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :sswitch_c
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    long-to-int p2, p2

    .line 240
    iput p2, p1, LX0/e$c;->p:I

    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :sswitch_d
    long-to-int p2, p2

    .line 245
    invoke-virtual {p0, p1}, LX0/e;->l(I)V

    .line 246
    .line 247
    .line 248
    if-eqz p2, :cond_a

    .line 249
    .line 250
    if-eq p2, v7, :cond_9

    .line 251
    .line 252
    if-eq p2, v5, :cond_8

    .line 253
    .line 254
    const/16 p1, 0xf

    .line 255
    .line 256
    if-eq p2, p1, :cond_7

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_7
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 261
    .line 262
    iput v5, p1, LX0/e$c;->x:I

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_8
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 267
    .line 268
    iput v7, p1, LX0/e$c;->x:I

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_9
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 273
    .line 274
    iput v6, p1, LX0/e$c;->x:I

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_a
    iget-object p1, p0, LX0/e;->w:LX0/e$c;

    .line 279
    .line 280
    iput v0, p1, LX0/e$c;->x:I

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :sswitch_e
    iget-wide v0, p0, LX0/e;->s:J

    .line 285
    .line 286
    add-long/2addr p2, v0

    .line 287
    iput-wide p2, p0, LX0/e;->z:J

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :sswitch_f
    cmp-long p1, p2, v3

    .line 292
    .line 293
    if-nez p1, :cond_b

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    const-string v0, "AESSettingsCipherMode "

    .line 303
    .line 304
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    throw p1

    .line 322
    :sswitch_10
    const-wide/16 v3, 0x5

    .line 323
    .line 324
    cmp-long p1, p2, v3

    .line 325
    .line 326
    if-nez p1, :cond_c

    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v0, "ContentEncAlgo "

    .line 336
    .line 337
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    throw p1

    .line 355
    :sswitch_11
    cmp-long p1, p2, v3

    .line 356
    .line 357
    if-nez p1, :cond_d

    .line 358
    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    const-string v0, "EBMLReadVersion "

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    throw p1

    .line 386
    :sswitch_12
    cmp-long p1, p2, v3

    .line 387
    .line 388
    if-ltz p1, :cond_e

    .line 389
    .line 390
    const-wide/16 v3, 0x2

    .line 391
    .line 392
    cmp-long p1, p2, v3

    .line 393
    .line 394
    if-gtz p1, :cond_e

    .line 395
    .line 396
    goto/16 :goto_0

    .line 397
    .line 398
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    const-string v0, "DocTypeReadVersion "

    .line 404
    .line 405
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    throw p1

    .line 423
    :sswitch_13
    const-wide/16 v3, 0x3

    .line 424
    .line 425
    cmp-long p1, p2, v3

    .line 426
    .line 427
    if-nez p1, :cond_f

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    .line 435
    .line 436
    const-string v0, "ContentCompAlgo "

    .line 437
    .line 438
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    throw p1

    .line 456
    :sswitch_14
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    long-to-int p2, p2

    .line 461
    invoke-static {p1, p2}, LX0/e$c;->c(LX0/e$c;I)I

    .line 462
    .line 463
    .line 464
    goto/16 :goto_0

    .line 465
    .line 466
    :sswitch_15
    iput-boolean v7, p0, LX0/e;->S:Z

    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :sswitch_16
    iget-boolean v0, p0, LX0/e;->G:Z

    .line 471
    .line 472
    if-nez v0, :cond_14

    .line 473
    .line 474
    invoke-virtual {p0, p1}, LX0/e;->k(I)V

    .line 475
    .line 476
    .line 477
    iget-object p1, p0, LX0/e;->F:Lg0/p;

    .line 478
    .line 479
    invoke-virtual {p1, p2, p3}, Lg0/p;->a(J)V

    .line 480
    .line 481
    .line 482
    iput-boolean v7, p0, LX0/e;->G:Z

    .line 483
    .line 484
    goto/16 :goto_0

    .line 485
    .line 486
    :sswitch_17
    long-to-int p1, p2

    .line 487
    iput p1, p0, LX0/e;->R:I

    .line 488
    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :sswitch_18
    invoke-virtual {p0, p2, p3}, LX0/e;->G(J)J

    .line 492
    .line 493
    .line 494
    move-result-wide p1

    .line 495
    iput-wide p1, p0, LX0/e;->D:J

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    .line 499
    :sswitch_19
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    long-to-int p2, p2

    .line 504
    iput p2, p1, LX0/e$c;->c:I

    .line 505
    .line 506
    goto :goto_0

    .line 507
    :sswitch_1a
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    long-to-int p2, p2

    .line 512
    iput p2, p1, LX0/e$c;->n:I

    .line 513
    .line 514
    goto :goto_0

    .line 515
    :sswitch_1b
    invoke-virtual {p0, p1}, LX0/e;->k(I)V

    .line 516
    .line 517
    .line 518
    iget-object p1, p0, LX0/e;->E:Lg0/p;

    .line 519
    .line 520
    invoke-virtual {p0, p2, p3}, LX0/e;->G(J)J

    .line 521
    .line 522
    .line 523
    move-result-wide p2

    .line 524
    invoke-virtual {p1, p2, p3}, Lg0/p;->a(J)V

    .line 525
    .line 526
    .line 527
    goto :goto_0

    .line 528
    :sswitch_1c
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    long-to-int p2, p2

    .line 533
    iput p2, p1, LX0/e$c;->m:I

    .line 534
    .line 535
    goto :goto_0

    .line 536
    :sswitch_1d
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    long-to-int p2, p2

    .line 541
    iput p2, p1, LX0/e$c;->P:I

    .line 542
    .line 543
    goto :goto_0

    .line 544
    :sswitch_1e
    invoke-virtual {p0, p2, p3}, LX0/e;->G(J)J

    .line 545
    .line 546
    .line 547
    move-result-wide p1

    .line 548
    iput-wide p1, p0, LX0/e;->K:J

    .line 549
    .line 550
    goto :goto_0

    .line 551
    :sswitch_1f
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    cmp-long p2, p2, v3

    .line 556
    .line 557
    if-nez p2, :cond_10

    .line 558
    .line 559
    move v0, v7

    .line 560
    :cond_10
    iput-boolean v0, p1, LX0/e$c;->W:Z

    .line 561
    .line 562
    goto :goto_0

    .line 563
    :sswitch_20
    invoke-virtual {p0, p1}, LX0/e;->v(I)LX0/e$c;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    long-to-int p2, p2

    .line 568
    iput p2, p1, LX0/e$c;->d:I

    .line 569
    .line 570
    goto :goto_0

    .line 571
    :cond_11
    cmp-long p1, p2, v3

    .line 572
    .line 573
    if-nez p1, :cond_12

    .line 574
    .line 575
    goto :goto_0

    .line 576
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 577
    .line 578
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 579
    .line 580
    .line 581
    const-string v0, "ContentEncodingScope "

    .line 582
    .line 583
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    throw p1

    .line 601
    :cond_13
    const-wide/16 v3, 0x0

    .line 602
    .line 603
    cmp-long p1, p2, v3

    .line 604
    .line 605
    if-nez p1, :cond_15

    .line 606
    .line 607
    :cond_14
    :goto_0
    return-void

    .line 608
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 611
    .line 612
    .line 613
    const-string v0, "ContentEncodingOrder "

    .line 614
    .line 615
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p1

    .line 628
    invoke-static {p1, v1}, Ld0/A;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ld0/A;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    throw p1

    .line 633
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x88 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf1 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
