.class public final Landroidx/media2/session/StarRatingParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/StarRating;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media2/session/StarRating;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/session/StarRating;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, v0, Landroidx/media2/session/StarRating;->a:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v1, v2}, Lb2/c;->o(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v0, Landroidx/media2/session/StarRating;->a:I

    .line 14
    .line 15
    iget v1, v0, Landroidx/media2/session/StarRating;->b:F

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p0, v2}, Lb2/c;->l(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lb2/c;->m()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    iput v1, v0, Landroidx/media2/session/StarRating;->b:F

    .line 30
    .line 31
    return-object v0
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
.end method

.method public static write(Landroidx/media2/session/StarRating;Lb2/c;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Landroidx/media2/session/StarRating;->a:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lb2/c;->I(II)V

    iget p0, p0, Landroidx/media2/session/StarRating;->b:F

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lb2/c;->y(I)V

    invoke-virtual {p1, p0}, Lb2/c;->G(F)V

    return-void
.end method
