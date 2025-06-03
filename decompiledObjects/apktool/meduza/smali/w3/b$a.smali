.class public final Lw3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lv3/r1;

.field public final c:I

.field public final d:Lz4/t$b;

.field public final e:J

.field public final f:Lv3/r1;

.field public final g:I

.field public final h:Lz4/t$b;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(JLv3/r1;ILz4/t$b;JLv3/r1;ILz4/t$b;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw3/b$a;->a:J

    iput-object p3, p0, Lw3/b$a;->b:Lv3/r1;

    iput p4, p0, Lw3/b$a;->c:I

    iput-object p5, p0, Lw3/b$a;->d:Lz4/t$b;

    iput-wide p6, p0, Lw3/b$a;->e:J

    iput-object p8, p0, Lw3/b$a;->f:Lv3/r1;

    iput p9, p0, Lw3/b$a;->g:I

    iput-object p10, p0, Lw3/b$a;->h:Lz4/t$b;

    iput-wide p11, p0, Lw3/b$a;->i:J

    iput-wide p13, p0, Lw3/b$a;->j:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lw3/b$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lw3/b$a;

    iget-wide v2, p0, Lw3/b$a;->a:J

    iget-wide v4, p1, Lw3/b$a;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lw3/b$a;->c:I

    iget v3, p1, Lw3/b$a;->c:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lw3/b$a;->e:J

    iget-wide v4, p1, Lw3/b$a;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lw3/b$a;->g:I

    iget v3, p1, Lw3/b$a;->g:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lw3/b$a;->i:J

    iget-wide v4, p1, Lw3/b$a;->i:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lw3/b$a;->j:J

    iget-wide v4, p1, Lw3/b$a;->j:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lw3/b$a;->b:Lv3/r1;

    iget-object v3, p1, Lw3/b$a;->b:Lv3/r1;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lw3/b$a;->d:Lz4/t$b;

    iget-object v3, p1, Lw3/b$a;->d:Lz4/t$b;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lw3/b$a;->f:Lv3/r1;

    iget-object v3, p1, Lw3/b$a;->f:Lv3/r1;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lw3/b$a;->h:Lz4/t$b;

    iget-object p1, p1, Lw3/b$a;->h:Lz4/t$b;

    invoke-static {v2, p1}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lw3/b$a;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/b$a;->b:Lv3/r1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lw3/b$a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/b$a;->d:Lz4/t$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-wide v1, p0, Lw3/b$a;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/b$a;->f:Lv3/r1;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget v1, p0, Lw3/b$a;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lw3/b$a;->h:Lz4/t$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-wide v1, p0, Lw3/b$a;->i:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-wide v1, p0, Lw3/b$a;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
