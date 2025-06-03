.class public final Lf9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lj9/q;

.field public final d:I

.field public final e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ILj9/q;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/e;->a:Ljava/lang/String;

    iput p2, p0, Lf9/e;->b:I

    iput-object p3, p0, Lf9/e;->c:Lj9/q;

    iput p4, p0, Lf9/e;->d:I

    iput-wide p5, p0, Lf9/e;->e:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-class v1, Lf9/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lf9/e;

    iget v1, p0, Lf9/e;->b:I

    iget v2, p1, Lf9/e;->b:I

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget v1, p0, Lf9/e;->d:I

    iget v2, p1, Lf9/e;->d:I

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    iget-wide v1, p0, Lf9/e;->e:J

    iget-wide v3, p1, Lf9/e;->e:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lf9/e;->a:Ljava/lang/String;

    iget-object v2, p1, Lf9/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Lf9/e;->c:Lj9/q;

    iget-object p1, p1, Lf9/e;->c:Lj9/q;

    invoke-virtual {v0, p1}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lf9/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lf9/e;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lf9/e;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lf9/e;->e:J

    const/16 v3, 0x20

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf9/e;->c:Lj9/q;

    invoke-virtual {v1}, Lj9/q;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
