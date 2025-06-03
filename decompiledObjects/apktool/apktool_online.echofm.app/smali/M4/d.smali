.class public final synthetic LM4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic o:LM4/e;

.field public final synthetic p:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(LM4/e;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM4/d;->o:LM4/e;

    .line 5
    .line 6
    iput-object p2, p0, LM4/d;->p:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, LM4/d;->o:LM4/e;

    .line 2
    .line 3
    iget-object v1, p0, LM4/d;->p:Landroid/view/View;

    .line 4
    .line 5
    invoke-static {v0, v1}, LM4/e;->a(LM4/e;Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
