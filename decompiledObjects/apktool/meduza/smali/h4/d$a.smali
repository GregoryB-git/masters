.class public final Lh4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/d;->t(Lc4/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc4/t;

.field public final synthetic b:Lh4/d;


# direct methods
.method public constructor <init>(Lh4/d;Lc4/t;)V
    .locals 0

    iput-object p1, p0, Lh4/d$a;->b:Lh4/d;

    iput-object p2, p0, Lh4/d$a;->a:Lc4/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    iget-object v0, p0, Lh4/d$a;->a:Lc4/t;

    invoke-interface {v0}, Lc4/t;->e()Z

    move-result v0

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 8

    .line 1
    iget-object v0, p0, Lh4/d$a;->a:Lc4/t;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lc4/t;->g(J)Lc4/t$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Lc4/t$a;

    .line 8
    .line 9
    new-instance v0, Lc4/u;

    .line 10
    .line 11
    iget-object v1, p1, Lc4/t$a;->a:Lc4/u;

    .line 12
    .line 13
    iget-wide v2, v1, Lc4/u;->a:J

    .line 14
    .line 15
    iget-wide v4, v1, Lc4/u;->b:J

    .line 16
    .line 17
    iget-object v1, p0, Lh4/d$a;->b:Lh4/d;

    .line 18
    .line 19
    iget-wide v6, v1, Lh4/d;->a:J

    .line 20
    .line 21
    add-long/2addr v4, v6

    .line 22
    invoke-direct {v0, v2, v3, v4, v5}, Lc4/u;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lc4/u;

    .line 26
    .line 27
    iget-object p1, p1, Lc4/t$a;->b:Lc4/u;

    .line 28
    .line 29
    iget-wide v2, p1, Lc4/u;->a:J

    .line 30
    .line 31
    iget-wide v4, p1, Lc4/u;->b:J

    .line 32
    .line 33
    add-long/2addr v4, v6

    .line 34
    invoke-direct {v1, v2, v3, v4, v5}, Lc4/u;-><init>(JJ)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p2, v0, v1}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 38
    .line 39
    .line 40
    return-object p2
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

.method public final h()J
    .locals 2

    iget-object v0, p0, Lh4/d$a;->a:Lc4/t;

    invoke-interface {v0}, Lc4/t;->h()J

    move-result-wide v0

    return-wide v0
.end method
