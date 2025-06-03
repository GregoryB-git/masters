.class public final Lv5/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/o;


# instance fields
.field public final a:Lv5/c;

.field public b:Z

.field public c:J

.field public d:J

.field public e:Lv3/e1;


# direct methods
.method public constructor <init>(Lv5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/y;->a:Lv5/c;

    sget-object p1, Lv3/e1;->d:Lv3/e1;

    iput-object p1, p0, Lv5/y;->e:Lv3/e1;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iput-wide p1, p0, Lv5/y;->c:J

    iget-boolean p1, p0, Lv5/y;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv5/y;->a:Lv5/c;

    invoke-interface {p1}, Lv5/c;->d()J

    move-result-wide p1

    iput-wide p1, p0, Lv5/y;->d:J

    :cond_0
    return-void
.end method

.method public final c(Lv3/e1;)V
    .locals 2

    iget-boolean v0, p0, Lv5/y;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lv5/y;->l()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lv5/y;->a(J)V

    :cond_0
    iput-object p1, p0, Lv5/y;->e:Lv3/e1;

    return-void
.end method

.method public final f()Lv3/e1;
    .locals 1

    iget-object v0, p0, Lv5/y;->e:Lv3/e1;

    return-object v0
.end method

.method public final l()J
    .locals 7

    iget-wide v0, p0, Lv5/y;->c:J

    iget-boolean v2, p0, Lv5/y;->b:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lv5/y;->a:Lv5/c;

    invoke-interface {v2}, Lv5/c;->d()J

    move-result-wide v2

    iget-wide v4, p0, Lv5/y;->d:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lv5/y;->e:Lv3/e1;

    iget v5, v4, Lv3/e1;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lv5/e0;->I(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    iget v4, v4, Lv3/e1;->c:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
