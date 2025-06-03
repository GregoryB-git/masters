.class public final Lf9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/c;


# instance fields
.field public final a:Lg9/k0;

.field public final b:I


# direct methods
.method public constructor <init>(Lg9/k0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/i;->a:Lg9/k0;

    iput p2, p0, Lf9/i;->b:I

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

    if-eqz p1, :cond_4

    const-class v2, Lf9/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lf9/i;

    iget-object v2, p0, Lf9/i;->a:Lg9/k0;

    iget-object v3, p1, Lf9/i;->a:Lg9/k0;

    invoke-virtual {v2, v3}, Lg9/k0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lf9/i;->b:I

    iget p1, p1, Lf9/i;->b:I

    if-ne v2, p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lf9/i;->a:Lg9/k0;

    invoke-virtual {v0}, Lg9/k0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lf9/i;->b:I

    invoke-static {v1}, Lq0/g;->c(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
