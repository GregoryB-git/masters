.class public final Lk3/j;
.super Lk3/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/j$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[B

.field public final c:Lh3/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLh3/e;)V
    .locals 0

    invoke-direct {p0}, Lk3/s;-><init>()V

    iput-object p1, p0, Lk3/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lk3/j;->b:[B

    iput-object p3, p0, Lk3/j;->c:Lh3/e;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk3/j;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()[B
    .locals 1

    iget-object v0, p0, Lk3/j;->b:[B

    return-object v0
.end method

.method public final d()Lh3/e;
    .locals 1

    iget-object v0, p0, Lk3/j;->c:Lh3/e;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk3/s;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lk3/s;

    iget-object v1, p0, Lk3/j;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lk3/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lk3/j;->b:[B

    instance-of v3, p1, Lk3/j;

    if-eqz v3, :cond_1

    move-object v3, p1

    check-cast v3, Lk3/j;

    iget-object v3, v3, Lk3/j;->b:[B

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lk3/s;->c()[B

    move-result-object v3

    :goto_0
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lk3/j;->c:Lh3/e;

    invoke-virtual {p1}, Lk3/s;->d()Lh3/e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lk3/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lk3/j;->b:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lk3/j;->c:Lh3/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
