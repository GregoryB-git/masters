.class public final Lb/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/j;->getOnBackPressedDispatcher()Lb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/j;


# direct methods
.method public constructor <init>(Lb/j;)V
    .locals 0

    iput-object p1, p0, Lb/j$f;->a:Lb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 1

    sget-object v0, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    if-ne p2, v0, :cond_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p2, v0, :cond_0

    iget-object p2, p0, Lb/j$f;->a:Lb/j;

    invoke-static {p2}, Lb/j;->access$100(Lb/j;)Lb/w;

    move-result-object p2

    check-cast p1, Lb/j;

    invoke-static {p1}, Lb/j$g;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "invoker"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p2, Lb/w;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p2, Lb/w;->h:Z

    invoke-virtual {p2, p1}, Lb/w;->c(Z)V

    :cond_0
    return-void
.end method
