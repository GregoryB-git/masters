.class public final Ld8/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ld8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld8/t<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ld8/t;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/j$b;->a:Ld8/t;

    iput-boolean p2, p0, Ld8/j$b;->b:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ld8/j$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ld8/j$b;

    iget-object v0, p1, Ld8/j$b;->a:Ld8/t;

    iget-object v2, p0, Ld8/j$b;->a:Ld8/t;

    invoke-virtual {v0, v2}, Ld8/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Ld8/j$b;->b:Z

    iget-boolean v0, p0, Ld8/j$b;->b:Z

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ld8/j$b;->a:Ld8/t;

    invoke-virtual {v0}, Ld8/t;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Ld8/j$b;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
