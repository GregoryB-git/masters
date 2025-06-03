.class public final Ld2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageCallbackBoundaryInterface;


# instance fields
.field public final a:Lc2/k$a;


# direct methods
.method public constructor <init>(Lc2/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/c0;->a:Lc2/k$a;

    return-void
.end method


# virtual methods
.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onMessage(Ljava/lang/reflect/InvocationHandler;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {v0, p2}, Lzc/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p2}, Ld2/b0;->a(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Lc2/j;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Ld2/c0;->a:Lc2/k$a;

    new-instance v1, Ld2/f0;

    invoke-direct {v1, p1}, Ld2/f0;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    invoke-virtual {v0, v1, p2}, Lc2/k$a;->onMessage(Lc2/k;Lc2/j;)V

    :cond_0
    return-void
.end method
