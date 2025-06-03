.class public abstract Lub/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lub/h$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Lub/h$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final a:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Lub/h$b;",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Lub/h$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/h$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/h$c;Ldc/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "TB;>;",
            "Ldc/l<",
            "-",
            "Lub/h$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lub/b;->a:Ldc/l;

    instance-of p2, p1, Lub/b;

    if-eqz p2, :cond_0

    check-cast p1, Lub/b;

    iget-object p1, p1, Lub/b;->b:Lub/h$c;

    :cond_0
    iput-object p1, p0, Lub/b;->b:Lub/h$c;

    return-void
.end method
