.class public final Lf9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lf9/i;

.field public final c:Lj9/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lf9/i;Lj9/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lf9/j;->b:Lf9/i;

    iput-object p3, p0, Lf9/j;->c:Lj9/q;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_4

    const-class v1, Lf9/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lf9/j;

    iget-object v1, p0, Lf9/j;->a:Ljava/lang/String;

    iget-object v2, p1, Lf9/j;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lf9/j;->b:Lf9/i;

    iget-object v2, p1, Lf9/j;->b:Lf9/i;

    invoke-virtual {v1, v2}, Lf9/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v0, p0, Lf9/j;->c:Lj9/q;

    iget-object p1, p1, Lf9/j;->c:Lj9/q;

    invoke-virtual {v0, p1}, Lj9/q;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lf9/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf9/j;->b:Lf9/i;

    invoke-virtual {v1}, Lf9/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lf9/j;->c:Lj9/q;

    invoke-virtual {v0}, Lj9/q;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
