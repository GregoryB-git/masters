.class public final Lf9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/c;


# instance fields
.field public a:Lj9/m;


# direct methods
.method public constructor <init>(Lj9/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/b;->a:Lj9/m;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lf9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lf9/b;

    iget-object v0, p0, Lf9/b;->a:Lj9/m;

    iget-object p1, p1, Lf9/b;->a:Lj9/m;

    invoke-virtual {v0, p1}, Lj9/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lf9/b;->a:Lj9/m;

    invoke-virtual {v0}, Lj9/m;->hashCode()I

    move-result v0

    return v0
.end method
