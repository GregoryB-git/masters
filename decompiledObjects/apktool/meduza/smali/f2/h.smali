.class public final Lf2/h;
.super Lf2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf2/g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lf2/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILf2/f;)V
    .locals 2

    const-string v0, "a"

    const-string v1, "value"

    invoke-static {p1, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "verificationMode"

    invoke-static {p2, v1}, La0/j;->p(ILjava/lang/String;)V

    invoke-direct {p0}, Lf2/g;-><init>()V

    iput-object p1, p0, Lf2/h;->a:Ljava/lang/Object;

    iput-object v0, p0, Lf2/h;->b:Ljava/lang/String;

    iput p2, p0, Lf2/h;->c:I

    iput-object p3, p0, Lf2/h;->d:Lf2/f;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lf2/h;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ldc/l;)Lf2/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ldc/l<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lf2/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "condition"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/h;->a:Ljava/lang/Object;

    invoke-interface {p2, v0}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    move-object p2, p0

    goto :goto_0

    :cond_0
    new-instance p2, Lf2/e;

    iget-object v1, p0, Lf2/h;->a:Ljava/lang/Object;

    iget-object v2, p0, Lf2/h;->b:Ljava/lang/String;

    iget-object v4, p0, Lf2/h;->d:Lf2/f;

    iget v5, p0, Lf2/h;->c:I

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lf2/e;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lf2/f;I)V

    :goto_0
    return-object p2
.end method
