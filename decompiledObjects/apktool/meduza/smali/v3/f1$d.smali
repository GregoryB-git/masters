.class public final Lv3/f1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:Lv3/o0;

.field public final d:Ljava/lang/Object;

.field public final e:I

.field public final f:J

.field public final o:J

.field public final p:I

.field public final q:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILv3/o0;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/f1$d;->a:Ljava/lang/Object;

    iput p2, p0, Lv3/f1$d;->b:I

    iput-object p3, p0, Lv3/f1$d;->c:Lv3/o0;

    iput-object p4, p0, Lv3/f1$d;->d:Ljava/lang/Object;

    iput p5, p0, Lv3/f1$d;->e:I

    iput-wide p6, p0, Lv3/f1$d;->f:J

    iput-wide p8, p0, Lv3/f1$d;->o:J

    iput p10, p0, Lv3/f1$d;->p:I

    iput p11, p0, Lv3/f1$d;->q:I

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

    const-class v2, Lv3/f1$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv3/f1$d;

    iget v2, p0, Lv3/f1$d;->b:I

    iget v3, p1, Lv3/f1$d;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv3/f1$d;->e:I

    iget v3, p1, Lv3/f1$d;->e:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lv3/f1$d;->f:J

    iget-wide v4, p1, Lv3/f1$d;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv3/f1$d;->o:J

    iget-wide v4, p1, Lv3/f1$d;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lv3/f1$d;->p:I

    iget v3, p1, Lv3/f1$d;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv3/f1$d;->q:I

    iget v3, p1, Lv3/f1$d;->q:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lv3/f1$d;->a:Ljava/lang/Object;

    iget-object v3, p1, Lv3/f1$d;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/f1$d;->d:Ljava/lang/Object;

    iget-object v3, p1, Lv3/f1$d;->d:Ljava/lang/Object;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv3/f1$d;->c:Lv3/o0;

    iget-object p1, p1, Lv3/f1$d;->c:Lv3/o0;

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

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lv3/f1$d;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lv3/f1$d;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lv3/f1$d;->c:Lv3/o0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lv3/f1$d;->d:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lv3/f1$d;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Lv3/f1$d;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Lv3/f1$d;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Lv3/f1$d;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Lv3/f1$d;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
