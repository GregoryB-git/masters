.class public final Landroidx/media2/common/SubtitleDataParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/common/SubtitleData;
    .locals 4

    .line 1
    new-instance v0, Landroidx/media2/common/SubtitleData;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/common/SubtitleData;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, v0, Landroidx/media2/common/SubtitleData;->a:J

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, v0, Landroidx/media2/common/SubtitleData;->a:J

    .line 14
    .line 15
    iget-wide v1, v0, Landroidx/media2/common/SubtitleData;->b:J

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-virtual {p0, v3, v1, v2}, Lb2/c;->q(IJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iput-wide v1, v0, Landroidx/media2/common/SubtitleData;->b:J

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/media2/common/SubtitleData;->c:[B

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lb2/c;->i()[B

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    iput-object v1, v0, Landroidx/media2/common/SubtitleData;->c:[B

    .line 39
    .line 40
    return-object v0
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
.end method

.method public static write(Landroidx/media2/common/SubtitleData;Lb2/c;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p0, Landroidx/media2/common/SubtitleData;->a:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    iget-wide v0, p0, Landroidx/media2/common/SubtitleData;->b:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lb2/c;->J(IJ)V

    iget-object p0, p0, Landroidx/media2/common/SubtitleData;->c:[B

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lb2/c;->y(I)V

    invoke-virtual {p1, p0}, Lb2/c;->D([B)V

    return-void
.end method
