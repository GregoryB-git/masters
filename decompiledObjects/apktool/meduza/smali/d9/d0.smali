.class public final Ld9/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ld9/d0;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Ljava/lang/Exception;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v9, Ld9/d0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x3

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ld9/d0;-><init>(IIJJLcom/google/firebase/firestore/f;I)V

    sput-object v9, Ld9/d0;->g:Ld9/d0;

    return-void
.end method

.method public constructor <init>(IIJJLcom/google/firebase/firestore/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld9/d0;->a:I

    iput p2, p0, Ld9/d0;->b:I

    iput-wide p3, p0, Ld9/d0;->c:J

    iput-wide p5, p0, Ld9/d0;->d:J

    iput p8, p0, Ld9/d0;->e:I

    iput-object p7, p0, Ld9/d0;->f:Ljava/lang/Exception;

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

    if-eqz p1, :cond_9

    const-class v2, Ld9/d0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ld9/d0;

    iget v2, p0, Ld9/d0;->a:I

    iget v3, p1, Ld9/d0;->a:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Ld9/d0;->b:I

    iget v3, p1, Ld9/d0;->b:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Ld9/d0;->c:J

    iget-wide v4, p1, Ld9/d0;->c:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, Ld9/d0;->d:J

    iget-wide v4, p1, Ld9/d0;->d:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    return v1

    :cond_5
    iget v2, p0, Ld9/d0;->e:I

    iget v3, p1, Ld9/d0;->e:I

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Ld9/d0;->f:Ljava/lang/Exception;

    iget-object p1, p1, Ld9/d0;->f:Ljava/lang/Exception;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_7
    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move v0, v1

    :goto_0
    return v0

    :cond_9
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, Ld9/d0;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ld9/d0;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld9/d0;->c:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld9/d0;->d:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ld9/d0;->e:I

    invoke-static {v1}, Lq0/g;->c(I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ld9/d0;->f:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method
