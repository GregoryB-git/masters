.class public final Lgb/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/k0$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Random;

.field public b:J

.field public c:J

.field public d:D

.field public e:D

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lgb/k0;->a:Ljava/util/Random;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lgb/k0;->b:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lgb/k0;->c:J

    const-wide v0, 0x3ff999999999999aL    # 1.6

    iput-wide v0, p0, Lgb/k0;->d:D

    const-wide v0, 0x3fc999999999999aL    # 0.2

    iput-wide v0, p0, Lgb/k0;->e:D

    iget-wide v0, p0, Lgb/k0;->b:J

    iput-wide v0, p0, Lgb/k0;->f:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 8

    iget-wide v0, p0, Lgb/k0;->f:J

    long-to-double v2, v0

    iget-wide v4, p0, Lgb/k0;->d:D

    mul-double/2addr v4, v2

    double-to-long v4, v4

    iget-wide v6, p0, Lgb/k0;->c:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lgb/k0;->f:J

    iget-wide v4, p0, Lgb/k0;->e:D

    neg-double v6, v4

    mul-double/2addr v6, v2

    mul-double/2addr v4, v2

    cmpl-double v2, v4, v6

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lx6/b;->t(Z)V

    sub-double/2addr v4, v6

    iget-object v2, p0, Lgb/k0;->a:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextDouble()D

    move-result-wide v2

    mul-double/2addr v2, v4

    add-double/2addr v2, v6

    double-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
