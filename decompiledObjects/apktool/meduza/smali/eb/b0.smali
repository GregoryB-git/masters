.class public final Leb/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/b0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Leb/b0$a;

.field public final c:J

.field public final d:Leb/e0;

.field public final e:Leb/e0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Leb/b0$a;JLeb/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/b0;->a:Ljava/lang/String;

    const-string p1, "severity"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Leb/b0;->b:Leb/b0$a;

    iput-wide p3, p0, Leb/b0;->c:J

    const/4 p1, 0x0

    iput-object p1, p0, Leb/b0;->d:Leb/e0;

    iput-object p5, p0, Leb/b0;->e:Leb/e0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Leb/b0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Leb/b0;

    iget-object v0, p0, Leb/b0;->a:Ljava/lang/String;

    iget-object v2, p1, Leb/b0;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leb/b0;->b:Leb/b0$a;

    iget-object v2, p1, Leb/b0;->b:Leb/b0$a;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Leb/b0;->c:J

    iget-wide v4, p1, Leb/b0;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Leb/b0;->d:Leb/e0;

    iget-object v2, p1, Leb/b0;->d:Leb/e0;

    invoke-static {v0, v2}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leb/b0;->e:Leb/e0;

    iget-object p1, p1, Leb/b0;->e:Leb/e0;

    invoke-static {v0, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Leb/b0;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/b0;->b:Leb/b0$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-wide v1, p0, Leb/b0;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/b0;->d:Leb/e0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/b0;->e:Leb/e0;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Leb/b0;->a:Ljava/lang/String;

    const-string v2, "description"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Leb/b0;->b:Leb/b0$a;

    const-string v2, "severity"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p0, Leb/b0;->c:J

    const-string v3, "timestampNanos"

    invoke-virtual {v0, v3, v1, v2}, Ln7/g$a;->b(Ljava/lang/String;J)V

    iget-object v1, p0, Leb/b0;->d:Leb/e0;

    const-string v2, "channelRef"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Leb/b0;->e:Leb/e0;

    const-string v2, "subchannelRef"

    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
