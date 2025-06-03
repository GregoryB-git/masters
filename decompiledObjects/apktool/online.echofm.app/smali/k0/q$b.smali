.class public final Lk0/q$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:J

.field public d:F

.field public e:J

.field public f:J

.field public g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3f7851ec    # 0.97f

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lk0/q$b;->a:F

    .line 8
    .line 9
    const v0, 0x3f83d70a    # 1.03f

    .line 10
    .line 11
    .line 12
    iput v0, p0, Lk0/q$b;->b:F

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    iput-wide v0, p0, Lk0/q$b;->c:J

    .line 17
    .line 18
    const v0, 0x33d6bf95    # 1.0E-7f

    .line 19
    .line 20
    .line 21
    iput v0, p0, Lk0/q$b;->d:F

    .line 22
    .line 23
    const-wide/16 v0, 0x14

    .line 24
    .line 25
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iput-wide v0, p0, Lk0/q$b;->e:J

    .line 30
    .line 31
    const-wide/16 v0, 0x1f4

    .line 32
    .line 33
    invoke-static {v0, v1}, Lg0/M;->J0(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, Lk0/q$b;->f:J

    .line 38
    .line 39
    const v0, 0x3f7fbe77    # 0.999f

    .line 40
    .line 41
    .line 42
    iput v0, p0, Lk0/q$b;->g:F

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a()Lk0/q;
    .locals 13

    .line 1
    new-instance v12, Lk0/q;

    .line 2
    .line 3
    iget v1, p0, Lk0/q$b;->a:F

    .line 4
    .line 5
    iget v2, p0, Lk0/q$b;->b:F

    .line 6
    .line 7
    iget-wide v3, p0, Lk0/q$b;->c:J

    .line 8
    .line 9
    iget v5, p0, Lk0/q$b;->d:F

    .line 10
    .line 11
    iget-wide v6, p0, Lk0/q$b;->e:J

    .line 12
    .line 13
    iget-wide v8, p0, Lk0/q$b;->f:J

    .line 14
    .line 15
    iget v10, p0, Lk0/q$b;->g:F

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    move-object v0, v12

    .line 19
    invoke-direct/range {v0 .. v11}, Lk0/q;-><init>(FFJFJJFLk0/q$a;)V

    .line 20
    .line 21
    .line 22
    return-object v12
.end method

.method public b(F)Lk0/q$b;
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lk0/q$b;->b:F

    .line 14
    .line 15
    return-object p0
.end method

.method public c(F)Lk0/q$b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput p1, p0, Lk0/q$b;->a:F

    .line 19
    .line 20
    return-object p0
.end method

.method public d(J)Lk0/q$b;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lg0/M;->J0(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iput-wide p1, p0, Lk0/q$b;->e:J

    .line 18
    .line 19
    return-object p0
.end method

.method public e(F)Lk0/q$b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    iput p1, p0, Lk0/q$b;->g:F

    .line 19
    .line 20
    return-object p0
.end method

.method public f(J)Lk0/q$b;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lk0/q$b;->c:J

    .line 14
    .line 15
    return-object p0
.end method

.method public g(F)Lk0/q$b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 10
    .line 11
    .line 12
    const v0, 0x49742400    # 1000000.0f

    .line 13
    .line 14
    .line 15
    div-float/2addr p1, v0

    .line 16
    iput p1, p0, Lk0/q$b;->d:F

    .line 17
    .line 18
    return-object p0
.end method

.method public h(J)Lk0/q$b;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2}, Lg0/M;->J0(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iput-wide p1, p0, Lk0/q$b;->f:J

    .line 18
    .line 19
    return-object p0
.end method
