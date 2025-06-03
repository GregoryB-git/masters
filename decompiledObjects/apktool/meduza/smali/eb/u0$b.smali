.class public final Leb/u0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Leb/e1;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Leb/e1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Leb/u0$b;->b:Ljava/lang/Object;

    const-string v0, "status"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Leb/u0$b;->a:Leb/e1;

    invoke-virtual {p1}, Leb/e1;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "cannot use OK status: %s"

    invoke-static {p1, v1, v0}, Lx6/b;->n(Ljava/lang/Object;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/u0$b;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Leb/u0$b;->a:Leb/e1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Leb/u0$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Leb/u0$b;

    iget-object v2, p0, Leb/u0$b;->a:Leb/e1;

    iget-object v3, p1, Leb/u0$b;->a:Leb/e1;

    invoke-static {v2, v3}, Lx6/b;->Q(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Leb/u0$b;->b:Ljava/lang/Object;

    iget-object p1, p1, Leb/u0$b;->b:Ljava/lang/Object;

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

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Leb/u0$b;->a:Leb/e1;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Leb/u0$b;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Leb/u0$b;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Leb/u0$b;->b:Ljava/lang/Object;

    const-string v2, "config"

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    move-result-object v0

    iget-object v1, p0, Leb/u0$b;->a:Leb/e1;

    const-string v2, "error"

    :goto_0
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
