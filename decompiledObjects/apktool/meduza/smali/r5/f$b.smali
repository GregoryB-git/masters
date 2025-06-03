.class public final Lr5/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lr5/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(Lv3/i0;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Lv3/i0;->d:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lr5/f$b;->a:Z

    invoke-static {p2, v1}, Lr5/f;->i(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lr5/f$b;->b:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lr5/f$b;

    sget-object v0, Lo7/n;->a:Lo7/n$a;

    iget-boolean v1, p0, Lr5/f$b;->b:Z

    iget-boolean v2, p1, Lr5/f$b;->b:Z

    invoke-virtual {v0, v1, v2}, Lo7/n$a;->c(ZZ)Lo7/n;

    move-result-object v0

    iget-boolean v1, p0, Lr5/f$b;->a:Z

    iget-boolean p1, p1, Lr5/f$b;->a:Z

    invoke-virtual {v0, v1, p1}, Lo7/n;->c(ZZ)Lo7/n;

    move-result-object p1

    invoke-virtual {p1}, Lo7/n;->e()I

    move-result p1

    return p1
.end method
