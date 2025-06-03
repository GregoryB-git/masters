.class public final Ld2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/webkit/WebSettings;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Laa/w;->b(Landroid/webkit/WebSettings;)I

    move-result p0

    return p0
.end method

.method public static b(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcess;
    .locals 0

    invoke-static {p0}, Laa/v;->g(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcess;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcessClient;
    .locals 0

    invoke-static {p0}, Laa/v;->h(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcessClient;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/webkit/WebSettings;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Laa/w;->o(Landroid/webkit/WebSettings;I)V

    return-void
.end method

.method public static e(Landroid/webkit/WebView;Lc2/r;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Ld2/m0;

    invoke-direct {v0, p1}, Ld2/m0;-><init>(Lc2/r;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Laa/u;->o(Landroid/webkit/WebView;Ld2/m0;)V

    return-void
.end method

.method public static f(Landroid/webkit/WebView;Ljava/util/concurrent/Executor;Lc2/r;)V
    .locals 1

    if-eqz p2, :cond_0

    new-instance v0, Ld2/m0;

    invoke-direct {v0, p2}, Ld2/m0;-><init>(Lc2/r;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, p1, v0}, Laa/u;->p(Landroid/webkit/WebView;Ljava/util/concurrent/Executor;Ld2/m0;)V

    return-void
.end method

.method public static g(Landroid/webkit/WebViewRenderProcess;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebViewRenderProcess;->terminate()Z

    move-result p0

    return p0
.end method
