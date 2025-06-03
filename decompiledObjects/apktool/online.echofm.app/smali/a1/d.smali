.class public La1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/r;


# static fields
.field public static final d:LF0/x;


# instance fields
.field public a:LF0/t;

.field public b:La1/i;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/c;

    .line 2
    .line 3
    invoke-direct {v0}, La1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/d;->d:LF0/x;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c()[LF0/r;
    .locals 1

    .line 1
    invoke-static {}, La1/d;->f()[LF0/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static synthetic f()[LF0/r;
    .locals 3

    .line 1
    new-instance v0, La1/d;

    .line 2
    .line 3
    invoke-direct {v0}, La1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [LF0/r;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    return-object v1
.end method

.method public static h(Lg0/z;)Lg0/z;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lg0/z;->T(I)V

    .line 3
    .line 4
    .line 5
    return-object p0
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, La1/d;->b:La1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, La1/i;->m(JJ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(LF0/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, La1/d;->a:LF0/t;

    .line 2
    .line 3
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

.method public e(LF0/s;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, La1/d;->j(LF0/s;)Z

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ld0/A; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p1

    .line 6
    :catch_0
    const/4 p1, 0x0

    .line 7
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

.method public i(LF0/s;LF0/L;)I
    .locals 4

    .line 1
    iget-object v0, p0, La1/d;->a:LF0/t;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La1/d;->b:La1/i;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La1/d;->j(LF0/s;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, LF0/s;->h()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "Failed to determine bitstream type"

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

    .line 28
    :cond_1
    :goto_0
    iget-boolean v0, p0, La1/d;->c:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, La1/d;->a:LF0/t;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-interface {v0, v1, v2}, LF0/t;->a(II)LF0/T;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, La1/d;->a:LF0/t;

    .line 41
    .line 42
    invoke-interface {v1}, LF0/t;->j()V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La1/d;->b:La1/i;

    .line 46
    .line 47
    iget-object v3, p0, La1/d;->a:LF0/t;

    .line 48
    .line 49
    invoke-virtual {v1, v3, v0}, La1/i;->d(LF0/t;LF0/T;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v2, p0, La1/d;->c:Z

    .line 53
    .line 54
    :cond_2
    iget-object v0, p0, La1/d;->b:La1/i;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, La1/i;->g(LF0/s;LF0/L;)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1
.end method

.method public final j(LF0/s;)Z
    .locals 5

    .line 1
    new-instance v0, La1/f;

    .line 2
    .line 3
    invoke-direct {v0}, La1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, La1/f;->a(LF0/s;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, La1/f;->b:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget v0, v0, La1/f;->i:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Lg0/z;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lg0/z;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {p1, v4, v3, v0}, LF0/s;->n([BII)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, La1/d;->h(Lg0/z;)Lg0/z;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, La1/b;->p(Lg0/z;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    new-instance p1, La1/b;

    .line 52
    .line 53
    invoke-direct {p1}, La1/b;-><init>()V

    .line 54
    .line 55
    .line 56
    :goto_0
    iput-object p1, p0, La1/d;->b:La1/i;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-static {v2}, La1/d;->h(Lg0/z;)Lg0/z;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, La1/j;->r(Lg0/z;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    new-instance p1, La1/j;

    .line 70
    .line 71
    invoke-direct {p1}, La1/j;-><init>()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-static {v2}, La1/d;->h(Lg0/z;)Lg0/z;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, La1/h;->o(Lg0/z;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    new-instance p1, La1/h;

    .line 86
    .line 87
    invoke-direct {p1}, La1/h;-><init>()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    return v1

    .line 92
    :cond_3
    :goto_2
    return v3
.end method

.method public release()V
    .locals 0

    .line 1
    return-void
.end method
