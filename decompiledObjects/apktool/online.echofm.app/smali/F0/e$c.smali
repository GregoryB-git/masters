.class public LF0/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>(JJJJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LF0/e$c;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, LF0/e$c;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, LF0/e$c;->d:J

    .line 9
    .line 10
    iput-wide p7, p0, LF0/e$c;->e:J

    .line 11
    .line 12
    iput-wide p9, p0, LF0/e$c;->f:J

    .line 13
    .line 14
    iput-wide p11, p0, LF0/e$c;->g:J

    .line 15
    .line 16
    iput-wide p13, p0, LF0/e$c;->c:J

    .line 17
    .line 18
    invoke-static/range {p3 .. p14}, LF0/e$c;->h(JJJJJJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    iput-wide p1, p0, LF0/e$c;->h:J

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(LF0/e$c;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LF0/e$c;->l()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic b(LF0/e$c;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LF0/e$c;->j()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic c(LF0/e$c;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LF0/e$c;->i()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic d(LF0/e$c;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LF0/e$c;->k()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic e(LF0/e$c;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LF0/e$c;->m()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic f(LF0/e$c;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LF0/e$c;->o(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(LF0/e$c;JJ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, LF0/e$c;->p(JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h(JJJJJJ)J
    .locals 7

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    add-long v2, p6, v0

    .line 4
    .line 5
    cmp-long v2, v2, p8

    .line 6
    .line 7
    if-gez v2, :cond_1

    .line 8
    .line 9
    add-long v2, p2, v0

    .line 10
    .line 11
    cmp-long v2, v2, p4

    .line 12
    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sub-long v2, p0, p2

    .line 17
    .line 18
    sub-long v4, p8, p6

    .line 19
    .line 20
    long-to-float v4, v4

    .line 21
    sub-long v5, p4, p2

    .line 22
    .line 23
    long-to-float v5, v5

    .line 24
    div-float/2addr v4, v5

    .line 25
    long-to-float v2, v2

    .line 26
    mul-float/2addr v2, v4

    .line 27
    float-to-long v2, v2

    .line 28
    const-wide/16 v4, 0x14

    .line 29
    .line 30
    div-long v4, v2, v4

    .line 31
    .line 32
    add-long/2addr v2, p6

    .line 33
    sub-long v2, v2, p10

    .line 34
    .line 35
    sub-long/2addr v2, v4

    .line 36
    sub-long v0, p8, v0

    .line 37
    .line 38
    move-wide p0, v2

    .line 39
    move-wide p2, p6

    .line 40
    move-wide p4, v0

    .line 41
    invoke-static/range {p0 .. p5}, Lg0/M;->q(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0

    .line 46
    :cond_1
    :goto_0
    return-wide p6
.end method


# virtual methods
.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$c;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$c;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$c;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final m()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF0/e$c;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final n()V
    .locals 12

    .line 1
    iget-wide v0, p0, LF0/e$c;->b:J

    .line 2
    .line 3
    iget-wide v2, p0, LF0/e$c;->d:J

    .line 4
    .line 5
    iget-wide v4, p0, LF0/e$c;->e:J

    .line 6
    .line 7
    iget-wide v6, p0, LF0/e$c;->f:J

    .line 8
    .line 9
    iget-wide v8, p0, LF0/e$c;->g:J

    .line 10
    .line 11
    iget-wide v10, p0, LF0/e$c;->c:J

    .line 12
    .line 13
    invoke-static/range {v0 .. v11}, LF0/e$c;->h(JJJJJJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, LF0/e$c;->h:J

    .line 18
    .line 19
    return-void
.end method

.method public final o(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF0/e$c;->e:J

    .line 2
    .line 3
    iput-wide p3, p0, LF0/e$c;->g:J

    .line 4
    .line 5
    invoke-virtual {p0}, LF0/e$c;->n()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final p(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF0/e$c;->d:J

    .line 2
    .line 3
    iput-wide p3, p0, LF0/e$c;->f:J

    .line 4
    .line 5
    invoke-virtual {p0}, LF0/e$c;->n()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
