.class public final Lw3/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:J

.field public d:Lz4/t$b;

.field public e:Z

.field public f:Z

.field public final synthetic g:Lw3/x;


# direct methods
.method public constructor <init>(Lw3/x;Ljava/lang/String;ILz4/t$b;)V
    .locals 0

    iput-object p1, p0, Lw3/x$a;->g:Lw3/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw3/x$a;->a:Ljava/lang/String;

    iput p3, p0, Lw3/x$a;->b:I

    if-nez p4, :cond_0

    const-wide/16 p1, -0x1

    goto :goto_0

    :cond_0
    iget-wide p1, p4, Lz4/s;->d:J

    :goto_0
    iput-wide p1, p0, Lw3/x$a;->c:J

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Lz4/s;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object p4, p0, Lw3/x$a;->d:Lz4/t$b;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lw3/b$a;)Z
    .locals 9

    iget-object v0, p1, Lw3/b$a;->d:Lz4/t$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget v0, p0, Lw3/x$a;->b:I

    iget p1, p1, Lw3/b$a;->c:I

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    iget-wide v3, p0, Lw3/x$a;->c:J

    const-wide/16 v5, -0x1

    cmp-long v5, v3, v5

    if-nez v5, :cond_2

    return v2

    :cond_2
    iget-wide v5, v0, Lz4/s;->d:J

    cmp-long v3, v5, v3

    if-lez v3, :cond_3

    return v1

    :cond_3
    iget-object v3, p0, Lw3/x$a;->d:Lz4/t$b;

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p1, Lw3/b$a;->b:Lv3/r1;

    iget-object v0, v0, Lz4/s;->a:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p1, Lw3/b$a;->b:Lv3/r1;

    iget-object v4, p0, Lw3/x$a;->d:Lz4/t$b;

    iget-object v4, v4, Lz4/s;->a:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Lv3/r1;->b(Ljava/lang/Object;)I

    move-result v3

    iget-object v4, p1, Lw3/b$a;->d:Lz4/t$b;

    iget-wide v5, v4, Lz4/s;->d:J

    iget-object v7, p0, Lw3/x$a;->d:Lz4/t$b;

    iget-wide v7, v7, Lz4/s;->d:J

    cmp-long v5, v5, v7

    if-ltz v5, :cond_c

    if-ge v0, v3, :cond_5

    goto :goto_3

    :cond_5
    if-le v0, v3, :cond_6

    return v1

    :cond_6
    invoke-virtual {v4}, Lz4/s;->a()Z

    move-result v0

    iget-object p1, p1, Lw3/b$a;->d:Lz4/t$b;

    if-eqz v0, :cond_9

    iget v0, p1, Lz4/s;->b:I

    iget p1, p1, Lz4/s;->c:I

    iget-object v3, p0, Lw3/x$a;->d:Lz4/t$b;

    iget v4, v3, Lz4/s;->b:I

    if-gt v0, v4, :cond_8

    if-ne v0, v4, :cond_7

    iget v0, v3, Lz4/s;->c:I

    if-le p1, v0, :cond_7

    goto :goto_1

    :cond_7
    move v1, v2

    :cond_8
    :goto_1
    return v1

    :cond_9
    iget p1, p1, Lz4/s;->e:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_b

    iget-object v0, p0, Lw3/x$a;->d:Lz4/t$b;

    iget v0, v0, Lz4/s;->b:I

    if-le p1, v0, :cond_a

    goto :goto_2

    :cond_a
    move v1, v2

    :cond_b
    :goto_2
    return v1

    :cond_c
    :goto_3
    return v2
.end method

.method public final b(Lv3/r1;Lv3/r1;)Z
    .locals 4

    .line 1
    iget v0, p0, Lw3/x$a;->b:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lv3/r1;->o()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, -0x1

    .line 9
    if-lt v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2}, Lv3/r1;->o()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v0, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object v1, p0, Lw3/x$a;->g:Lw3/x;

    .line 21
    .line 22
    iget-object v1, v1, Lw3/x;->a:Lv3/r1$c;

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lw3/x$a;->g:Lw3/x;

    .line 28
    .line 29
    iget-object v0, v0, Lw3/x;->a:Lv3/r1$c;

    .line 30
    .line 31
    iget v0, v0, Lv3/r1$c;->w:I

    .line 32
    .line 33
    :goto_0
    iget-object v1, p0, Lw3/x$a;->g:Lw3/x;

    .line 34
    .line 35
    iget-object v1, v1, Lw3/x;->a:Lv3/r1$c;

    .line 36
    .line 37
    iget v1, v1, Lv3/r1$c;->x:I

    .line 38
    .line 39
    if-gt v0, v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lv3/r1;->l(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p2, v1}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eq v1, v3, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lw3/x$a;->g:Lw3/x;

    .line 52
    .line 53
    iget-object p1, p1, Lw3/x;->b:Lv3/r1$b;

    .line 54
    .line 55
    invoke-virtual {p2, v1, p1, v2}, Lv3/r1;->f(ILv3/r1$b;Z)Lv3/r1$b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget v0, p1, Lv3/r1$b;->c:I

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :goto_1
    iput v0, p0, Lw3/x$a;->b:I

    .line 66
    .line 67
    if-ne v0, v3, :cond_3

    .line 68
    .line 69
    return v2

    .line 70
    :cond_3
    iget-object p1, p0, Lw3/x$a;->d:Lz4/t$b;

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    return v0

    .line 76
    :cond_4
    iget-object p1, p1, Lz4/s;->a:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Lv3/r1;->b(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eq p1, v3, :cond_5

    .line 83
    .line 84
    move v2, v0

    .line 85
    :cond_5
    return v2
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
