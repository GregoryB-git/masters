.class public final Lg9/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lj9/l;


# direct methods
.method public constructor <init>(ILj9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg9/e0;->a:I

    iput-object p2, p0, Lg9/e0;->b:Lj9/l;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_1

    instance-of v0, p1, Lg9/e0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lg9/e0;

    iget v0, p0, Lg9/e0;->a:I

    iget v1, p1, Lg9/e0;->a:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lg9/e0;->b:Lj9/l;

    iget-object p1, p1, Lg9/e0;->b:Lj9/l;

    invoke-virtual {v0, p1}, Lj9/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lg9/e0;->a:I

    invoke-static {v0}, Lq0/g;->c(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x383

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg9/e0;->b:Lj9/l;

    invoke-virtual {v1}, Lj9/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lg9/e0;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const-string v1, "-"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg9/e0;->b:Lj9/l;

    invoke-virtual {v1}, Lj9/l;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
