.class public final Lm4/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lv5/c0;

.field public final c:Lv5/u;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J

.field public h:J

.field public i:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x1b8a0

    iput v0, p0, Lm4/b0;->a:I

    new-instance v0, Lv5/c0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lv5/c0;-><init>(J)V

    iput-object v0, p0, Lm4/b0;->b:Lv5/c0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lm4/b0;->g:J

    iput-wide v0, p0, Lm4/b0;->h:J

    iput-wide v0, p0, Lm4/b0;->i:J

    new-instance v0, Lv5/u;

    invoke-direct {v0}, Lv5/u;-><init>()V

    iput-object v0, p0, Lm4/b0;->c:Lv5/u;

    return-void
.end method


# virtual methods
.method public final a(Lc4/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm4/b0;->c:Lv5/u;

    .line 2
    .line 3
    sget-object v1, Lv5/e0;->f:[B

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v2, v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lv5/u;->E([BI)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lm4/b0;->d:Z

    .line 14
    .line 15
    invoke-interface {p1}, Lc4/i;->i()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
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
