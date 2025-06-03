.class public final LY0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/g;


# instance fields
.field public final a:J

.field public final b:Lg0/p;

.field public final c:Lg0/p;

.field public final d:I

.field public e:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    move-wide v5, p1

    .line 3
    move-wide v1, p3

    .line 4
    move-wide/from16 v3, p5

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide v5, v0, LY0/b;->e:J

    .line 10
    .line 11
    iput-wide v3, v0, LY0/b;->a:J

    .line 12
    .line 13
    new-instance v7, Lg0/p;

    .line 14
    .line 15
    invoke-direct {v7}, Lg0/p;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v7, v0, LY0/b;->b:Lg0/p;

    .line 19
    .line 20
    new-instance v8, Lg0/p;

    .line 21
    .line 22
    invoke-direct {v8}, Lg0/p;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v8, v0, LY0/b;->c:Lg0/p;

    .line 26
    .line 27
    const-wide/16 v9, 0x0

    .line 28
    .line 29
    invoke-virtual {v7, v9, v10}, Lg0/p;->a(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8, p3, p4}, Lg0/p;->a(J)V

    .line 33
    .line 34
    .line 35
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v7, v5, v7

    .line 41
    .line 42
    const v8, -0x7fffffff

    .line 43
    .line 44
    .line 45
    if-eqz v7, :cond_0

    .line 46
    .line 47
    sub-long/2addr v1, v3

    .line 48
    const-wide/16 v3, 0x8

    .line 49
    .line 50
    sget-object v7, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 51
    .line 52
    move-wide v5, p1

    .line 53
    invoke-static/range {v1 .. v7}, Lg0/M;->Y0(JJJLjava/math/RoundingMode;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    cmp-long v3, v1, v9

    .line 58
    .line 59
    if-lez v3, :cond_0

    .line 60
    .line 61
    const-wide/32 v3, 0x7fffffff

    .line 62
    .line 63
    .line 64
    cmp-long v3, v1, v3

    .line 65
    .line 66
    if-gtz v3, :cond_0

    .line 67
    .line 68
    long-to-int v8, v1

    .line 69
    :cond_0
    iput v8, v0, LY0/b;->d:I

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, LY0/b;->b:Lg0/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/p;->c()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    sub-int/2addr v1, v2

    .line 9
    invoke-virtual {v0, v1}, Lg0/p;->b(I)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sub-long/2addr p1, v0

    .line 14
    const-wide/32 v0, 0x186a0

    .line 15
    .line 16
    .line 17
    cmp-long p1, p1, v0

    .line 18
    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x0

    .line 23
    :goto_0
    return v2
.end method

.method public b(JJ)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LY0/b;->a(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LY0/b;->b:Lg0/p;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lg0/p;->a(J)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LY0/b;->c:Lg0/p;

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, Lg0/p;->a(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c(J)J
    .locals 2

    .line 1
    iget-object v0, p0, LY0/b;->c:Lg0/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lg0/M;->e(Lg0/p;JZZ)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p2, p0, LY0/b;->b:Lg0/p;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lg0/p;->b(I)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    return-wide p1
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LY0/b;->e:J

    .line 2
    .line 3
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public j(J)LF0/M$a;
    .locals 7

    .line 1
    iget-object v0, p0, LY0/b;->b:Lg0/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lg0/M;->e(Lg0/p;JZZ)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-instance v2, LF0/N;

    .line 9
    .line 10
    iget-object v3, p0, LY0/b;->b:Lg0/p;

    .line 11
    .line 12
    invoke-virtual {v3, v0}, Lg0/p;->b(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    iget-object v5, p0, LY0/b;->c:Lg0/p;

    .line 17
    .line 18
    invoke-virtual {v5, v0}, Lg0/p;->b(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    invoke-direct {v2, v3, v4, v5, v6}, LF0/N;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    iget-wide v3, v2, LF0/N;->a:J

    .line 26
    .line 27
    cmp-long p1, v3, p1

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, LY0/b;->b:Lg0/p;

    .line 32
    .line 33
    invoke-virtual {p1}, Lg0/p;->c()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    sub-int/2addr p1, v1

    .line 38
    if-ne v0, p1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, LF0/N;

    .line 42
    .line 43
    iget-object p2, p0, LY0/b;->b:Lg0/p;

    .line 44
    .line 45
    add-int/2addr v0, v1

    .line 46
    invoke-virtual {p2, v0}, Lg0/p;->b(I)J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    iget-object p2, p0, LY0/b;->c:Lg0/p;

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Lg0/p;->b(I)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-direct {p1, v3, v4, v0, v1}, LF0/N;-><init>(JJ)V

    .line 57
    .line 58
    .line 59
    new-instance p2, LF0/M$a;

    .line 60
    .line 61
    invoke-direct {p2, v2, p1}, LF0/M$a;-><init>(LF0/N;LF0/N;)V

    .line 62
    .line 63
    .line 64
    return-object p2

    .line 65
    :cond_1
    :goto_0
    new-instance p1, LF0/M$a;

    .line 66
    .line 67
    invoke-direct {p1, v2}, LF0/M$a;-><init>(LF0/N;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, LY0/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    iget-wide v0, p0, LY0/b;->e:J

    .line 2
    .line 3
    return-wide v0
.end method
