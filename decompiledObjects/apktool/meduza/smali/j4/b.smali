.class public final Lj4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/e;


# instance fields
.field public final a:J

.field public final b:Lv5/n;

.field public final c:Lv5/n;

.field public d:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj4/b;->d:J

    iput-wide p5, p0, Lj4/b;->a:J

    new-instance p1, Lv5/n;

    invoke-direct {p1}, Lv5/n;-><init>()V

    iput-object p1, p0, Lj4/b;->b:Lv5/n;

    new-instance p2, Lv5/n;

    invoke-direct {p2}, Lv5/n;-><init>()V

    iput-object p2, p0, Lj4/b;->c:Lv5/n;

    const-wide/16 p5, 0x0

    invoke-virtual {p1, p5, p6}, Lv5/n;->a(J)V

    invoke-virtual {p2, p3, p4}, Lv5/n;->a(J)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, Lj4/b;->c:Lv5/n;

    invoke-static {v0, p1, p2}, Lv5/e0;->d(Lv5/n;J)I

    move-result p1

    iget-object p2, p0, Lj4/b;->b:Lv5/n;

    invoke-virtual {p2, p1}, Lv5/n;->b(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj4/b;->b:Lv5/n;

    .line 2
    .line 3
    iget v1, v0, Lv5/n;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sub-int/2addr v1, v2

    .line 7
    invoke-virtual {v0, v1}, Lv5/n;->b(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sub-long/2addr p1, v0

    .line 12
    const-wide/32 v0, 0x186a0

    .line 13
    .line 14
    .line 15
    cmp-long p1, p1, v0

    .line 16
    .line 17
    if-gez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    return v2
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lj4/b;->a:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 6

    .line 1
    iget-object v0, p0, Lj4/b;->b:Lv5/n;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lv5/e0;->d(Lv5/n;J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lc4/u;

    .line 8
    .line 9
    iget-object v2, p0, Lj4/b;->b:Lv5/n;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lv5/n;->b(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-object v4, p0, Lj4/b;->c:Lv5/n;

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Lv5/n;->b(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    invoke-direct {v1, v2, v3, v4, v5}, Lc4/u;-><init>(JJ)V

    .line 22
    .line 23
    .line 24
    cmp-long p1, v2, p1

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lj4/b;->b:Lv5/n;

    .line 29
    .line 30
    iget p2, p1, Lv5/n;->a:I

    .line 31
    .line 32
    add-int/lit8 p2, p2, -0x1

    .line 33
    .line 34
    if-ne v0, p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Lc4/u;

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lv5/n;->b(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    iget-object p1, p0, Lj4/b;->c:Lv5/n;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lv5/n;->b(I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    invoke-direct {p2, v2, v3, v4, v5}, Lc4/u;-><init>(JJ)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lc4/t$a;

    .line 55
    .line 56
    invoke-direct {p1, v1, p2}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    :goto_0
    new-instance p1, Lc4/t$a;

    .line 61
    .line 62
    invoke-direct {p1, v1, v1}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 63
    .line 64
    .line 65
    return-object p1
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

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lj4/b;->d:J

    return-wide v0
.end method
