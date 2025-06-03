.class public final Lx1/V;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lx1/F;

.field public final c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lx1/F;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx1/V;->a:Landroid/os/Handler;

    .line 10
    .line 11
    iput-object p2, p0, Lx1/V;->b:Lx1/F;

    .line 12
    .line 13
    invoke-static {}, Lx1/B;->A()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iput-wide p1, p0, Lx1/V;->c:J

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lx1/V;->d:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lx1/V;->d:J

    .line 5
    .line 6
    iget-wide p1, p0, Lx1/V;->e:J

    .line 7
    .line 8
    iget-wide v2, p0, Lx1/V;->c:J

    .line 9
    .line 10
    add-long/2addr p1, v2

    .line 11
    cmp-long p1, v0, p1

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    iget-wide p1, p0, Lx1/V;->f:J

    .line 16
    .line 17
    cmp-long p1, v0, p1

    .line 18
    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lx1/V;->c()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lx1/V;->f:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lx1/V;->f:J

    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lx1/V;->d:J

    .line 2
    .line 3
    iget-wide v2, p0, Lx1/V;->e:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lx1/V;->b:Lx1/F;

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/F;->o()Lx1/F$b;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
