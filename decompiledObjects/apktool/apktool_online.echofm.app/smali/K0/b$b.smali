.class public final LK0/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/e$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LF0/B;

.field public final b:I

.field public final c:LF0/y$a;


# direct methods
.method public constructor <init>(LF0/B;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK0/b$b;->a:LF0/B;

    iput p2, p0, LK0/b$b;->b:I

    new-instance p1, LF0/y$a;

    invoke-direct {p1}, LF0/y$a;-><init>()V

    iput-object p1, p0, LK0/b$b;->c:LF0/y$a;

    return-void
.end method

.method public synthetic constructor <init>(LF0/B;ILK0/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LK0/b$b;-><init>(LF0/B;I)V

    return-void
.end method


# virtual methods
.method public a(LF0/s;J)LF0/e$e;
    .locals 10

    .line 1
    invoke-interface {p1}, LF0/s;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1}, LK0/b$b;->c(LF0/s;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-interface {p1}, LF0/s;->m()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    iget-object v6, p0, LK0/b$b;->a:LF0/B;

    .line 14
    .line 15
    iget v6, v6, LF0/B;->c:I

    .line 16
    .line 17
    const/4 v7, 0x6

    .line 18
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    invoke-interface {p1, v6}, LF0/s;->o(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, LK0/b$b;->c(LF0/s;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    invoke-interface {p1}, LF0/s;->m()J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    cmp-long p1, v2, p2

    .line 34
    .line 35
    if-gtz p1, :cond_0

    .line 36
    .line 37
    cmp-long p1, v6, p2

    .line 38
    .line 39
    if-lez p1, :cond_0

    .line 40
    .line 41
    invoke-static {v4, v5}, LF0/e$e;->e(J)LF0/e$e;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_0
    cmp-long p1, v6, p2

    .line 47
    .line 48
    if-gtz p1, :cond_1

    .line 49
    .line 50
    invoke-static {v6, v7, v8, v9}, LF0/e$e;->f(JJ)LF0/e$e;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_1
    invoke-static {v2, v3, v0, v1}, LF0/e$e;->d(JJ)LF0/e$e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public synthetic b()V
    .locals 0

    .line 1
    invoke-static {p0}, LF0/f;->a(LF0/e$f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c(LF0/s;)J
    .locals 6

    .line 1
    :goto_0
    invoke-interface {p1}, LF0/s;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p1}, LF0/s;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v4, 0x6

    .line 10
    .line 11
    sub-long/2addr v2, v4

    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, LK0/b$b;->a:LF0/B;

    .line 17
    .line 18
    iget v1, p0, LK0/b$b;->b:I

    .line 19
    .line 20
    iget-object v2, p0, LK0/b$b;->c:LF0/y$a;

    .line 21
    .line 22
    invoke-static {p1, v0, v1, v2}, LF0/y;->h(LF0/s;LF0/B;ILF0/y$a;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p1}, LF0/s;->m()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-interface {p1}, LF0/s;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    sub-long/2addr v2, v4

    .line 42
    cmp-long v0, v0, v2

    .line 43
    .line 44
    if-ltz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, LF0/s;->a()J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-interface {p1}, LF0/s;->m()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    sub-long/2addr v0, v2

    .line 55
    long-to-int v0, v0

    .line 56
    invoke-interface {p1, v0}, LF0/s;->o(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, LK0/b$b;->a:LF0/B;

    .line 60
    .line 61
    iget-wide v0, p1, LF0/B;->j:J

    .line 62
    .line 63
    return-wide v0

    .line 64
    :cond_1
    iget-object p1, p0, LK0/b$b;->c:LF0/y$a;

    .line 65
    .line 66
    iget-wide v0, p1, LF0/y$a;->a:J

    .line 67
    .line 68
    return-wide v0
.end method
