.class public final Ld2/l0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/l0;->onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc2/r;

.field public final synthetic b:Landroid/webkit/WebView;

.field public final synthetic c:Lc2/q;


# direct methods
.method public constructor <init>(Lc2/r;Landroid/webkit/WebView;Ld2/o0;)V
    .locals 0

    iput-object p1, p0, Ld2/l0$b;->a:Lc2/r;

    iput-object p2, p0, Ld2/l0$b;->b:Landroid/webkit/WebView;

    iput-object p3, p0, Ld2/l0$b;->c:Lc2/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ld2/l0$b;->a:Lc2/r;

    iget-object v1, p0, Ld2/l0$b;->b:Landroid/webkit/WebView;

    iget-object v2, p0, Ld2/l0$b;->c:Lc2/q;

    invoke-virtual {v0, v1, v2}, Lc2/r;->onRenderProcessResponsive(Landroid/webkit/WebView;Lc2/q;)V

    return-void
.end method
