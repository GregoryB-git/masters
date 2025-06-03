.class public final Le4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final synthetic b:Le4/b;


# direct methods
.method public constructor <init>(Le4/b;J)V
    .locals 0

    iput-object p1, p0, Le4/b$a;->b:Le4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Le4/b$a;->a:J

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 7

    .line 1
    iget-object v0, p0, Le4/b$a;->b:Le4/b;

    .line 2
    .line 3
    iget-object v0, v0, Le4/b;->g:[Le4/e;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Le4/e;->b(J)Lc4/t$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    :goto_0
    iget-object v2, p0, Le4/b$a;->b:Le4/b;

    .line 14
    .line 15
    iget-object v2, v2, Le4/b;->g:[Le4/e;

    .line 16
    .line 17
    array-length v3, v2

    .line 18
    if-ge v1, v3, :cond_1

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    invoke-virtual {v2, p1, p2}, Le4/e;->b(J)Lc4/t$a;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, v2, Lc4/t$a;->a:Lc4/u;

    .line 27
    .line 28
    iget-wide v3, v3, Lc4/u;->b:J

    .line 29
    .line 30
    iget-object v5, v0, Lc4/t$a;->a:Lc4/u;

    .line 31
    .line 32
    iget-wide v5, v5, Lc4/u;->b:J

    .line 33
    .line 34
    cmp-long v3, v3, v5

    .line 35
    .line 36
    if-gez v3, :cond_0

    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v0
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

.method public final h()J
    .locals 2

    iget-wide v0, p0, Le4/b$a;->a:J

    return-wide v0
.end method
