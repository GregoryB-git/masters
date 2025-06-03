.class public final Lb/w$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/w$b;->a(Ldc/l;Ldc/l;Ldc/a;Ldc/a;)Landroid/window/OnBackInvokedCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Lb/b;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Lb/b;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ldc/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/a<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:Ldc/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/a<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldc/l;Ldc/l;Ldc/a;Ldc/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/l<",
            "-",
            "Lb/b;",
            "Lrb/h;",
            ">;",
            "Ldc/l<",
            "-",
            "Lb/b;",
            "Lrb/h;",
            ">;",
            "Ldc/a<",
            "Lrb/h;",
            ">;",
            "Ldc/a<",
            "Lrb/h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb/w$b$a;->a:Ldc/l;

    iput-object p2, p0, Lb/w$b$a;->b:Ldc/l;

    iput-object p3, p0, Lb/w$b$a;->c:Ldc/a;

    iput-object p4, p0, Lb/w$b$a;->d:Ldc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lb/w$b$a;->d:Ldc/a;

    invoke-interface {v0}, Ldc/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lb/w$b$a;->c:Ldc/a;

    invoke-interface {v0}, Ldc/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/w$b$a;->b:Ldc/l;

    new-instance v1, Lb/b;

    invoke-direct {v1, p1}, Lb/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/w$b$a;->a:Ldc/l;

    new-instance v1, Lb/b;

    invoke-direct {v1, p1}, Lb/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
