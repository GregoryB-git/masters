.class public final Leb/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Leb/n;

.field public final b:Leb/e1;


# direct methods
.method public constructor <init>(Leb/n;Leb/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/o;->a:Leb/n;

    const-string p1, "status is null"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Leb/o;->b:Leb/e1;

    return-void
.end method

.method public static a(Leb/n;)Leb/o;
    .locals 2

    sget-object v0, Leb/n;->c:Leb/n;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "state is TRANSIENT_ERROR. Use forError() instead"

    invoke-static {v1, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    new-instance v0, Leb/o;

    sget-object v1, Leb/e1;->e:Leb/e1;

    invoke-direct {v0, p0, v1}, Leb/o;-><init>(Leb/n;Leb/e1;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Leb/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Leb/o;

    iget-object v0, p0, Leb/o;->a:Leb/n;

    iget-object v2, p1, Leb/o;->a:Leb/n;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Leb/o;->b:Leb/e1;

    iget-object p1, p1, Leb/o;->b:Leb/e1;

    invoke-virtual {v0, p1}, Leb/e1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Leb/o;->a:Leb/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Leb/o;->b:Leb/e1;

    invoke-virtual {v1}, Leb/e1;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Leb/o;->b:Leb/e1;

    invoke-virtual {v0}, Leb/e1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leb/o;->a:Leb/n;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Leb/o;->a:Leb/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/o;->b:Leb/e1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
