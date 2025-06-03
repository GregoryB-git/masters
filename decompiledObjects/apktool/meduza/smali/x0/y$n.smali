.class public final Lx0/y$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/y$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "n"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final synthetic c:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;I)V
    .locals 0

    iput-object p1, p0, Lx0/y$n;->c:Lx0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lx0/y$n;->a:I

    const/4 p1, 0x1

    iput p1, p0, Lx0/y$n;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lx0/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lx0/y$n;->c:Lx0/y;

    iget-object v0, v0, Lx0/y;->z:Lx0/i;

    if-eqz v0, :cond_0

    iget v1, p0, Lx0/y$n;->a:I

    if-gez v1, :cond_0

    invoke-virtual {v0}, Lx0/i;->getChildFragmentManager()Lx0/y;

    move-result-object v0

    invoke-virtual {v0}, Lx0/y;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lx0/y$n;->c:Lx0/y;

    iget v1, p0, Lx0/y$n;->a:I

    iget v2, p0, Lx0/y$n;->b:I

    invoke-virtual {v0, p1, p2, v1, v2}, Lx0/y;->S(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
